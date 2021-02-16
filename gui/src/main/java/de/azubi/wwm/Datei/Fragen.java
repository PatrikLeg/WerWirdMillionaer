package de.azubi.wwm.Datei;

public class Fragen {
    private Integer id;
    private Integer schwierigkeit;
    private String frage;
    private String antwort1;
    private String antwort2;
    private String antwort3;
    private String antwort4;
    private String antwortsatz;

    public Fragen(Integer id, Integer schwierigkeit, String frage, String antwort1, String antwort2, String antwort3, String antwort4, String antwortsatz) {


    this.id = id;

    this.schwierigkeit = schwierigkeit;

    this.frage = frage;

    this.antwort1 = antwort1;

    this.antwort2 = antwort2;

    this.antwort3 = antwort3;

    this.antwort4 = antwort4;

    this.antwortsatz = antwortsatz;
}
    Fragen f1 = new Fragen(1,2,"Wie viele Zähne hat ein erwachsener Mensch normalerweise?","32","26","30", "63","Ein erwachsener hat je 16 Zähne im Ober und 16 im Unterkiefer.");

    Fragen f2 = new Fragen(2,1,"Welches der folgenden Farben zählt nicht zu den Primärfarben?","Grün", "Blau", "Gelb", "Rot", "Rot, Blau und Gelb sind die drei Primärfarben, Grün ist eine Sekundärfarbe, welche durch Mischung von Blau und Gelb entsteht.");

    Fragen f3 = new Fragen(3,4,"Was soll Cäsar gesagt haben, als er den Rubikon überquerte?", "alea iacta est", "veni, vidi, vici", "divide et empera","et tu, brute", "Übersetzt bedeutet es ‘ Die Würfel sind gefallen’.");

    Fragen f4 = new Fragen(4,3,"Was ist nicht nur eine Programmiersprache, sondern auch eine Insel von Indonesien?", "Java", "Python", "Sumatra", "Medan", "Java ist von den genannten Antworten sowohl eine Insel, als auch eine Programmiersprache.");

    Fragen f5 = new Fragen(5,3,"Wie viele Oscars gewann der Film Titanic?","11","10","12","13","Mit 14 Nominierungen und 11 gewonnenen Oscars ist Titanic auf Platz 1.");

    Fragen f6 = new Fragen(6,3,"Welcher der folgenden Personen wurde für den Friedensnobelpreis nominiert?", "Adolf Hitler", "Mao Tse-Dong", "Osama bin Laden", "Ludwig XIII","Tatsächlich wurde Adolf Hitler 1939, noch vor Ausbruch des 2. Weltkriegs, für den Friedensnobelpreis nominiert.");

    Fragen f7 = new Fragen(7,1,"Wie viele Planeten hat unser Sonnensystem?","8","9","11","12","Ehemals 9 Planeten, da Pluto der Planeten Status im Jahr 2006 aberkannt wurde.");

    Fragen f8 = new Fragen(8,3,"Welche dieser Pflanzen existiert wirklich?", "Goldregen","Silbersonne","Bronzewolke","Platindürre","Goldregen, auch Goldrausch genannt, ist eine beliebte Zierpflanze, welche 2012 sogar zur Giftpflanze des Jahres gewählt wurde.");

    Fragen f9 = new Fragen(9,4,"Wer verbreitete das Heliozentrische Weltbild?", "Nikolaus Kopernikus", "Galileo Galilei", "Leonardo Davinci","Aristoteles", "Unter Heliozentrismus versteht sich, dass die Sonne von Planeten umkreist wird.");

    Fragen f10 = new Fragen(10,3,"Was ist das Maskottchen der japanischen Fußball-Nationalmannschaft?", "Pikachu", "Mario", "Donkey Kong", "Zelda", "Pikachu ist nicht nur das Maskottchen der Japanischen Fußballnationalmannschaft, auch ist es das Maskottchen von Pokémon.");

