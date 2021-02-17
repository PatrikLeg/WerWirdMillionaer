package de.azubi.wwm.datei;

public enum Funfacts {
    FF1(1,"Fügt man die Zeichen der Tesla-Modelle zusammen, entsteht daraus die Zeichenfolge ‘S3XY’, was für das Wort ‘Sexy’ steht."),

    FF2(2,"Das Unternehmen Apple hat genügend Geld, um sich jedes beliebige Sportteam der Welt kaufen zu können."),

    FF3(3,"Es gibt mehr Leute, die das Logo von McDonald’s erkennen, als Leute, die das Kreuz des Christentums erkennen."),

    FF4(4,"Ein türkischer Vater hat seinem 19. Kind den Namen Yeter gegeben. Yeter bedeutet auf Deutsch ‘Es reicht’."),

    FF5(5,"In der Weihnachtszeit nimmt eine erwachsene Person durchschnittlich 0,4 bis 0,9 Kilogramm zu."),

    FF6(6,"1885 wurde Vodka in Russland ausschließlich in 12,3 Liter Eimern verkauft."),

    FF7(7,"Erdbeeren werden nicht zu den Beeren, sondern zu den Nüssen gezählt."),

    FF8(8,"Die früheren, amerikanischen Synchronsprecher von Mickey und Minnie Mouse waren verheiratet."),

    FF9(9,"Auf dem Körper eines Menschen leben mehr Bakterien als Menschen auf der Erde."),

    FF10(10,"Faultiere brauchen bis zu einem Monat, um ihr Essen zu verdauen."),

    FF11(11,"Jeder Mensch verliert täglich bis zu 200 Haare."),

    FF12(12,"Es gibt nur zwei Menschen, die das Coca-Cola Rezept kennen, sie dürfen deshalb nie zusammen reisen."),

    FF13(13,"Das Durchschnittsalter der Soldaten in Vietnam war 19. Im Zweiten Weltkrieg lag es noch bei 26 Jahren."),

    FF14(14,"Michael Jackson versuchte Marvel zu kaufen, weil er unbedingt die Rolle des Spiderman haben wollte."),

    FF15(15,"Korallen sind dem menschlichen Knochen so ähnlich, dass sie zur Behandlung von Knochenbrüchen eingesetzt werden."),

    FF16(16,"Statistisch gesehen, werden die meisten Autos an Neujahr gestohlen."),

    FF17(17,"Es sterben jährlich mehr Menschen durch Sektkorken als durch den Biss einer giftigen Spinne."),

    FF18(18,"Enten haben ebenso wie Menschen verschiedene Akzente."),

    FF19(19,"Ein Gramm DNA besitzt ungefähr genauso viele Informationen wie 600 Milliarden traditionelle CDs."),

    FF20(20,"Die kürzeste Flugstrecke dauert gerade einmal 47 Sekunden und bringt die Menschen in Schottland von der Insel Westray auf die Insel Papa Westray."),

    FF21(21,"Das iPhone ist nach Schätzungen das profitabelste Produkt der Welt. Circa 50 Prozent des Preises sind der Gewinn für Apple."),

    FF22(22,"Alkohol schützt vor radioaktiver Strahlung."),

    FF23(23,"Die zwei häufigsten Gründe für schlechte Laune bei Menschen sind zu wenig Schlaf oder Hunger."),

    FF24(24,"In deutschen Universitäten werden Bücher mit juristischem Schwerpunkt am häufigsten gestohlen."),

    FF25(25,"Lösegeldzahlungen an Entführer sind in Deutschland steuerlich absetzbar."),

    FF26(26,"Der durchschnittliche Preis für einen Liter schwarzer Druckerfarbe ist höher als der für einen Liter menschlichen Blutes."),

    FF27(27,"Die Zeit in der Kleopatra lebte, liegt näher zu dem Zeitpunkt der ersten Mondlandung als zum Bau der Pyramiden."),

    FF28(28,"In Schottland gibt es 421 verschiedene Begriffe für Schnee."),

    FF29(29,"Der Panzer eines Gürteltiers ist kugelsicher."),

    FF30(30,"Ein Blauwal nimmt mit einem Happs fast 500.000 Kilokalorien zu sich.");




    public Integer getId() {
        return id;
    }
    public String getFact() {
        return fact;
    }

    @Override
    public String toString() {
        return "Funfacts{" +
                "id=" + id +
                ", fact='" + fact + '\'' +
                '}';
    }
    private Integer id;
    private String fact;

    Funfacts(Integer id, String fact) {
        this.id = id;
        this.fact = fact;
    }

    public static Funfacts getZufallFact() {
        int anz = Funfacts.values().length;
        // TODO: Zufallszahl zwischen 1 und anz

        int nr = (int) (Math.random() * anz) + 1;
        return Funfacts.valueOf("FF" + nr);

    }


}