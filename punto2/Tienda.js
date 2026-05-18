// REALIZADO DANIEL MAHECHA

class Producto {
    constructor(nombre, precio, categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    MostrarInformacion() {
        console.log(`Producto: ${this.nombre}, Precio: $${this.precio} COP, Categoria: ${this.categoria}`);

    }
}

class ProductoFisico extends Producto {
    constructor(nombre, precio, peso, categoria) {
        #precioFinal;
        super(nombre, precio, categoria);
        this.peso = peso;
        this.#precioFinal = null;
    }

    RecibirPrecio(precio) {
        if (precio >= 0) {
            this.#precioFinal = precio;
        } else {
            console.log("Precio inválido!!");
        }  
    }

    MostrarInformacion() {
        super.MostrarInformacion();
        console.log(`Peso: ${this.peso} kg Precio final: $${this.#precioFinal} COP`);
    }
    
   
}

class ProductoDigital extends Producto {
    constructor(nombre, precio, formato, categoria) {
        #precioFinal;
        super(nombre, precio, categoria);
        this.formato = formato;
        this.#precioFinal = null;
    }

    RecibirPrecio(precio) {
        if (precio >= 0) {
            this.#precioFinal = precio;
        } else {
            console.log("Precio inválido!!");
        }  
    }

    MostrarInformacion() {
        super.MostrarInformacion();
        console.log(`Formato: ${this.formato} Precio final: $${this.#precioFinal} COP`);
    }
}

// Creacion de objetos  
const producto1 = new ProductoFisico("Laptop", 3000000, 2.5, "Electrónica");
const producto2 = new ProductoDigital("E-book", 50000, "PDF", "Libros");
producto1.RecibirPrecio(2800000);
producto2.RecibirPrecio(45000);
console.log("---Información de productos---");
producto1.MostrarInformacion();
console.log("-----------------------------");
producto2.MostrarInformacion();

