/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author jmfajardo
 */
public class CardDealer {
    static final CardDealer instance = new CardDealer();
    
    private ArrayList<Treasure> unusedTreasures;
    private ArrayList<Treasure> usedTreasures;
    private ArrayList<Monster> unusedMonsters;
    private ArrayList<Monster> usedMonsters;
    private ArrayList<Cultist> unusedCultists;
    
    

    private CardDealer(){
        unusedTreasures = new ArrayList();
        usedTreasures = new ArrayList();
        unusedMonsters = new ArrayList();
        usedMonsters = new ArrayList();
       
    }
    
    private void initTreasureCardDeck(){
        unusedTreasures.add(new Treasure("¡Sí mi amo!",4,TreasureKind.HELMET));
        unusedTreasures.add(new Treasure("Botas de investigación",3,TreasureKind.SHOES));
        unusedTreasures.add(new Treasure("Capucha de Cthulhu",3,TreasureKind.HELMET));
        unusedTreasures.add(new Treasure("A prueba de babas",2,TreasureKind.ARMOR));
        unusedTreasures.add(new Treasure("Botas de lluvia ácida",1,TreasureKind.BOTHHANDS));
        unusedTreasures.add(new Treasure("Casco minero",2,TreasureKind.HELMET));
        unusedTreasures.add(new Treasure("Ametralladora Thompson",4,TreasureKind.BOTHHANDS));
        unusedTreasures.add(new Treasure("Camiseta de la UGR",1,TreasureKind.HELMET));
        unusedTreasures.add(new Treasure("Clavo de rail ferroviario",3,TreasureKind.ONEHAND));
        unusedTreasures.add(new Treasure("Cuchillo de sushi arcano",2,TreasureKind.ONEHAND));
        unusedTreasures.add(new Treasure("Fez alópodo",3,TreasureKind.HELMET));
        unusedTreasures.add(new Treasure("Hacha prehistórica",2,TreasureKind.ONEHAND));
        unusedTreasures.add(new Treasure("El aparato del Pr. Tesla",4,TreasureKind.ARMOR));
        unusedTreasures.add(new Treasure("Gaita",4,TreasureKind.BOTHHANDS));
        unusedTreasures.add(new Treasure("Insecticida",2,TreasureKind.ONEHAND));
        unusedTreasures.add(new Treasure("Escopeta de 3 cañones",4,TreasureKind.BOTHHANDS));
        unusedTreasures.add(new Treasure("Garabato mística",2,TreasureKind.ONEHAND));
        unusedTreasures.add(new Treasure("La rebeca metálica",2,TreasureKind.ARMOR));
        unusedTreasures.add(new Treasure("Lanzallamas",4,TreasureKind.BOTHHANDS));
        unusedTreasures.add(new Treasure("Necrocomicón",1,TreasureKind.ONEHAND));
        unusedTreasures.add(new Treasure("Necronomicón",5,TreasureKind.BOTHHANDS));
        unusedTreasures.add(new Treasure("Linterna a 2 manos",3,TreasureKind.BOTHHANDS));
        unusedTreasures.add(new Treasure("Necrognomicón",2,TreasureKind.ONEHAND));
        unusedTreasures.add(new Treasure("Necrotelecom",2,TreasureKind.HELMET));
        unusedTreasures.add(new Treasure("Mazo de los antiguos",3,TreasureKind.ONEHAND));
        unusedTreasures.add(new Treasure("Necroplayboycón",3,TreasureKind.ONEHAND));
        unusedTreasures.add(new Treasure("Porra preternatural",2,TreasureKind.ONEHAND));
        unusedTreasures.add(new Treasure("Shogulador",1,TreasureKind.BOTHHANDS));
        unusedTreasures.add(new Treasure("Varita de atizamiento",3,TreasureKind.ONEHAND));
        unusedTreasures.add(new Treasure("Tentáculo de pega",2,TreasureKind.HELMET));
        unusedTreasures.add(new Treasure("Zapato deja-amigos",1,TreasureKind.SHOES));

        shuffleTreasure();  //Esto no va aquí, pero lo pongo porque no se llama nunca a esta función para barajar
    }
    
