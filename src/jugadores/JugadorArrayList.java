/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugadores;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jose and Sebas
 */

public class JugadorArrayList {
    ArrayList<Jugador> listajugadores = new ArrayList();
    Scanner entrada = new Scanner(System.in).useDelimiter("\n");
    int opcion;
    
    public void adicionarJugador(){
        System.out.println("Registro de jugador: ");
        System.out.println("");
        Jugador jugador = new Jugador();          
        jugador.setId(listajugadores.size());
                    
                do{   
                    System.out.println("Digite el nombre: ");
                    jugador.setNombre(entrada.next());                                     
                }while(jugador.getNombre()==null || jugador.getNombre().equals(""));  
                
                do{ 
                    System.out.println("Digite los apellidos: ");
                    jugador.setApellidos(entrada.next());                    
                }while(jugador.getApellidos()==null || jugador.getApellidos().equals("")); 
                
                do{
                    System.out.println("Digite el dorsal: ");
                    jugador.setNumeroCamiseta(entrada.next());  
                }while(jugador.getNumeroCamiseta()==null || jugador.getNumeroCamiseta().equals(""));
                
                do{
                    System.out.println("Digite la posición: ");
                    jugador.setPosicion(entrada.next());
                }while(jugador.getPosicion()==null || jugador.getPosicion().equals(""));
                
                do{    
                    System.out.println("Digite la edad: ");
                    jugador.setEdad(entrada.next());
                }while(jugador.getEdad()==null || jugador.getEdad().equals(""));
                
                do{    
                    System.out.println("Digite el equipo donde juega: ");
                    jugador.setEquipoJugador(entrada.next());
                }while(jugador.getEquipoJugador()==null || jugador.getEquipoJugador().equals(""));
                
                    listajugadores.add(jugador);
                    
    }
    
    public void buscarJugador(){
                    System.out.println("Digite el dorsal del jugador:");
                    int dorsal = entrada.nextInt();
                    int contador=0;
                    for(int i=0; i<listajugadores.size(); i++){
                    
                        if(dorsal == Integer.parseInt(listajugadores.get(i).getNumeroCamiseta())){
                            
                        System.out.println("Id: "+listajugadores.get(i).getId());
                        System.out.println("Nombre: "+listajugadores.get(i).getNombre());
                        System.out.println("Apellidos: "+listajugadores.get(i).getApellidos());
                        System.out.println("Dorsal: "+listajugadores.get(i).getNumeroCamiseta());
                        System.out.println("Posición: "+listajugadores.get(i).getPosicion());
                        System.out.println("Edad: "+listajugadores.get(i).getEdad());
                        System.out.println("Equipo donde juega: "+listajugadores.get(i).getEquipoJugador());
                        System.out.println("");
                            
                        break;
                         
                        }
                        contador++;
                    }
                    if(contador==listajugadores.size()){
                        System.out.println("Ningún jugador convocado posee este dorsal");
                    }
    }
    
    public void editarJugador(){
                    System.out.println("Digite el id del jugador:");
                    int id = entrada.nextInt();
                    int contador=0;
                    for(int i=0; i<listajugadores.size(); i++){
                    
                        if(id == listajugadores.get(i).getId()){
                            Jugador jugador = new Jugador();
                            
                            jugador.setId(id);
                            
                        do{
                            jugador.setNombre("");    
                            System.out.println("Digite el nombre: ");
                            jugador.setNombre(entrada.next());
                        }while(jugador.getNombre()==null || jugador.getNombre().equals(""));    
                            
                        do{
                            jugador.setApellidos("");
                            System.out.println("Digite los apellidos: ");
                            jugador.setApellidos(entrada.next());                                                     
                        }while(jugador.getApellidos()==null || jugador.getApellidos().equals("")); 
                            
                        do{
                            jugador.setNumeroCamiseta("");    
                            System.out.println("Digite el dorsal: ");
                            jugador.setNumeroCamiseta(entrada.next());
                        }while(jugador.getNumeroCamiseta()==null || jugador.getNumeroCamiseta().equals("")); 
                            
                        do{
                            jugador.setPosicion("");    
                            System.out.println("Digite la posición: ");
                            jugador.setPosicion(entrada.next());
                        }while(jugador.getPosicion()==null || jugador.getPosicion().equals(""));
                        
                        do{
                            jugador.setEdad("");    
                            System.out.println("Digite la edad: ");
                            jugador.setEdad(entrada.next());
                        }while(jugador.getEdad()==null || jugador.getEdad().equals(""));
                        
                        do{
                            jugador.setEquipoJugador("");    
                            System.out.println("Digite el equipo donde juega: ");
                            jugador.setEquipoJugador(entrada.next());
                        }while(jugador.getEquipoJugador()==null || jugador.getEquipoJugador().equals(""));
                            
                        listajugadores.set(i, jugador);
                            
                        break;
                        
                        }
                        contador++;                                             
                    }
                    if(contador==listajugadores.size()){
                    System.out.println("Ningún jugador convocado posee este id");
                    }  
    }
    
    public void mostrarConvocatoria(){
                    System.out.println("Jugadores convocados:");
                    System.out.println("");
                    
                    for(int i=0; i<listajugadores.size(); i++){
                        
                        System.out.println("Id: "+listajugadores.get(i).getId());
                        System.out.println("Nombre: "+listajugadores.get(i).getNombre());
                        System.out.println("Apellidos: "+listajugadores.get(i).getApellidos());
                        System.out.println("Dorsal: "+listajugadores.get(i).getNumeroCamiseta());
                        System.out.println("Posición: "+listajugadores.get(i).getPosicion());
                        System.out.println("Edad: "+listajugadores.get(i).getEdad());
                        System.out.println("Equipo donde juega: "+listajugadores.get(i).getEquipoJugador());
                        System.out.println("");
                        
                    }     
    }
    
}

    

