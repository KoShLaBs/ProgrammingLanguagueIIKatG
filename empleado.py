# CLASE EMPLEADO - CLASES HIJAS
class Empleado:
    def __init__(self, nombre, edad, identificacion):
        self.__nombre = nombre
        self.__edad = edad
        self.__identificacion = identificacion
        
    ## Métodos getter y setter para la variable privada __identificacion    
    def set__identificacion(self, nueva_identificacion):
        self.__identificacion = nueva_identificacion  

    def set_nombre(self, nuevo_nombre):
        self.__nombre = nuevo_nombre

    def set_edad(self, nueva_edad):
        self.__edad = nueva_edad

    def get_nombre(self):
        return self.__nombre
    
    def get_edad(self):
        return self.__edad
    
    def get__identificacion(self):
        return self.__identificacion

    def mostrar_informacion(self):
        print(f"Nombre: {self.get_nombre()}")
        print(f"Edad: {self.get_edad()}")
        print(f"Identificación: {self.get__identificacion()}")

class EmpleadoDeveloper(Empleado):
    def __init__(self, nombre, edad, identificacion, cargo):
        super().__init__(nombre, edad, identificacion)
        self.cargo = cargo
        self.__tareas_operativas = []
        self.__lenguajes_programacion = []
    
    def get_tareas_operativas(self):
        return self.__tareas_operativas

    def get_lenguajes_programacion(self):
        return self.__lenguajes_programacion
    
    def set_tareas_operativas(self, nuevas_tareas):
        self.__tareas_operativas = nuevas_tareas

    def set_lenguajes_programacion(self, nuevos_lenguajes):
        self.__lenguajes_programacion = nuevos_lenguajes

    def mostrar_informacion(self):
        super().mostrar_informacion()
        print(f"Cargo: {self.cargo}")
        print(f"Tareas Operativas: {self.get_tareas_operativas()}")
        print(f"Lenguajes de Programación: {self.get_lenguajes_programacion()}\n")

class EmpleadoQA(Empleado):
    def __init__(self, nombre, edad, identificacion, cargo):
        super().__init__(nombre, edad, identificacion)
        self.cargo = cargo
        self.__tareas_operativas = []
        self.__herramientas_testing = []
    
    def get_tareas_operativas(self):
        return self.__tareas_operativas

    def get_herramientas_testing(self):
        return self.__herramientas_testing
    
    def set_tareas_operativas(self, nuevas_tareas):
        self.__tareas_operativas = nuevas_tareas

    def set_herramientas_testing(self, nuevas_herramientas):
        self.__herramientas_testing = nuevas_herramientas

    def mostrar_informacion(self):
        super().mostrar_informacion()
        print(f"Cargo: {self.cargo}")
        print(f"Tareas Operativas: {self.get_tareas_operativas()}")
        print(f"Herramientas de Testing: {self.get_herramientas_testing()}\n")