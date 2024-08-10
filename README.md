# Proyecto con  Screenplay Mobile  para Android/iOS - SerenityBDD
Este repositorio contiene escenarios para el registro de usuarios, donde se realiza el proceso de registro en la app de Ionix para dispositivos móviles realizados bajo el patrón Screenplay.

## Contenido
- Automatización Screenplay Mobile
- Detalles Importantes
- Configuración para Ejecución
- Notas Importantes
- Ejecución por Terminal

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

Si deseas ejecutar por medio de terminal usando un **properties especifico** y no el serenity.properties por defecto, puedes hacerlo con el siguiente comando. (Ejemplo, puedes reemplazar el nombre por el properties que desees)

`gradle clean test -Dproperties="serenityAndroid.properties" aggregate`

o

`./gradlew clean test -Dproperties="serenityAndroid.properties" aggregate`


Una vez ejecutado, puedes verificar las evidencias en la ruta:

`.../target/site/serenity/index.html`