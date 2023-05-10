# hola-egibide-docker

Ejemplo de aplicación Maven en un contenedor Docker.

Arrancar el servidor de base de datos:

```
docker compose up -d phpmyadmin00
```

Construir el contenedor de la aplicación:

```
docker compose build app00
```

Lanzar la aplicación:

```
docker compose run --rm app00
```

Abrir un shell en el contenedor de la aplicación:

```
docker compose run --rm app00 /bin/bash
```
