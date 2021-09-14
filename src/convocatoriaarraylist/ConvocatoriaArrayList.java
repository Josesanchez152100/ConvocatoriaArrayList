/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convocatoriaarraylist;


import java.util.Scanner;
import jugadores.JugadorArrayList;

/**
 *
 * @author Jose and Sebas
 */
public class ConvocatoriaArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        JugadorArrayList jugadores=new JugadorArrayList();
        
        do{
            
            System.out.println("Bienvenido a la convocatoria de la Selección Colombia");
            System.out.println("******************************************************");
            System.out.println("1. Agregar jugador");
            System.out.println("2. Buscar jugador");
            System.out.println("3. Editar jugador");
            System.out.println("4. Mostrar convocatoria");
            System.out.println("5. Salir");
            System.out.println("Digite una opción");
            opcion=entrada.nextInt();
            
            switch(opcion){
                
                case 1:
                    jugadores.adicionarJugador();
                    break;
                case 2:
                    jugadores.buscarJugador();
                    break;
                case 3:
                    jugadores.editarJugador();
                    break;
                case 4:
                    jugadores.mostrarConvocatoria();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    
                    break;
        
            }
        }while(opcion != 5);    
    }
    
}
