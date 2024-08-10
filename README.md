# Proyecto con  Screenplay Mobile  para Android/iOS - SerenityBDD
Este repositorio contiene escenarios para el registro de usuarios, donde se realiza el proceso de registro en la app de Ionix para dispositivos móviles realizados bajo el patrón Screenplay.

## Contenido
- Resumen de codificación
- Comando para la Ejecución
- El framework
- BDD
- Gherkin
- Cucumber
- Compilador
- Patrones de desarrollo
- Prácticas de automatización
- Herramienta de automatización utilizado
- Estrategia de automatización
- La versión utilizada Java y Gradle
- Automatización Screenplay Mobile
- Detalles Importantes
- Configuración para Ejecución
- Notas Importantes
- Ejecución por Terminal

### Resumen de codificación
---
El código se encuentra documentado y la generación del Documento se realizó con JavaDoc.

### Comando para la Ejecución por runner
---
Para la ejecución de la automatización se puede utilizar el siguiente comando para la ejecución de un runner en especial:

gradle clean test --tests "RUTA DEL RUNNER" aggregate -i

Ejemplo:

gradle clean test --tests com.reto.runners.registration.UserRegistrationTest aggregate -i


### El framework
---
## BDD
Se utiliza BDD como framework de automatización para la automatización de los escenarios de prueba, la idea es escribir las pruebas antes de escribir el código fuente, pero en lugar de pruebas unitarias, lo que haremos será escribir pruebas que verifiquen que el comportamiento del código es correcto desde el punto de vista de negocio. Tras escribir las pruebas escribimos el código fuente de la funcionalidad que haga que estas pruebas pasen correctamente. Después refactorizamos el código fuente.
partimos de historias de usuario, siguiendo el modelo “Como [rol ] quiero [ característica ] para que [los beneficios]”. A partir de aquí, en lugar de describir en 'lenguaje natural' lo que tiene que hacer esa nueva funcionalidad, vamos a usar un lenguaje que nos va a permitir describir todas nuestras funcionalidades de una misma forma, un lenguaje específico para BDD.
## Gherkin
Se utiliza Gherkin como lenguaje de desarrollo de las funcionalidades dado que es un lenguaje comprensible por humanos y por ordenadores, con el vamos a definir el comportamiento de la página que vamos a automatizar.
Se trata de un lenguaje fácil de leer, fácil de entender y fácil de escribir. Utilizar Gherkin nos va a permitir crear una documentación viva a la vez que automatizamos los tests, haciéndolo además con un lenguaje que puede entender negocio.
Lo bueno de Gherkin es que para empezar a hacer BDD sólo nos hace falta conocer 5 palabras, con las que construiremos sentencias con las que vamos a describir las funcionalidades:
- Feature: Indica el nombre de la funcionalidad que vamos a probar. Debe ser un título claro y explícito. Incluimos aquí una descripción en forma de historia de usuario: “Como [rol] quiero [característica] para que [los beneficios]”. Sobre esta descripción empezaremos a construir nuestros escenarios de prueba.
- Scenario: Describe cada escenario que vamos a probar.
-	Given: Provee contexto para el escenario en que se va a ejecutar el test, tales como punto donde se ejecuta el test, o prerequisitos en los datos. Incluye los pasos necesarios para poner al sistema en el estado que se desea probar.
-	When: Especifica el conjunto de acciones que lanzan el test. La interacción del usuario que acciona la funcionalidad que deseamos testear.
-	Then: Especifica el resultado esperado en el test. Observamos los cambios en el sistema y vemos si son los deseados.
     Lo normal es probar distintos escenarios para comprobar una determinada funcionalidad. De esta forma vamos a pasar de nuestras historias de usuario a pruebas de comportamiento automatizables.
## Cucumber
Se utiliza cucumber como herramienta para para automatizar las pruebas en BDD. Cucumber nos va permitir ejecutar descripciones funcionales en texto plano como pruebas de software automatizadas. Totalmente compatible con el lenguaje Gherkin.

### Compilador
---
Se crea el proyecto sobre Gradle, es una herramienta de automatización de la construcción de nuestro código, es la versión mejorada de Maven, pero intenta llevarlo todo un paso más allá. Para empezar, se apoya en Groovy y en un DSL (Domain Specific Language) para trabajar con un lenguaje sencillo y claro a la hora de construir el build comparado con Maven. Por otro lado, dispone de una gran flexibilidad que permite trabajar con ella utilizando otros lenguajes y no solo Java. Dispone por otro lado de un sistema de gestión de dependencias sólido.

### Patrones de desarrollo
---
Para el desarrollo de la automatización se utilizaron los siguientes patrones de desarrollo:
Variables: camelCase
Funciones: camelCase
Clases: PascalCase
Paquetes: camelCase