    Fragen f11 = new Fragen(11,2,"Was ist der zweithöchste Berg Deutschlands?", "Hochwanner","Brocken", "Watzmann", "Zugspitze", "Mit 2744 Metern Höhe, ist die Hochwanner, der zweithöchste Berg Deutschlands.");

    Fragen f12 = new Fragen(12,1,"Welche Farbe haben die Taxis in New York?", "gelb", "beige", "grün", "orange", "Die sogenannten ‘Yellow Cab’ haben deswegen die gelbe Farbe, damit man sie früher von nicht lizensierten Taxis auseinanderhalten konnte.");

    Fragen f13 = new Fragen(13,3,"Wie lang ist der Äquator in etwa?","40.000km","50.000km","10.000km","70.000km","Der Äquator ist die längste waagerechte Linie der Erde. Je näher man dem Äquator kommt, desto wärmer werden die Temperaturen.");

    Fragen f14 = new Fragen(14,3,"Aus wie vielen kleinen Würfeln besteht der originale Zauberwürfel?","26", "22","28","24","Der originale Zauberwürfel, erfunden von Ernő Rubik, hat vier 3*3 Seiten.");

    Fragen f15 = new Fragen(15,2,"Wer schrieb den Erlkönig?","Goethe","Schiller","Böll","Grass","1782 Von Goethe verfasst und handelt von einem sterbenden Jungen in den Armen seines Vaters.");

    Fragen f16 = new Fragen(16,1, "Um welche Art von Fisch handelt es sich bei Nemo aus dem Film ‘Findet Nemo’?","Clownfisch","Zirkusfisch","Orangenfisch","Dompteurfisch", "Nemo und sein Vater Marlin sind Clownfische, sie werden auch Anemonenfische genannt und leben wie der Name bereits sagt in Anemonen.");

    Fragen f17 = new Fragen(17,1,"Welcher Agent steht im Zusammenhang mit der Lizenz zum Töten?", "James Bond", "Jason Bourne", "Ethan Hunt","Kingsmen","In den James Bond Filmen hat ein 00 Agent die Lizenz zum Töten, damit auch James Bond.");

    Fragen f18 = new Fragen(18,1, "Wie lange dauert es, bis die Erde einmal die Sonne umkreist hat?","365 Tage", "24Stunden", "31 Tage", "4 Jahre", "Genau ein Jahr dauert es, bis die Erde einmal die Sonne umlaufen hat, während die eigene Rotation der Erde nur 24h dauert.");

    Fragen f19 = new Fragen(19,2, "Wie nennt sich die Währung in Russland?","Rubel", "Kronen", "Zloty", "Euro", "Des Weiteren existieren in Russland noch die Kopeke welche ein 100stel eines Rubels repräsentieren.");

    Fragen f20 = new Fragen(20, 2,"Was war der erste vollständig Computeranimierte Film?", "Toy Story", "Shrek", "Findet Nemo", "Horton hört ein Hu", "Toy Story kam 1995 erstmals in die Kinos und zählt laut dem American Film Institute zu den 100 besten amerikanischen Filme aller Zeiten.");

    Fragen f21 = new Fragen(21,3,"Wer erfand die Jeans?", "Levi Strauss", "Tom Wrangler", "Peter Diesel", "Tim Mustang", "Nicht nur die Jeans, sondern auch das Kleidungsunternehmen Levis hat seinen Ursprung bei Levi Strauss.");

    Fragen f22 = new Fragen (22,3, "Welcher der folgenden Personen gehört nicht zum Club 27?","Avicii", "Amy Winehouse", "Jimi Hendrix", "Brian Jones", "Avicii, mit bürgerlichem Name Tim Bergling, starb im Jahr 2018 im Alter von 28 und gehört deshalb anders als die anderen Musiker nicht in den Club 27.");

