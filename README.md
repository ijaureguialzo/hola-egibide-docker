# hola-egibide-docker

Ejemplo de aplicación Maven en un contenedor Docker.

## Poner en marcha la aplicación

1. Arrancar el servidor de base de datos:

    ```
    docker compose up -d phpmyadmin00
    ```

2. Construir el contenedor de la aplicación:

    ```
    docker compose build app00
    ```

3. Lanzar la aplicación:

    ```
    docker compose run --rm app00
    ```

## Utilidades

- Abrir un shell en el contenedor de la aplicación:

    ```
    docker compose run --rm app00 /bin/bash
    ```

- Borrar todo:

    ```
    docker compose down -v
    ```
