/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Ismael
 */
public class PruebaNapakalaki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Prize unPrize = new Prize(3,1);
        BadConsequence unBad = new BadConsequence("Pierdes todos tus tesoros "
                + "visibles",false);
        Monster unMonster = new Monster("El gorrón en el umbral",10,unBad,unPrize);
        
        System.out.println(unMonster.toString());
        
        ArrayList<Monster>monstruos = new ArrayList();
        
        //El rey de rosa
        BadConsequence badReyRosa = new BadConsequence("Pierdes 5 niveles y 3 "
                + "tesoros visibles",
        5,3,0);
        Prize prizeReyRosa = new Prize(4,2);
        monstruos.add(new Monster("El rey de rosa",13,badReyRosa,prizeReyRosa));
        
        //3 Byakhees de bonanza
        BadConsequence badByakhees = new BadConsequence("Pierdes tu armadura "
                + "visible y otra oculta",0,new ArrayList(Arrays.asList(
                TreasureKind.ARMOR)),new ArrayList(Arrays.asList(TreasureKind.ARMOR)));
        Prize prizeByakhees = new Prize(2,1);
        monstruos.add(new Monster("3 Byakhees de bonanza",8,badByakhees,
                prizeByakhees));
        
        //badChibithulhu
        BadConsequence badChibithulhu;
        badChibithulhu = new BadConsequence("Embobados con el "
                + "lindo primigenio te descartas de tu casco visible",0,
                new ArrayList(Arrays.asList(TreasureKind.HELMET)),null);
        Prize pChibithulhu = new Prize(1,1);
        monstruos.add(new Monster("Chibithulhu",2,badChibithulhu,pChibithulhu));
        
        //El sopor de Dunwich
        BadConsequence bDunwich = new BadConsequence("El primordial bostezo "
                + "contagioso. Pierdes el calzado visible",0,new ArrayList(
                Arrays.asList(TreasureKind.SHOES)),null);
        Prize pDunwich = new Prize(1,1);
        monstruos.add(new Monster("El sopor de Dunwich",2,bDunwich,pDunwich));
        
        //Ángeles de la noche ibicenca
        BadConsequence badAngelesIbicencos = new BadConsequence("Te atrapan para"
                + " llevarte de fiesta y te dejan caer en mitad del vuela. "
                + "Descarta 1 mano visible y 1 mano oculata",0, new ArrayList
                (Arrays.asList(TreasureKind.ONEHAND)),new ArrayList
                (Arrays.asList(TreasureKind.ONEHAND)));
        Prize prizeAngelesIbicencos = new Prize(4,1);
        monstruos.add(new Monster("Angeles de la noche ibicenca",14,badAngelesIbicencos,
                prizeAngelesIbicencos));
        
        
        //El gorrón en el umbral
        BadConsequence badGorronUmbral = new BadConsequence("Pierdes todos tus "
                + "tesoros visibles",0,new ArrayList(Arrays.asList
                (TreasureKind.ARMOR,TreasureKind.BOTHHANDS,TreasureKind.HELMET,
                 TreasureKind.ONEHAND,TreasureKind.SHOES)),null);
        Prize prizeGorronUmbral = new Prize(3,1);
        monstruos.add(new Monster("El gorrón en el umbral",10,badGorronUmbral,
        prizeGorronUmbral));
        
        
        
        //Los hondos
        
        BadConsequence bCLosHondos = new BadConsequence("Estos monstruos resultan"
                + "bastante superficiales y te aburren mortalmente. Estas muerto.",true);
        Prize pLosHondos = new Prize(2,1);
        monstruos.add(new Monster("Los hondos",8,bCLosHondos,pLosHondos));
        
        // Familia Feliz
        
        BadConsequence bCFamiliaFeliz = new BadConsequence("La familia te atrapa. Estas"
                + " muerto",true);
        Prize pFamiliaFeliz = new Prize(4,1);
        monstruos.add(new Monster("Familia feliz",1,bCFamiliaFeliz,pFamiliaFeliz));
        
        //Otro Monstruo
    }
    
}
