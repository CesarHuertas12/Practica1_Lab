package prueba2;

public class Calificaciones extends Alumno{
	
    public void calcularPromedio(){
        float prom = 0;
        for(int i=0; i < calificaciones.length; i++){
            prom += this.calificaciones[i];
        }
        System.out.print("\nEl promedio es: " + (prom /= calificaciones.length) + "\n");
    }

    public void calcularMayor(){
        float num = this.calificaciones[0];
        for(int i = 1; i < calificaciones.length; i++){
            if(num < this.calificaciones[i]){
                num = this.calificaciones[i];
            }
        }
        System.out.print("\nLa calificacion Mayor es: " + num);
    }
    
    public void calcularMenor(){
        float num = this.calificaciones[0];
        for(int i = 1; i < calificaciones.length; i++){
            if(num > this.calificaciones[i]){
                num = this.calificaciones[i];
            }
        }
        System.out.print("\nLa calificacion Menor es: " + num);
    }
    
    public void imprimirArreglo(){
        System.out.print("\n\tLista de Calificaciones\n");
        for(int i=0; i < calificaciones.length; i++){
            System.out.print("Materia: "+ materia[i] + " con calificacion de " + this.calificaciones[i] +"\n");
        }
    }
    
    public void imprimirDatosAlumno() {
    	System.out.println("\n\tDatos del Alumno");
    	System.out.println("Nombre del alumno: " + nombre);
    	System.out.println("");
    }
}