    private void initMonsterCardDeck(){
        //3 Byakhees de bonanza
        BadConsequence badByakhees = new SpecificBC("Pierdes tu armadura "
                + "visible y otra oculta",0,new ArrayList(Arrays.asList(TreasureKind.ARMOR)),
                new ArrayList(Arrays.asList(TreasureKind.ARMOR)));
        Prize prizeByakhees = new Prize(2,1);
        unusedMonsters.add(new Monster("3 Byakhees de bonanza",8,badByakhees,
                prizeByakhees));
        
        //Chibithulhu
        BadConsequence badChibithulhu = new SpecificBC("Embobados con el "
                + "lindo primigenio te descartas de tu casco visible",0,
                new ArrayList(Arrays.asList(TreasureKind.HELMET)),new ArrayList());
        Prize prizeChibithulhu = new Prize(1,1);
        unusedMonsters.add(new Monster("Chibithulhu",2,badChibithulhu,prizeChibithulhu));
        
        //El sopor de Dunwich
        BadConsequence badDunwich = new SpecificBC("El primordial bostezo "
                + "contagioso. Pierdes el calzado visible",0,new ArrayList(
                Arrays.asList(TreasureKind.SHOES)),new ArrayList());
        Prize prizeDunwich = new Prize(1,1);
        unusedMonsters.add(new Monster("El sopor de Dunwich",2,badDunwich,prizeDunwich));
        
        //Ángeles de la noche ibicenca
        BadConsequence badAngelesIbicencos = new SpecificBC("Te atrapan para"
                + " llevarte de fiesta y te dejan caer en mitad del vuela. "
                + "Descarta 1 mano visible y 1 mano oculata",0, new ArrayList
                (Arrays.asList(TreasureKind.ONEHAND)),new ArrayList
                (Arrays.asList(TreasureKind.ONEHAND)));
        Prize prizeAngelesIbicencos = new Prize(4,1);
        unusedMonsters.add(new Monster("Angeles de la noche ibicenca",14,badAngelesIbicencos,
                prizeAngelesIbicencos));
        
        //El gorrón en el umbral
        BadConsequence badGorronUmbral = new NumericBC("Pierdes todos tus "
                + "tesoros visibles",0,BadConsequence.MAXTREASURES,0);
        Prize prizeGorronUmbral = new Prize(3,1);
        unusedMonsters.add(new Monster("El gorrón en el umbral",10,badGorronUmbral,
        prizeGorronUmbral));
        
        //H.P Munchcraft
        BadConsequence badHP = new SpecificBC("Pierdes la armadura visible",
                0,new ArrayList(Arrays.asList(TreasureKind.ARMOR)),new ArrayList());
        Prize prizeHP = new Prize(2,1);
        unusedMonsters.add(new Monster("H.P Munchcraft",6,badHP,prizeHP));
        
        //Bichgooth
        BadConsequence badBichgooth = new SpecificBC("Sientes bichos bajo la "
                + "ropa. Descarta la armadura visible",0,new ArrayList(Arrays.
                asList(TreasureKind.ARMOR)),new ArrayList());
        Prize prizeBichgooth = new Prize(1,1);
        unusedMonsters.add(new Monster("Bichgooth",2,badBichgooth,prizeBichgooth));
        
        //El rey de rosa
        BadConsequence badReyRosa = new NumericBC("Pierdes 5 niveles y 3 "
                + "tesoros visibles",
        5,3,0);
        Prize prizeReyRosa = new Prize(4,2);
        unusedMonsters.add(new Monster("El rey de rosa",13,badReyRosa,prizeReyRosa));
        
        //Lo que redacta en las tinieblas
        BadConsequence badTinieblas = new NumericBC("Toses los pulmones y"
                + "pierdes 2 niveles",2,0,0);
        Prize prizeTinieblas = new Prize(1,1);
        unusedMonsters.add(new Monster("La que redacta en las tinieblas",2,badTinieblas,
        prizeTinieblas));
        
        //Los hondos
        BadConsequence badLosHondos = new DeathBC("Estos monstruos resultan"
                + "bastante superficiales y te aburren mortalmente. Estas muerto.");
        Prize prizeLosHondos = new Prize(2,1);
        unusedMonsters.add(new Monster("Los hondos",8,badLosHondos,prizeLosHondos));
        
        // Semillas Cthulhu
        BadConsequence badSemillasCthulhu = new NumericBC("Pierdes 2 niveles y 2"
                + " tesoros ocultos",2,0,2);
        Prize prizeSemillasCthulhu = new Prize(2,1);
        unusedMonsters.add(new Monster("Semillas Cthulhu",4,badSemillasCthulhu,prizeSemillasCthulhu));
        
        // Dameargo
        BadConsequence badDameargo = new SpecificBC("Te intentas escaquear. Pierdes"
                + " una mano visible",0,new ArrayList(
                Arrays.asList(TreasureKind.ONEHAND)),new ArrayList());
        Prize prizeDameargo = new Prize(2,1);
        unusedMonsters.add(new Monster("Dameargo",1,badDameargo,prizeDameargo));
        
        // Pollipólipo volante
        BadConsequence badPollipolipo = new NumericBC("Da mucho asquito. Pierdes"
                + " 3 niveles",3,0,0);
        Prize prizePollipolipo = new Prize(1,1);
        unusedMonsters.add(new Monster("Pollipólipo volante",3,badPollipolipo,
        prizePollipolipo));
        
        // Yskhtihyssq-Goth
        BadConsequence badYskhtihyssq = new DeathBC("No le hace gracia que"
                + " pronuncien mal su nombre. Estas muerto.");
        Prize prizeYskhtihyssq = new Prize(3,1);
        unusedMonsters.add(new Monster("Yskhtihyssq-Goth",12,badYskhtihyssq,prizeYskhtihyssq));
        
        // Familia Feliz
        BadConsequence badFamiliaFeliz = new DeathBC("La familia te atrapa. Estas"
                + " muerto");
        Prize prizeFamiliaFeliz = new Prize(4,1);
        unusedMonsters.add(new Monster("Familia feliz",1,badFamiliaFeliz,prizeFamiliaFeliz));
        
        // Roboggoth
        BadConsequence badRoboggoth = new SpecificBC("La quinta directiva primaria te"
                + " obliga a perder 2 niveles y un tesoro de 2 manos visible",0,new ArrayList(
                Arrays.asList(TreasureKind.BOTHHANDS)),new ArrayList());
        Prize prizeRoboggoth = new Prize(2,1);
        unusedMonsters.add(new Monster("Roboggoth",8,badRoboggoth,prizeRoboggoth));
        
        // El espía
        BadConsequence badEspia = new SpecificBC("Te asusta en la noche."
                + " Pierdes un casco visible",0,new ArrayList(
                Arrays.asList(TreasureKind.HELMET)),new ArrayList());
        Prize prizeEspia = new Prize(1,1);
        unusedMonsters.add(new Monster("El espía",5,badEspia,prizeEspia));
        
        //El Lenguas
        BadConsequence badLenguas = new NumericBC("Menudo susto te llevas. "
                + "Pierdes 2 niveles y 5 tesoros visibles",2,5,0);
        Prize prizeLenguas = new Prize(1,1);
        unusedMonsters.add(new Monster("El Lenguas",20,badLenguas,prizeLenguas));
        
        //Bicéfalo
        BadConsequence badBicefalo = new SpecificBC("Te faltan manos para "
                + "tanta cabeza. Perdes 3 niveles y tus tesoros visibles de las"
                + "manos",3,new ArrayList(Arrays.asList(TreasureKind.BOTHHANDS)),new ArrayList());
        Prize prizeBicefalo = new Prize(1,1);
        unusedMonsters.add(new Monster("Bicéfalo",20,badBicefalo,prizeBicefalo));
        
        //
        // SECTARIOS
        //
        
        //El mal indecible impronunciable
        BadConsequence badIndecible = new SpecificBC("Pierdes 1 "
                + "mano visible",0,new ArrayList(Arrays.asList(TreasureKind.ONEHAND)),new ArrayList());
        Prize prizeIndecible = new Prize(3,1);
        unusedMonsters.add(new Monster("El mal indecible impronunciable",10,badIndecible,prizeIndecible,-2));
        
        //Testigos oculares
        BadConsequence badTestigos = new NumericBC("Pierdes tus "
                + "tesoros visibles. Jajaja",0,BadConsequence.MAXTREASURES,0);
        Prize prizeTestigos = new Prize(2,1);
        unusedMonsters.add(new Monster("Testigos oculares",6,badTestigos,prizeTestigos,+2));
        
        //El gran cthulhu
        BadConsequence badGran = new DeathBC("Hoy no es tu dia de suerte. Mueres");
        Prize prizeGran = new Prize(2,5);
        unusedMonsters.add(new Monster("El gran cthulhu",20,badGran,prizeGran,+4));
        
        //Serpiente Politico
        BadConsequence badSerpiente = new NumericBC("Tu gobierno te recorta 2 "
                + "niveles",2,0,0);
        Prize prizeSerpiente = new Prize(2,1);
        unusedMonsters.add(new Monster("Serpiente politico",8,badSerpiente,prizeSerpiente,-2));
        
        //Felpuggoth
        BadConsequence badFelpuggoth = new SpecificBC("Pierdes tu casco y tu armadura "
                + "visible. Pierdes tus manos ocultas",0,new ArrayList(Arrays.asList(TreasureKind.HELMET,TreasureKind.ARMOR)),
                new ArrayList(Arrays.asList(TreasureKind.BOTHHANDS)));
        Prize prizeFelpuggoth = new Prize(1,1);
        unusedMonsters.add(new Monster("Felpuggoth",2,badFelpuggoth,prizeFelpuggoth,+5));
        
        //Shoggoth
        BadConsequence badShoggoth = new NumericBC("Pierdes 2 niveles",2,0,0);
        Prize prizeShoggoth = new Prize(4,2);
        unusedMonsters.add(new Monster("Shoggoth",16,badShoggoth,prizeShoggoth,-4));
        
        //Lolitagooth
        BadConsequence badLolitagooth = new NumericBC("Pintalabios negro. Pierdes 2 niveles",2,0,0);
        Prize prizeLolitagooth = new Prize(1,1);
        unusedMonsters.add(new Monster("Lolitagooth",2,badLolitagooth,prizeLolitagooth,+3));
        
        shuffleMonsters();  //Esto no va aquí, pero lo pongo porque no se llama nunca a esta función para barajar
    }
    
