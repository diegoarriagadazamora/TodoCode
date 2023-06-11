package Logica;

public class POO {

    public static void main(String[] args) {

        Alumno alu1 = new Alumno();
        Alumno alu2 = new Alumno(35, "Luisina", "De Paula");

//      int id = alu2.getId(); // Otra opción de llamar al Id
//      System.out.println("La Id de Alumno2 es; " + id);

//        Traer datos de las variables alu2
        System.out.println("La Id de alumno2 es; " + alu2.getId());
        System.out.println("El nombre de alumno2 es; "+ alu2.getNombre());
        System.out.println("El apellido de alumno2 es; " + alu2.getApellido());
        
//        Colocar datos a variables de alu1
        alu1.setId(8);
        alu1.setNombre("Diego");
        alu1.setApellido("Arriagada");
        
        System.out.println("--------------------------------------");
        System.out.println("La Id de alumno2 es; " + alu1.getId());
        System.out.println("El nombre de alumno2 es; "+ alu1.getNombre());
        System.out.println("El apellido de alumno2 es; " + alu1.getApellido());
    }

}
