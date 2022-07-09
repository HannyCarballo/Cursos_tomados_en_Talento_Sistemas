'''
Suponienndo que la fecha es 7 de febrero del 2020
si naciste abajo del 2001 (19 años) eres mayor de edad y 
si naciste del 2003 (17 años)para arriba eres menor 
'''

# Sin considerar otras condiciones y suponiendo que el usuario si pondrá bien la fecha, el programa quedaría así:
año = input("Ingresa tu año de nacimiento\n")
mes = input("Ingresa tu mes de nacimiento(en número)\n")
dia = input("Ingresa tu día de nacimiento\n")

if (año<="2001" and mes>="1" and mes<="12" and dia>="1" and dia<="31") or (año=="2002" and mes>="1" and mes<="2" and dia>="1" and dia<="7"):
    print("Mayor de edad")
else:
    print("Menor de edad")