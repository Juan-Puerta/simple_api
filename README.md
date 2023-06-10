# simple_api

API básica hecha con el lenguaje de programación Java utilizado junto con el framework de SprintBoot. Este proyecto consume un endpoint provisto por Platzi, los cuales son: https://api.escuelajs.co/api/v1/products y https://api.escuelajs.co/api/v1/categories. Esta API provee también endpoints para que el usuario los pueda utilizar.

## Endpoints

- Productos
  - GET: Devuelve todos los productos `http://localhost:8000/nexsys/v1/products/`
  - POST: Añade  un nuevo producto `http://localhost:8000/nexsys/v1/products/`, el cuerpo de la petición debe de ser de la siguiente forma
    ```
    {
        "name": "Nombre del producto"
        "priceFinal": 999
        "description": "Un producto muy bueno"
        "categoryId": 1
        "imageURL": ["https://placeimg.com/640/480/any"]
    }
    ```
- Categorías
  - GET: Devuelve todas las categorías existentes `http://localhost:8000/nexsys/v1/products/`

## Tecnologías usadas

- Java
- SprintBoot

## Autor

[Juan Puerta](https://github.com/Juan-Puerta)