    Fragen f23 = new Fragen (23,1, "Welcher Nadelbaum verliert im Winter seine Nadeln?", "Lärche", "Tanne", "Fichte", "Douglasie", "Die Lärche ist ein Nadelbaum, welcher als einziger im Winter seine Nadeln verliert. Alle anderen Nadelbäume behalten ihre Nadeln über den Winter.");

    Fragen f24 = new Fragen (24,3, "Welches Tier findet man häufiger in den USA als Haustier als tatsächlich in freier Wildbahn?", "Tiger", "Löwe", "Grizzlybär", "Nilpferd", "Während über 5000 Tiger in amerikanischen Haushalten ihr zuhause haben, findet man in freier Wildbahn weniger als 4000. Diese leben vor allem in Ostasien.");

    Fragen f25 = new Fragen (25,4,"Wer schrieb Die Physiker?", "Friedrich Dürrenmatt", "Umberto Eoc", "Franz Kafka", "Goethe"," Die Physiker, laut Untertitel eine Komödie in zwei Akten, ist ein Drama des Schweizer Schriftstellers Friedrich Dürrenmatt. Es entstand im Jahr 1961.");

    Fragen f26 = new Fragen (26,4, " ‘Ich gehe gern durch den Regen, damit mich niemand weinen sehen kann’ Ist ein Zitat von...?", "Charlie Chaplin", "Amy Winehouse", "Frank Sinatra", "Albert Einstein", "Kaum zu erwarten, dass ein solch trauriges Zitat von einem Komiker, nämlich Charlie Chaplin, kommt. Er machte zu seiner Zeit lustige Stummfilme, welche ihn zu einer solchen Bekanntheit machten.");

    Fragen f27 = new Fragen(27,4,"Wie viele Jahre dauert es bis Saturn die Sonne umrundet?","ca. 29 Jahre","ca. 40 Jahre","ca. 10 Jahre","ca. 20 Jahre","Da Saturn über 9 mal weiter entfernt von der Sonne ist als die Erde, braucht er auch deutlich länger um diese zu umrunden.");

    Fragen f28 = new Fragen(28,3,"Wie viele Knochen hat der Körper eines erwachsenen Menschen?","206","164","53","108","Die Zahl der Knochen lässt sich nur ungefähr benennen, dennoch liegt der Konsens bei 206");

    Fragen f29 = new Fragen(29,2,"Wie wird das Wort richtig geschrieben?","Attrappe", "Atrappe", "Attrape", "Atrape","Die richtige Schreibweise ist ‘Attrappe’. Es stammt aus dem Französischen und heißt übersetzt ‘Falle’.");

    Fragen f30 = new Fragen(30,2,"Wie viele Tasten hat üblicherweise ein Klavier?","88","77","66","99","36 schwarze und 52 weiße Tasten ergeben 88");

    Fragen f31 = new Fragen(31,3,"Welches war bereits ein Jugendwort des Jahres?","Gammelfleischparty", "Lauch", "Gib ihm!","Zuckerbergen","2008 wurde das Wort ‘Gammelfleischparty’ zum Wort des Jahres gewählt. Die anderen genannten Worte waren nominierte Jugendwörter für das Jahr 2020.");

    Fragen f32 = new Fragen(32,4,"Was ist die Lebensdauer einer Libelle?","2 bis 8 Wochen","24 Stunden","1 bis 3 Monate","4 bis 14 Tage", "Die meisten Libellen leben zwischen 6 bis 8 Wochen, allerdings existieren auch Unterarten mit einer Lebenszeit von 2 Wochen");

    Fragen f33 = new Fragen(33,3,"Auf welchem Kontinent wurde Elon Musk geboren?", "Afrika", "Amerika", "Europa", "Asien", "Obwohl Musk die meiste Zeit seines Lebens auf dem Kontinent Amerika verbrachte, ist es nicht sein Geburtsort. Geboren wurde er in Pretoria, einer Stadt in Südafrika.");

