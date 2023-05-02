import java.util.Scanner;
import java.util.Random;
public class MainMatrices {
    static String setName(){
        Random myRand = new Random();
        int num = myRand.nextInt(14);
        String[] nom = {"Santiago","Samuel","Salomé","Sofia","Mateo","Felipe","Sara","Jose","Maria","Camila","Camilo","Juan","Edwin","Tatiana"};
        String r = nom[num];
        return r;
    }
    static String setLastName(){
        Random myRand = new Random();
        int num = myRand.nextInt(14);
        String[] ape = {"Idarraga","Villa","Ceballos","Valencia","Berrio","Munera","Garcia","Carreno","Usma","Montoya","Vallejo","Martinez","Acevedo","Marin"};
        String r = ape[num];
        return r;
    }
    static String setGender(){
        Random myRand = new Random();
        int num = myRand.nextInt(2);
        String[] mf = {"(F) Femenino","(M) Masculino"};
        String r = mf[num];
        return r;
    }
    static int getPos(Personas p[], int dni, int y){
        int val = -1;
        for(int i=0;i<y;i++){
            if(p[i].getDni()== dni){
                val = i;
                break;
            }
        }
        return val;
    }
    static void getMenu(){
        System.out.println("**MENU**");
        System.out.println("1. Crear matrices con datos aleatorios.");
        System.out.println("2. Crear matrices con datos entrad por el usuario.");
        System.out.println("3. Generar matriz de objetos 'Persona'.");
        System.out.println("4. Mostrar matrices.");
        System.out.println("5. Mostrar matrices inversas.");
        System.out.println("6. Conocer edad y fecha de nacimiento.");
        System.out.println("7. Conocer nombre completo y genero.");
        System.out.println("8. Menú de ordenamiento y búsqueda.");
        System.out.println("9. Salir.");
        System.out.print("Ingrese un número: ");
    }
    static void getMenuOrdenamiento(){
        System.out.println("**MENU DE ORDENAMIENTO Y BUSQUEDA**");
        System.out.println("1. Ordenar matriz por DNIs y SelectionSort.");
        System.out.println("2. Ordenar matriz por DNIs y BubbleSort.");
        System.out.println("3. Ordenar matriz por DNIs y QuickSort.");
        System.out.println("4. Busqueda del nombre según DNIs.");
        System.out.println("5. Busqueda de edad y año por DNIs.");
        System.out.println("6. Ordenar matriz por edad y SelectionSort");
        System.out.println("7. Ordenar matriz por año y BubbleSort");
        System.out.print("Ingrese un número: ");
    }
    static int[][] setMatrizNumerosAuto(int y){
        Random myRand = new Random();
        int[][] matriz1 = new int[y][3];
        int edad = 0;
        int[] doneDNI = new int[y];
        for(int i=0;i<y;i++){
            for(int j=0;j<3;j++){
                if(j==0){
                    matriz1[i][j] = myRand.nextInt(100);
                    edad = matriz1[i][j];
                }
                else if (j==1){
                    matriz1[i][j] = 2023-edad;
                }
                else if (j==2){
                    matriz1[i][j] = myRand.nextInt(y*2);
                    int z = 0;
                    while(z<y){
                        if(matriz1[i][j] == doneDNI[z]){
                            matriz1[i][j] = myRand.nextInt(y*2);
                            z = 0;
                        }
                        else{
                            z++;
                        }
                    }
                    doneDNI[i] = matriz1[i][j];
                }
            }
        }
        return matriz1;
    }
    static String[][] setMatrizStringAuto(int y){
        String[][] matriz2 = new String[y][3];
        for(int i=0;i<y;i++){
            for(int j=0;j<3;j++){
                if(j==0){
                    matriz2[i][j] = setName();
                }
                else if (j==1){
                    matriz2[i][j] = setLastName();
                }
                else if (j==2){
                    matriz2[i][j] = setGender();
                }
            }
        }
        return matriz2;
    }
    static int[][] setMatrizNumerosMan(int y){
        Scanner myScan = new Scanner(System.in);
        int[][] matriz1 = new int[y][3];
        for(int i=0;i<y;i++){
            System.out.println("**Persona #"+(i+1)+"**");
            for(int j=0;j<2;j++){
                if(j==0){
                    System.out.print("Ingrese la edad de la persona "+(i+1)+": ");
                    matriz1[i][j] = myScan.nextInt();
                }
                else if (j==1){
                    System.out.print("Ingrese el año de nacimiento de la persona "+(i+1)+": ");
                    matriz1[i][j] = myScan.nextInt();
                }
                else if (j==2){
                    System.out.print("Ingrese el dni de la persona "+(i+1)+": ");
                    matriz1[i][j] = myScan.nextInt(); 
                }
            }
        }
        return matriz1;
    }
    static String[][] setMatrizStringMan(int y){
        Scanner myScan = new Scanner(System.in);
        String[][] matriz2 = new String[y][3];
        for(int i=0;i<y;i++){
            System.out.println("**Persona #"+(i+1)+"**");
            for(int j=0;j<3;j++){
                if(j==0){
                    System.out.print("Ingrese el nombre de la persona "+(i+1)+": ");
                    matriz2[i][j] = myScan.next();
                }
                else{
                    if(j==1){
                        System.out.print("Ingrese el apellido de la persona "+(i+1)+": ");
                        matriz2[i][j] = myScan.next();
                    }
                    else{
                        System.out.print("Ingrese el genero de la persona "+(i+1)+": ");
                        matriz2[i][j] = myScan.next();
                    }
                }
            }
        }
        return matriz2;
    }
    static void cargarMatrizObjetos(Personas p[], int[][] matriz1, String[][] matriz2 , int y){
        int val1 = 0, val2 = 0, val3 = 0;
        String n = "",a = "",g = "";
        for(int i=0;i<y;i++){
            for(int j=0;j<3;j++){
                if(j==0){
                    val1 = matriz1[i][j];
                    n = matriz2[i][j];
                }
                else if (j == 1){
                    val2 = matriz1[i][j];
                    a = matriz2[i][j];
                }
                else if (j == 2){
                    val3 = matriz1[i][j];
                    g = matriz2[i][j];
                }
            }
            p[i] = new Personas(n, a, g, val1, val2, val3);
        }
    }
    static void imprimirMatrizNumero(int[][] matriz1, int y, boolean inv){
        if(inv == false){
            System.out.println("Edad - Año - DNI");
            for(int i=0;i<y;i++){
                for(int j=0;j<3;j++){
                    System.out.print(matriz1[i][j]+" ");
                }
                System.out.println("");
            }
        }
        else{
            System.out.println("DNI - Año - Edad");
            for(int i=(y-1);i>=0;i--){
                for(int j=2;j>=0;j--){
                    System.out.print(matriz1[i][j]+" ");
                }
                System.out.println("");
            }
        }
        
    }
    static void imprimirMatrizString(String[][] matriz2, int y, boolean inv){
        if(inv == false){
            System.out.println("Nombre - Apellido - Genero");
            for(int i=0;i<y;i++){
                for(int j=0;j<3;j++){
                    System.out.print(matriz2[i][j]+" ");
                }
                System.out.println("");
            }
        }
        else{
            System.out.println("Genero - Apellido - Nombre");
            for(int i=(y-1);i>=0;i--){
                for(int j=2;j>=0;j--){
                    System.out.print(matriz2[i][j]+" ");
                }
                System.out.println("");
            }
        }
    }
    static void imprimirMatrizObjetos(Personas p[], int y, boolean inv){
        if(inv == false){
            for(int i=0;i<y;i++){
                System.out.println("Nombre completo: "+p[i].getNombre()+" "+p[i].getApellido()+". Genero: "+p[i].getGenero()+". Edad: "+p[i].getEdad()+". Año de nacimiento: "+p[i].getAnio()+". DNI: "+p[i].getDni());
            }
        }
        else{
            for(int i=(y-1);i>=0;i--){
                System.out.println("Nombre completo: "+p[i].getNombre()+" "+p[i].getApellido()+". Genero: "+p[i].getGenero()+". Edad: "+p[i].getEdad()+". Año de nacimiento: "+p[i].getAnio()+". DNI: "+p[i].getDni());
            }
        }       
    }
    static int[] getEdadAnio(int dni , int y, Personas p[]){
        Scanner myScan = new Scanner(System.in);
        int val = 0;
        while(true){
            val = getPos(p, dni, y);
            if(val == (-1)){
                System.out.println("El DNI no existe. Ingrese uno nuevo.");
                dni = myScan.nextInt();
                continue;
            }
            break;
        }
        int[] result = {p[val].getDni(), p[val].getEdad(), p[val].getAnio()};
        return result;
    }
    static String[] getNombreGenero(int dni, int y, Personas p[]){
        Scanner myScan = new Scanner(System.in);
        int val = 0;
        while(true){
            val = getPos(p, dni, y);
            if(val == (-1)){
                System.out.println("El DNI no existe. Ingrese uno nuevo.");
                dni = myScan.nextInt();
                continue;
            }
            break;
        }
        String[] result = {Integer.toString(p[val].getDni()), p[val].getNombre()+" "+p[val].getApellido(), p[val].getGenero()};
        return result;
    }
    static void swap(int[][] matriz1, int i, int j){
        for(int k=0;k<3;k++){
            int temp = matriz1[i][k];
            matriz1[i][k] = matriz1[j][k];
            matriz1[j][k] = temp;
        }
    }
    static int SSMatriz1DNI(int[][] matriz1, int y){
        //Selection Sort Matriz 1 por DNI
        int pasos = 0;
        for(int i = 0;i<y-1;i++){
            int minpos = i;
            for(int j=i+1;j<y;j++){
                pasos++;
                if(matriz1[j][2]<matriz1[minpos][2]){
                    minpos = j;
                }
            }
            swap(matriz1, minpos, i);
        }
        return pasos;
    }
    static int BSMatriz1DNI(int[][] matriz1, int y){
        int pasos = 0;
        boolean swapped;
        for(int i=0;i<y-1;i++){
            swapped = false;
            for(int j=0;j<((y-i)-1);j++){
                pasos++;
                if(matriz1[j][2]>matriz1[j+1][2]){
                    swap(matriz1,j,j+1);
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
        return pasos;
    }
    static void QSMatriz1DNI(int[][] matriz1, int inicio, int fin, int[] pasos){
        if(inicio < fin){
            int pivot = partition(matriz1, inicio, fin, pasos);
            QSMatriz1DNI(matriz1, inicio, pivot-1,pasos);
            QSMatriz1DNI(matriz1, pivot+1, fin, pasos);
        }
    }
    static int partition(int[][] matriz1, int inicio, int fin, int[] pasos){
        int pivot = matriz1[fin][2];
        int i = inicio - 1;
        for(int j=inicio;j<fin;j++){
            if(matriz1[j][2]<pivot){
                i++;
                swap(matriz1,i,j);
                pasos[0]++;
            }
        }
        swap(matriz1,i+1,fin);
        pasos[0]++;
        return i+1;
    }
}