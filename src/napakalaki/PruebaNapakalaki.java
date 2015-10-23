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
//        
//        
//        Prize unPrize = new Prize(3,1);
//        BadConsequence unBad = new BadConsequence("Pierdes todos tus tesoros "
//                + "visibles",false);
//        Monster unMonster = new Monster("El gorrón en el umbral",10,unBad,unPrize);
//        
//        System.out.println(unMonster.toString());
        
        
        
        ArrayList<Monster>monstruos = new ArrayList();
        
        //3 Byakhees de bonanza
        BadConsequence badByakhees = new BadConsequence("Pierdes tu armadura "
                + "visible y otra oculta",0,new ArrayList(Arrays.asList(
                TreasureKind.ARMOR)),new ArrayList(Arrays.asList(TreasureKind.ARMOR)));
        Prize prizeByakhees = new Prize(2,1);
        monstruos.add(new Monster("3 Byakhees de bonanza",8,badByakhees,
                prizeByakhees));
        
        //Chibithulhu
        BadConsequence badChibithulhu = new BadConsequence("Embobados con el "
                + "lindo primigenio te descartas de tu casco visible",0,
                new ArrayList(Arrays.asList(TreasureKind.HELMET)),null);
        Prize prizeChibithulhu = new Prize(1,1);
        monstruos.add(new Monster("Chibithulhu",2,badChibithulhu,prizeChibithulhu));
        
        //El sopor de Dunwich
        BadConsequence badDunwich = new BadConsequence("El primordial bostezo "
                + "contagioso. Pierdes el calzado visible",0,new ArrayList(
                Arrays.asList(TreasureKind.SHOES)),null);
        Prize prizeDunwich = new Prize(1,1);
        monstruos.add(new Monster("El sopor de Dunwich",2,badDunwich,prizeDunwich));
        
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
        
        //H.P Munchcraft
        BadConsequence badHP = new BadConsequence("Pierdes la armadura visible",
                0,new ArrayList(Arrays.asList(TreasureKind.ARMOR)),null);
        Prize prizeHP = new Prize(2,1);
        monstruos.add(new Monster("H.P Munchcraft",6,badHP,prizeHP));
        
        //Bichgooth
        BadConsequence badBichgooth = new BadConsequence("Sientes bichos bajo la "
                + "ropa. Descarta la armadura visible",0,new ArrayList(Arrays.
                asList(TreasureKind.ARMOR)),null);
        Prize prizeBichgooth = new Prize(1,1);
        monstruos.add(new Monster("Bichgooth",2,badBichgooth,prizeBichgooth));
        
        //El rey de rosa
        BadConsequence badReyRosa = new BadConsequence("Pierdes 5 niveles y 3 "
                + "tesoros visibles",
        5,3,0);
        Prize prizeReyRosa = new Prize(4,2);
        monstruos.add(new Monster("El rey de rosa",13,badReyRosa,prizeReyRosa));
        
        //Lo que redacta en las tinieblas
        BadConsequence badTinieblas = new BadConsequence("Toses los pulmones y"
                + "pierdes 2 niveles",2,null,null);
        Prize prizeTinieblas = new Prize(1,1);
        monstruos.add(new Monster("La que redacta en las tinieblas",2,badTinieblas,
        prizeTinieblas));
        
        //Los hondos
        BadConsequence badLosHondos = new BadConsequence("Estos monstruos resultan"
                + "bastante superficiales y te aburren mortalmente. Estas muerto.",true);
        Prize prizeLosHondos = new Prize(2,1);
        monstruos.add(new Monster("Los hondos",8,badLosHondos,prizeLosHondos));
        
        // Semillas Cthulhu
        BadConsequence badSemillasCthulhu = new BadConsequence("Pierdes 2 niveles y 2"
                + " tesoros ocultos",2,0,2);
        Prize prizeSemillasCthulhu = new Prize(2,1);
        monstruos.add(new Monster("Semillas Cthulhu",4,badSemillasCthulhu,prizeSemillasCthulhu));
        
        // Dameargo
        BadConsequence badDameargo = new BadConsequence("Te intentas escaquear. Pierdes"
                + " una mano visible",0,new ArrayList(
                Arrays.asList(TreasureKind.ONEHAND)),null);
        Prize prizeDameargo = new Prize(2,1);
        monstruos.add(new Monster("Dameargo",1,badDameargo,prizeDameargo));
        
        // Pollipólipo volante
        BadConsequence badPollipolipo = new BadConsequence("Da mucho asquito. Pierdes"
                + " 3 niveles",3,null,null);
        Prize prizePollipolipo = new Prize(1,1);
        monstruos.add(new Monster("Pollipólipo volante",3,badPollipolipo,
        prizePollipolipo));
        
        // Yskhtihyssq-Goth
        BadConsequence badYskhtihyssq = new BadConsequence("No le hace gracia que"
                + " pronuncien mal su nombre. Estas muerto.",true);
        Prize prizeYskhtihyssq = new Prize(3,1);
        monstruos.add(new Monster("Yskhtihyssq-Goth",12,badYskhtihyssq,prizeYskhtihyssq));
        
        // Familia Feliz
        BadConsequence badFamiliaFeliz = new BadConsequence("La familia te atrapa. Estas"
                + " muerto",true);
        Prize prizeFamiliaFeliz = new Prize(4,1);
        monstruos.add(new Monster("Familia feliz",1,badFamiliaFeliz,prizeFamiliaFeliz));
        
        // Roboggoth
        BadConsequence badRoboggoth = new BadConsequence("La quinta directiva primaria te"
                + " obliga a perder 2 niveles y un tesoro de 2 manos visible",0,new ArrayList(
                Arrays.asList(TreasureKind.BOTHHANDS)),null);
        Prize prizeRoboggoth = new Prize(2,1);
        monstruos.add(new Monster("Roboggoth",8,badRoboggoth,prizeRoboggoth));
        
        // El espía
        BadConsequence badEspia = new BadConsequence("Te asusta en la noche."
                + " Pierdes un casco visible",0,new ArrayList(
                Arrays.asList(TreasureKind.HELMET)),null);
        Prize prizeEspia = new Prize(1,1);
        monstruos.add(new Monster("El espía",5,badEspia,prizeEspia));
        
        //El Lenguas
        BadConsequence badLenguas = new BadConsequence("Menudo susto te llevas. "
                + "Pierdes 2 niveles y 5 tesoros visibles",2,5,0);
        Prize prizeLenguas = new Prize(1,1);
        monstruos.add(new Monster("El Lenguas",20,badLenguas,prizeLenguas));
        
        //Bicéfalo
        BadConsequence badBicefalo = new BadConsequence("Te faltan manos para "
                + "tanta cabeza. Perdes 3 niveles y tus tesoros visibles de las"
                + "manos",3,new ArrayList(Arrays.asList(TreasureKind.ONEHAND)),null);
        Prize prizeBicefalo = new Prize(1,1);
        monstruos.add(new Monster("Bicéfalo",20,badBicefalo,prizeBicefalo));
    }
    
}
