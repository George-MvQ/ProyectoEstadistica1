from os import system
import math
#variables
variableX=[]
variablefx=[]
tamañoDatos=0
esperanzaMat=0
varianza=0
#variables para el menu
comprovacion = True
opcion=0

#mensaje error
def MensajeError(Mensaje):

    if Mensaje=="":
        print("\t-----------------------")
        print("\tError al elejir opcion \n\tVuelava a intentar")
        print("\t-----------------------")
        system("\tpause")
    else:
        print("\t-----------------------")
        print( "\t"+Mensaje,"\n\tVuelava a intentar")
        print("\t-----------------------")
        system("\tpause")

# funcion pedir datos
def pedirDatos():
    global variableX
    global variablefx1
    global tamañoDatos

    '''ingreso de datos'''

    tamañoDatos = int(input("\tIngrese el tamaño de datos: "))
    system("cls")
    print("\tdatos de la variable x")
    print("\t----------------------------\n")
    for i in range(tamañoDatos):
        variableX.append(float(input(f"\tdato X {i + 1}: ")))

    system("cls")

    print("\tdatos de f(x)")
    print("\t----------------------------\n")
    for j in range(tamañoDatos):
        variablefx.append(float(input(f"\tdato f(x) {j+1}: ")))
    system("cls")

#funcion esperanza matematica
def funEsperanzaMat():
    total=0
    global esperanzaMat
    for k in range(tamañoDatos):
        total = total+(variableX[k]*variablefx[k])
    esperanzaMat = total

#funcion varianza
def funVarianza():
    potenciVarX=[]

    sumatoria=0
    global varianza
    global esperanzaMat

    for i in range(tamañoDatos):
       potenciVarX.append(variableX[i]**2)

    for i in range(tamañoDatos):
        sumatoria=sumatoria+(potenciVarX[i]*variablefx[i])

    Total=sumatoria-(esperanzaMat**2)

    varianza=Total
    potenciVarX.clear()

def mostrarResultado():
    print("\n\t--------------------------------------------------")
    print(f"\tla esperanza matematica es: {esperanzaMat}")
    print("\t--------------------------------------------------\n\n")

    print("\n\t--------------------------------------------------")
    print(f"\tla esperanza varianza es: {varianza}")
    print("\t--------------------------------------------------\n\n")



    print("\n\t--------------------------------------------------")
    print(f"\tla desviacion estadar es: {math.sqrt(varianza)}")
    print("\t--------------------------------------------------\n")

    system("pause")

#menu
while comprovacion == True:
    system("cls")
    print("\teliga una opcion: ")
    print("\t----------------------------")
    print("\t1. ingrear datos y calcular ")
    print("\t2. ver datos ingresados ")
    print("\t3. salir del programa")
    try:
     opcion = int(input("\t"))
    except:
        system("cls")
        MensajeError("Seleccion incorrecta")

    if opcion == 1:
        system("cls")
        variableX.clear()
        variablefx.clear()
        tamañoDatos = 0
        esperanzaMat = 0
        varianza = 0



        # ingreso de datos
        try:
            pedirDatos()
            funEsperanzaMat()
            funVarianza()
            mostrarResultado()
        except:
            MensajeError("")

    elif opcion == 2:
        system("cls")
        print("\tlos datos ingresados son:")
        print("\t-------------------------------\n")

        print(f"\tdatos ingresados en X {variableX} ")
        print(f"\tdatos ingresado en fx {variablefx}\n")
        mostrarResultado()

    elif opcion == 3:
        system("cls")
        comprovacion=False

    else:
        print("opcion incorrecta vuelva a intentar")

print("\nfin del programa :)")
system("pause")