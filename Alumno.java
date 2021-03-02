package prueba2;

public class Alumno {
    String nombre;
    float calificaciones[];
    String materia[];
    String email;

    public void optenerDatos(int numero){
        nombre = CapturaEntrada.capturarNombre("Ingrese su nombre");
        email = CapturaEntrada.capturarEmail("Ingrese su Email");
        materia = CapturaEntrada.llenarMaterias(numero);
        calificaciones = CapturaEntrada.llenarCalificaciones(numero);
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setcalificaciones(float[] calificacion){
        this.calificaciones = calificaciones;
    }

    public String getNombre(){
        return nombre;
    }
    
    public float[] getCalificaciones(){
        return calificaciones;
    }
}