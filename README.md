# Async Demo Caller #

Este nodo ejecuta peticiones a un nodo escucha ([async-demo-listener](https://github.com/OvejaNegra/async-demo-listener))
Ambos se comunican entre si mediante peticiones REST.
Esto lo hace mediante un endpoint disponible (/launcher/{number}), al cuál agregamos la cantidad de solicitudes que se realizarán al modo escucha.

El nodo escucha, para cada una de las peticiones que le llegan, le asigna un tiempo de espera de forma aleatoria, ejecutando esta espera de manera asíncrona, respondiendo inmediatamente cuando llega la solicitud al nodo que ejecuta la acción

## Configuración

Sólo puede modificarse el puerto en el que se ejecuta (por default, 8081). Esto, modificando el parámetro "server.port=8081" de application.properties (src/main/resources/application.properties)

## Instalación

* Clonar las fuentes del respositorio
* Ejecutar: `mvn clean install` 
	
## Iniciar
	mvn spring-boot:run