Camel Case: El nombre viene porque se asemeja a las dos jorobas de un camello, y se puede dividir en dos tipos:
– Upper Camel Case, cuando la primera letra de cada una de las palabras es mayúscula. También denominado Pascal Case. Ejemplo: EjemploDeNomenclatura.
– Lower Camel Case, igual que la anterior con la excepción de que la primera letra es minúscula. Ejemplo: ejemploDeNomenclatura.
Es muy usada en los #hashTags de Twitter o en lenguajes como Java, PHP, C#…

### Prácticas de automatización
---
Un proyecto donde se ejemplifica el uso del patrón serenity
[screenplay](http://thucydides.info/docs/serenity-staging/#_serenity_and_the_screenplay_pattern) con cucumber y gradle.

Los tests usan tareas (tasks), interacciones (interactions), preguntas (questions), elementos de páginas (user_interface) y basicamente se tiene la siguiente estructura a nivel de proyecto de automatización.

+ model
  Clases que usan el patrón DTO o relacionadas con el modelo de dominio
+ tasks
  Clases que representan tareas que realiza el actor a nivel de proceso de negocio
+ interacion
  Clases que representan las interacciones directas con la interfaz de usuario
+ user_interface
  Page Objects y Page Elements. Mapean los objetos de la interfaz de usuario
+ questions
  Objectos usados para consultar acerca del estado de la aplicación

### Herramienta de automatización utilizado
---
Se utiliza el IDE de Intellij IDEA para el desarrollo de la automatización. Intellij IDEA es una plataforma de desarrollo, diseñada para ser extendida de forma indefinida a través de plug-ins. Fue concebida desde sus orígenes para convertirse en una plataforma de integración de herramientas de desarrollo. No tiene en mente un lenguaje específico, sino que es un IDE genérico, aunque goza de mucha popularidad entre la comunidad de desarrolladores del lenguaje Java usando el plug-in JDT que viene incluido en la distribución estándar del IDE.
Proporciona herramientas para la gestión de espacios de trabajo, escribir, desplegar, ejecutar y depurar aplicaciones.

### Estrategia de automatización
---
Inicialmente se levantaron los flujos de cada transacción, para conocer el negocio y tener claro que se debia automatizar.
Una vez claro el alcance se procede con la automatización de las transacciones, para esto se decide automatizar por capas front.

### La versión utilizada Java y Gradle
---
Para correr el proyecto se necesita Java JDK 17 o superior y Gradle preferiblemente con la versión 8.2 o superior

## Automatización Screenplay Mobile
En la rama principal encontrarás varios features, cada uno con varios escenarios. Esto es porque aunque hacen lo mismo, uno esta desarrollado para que la asersión se realice con las Questions y Excepción creada manualmente y el otro realiza la validación usando [Serenity Ensure](https://serenity-bdd.github.io/theserenitybook/latest/serenity-screenplay-ensure.html "Serenity Ensure") como libreria.

## Detalles Importantes
La aplicación usada para realizar los ejemplos es **Ionix** . La cual puedes encontrar en la carpeta resource/apps/ donde la puedes descargar, en este caso el .APK para Android .

## Configuración para Ejecución
El proyecto cuenta con 1 archivo de extensión **.properties** este archivo es donde configuramos los capabilities y dispositivos sobre los cuales se quiere ejecutar la prueba.

- **serenity.properties:** Este es por defecto. Al ejecutar por medio del IDE o usando el comando general (Especificado abajo) tomará este archivo para su ejecución. En la parte final del archivo estan los capabilities de iOS. Si quieres usar este por defecto, recuerda comentar o descomentar los capabilities del dispositivo que no será ejecutado.

Para el archivo de serenity los capabilities que deben ser ajustados son los siguientes:

    appium.deviceName =
    appium.platformVersion =

En el primero va el **Identificador unico** del dispositivo y en el segundo el **número de la versión** que corresponde al Sistema Operativo.


## Notas Importantes
- Si al ejecutar te falla porque no encuentra los elementos, por favor revisa el idioma de tu dispositivo, esta aplicación ajusta sus localizadores con base al idioma que este configurado, se ha usado Ingles por defecto. Si quieres trabajar en español debes remapear los objetos o bien, cambiar el idioma de tu dispositivo para ejecutar la prueba y funcione con los locators actuales.

## Ejecución por Terminal
Para ejecutar y generar la documentación viva, basta con que por medio de una terminal en la ruta donde esta el proyecto ejecutes la siguiente linea:

`gradle clean test aggregate`

Si no cuentas con gradle configurado en tu maquina, usa el wrapper.

`./gradlew clean test aggregate`

Con esta instrucción limpias el proyecto de archivos temporales, ejecuta los test y genera la documentación viva.


Una vez ejecutado, puedes verificar las evidencias en la ruta:

`.../target/site/serenity/index.html`