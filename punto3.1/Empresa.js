// REALIZADO DANIEL MAHECHA
class Empleado {
    constructor(nombre,edad ) {
        this.nombre = nombre;
        this.edad = edad;
    }  
    mostrarInformacionBasica() {
        console.log(`Nombre: ${this.nombre}, Edad: ${this.edad}`);
    }    
}

class EmpleadoTiempoCompleto extends Empleado {
    #salarioMensual;
    constructor(nombre, edad, departamento) {
        super(nombre, edad);
        this.departamento = departamento;
        this.#salarioMensual = null;
    }

    recibirSalario(salario) {
        if (salario >= 0) {
            this.#salarioMensual = salario;
        } else {
            console.log("Salario inválido!!");
        }
    }

    mostrarInformacion() {
        super.mostrarInformacionBasica();
        console.log(`Departamento: ${this.departamento}, Salario Mensual: $${this.#salarioMensual} COP`);
    }
}

class EmpleadoPorHoras extends Empleado {
    #salarioPorHora;
    constructor(nombre, edad, departamento,horasTrabajadas,valorHora) {
        super(nombre, edad);
        this.departamento = departamento;
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
        this.#salarioPorHora = null;
    }
    recibirValorPorHora(valorHora) {
        if (valorHora >= 0) {
            this.valorHora = valorHora;
        } else {
            console.log("Valor por hora inválido!!");
        }
    }
    recibirSalario(salario) {
        if (salario >= 0) {

            this.#salarioPorHora = salario;
        } else {
            console.log("Salario inválido!!");
        }
    }

    calcularSalario() {
        if (this.valorHora !== null && this.horasTrabajadas !== null) {
            return this.valorHora * this.horasTrabajadas;
        } else {
            console.log("Valor por hora o horas trabajadas no asignados!!");
            return null;
        }
    }

    mostrarInformacion() {
        super.mostrarInformacionBasica();
        console.log(`Departamento: ${this.departamento}, Salario Por Hora: $${this.#salarioPorHora} COP`);
    }
}
// Creacion de objetos
const empleado1 = new EmpleadoTiempoCompleto("Juan", 30, "Ventas");
const empleado2 = new EmpleadoPorHoras("Maria", 25, "Atención al Cliente", 160, 7950);
empleado1.recibirSalario(3000000);
empleado2.recibirValorPorHora(7950);
empleado2.recibirSalario(empleado2.calcularSalario());
console.log("---Información de empleados---");
empleado1.mostrarInformacion();
console.log("-----------------------------");
empleado2.mostrarInformacion();