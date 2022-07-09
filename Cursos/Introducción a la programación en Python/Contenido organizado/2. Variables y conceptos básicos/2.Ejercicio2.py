nombre_1 = "Hola mundo"
nombre_2 = "Escribe algo "

nombre_3 = nombre_1 + nombre_2
print(nombre_3)
print("Esta variable es de tipo: ")
print(type(nombre_3))

'''
Respondiendo las preguntas:

-¿Que paso? 
Se imprimió en pantalla el nombre_3 y su tipo de dato.

-¿Por qué pasó?
Porque se concatenaron las primeras dos variables y con la función type se pudo saber que era una variable string.
Se imprimió sin espacios porque no se concateno un espacio, así quedaría mejor: nombre_3 = nombre_1 + " " + nombre_2
'''