    private void initCultistCardDeck(){
        unusedCultists.add(new Cultist("+1 por cada sectario en juego. No puedes dejar de ser sectario",1));
        unusedCultists.add(new Cultist("+2 por cada sectario en juego. No puedes dejar de ser sectario",2));
        unusedCultists.add(new Cultist("+1 por cada sectario en juego. No puedes dejar de ser sectario",1));
        unusedCultists.add(new Cultist("+2 por cada sectario en juego. No puedes dejar de ser sectario",2));
        unusedCultists.add(new Cultist("+1 por cada sectario en juego. No puedes dejar de ser sectario",1));
        unusedCultists.add(new Cultist("+1 por cada sectario en juego. No puedes dejar de ser sectario",1));
        
        shuffleCultist();
    }
    
    private void shuffleTreasure(){
        Collections.shuffle(unusedTreasures);
    }
    
    private void shuffleMonsters(){
        Collections.shuffle(unusedMonsters);
    }
    
    private void shuffleCultist(){
        Collections.shuffle(unusedCultists);
    }
    
    public static CardDealer getInstance(){
        return instance;
    }
    
    public Treasure nextTreasure(){
        if(unusedTreasures.isEmpty()){
            unusedTreasures.addAll(usedTreasures);
            shuffleTreasure();
            usedTreasures.clear();
        }        
        Treasure aux = unusedTreasures.get(0);
        unusedTreasures.remove(0);
        return aux;        
    }
    
    public Monster nextMonster(){
        if(unusedMonsters.isEmpty()){
            unusedMonsters.addAll(usedMonsters);
            shuffleMonsters();
            usedMonsters.clear();
        }        
        Monster aux = unusedMonsters.get(0);
        unusedMonsters.remove(0);
        return aux;       
    }
    
    public Cultist nextCultist(){
        return null;
    }
    
    public void giveTreasureBack(Treasure t){
        usedTreasures.add(t);
    }
    
    public void giveMonsterBack(Monster m){
        usedMonsters.add(m);
    }
    
    public void initCards(){
        initTreasureCardDeck();
        initMonsterCardDeck();
    }
}
