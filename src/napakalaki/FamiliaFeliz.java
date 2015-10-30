/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

import java.util.ArrayList;

/**
 * Familia Feliz - Describe a una familia de monstruos de 5 miembros como máximo, la familia
 * debe de tener un nombre. Define los siguientes atributos:
 * - Atributo de clase para definir el número máximo de miembros
 * - Atributo de instancia para guardar el nombre de la familia
 * - Atributo de instancia para guardar los componentes de la familia
 */

public class FamiliaFeliz {
    private static int num_miembros = 5;
    private String nombre;
    private ArrayList<Monster> componentes;

    // Constructor de la clase
    public FamiliaFeliz (String nomb, ArrayList<Monster> comp){
        nombre = nomb;
        componentes = comp;
    }

    // Método para incluir un nuevo miembro en la familia. Devuelve true si se ha podido
    public boolean incluirMiembro(Monster monstruo){
        if (componentes.size()<5){
            componentes.add(monstruo);
            return true;
        }
        else
            return false;
    }
    
    // Método para consultar el nivel de combate medio de la familia
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


}
