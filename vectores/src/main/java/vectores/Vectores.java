package vectores;

public class Vectores {

    public static void main(String[] args) {
        //Asignación manual de los nombres
    String vector[] = new String [8];
    vector [0] = "Alejandra";
    vector [1] = "Ludmila";
    vector [2] = "Gabriel";
    vector [3] = "Rosa";
    vector [4] = "Luisina";
    vector [5] = "Daniel";
    vector [6] = "Loky";
    vector [7] = "Lumel";
    
    //Recorrido
    for(int i=0; i<vector.length;i++){
        System.out.println("En la posición: " + i + "Está el nombre: " + vector[i]);
    }
    }
}
