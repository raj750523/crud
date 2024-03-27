# Simple Spring Boot CRUD Application

## Prerequisites
- Java 8 or higher
- Maven

## Usage
1. Clone the repository.
2. Navigate to the project directory.
3. Build the project using Maven.
4. Run the application.
5. Access CRUD endpoints using tools like Postman or cURL.

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

css
Copy code

2. Retrieve All Products:
GET http://localhost:8080/products

csharp
Copy code

3. Retrieve a Product by ID:
GET http://localhost:8080/products/{id}

mathematica
Copy code

4. Update a Product:
PUT http://localhost:8080/products/{id}
Content-Type: application/json

{
"name": "Updated Product Name",
"price": 19.99
}

mathematica
Copy code

5. Delete a Product by ID:
DELETE http://localhost:8080/products/{id}

csharp
Copy code

## License
This project is licensed under the MIT License.
This simplified README provides basic instructions on how to use the application and interact 
