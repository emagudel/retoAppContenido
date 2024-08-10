# Automatización DeUna

## Comenzando 🚀

_Estas instrucciones te permitirán ejecutar la automatización._

* _Onboarding Express_

## Requisitos 🌎

* _JAVA 14+_
* _Gradle 8.1+_


## Ejecución de las Pruebas⛷️

Para la ejecución de la tarea debemos tener en cuenta el parámetro

* **app**: ID con el cuál se guardó la app (i.e. bs://ed738c851c8006fd7d5c0f00436ef703fe85ea52)
* **projectName**: nombre del proyecto
* **buildName**: nombre del release o build

### Ejecución en Paralelo de las Pruebas

```
gradle clean clearReports test "-Dbstack.app=bs://ed738c851c8006fd7d5c0f00436ef703fe85ea52" "-Dbstack.projectName=OnBoardind" "-Dbstack.buildName=2.0.17" -i

```

### Ejecución del set de Prueba de Onboarding Express

```
gradle clean clearReports test --tests *Express* "-Dbstack.app=bs://ed738c851c8006fd7d5c0f00436ef703fe85ea52"  "-Dbstack.projectName=OnBoardind" "-Dbstack.buildName=2.0.17" -i

```

## Construido con 🏗️

_Herramientas utilizadas para crear el proyecto_

* [Gradle](https://gradle.org/) - Gradle es una herramienta de automatización de construcción de código abierto
  que está diseñada para ser lo suficientemente flexible como para construir casi cualquier tipo de software.

* [Serenity-BDD](https://serenity-bdd.github.io/) - Es una librería de código abierto que ayuda a escribir pruebas de
  aceptación automatizadas de mayor calidad y más rápido. Sus principales características son: Escribir test flexibles y
  fáciles de mantener.

## Versionado 📌

Usamos [Azure Devops](https://BancoPichinchaEC@dev.azure.com/BancoPichinchaEC/CD-BreakingCash/_git/deuna-aut-ap-android) para el versionado del proyecto.

## Contribuir 💪 
Si deseas contribuir a este proyecto, sigue estos pasos:

1. Haz un fork de este repositorio.
2. Crea una rama con tu nueva funcionalidad.
3. Haz tus cambios y realiza un pull request.
