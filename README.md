<h1>Ejemplo de Herencia en Java:</h1>

<p>Clase Persona:</p>
    <ul>
    <li>Define atributos nombre y edad.</li>
    <li>Incluye un constructor para inicializar estos atributos.</li>
    <li>Proporciona métodos getters y setters para los atributos.</li>
    <li>Implementa un método mostrarInformacion() para mostrar la información de la persona.</li>
    </ul>
<p>Clase Alumno:</p>
    <ul>
    <li>Hereda de Persona usando extends.</li>
    <li>Añade un atributo específico numeroMatricula.</li>
    <li>Incluye un constructor que llama al constructor de la clase base (super(nombre, edad)) y además inicializa numeroMatricula.</li>
    <li>Proporciona métodos getters y setters para numeroMatricula.</li>
    <li>Sobrescribe el método mostrarInformacion() para mostrar información adicional del alumno. Usa super.mostrarInformacion() para llamar al método de la clase base y luego añade la información específica de Alumno.</li>
    </ul>
<p>Clase Main:</p>
    <ul>
    <li>Crea un objeto de la clase Alumno y llama a su método mostrarInformacion() para mostrar todos los detalles del alumno.</li>
    </ul>

<p>Este ejemplo demuestra cómo utilizar la herencia en Java para crear una subclase (Alumno) que amplía la funcionalidad de una clase base (Persona).</p>
