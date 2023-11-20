<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Restaurant List</title>
    <link rel="stylesheet" href="styles.css">
    <style>
    body {
    font-family: Arial, sans-serif;
    background-color: #f4f4f4;
    margin: 20px;
    text-align: center;
}

h1 {
    color: #333;
}

.restaurant-card {
    background-color: #fff;
    padding: 20px;
    border-radius: 8px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    max-width: 300px;
    margin: 20px auto;
}

.restaurant-card img {
    width: 100%;
    border-radius: 8px;
    margin-bottom: 10px;
}

.restaurant-card h2 {
    color: #333;
}

.restaurant-card button {
    background-color: #4caf50;
    color: #fff;
    padding: 8px 16px;
    border: none;
    border-radius: 4px;
    cursor: pointer;
}

.restaurant-card button:hover {
    background-color: #45a049;
}
    
    
    </style>
</head>
<body>
    <h1>Restaurant List</h1>
<form action="Res1log.jsp" method="post">
    <div class="restaurant-card">
        <img src="restaurant3.jpg" alt="Restaurant 1">
        <h2>Awesome Eats</h2>
        <p>Cuisine: Italian</p>
        <p>Location: 123 Main Street</p>
        <button>Order Now</button>
        </form>
    </div>
<form action="Res1log.jsp" method="post">
    <div class="restaurant-card">
        <img src="restaurant2.jpg" alt="Restaurant 2">
        <h2>Spicy Delight</h2>
        <p>Cuisine: Mexican</p>
        <p>Location: 456 Tnagar</p>
        <button>Order Now</button>
        </form>
    </div>
    <form action="Res1log.jsp" method="post">
     <div class="restaurant-card">
        <img src="restaurant3.jpg" alt="Restaurant 2">
        <h2>Yummy Foodcourt</h2>
        <p>Cuisine: Indain</p>
        <p>Location: 23 Paris corner</p>
        <button>Order Now</button>
        </form>
    </div>

   

</body>
</html>
