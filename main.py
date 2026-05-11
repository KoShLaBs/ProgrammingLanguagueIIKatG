from menu import mostrar_menu
from metodos import registrar_developer, registrar_qa, mostrar_lista_empleados, modificar_datos_empleado, eliminar_empleado

print(mostrar_menu())

opcion = input('Seleccione una opción: ')

while opcion != '0':
    if opcion == '1':
        registrar_developer()
    elif opcion == '2':
        registrar_qa()
    elif opcion == '3':
        mostrar_lista_empleados()
    elif opcion == '4':
        modificar_datos_empleado()
    elif opcion == '5':
        eliminar_empleado()
    else:
        print('Opción no válida, trate de nuevo.')
    
    print(mostrar_menu())
    opcion = input('Seleccione una opción: ')