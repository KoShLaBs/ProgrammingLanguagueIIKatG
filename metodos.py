from empleado import EmpleadoDeveloper, EmpleadoQA

empleados = []

def registrar_developer():
    print('\n💻 Registrar Developer.')
    while True:
        nombre = input('👤 Ingrese el nombre del developer: ').strip()
        if nombre:
            break
        print('⚠️ Nombre sin información, trate de nuevo.')
        
    while True:
        edad_input = input('🎂 Ingrese la edad del developer: ')
        if edad_input.isdigit() and int(edad_input) > 0:
            edad = int(edad_input)
            break
        print('⚠️ Edad no válida, trate de nuevo.')

    while True:
        identificacion = input('🆔 Ingrese la identificación del developer: ').strip()
        existe = any(emp.get__identificacion() == identificacion for emp in empleados)
        
        if identificacion and not existe:
            break
        elif existe:
            print('⚠️ Identificación ya registrada, trate de nuevo.')
        else:
            print('⚠️ Identificación vacía, trate de nuevo.')

    while True:
        tareas = input('📝 Ingrese las tareas (separadas por comas): ').strip()
        if tareas:
            lista_tareas = [t.strip() for t in tareas.split(',')]
            break
        print('⚠️ Debe ingresar al menos una tarea.')

    while True:
        lenguajes = input('💻 Ingrese los lenguajes (separados por comas): ').strip()
        if lenguajes:
            lista_lenguajes = [l.strip() for l in lenguajes.split(',')]
            break
        print('⚠️ Debe ingresar al menos un lenguaje.')

    nuevo_dev = EmpleadoDeveloper(nombre, edad, identificacion, 'Senior Developer')

    nuevo_dev.set_tareas_operativas(lista_tareas)
    nuevo_dev.set_lenguajes_programacion(lista_lenguajes)

    empleados.append(nuevo_dev)
    print(f'\n✅ Developer registrado con éxito: {nuevo_dev.get_nombre()}')

def registrar_qa():
    print('\n🧪 Registrar QA.')
    while True:
        nombre = input('👤 Ingrese el nombre del QA: ').strip()
        if nombre:
            break
        print('⚠️ Nombre sin información, trate de nuevo.')
    while True:
        edad_input = input('🎂 Ingrese la edad del QA: ')
        if edad_input.isdigit() and int(edad_input) > 0:
            edad = int(edad_input)
            break
        print('⚠️ Edad no válida, trate de nuevo.')
    while True:
        identificacion = input('🆔 Ingrese la identificación del QA: ').strip()
        existe = any(emp.get__identificacion() == identificacion for emp in empleados)
        
        if identificacion and not existe:
            break
        elif existe:
            print('⚠️ Identificación ya registrada, trate de nuevo.')
        else:
            print('⚠️ Identificación vacía, trate de nuevo.')

    while True:
        tareas = input('📝 Ingrese las tareas (separadas por comas): ').strip()
        if tareas:
            lista_tareas = [t.strip() for t in tareas.split(',')]
            break
        print('⚠️ Debe ingresar al menos una tarea.')

    while True:
        herramientas = input('🧰 Ingrese las herramientas de testing (separadas por comas): ').strip()
        if herramientas:
            lista_herramientas = [h.strip() for h in herramientas.split(',')]
            break
        print('⚠️ Debe ingresar al menos una herramienta.')

    nuevo_qa = EmpleadoQA(nombre, edad, identificacion, 'Senior QA')

    nuevo_qa.set_tareas_operativas(lista_tareas)
    nuevo_qa.set_herramientas_testing(lista_herramientas)

    empleados.append(nuevo_qa)
    print(f'\n✅ QA registrado con éxito: {nuevo_qa.get_nombre()}\n')

def mostrar_lista_empleados():
    print('\n📋 Lista de empleados.')
    for empleado in empleados:
        empleado.mostrar_informacion()

def modificar_datos_empleado():
    print('✏️ Modificar datos de un empleado.')
    while True:
        identificacion = input('🆔 Ingrese la identificación del empleado a modificar: ').strip()
        empleado_encontrado = next((emp for emp in empleados if emp.get__identificacion() == identificacion), None)
        
        if empleado_encontrado:
            print(f'\nEmpleado encontrado: {empleado_encontrado.get_nombre()}')
            nuevo_nombre = input('👤 Ingrese el nuevo nombre (deje vacío para no cambiar): ').strip()
            nuevo_edad_input = input('🎂 Ingrese la nueva edad (deje vacío para no cambiar): ').strip()
            nueva_tareas = input('📝 Ingrese las nuevas tareas (separadas por comas, deje vacío para no cambiar): ').strip()

            if nuevo_nombre:
                empleado_encontrado.set_nombre(nuevo_nombre)
            if nuevo_edad_input.isdigit() and int(nuevo_edad_input) > 0:
                empleado_encontrado.set_edad(int(nuevo_edad_input))
            if nueva_tareas:
                lista_tareas = [t.strip() for t in nueva_tareas.split(',')]
                empleado_encontrado.set_tareas_operativas(lista_tareas)

            print('\n✅ Datos del empleado actualizados con éxito.\n')
            break
        else:
            print('⚠️ Empleado no encontrado, trate de nuevo.')

def eliminar_empleado():
    print('\n🗑️ Eliminar un empleado.')
    while True:
        identificacion = input('🆔 Ingrese la identificación del empleado a eliminar: ').strip()
        empleado_encontrado = next((emp for emp in empleados if emp.get__identificacion() == identificacion), None)
        
        if empleado_encontrado:
            empleados.remove(empleado_encontrado)
            print(f'\n✅ Empleado eliminado con éxito: {empleado_encontrado.get_nombre()}\n')
            break
        else:
            print('⚠️ Empleado no encontrado, trate de nuevo.')