# Primitiva ESC --> print()
print("Hola a todos")
print("Hello, welcome!")

# Primita LEA --> depende del tipo de dato a leer
variable_1 = input("Hola digita cualquier cosa y presiona enter: ")
print(variable_1)

# type() --> Función para saber el tipo de dato almacenado
print(type(variable_1))

# Por lo pronto vamos a utilizar 3 tipos de datos
# en python --> int, float, str#

# variable tipo int --> números enteros
number_1 = 6551541
print("Este es el tipo de dato de la var 1:", type(number_1))
# variable tipo int --> números enteros
number_2 = 6551541
print("Este es el tipo de dato de la var 2:",
      type(number_2), "y el valor es: ", number_2)

# variable tipo float --> números float
number_3 = 6551541.554
print(
    f"Este es el tipo de dato de la var 3: {type(number_3)} y el valor es: {number_3} ")

# Ciclo while
i = 1
while i <= 10:
    print(f"El valor de i es: {i}")
    i = i + 1
    j = i
    while (j <= i + 2):
        print(f"El valor de j es: {j}")
        j = j + 1
