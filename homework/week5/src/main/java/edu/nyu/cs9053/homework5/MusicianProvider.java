package edu.nyu.cs9053.homework5;

import java.util.*;
/**
 * User: blangel
 * Date: 2/20/17
 * Time: 4:05 PM
 */
public class MusicianProvider {

    public static Musician createLargoMusician() {
        Musician largoMusician = new LargoMusician();
        return largoMusician;
    }

    public static Musician createModeratoMusician() {
        Musician moderatoMusician = new ModeratoMusician();
        return moderatoMusician;
    }

    public static Musician createPrestissimoMusician() {
        Musician prestissimoMusician = new PrestissimoMusician();
        return prestissimoMusician;
    }

    public static MusicalInstrument randomlyChoose() {
        final String[] instruments = new String[]{"Tenoroon", 
        "Triangle","Clarinet","Keyboard","BassGuitar","Sanxian","Tsuzumi",
        "DrumMachine", "Bassoon", "Sitar", "Cello", "ElectricGuitar",
        "Chenda", "Piccolo", "Xylophone"};

        Random random = new Random();
        String selectedInstrument = instruments[random.nextInt(instruments.length)];

        MusicalInstrument musicalInstrument = null;
        switch(selectedInstrument){
            case "Tenoroon":
                musicalInstrument = new Tenoroon("Tenoroon", 1);
                break;
            case "Triangle":
                musicalInstrument = new Triangle("Triangle", 1);
                break;
            case "Clarinet":
                musicalInstrument = new Clarinet("Clarinet", 1);
                break;
            case "Keyboard":
                musicalInstrument = new KeyBoard("Keyboard", 1);
                break;
            case "BassGuitar":
                musicalInstrument = new BassGuitar("BassGuitar", 1);
                break;
            case "Sanxian":
                musicalInstrument = new Sanxian("Sanxian", 1);
                break;
            case "Tsuzumi":
                musicalInstrument = new Tsuzumi("Tsuzumi", 1);
                break;
            case "DrumMachine":
                musicalInstrument = new DrumMachine("DrumMachine", 1);
                break;
            case "Bassoon":
                musicalInstrument = new Bassoon("Bassoon", 1);
                break; 
            case "Sitar":
                musicalInstrument = new Sitar("Sitar", 1);
                break;
            case "Cello":
                musicalInstrument = new Cello("Cello", 1);
                break;
            case "ElectricGuitar":
                musicalInstrument = new ElectricGuitar("ElectricGuitar", 1);
                break;
            case "Chenda":
                musicalInstrument = new Chenda("Chenda", 1);
                break;
            case "Piccolo":
                musicalInstrument = new Piccolo("Piccolo", 1);
                break;     
            case "Xylophone":
                musicalInstrument = new Xylophone("Xylophone", 1);
                break;
        }
        return musicalInstrument;

    }

}
