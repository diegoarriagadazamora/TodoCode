package condicionswitch;

public class CondicionSwitch {

    public static void main(String[] args) {
        int dia =3;
        String nombreDia;
        
        switch(dia){
            case 1: nombreDia = "Lunes";
            break;
            case 2: nombreDia = "Martes";
            break;
            case 3: nombreDia = "Miércoles";
            break;
            case 4: nombreDia = "Jueves";
            break;
            case 5: nombreDia = "Viernes";
            break;
            case 6: nombreDia = "Sábado";
            break;
            case 7: nombreDia = "Domingo";
            break;
            default: nombreDia = "Número de Día invalido";
        }
        
        //se ha creado un if else distinto a lo enseñado en todocode con operador ||
        if(dia==1||dia==2||dia==3||dia==4||dia==5||dia==6||dia==7){
        System.out.println("El Día de la semana es; " + nombreDia);
        }
        else{
            System.out.println(nombreDia);
        }
    }
}