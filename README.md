Proyecto de Ordenación de Números con Tuberías en CMD 📝🚀
Descripción del Proyecto 🌟
Este proyecto consiste en dos aplicaciones Java desarrolladas en IntelliJ: Aleatorios y OrdenarNumeros. La primera genera 40 números aleatorios entre 0 y 100, mientras que la segunda ordena un conjunto indeterminado de números recibidos por entrada estándar. La magia ocurre cuando conectamos ambas usando tuberías () en el CMD de Windows, permitiendo que la salida de Aleatorios se convierta en la entrada de OrdenarNumeros. 🎉
Requisitos 📋

Java Development Kit (JDK): Asegúrate de tenerlo instalado (verifica con java -version en CMD).
IntelliJ IDEA: O cualquier otro IDE compatible (NetBeans, Eclipse).
Sistema Operativo: Windows (para usar CMD).

Estructura del Proyecto 🗂️

Boletin1/Aleatorios.java: Genera números aleatorios.
Boletin1/OrdenarNumeros.java: Ordena números recibidos.
Archivos JAR: Generados en out/artifacts tras compilar en IntelliJ.

Configuración Inicial ⚙️

Clona o crea el proyecto:

Abre IntelliJ y crea un nuevo proyecto o importa los archivos .java.
Coloca Aleatorios.java y OrdenarNumeros.java en el paquete Boletin1.


Compila los programas:

Ve a File > Project Structure > Artifacts.
Configura un JAR para cada clase (selecciona la clase principal).
Compila con Build > Build Artifacts. Los JARs aparecerán en out/artifacts.


Verifica los JARs:

Navega a la carpeta out/artifacts y confirma que existen archivos como Aleatorios.jar y OrdenarNumeros.jar.



¿Qué son las Tuberías en CMD? 📡
Las tuberías () en el Command Prompt de Windows son una herramienta poderosa que redirige la salida estándar de un programa a la entrada estándar de otro. Esto permite encadenar comandos o aplicaciones sin necesidad de archivos intermedios. 🎥
Ejemplo Básico de Tubería

Comando: dir | find "txt"

dir lista los archivos, y find "txt" filtra solo los que contienen "txt".


Resultado: Una lista filtrada en la consola. ✅

Uso en este Proyecto
Conectamos Aleatorios y OrdenarNumeros para que los números aleatorios generados fluyan directamente al ordenador. 😎
Cómo Ejecutar las Aplicaciones 🖱️
1. Prueba Individual

Ejecutar Aleatorios:

Abre CMD y navega a la carpeta de los JARs: cd C:\ruta\al\proyecto\out\artifacts.
Escribe: java -jar Aleatorios.jar.
Verás 40 números aleatorios, como:
text45
12
78
...



Ejecutar OrdenarNumeros:

Navega a la carpeta: cd C:\ruta\al\proyecto\out\artifacts.
Escribe: java -jar OrdenarNumeros.jar, luego ingresa números (ej. 45 12 78) y presiona Enter.
Salida: 12 45 78.



2. Conectar con Tubería

Comando: java -jar Aleatorios.jar | java -jar OrdenarNumeros.jar.
Qué pasa: Los 40 números aleatorios generados por Aleatorios se envían a OrdenarNumeros, que los ordena y los muestra. 🎯
Ejemplo de salida:
text3 12 15 23 34 45 56 67 78 89 ...


Solución de Problemas 🛠️

Error "Unable to access jarfile": Verifica la ruta y el nombre del JAR con dir. Asegúrate de estar en la carpeta correcta.
Sin salida: Confirma que los programas imprimen con System.out.println y leen con System.in.
Java no reconocido: Asegúrate de que el JDK esté en el PATH (prueba java -version).

Documentación del Código 📖
Ambas clases incluyen Javadoc con información sobre su propósito, autor y versión. Revisa los archivos .java para detalles.
Pruebas Realizadas ✅

Prueba 1: Ejecuté Aleatorios.jar y confirmé 40 números aleatorios.
Prueba 2: Probé OrdenarNumeros.jar con entrada manual (45 12 78) y obtuve 12 45 78.
Prueba 3: Usé Aleatorios.jar | OrdenarNumeros.jar y verificé que los 40 números se ordenaran correctamente.

Notas Finales 🌈
Este proyecto demuestra el uso efectivo de tuberías en CMD para conectar procesos. ¡Explora más combinaciones y experimenta! Si tienes dudas, consulta el código o pide ayuda. 😊
