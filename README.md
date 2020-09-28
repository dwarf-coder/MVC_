
**INGENIERÍA EN SISTEMAS COMPUTACIONALES**

**MEAN STACK FRONT -END**

**Modelo MVC**

**PRESENTA:**
**Linares López Luis Ángel**

**PROFESOR:**
**Cesar Castor**


**Ciudad de México, septiembre 2020**


El MVC es un patrón de arquitectura de software que nos permite tener aplicaciones mantenibles y escalables. Este compuesto por tres capas, el modelo, la vista y el controlador. El modelo se encarga de los datos, en el se encuentran las consultas, búsquedas etc., en general se encarga de estar en interacción con la base de datos. El controlador se encarga de recibir las ordenes del usuario y pide los datos al modelo y después los envía a la vista, cuando hablamos de la vista nos referimos al front-end.
MVC es una propuesta de arquitectura del software utilizada para separar el código por sus distintas responsabilidades, manteniendo distintas capas que se encargan de hacer una tarea muy concreta, lo que ofrece beneficios diversos. 
MVC se usa inicialmente en sistemas donde se requiere el uso de interfaces de usuario, aunque en la práctica el mismo patrón de arquitectura se puede utilizar para distintos tipos de aplicaciones. Surge de la necesidad de crear software más robusto con un ciclo de vida más adecuado, donde se potencie la facilidad de mantenimiento, reutilización del código y la separación de conceptos. 
Su fundamento es la separación del código en tres capas diferentes, acotadas por su responsabilidad, en lo que se llaman Modelos, Vistas y Controladores. 
MVC es un "invento" que ya tiene varias décadas y fue presentado incluso antes de la aparición de la Web. No obstante, en los últimos años ha ganado mucha fuerza y seguidores gracias a la aparición de numerosos frameworks de desarrollo web que utilizan el patrón MVC como modelo para la arquitectura de las aplicaciones web. 
La rama de la ingeniería del software se preocupa por crear procesos que aseguren calidad en los programas que se realizan y esa calidad atiende a diversos parámetros que son deseables para todo desarrollo, como la estructuración de los programas o reutilización del código, lo que debe influir positivamente en la facilidad de desarrollo y el mantenimiento. 
Los ingenieros del software se dedican a estudiar de qué manera se pueden mejorar los procesos de creación de software y una de las soluciones a las que han llegado es la arquitectura basada en capas que separan el código en función de sus responsabilidades o conceptos

. 


Modelo
•	Representa los datos y operaciones sobre ellos
•	Accede a la capa de almacenamiento de datos
•	Define las reglas de negocio
•	Lleva un registro de las vistas y controladores del sistema
•	Si estamos ante un modelo activo, notificará a las vistas los cambios que en los datos pueda producir un agente externo
Vista
•	Es la representación visual del modelo
•	Recibe datos del modelo y los muestra al usuario
•	Tiene un registro de su controlador asociado
•	Cuando es un modelo activo que informa de los cambios en los datos producidos por otros agentes, da el servicio de actualización, para que sea invocado por el controlador o por el modelo
Controlador
•	Se encarga de ser intermediario entre el modelo y la vista, y coordinar la ejecución
•	Recibe los eventos de entrada (un clic, un cambio en un campo de texto, etc.)
•	Contiene reglas de gestión de eventos, estas acciones pueden suponer peticiones al modelo o a las vistas
Algunos de los frameworks usados en MVC son: 
Laravel, Ruby on rails, Django, Angular etc.
Ventajas del MVC
•	Fácil organización del código en componentes diferentes.
•	Adaptación a frameworks actuales.
•	Evitar en la medida de lo posible bugs.
•	Fácil escalabilidad.
•	Facilidad de trabajar en equipo.
•	Separación clara de dónde tiene que ir cada tipo de lógica, facilitando el mantenimiento y la escalabilidad de nuestra aplicación.
•	Sencillez para crear distintas representaciones de los mismos datos.
•	Facilidad para la realización de pruebas unitarias de los componentes, así como de aplicar desarrollo guiado por pruebas (Test Driven Development o TDD).
•	Reutilización de los componentes.
•	No existe ciclo de vida de las páginas. Con menos peso, menos complejidad.
Hay otras alternativas de modelos como son el MVP y el MVVM
MVP – Modelo Vista Presentador
 
