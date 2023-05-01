import java.util.Scanner;
import java.util.Random;
public class main{
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
    static int getPos(int[] doneDNI, int dni, int y){
        int val = -1;
        for(int i=0;i<y;i++){
            if(doneDNI[i] == dni){
                val = i;
                break;
            }
        }
        return val;
    }
        public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        Random myRand = new Random();
        System.out.print("Ingrese cuantas filas desea en la matriz: ");
        int y = myScan.nextInt();
        int[][] matriz1 = new int[y][3];
        String[][] matriz2 = new String[y][3];
        Personas p[] = new Personas[y];
        int[] doneDNI = new int[y];
        int val1 = 0;
        int val2 = 0;
        int val3 = 0;
        int opc, val, dni;
        int edad = 0;
        String n = "";
        String a = "";
        String g = "";
        boolean exists = false;
        for(int i=0;i<y;i++){
            System.out.println("**Persona #"+(i+1)+"**");
            for(int j=0;j<3;j++){
                if(j==0){
                    matriz1[i][j] = myRand.nextInt(100);
                    System.out.println("La edad de la persona "+(i+1)+" es: "+matriz1[i][j]+".");
                    edad = matriz1[i][j];
                    matriz2[i][j] = setName();
                    System.out.println("El nombre de la persona "+(i+1)+" es: "+matriz2[i][j]+".");
                }
                else if (j==1){
                    matriz1[i][j] = 2023-edad;
                    System.out.println("El año de nacimiento de la persona "+(i+1)+" es: "+matriz1[i][j]+".");
                    matriz2[i][j] = setLastName();
                    System.out.println("El apellido de la persona "+(i+1)+" es: "+matriz2[i][j]+".");
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
                    System.out.println("El DNI de la persona "+(i+1)+" es: "+matriz1[i][j]+".");
                    matriz2[i][j] = setGender();
                    System.out.println("El genero de la persona "+(i+1)+" es: "+matriz2[i][j]+".");
                }
            }
        }
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
        while(true){
            System.out.println("**MENU**");
            System.out.println("1. Conocer edad y fecha de nacimiento.");
            System.out.println("2. Conocer nombre completo y genero.");
            System.out.println("3. Salir.");
            System.out.print("Ingrese un número: ");
            opc = myScan.nextInt();
            System.out.print("Ingrese el DNI de la persona: ");
            dni = myScan.nextInt();
            val = getPos(doneDNI, dni, y);
            if(val == (-1)){
                System.out.println("El DNI no existe. Ingrese uno nuevo.");
                continue;
            }
            switch(opc){
                case 1:
                    System.out.println("La fecha de nacimiento de la persona con DNI "+dni+" es: "+p[val].getAnio()+" y la edad es: "+p[val].getEdad()+".");
                    break;
                case 2:
                    System.out.println("El nombre completo de la persona con DNI "+dni+" es: "+p[val].getNombre()+" "+p[val].getApellido()+" y el genero es: "+p[val].getGenero()+".");
                    break;
                default:
                    System.out.print("Opción invalida, ingrese un número entre 1 y 2: ");
                    opc = myScan.nextInt();
                    continue;
            }
        }
    }
}