package prueba2;

public class NewMain {
    
    public static void main(String[] args){
    	Calificaciones alumno = new Calificaciones();
    	Menu menu = new Menu();
    	int numero = CapturaEntrada.capturanCalificaciones("Ingrese el total de Calificaciones");
    	int x = 1;
    	
    	while(x != 0) {
    		menu.imprimirMenu();
    		int opt = Menu.capturarOpt("Ingrese una opcion");
    		switch(opt) {
    			case 1: 
    				alumno.optenerDatos(numero);
    				break;
    			case 2:
    				alumno.imprimirDatosAlumno();
    				alumno.imprimirArreglo();
    				alumno.calcularPromedio();
    				break;
    			case 3:
    				alumno.calcularMenor();
    				break;
    			case 4:
    				alumno.calcularMayor();
    				break;
    			case 5:
    				x = 0;
    				break;
    		}
    	}
    	
    	
    	
    	
    	
    	
    }
    
}