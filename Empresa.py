#Clase Padre
class Empleado:
    def __init__(self, nombre, edad, identificacion):
        self.nombre = nombre
        self.edad = edad
        self.__identificacion = identificacion
        
    ## Métodos getter y setter para la variable privada __identificacion    
    def set__identificacion(self, nueva_identificacion):
        self.__identificacion = nueva_identificacion  
    
    def get__identificacion(self):
        return self.__identificacion

    def mostrar_informacion(self):
        print(f"Nombre: {self.nombre}")
        print(f"Edad: {self.edad}")
        print(f"Identificación: {self.get__identificacion()}")
        
#Clases Hijas
class EmpleadoAdministrativo(Empleado):
    def __init__(self, nombre, edad, identificacion, departamento):
        super().__init__(nombre, edad, identificacion)
        self.departamento = departamento
        self.__tareas_administrativas = []
        
    def get_tareas_administrativas(self):
        return self.__tareas_administrativas
    
    def set_tareas_administrativas(self, nuevas_tareas):
        self.__tareas_administrativas = nuevas_tareas
        
    def mostrar_informacion(self):
        super().mostrar_informacion()    
        print (f"Departamento: {self.departamento}")    
        print(f"Tareas Administrativas: {self.get_tareas_administrativas()}")        
        
class EmpleadoOperativo(Empleado):
    def __init__(self, nombre, edad, identificacion, puesto):
        super().__init__(nombre, edad, identificacion)
        self.puesto = puesto
        self.__tareas_operativas = []
    
    def get_tareas_operativas(self):
        return self.__tareas_operativas
    
    def set_tareas_operativas(self, nuevas_tareas):
        self.__tareas_operativas = nuevas_tareas

    def mostrar_informacion(self):
        super().mostrar_informacion()
        print(f"Puesto: {self.puesto}")
        print(f"Tareas Operativas: {self.get_tareas_operativas()}")
        
#Main
print("EMPRESA KAT")

print("Lista de Empleados:\n")
empleado1 = EmpleadoAdministrativo("Juan Perez", 35, "12345678", "Recursos Humanos")
empleado1.set_tareas_administrativas(["Gestionar nóminas", "Organizar eventos"])
empleado1.mostrar_informacion()
print("\n")
empleado2 = EmpleadoOperativo("Maria Lopez", 28, "87654321", "Producción")
empleado2.set_tareas_operativas(["Operar maquinaria", "Realizar mantenimiento"])
empleado2.mostrar_informacion()

switch = input("\n¿Desea modificar la tarea de algún empleado? (s/n): ")
if switch.lower() == 's':
    empleado_modificar = input("¿Qué empleado desea modificar? (1 para Juan Perez, 2 para Maria Lopez): ")
    if empleado_modificar == '1':
        nuevas_tareas = input("Ingrese las nuevas tareas administrativas (separadas por comas): ").split(",")
        empleado1.set_tareas_administrativas(nuevas_tareas)
        print("\nInformación actualizada de Juan Perez:")
        empleado1.mostrar_informacion()
    elif empleado_modificar == '2':
        nuevas_tareas = input("Ingrese las nuevas tareas operativas (separadas por comas): ").split(",")
        empleado2.set_tareas_operativas(nuevas_tareas)
        print("\nInformación actualizada de Maria Lopez:")
        empleado2.mostrar_informacion()
    else:
        print("Opción no válida.")
else:
    print("No se realizaron modificaciones.")
