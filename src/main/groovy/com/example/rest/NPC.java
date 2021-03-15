package com.example.rest;

public class NPC {

    private static String [] names = {
            "Thornbron Jangles",
            "Historia McCarther",
            "Bran Weasley",
    };
    private static String [] alignments = {
            "Lawful Good",
            "Neutral Good",
            "Chaotic Good",
            "Lawful Neutral",
            "Neutral",
            "Chaotic Neutral",
            "Lawful Evil",
            "Neutral Evil",
            "Chaotic Evil",
    };
    private static String [] backgrounds = {
            "Farmer",
            "Pirate",
            "Accountant",
            "Robber",
            "Juggler",
            "Jester",
            "Conman",
            "Entrepreneur",
            "Blacksmith",
    };
    private static String [] quirks = {
            "has a tendency to pass gas when nervous",
            "always carries a locket with a picture of their grandmother",
            "obsesses about how well their last date went",
            "carries a piece of cheese everywhere just in case they get hungry",
            "gets angry at anyone that tries to give them constructive criticism",
            "never plans to sell their land because it's been in the family for generations",
    };

//    private final long id;
//    private final String content;
    private final String name;
    private final String alignment;
    private final String background;
    private final String quirk;

    NPC() {
//        this.id = 3;
//        this.content = "test";
        this.name = names[(int) (Math.random() * names.length - 1)];
        this.alignment = alignments[(int) (Math.random() * alignments.length - 1)];
        this.background = backgrounds[(int) (Math.random() * backgrounds.length - 1)];
        this.quirk = quirks[(int) (Math.random() * quirks.length - 1)];
    }

//    public long getId() {
//        return this.id;
//    }
//
//    public String getContent() {
//        return this.content;
//    }


    public String getName() {
        return this.name;
    }

    public String getBackground() {
        return this.background;
    }

    public String getQuirk() {
        return this.quirk;
    }

    public String getAlignment() {
        return this.alignment;
    }
}