    Fragen f34 = new Fragen(34,4,"Welches Sternzeichen hatte Albert Einstein?", "Fische", "Widder", "Stier", "Schütze", "Albert Einstein wurde am 14. März 1879 in Ulm geboren. Wurde man in einer Zeitspanne vom 20.02. bis 20.03. Geboren, so hat man das Sternzeichen Fische.");

    Fragen f35 = new Fragen(35,4," Wer hat 1810 die Blechdose zur Konservierung von Lebensmitteln erfunden?", "Peter Durand", "Friedrich Koenig","Joseph von Fraunhofer", "Humphry Davy"," Aufbauend auf der Entdeckung von Nicolas Appert zur Konservierung von Lebensmitteln in Glasgefäßen, entwickelte Durand 1810 ein Verfahren mit Konservendosen.");

    Fragen f36 = new Fragen(36,1," ‘Einigkeit und Recht und Freiheit...’ sind der Anfang welchen Liedes?", "Deutsche Nationalhymne", "Deutschlied", "Deutsche Werte", "Deutschland", "Dies sind die ersten Strophen der Deutschen Nationalhymne. Die Melodie entstammt der alten österreichischen Kaiserhymne von Joseph Haydn, komponiert 1796/97.");

    Fragen f37 = new Fragen(37,4,"Wofür hält Paul Hunn den Rekord, der bei 109,9 Dezibel lag?", "Rülpsen", "Kauen", "Stampfen", "Finger Knacksen", "Paul Hunn ist ein Londoner, der 2009 mit 109,9 Dezibel den Weltrekord aufstieß, was einem Triebwerk beim Start entspricht.");

    Fragen f38 = new Fragen(38,1,"Welches Blatt ist auf der kanadischen Flagge zu erkennen?", "Ahorn", "Buche", "Eiche", "Birke", "Es ist ein Ahornblatt, dies wurde wohl gewählt, da schon in Urzeiten die Einwohner Kanadas Ahorn-Sirup zur Zubereitung von Essen verwendeten.");

    Fragen f39 = new Fragen(39, 2, "Welches Land ist das einzige, welches keine rechteckige Flagge hat?", "Nepal", "Kasachstan", "Bangladesh", "Mongolei", "Statt einer rechteckigen Flagge hat die Flagge von Nepal eine Form, welche aussieht, wie zwei aufeinandergesetzte Dreiecke.");

    Fragen f40 = new Fragen(40, 2, "Wer ist auch als der ‘Sonnenkönig’ bekannt?", "Ludwig XIV", "Karl der Kahle", "Iwan der Schreckliche", "Ludwig VII", "Ludwig XIV, König von Frankreich, hatte auch den Namen Sonnenkönig. Den Namen bekam er, da er in einem extremen Luxus lebte, welcher von vielen Fürsten nachgeahmt wurde.");

    Fragen f41 = new Fragen(41, 4, "Wie viele Atemzüge nimmt der Menschliche Körper täglich auf", "20.000", "5.000", "40.000", "1.000", "Ein erwachsener Mensch atmet im Durchschnitt 12- bis 15-mal in der Minute.");

    Fragen f42 = new Fragen(42, 1, "Aus welcher Kultur stammt der Traumfänger?", "Indianische", "Jüdische", "Fernöstliche", "Islamische", "Der Traumfänger soll den Schlaf verbessern, es wird angenommen, dass gute Träume durch das Netz gehen, und schlechte hängen bleiben.");

    Fragen f43 = new Fragen(43, 1, "Welches Glas kennt man aus dem Chemieunterricht?", "Reagenzglas", "Fernglas", "Kirchenglas","Weinglas"," Reagenzgläser werden in Laboratorien für chemische Reaktionen, Untersuchungen, zur Aufbewahrung von kleinen Flüssigkeitsmengen und vielem Weiteren verwendet.");

