package Logica;
//Creando clase alumno
public class Alumno {
    
    int Id;
    String Nombre;
    String Apellido;
    
    //Metodo Constructores y Objetos (alt+ins)
    public Alumno(int Id, String Nombre, String Apellido) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
    }

    public Alumno() {
    }
    //Getters and Setters (Traer Colocar)

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
    
    
    //Creando un Método mostrarNombre y saberAprobado
//    public void mostrarNombre(){
//        System.out.println("Hola, soy un alumno y sé decir mi nombre");
//    }
//            public void saberAprobado(double calificacion){
//            if(calificacion <=6){
//                System.out.println("Aprobé la materia");
//            }else{
//                System.out.println("Uuuyyy No aprobé");}
//            }
}
