# Practica - Fundamentos

Crear un programa que permita al usuario ingresar una matriz (matriz1) de números enteros (edad y año_nacimiento), una matriz de strings (matriz2) (nombre(s), apellido(s) y genero) y una matriz de objetos (matriz3) (por ejemplo, objetos de la clase "Persona" que tengan atributos como nombre(s), apellido(s), edad, año_nacimiento, género, etc.). 

Las dos primeras matrices son el insumo para crear la tercera matriz de objetos “Persona”.

Todas las 3 matrices, tienen el mismo número de filas, número que son pedidos al usuario.

El programa deberá mostrar en Menu de opciones para el usuario, determinada por las siguientes opciones.

Antes de entrar al menu, al usuario se le deberá pedir en número de filas y el número de columnas.

Definir una clase Persona, que tenga los atributos: nombre(s), apellidos, genero, edad, año_nacimiento. A nivel de funciones:
crear el constructor default y el constructor con datos iniciales.
crear los setters/getters para cada uno de los atributos.
crear las funciones de negocio:
f1 (a definir)
f2 (a definir)
f3 (a definir)





Definir una clase en Java llamada "MatricesInversas":

Dentro de la clase, definir tres métodos para cada tipo de matriz: un método llamado "leerMatrizNumeros" que lea una matriz de números enteros, un método llamado "leerMatrizStrings" que lea una matriz de strings, y un método llamado "cargarMatrizObjetos" que cree una matriz de objetos de la clase "Persona" con base en las matrices de números y strings.
Dentro de cada método, utilizar iteración para recorrer las filas y columnas de la matriz y permitir que el usuario ingrese los valores correspondientes.
Definir tres métodos adicionales para cada tipo de matriz: un método llamado "imprimirMatrizNumeros" que imprima la matriz de números enteros, un método llamado "imprimirMatrizStrings" que imprima la matriz de strings, y un método llamado "imprimirMatrizObjetos" que imprima la matriz de objetos de la clase "Persona".
Dentro de cada método de impresión, utilizar iteración anidada para recorrer las filas y columnas de la matriz en orden inverso y mostrar los valores correspondientes en la consola.
En el método principal de la clase "MatricesInversas", llamar a cada uno de los métodos de lectura y asignar el resultado a una variable correspondiente (por ejemplo, una variable llamada "matrizNumeros" para la matriz de números enteros).
Luego, llamar a cada uno de los métodos de impresión y pasar la variable correspondiente como parámetro (por ejemplo, llamar al método "imprimirMatrizNumeros" y pasar la variable "matrizNumeros").

Luego se desplegará este menú:

Opciones de Menú:

Crear las matrices matriz1 y matriz2 con datos aleatorios o con constantes.
Crear las matrices matriz1 y matriz2 con datos pedidos al usuario.
Crear la matriz3 con base en las matrices matriz1 y matriz2, debe verificar que al menos se haya ejecutado una vez la opción 1 o la opción 2. Deberá crear objetos de la clase Persona e ingresarlos a la matriz3.
Mostrar en pantalla la matriz de números enteros, la matriz de strings y la matriz de objetos en orden normal.
Mostrar en pantalla la matriz de números enteros, la matriz de strings y la matriz de objetos en orden inverso.
