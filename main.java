public class main{
    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona p2 = new Persona("Pedro","Perez","Masculino",23,2001);
        p1.imprimir();
        p2.imprimir();
        p1.setNombre("Juan");
        p1.setApellido("Mejia");
        p1.setGenero("Masculino");
        p1.setEdad("19");
        p1.setAnio("2003");
        p1.imprimir();

        Persona[] arreglo_Personas = new Persona[2];
        arreglo_Personas[0]=p1;
        arreglo_Personas[1]=p2;
    }
}