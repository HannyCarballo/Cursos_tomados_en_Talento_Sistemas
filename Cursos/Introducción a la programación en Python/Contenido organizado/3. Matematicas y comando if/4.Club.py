# Programa que determina si se puede entrar a un club para mayores de edad y menores de 50 años
# En el club no se permiten mascotas

edad = int(input("Ingresa tu edad, porfavor\n"))
usuario = input("Hombre, Mujer o Mascota\n")
if (edad>=18 and edad<50)and(usuario=="Hombre" or usuario=="Mujer"):
    print("\nPuedes pasar")

else:
    print("\nNo puedes pasar")