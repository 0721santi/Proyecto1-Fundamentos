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
        int opc, val;
        String n = "";
        String a = "";
        String g = "";
        for(int i=0;i<y;i++){
            System.out.println("**Persona #"+(i+1)+"**");
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
        }
        while(true){
            System.out.println("**MENU**");
            System.out.println("1. Visualizar datos.");
            System.out.println("2. Editar datos.");
            System.out.println("3. Agregar persona.");
            System.out.println("4. Salir.");
            System.out.print("Ingrese un número: ");
            opc = myScan.nextInt();
            switch(opc){
                case 1:
                    System.out.println("**MENU DE VISUALIZACIÓN**");
                    System.out.println("1. Ver género.");
                    System.out.println("2. Ver edad.");
                    System.out.println("3. Ver año de nacimiento.");
                    System.out.println("4. Ver todos los datos:");
                    System.out.print("Ingrese un número: ");
                    opc = myScan.nextInt();
                    System.out.print("Ingrese el índice de la persona (1, "+y+"): ");
                    val = (myScan.nextInt() - 1);
                    switch(opc){
                        case 1:
                            System.out.println("La persona "+(val+1)+" es: "+p[val].getNombre()+" "+p[val].getApellido()+" y es: "+p[val].getGenero()+".");
                            break;
                        case 2:
                            System.out.println("La persona "+(val+1)+" es: "+p[val].getNombre()+" "+p[val].getApellido()+" y tiene: "+p[val].getEdad()+".");
                            break;
                        case 3:
                            System.out.println("La persona "+(val+1)+" es: "+p[val].getNombre()+" "+p[val].getApellido()+" y nació en el año: "+p[val].getAnio()+".");
                            break;
                        case 4:
                            System.out.println("La persona "+(val+1)+" es: "+p[val].getNombre()+" "+p[val].getApellido()+". Es: "+p[val].getGenero()+", nació en el año: "+p[val].getAnio()+" y tiene: "+p[val].getEdad()+".");
                            break;
                        default:
                            System.out.print("Valor inválido. Ingrese un valor de los que hay en el menu: ");
                            opc = myScan.nextInt();
                            continue;
                    }
                    break;
            }
        }
    }
}