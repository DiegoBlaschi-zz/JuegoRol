/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoderol;

/**
 *
 * @author DiegoGabrielBlaschi
 */
public class Batman {
    private final String nombre="Batman";
    private int vida=100;
    private final int minPower1=1;
    private final int maxPower1=10;
    private final int minPower2=1;
    private final int maxPower2=20;
    private final int pocion= 4;
    private int ataque1;
    private int ataque2;

    public Batman() {
    }
    
    public void Informacion(){
        System.out.println("Batman tiene " + vida + " de vida.");
    }
    
    public int Ataque1(){
        ataque1 =(int) (Math.random() * maxPower1);
        vida = vida - ataque1;
        return vida;
    }
    
    public int Ataque2(){
        ataque2 = (int) (Math.random() * maxPower2);
        vida = vida - ataque2;
        return vida;
    }
    
    public void Recuperar(){
        vida = vida + pocion;
        System.out.println("Su personaje recupero " + pocion + " puntos de vida.");
        System.out.println("Ahora tiene " + vida + " puntos");
    }
    
    public int Vida(){
        return vida;
    }
    
    public void Salir(){
        vida = 0;
        System.out.println("Game over");
    }
    
    
    
    
}
