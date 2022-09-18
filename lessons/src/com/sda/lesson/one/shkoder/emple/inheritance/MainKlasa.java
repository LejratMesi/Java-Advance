package com.sda.lesson.one.shkoder.emple.inheritance;

public class MainKlasa {
    public static void main(String[] args) {

        //Krijova 2 objekte te klases KlasaImplementation
        ShkollaImplementation shkolla11 = new ShkollaImplementation("11 b",8);
        ShkollaImplementation shkolla12 = new ShkollaImplementation("12 b",20);

        //therritja e metodes se klases KlasaImplementation dhe
        // nga kjo metode une kam therritur metodene  eklases meme me ane te
        // keywordit SUPER.
        shkolla11.printoEmrin("KLASA 11");
        shkolla11.printoEmrinKlases();
        shkolla11.printoNumrinEStudentave();

        //therritja e metodes se klases meme nga objekti direkt
        shkolla12.printo( "KLASA 12");
        shkolla12.printoEmrinKlases();
        shkolla12.printoNumrinEStudentave();

    }
}
