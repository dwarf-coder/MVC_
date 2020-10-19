


- [Introducción](#Introduccion)
- [Marco teorico](#Marco teorico)
- [Metodos](#Metodos)
	- [Get](#Get)
	- [Head](#Head)
	- [Post](#Post)
	- [Patch](#Patch)
	- [Put](#Get)
	- [Delete](#Head)
	- [Option](#Option)
- [Tipos de mensajes de peticiones HTTPs](#Tipos)
	- [100-199](100)
	- [200-299](200)
	- [300-399](300)
	- [400-499](400)
	- [500-599](500)

------------


<a name="Introduccion"></a>
# Introduccion
Este documento tiene la finalidad de representar de manera concreta y lo mas clara posible conceptos referentes al protocolo http, desglozando en el camino conceptos que sean necesarios para poder "aterrizar" dichas definiciones. Tratando de utilizar unicamente informacion de fuentes fidedignas y con un plazo de las publicaciones no mayor a 3 años.

------------



<a name="Marco teorico"></a>
## Marco teorico
Para ahondar en el tema de los conceptos referentes a HTTP (Hypertext Transfer Protocol), debemos partit de lo singular.  - ¿Que es HTPP?, segun el sitio ** [MDN Docs](https://developer.mozilla.org/)** una definicion general es:

HTTP, de sus siglas en inglés: "Hypertext Transfer Protocol", es el nombre de un protocolo el cual nos permite realizar una petición de datos y recursos, como pueden ser documentos HTML. Es la base de cualquier intercambio de datos en la Web, y un protocolo de estructura cliente-servidor, esto quiere decir que una petición de datos es iniciada por el elemento que recibirá los datos (el cliente), normalmente un navegador Web. Así, una página web completa resulta de la unión de distintos sub-documentos recibidos, como, por ejemplo: un documento que especifique el estilo de maquetación de la página web (CSS), el texto, las imágenes, vídeos, scripts, etc...    


![](https://media.prod.mdn.mozit.cloud/attachments/2016/08/09/13677/d031b77dee83f372ffa4e0389d68108b/Fetching_a_page.png)


------------


<a name="Metodos"></a>
## Metodos

<a name="Get"></a>
#### GET

El método GET  solicita una representación de un recurso específico. Las peticiones que usan el método GET sólo deben recuperar datos.

```html
DOCTYPE html>
<html lang="es-ES">
  <head>
    <meta charset="utf-8">
    <title>Ejemplo método GET en el atributo method</title>
  </head>
  <body>
    <form action="http://www.google.com/search" method="get">
      Google:
      <input type="search" name="q">
      <input type="submit" value="Buscar">
    </form>
  </body>
</html>
```
![](https://www.abrirllave.com/html/images/metodo-get-en-atributo-method.gif
)


<a name="Head"></a>
#### HEAD

El método HEAD pide una respuesta idéntica a la de una petición GET, pero sin el cuerpo de la respuesta.
Es idéntido a GET, pero el servidor no devuelve el contenido en el HTTP response. Cuando se envía un HEAD request, significa que sólo se está interesado en el código de respuesta y los headers HTTP, no en el propio documento. Con este método el navegador puede comprobar si un documento se ha modificado, por razones de caching. Puede comprobar también directamente si el archivo existe.

Por ejemplo, si tienes muchos enlaces en tu sitio web, puedes enviar un HEAD request a todos los enlaces para comprobar los que estén rotos. Es bastante más rápido que hacerlo con GET.

Por ejemplo:

```html
HEAD /downloads/video1.mpeg HTTP/1.0
```
En el encabezado que el servidor le envía de respuesta, el cliente encuentra los datos sobre el tamaño del archivo en el campo “content-length”:

![](https://www.ionos.mx/digitalguide/fileadmin/DigitalGuide/Screenshots_2020/screenshot-of-a-http-response-to-the-request-head.png)

<a name="Post"></a>
#### POST

El método POST se utiliza para enviar una entidad a un recurso en específico, causando a menudo un cambio en el estado o efectos secundarios en el servidor.

Aunque se puedan enviar datos a través del método GET, en muchos casos se utiliza POST por las limitaciones de GET. En caso de respuesta positiva devuelve 201 (created). Los POST requests se envían normalmente con formularios:

```html
<!DOCTYPE html>
<html lang="es-ES">
  <head>
    <meta charset="utf-8">
    <title>Ejemplo método POST en el atributo method</title>
  </head>
  <body>
    <form action="procesar-datos.php" method="post">
      Nombre de usuario:
      <br>
      <input type="text" name="usuario">
      <br>
      Contraseña:
      <br>
      <input type="password" name="clave">
      <br><br>
      <input type="submit" value="Enviar datos">
    </form>
  </body>
</html>
```
![](https://www.abrirllave.com/html/images/metodo-post-en-atributo-method.gif)

<a name="Patch"></a>
#### PATCH

El método PATCH  es utilizado para aplicar modificaciones parciales a un recurso.
El método HTTP PUT únicamente permite reemplazar completamente un documento. A diferencia de PUT, el método PATCH no es idempotente, esto quiere decir que peticiones identicas sucesivas pueden tener efectos diferentes. Sin embargo,  es posible emitir peticiones PATCH de tal forma que sean idempotentes.

PATCH (al igual que POST) puede provocar efectos secundarios a otros recursos.

```html
PATCH /file.txt HTTP/1.1 
Host: www.example.com
Content-Type: application/example
If-Match: "e0023aa4e"
Content-Length: 100

[description of changes]
```

Respuesta

```html
HTTP/1.1 204 No Content
Content-Location: /file.txt
ETag: "e0023aa4f"
```

<a name="Put"></a>
#### PUT

El modo PUT reemplaza todas las representaciones actuales del recurso de destino con la carga útil de la petición.

Utilizado normalmente para actualizar contenidos, pero también pueden crearlos. Tampoco muestra ninguna información en la URL. En caso de éxito devuelve 201 (created, en caso de que la acción haya creado un elemento) o 204 (no response, si el servidor no devuelve ningún contenido).

La diferencia entre el método PUT y el método POST es que PUT es un método idempotente: llamarlo una o más veces de forma sucesiva tiene el mismo efecto (sin efectos secundarios), mientras que una sucesión de peticiones POST idénticas pueden tener efectos adicionales, como envíar una orden varias veces.

```html
PUT /nuevo.html HTTP/1.1
Host: ejemplo.com
Content-type: text/html
Content-length: 16
<p>Nuevo Archivo</p>

```
Respuesta

```html
HTTP/1.1 201 Created
Content-Location: /nuevo.html
```

<a name="Delete"></a>
#### DELETE
El método DELETE borra un recurso en específico.

Simplemente elimina un resource identificado en la URI. Si se elimina correctamente devuelve 200 junto con un body response, o 204 sin body. DELETE, al igual que PUT y GET, también es idempotente.

```html
DELETE /file.html HTTP/1.1
```
Si un método DELETE se aplica con éxito, hay varios códigos de estado de respuesta posibles:

 Un código de estado 202 (Aceptado) si la acción probablemente tendrá éxito pero aún no se ha promulgado.
 Un código de estado 204 (Sin contenido) si la acción se ha ejecutado y no se debe proporcionar más información.
 Un código de estado 200 (OK) si la acción se ha realizado y el mensaje de respuesta incluye una representación que describe el estado.
 
```html
 HTTP/1.1 200 OK 
Date: Wed, 21 Oct 2015 07:28:00 GMT

<html>
  <body>
    <h1>File deleted.</h1> 
  </body>
</html>
```

<a name="Options"></a>

#### OPTIONS

El método OPTIONS es utilizado para describir las opciones de comunicación para el recurso de destino.

El método OPTIONS representa una solicitud de información acerca de las opciones de comunicación disponibles en el canal de solicitud/respuesta identificada por el Request-URI. En otras palabras, éste método es el que utilizamos para describir las opciones de comunicación existentes de un recurso destino. Dato: El cliente como tal puede especificar una URL para este método o, en su lugar, utilizar un asterisco para referirse al servidor completo.

Ejemplo. Se necesita saber cuáles métodos de solicitud soporta el servidor de nuestra profesora, podemos utilizar curl y una solicitud OPTIONS:

```html
curl -X OPTIONS https:
```

Por lo que el servidor podria contestar lo siguiente:

```html
HTTP/1.1 200 OK
Date: Wed, 8 Nov 2017 12:28:53 GMT
Server: Apache/2.2.14 (Win32)
Allow: GET,HEAD,POST,OPTIONS,TRACE
Content-Type: httpd/unix-directory
```


------------


<a name="Tipos"></a>
## Tipos de mensajes de las peticiones HTTPs.

Cuando se carga una página web se devuelve un código de estado HTTP que nos indica cómo ha ido la carga de la página.

Normalmente ese código de estado es invisible de cara al usuario que está visitando la web. Solo en caso de que se produzca un error en la carga es posible que en el navegador se nos muestre el tipo de error que se está produciendo.

Vamos a hacer aquí un repaso a los tipos de errores HTTP más comunes, para saber así cómo interpretarlos y tomar las medidas oportunas para corregirlos.


<a name="100"></a>
### 100-199:
Respuestas informativas
Petición recibida, continuando proceso. Esta respuesta significa que el servidor ha recibido los encabezados de la petición, y que el cliente debería proceder a enviar el cuerpo de la misma (en el caso de peticiones para las cuales el cuerpo necesita ser enviado; por ejemplo, una petición Hypertext Transfer Protocol). Si el cuerpo de la petición es largo, es ineficiente enviarlo a un servidor, cuando la petición ha sido ya rechazada, debido a encabezados inapropiados. Para hacer que un servidor chequee si la petición podría ser aceptada basada únicamente en los encabezados de la petición, el cliente debe enviar Expect: 100-continue como un encabezado en su petición inicial (vea Plantilla:Web-RFC: Expect header) y verificar si un código de estado 100 Continue es recibido en respuesta, antes de continuar (o recibir 417 Expectation Failed y no continuar).1​

100 Continue
 El navegador puede continuar realizando su petición (se utiliza para indicar que la primera parte de la petición del navegador se ha recibido correctamente).2​
101 Switching Protocols
El servidor acepta el cambio de protocolo propuesto por el navegador (puede ser por ejemplo un cambio de HTTP 1.0 a HTTP 1.1).2​
102 Processing (WebDAV - RFC 2518)
 El servidor está procesando la petición del navegador pero todavía no ha terminado (esto evita que el navegador piense que la petición se ha perdido cuando no recibe ninguna respuesta).2​
103 Checkpoint
 Se va a reanudar una petición POST o PUT que fue abortada previamente.


<a name="200"></a>
### 200-299:

En general todos los códigos de estado que sean 2XX (un 2 seguido de 2 números) indican que la carga ha ido bien.

Por tanto, si el HTTP status de tu página web es 200 todo va como la seda. ¡Enhorabuena!


<a name="300"></a>
### 300-399:

Estos códigos indican que se está haciendo una redirección de una página a otra.

Esta redirección puede ser permanente (código 301) o temporal (código 302).

Es decir, cuando se ha ido a cargar una cierta página se nos ha redirigido a otra.

Supuestamente esto ocurre porque lo hemos configurado así, ya sea aplicando la redirección en el archivo .htaccess (para servidores Apache) o con otro método.

Las redirecciones se suelen crear cuando queremos cambiar el dominio de nuestra página web (por ejemplo, de www.viejadireccion.com a www.nuevadireccion.com) o cuando queremos cambiar un enlace concreto de la página.

En general, todos los códigos de estado 3XX (un 3 seguido de 2 números) indican una redirección.

<a name="400"></a>
### 400-499:
Se refieren a errores de cliente. Suelen darse cuando la página que se carga no existe o se tiene el acceso bloqueado a ella. Vamos a revisar los más comunes:

Error 400: la solicitud tiene una sintaxis incorrecta. Significa que las dirección de la página web que se quiere cargar (la URL) tiene un formato no válido.

Error 403: indica que la página solicitada existe pero se ha denegado el acceso a la misma.

Por ejemplo, podría tratarse de un contenido exclusivo para usuarios registrados.

Error 401: similar al error 403, pero en este caso existiría una posibilidad de acceso a la misma que no se ha pasado o todavía no se ha superado.

Por ejemplo, al cargar la página se podría mostrar una solicitud de usuario y contraseña, que deben ser rellenados para poder acceder a la página.

Ninguna página de inicio de una web debería mostrar un error de este tipo, a menos que sea exclusiva de uso interno, no de cara al público.

Error 404: posiblemente el error más común. Indica que la página que se está tratando de cargar no se ha encontrado.

Esto puede ocurrir porque hemos escrito mal la dirección de la página web que queremos cargar, que hemos cargado la página a través de un enlace erróneo, o que la página sí que existió en su momento pero ahora ya no.

Error 406: indica que la página ha devuelto un código que no puede ser interpretado por el navegador con el que estamos cargando la página web.

![](https://i2.wp.com/learn.onemonth.com/wp-content/uploads/2017/08/1-10.png?fit=845%2C503&ssl=1)


<a name="500"></a>
### 500-599:
se refieren a errores del servidor. Pueden generarse por un error en el código de la página web o dentro del propio servidor. Vemos los más usuales:

Error 500: otro error muy común. Indica un error interno, lo que se puede traducir que la página web tiene algún error en el código, por lo que el servidor no puede generar el código HTML para devolver al usuario.

 Por ejemplo, si en un WordPress existe un error de php, se podría producir ese http error 500.

 Si vemos que nos sale este error tendremos que revisar el log de errores para tratar de localizar el archivo que está generando el error y aplicar las correcciones oportunas.

  Error 504: indica que el tiempo de espera para devolver la página web se ha agotado.

 Puede estar generado por un error en el propio servidor (por ejemplo, se ha “colgado” el Apache) o porque nuestra página web contiene algún código que nunca termina de ejecutarse (por ejemplo, un bucle del que nunca se sale).

 Error 509: indica que se ha superado el límite de ancho de banda disponible en el servidor para nuestra página web.

Es común que con la contratación del hosting se indique un limite mensual en el ancho de banda, es decir, el número de datos que se puede devolver desde el servidor a los visitantes de nuestra página web.En caso de que tengamos un error de este tipo deberemos ponernos en contacto con el proveedor de nuestro servicio de hosting.

 También será conveniente tomar medidas para evitar que esto ocurra.
 Por ejemplo, es posible que estemos usando imágenes que ocupan demasiado espacio, u ofreciendo archivos muy pesados para su descarga que podríamos colocar en servicios externos.
