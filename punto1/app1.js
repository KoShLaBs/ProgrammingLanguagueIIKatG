// REALIZADO MARIA PAULA RAMIREZ

class Persona {
  constructor(nombre, edad) {
    this.nombre = nombre;
    this.edad = edad;
  }

  mostrarInformacionBasica() {
    console.log(`Nombre: ${this.nombre}, Edad: ${this.edad}`);
  }
}

class Estudiantes extends Persona {
    #notaFinal;
    constructor(nombre, edad, curso) {
        super(nombre, edad);
        this.curso = curso;
        this.#notaFinal = null;
    }

    recibirNota(nota) {
        if (nota >= 0 && nota <= 5) {
            this.#notaFinal = nota;
        }else{
            console.log("Lnota es invalida!!")
        }
    }

    mostrarInformacion(){
      console.log(("---Informacion de estudiante---"));
      super.mostrarInformacionBasica();
      console.log("Curso: " + this.curso);
      if (this.#notafinal === null ){
        console.log("Nota final: sin asignar");
        
      }else{
        console.log("Nota final: " + this.#notaFinal);
        
      }
      
      
    }
    verificarAprobacion(){
      if (this.#notaFinal === null){
        console.log("Estado : nota no asignada ");
      }else if(this.#notaFinal >= 0 && this.#notaFinal < 3){
        console.log("Reprobado!!");
      }else if(this.#notaFinal >= 3 && this.#notaFinal < 5){
        console.log("Aprobado!!");
      }

    }
}
class Docente extends persona{
  constructor(nombre,edad,materia){
    super(nombre,edad);
    this.materia = materia;
  }
  asignarNota(estudiante,nota){
    console.log("Docente " + this.nombre + " asigna la nota " + nota + " a " + estudiante.nombre);

    estudiante.recibirNota(nota);

  }
}
// Creacion de objetos
const docente1 = new Docente ("Luis", 23,"Arquitectura de software");
const estudiante1 = new Estudiante ("Carlos", 26 , "Arquitectura de software");
const estudiante2 = new Estudiante ("Maria", 28 , "Arquitectura de software");
const estudiante3 = new Estudiante ("Luisa", 36 , "Arquitectura de software");

//Asignacion de notas
docente1.asignarNota(estudiante1,4.0);
docente1.asignarNota(estudiante2,2.8);
docente1.asignarNotas(estudiante3, 6.5);

console.log("--------------------------------")
estudiante1.mostrarInformacion();
estudiante1.verificarAprobacion();

console.log("--------------------------------")
estudiante2.mostrarInformacion();
estudiante2.verificarAprobacion();

console.log("--------------------------------")
estudiante3.mostrarInformacion();
estudiante3.verificarAprobacion();
