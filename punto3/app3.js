class Empleado{
    #salario;
    constructor(nombre, edad){
        this.nombre = nombre;
        this.edad = edad;
        this.#salario = null;
    }

    mostrarDatosBasicos(){
        console.log("Nombre: " + this.nombre);
        console.log("Edad: " + this.edad);
    }

    recibirSalario(salario){
        if(salario >= 0){
            this.#salario = salario;
        }else{
            console.log("Salario inválido. Debe ser un valor positivo.");
        }
    }

    getSalario(){
        return this.#salario;
    }
}   

class EmpleadoTiempoCompleto extends Empleado{
    constructor(nombre, edad, departamento){
        super(nombre, edad);
        this.departamento = departamento;
    }
    
    salarioMensual(){
        if(this.getSalario() !== null){
            return this.getSalario() * 160; // Suponiendo 160 horas al mes para un empleado a tiempo completo
        }else{
            return null;
        }   
    }

    mostrarDatosCompletos(){
        console.log("\nDatos del empleado a tiempo completo: ");
        this.mostrarDatosBasicos();
        console.log("Departamento: " + this.departamento);
        console.log("Salario: " + (this.getSalario() !== null ? this.getSalario() : "No asignado"));
        console.log("Salario mensual: " + (this.salarioMensual() !== null ? this.salarioMensual() : "No asignado"));
    }
}

class EmpleadoPorHoras extends Empleado{
    constructor(nombre, edad, horasTrabajadas){
        super(nombre, edad);
        this.horasTrabajadas = horasTrabajadas;
    }

    salarioMensual(){
        if(this.getSalario() !== null){
            return this.getSalario() * this.horasTrabajadas; // Calcula el salario mensual basado en las horas trabajadas
        }else{
            return null;
        }
    }

    mostrarDatosCompletos(){
        console.log("\nDatos del empleado por horas: ");
        this.mostrarDatosBasicos();
        console.log("Horas trabajadas: " + this.horasTrabajadas);
        console.log("Salario: " + (this.getSalario() !== null ? this.getSalario() : "No asignado"));
        console.log("Salario mensual: " + (this.salarioMensual() !== null ? this.salarioMensual() : "No asignado"));
    }
}

//MAIN

console.log("Empleado tiempo completo: ");
const empleado1 = new EmpleadoTiempoCompleto("Juan", 30, "Recursos Humanos");
empleado1.recibirSalario(3000);
empleado1.mostrarDatosCompletos();

const empleado2 = new EmpleadoPorHoras("Laura", 25, 4);
empleado2.recibirSalario(50);
empleado2.mostrarDatosCompletos();
