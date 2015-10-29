/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

import java.util.ArrayList;

/**
 *
 * @author Ismael
 */
public class FamiliaFeliz {
    private static int num_miembros = 5;
    private String nombre;
    private ArrayList<Monster> componentes;
    
    public FamiliaFeliz (String nomb, ArrayList<Monster> comp){
        nombre = nomb;
        componentes = comp;
    }

    public boolean incluirMiembro(Monster monstruo){
        if (componentes.size()<5){
            componentes.add(monstruo);
            return true;
        }
        else
            return false;
    }
    
    public float nivelMedio(){
        float media = 0;
        int contador = 0;
        for(Monster mons : componentes){
            media = media + mons.getCombatLevel();
            contador++;
        }
        
        media = media / contador;
        return media;
    }
    
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        
        FamiliaFeliz una_familia = new FamiliaFeliz("5 primeros", new ArrayList());
        System.out.println(monst.toString());
        
        
    }

}


//        for(Monster monst : monstruos){
