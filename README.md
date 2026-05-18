#Actividad 7


Actividad de Lenguaje de programación II, de la carrera de ingeniería de software, tercer semestre. 



## 📘 Información del Proyecto

- **Autor:** Katherynn Gomez, Daniel Mahecha, Maria Paula Ramirez 
- **GitHub:** [@KoShLaBs](https://github.com/KoShLaBs)
- **Profesor:** Ing. Johan Manuel Gordillo Mesa
- **Materia:** Lenguaje de Programación II
- **Fecha:** 17 de mayo de 2026
- **Repositorio:** [ProgrammingLanguageIIKatG]  
- **Rama actual:** `actividad7` 

## ✅ Objetivo

# Ejercicios de Programación Orientada a Objetos (POO)

Este repositorio contiene una colección de problemas prácticos diseñados para dominar los pilares fundamentales de la **Programación Orientada a Objetos (POO)**: *Abstracción, Encapsulamiento, Herencia y Polimorfismo*. 

A continuación, se describen los sistemas solicitados junto con sus requerimientos y reglas de negocio.

---

## 📋 Índice de Proyectos

1. [Sistema de Notas Escolares](#1-sistema-de-notas-escolares)
2. [Sistema de Productos de una Tienda](#2-sistema-de-productos-de-una-tienda)
3. [Sistema de Empleados de una Empresa](#3-sistema-de-empleados-de-una-empresa)
4. [Sistema de Cuentas Bancarias](#4-sistema-de-cuentas-bancarias)
5. [Sistema de Mascotas Veterinarias](#5-sistema-de-mascotas-veterinarias)

---

## 1. Sistema de Notas Escolares
**Objetivo:** Modelar la interacción entre diferentes actores del entorno educativo aplicando herencia y encapsulamiento estricto.

*   **Estructura de Clases:**
    *   `Persona` (Clase Padre)
    *   `Docente` (Clase Hija)
    *   `Estudiante` (Clase Hija)
*   **Lógica de Negocio:**
    *   El `Docente` tiene la facultad de asignar calificaciones.
    *   El `Estudiante` almacena su nota de forma **encapsulada** (atributos privados con métodos de acceso).
*   **Reglas de Validación:**
    *   📉 `0` a `2.9` $\rightarrow$ **Reprobado**
    *   📈 `3.0` a `5.0` $\rightarrow$ **Aprobado**
    *   ❌ Valores fuera de este rango $\rightarrow$ Retornar un mensaje de **Error**.

---

## 2. Sistema de Productos de una Tienda
**Objetivo:** Gestionar un inventario diversificado aplicando polimorfismo para el cálculo de precios finales.

*   **Estructura de Clases:**
    *   `Producto` (Clase Padre)
    *   `ProductoFisico` (Clase Hija)
    *   `ProductoDigital` (Clase Hija)
*   **Componentes:**
    *   Atributos comunes: `nombre`, `precio` y `categoría`.
*   **Reglas de Validación y Lógica:**
    *   El `precio` base debe estar **encapsulado**.
    *   Solo se admiten valores estrictamente **mayores a 0**.
    *   Cada clase hija debe implementar su propio método para **calcular el precio final** y mostrar la información detallada.

---

## 3. Sistema de Empleados de una Empresa
**Objetivo:** Administrar la nómina de una organización controlando los flujos de pago según el tipo de contratación.

*   **Estructura de Clases:**
    *   `Empleado` (Clase Padre)
    *   `EmpleadoTiempoCompleto` (Clase Hija)
    *   `EmpleadoPorHoras` (Clase Hija)
*   **Componentes:**
    *   Atributos comunes: `nombre`, `edad` y `salario`.
*   **Reglas de Validación y Lógica:**
    *   El `salario` base o el valor por hora debe estar **encapsulado**.
    *   **Validación:** No se permiten salarios ni valores negativos.
    *   El sistema debe imprimir los datos de perfil y **calcular el pago mensual** de manera polimórfica (Sueldo fijo vs. Horas trabajadas $\times$ Tarifa).

---

## 4. Sistema de Cuentas Bancarias
**Objetivo:** Proteger la integridad de los datos financieros simulando transacciones bancarias seguras.

*   **Estructura de Clases:**
    *   `Persona` (Clase Padre)
    *   `Cliente` (Clase Hija)
*   **Componentes:**
    *   El `Cliente` posee una cuenta asociada con un `saldo` **encapsulado**.
*   **Operaciones del Sistema:**
    *   💰 **Depositar:** Incrementa el saldo disponible.
    *   💸 **Retirar:** Disminuye el saldo disponible.
    *   📊 **Mostrar Saldo:** Consulta segura del estado de cuenta.
*   **Reglas de Validación:**
    *   ⚠️ **Control de Fondos:** Se debe denegar cualquier intento de retiro que supere el saldo actual disponible (Evitar saldos negativos).

---

## 5. Sistema de Mascotas Veterinarias
**Objetivo:** Demostrar el uso del polimorfismo dinámico mediante la simulación de comportamientos animales.

*   **Estructura de Clases:**
    *   `Animal` (Clase Padre)
    *   `Perro` (Clase Hija)
    *   `Gato` (Clase Hija)
*   **Componentes:**
    *   Atributos comunes: `nombre`, `edad` y `peso`.
*   **Reglas de Validación y Lógica:**
    *   El `peso` debe estar **encapsulado** y se debe validar que sea estrictamente **mayor a 0**.
    *   **Polimorfismo:** Cada clase hija debe sobreescribir el método `hacerSonido()`. El perro debe ladrar (`"Guau!"`) y el gato debe maullar (`"Miau!"`).

---
