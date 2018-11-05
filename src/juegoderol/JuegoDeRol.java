/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoderol;

import java.util.Scanner;

/**
 *
 * @author DiegoGabrielBlaschi
 */
public class JuegoDeRol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Batman batman = new Batman();
        Superman superman = new Superman();
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese una opción:\n1.Ataque 1\n2.Ataque 2\n3.Recuperar vida\n4.Salir");
        while(batman.Vida() > 0 && superman.Vida() > 0){          
            System.out.println("Turno de Batman:");
            String eleccionBatman = sc.nextLine();
            
            switch(eleccionBatman){
                case "1": superman.Ataque1();
                    break;
                case "2": superman.Ataque2();
                    break;
                case "3": batman.Recuperar();
                    break;
                case "4": batman.Salir();
                    break;
                default:
                    break;
            }
            batman.Informacion();
            superman.Informacion();
            
            System.out.println("Turno de superman:");
            String eleccionSuperman = sc.nextLine();
            
            switch(eleccionSuperman){
                case "1": batman.Ataque1();
                    break;
                case "2": batman.Ataque2();
                    break;
                case "3": superman.Recuperar();
                    break;
                case "4": superman.Salir();
                    break;
                default:
                    break;
            }
            batman.Informacion();
            superman.Informacion();

            }
            if (batman.Vida() <=0) {
                System.out.println("Batman se quedo sin vida");
                System.out.println("Game over");
            }
            else if(superman.Vida() <=0) {
                System.out.println("Superman se quedo sin vida");
                System.out.println("Game over");
            }
        }
    }
    
