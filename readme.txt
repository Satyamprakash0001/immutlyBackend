<!-- Steps to run the code :

Note: Wait for the project to set up properly and then follow the steps.

1. Open a terminal, change directory to the location where mongodb/bin is located.
2. Start the mongodb server using './mongod' command.
3. Now come to the main file "ImmutlyBackendApplication.java" and run this file.

After the file has run, the server will start running.

Different Endpoints : 

### 1. GET /products

**Sample Input URL:**
GET http://localhost:8080/products
```

**Expected Output:**

[
  {
    "id": 1,
    "productName": "Laptop",
    "productDescription": "Powerful laptop with high-performance specifications.",
    "price": 999.99,
    "availabilityStatus": true
  },
  {
    "id": 2,
    "productName": "Smartphone",
    "productDescription": "Latest smartphone with advanced features.",
    "price": 699.99,
    "availabilityStatus": true
  },
  // ... other products
]
```

### 2. GET /products/{product_id}

**Sample Input URL:**

GET http://localhost:8080/products/1
```

**Expected Output:**

{
  "id": 1,
  "productName": "Laptop",
  "productDescription": "Powerful laptop with high-performance specifications.",
  "price": 999.99,
  "availabilityStatus": true
}
```

### 3. POST /products

**Sample Input URL:**

POST http://localhost:8080/products
```

**Request Body:**

{
  "productName": "New Product",
  "productDescription": "This is a new product.",
  "price": 129.99,
  "availabilityStatus": true
}
```

**Expected Output:**

{
  "id": [generated_id],
  "productName": "New Product",
  "productDescription": "This is a new product.",
  "price": 129.99,
  "availabilityStatus": true
}
```

### 4. PUT /products/{product_id}

**Sample Input URL:**

PUT http://localhost:8080/products/2
```

**Request Body:**

{
  "productName": "Updated Product",
  "productDescription": "This product has been updated.",
  "price": 149.99,
  "availabilityStatus": false
}
```

**Expected Output:**

{
  "id": 2,
  "productName": "Updated Product",
  "productDescription": "This product has been updated.",
  "price": 149.99,
  "availabilityStatus": false
}
```

### 5. DELETE /products/{product_id}

**Sample Input URL:**

DELETE http://localhost:8080/products/3
```

**Expected Output:**

204 No Content
```

### 6. PUT /products/{product_id}/update-price

**Sample Input URL:**

PUT http://localhost:8080/products/4/update-price?newPrice=179.99
```

**Expected Output:**

{
  "id": 4,
  "productName": "Smart Watch",
  "productDescription": "Fitness tracker and smartwatch with health monitoring features.",
  "price": 179.99,
  "availabilityStatus": true
}
```

mongodb://localhost:27017/ProductRepository -> Uri to connect to mongodb server at mongodb compass 

Note : A "SampleProducts.json" file is given for sample products to use while checking POST requests.

Note : default port is 8080, it can be changed in application.properties file.

-->
