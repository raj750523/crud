# Simple Spring Boot CRUD Application
## Endpoints
- `GET /products`: Retrieve all products.
- `GET /products/{id}`: Retrieve a product by ID.
- `POST /products`: Create a new product (provide JSON payload).
- `PUT /products/{id}`: Update an existing product (provide JSON payload).
- `DELETE /products/{id}`: Delete a product by ID.

## Example Requests
1. Create a Product:
POST http://localhost:8080/products
Content-Type: application/json

{
"name": "Product Name",
"price": 10.99
}

2. Retrieve All Products:
GET http://localhost:8080/products

3. Retrieve a Product by ID:
GET http://localhost:8080/products/{id}

4. Update a Product:
PUT http://localhost:8080/products/{id}
Content-Type: application/json

{
"name": "Updated Product Name",
"price": 19.99
}

5. Delete a Product by ID:
DELETE http://localhost:8080/products/{id}

