//REALIZADO POR KATHERYNN GOMEZ

const prompt = require('prompt-sync')();

class Persona{
    constructor(nombre, edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    mostrarDatosBasicos(){
        console.log("Nombre: " + this.nombre);
        console.log("Edad: " + this.edad);
    }
}

class Cliente extends Persona{
    #saldo;
    constructor(nombre, edad, numeroCuenta){
        super(nombre, edad);
        this.numeroCuenta = numeroCuenta;
        this.#saldo = null;
    }

    recibirSaldo(saldo){
        if(saldo >= 0){
            this.#saldo = saldo;
        }else{
            console.log("Saldo inválido. Debe ser un valor positivo.");
        }
    }

    getSaldo(){
        return this.#saldo;
    }

    retirarSaldo(cantidad){
        if(this.getSaldo() !== null && cantidad > 0 && cantidad <= this.getSaldo()){
            this.#saldo -= cantidad;
            console.log("Has retirado: " + cantidad);
            console.log("Saldo restante: " + this.getSaldo());
        }else{
            console.log("Cantidad inválida o saldo insuficiente.");
        }
    }

    depositarSaldo(cantidad){
        if(cantidad > 0){
            if(this.getSaldo() !== null){
                this.#saldo += cantidad;
            }else{
                this.#saldo = cantidad;
            }
            console.log("Has depositado: " + cantidad);
            console.log("Saldo actual: " + this.getSaldo());
        }
    }

    mostrarSaldo(){
        console.log("Saldo actual: " + (this.getSaldo() !== null ? this.getSaldo() : "No asignado"));
    }

}

function menu(){
    console.log("\nBienvenido al sistema bancario DMK\n");
    console.log("Menú de opciones:");
    console.log("1. Mostrar saldo");
    console.log("2. Retirar saldo");
    console.log("3. Depositar saldo");
    console.log("0. Salir\n");
}

//MAIN

const nombre = prompt("Ingrese su nombre: ");
const edad = parseInt(prompt("Ingrese su edad: "));
const numeroCuenta = prompt("Ingrese su número de cuenta: ");

const cliente = new Cliente(nombre, edad, numeroCuenta);

const saldoInicial = parseFloat(prompt("Ingrese su saldo inicial: "));
cliente.recibirSaldo(saldoInicial);

let dowhile = true;
do {
    menu();

    const opcion = prompt("Seleccione una opción: ").toLowerCase();
    switch(opcion){
        case "1":
            cliente.mostrarDatosBasicos();
            cliente.mostrarSaldo();
            break;  
        case "2":        
            cliente.mostrarDatosBasicos();
            const cantidadRetirar = parseFloat(prompt("Ingrese la cantidad a retirar: "));
            cliente.retirarSaldo(cantidadRetirar);
            break;
        case "3":
            cliente.mostrarDatosBasicos();
            const cantidadDepositar = parseFloat(prompt("Ingrese la cantidad a depositar: "));
            cliente.depositarSaldo(cantidadDepositar);
            break;
        case "0":
            console.log("Gracias por usar el sistema bancario DMK. ¡Hasta luego!");
            dowhile = false;
            break;
        default:
            console.log("Opción inválida. Por favor, seleccione una opción válida.");
    }
}while(dowhile);