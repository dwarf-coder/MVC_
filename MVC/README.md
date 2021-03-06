
Presenta: Luis Angel Linares Lopez
     No. Control: 171190006

___
___
- [Introducción](#introduccion)
- [Marco teorico](#marco)
- [Concepto MVC](#mvc)
  - [Modelo](#model)
  - [Vista](#view)
  - [Controlador](#controler)
- [Frameworks](#frameworks)
- [Ejemplos](#ejemplos)
- [Ventajas](#ventajas)
- [Alternativas al MVC](#alternativas)
- [Conclusion](#Conclusion)

<a name="introduccion"></a>
___
# Introducción

El contenido de este archivo tiene la finalidad de desarrollar los conceptos necesarios para entender el MVC (Modelo Vista Controlador), asi como sus caracteristicas, principales frameworks dedicados al mismo y trata de exponer algunos ejemplos para mejor comprension del lector. Esto como primera investigacion del curso de MEAN STACK FRONT-END que sentará las bases para el aprendizaje de nuevas tecnologias marcadas por el temario de dicha materia.
___
<a name="marco"></a>
## Marco teórico

El modelo–vista–controlador (MVC) es un patrón de arquitectura de software, que separa los datos y la lógica de negocio de una aplicación, de la interfaz de usuario y el módulo encargado de gestionar los eventos y las comunicaciones.

MVC propone la construcción de tres componentes distintos que son el modelo, la vista y el controlador, es decir, por un lado define componentes para la representación de la información, y por otro lado para la interacción del usuario. Este patrón de arquitectura de software se basa en las ideas de reutilización de código y la separación de conceptos, características que buscan facilitar la tarea de desarrollo de aplicaciones y su posterior mantenimiento.




___
<a name="mvc"></a>
## Concepto MVC



En cuanto a desarrollo de software, es común que cada quien utilice su propia lógica, conocimientos y experiencia para crear código. Y esto muchas veces resulta en desarrollos complejos que sólo su creador entiende. Pero, ¿es posible desarrollar un módulo que otro programador pueda aprovechar entender y mejorar? La respuesta está en los patrones de diseño. Estos básicamente son  modelos muestra que sirven como guía para que los programadores trabajen sobre ellos. Pero primero, veamos algunas definiciones: **Según [Wikipedia](www.wikipedia.org)**


> Los patrones de diseño son la base para la búsqueda de soluciones a problemas comunes en el desarrollo de software y otros ámbitos referentes al diseño de interacción o interfaces.


Esta definición se  considera correcta ya que cuando conoces un patrón, puedes ver inmediatamente dónde puede serte útil. En resumen y de forma sencilla, un patrón de diseño es una manera de resolver un problema. Un patrón de diseño debe cumplir al menos con los siguientes objetivos

- Estandarizar el lenguaje entre programadores
- Evitar perder tiempo en soluciones a problemas ya resueltos o conocidos
- Crear código reusable (excelente ventaja)



![](https://i.stack.imgur.com/8fbkf.jpg)

El tener patrones de diseño y conocer las estructuras que los programadores emplean, permite generar codigo reusable, mas eficiente eficaz y efectivo. De esta manera se optimizan recursos materiales y humanos.
___
<a name="model"></a>
#### Modelo
-	Representa los datos y operaciones sobre ellos
-	Accede a la capa de almacenamiento de datos
-	Define las reglas de negocio
-	Lleva un registro de las vistas y controladores del sistema
-	Si estamos ante un modelo activo, notificará a las vistas los cambios que en los datos pueda producir un agente externo
<a name="view"></a>
#### Vista
-	Es la representación visual del modelo
-	Recibe datos del modelo y los muestra al usuario
-	Tiene un registro de su controlador asociado
-	Cuando es un modelo activo que informa de los cambios en los datos producidos por otros agentes, da el servicio de actualización, para que sea invocado por el controlador o por el modelo
<a name="controler"></a>
#### Controlador
- Se encarga de ser intermediario entre el modelo y la vista, y coordinar la ejecución
- Recibe los eventos de entrada (un clic, un cambio en un campo de texto, etc.)
- Contiene reglas de gestión de eventos, estas acciones pueden suponer peticiones al modelo o a las vistas
___
<a name="frameworks"></a>
## Frameworks

Algunos de los frameworks usados en MVC son: 

- [Node js](https://nodejs.org/es/)

Node.js es similar en diseño y está influenciado por sistemas como Event Machine de Ruby y Twisted de Python. Pero Node.js lleva el modelo de eventos un poco más allá. Incluye un bucle de eventos como runtime de ejecución en lugar de una biblioteca. En otros sistemas siempre existe una llamada de bloqueo para iniciar el bucle de eventos. Por lo general, el comportamiento se define mediante devoluciones callbacks de llamada al iniciarse un script y al final se inicia un servidor a través de una llamada de bloqueo como EventMachine::run(). En Node.js, no existe como tal la llamada de inicio del evento de bucle o start-the-event-loop. Node.js simplemente entra en el bucle de eventos después de ejecutar el script de entrada y sale cuando no hay más devoluciones callbacks de llamada para realizar. Se comporta de una forma similar a JavaScript en el navegador - el bucle de eventos está oculto al usuario.
- [Laravel](https://laravel.com/)

El marco PHP para artesanos web
Laravel es un marco de aplicación web con una sintaxis elegante y expresiva. Ya hemos sentado las bases, permitiéndole crear sin preocuparse por las pequeñas cosas.

- [Express](https://expressjs.com/es/)

Express es una infraestructura de aplicaciones web Node.js mínima y flexible que proporciona un conjunto sólido de características para las aplicaciones web y móviles.

- [Ruby on rails](https://rubyonrails.org/)

Ruby on Rails es un software de código abierto , por lo que no solo es de uso gratuito, sino que también puede ayudar a mejorarlo. Más de 5,000 personas ya han contribuido con código a Rails. Es más fácil de lo que piensa convertirse en uno de ellos.

Optimización para la felicidad del programador con Convención sobre configuración es nuestra forma de trabajar. Ruby on Rails ha ido popularizando ambos conceptos junto con una variedad de otros puntos controvertidos desde el principio. Para obtener más información sobre por qué Rails es tan diferente de muchos otros marcos y paradigmas de aplicaciones web, examine The Rails Doctrine .

- [Django](https://www.djangoproject.com/)

jango es un marco web Python de alto nivel que fomenta un desarrollo rápido y un diseño limpio y pragmático. Creado por desarrolladores experimentados, se encarga de gran parte de la molestia del desarrollo web, por lo que puede concentrarse en escribir su aplicación sin necesidad de reinventar la rueda. Es gratis y de código abierto.

- [Angular](https://angular.io/).

Angular le permite controlar la escalabilidad. Satisface requerimientos enormes de data construyendo modelos de data en RxJS, Immutable.js o algún otro modelo-de-empuje.

![](https://miro.medium.com/max/725/1*P8aGpuAxcVXgO4m7cByVtA.jpeg)
___
<a name="ventajas"></a>
## Ventajas del MVC


- Fácil organización del código en componentes diferentes.
- Adaptación a frameworks actuales.
- Evitar en la medida de lo posible bugs.
- Fácil escalabilidad.
- Facilidad de trabajar en equipo.
- Separación clara de dónde tiene que ir cada tipo de lógica, facilitando el mantenimiento y la escalabilidad de nuestra aplicación.
- Sencillez para crear distintas representaciones de los mismos datos.
- Facilidad para la realización de pruebas unitarias de los componentes, así como de aplicar desarrollo guiado por pruebas (Test Driven Development o TDD).
- Reutilización de los componentes.
- No existe ciclo de vida de las páginas. Con menos peso, menos complejidad.
___
<a name="alternativas"></a>
## Alternativas a MVC
Hay otras alternativas de modelos como son el MVP y el MVVM
###### MVP – Modelo Vista Presentador

El modelo puede notificar a la vista que han llegado nuevos datos, y la vista puede actualizar sus datos a partir del modelo en el que están circunscritos. Este enlace indirecto sugiere que el modelo puede acceder a la interfaz de usuario directamente. La idea básica era modificar el mvc lo suficiente de forma que la vista adquiriese cierta funcionalidad del controlador, es por esto que se añade una nueva clase: el presentador. Este presentador puede acceder a la vista y al modelo directamente y la relación entre la vista y modelo todavía puede existir si es necesario. Al final, la vista muestra los datos y el presentador actualiza el modelo y la vista directamente.

![](https://ingsoftwarei2014.files.wordpress.com/2014/06/9j5wl.png?w=390&h=84)

MVP se ve muy similar a MVC, salvo algunas diferencias clave:
-	La entrada comienza con la vista, no el presentador.
-	Existe una correspondencia uno-a-uno entre la vista y el presentador asociado.
-	La vista contiene una referencia al presentador. El presentador también está reaccionando a los acontecimientos que se ejecutará desde la vista, por lo que su    conocimiento de la Vista su asociada con.
-	El presentador actualiza la vista sobre la base de las medidas solicitadas que realiza en el modelo, pero la vista no es el modelo de conciencia.

###### MV-VM – Model View View Modelo
La idea del MV-VM surge en torno a la arquitectura de las interfaces de usuario donde la vista es la responsable del diseñador en lugar del desarrollador y por ende no debe contender ningún código. Al igual que el mvc, la vista puede ligarse a los datos y presentar actualizaciones, pero esta vez sin código. De esta forma, la vista está bajo el control del diseñador, pero puede actualizar su estado por medio de las clases de dominio usando el mecanismo de enlace de datos.
A diferencia del Presentador en MVP, un ViewModel no necesita una referencia a una vista.La vista se une a las propiedades de un ViewModel, que, a su vez, expone los datos contenidos en los objetos del modelo y otro estado específicos para la vista. Los enlaces entre la vista y ViewModel son fáciles de construir porque un objeto ViewModel se establece como el DataContext de una vista. Si los valores de propiedad en el cambio de modelo de vista, los nuevos valores se propagan automáticamente a la vista a través de enlace de datos. Cuando el usuario hace clic en un botón en la vista, un comando en el ViewModel ejecuta para realizar la acción solicitada. El modelo de vista, nunca la vista, lleva a cabo todas las modificaciones realizadas en los datos del modelo.
Entrando en contexto entre los patrones MVC y MVP, vamos a ver el patrón

![](https://ingsoftwarei2014.files.wordpress.com/2014/06/riemj.png?w=328&h=148)

MVVM con sus diferencias:
- La entrada comienza con la vista, no el Modelo Vista.
- Mientras que la vista contiene una referencia a la vista de modelo, el Modelo Vista no tiene información sobre la Vista.
- También te darás cuenta de que la vista no tiene ninguna idea sobre el modelo en el patrón MVVM. Esto se debe a que, hasta donde la vista se sabe, su “modelo” es la vista de modelo (de ahí su nombre). Debido a la forma de enlace de datos y otras características como comandante trabajo en WPF y Silverlight, hay una rica comunicación entre la vista y el modelo de vista, el aislamiento de la Vista de tener que saber nada acerca de lo que realmente está sucediendo detrás de las escenas.
- Hace la vista fácilmente reutilizables mediante la abstracción de la lógica común
- Elimina la dependencia en el modelo de la vista
- Motor de Routing asociando una URL concreta con su correspondiente controlador, permitiendo URL semánticas. Las URL semánticas se indexan mejor en los buscadores, siendo más adecuadas para el posicionamiento web.
- Recomendable para el diseño de aplicaciones web compatibles con grandes equipos de desarrolladores y diseñadores web que necesitan gran control sobre el comportamiento de la aplicación.
___

<a name="ejemplos"></a>
## Ejemplos
######  Node.js

Ideado como un entorno de ejecución de JavaScript orientado a eventos asíncronos, Node.js está diseñado para crear aplicaciones network escalables. En el siguiente ejemplo de "hola mundo", pueden atenderse muchas conexiones simultáneamente. Por cada conexión, se activa la devolución de llamada o callback, pero si no hay trabajo que hacer, Node.js se dormirá.



    const http = require('http');
    
    const hostname = '127.0.0.1';
    const port = 3000;
    
    const server = http.createServer((req, res) => {
      res.statusCode = 200;
      res.setHeader('Content-Type', 'text/plain');
      res.end('Hola Mundo');
    });
    
    server.listen(port, hostname, () => {
      console.log(`El servidor se está ejecutando en http://${hostname}:${port}/`);
    });


###### Angular
Crearemos un hola mundo para entender como funciona Angular.
En primer lugar es necesario insertar el fichero externo de Angular.js en tu aplicación. Para ello, puedes ir a la página oficial de AngularJS. Después de descargar el fichero externo, necesitas añadir este código en el head de tu aplicación.



    <head>
    <script src="angular.min.js"></script>
    </head>

Ahora toca crear la función que mostrará nuestro Hola Mundo en la aplicación. Añade esta función de Javascript en la sección head de tu aplicación.



    <script>
    function HelloWorld($scope) {
     $scope.test = 'Mundo';
     }
    </script>

Aquí, hemos creado una función llamada "HelloWorld". En esta función HelloWorld, $scope crea la conexión entre la función y la vista, o en otras palabras, la parte de diseño. "Test" es una variable que tendrá "Mundo" como valor por defecto.
Ahora crearemos un div, un textbox y varios labels para mostrar el ejemplo del Hola Mundo.



    <body>
    <div ng-controller="HelloWorld">
     Tu nombre: <input type="text" ng-model="test"/>
    <hr/>
     Hola {{test || "Mundo"}}!
    </div>
    </body>

Aquí en el div, puedes ver que utilizo una directiva llamada "ng-controller", cuyo valor consiste en el nombre de la función JavaScript que se quiere aplicar a un Div, Span o cualquier elemento HTML específico.

Después, en el campo de texto utilizo la directiva "ng-model" que proporciona la unión entre la Vista y el Modelo. En ng-model, cuyo valor es "test", significa que el valor introducido en este campo se reemplazará con el valor predeterminado, establecido en la función JavaScript.

Una cosa más que hay que hacer y que es muy importante. Hay que añadir la directica "ng-app" en la etiqueta HTML.


    <html ng-app xmlns="http://www.w3.org/1999/xhtml">

ng-app declara que esto es una página AngularJS. Si no agregas esta directiva en la etiqueta HTML, tu aplicación no funcionará correctamente porque no podrá detectar las demás directivas de AngularJS.

Ahora nuestra aplicación de Hola Mundo está lista para ser ejecutada.

El código completo de la aplicación es el siguiente:



    <html ng-app xmlns="http://www.w3.org/1999/xhtml">
    <head>
    <script src="angular.min.js"></script>
    <script>
    function HelloWorld($scope) {
     $scope.test = 'Mundo';
     }
    </script>
    </head> 
    <body>
    <div ng-controller="HelloWorld">
     Tu nombre: <input type="text" ng-model="test"/>
    <hr/>
     Hola {{test || "Mundo"}}!
    </div>
    </body>
    </html> 

###### Express js

Esta es básicamente la aplicación Express más sencilla que puede crear. Es una aplicación de archivo simple — no lo que obtendrá si utiliza el generador de Express, que crea el andamiaje para una aplicación completa con varios archivos JavaScript, plantillas Jade y subdirectorios para distintos propósitos.
En primer lugar, cree un directorio denominado myapp, cámbielo y ejecute npm init. A continuación, instale express como una dependencia, según se describe en la guía de instalación.

En el directorio myapp, cree un archivo denominado app.js y añada el código siguiente:



    const express = require('express')
    const app = express()
    const port = 3000
    
    app.get('/', (req, res) => {
      res.send('Hello World!')
    })
    
    app.listen(port, () => {
      console.log(`Example app listening at http://localhost:${port}`)
    })

La aplicación inicia un servidor y escucha las conexiones en el puerto 3000. La aplicación responde con “Hello World!” para las solicitudes al URL raíz (/) o a la ruta raíz. Para cada vía de acceso diferente, responderá con un error 404 Not Found.
req (solicitud) y res (respuesta) son exactamente los mismos objetos que proporciona Node, por lo que puede invocar req.pipe(), req.on('data', callback) y cualquier otro objeto que invocaría sin estar Express implicado.

Ejecute la aplicación con el siguiente mandato:



    $ node app.js

A continuación, cargue http://localhost:3000/ en un navegador para ver la salida.
___
>** CABE MENCIONAR QUE DENTRO DEL REPOSITORIO INCLUÍ UNOS ARCHIVOS JAVA QUE EJEMPLIFICAN LA MANERA EN QUE LOS DATOS SE MANIPULAN EN EL MVC. **
___

<a name="conclusion"></a>
## Conclusión
Si bien conceptualizar la informacion a en ocasiones es complejo ya que lo que entendemos muchas veces esta alejado del significado real, me queda claro la importancia de entender las estructuras de trabajo, los distintos modelos, y las herramientas mas recientes que se encuentren a nuestro alcance al momento de desarrollar un proyecto para optimizar recursos. Tal pareciera que cuando creemos tener el conocimiento necesario para afrontar los retos, entre mas buscamos informacion, mas dudas surgen y mas debilidades se muestran, sin embargo el conocer las definiciones nos acerca un poco a entender la tecnologia que dia a dia se va generando.

En el caso del MVC es a mi parecer y por la informacion recabada una de las maneras mas eficientes de estructurar un proyecto. Estando esto sujeto por obviedad a los requerimientos del mismo, sin embargo si puede ser empleado en grandes proyectos, resultara de gran ayuda asi mismo en desarrollos de calquier robustes, siempre y cuando se genere un orden las funcionalidades de la aplicacion a desarrollar contaran con mayor eficacia al momento de llevar a cabo los procesos.

Es decision de cada desarrollador aplicar la forma de trabajo que mejor le parezca, pero debemos recordar que para fines de proyectos grandes, existiran equipos, los cuales estaran regidos por maneras de trabajo que se apeguen a estandares de alta calidad y estar preparados para estos casos es de vital importancia a la hora de encajar en un ambiente de trabajo que nos permita colaborar en ambientes profesionales.