En el artículo descrito por Mike Potel en 1996 analiza los tipos de interacciones que la vista tiene con el modelo. Clasificó las acciones de usuario como selección, ejecución de comandos y lanzamientos de eventos, por tanto definió las clases de Selección, que permite seleccionar una pequeña sección del modelo, y Orden, para operar sobre ella. Añadió después una clase Interactor que encapsulaba los eventos que modificaban los datos. Estas tres clases fueron encapsuladas en una nueva clase llamada Presentador. Más tarde, un grupo de desarrolladores de DolphinSmalltalk diseñaron su versión basándose en la propuesta por Bower y McGlashan revisando la relación entre la vista y el modelo.
 El modelo puede notificar a la vista que han llegado nuevos datos, y la vista puede actualizar sus datos a partir del modelo en el que están circunscritos. Este enlace indirecto sugiere que el modelo puede acceder a la interfaz de usuario directamente. La idea básica era modificar el mvc lo suficiente de forma que la vista adquiriese cierta funcionalidad del controlador, es por esto que se añade una nueva clase: el presentador. Este presentador puede acceder a la vista y al modelo directamente y la relación entre la vista y modelo todavía puede existir si es necesario. Al final, la vista muestra los datos y el presentador actualiza el modelo y la vista directamente.
 MVP se ve muy similar a MVC, salvo algunas diferencias clave:
•	La entrada comienza con la vista, no el presentador.
•	Existe una correspondencia uno-a-uno entre la vista y el presentador asociado.
•	La vista contiene una referencia al presentador. El presentador también está reaccionando a los acontecimientos que se ejecutará desde la vista, por lo que su conocimiento de la Vista su asociada con.
•	El presentador actualiza la vista sobre la base de las medidas solicitadas que realiza en el modelo, pero la vista no es el modelo de conciencia.
MV-VM – Model View View Modelo

 
La idea del MV-VM surge en torno a la arquitectura de las interfaces de usuario donde la vista es la responsable del diseñador en lugar del desarrollador y por ende no debe contender ningún código. Al igual que el mvc, la vista puede ligarse a los datos y presentar actualizaciones, pero esta vez sin código. De esta forma, la vista está bajo el control del diseñador, pero puede actualizar su estado por medio de las clases de dominio usando el mecanismo de enlace de datos.
En 2005, John Gossman, uno de los arquitectos de wpf y Silverlight en Microsoft, dio a conocer el patrón Modelo Vista Vista-Modelo (MV-VM) en su blog. MV-VM ofrecen una abstracción de la vista, que contiene el estado de la vista y su comportamiento. Gossman introdujo el MV-VM como una forma estandarizada de las características principales del núcleo de wpf para simplificar la creación de interfaces de usuario.
A diferencia del Presentador en MVP, un ViewModel no necesita una referencia a una vista.La vista se une a las propiedades de un ViewModel, que, a su vez, expone los datos contenidos en los objetos del modelo y otro estado específicos para la vista. Los enlaces entre la vista y ViewModel son fáciles de construir porque un objeto ViewModel se establece como el DataContext de una vista. Si los valores de propiedad en el cambio de modelo de vista, los nuevos valores se propagan automáticamente a la vista a través de enlace de datos. Cuando el usuario hace clic en un botón en la vista, un comando en el ViewModel ejecuta para realizar la acción solicitada. El modelo de vista, nunca la vista, lleva a cabo todas las modificaciones realizadas en los datos del modelo.
Entrando en contexto entre los patrones MVC y MVP, vamos a ver el patrón MVVM con sus diferencias:
•	La entrada comienza con la vista, no el Modelo Vista.
•	Mientras que la vista contiene una referencia a la vista de modelo, el Modelo Vista no tiene información sobre la Vista.
•	También te darás cuenta de que la vista no tiene ninguna idea sobre el modelo en el patrón MVVM. Esto se debe a que, hasta donde la vista se sabe, su “modelo” es la vista de modelo (de ahí su nombre). Debido a la forma de enlace de datos y otras características como comandante trabajo en WPF y Silverlight, hay una rica comunicación entre la vista y el modelo de vista, el aislamiento de la Vista de tener que saber nada acerca de lo que realmente está sucediendo detrás de las escenas.
•	Hace la vista fácilmente reutilizables mediante la abstracción de la lógica común
•	Elimina la dependencia en el modelo de la vista
•	Motor de Routing asociando una URL concreta con su correspondiente controlador, permitiendo URL semánticas. Las URL semánticas se indexan mejor en los buscadores, siendo más adecuadas para el posicionamiento web.
•	Recomendable para el diseño de aplicaciones web compatibles con grandes equipos de desarrolladores y diseñadores web que necesitan gran control sobre el comportamiento de la aplicación.



Referencias
http://www.dotnet-tricks.com/Tutorial/designpatterns/2FMM060314-Understanding-MVC,-MVP-and-MVVM-Design-Patterns.html
El maldito libro de los descarrilados- Herrera - 2010 Ruby on Rails, MVC
https://www.youtube.com/watch?v=rRS9TQuSN0Q
https://medium.com/academia-hack/frameworks-mvc-y-ruby-on-rails-1afc3c501c49
