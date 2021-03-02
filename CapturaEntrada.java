package prueba2;

import java.util.Scanner;

public class CapturaEntrada {
    
    public static int capturanCalificaciones(String msg){
        Scanner sc =  new Scanner(System.in);
        System.out.print(msg + ": ");
        return sc.nextInt();
    }
    
    public static String capturarNombre(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(""+ msg + ": ");
        return sc.nextLine();
    }
    
    public static String capturarEmail(String msg) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print(""+ msg + ": ");
        return sc.nextLine();
    }
    
    public static float[] llenarCalificaciones(int numero){
        float calificaciones[] = new float[numero];
        for(int i=0; i < calificaciones.length; i++){
            Scanner sc = new Scanner(System.in);
            System.out.print("Calificacion"+ (i+1) + ": ");
            calificaciones[i] = sc.nextFloat();
        }
        return calificaciones;
    }
    
    public static String[] llenarMaterias(int numero){
        String materias[] = new String[numero];
        for(int i=0; i < materias.length; i++){
            Scanner sc = new Scanner(System.in);
            System.out.print("Materia"+ (i+1) + ": ");
            materias[i] = sc.nextLine();
        }
        return materias;
    }
}