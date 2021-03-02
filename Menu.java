package prueba2;

import java.util.*;

public class Menu{
    String menu[] = {"\n1)Capturar Nombre y Calificaciones",
                    "2)Imprimir Calificaciones Y Promedio",
                    "3)Calificacion mas baja",
                    "4)Calificacion Alta",
                    "5)Salir"};

    public Menu(){
        this.menu = menu;
    }

    public void imprimirMenu(){
        for(int i=0; i < 5; i++){
            System.out.print(menu[i] + "\n");
        }
    }

    public static int capturarOpt(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(""+ msg + ": ");
        return (sc.nextInt());
    }
}
