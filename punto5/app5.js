//REALIZADO POR KATHERYNN GOMEZ

class Animal{
    #peso;
    constructor(nombre, edad){
        this.nombre = nombre;
        this.edad = edad;
        this.#peso = null;
    }

    recibirPeso(peso){
        if(peso >= 0){
            this.#peso = peso;
        }else{
            console.log("Peso inválido. Debe ser un valor positivo.");
        }
    }

    mostrarDatosBasicos(){
        console.log("Nombre: " + this.nombre);
        console.log("Edad: " + this.edad);
        console.log("Peso: " + this.#peso);
    }
}

class Perro extends Animal{
    constructor(nombre, edad, raza){
        super(nombre, edad);
        this.raza = raza;
    }   

    hacerSonido(){
        console.log("¡Guau!");
    }

    mostrarDatosCompletos(){
        console.log("\nDatos del perro: ");
        this.mostrarDatosBasicos();
        console.log("Raza: " + this.raza);
    }   
}

class Gato extends Animal{
    constructor(nombre, edad, color){
        super(nombre, edad);
        this.color = color;
    }

    hacerSonido(){
        console.log("¡Miau!");
    }

    mostrarDatosCompletos(){
        console.log("\nDatos del gato: ");
        this.mostrarDatosBasicos();
        console.log("Color: " + this.color);
    }
}

// MAIN

console.log("Llamando un perro y un gato...\n");
const perro1 = new Perro("Max", 3, "Labrador");
perro1.recibirPeso(25);
perro1.mostrarDatosCompletos();
perro1.hacerSonido();

const gato1 = new Gato("Luna", 2, "Gris");
gato1.recibirPeso(5);
gato1.mostrarDatosCompletos();
gato1.hacerSonido();
