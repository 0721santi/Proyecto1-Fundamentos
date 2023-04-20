import java.util.Scanner;
public class main{
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.print("Ingrese cuantas filas desea en la matriz: ");
        int y = myScan.nextInt();
        int[][] matriz1 = new int[y][2];
        String[][] matriz2 = new String[y][3];
        Personas p[] = new Personas[y];
        int val1 = 0;
        int val2 = 0;
        String n = "";
        String a = "";
        String g = "";
        for(int i=0;i<y;i++){
            for(int j=0;j<2;j++){
                if(j==0){
                    System.out.print("Ingrese la edad de la persona "+(i+1)+": ");
                    matriz1[i][j] = myScan.nextInt();
                }
                else{
                    System.out.print("Ingrese el año de nacimiento de la persona "+(i+1)+": ");
                    matriz1[i][j] = myScan.nextInt();
                }
            }
        }
        for(int i=0;i<y;i++){
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
        for(int i=0;i<y;i++){
            for(int j=0;j<2;j++){
                if(j==0){
                    val1 = matriz1[i][j];
                }
                else{
                    val2 = matriz1[i][j];
                }
            }
            for(int j=0;j<3;j++){
                if(j==0){
                    n = matriz2[i][j];
                }
                else{
                    if(j==1){
                        a = matriz2[i][j];
                    }
                    else{
                        g = matriz2[i][j];
                    }
                }
            }
            p[i] = new Personas(n, a, g, val1, val2);
            System.out.println(p[i].getApellido());
        }
    }
}