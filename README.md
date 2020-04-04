# ☕ Java DDD Skeleton

## Correr los test 
-  Clonar el repositorio y ejecutar `make test`
-  Se sigue el estandar de carpetas segun lacafeta

## configuracion 
Renombrar el archivo 'application/apps/main/resources/.env.local.template -> .env.template' 
este archivo esta ignorado por git, y es archivo de configuracion del proyecto
-  `cp apps/main/resorces/.env.local.template .env.template`


## Recomendaciones para iniciar el proyecto
Clonar el repositorio, entrar a la carpeta application y crear tu proyecto desde esa carpeta. 
-  `cd java-ddd-skeleton/application`
-  `idea build.gradle`

## Base de datos
Se está usando postgres con una imagen docker 'container/docker-compose.local.yml' 


## Levantar el proyecto
Para seguir estos pasos, debes estar dentro de la carpeta application
-  primero debemos iniciar la base de datos `make up`
-  correr los test `make tests`
-  levantar el entorno en local `make start-mooc_backend`


## Posibles errores
-  error al levantar los ambientes, posiblmente los puertos ya estén usados, para esto, borrar los contenedores  `docker rm -f $(docker ps -a -q)`
-  error de data en la base de datos, los test usan transaction para los test de integracion, esto puede dar inconsistencia en lso datos, se recominda borrar la base de datos `make down` luego iniciarlo `make up`

## Consultas
No dudes en preguntarnos si hay alguna duda, este skeleton tiene varias caracteristicas custom, que fueron necesarias para trabajar con DDD, CQRS, Event Drinet Architecture

## Mejoras
Estamos siempre a la espera de sus pullrequest, hay una CI con github actions, que nos asegura la calidad de este skeleton 

## Que tenemos pensado
Agregar cache con redis, colas con rabbitMq, busquedas con ElastickSearch

# OjO
-  existen 2 make files
-  -  make file de la raiz de proyecto, está pensado para correr los test con docker en un pipeline
-  -  makefile dentro de application, está pensado para desarrollar, corre con el JAVA instalado en tu pc  