    Fragen f44 = new Fragen(44, 1, "Was tauscht ein Brautpaar während der Trauerzeremonie?", "Ringe", "Tagebücher", "Unterwäsche", "Panini-Sammelbilder", "Die Eheringe haben ihren Ursprung in Ägypten. Sie wurden damals auf der linken Hand getragen.");

    Fragen f45 = new Fragen(45, 2, "Wie heißt bei Modenschauen der Laufsteg noch?", "Catwalk", "Horseroad", "Mouserun", "Dogstreet", "Beim Catwalk laufen Models über einen Laufsteg und präsentieren so meist die Designerkleidung eines Designers.");

    Fragen f46 = new Fragen(46, 3, "Wie nennt man angehörige der UN-Friedenstruppe?", "Blauhelme", "Blaustrümpfe", "Blaujacken", "Blauschilde", "Der Name kommt tatsächlich daher, dass die Personen, welche Bestandteil der Gruppe sind, blaue Helme tragen.");

    Fragen f47 = new Fragen(47, 2, "Was gehört nicht zur Dialektik?", "Photosynthese", "These", "Antithese", "Synthese", "Es ist die Kunst der Gesprächsführung und die Fähigkeit, den Diskussionspartner in Rede und Gegenrede zu überzeugen.");

    Fragen f48 = new Fragen(48, 2, "Wer wurde durch seine ‘I Have a Dream’ Rede bekannt?", "Martin Luther King", "Nelson Mandela", "John F. Kennedy", "Mahatma Gandhi", "Diese Rede und seine Worte ‘I have a Dream’, gehört zu den 100 politisch wichtigsten Reden überhaupt. King setzte sich für die Gleichheit der Menschen ein.");

    Fragen f49 = new Fragen(49, 3, "Wie heißt eine daoistische Harmonielehre aus China?", "Feng Shui", "Fen Schuji", "Feng Shuj", "Fen Schui", "Ziel des Feng-Shui ist die Harmonisierung des Menschen mit seiner Umgebung, die durch eine besondere Gestaltung der Wohn- und Lebensräume erreicht werden soll.");

    Fragen f50 = new Fragen(50, 2, "Wie lautet eine Bezeichnung für ein aufgefundenes Kind, das zuvor von den Eltern ausgesetzt wurde?", "Findelkind", "Schlüsselkind", "Wolfskind", "Schmuddelkind", "Findling oder auch Fundkind genannt, wurden häufig als Säugling ausgesetzt, in der Hoffnung, dass sich jemand um sie kümmern würde.");


    public Integer getid() { return id; }

    public void setid(Integer id) { this.id = id; }

    public Integer getschwierigkeit() { return schwierigkeit; }

    public void setschwierigkeit(Integer schwierigkeit) { this.schwierigkeit = schwierigkeit; }

    public String getfrage() { return frage; }

    public void setfrage(String frage) { this.frage = frage; }

    public String getantwort1() { return antwort1; }

    public void setantwort1(String antwort1) { this.antwort1 = antwort1; }

    public String getantwort2() { return antwort2; }

    public void setantwort2(String antwort2) { this.antwort2 = antwort2; }

    public String getantwort3() { return antwort3; }

    public void setantwort3(String antwort3) { this.antwort1 = antwort3; }

    public String getantwort4() { return antwort4; }

    public void setantwort4(String antwort4) { this.antwort4 = antwort4; }

    public String getantwortsatz() { return antwortsatz; }

    public void setantwortsatz(String antwortsatz) { this.antwortsatz = antwortsatz; }


    @Override
    public String toString() {
        return "Fragen{" +
                "id='" + id + '\'' +
                ", schwierigkeit ='" + schwierigkeit + '\'' +
                ", frage='" + frage + '\'' +
                ", antwort1='" + antwort1  + '\'' +
                ", antwort2  ='" + antwort2 + '\'' +
                ", antwort3 '" + antwort3 + '\'' +
                ", antwort4 ='" + antwort4 + '\'' +
                ", antwortsatz ='" + antwortsatz + '\'' +
                '}';
    }


}


