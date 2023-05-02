# Practica - Fundamentos

Crear un programa que permita al usuario ingresar una matriz (matriz1) de números enteros (dni, edad y año_nacimiento), una matriz de strings (matriz2) (nombre(s), apellido(s) y genero) y una matriz de objetos (matriz3) (por ejemplo, objetos de la clase "Persona" que tengan atributos como nombre(s), apellido(s), edad, año_nacimiento, género, etc.). 

Las dos primeras matrices son el insumo para crear la tercera matriz de objetos “Persona”.

Todas las 3 matrices, tienen el mismo número de filas, número que es pedido al usuario.

Antes de entrar al menu, al usuario se le deberá pedir en número de filas y el número de columnas.

El programa deberá mostrar un Menu de opciones para el usuario, determinada por las siguientes opciones.

Definir una clase Persona, que tenga los atributos: dni, nombre(s), apellidos, genero, edad, año_nacimiento. A nivel de funciones:
●	crear el constructor default y el constructor con datos iniciales.
●	crear los setters/getters para cada uno de los atributos.
●	crear las funciones de negocio:
○	int[] getEdad_Anio() - retornar un arreglo de 3 posiciones con dni, edad y año.
○	String[] getNombre_Genero(
○	) - retornar un arreglo de 3 posiciones con dni, nombre-completo y género.






Definir una clase en Java llamada "MainMatrices":
 
1.	Dentro de la clase, definir tres métodos para cada tipo de matriz: un método llamado "leerMatrizNumeros" que lea una matriz de números enteros, un método llamado "leerMatrizStrings" que lea una matriz de strings, y un método llamado "cargarMatrizObjetos" que cree una matriz de objetos de la clase "Persona" con base en las matrices de números y strings.
a.	Dentro de cada método, utilizar iteración para recorrer las filas y columnas de la matriz y permitir que el usuario ingrese los valores correspondientes o llenar la matriz con números aleatorios. (la palabra Leer es llenar la matriz)
2.	Definir tres métodos adicionales para cada tipo de matriz: un método llamado "imprimirMatrizNumeros" que imprima la matriz de números enteros, un método llamado "imprimirMatrizStrings" que imprima la matriz de strings, y un método llamado "imprimirMatrizObjetos" que imprima la matriz de objetos de la clase "Persona".
a.	Dentro de cada método de impresión, utilizar iteración anidada para recorrer las filas y columnas de la matriz en orden inverso y mostrar los valores correspondientes en la consola.
3.	En el método principal de la clase "MainMatrices", llamar a cada uno de los métodos de lectura y asignar el resultado a una variable correspondiente (por ejemplo, una variable llamada "matrizNumeros" para la matriz de números enteros).
4.	Luego, llamar a cada uno de los métodos  de impresión y pasar la variable correspondiente como parámetro (por ejemplo, llamar al método "imprimirMatrizNumeros" y pasar la variable "matrizNumeros").
5.	Definir dos nuevos métodos nuevos para la matriz3 o MatrizObjetos:
a.	int[] buscarEdad_Anio(dni) - retornar un arreglo de 3 posiciones con dni, edad y año.
b.	String[] buscarNombre_Genero(dni) - retornar un arreglo de 3 posiciones con dni, nombre-completo y género.
6.	Dentro de la clase MainMatrices, defina un método llamado Menu, que permita leer las diferentes opciones, que se listarán a continuación del menu:

Opciones de Menú:

1.	Crear las matrices matriz1 y matriz2 con datos aleatorios o con constantes.
2.	Crear las matrices matriz1 y matriz2 con datos pedidos al usuario.
3.	Crear la matriz3 con base en las matrices matriz1 y matriz2, debe verificar que al menos se haya ejecutado una vez la opción 1 o la opción 2. Deberá crear objetos de la clase Persona e ingresarlos a la matriz3.
4.	Mostrar en pantalla la matriz de números enteros, la matriz de strings y la matriz de objetos en orden normal.
5.	Mostrar en pantalla la matriz de números enteros, la matriz de strings y la matriz de objetos en orden inverso.
6.	Para la matriz matriz1, permitir definir en la clase MainMatrices, nuevos métodos así:

Agregar un atributo a matriz1 que se llame: dni (documento de identificación nacional, ej: cédula, tarjeta de identidad, etc, para el caso de Colombia).

a.	int ordenarMatriz1porDNI1(matriz1) - utilizar SelectionSort - debe retornar el número de pasos que realiza para el ordenamiento.
b.	int ordenarMatriz1porDNI2(matriz1) - Utilizar BubbleSort - debe retornar el número de pasos que realiza para el ordenamiento.
c.	int ordenarMatriz1porDNI3(matriz) - Investigar y utilizar el QuickSort - debe retornar el número de pasos que realiza para el ordenamiento.
d.	String buscarNombrePorDNI(int dni) - Realizar la búsqueda en la matriz3 de objetos Personas.
e.	int[] buscarEdad_Anio(matriz1, dni) - Realizar una búsqueda binaria en la matriz2 por dni, y retornar un arreglo de 2 posiciones, con la edad y año.
f.	int ordenarMatriz1porEdad(matriz1) - utilizar SelectionSort - debe retornar el número de pasos que realiza para el ordenamiento.
g.	int ordenarMatriz1porAnio(matriz1) - Utilizar BubbleSort - debe retornar el número de pasos que realiza para el ordenamiento.

Nota: en este enunciado matriz1 es igual a matrizNumeros y matriz2 es igual a MatrizStrings y matriz3 es igual a MatrizObjetos, puede realizar la unificación de todos los nombres.
