import java.util.Scanner;
import java.util.Random;
public class main{

        public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        Random myRand = new Random();
        System.out.print("Ingrese cuantas filas desea en la matriz: ");
        int y = myScan.nextInt();
        int[][] matriz1 = new int[y][3];
        String[][] matriz2 = new String[y][3];
        Personas p[] = new Personas[y];
        int opc, dni, edad;
        boolean exec = false, inv = false, execord = false;
        while(true){
            MainMatrices.getMenu();
            opc = myScan.nextInt();
            switch(opc){
                case 1:
                    matriz1 = MainMatrices.setMatrizNumerosAuto(y);
                    matriz2 = MainMatrices.setMatrizStringAuto(y);
                    exec = true;
                    System.out.println("Se han creado las matrices correctamente.");
                    break;
                case 2:
                    matriz1 = MainMatrices.setMatrizNumerosMan(y);
                    matriz2 = MainMatrices.setMatrizStringMan(y);
                    exec = true;
                    System.out.println("--");
                    System.out.println("Se han creado las matrices correctamente.");
                    break;
                case 3:
                    if(exec == true){
                        MainMatrices.cargarMatrizObjetos(p, matriz1, matriz2, y);
                        System.out.println("--");
                        System.out.println("Se han creado las matrices correctamente.");
                        break;
                    }
                    else{
                        System.out.println("Porfavor, llene la matrices primero. Seleccione una opción de llenado (1,2)");
                        opc = myScan.nextInt();
                        continue;
                    }
                case 4:
                    inv = false;
                    System.out.println("--");
                    System.out.println("Matriz 1");
                    MainMatrices.imprimirMatrizNumero(matriz1, y, inv);
                    System.out.println("--");
                    System.out.println("Matriz 2");
                    MainMatrices.imprimirMatrizString(matriz2, y, inv);
                    System.out.println("--");
                    System.out.println("Objetos Persona");
                    MainMatrices.imprimirMatrizObjetos(p, y, inv);
                    break;
                case 5:
                    inv = true;
                    System.out.println("--");
                    System.out.println("Matriz 1");
                    MainMatrices.imprimirMatrizNumero(matriz1, y, inv);
                    System.out.println("--");
                    System.out.println("Matriz 2");
                    MainMatrices.imprimirMatrizString(matriz2, y, inv);
                    System.out.println("--");
                    System.out.println("Objetos Persona");
                    MainMatrices.imprimirMatrizObjetos(p, y, inv);
                    break;
                case 6:
                    System.out.print("Ingrese un DNI: ");
                    dni = myScan.nextInt();
                    int[] resultint = MainMatrices.getEdadAnio(dni, y, p);
                    System.out.println("DNI - Edad - Año");
                    for(int i = 0;i<3;i++){
                        System.out.print(resultint[i]+" ");
                    }
                    System.out.println("");
                    break;
                case 7:
                    System.out.print("Ingrese un DNI: ");
                    dni = myScan.nextInt();
                    String[] resultstr = MainMatrices.getNombreGenero(dni, y, p);
                    System.out.println("DNI - Nombre Completo - Genero");
                    for(int i = 0;i<3;i++){
                        System.out.print(resultstr[i]+" ");
                    }
                    System.out.println("");
                    break;
                case 8:
                    MainMatrices.getMenuOrdenamiento();
                    opc = myScan.nextInt();
                    switch(opc){
                        case 1:
                            System.out.println("Pasos: "+MainMatrices.SSMatriz1DNI(matriz1, y));
                            execord = true;
                            break;
                        case 2:
                            System.out.println("Pasos: "+MainMatrices.BSMatriz1DNI(matriz1, y));
                            execord = true;
                            break;
                        case 3:
                            int[] pasos = {0};
                            int inicio = 1;
                            int fin = y-1;
                            matriz1[0][2] = 0;
                            MainMatrices.QSMatriz1DNI(matriz1, inicio, fin, pasos);
                            System.out.println("Pasos: "+pasos[0]);
                            execord = true;
                            break;
                        case 4:
                            System.out.print("Ingrese un DNI: ");
                            dni = myScan.nextInt();
                            if(execord == true){
                                String[] resultstrBS = MainMatrices.buscarNombre(p, y, dni, matriz1);
                                System.out.println("Nombre - Apellido");
                                System.out.print(resultstrBS[0]);
                                System.out.println("");
                                break;
                            }
                            else{
                                System.out.println("Porfavor, ordene la matrices primero. Seleccione una opción de ordenamiento (1,3)");
                                opc = myScan.nextInt();
                                continue;
                            }
                        case 5:
                            System.out.print("Ingrese un DNI: ");
                            dni = myScan.nextInt();
                            if(execord == true){
                                int[] resultintBS = MainMatrices.buscarEdadAnio(p, y, dni, matriz1);
                                System.out.println("Edad - Año");
                                for(int i = 0;i<2;i++){
                                    System.out.print(resultintBS[i]+" ");
                                }
                                System.out.println("");
                                break;
                            }
                            else{
                                System.out.println("Porfavor, ordene la matrices primero. Seleccione una opción de ordenamiento (1,3)");
                                opc = myScan.nextInt();
                                continue;
                            }
                        case 6:
                            System.out.println("Pasos: "+MainMatrices.SSMatriz1Edad(matriz1, y));
                            execord = true;
                            break;
                        case 7:
                            System.out.println("Pasos: "+MainMatrices.BSMatriz1Anio(matriz1, y));
                            execord = true;
                            break;
                    }
            }
        }
    }
}