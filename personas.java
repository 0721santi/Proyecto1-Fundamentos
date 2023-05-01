public class Personas{
    private String nombre, apellido, genero;
    private int edad, anio, dni;
    
    //Constructor DEF
    Personas(){
       nombre = "" ;
       apellido = "";
       genero = "";
       edad = 0;
       anio = 0;
       dni = 0;
    }
    
    //Constructor
    Personas(String nombre, String apellido, String genero, int edad, int anio, int dni){
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.edad = edad;
        this.anio = anio;
        this.dni = dni;
    }
    
    //Setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setAnio(int anio){
        this.anio = anio;
    }
    public void setDni(int dni){
        this.dni = dni;
    }

    //Getters
    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public String getGenero(){
        return this.genero;
    }
    public int getEdad(){
        return this.edad;
    }
    public int getAnio(){
        return this.anio;
    }
    public int getDni(){
        return this.dni;
    }
}