# TAREA DISEÑO DE INTERFACE

## Desarrollo:

La empresa LeliaMerca, líder en hipermercados en grandes ciudades, desea ampliar su ámbito de negocio, creando nuevos centros de venta al público. Desea crear una App que le permita gestionar las ofertas en función del tipo de cliente y con un aspecto distinto dependiendo de que sea para cubrir los hipermercados , tiendas gourmet y supermercados low cost, por lo que solicita vuestra ayuda para desarrollar las interfaces que necesitan.

La App debe constar con una ventana principal que identifique el tipo de negocio (hipermercado, gourmet o low cost). Además debe pedir nombre de usuario para iniciar sesión e indicar que tipo de usuario es.

Existen 3 tipos de usuario:

- Cliente esporádico
- Cliente Club
- Cliente Premium

Debes elegir el componente más idóneo para esta elección. A continuación pulsar el botón Aceptar para que muestre la ventana de las ofertas.

Los requisitos que debe cumplir la aplicación, al menos, son:

La ventana de las ofertas semanales debe cumplir con los siguientes requisitos:

- Pantalla de muestra de las ofertas de la semana y los cupones disponibles.
- Debes mostrar las ofertas semanales en función del tipo de cliente que es. Para cada oferta debe aparecer una imagen con el precio y un cuadro de texto en el que se indica el número de artículos a comprar.
- Botón cancelar: Al pulsar 'cancelar' debe mostrar un cuadro de diálogo indicando al usuario si está seguro de realizar esa acción.
- Botón Comprar: Muestra el total de la compra.

## Valoración:

- Creación de la ventana inicial empleando los componentes más adecuados, colores etc, en función del tipo de Supermercado –> 1 punto

- Gestión clientes. Elección de componentes y diseño –> 1 punto

- Funcionalidad de la gestión de clientes. Al elegir un cliente club o premium se aplica un % de descuento a las ofertas y cambia el color del precio –> 2 puntos

- Creación de la ventana donde aparecen las ofertas semanales –> 2 puntos

- Funcionalidad del botón Comprar y Cancelar de la ventana de ofertas semanales –> 2 puntos

- Documentación, claridad y documentación del código, formato de entrega –> 2 puntos

## Entregar:

- App: Una vez realizada la tarea tendrás que comprimir los archivos que has generado y subirlos a la plataforma. La estructura de archivos a entregar dentro del archivo comprimido es:

    - Un directorio programa con el proyecto

    - Un directorio documentación con la documentación en formato pdf, la cual debe contener:

        - Una breve descripción del tipo de negocio que has elegido (gourmet, low cost, etc).

        - Razones de diseño (colores, tipo de letra, disposición, etc), en función del tipo de negocio explicando.

        - Capturar las ventanas con una breve explicación de su funcionalidad.

        - El envío se realizará a través de la plataforma de la forma establecida para ello, y el archivo se nombrará siguiendo las siguientes pautas:

            - apellido1_apellido2_nombre_UDXX_TareaXX

### ACLARACIONES:

- El funcionamiento de la aplicación debe ser simulado, las imágenes son siempre las mismas con su precio. No es necesario para esta tarea la conexión a una base de datos

- Cuando nuestra aplicación necesita más de una ventana, debemos utilizar ventanas secundarias mediante el componente Jdialog. Un JFrame no admite a ninguna otra ventana como padre. El JDialog sí admite como padres un JFrame u otros JDialog. Esto es importante porque una ventana hija siempre quedará por encima de su ventana padre. Si al crear los JDialog les pasamos el JFrame como padre o parent, los JDialog siempre estarán visibles por encima del JFrame. No se podrán ir "detrás" de él.

- Utilización de ventanas modales/no modales en función de las necesidades de la interfaz
