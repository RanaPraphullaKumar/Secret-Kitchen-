// ================== AUTH ==================

// Signup
if (document.getElementById("signupForm")) {
  document.getElementById("signupForm").addEventListener("submit", async (e) => {
    e.preventDefault();
    const user = {
      name: document.getElementById("signupName").value,
      email: document.getElementById("signupEmail").value,
      password: document.getElementById("signupPassword").value
    };
    const res = await fetch("http://localhost:8080/auth/signup", {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify(user)
    });
    document.getElementById("signupMsg").innerText = await res.text();
  });
}

// Login
if (document.getElementById("loginForm")) {
  document.getElementById("loginForm").addEventListener("submit", async (e) => {
    e.preventDefault();
    const email = document.getElementById("loginEmail").value;
    const password = document.getElementById("loginPassword").value;
    const res = await fetch(`http://localhost:8080/auth/login?email=${email}&password=${password}`, {
      method: "POST"
    });
    const msg = await res.text();
    document.getElementById("loginMsg").innerText = msg;
    if (msg.includes("successful")) {
      window.location.href = "index.html";
    }
  });
}

// Logout
if (document.getElementById("logoutBtn")) {
  document.getElementById("logoutBtn").addEventListener("click", () => {
    alert("You have been logged out!");
    window.location.href = "login.html";
  });
}

// ================== CUSTOMER OPS ==================

// Order
if (document.getElementById("orderForm")) {
  document.getElementById("orderForm").addEventListener("submit", async (e) => {
    e.preventDefault();
    const order = {
      dishName: document.getElementById("dishName").value,
      quantity: document.getElementById("quantity").value
    };
    const res = await fetch("http://localhost:8080/order", {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify(order)
    });
    document.getElementById("orderMsg").innerText = await res.text();
  });
}

// Reservation
if (document.getElementById("reservationForm")) {
  document.getElementById("reservationForm").addEventListener("submit", async (e) => {
    e.preventDefault();
    const reservation = {
      customerName: document.getElementById("customerName").value,
      tableSize: document.getElementById("tableSize").value,
      reservationDate: document.getElementById("reservationDate").value
    };
    const res = await fetch("http://localhost:8080/reservation", {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify(reservation)
    });
    document.getElementById("reservationMsg").innerText = await res.text();
  });
}

// Feedback
if (document.getElementById("feedbackForm")) {
  document.getElementById("feedbackForm").addEventListener("submit", async (e) => {
    e.preventDefault();
    const feedback = {
      name: document.getElementById("feedbackName").value,
      email: document.getElementById("feedbackEmail").value,
      message: document.getElementById("feedbackMessage").value
    };
    const res = await fetch("http://localhost:8080/feedback", {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify(feedback)
    });
    document.getElementById("feedbackMsg").innerText = await res.text();
  });
}

// ================== ADMIN DASHBOARD ==================
if (document.getElementById("ordersTable")) {
  // Load Orders
  fetch("http://localhost:8080/order/all")
    .then(res => res.json())
    .then(data => {
      const tbody = document.querySelector("#ordersTable tbody");
      data.forEach(order => {
        tbody.innerHTML += `<tr>
          <td>${order.id}</td>
          <td>${order.dishName}</td>
          <td>${order.quantity}</td>
        </tr>`;
      });
    });

  // Load Reservations
  fetch("http://localhost:8080/reservation/all")
    .then(res => res.json())
    .then(data => {
      const tbody = document.querySelector("#reservationsTable tbody");
      data.forEach(r => {
        tbody.innerHTML += `<tr>
          <td>${r.id}</td>
          <td>${r.customerName}</td>
          <td>${r.tableSize}</td>
          <td>${r.reservationDate}</td>
        </tr>`;
      });
    });

  // Load Feedback
  fetch("http://localhost:8080/feedback/all")
    .then(res => res.json())
    .then(data => {
      const tbody = document.querySelector("#feedbackTable tbody");
      data.forEach(f => {
        tbody.innerHTML += `<tr>
          <td>${f.id}</td>
          <td>${f.name}</td>
          <td>${f.email}</td>
          <td>${f.message}</td>
        </tr>`;
      });
    });
}
