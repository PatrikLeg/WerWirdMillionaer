package de.azubi.wwm.datei;


import java.util.ArrayList;
import java.util.List;

public enum Fragen {
    F1(1,2,"Wie viele Zähne hat ein erwachsener Mensch normalerweise?","32","26","30","63","Ein erwachsener hat je 16 Zähne im Ober und 16 im Unterkiefer."),

    F2(2, 1, "Welches der folgenden Farben zählt nicht zu den Primärfarben?", "Grün", "Blau", "Gelb", "Rot", "Rot,Blau und Gelb sind die drei Primärfarben,Grün ist eine Sekundärfarbe,welche durch Mischung von Blau und Gelb entsteht."),

    F3(3, 4, "Was soll Cäsar gesagt haben,als er den Rubikon überquerte?", "alea iacta est", "veni,vidi,vici", "divide et empera", "et tu,brute", "Übersetzt bedeutet es ‘ Die Würfel sind gefallen’."),

    F4(4, 3, "Was ist nicht nur eine Programmiersprache,sondern auch eine Insel von Indonesien?", "Java", "Python", "Sumatra", "Medan", "Java ist von den genannten Antworten sowohl eine Insel,als auch eine Programmiersprache."),

    F5(5, 3, "Wie viele Oscars gewann der Film Titanic?", "11", "10", "12", "13", "Mit 14 Nominierungen und 11 gewonnenen Oscars ist Titanic auf Platz 1."),

    F6(6, 3, "Welcher der folgenden Personen wurde für den Friedensnobelpreis nominiert?", "Adolf Hitler", "Mao Tse-Dong", "Osama bin Laden", "Ludwig XIII", "Tatsächlich wurde Adolf Hitler 1939,noch vor Ausbruch des 2. Weltkriegs,für den Friedensnobelpreis nominiert."),

    F7(7, 1, "Wie viele Planeten hat unser Sonnensystem?", "8", "9", "11", "12", "Ehemals 9 Planeten,da Pluto der Planeten Status im Jahr 2006 aberkannt wurde."),

    F8(8, 3, "Welche dieser Pflanzen existiert wirklich?", "Goldregen", "Silbersonne", "Bronzewolke", "Platindürre", "Goldregen,auch Goldrausch genannt,ist eine beliebte Zierpflanze,welche 2012 sogar zur Giftpflanze des Jahres gewählt wurde."),

    F9(9, 4, "Wer verbreitete das Heliozentrische Weltbild?", "Nikolaus Kopernikus", "Galileo Galilei", "Leonardo Davinci", "Aristoteles", "Unter Heliozentrismus versteht sich,dass die Sonne von Planeten umkreist wird."),

    F10(10, 3, "Was ist das Maskottchen der japanischen Fußball-Nationalmannschaft?", "Pikachu", "Mario", "Donkey Kong", "Zelda", "Pikachu ist nicht nur das Maskottchen der Japanischen Fußballnationalmannschaft,auch ist es das Maskottchen von Pokémon."),

    F11(11, 2, "Was ist der zweithöchste Berg Deutschlands?", "Hochwanner", "Brocken", "Watzmann", "Zugspitze", "Mit 2744 Metern Höhe,ist die Hochwanner,der zweithöchste Berg Deutschlands."),

    F12(12, 1, "Welche Farbe haben die Taxis in New York?", "gelb", "beige", "grün", "orange", "Die sogenannten ‘Yellow Cab’ haben deswegen die gelbe Farbe,damit man sie früher von nicht lizensierten Taxis auseinanderhalten konnte."),

    F13(13, 3, "Wie lang ist der Äquator in etwa?", "40.000km", "50.000km", "10.000km", "70.000km", "Der Äquator ist die längste waagerechte Linie der Erde. Je näher man dem Äquator kommt,desto wärmer werden die Temperaturen."),

    F14(14, 3, "Aus wie vielen kleinen Würfeln besteht der originale Zauberwürfel?", "26", "22", "28", "24", "Der originale Zauberwürfel,erfunden von Ernő Rubik,hat vier 3*3 Seiten."),

    F15(15, 2, "Wer schrieb den Erlkönig?", "Goethe", "Schiller", "Böll", "Grass", "1782 Von Goethe verfasst und handelt von einem sterbenden Jungen in den Armen seines Vaters."),

    F16(16, 1, "Um welche Art von Fisch handelt es sich bei Nemo aus dem Film ‘Findet Nemo’?", "Clownfisch", "Zirkusfisch", "Orangenfisch", "Dompteurfisch", "Nemo und sein Vater Marlin sind Clownfische,sie werden auch Anemonenfische genannt und leben wie der Name bereits sagt in Anemonen."),

    F17(17, 1, "Welcher Agent steht im Zusammenhang mit der Lizenz zum Töten?", "James Bond", "Jason Bourne", "Ethan Hunt", "Kingsmen", "In den James Bond Filmen hat ein 00 Agent die Lizenz zum Töten,damit auch James Bond."),

    F18(18, 1, "Wie lange dauert es,bis die Erde einmal die Sonne umkreist hat?", "365 Tage", "24Stunden", "31 Tage", "4 Jahre", "Genau ein Jahr dauert es,bis die Erde einmal die Sonne umlaufen hat,während die eigene Rotation der Erde nur 24h dauert."),

    F19(19, 2, "Wie nennt sich die Währung in Russland?", "Rubel", "Kronen", "Zloty", "Euro", "Des Weiteren existieren in Russland noch die Kopeke welche ein 100stel eines Rubels repräsentieren."),

    F20(20, 2, "Was war der erste vollständig Computeranimierte Film?", "Toy Story", "Shrek", "Findet Nemo", "Horton hört ein Hu", "Toy Story kam 1995 erstmals in die Kinos und zählt laut dem American Film Institute zu den 100 besten amerikanischen Filme aller Zeiten."),

    F21(21, 3, "Wer erfand die Jeans?", "Levi Strauss", "Tom Wrangler", "Peter Diesel", "Tim Mustang", "Nicht nur die Jeans,sondern auch das Kleidungsunternehmen Levis hat seinen Ursprung bei Levi Strauss."),

    F22(22, 3, "Welcher der folgenden Personen gehört nicht zum Club 27?", "Avicii", "Amy Winehouse", "Jimi Hendrix", "Brian Jones", "Avicii,mit bürgerlichem Name Tim Bergling,starb im Jahr 2018 im Alter von 28 und gehört deshalb anders als die anderen Musiker nicht in den Club 27."),

    F23(23, 1, "Welcher Nadelbaum verliert im Winter seine Nadeln?", "Lärche", "Tanne", "Fichte", "Douglasie", "Die Lärche ist ein Nadelbaum,welcher als einziger im Winter seine Nadeln verliert. Alle anderen Nadelbäume behalten ihre Nadeln über den Winter."),

    F24(24, 3, "Welches Tier findet man häufiger in den USA als Haustier als tatsächlich in freier Wildbahn?", "Tiger", "Löwe", "Grizzlybär", "Nilpferd", "Während über 5000 Tiger in amerikanischen Haushalten ihr zuhause haben,findet man in freier Wildbahn weniger als 4000. Diese leben vor allem in Ostasien."),

    F25(25, 4, "Wer schrieb Die Physiker?", "Friedrich Dürrenmatt", "Umberto Eoc", "Franz Kafka", "Goethe", " Die Physiker,laut Untertitel eine Komödie in zwei Akten,ist ein Drama des Schweizer Schriftstellers Friedrich Dürrenmatt. Es entstand im Jahr 1961."),

    F26(26, 4, " ‘Ich gehe gern durch den Regen,damit mich niemand weinen sehen kann’ Ist ein Zitat von...?", "Charlie Chaplin", "Amy Winehouse", "Frank Sinatra", "Albert Einstein", "Kaum zu erwarten,dass ein solch trauriges Zitat von einem Komiker,nämlich Charlie Chaplin,kommt. Er machte zu seiner Zeit lustige Stummfilme,welche ihn zu einer solchen Bekanntheit machten."),

    F27(27, 4, "Wie viele Jahre dauert es bis Saturn die Sonne umrundet?", "ca. 29 Jahre", "ca. 40 Jahre", "ca. 10 Jahre", "ca. 20 Jahre", "Da Saturn über 9 mal weiter entfernt von der Sonne ist als die Erde,braucht er auch deutlich länger um diese zu umrunden."),

    F28(28, 3, "Wie viele Knochen hat der Körper eines erwachsenen Menschen?", "206", "164", "53", "108", "Die Zahl der Knochen lässt sich nur ungefähr benennen,dennoch liegt der Konsens bei 206"),

    F29(29, 2, "Wie wird das Wort richtig geschrieben?", "Attrappe", "Atrappe", "Attrape", "Atrape", "Die richtige Schreibweise ist ‘Attrappe’. Es stammt aus dem Französischen und heißt übersetzt ‘Falle’."),

    F30(30, 2, "Wie viele Tasten hat üblicherweise ein Klavier?", "88", "77", "66", "99", "36 schwarze und 52 weiße Tasten ergeben 88"),

    F31(31, 3, "Welches war bereits ein Jugendwort des Jahres?", "Gammelfleischparty", "Lauch", "Gib ihm!", "Zuckerbergen", "2008 wurde das Wort ‘Gammelfleischparty’ zum Wort des Jahres gewählt. Die anderen genannten Worte waren nominierte Jugendwörter für das Jahr 2020."),

    F32(32, 4, "Was ist die Lebensdauer einer Libelle?", "2 bis 8 Wochen", "24 Stunden", "1 bis 3 Monate", "4 bis 14 Tage", "Die meisten Libellen leben zwischen 6 bis 8 Wochen,allerdings existieren auch Unterarten mit einer Lebenszeit von 2 Wochen"),

    F33(33, 3, "Auf welchem Kontinent wurde Elon Musk geboren?", "Afrika", "Amerika", "Europa", "Asien", "Obwohl Musk die meiste Zeit seines Lebens auf dem Kontinent Amerika verbrachte,ist es nicht sein Geburtsort. Geboren wurde er in Pretoria,einer Stadt in Südafrika."),

    F34(34, 4, "Welches Sternzeichen hatte Albert Einstein?", "Fische", "Widder", "Stier", "Schütze", "Albert Einstein wurde am 14. März 1879 in Ulm geboren. Wurde man in einer Zeitspanne vom 20.02. bis 20.03. Geboren,so hat man das Sternzeichen Fische."),

    F35(35, 4, " Wer hat 1810 die Blechdose zur Konservierung von Lebensmitteln erfunden?", "Peter Durand", "Friedrich Koenig", "Joseph von Fraunhofer", "Humphry Davy", " Aufbauend auf der Entdeckung von Nicolas Appert zur Konservierung von Lebensmitteln in Glasgefäßen,entwickelte Durand 1810 ein Verfahren mit Konservendosen."),

    F36(36, 1, " ‘Einigkeit und Recht und Freiheit...’ sind der Anfang welchen Liedes?", "Deutsche Nationalhymne", "Deutschlied", "Deutsche Werte", "Deutschland", "Dies sind die ersten Strophen der Deutschen Nationalhymne. Die Melodie entstammt der alten österreichischen Kaiserhymne von Joseph Haydn,komponiert 1796/97."),

    F37(37, 4, "Wofür hält Paul Hunn den Rekord,der bei 109,9 Dezibel lag?", "Rülpsen", "Kauen", "Stampfen", "Finger Knacksen", "Paul Hunn ist ein Londoner,der 2009 mit 109,9 Dezibel den Weltrekord aufstieß,was einem Triebwerk beim Start entspricht."),

    F38(38, 1, "Welches Blatt ist auf der kanadischen Flagge zu erkennen?", "Ahorn", "Buche", "Eiche", "Birke", "Es ist ein Ahornblatt,dies wurde wohl gewählt,da schon in Urzeiten die Einwohner Kanadas Ahorn-Sirup zur Zubereitung von Essen verwendeten."),

    F39(39, 2, "Welches Land ist das einzige,welches keine rechteckige Flagge hat?", "Nepal", "Kasachstan", "Bangladesh", "Mongolei", "Statt einer rechteckigen Flagge hat die Flagge von Nepal eine Form,welche aussieht,wie zwei aufeinandergesetzte Dreiecke."),

    F40(40, 2, "Wer ist auch als der ‘Sonnenkönig’ bekannt?", "Ludwig XIV", "Karl der Kahle", "Iwan der Schreckliche", "Ludwig VII", "Ludwig XIV,König von Frankreich,hatte auch den Namen Sonnenkönig. Den Namen bekam er,da er in einem extremen Luxus lebte,welcher von vielen Fürsten nachgeahmt wurde."),

    F41(41, 4, "Wie viele Atemzüge nimmt der Menschliche Körper täglich auf", "20.000", "5.000", "40.000", "1.000", "Ein erwachsener Mensch atmet im Durchschnitt 12- bis 15-mal in der Minute."),

    F42(42, 1, "Aus welcher Kultur stammt der Traumfänger?", "Indianische", "Jüdische", "Fernöstliche", "Islamische", "Der Traumfänger soll den Schlaf verbessern,es wird angenommen,dass gute Träume durch das Netz gehen,und schlechte hängen bleiben."),

    F43(43, 1, "Welches Glas kennt man aus dem Chemieunterricht?", "Reagenzglas", "Fernglas", "Kirchenglas", "Weinglas", " Reagenzgläser werden in Laboratorien für chemische Reaktionen,Untersuchungen,zur Aufbewahrung von kleinen Flüssigkeitsmengen und vielem Weiteren verwendet."),

    F44(44, 1, "Was tauscht ein Brautpaar während der Trauzeremonie?", "Ringe", "Tagebücher", "Unterwäsche", "Panini-Sammelbilder", "Die Eheringe haben ihren Ursprung in Ägypten. Sie wurden damals auf der linken Hand getragen."),

    F45(45, 2, "Wie heißt bei Modenschauen der Laufsteg noch?", "Catwalk", "Horseroad", "Mouserun", "Dogstreet", "Beim Catwalk laufen Models über einen Laufsteg und präsentieren so meist die Designerkleidung eines Designers."),

    F46(46, 3, "Wie nennt man angehörige der UN-Friedenstruppe?", "Blauhelme", "Blaustrümpfe", "Blaujacken", "Blauschilde", "Der Name kommt tatsächlich daher,dass die Personen,welche Bestandteil der Gruppe sind,blaue Helme tragen."),

    F47(47, 2, "Was gehört nicht zur Dialektik?", "Photosynthese", "These", "Antithese", "Synthese", "Es ist die Kunst der Gesprächsführung und die Fähigkeit,den Diskussionspartner in Rede und Gegenrede zu überzeugen."),

    F48(48, 2, "Wer wurde durch seine ‘I Have a Dream’ Rede bekannt?", "Martin Luther King", "Nelson Mandela", "John F. Kennedy", "Mahatma Gandhi", "Diese Rede und seine Worte ‘I have a Dream’,gehört zu den 100 politisch wichtigsten Reden überhaupt. King setzte sich für die Gleichheit der Menschen ein."),

    F49(49, 3, "Wie heißt eine daoistische Harmonielehre aus China?", "Feng Shui", "Fen Schuji", "Feng Shuj", "Fen Schui", "Ziel des Feng-Shui ist die Harmonisierung des Menschen mit seiner Umgebung,die durch eine besondere Gestaltung der Wohn- und Lebensräume erreicht werden soll."),

    F50(50, 2, "Wie lautet eine Bezeichnung für ein aufgefundenes Kind,das zuvor von den Eltern ausgesetzt wurde?", "Findelkind", "Schlüsselkind", "Wolfskind", "Schmuddelkind", "Findling oder auch Fundkind genannt,wurden häufig als Säugling ausgesetzt,in der Hoffnung,dass sich jemand um sie kümmern würde."),

    F51(51, 1, "Wie werden die Häuser der Inuit genannt?", "Iglu", "Bungalow", "Bunker", "Eishaus", "Iglus sind aufgrund ihrer Kuppelform ein guter Wärmeisolator und halten so auch bei eisigen Temperaturen warm."),

    F52(52,3,"Wann wurde das Euro-Bargeld eingeführt?","1.1.2002","1.1.2000","31.12.2002","31.12.2000","Die Bundesrepublik Deutschland und elf weitere Mitgliedsstaaten der Europäischen Union (EU) führten am 1. Januar 2002 den Euro offiziell als Bargeld ein."),

    F53(53,3,"Wie viele Bandscheiben findet man in der Wirbelsäule von gesunden Menschen?","23","17","10","32","Außer dem ersten und zweiten Halswirbel sind alle benachbarten Wirbel durch Bandscheiben miteinander verbunden."),

    F54(54, 2, "Wo findet man Guppys oder Neonsalmler am ehesten?", "Aquarium", "Terrarium", "Solarium", "Planetarium", "Guppys und Neonsalmler zählen zu den beliebtesten Zierfischen für Süßwasser-Aquarien."),

    F55(55,2,"Schauspielerin, Sängerin, Sexsymbol: Wie kam die Ikone Marilyn Monroe ums Leben?","Medikamentenvergiftung","Alkoholvergiftung","Autonunfall","Krebs"," Die Filmikone starb in der Nacht vom 4. auf den 5. August 1962 an einer Überdosis verschiedener Schlafmittel."),

    F56(56, 2, "Was ist zumindest für Monopoly-Spieler ganz selbstverständlich?", "Frei Parken", "Gratis Anreisen", "Kostenlos wohnen", "Umsonst trinken", "Monopoly zählt zu einem der weltweit beliebtesten Brettspiele und gibt es in jeglichen Varianten, wie beispielsweise Star Wars, Super Mario oder The Walking Dead."),

    F57(57,2,"In welcher Höhe hängt der Korb beim Basketball?","3,05m","2,80m","3,50m","3,00m","Genauer gesagt, muss der Ring des Korbs nach den Vorgaben der Basketball Bundes Liga, und aller weiteren Ligen wie der NBA, auf dieser Höhe hängen."),

    F58(58,1,"Welches Instrument registriert die Erschütterungen eines Erdbebens?","Seismograph","Geigerzähler","Zyklotron","Metronom","Normalerweise sind Seismographen an der Erdoberfläche installiert, es gibt zum Beispiel auch Messgeräte am Ozeanboden."),

    F59(59,2,"Wann wurde das erste IPad von Apple verkauft?","2010","2002","2012","2000","Auch wenn es sich schon länger anfühlen mag, das erste iPad wurde 'erst' im Jahr 2010 verkauft."),

    F60(60, 1, "Statistisch gesehen ist etwa jeder 24. Einwohner Deutschlands ein...?", "Berliner", "Broetchen", "Croissant", "Plaetzchen", "Während Deutschland rund 83 Mio. Einwohner hat (Stand 2019), hat Berlin eine Einwohnerzahl von knapp 3,8 MIo."),

    F61(61,2,"Wann starb Pop-Ikone Michael Jackson?","25. Juni 2009","17.August 2007","5. Juli 2010","13. Mai 2008","Der 'King of Pop' starb mit 50 Jahren an einer Vergiftung durch ein Narkosemittel."),

    F62(62,1,"In welcher Metropolregion leben die meisten Menschen der Welt?","Tokio","New York","Sau Paulo","Mexico-City","Mit über 38 Millionen Einwohnern besitzt Tokio damit eine höhere Bevölkerung als das gesamte Land Kanada (36,7 Millionen)"),

    F63(63, 2, "Was ist jedem Basketballfan ein Begriff?", "New York Knicks", "Los Angelos Verneigung", "Las Vegas Umarmung", "San Francisco Handkuss", "Die New York Knicks, auch ‘New York Knickerbockers’ genannt haben ihr Stadion namens Madison Square Garden."),

    F64(64, 1, "Welches Ereignis gilt als Auslöser des Ersten Weltkrieges?","Attentat von Sarajevo","Attentat von Wien","Attentat von Berlin","Attentat von Budapest","Vor 100 Jahren ermorden Attentäter den habsburgischen Thronfolger Erzherzog Franz Ferdinand und seine Frau Sophie in Sarajevo"),

    G65(65, 3, "Was ist Tim aus der Comicreihe ‘Tim und Struppi’ hauptberuflich?", "Reporter", "Postbote", "Meteorologe", "Poet", "Tim und Struppi ist eine Comicreihe geschrieben von Georges Prosper Remi. Den ersten Comic schreib er 1929."),

    F66(66, 4," Wie wird der Bruch im Jahre 1054 zwischen der römisch-katholischen und der östlich-orthodoxen Kirche bezeichnet?","Schisma","Exkommunikation","Separation","Trennung"," Der Ausdruck Schisma bezeichnet die Spaltung innerhalb einer Glaubensgemeinschaft ohne Ausbildung einer neuen Auffassung."),

    F67(67, 4,"Wie heißt der Erfinder der Zahl 0?","Aryabhata","Euklid","Sokrates","Archimedes","Aryabhata I. war ein bedeutender indischer Mathematiker und Astronom"),

    F68(68, 1, "Wie heißt eine für ihre alkoholischen Getränke weltberühmte französische Region?", "Champagne", "Prostvence", "Biergund", "Whiskardie", "Schon seit Römerzeiten gab es dort Weinbau. Nur Schaumwein, der aus diesem Gebiet entstammt, darf als Champagner bezeichnet werden."),

    F69(69, 2,"Begründer der Psychoanalyse war?","Sigmund Freud","John B. Watson","Edward Thorndike","Carl Gustav Jung","Die Psychoanalyse ist die von Sigmund Freud entwickelte Methode, den unbewussten Teil des psychischen Lebens zu erforschen"),

    F70(70,1,"Welches deutsche Nachrichtenmagazin heißt wie ein Haushaltsgegenstand?","Der Spiegel","Der Löffel","Der Tisch","das Messer"," Der Spiegel ist ein deutsches Nachrichtenmagazin, das im Spiegel-Verlag in Hamburg erscheint"),

    F71(71, 4, "Was soll der Koch George Crum 1853 erfunden haben, als ihn ein nörgelnder Gast nervte?", "Kartoffelchips", "Hacksteak", "Fischstäbchen", "Zuckerwürfel", "Es heißt, ein Gast beschwerte sich darüber, dass die frittierten Kartoffelscheiben nicht dünn genug und auch nicht genügend gewürzt wurden, woraufhin Crum diese so dünn schneidete und so stark würzte, dass daraus Chips entstanden."),

    F72(72, 3, "Wobei handelt es sich um sogenanntes Hochwild?", "Adler", "Fasan", "Fuchs", "Hase", "Früher war das Jagen ein Privileg, welcher meist nur dem Adel vergönnt war. Hochwild zu jagen war nur dem Hochadel vorbehalten, während das Niederwild auch vom niederen Adel und anderen ausgewählten Personengruppen bejagt werden durfte."),

    F73(73, 4, "Auf welche Pflanze bezieht sich angesichts der Wortherkunft die Farbe lila?", "Flieder", "Lavendel", "Lilien", "Krokus", "Flieder fällt anhand seiner hellen lilanen Farbe direkt auf, weshalb er auch oft als Zierpflanze genutzt wird. Neben lila gibt es ihn auch in weiß."),

    F74(74, 3, "Welche Tiere haben eine sogenannte ‘Radula’, auf welcher viele Zähnchen sitzen?", "Schnecken", "Haie", "Ameisen", "Anglerfische", "Die Radula wird auch Raspel- oder Reibzunge genannt und ist bei Weichtieren wie auch Schnecken aufzufinden."),

    F75(75,3,"Welche Wissenschaft kennt Spreizungszonen?","Geologie","Physik","Medizin","Biologie","Bewegen sich an den Plattengrenzen verschiedene Platten auseinander, spricht man von einer Spreizungszone"),

    F76(76, 1, "Wie vermehren sich Pilze?", "Durch Sporen", "Durch Samen", "Durch Sattel", "Durch Wasser", "Pilze geben ihre Sporen frei, welche auf dem Boden landen und dort zu weiteren Pilzen wachsen."),

    F77(77,1,"Wie war der Name der Widerstandsgruppe  gegen den Nationalsozialismus?","Weiße Rose","Nelkenliga","Schwarze Orchidee","Begonienklub","Sophie und ihr Bruder Hans Scholl kämpften als Teil der Widerstandsgruppe 'Weiße Rose' gegen die Diktatur des Nationalsozialismus. Dafür wurden sie zum Tode verurteilt."),

    F78(78, 4, "Welches Tier kann die Entwicklung des Embryos aktiv beeinflussen, dass die Geburt erst später passiert als normal?", "Stinktiere", "Kängurus", "Koalabären", "Wildhasen", "Weibliche Stinktiere können dies beeinflussen, um im Falle von fehlender Nahrung, das bald Neugeborene richtig ernähren zu können."),

    F79(79, 1,"Der Amerikaner österreichisch-ungarischer Herkunft Harry Houdini war ein...?","Entfesselungs und Zauberkünstler","Autokonstrukteur","Nobelpreisträger","Möbeldesigner und Innenarchitekt","Der Berühmteste Zauberer war Harry Houdini, er war der beste Entfesselungskünstler aller Zeiten."),

    F80(80, 4, "Mit welcher Geschwindigkeit geschah der erste Autounfall der Welt?", "6km/h", "20km/h", "40km/h", "100km/h", "Der Unfall geschah 1896 in London. Die Frau, welche in den Unfall verwickelt war, starb dabei."),

    F81(81, 3, "Wo geschehen die meisten Knochenbrüche?", "Speiche", "Oberarmknochen", "Schambein", "Großer Zehknochen", "Die Speichenfraktur ist die häufigste Fraktur des menschlichen Körpers. In einer Stadt mit 40.000 würde es jährlich zu 100 Speichenbrüchen kommen."),

    F82(82, 1, "In wie viele Besatzungszonen wurde Deutschland nach dem 2. Weltkrieg aufgeteilt?", "4", "3", "5", "1", "Die vier Besatzungszonen gehörten zu den USA, Frankreich, Großbritannien und der UdSSR."),

    F83(83, 3,"Wie hieß der erste Satellit?","Sputnik","Kosmos","Apollo","IO"," Sputnik 1 war der erste künstliche Erdsatellit, gestartet am 4. Oktober 1957"),

    F84(84, 1, "Aus wie vielen Atomen besteht ein Wasser Molekül?", "3", "5", "2", "1", "Ein Wasser Molekül besteht aus einem Wasserstoffatom H und zwei Sauerstoffmolekülen O."),

    F85(85, 2, "Was ist das Elementsymbol von Gold?", "Au", "Go", "Ag", "Ga", "Au, ausgeschrieben Aurum, lateinisch für Gold, ist ein Metall mit der Ordnungszahl 79."),

    F86(86, 2,"Wer ist der Begründer der modernen Türkei?","Mustafa Kemal Atatürk","Recep Tayyip Erdogan","Orhan Pamuk","Osman I","Mustafa Kemal Atatürk war sowohl Gründer als auch erster Präsident der Türkei"),

    F87(87, 2, "Was heißt ‘RTL’ ausgeschrieben?", "Radio Télévision Luxembourg", "Radio Television London", "Radio Télévision Lyon", "Radio Television Leipzig", "RTL ist ein Privatsender mit Sitz in Köln. Er ist als Ableger des deutschsprachigen Radioprogramms Radio Luxemburg entstanden."),

    F88(88, 2, "Von wem stammt das Buch ‘Das Parfum’?", "Patrick Süskind", "Agatha Christie", "Oscar Wilde", "Joseph von Eichendorff", "’Das Parfum’ aus dem Jahre 1985 handelt von einem Parfumeur, welcher mit einem sehr stark ausgeprägten Geruchsinn geboren wurde."),

    F89(89, 3," Wann entdeckte Christoph Kolumbus Amerika?","1492","1482","1499","1502","1492 entdeckt Christoph Kolumbus die 'Neue Welt'. Eine neue Zeit beginnt, keine gute für die Ureinwohner des Kontinents"),

    F90(90, 1,"Welches ist das leichteste Element im Periodensystem?","Wasserstoff","Neon","Helium","Methan","Das kommt daher, dass Wasserstoff die geringste Dichte hat"),

    F91(91, 3, "Welches dieser Elemente existiert tatsächlich im Periodensystem?", "Darmstadtium", "Nuernbergium", "Berlinium", "Wuppertalium", "Darmstadtium, welches die Ordnungszahl 110 hat, wurde nach der Stadt Darmstadt benannt, da es dort als erstes erzeugt wurde."),

    F92(92, 3, "Welche Höhe hat der größte Hund der Welt?", "1,09m", "1m", "1, 32m", "1,74m", "Die Deutsche Dogge George hat mit 4 Jahren eine Höhe von ganzen 1,09m und eine Länge von 2,2m erreicht, somit ist er auf die Höhe bezogen, der weltweit größte Hund."),

    F93(93, 3,"Wie viel Prozent unserer Erdoberfläche ist dauerhaft gefroren?","17%","11%","29%","35%","Die dauerhaft gefrorenen Bereiche nennt man auch Permafrostböden. Auf der Nordhalbkugel ist ein Viertel des Bodens dauerhaft gefroren"),

    F94(94,2,"Wann breitete sich SARS-CoV-1 aus?","ab 2002","ab 2005", "ab 2001","ab 2004","Im November 2002 begann die erste durch SARS-CoV hervorgerufene Pandemie. Infiziert waren 8.000 Menschen in 26 Ländern der Erde"),

    F95(95, 2, "Welcher ehemalige Fußballspieler war für seine Kokain-Affäre allbekannt?", "Christoph Daum", "Gerd Müller", "Lothar Matthäus", "Thomas Allofs", "Christoph Daum ist ein deutscher Fußballtrainer, welcher sogar im Jahr 2016 bis 2017 Trainer der rumänischen Nationalmannschaft war. Im Jahr 2000 "),

    F96(96, 2, "Wer war der erste schwarze Präsident der USA?", "Barack Obama", "Usain Bolt", "Nelson Mandela", "Kanye West" , "Barack Obama war von 2009 bis 2017 der 44. Präsident der Vereinigten Staaten."),

    F97(97,3,"Wann begann die Ausstrahlung des Farbfernsehens in der BRD?","am 25. August 1967","am 25 August 1962","am 25. August 1971","am 25. August 1973","Der Start des Farbfernsehens in der Bundesrepublik Deutschland erfolgte um 10:57 Uhr mit der Betätigung eines großen roten Tasters durch Vizekanzler Willy Brandt"),

    F98(98,4,"Wo liegt die Taklamakan Wüste, die zweitgrößte Sandwüste der Welt?","in China","in Russland","in Australien","in Chile"," Die chinesische Sandwüste besitzt Dünen, die bis zu 300 Meter hoch werden können."),

    F99(99,3,"Iwan Wassiljewitsch trug den Beinamen ‘der Schreckliche’. Wer war er?", "Der erste Großfürst von Moskau","Ein bekannter Wikinger","Der König von Preußen","Der letzte Kaiser des Russischen Reiches","Iwan IV. Wassiljewitsch, der Schreckliche, geboren am 25. August 1530,  war der erste Großfürst von Moskau, der sich zum Zaren von Russland krönen ließ"),

    F100(100,1,"Worin ist Usain Bolt besonders gut?","Sprinten","Singen","Pokern","Fußball spielen","Die Topgeschwindigkeit von Bolt, liegt hier bei 44,72 km/h"),

    F101(101, 2,"Die Früchte welchen Baumes sind giftig?","Eibe","Eiche","Tanne","Buche"," Die meisten Eibenarten, wie die Europäische Eibe, enthalten sehr giftige Inhaltsstoffe wie Taxin B."),

    F102(102, 1,"Wie wird ein chemisches Verfahren genannt, um Stoffe zu Trennen?","Destillation","Meißeln","Sägen","Hämmern","Reinigung und Trennung meist flüssiger Stoffe durch Verdampfung und anschließende Wiederverflüssigung"),

    F103(103, 2, "Unter Streetball versteht man die Straßenversion des...?", "Basketballs", "Fußballs", "Federballs", "Völkerballs", "Streetball ist eine Variante des Basketballs, die ursprünglich aus US-amerikanischen Großstädten stammt. Seit den 1990er Jahren ist sie auch in Europa sehr beliebt. Es gibt nur wenige Unterschiede zum Basketball"),

    F104(104, 2,"Wie hieß ein deutsches Pop-Duo der 80er Jahre?","Modern Talking","Modern Walking","Modern Chalking","Modern Stalking","Modern Talking war ein Duo, bestehend aus Thomas Anders und Dieter Bohlen"),

    F105(105, 2, "Welche Rolle machte Daniel Radclife zum Star?", "Harry Potter", "Luke Skywalker", "Frodo Beutlin", "Ron Weasley", "In den Jahren 2001 bis 2011 wurde die Buchreihe Harry Potter in 8 Teilen verfilmt. Es gilt als eine der erfolgreichesten Filmgeschichten."),

    F106(106, 3, "Welches Tier steht auf der Liste der gefährdeten Tierarten?", "Neunaugen", "Achtfinger", "Siebenzähne", "Sechsnasen", "Neunaugen sind eine Ordnung fischähnlicher, stammesgeschichtlich basaler Wirbeltiere, die sich seit 500 Millionen Jahren kaum verändert haben. Sie haben nur zwei Augen."),

    F107(107, 4, "Wofür steht das ’F’ in John F. Kennedy?", "Fitzgerald", "Forest", "Franklyn", "Fairbanks", "John Fitzgerald Kennedy (JFK) war der 35. Präsident der USA und kam bei einem Attentat auf ihn ums Leben."),

    F108(108, 3, "In welchem Land leben mit über 70.000 die größte Anzahl an Leuten, die 100 oder älter sind?", "Japan", "China", "Schweden", "Vietnam", "Auch die älteste Person, welche jemals lebte, wohnt in Japan. Diese ist Kane Tanaka und ist ganze 117 Jahre alt. (Stand 2021)"),

    F109(109,2,"Was ist ein Euphemismus?","ein beschönigender Begriff","ein Abszess im Schenkel","ein Bürokratischer Vorgang","ein gegenteiliger Begriff","Freudenhaus ist ein Euphemismus für Bordell"),

    F110(110, 2,"Der frühere sowjetische Präsident Gorbatschow hatte eine 'Naevus flammeus' am Kopf. Was ist der gewöhnliche Name hierfür?", "Feuermal", "Brandnarbe", "Flammenhaut", "Funkenkratzer","Das Feuermal ist eine gutartige Hautveränderung, die eine dunkelrote bis rötlich-violette Farbe annimmt, weswegen sie umgangssprachlich auch oft als ‘Portweinfleck’ bezeichnet wird."),

    F111(111, 3,"Welcher bekannte Wissenschaftler schrieb das Buch ‘Eine kurze Geschichte der Zeit’?","Stephen Hawking","Albert Einstein","Robert Oppenheimer","Isaac Newton","Das Buch von Hawking befasst sich mit Fragen zur Kosmologie und beleuchtet dabei insbesondere die Rolle der Zeit."),

    F112(112, 3, "Was ist der gegenteilige Effekt, des Placebo-Effekts?", "Nocebo- Effekt", "Icebo-Effekt", "Inplacebo-Effekt", "Plazera-Effekt", "Beim Nocebo-Effekt kann es beispielsweise vorkommen, dass man nach Lesen einer Verpackungsbeilage, plötzlich eines der genannten Symptome auftritt, obwohl es einem körperlich gut geht."),

    F113(113, 2, "Welcher der Blutgruppen stellt die besten zum Blutspenden dar?", "0-", "AB+", "AB-", "0+", "Blutspenden der Gruppe 0- können bedenkenlos an jede Person angewendet werden. Der Nachteil: Personen mit der Blutgruppe 0- können auch nur Spenden der Gruppe 0- erhalten."),

    F114(114, 4, "Wo wird der ABCDE-Test angewendet?", "Krebserkennung bei Muttermalen", "Testen der Schwere von Radioaktivität", "Blutspuren an Tatorten finden", "Einschreiben von alten Schreibfedern", "Bei dem ABCDE-Test werden Leberflecken getestet auf Asymmetrie, Begrenzung, Farbe (Colour), Diameter und Entwicklung."),

    F115(115, 3, "Welcher Star hat die meisten Follower auf Instagram?", "Cristiano Ronaldo", "Justin Biber", "Kylie Jenner", "Dwayne Johnson", "Mit knapp 250 Mio Followern, ist Ronaldo der meistgefolgte Star auf Instagram. Auf Platz 1 landet jedoch Instagram selbst mit fast 390 Mio Followern."),

    F116(117,3,"Wie werden negativ geladene Ionen genannt?","Anionen","Dioden","Kationen","Neutronen"," Negativ geladene Ionen (Anionen) werden gebildet, wenn Atome Elektronen aufnehmen."),

    F117(117, 3, "Wer war noch nie der reichste Mensch der Welt?", "Mark Zuckerberg", "Bill Gates", "Carlos Slim", "Warren Buffet", "Obwohl Mark Zuckerberg ein Vermögen von nahezu 100 Milliarden Dollar hat, war er noch nie Platz eins der reichsten Menschen der Erde."),

    F118(118, 1,"Lautstärke misst man in?","Dezibel","Gramm","Liter","Celsius","Das Dezibel ist das Zehntel eines Bels"),

    F119(119, 1, "Sowohl Giraffe, als auch Chow-Chow haben dieselbe Zungenfarbe, doch welche ist dies?", "Blau", "Rosa", "Rot", "Lila", "Die blaue Farbe kommt daher, dass die Zunge bei den beiden Tieren stärker durchblutet wird als bei anderen."),

    F120(120, 4, "Was sind in amerikanischen Filmen so gut wie immer die ersten drei Ziffern einer Telefonnummer?", "555", "666", "999", "333", "In Amerika gibt es je nach Ort verschiedene Vorwahlen. Da es keinen Ort gibt, welcher die Vorwahl 555 hat, wird diese für die Filmproduktion genommen."),

    F121(121,3,"in welchem Land explodierte die Hindenburg im Mai 1937?","USA","Frankreich","Deutschland","England"," Der Absturz des größten Zeppelins der Welt bedeutete gleichzeitig das Ende der Zeppelin-Ära. Das Luftschiff wurde für 36 Menschen zum Grab."),

    F122(122, 3, "Wie alt war die jüngste Mutter der Welt bei Geburt des Kindes?", "5", "10", "4", "7", "Lina Medina wurde bereits mit 5 Jahren Mutter eines gesunden Kindes. Es wurde nie geklärt, wer der Vater war, jedoch wurde ihr Onkel als der Vater des Babys vermutet."),

    F123(123,1, "Welche Religion hat mehr als nur einen Gott?","Hinduismus","Judentum","Christentum","Islam","Im Hinduismus gibt sowohl primäre Hauptgötter sowie Sekundäre Nebengötter. Man spricht hier von einer Polytheistischen Religion"),

    F124(124, 3, "Circa wie viel Prozent der Menschen essen mit Besteck?", "17%", "63%", "40%", " 27%", "Tatsächlich essen nur 17% der Menschen mit Besteck. Fast doppelt so viele essen mit Stäbchen und der Rest ist mit den Händen."),

    F125(125, 1, "Was wird dem Restaurant Gast für gewöhnlich im Originalzustand und verschlossen serviert?", "Mineralwasser", "Parmesan", "Weinglas", "Salatkopf", "Damit garantieren die deutschen Mineralbrunnen die Sicherheit, Qualität sowie die unverfälschte Natürlichkeit des Mineralwassers von der Quelle bis zum Gast."),

    F126(126, 4,"Welches Säugetier kann am tiefsten tauchen?","Cuvier-Schnabelwal","Subantarktischer Seebär","Australischer Seelöwe","Breitschnabeldelfin","Mit einer Tauchtiefe von 3000 m und einer Tauchzeit von fast 4 Stunden sind sie die Rekordhalter im Tief- und Langtauchen unter allen Säugetieren"),

    F127(127, 3, "Wer wurde 2014 kein Weltmeister im Fußball?", "Kai Havertz", "Julian Draxler", "Heiko Westermann", "Miroslav Klose", "Kai Havertz ist der bisher jüngste Spieler, der mindestens 100-mal in der Bundesliga auflief. Er kam erst im September 2018 zum DFB."),

    F128(128,2,"Welche Krankheit zerstört Nervenzellen im Gehirn?","Alzheimer","Hepatitis","Schizophrenie","Multiple Sklerose","Durch das Absterben von Nervenzellen im Gehirn werden Menschen mit Alzheimer zunehmend vergesslich, verwirrt und orientierungslos."),

    F129(129, 3, "Welcher der genannten Länder ist nicht auch das größte des jeweiligen Kontinents?", "USA in Nordamerika", "Algerien in Afrika", "Brasilien in Südamerika", "Russland in Europa", "Mit einer Fläche von 9.834.000 km² sind die USA knapp hinter Kanada mit 9.985.000 km²."),

    F130(130, 1, "Wo findet man den Musikantenknochen?", "Ellenbogen", "Oberarm", "Schlüsselbein", "Ohr", "Der Musikantenknochen ist ein Höcker am Ellbogen, an dem der Nerv an der Oberfläche liegt, sodass diese Stelle besonders schmerzempfindlich ist"),

    F131(131, 3, "Was ist ein Fall für einen Schönheitschirurgen?", "Truthahnhals", "Hennenhaare", "Rotkehlchenmal", "Straußenbeine", "Bei einem Truthahnhals wird die Haut in der Halsregion schlaffer und es bilden sich hängende Falten, welche als nicht ästhetisch angesehen werden."),

    F132(132, 1,"Wie nennt man die japanischen Selbstmordangriffe des 2. Weltkriegs?","Kamikaze","Harakiri","Gozoku","Tokugawa","Der Begriff kamikaze stammt aus dem 13. Jahrhundert. Heute verbinden wir ihn mit den Selbstmordpiloten Japans im Zweiten Weltkrieg."),

    F133(133, 3, "Was ist wohl die Hauptzutat des ungarischen Gerichts ‘Letscho’?", "Paprika", "Putenbrust", "Kabeljau", "Milch", "Letscho ist ein Schmorgericht, welches neben Paprika auch Tomaten und meistens ebenso Zwiebeln und Speck besteht."),

    F134(134, 1, "Wie nennt man den Stock, welcher zum Spielen von Billard genutzt wird?", "Queue", "Snake", "Stiff", "Query", "Die französische Bedeutung von ‘Queue’ ist ‘der lange, vorne leicht gerundete Spielstock beim Billard’."),

    F135(134,2,"Welcher dieser Dinosaurier war Pflanzenfresser?","Stegosaurus","Allosaurus","Velociraptor","Tyrannosaurus","Mit bis zu 9 Metern Länge war er der größte bekannte Vertreter der Stegosauria. Der Name Stegosaurus bedeutet so viel wie ‘Dachechse’"),

    F136(136, 2, "Woraus wird der Farbstoff ‘Henna’ gewonnen?", "Hennapflanze", "Hennakäfer", "Hennastein", "Hennawasser", "Schon im alten Ägypten war der Hennastrauch bekannt und zu Öl verarbeitet. Der Farbstoff Henna wird oft verwendet, um sich ‘temporäre Tattoos’ auf die Haut zu malen."),

    F137(137,3,"Welche dieser Katzenarten ist im Durchschnitt am leichtesten?","Gepard","Leopard","Jaguar","Puma"," Die in ihrem Jagdverhalten hoch spezialisierten Geparde sind aufgrund dessen die schnellsten Landtiere der Welt"),

    F138(138, 3,"Worauf deutet das ‘V’ bei einem ‘V-Motor’ hin?", "Bauform", "Zylinderanzahl", "Kraftstoffart", "Heckantrieb", "Ein V-Motor ist eine Bauform eines Hubkolbenmotors mit mehreren Zylindern. Nach dem Reihenmotor ist es die am weitesten verbreitete Motorenbauform."),

    F139(139, 1, "Welches war Vivaldi’s wohl bekanntestes Lied?", "Die vier Jahreszeiten", "Für Elise", "Carmen", "Moldau", "Die vier Jahreszeiten stammt aus dem Jahr 1725 und soll musikalisch jede Jahreszeit portraitieren. "),

    F140(140, 1, "Wer malte die Mona Lisa?", "Leonardo Da Vinci", "Vincent van Gogh", "Pablo Picasso", "Michelangelo", "Die Mona Lisa ist ein weltberühmtes Ölgemälde aus dem 16. Jahrhundert. Sogar nur für eine Kopie des Bildes wurden ganze 550.000€ gezahlt." ),

    F141(141, 3, "Welches der Bilder malte nicht Vincent van Gogh?", "Der Schrei", "Sternennacht", "Zwölf Sonnenblumen in einer Vase", "Caféterrasse am Abend", "Vincent van Gogh war ein niederländischer Künstler und gilt als Begründer der modernen Malerei. Nach einem Schuss in die Brust oder möglicherweise auch den Bauch, starb van Gogh im Alter von 37 Jahren."),

    F142(142, 2, "Was ist keine Sportart, welche bei den Olympischen Winterspielen ausgeübt wird?", "Cricket", "Curling", "Bobsport", "Biathlon","Der Cricket ist eine Ballsportart, welche jedoch nicht bei den Olympischen Winterspielen, sondern nur bei den sommerspielen gespielt wird."),

    F143(143, 2, "Welches Bauwerk zählt nicht zu den sieben Weltwundern der Moderne?", "Athener Karyatide", "Felsenstadt Petra", "Cristo Redentor", "Chichen Itza", "Neben den sieben Weltwundern der Moderne gibt es auch sieben der Antike, sieben architektonische Weltwunder der Moderne, aber auch Weltwunder der Natur."),

    F144(144, 3, "Welche der Flaggen ist nicht nur rot-weiß?", "Libanon", "Indonesien", "England", "Dänemark", "Bis auf die Flagge des Libanon sind alle nur rot-weiß. Der Libanon trägt auf seiner rot-weiß gestreiften Flagge eine Zeder, einen grünen Baum, welcher Frieden, Helligkeit und Ewigkeit ausstrahlen soll."),

    F145(145, 2,"Welches System wurde in Südafrika zur Rassentrennung benutzt?","Apartheid","Prohibition","Zölibat","Segregation","Das Wort Apartheid bedeutet auf afrikaans Trennung. Es bezeichnet die Politik der Rassentrennung in Südafrika in der Zeit zwischen 1948 und 1994."),

    F146(146, 3, "Welches Märchen wurde nicht von den Gebrüder Grimm geschrieben?", "Das hässliche Entlein", "Der Hase und der Igel", "Dornröschen", "Der Froschkönig", "Das hässliche Entlein ist ein Märchen von Hans Christian Andersen. Es handelt von einem Entlein, welches von anderen Tieren für sein Aussehen ausgelacht wird. Am Ende der Geschichte wächst es jedoch nicht zu einer Ente, sondern zu einem Schwan an."),

    F147(147, 1,"Welche Tasten sind im deutschen und englischen vertauscht?","Y-Z","A-Z","F-I","L-M","Das Z wird im Deutschen viel häufiger als das Y verwendet, das fast ausschließlich in Fremd- und Lehnwörtern vorkommt. Es wechselt durch den Tausch zu einer für Zehnfingerschreiber günstigeren Position."),

    F148(148, 1, "Wer war der Erfinder des ersten Autos der Welt?", "Carl Benz", "Gustav Otto", "August Horch", "Enzo Ferarri", "Carl Benz war ein Automobilpionier und Ingeneur, welcher den 29. Januar 1886 zum Tag der Autowerdung machte."),

    F149(149, 1,"Welche Substanz wirkt antiseptisch?","Ethanol","Reis","Wasser","Butter","Es wirkt gegen die meisten Bakterien und Pilze sowie gegen viele Viren. Ethanol ist jedoch gegen Bakteriensporen unwirksam"),

    F150(150, 2, "’Shape of you’ und ‘Perfect’ sind Lieder gesungen von...?", "Ed Sheeran", "Elton John", "Rihanna", "Lewis Capaldi", "Ed Sheeran ist ein britischer Sänger und Songwriter. Er erzielte schon viele Auszeichnungen, wie ein Grammy für den Song des Jahres oder die Goldene Kamera für die beste Musik des Jahres."),

    F151(151, 4,"Welcher Begriff beschreibt den Menschen als aktiven Gestalter seiner Umwelt und seines Schicksals?","Homo faber","Homo ludens","Ecce homo","Homo homini lupus"," Der Begriff wird in der philosophischen Anthropologie benutzt, um den modernen Menschen von älteren Menschheitsepochen durch seine Eigenschaft als aktiver Veränderer seiner Umwelt abzugrenzen."),

    F152(152, 2, "Aus wie vielen ‘Hauptinseln’ besteht Japan?", "4", "3", "2", "6", "Japan besteht aus den vier Hauptinseln Hokkaido, Honshu, Shikoku und Kyushu."),

    F153(153, 2, "In welchem Land leben, prozentual gesehen, die meisten Untergewichtigen?", "Zentralafrika", "Japan", "Haiti", "Vereinigte Arabische Emirate", "Die meisten untergewichtigen, sowie unterernährten Personen leben in Zentralafrika. Circa 58% des Landes ist unterernährt. Auf Platz zwei mit 46% folgt Haiti."),

    F154(154, 1, "Wer war der erste Bundeskanzler in Deutschland?", "Konrad Adenauer", "Walter Scheel", "Helmut Kohl", "Helmut Schmidt", "Konrad Adenauer war der erste Bundeskanzler. Er amtierte vom 15.09.1949 bis zum 16.10.1963."),

    F155(155, 1, "Was findet man oftmals in asiatischem Essen als eine Art Fleischersatz?", "Soja", "Bambus", "Frühlingszwiebel", "Reis", "Sojabohnen werden schon seit 3000 vor Christus angebaut. Obwohl man Soja immer öfters im Supermarkt oder Restaurant als gesunden Fleischersatz sieht, werden 98% des geernteten Sojas als Tierfutter verwendet."),

    F156(156, 2, "Welches Lebewesen wurde als erstes gezielt in das Weltall geschossen?", "Hund", "Affe", "Ameisen", "Katze", "Laika, ein zweijähriger Mischling wurde am 3. November 1957 mit der sowjetischen Rakete Sputnik II ins All geschossen."),

    F157(157, 2, "Wofür steht die Abkürzung HD?", "High Definition", "Huge Display", "Hack-Defender", "Hyper Detection", ". Aktuell sind Vertikalauflösungen von 720 Pixel und 1080 Pixel gebräuchlich, die durch Zusatzbezeichnungen wie 720p, 1080p und 1080i unterschieden werden."),

    F158(158,2, "Wo befindet sich der Hauptsitz der UNO", "New York City", "Den Haag", "Amsterdam", "Brüssel", "Die UNO, auch Vereinte Nationen genannt, hat ihren Sitz in New York und sind ein zwischenstaatlicher Zusammenschluss von 193 Staaten und ein uneingeschränkt anerkanntes Völkerrechtssubjekt."),

    F159(159, 1, "In welchem Land ist der Rand die offizielle Währung?", "Südafrika", "Brasilien", "Kanada", "China", "Der Rand ist die Währung der Republik Südafrika. Im Umlauf befinden sich Banknoten zu 200, 100, 50, 20 und 10 Rand und Münzen zu 5, 2 und 1 Rand sowie 50, 20, 10, 5, 2 und 1 Cent."),

    F160(160, 2, "Welches Kleidungsstück trug Michael Jackson auf der Bühne oft nur einzeln?", "Handschuh", "Schuh", "Socke", "Brillenglas", "Der einzelne, glitzernde Handschuh, welchen Jackson auch bei seiner ersten Präsentation des Moonwalks trug, wurde für eine Summe von ganzen 420.000$ versteigert."),

    F161(161, 1, "Welcher der Früchte hat nur einen Kern?", "Mango", "Papaya", "Birne", "Granatapfel", "Die Mango ist eine tropische Pflanze und Frucht. Sie wächst vor allem in Indien und wird als Obst, Öl oder Heilpflanze verwendet."),

    F162(162, 2, "Wofür steht das ‘Z’ in der Mathematik?", "Ganze Zahlen", "Natürliche Zahlen", "Rationale Zahlen", "Reelle Zahlen", "Beispiele für ganze Zahlen sind 0, -12 oder aber auch 213"),

    F163(163, 2, "Welchen BMI muss man haben, um im Bereich des Normalgewichts zu sein?", "18,5-24-9", "3-5", "70,1-80,5", "30-34,9", "Der BMI (Body-Mass-Index) kann genutzt werden, um zu errechnen, in welchem Körperzustand, wie beispielsweise Untergewicht oder Übergewicht, man steckt."),

    F164(164, 2, "Wie hieß das berühmte Hippie-Festival, welches 1969 in New York stattfand?", "Woodstock", "Loveparade", "Sun, moon and stars", "MELT!", "Woodstock war ein Open-Air-Musikfestival und gilt als Höhe- und gleichzeitig Endpunkt der Hippiebewegung in den USA. Das Festival fand planmäßig vom 15. bis 17. August 1969 statt, endete jedoch erst am Morgen des 18. August."),

    F165(165, 1, "Aus welchem Getreide stellt man eine Polenta her?", "Mais", "Gerste", "Hafer", "Roggen", "Polenta ist ein aus Maisgrieß hergestellter fester Brei, der im Norden Italiens, in der Provence, Spanien und Teilen der Schweiz, Österreichs, Rumäniens sowie des Balkans zur regionalen Kochtradition gehört."),

    F166(166, 2, "Wer waren die Hauptakteure auf US- und sowjetischer Seite während der Kubakrise?", "Kennedy und Chruschtschow", "Nixon und Chruschtschow", "Nixon und Gorbatschow", "Kennedy und Gorbatschow", "Die Kubakrise fand 1962 statt und es kam zu einem Konflikt der Sowjetunion und den USA aufgrund von dort stationierten Atomwaffen."),

    F167(167, 4, "Entlang welchen Längengrades verläuft die internationale Datumsgrenze?", "180.", "360.", "90.", "0.", "Die Datumsgrenze verläuft zwischen den beiden Polen der Erde in der Nähe des 180. Längengrads. Wer die Datumsgrenze passiert, kommt in eine Zeitzone mit einem anderen Kalenderdatum."),

    F168(168, 3, "Welcher Sport wurde schon auf dem Mond gespielt?", "Golf", "Baseball", "Federball", "Schach", "Alan Shepard war der erste Astronaut der Vereinigten Staaten im Weltraum und der 5. Mensch auf dem Mond. Er war ebenso die erste Person, welche auf dem Mond Golf spielte."),

    F169(169, 2, "Was bezeichnet ein Arzt als ‘Flatulenz’?", "Blähungen", "Durchfall", "Fußpilz", "Bindehautentzündung", "Flatulenz bezeichnet das verstärkte rektale Entweichen von Darmgasen, oft hervorgerufen durch verstärkte Entwicklung von Gasen im Verdauungstrakt."),

    F170(170, 1, "Wie heißen die Ureinwohner Neuseelands?", "Maori", "Aborigines", "Inuit", "Adivasi", " Maori werden die Angehörigen der indigenen Bevölkerung Neuseelands bezeichnet. Ihre Vorfahren haben vermutlich im 13. Jahrhundert das sonst unbewohnte Neuseeland besiedelt."),

    F171(171, 3, "Wer war sowohl der 22. Als auch 24. Präsident der USA?", "Cleveland", "Dallas", "Boston", "Harrison", "Stephen Cleveland übte das Amt als 22. und 24. Präsident der USA vom 4. März 1885 bis zum 4. März 1889 und nochmals vom 4. März 1893 bis zum 4. März 1897 aus."),

    F172(172, 4, "‘Garen unter Luftabschluss’ nennt man...?", "sous-vide", "sans soucci", "sans atmosphère", "sans oeuvre", "Als Vakuumgaren oder Sous-vide bezeichnet man eine Methode zum Garen von Fleisch, Fisch oder Gemüse in einem Kunststoffbeutel bei relativ niedrigen Temperaturen von unter 100 °C."),

    F173(173, 3, "Welches als ausgestorben geltende Tier wurde 1938 in Südafrika gefangen?", "Quastenflosser", "Urqualle", "Quagga", "Panzerfisch", "Die Quastenflosser gelten als eines der bekanntesten Beispiele lebender Fossilien. Quastenflosser entwickelten sich wohl mit der Zeit zu Landlebewesen um."),

    F174(174, 4, "Wie viele Monde hat der Planet Neptun?", "14", "2", "21", "7", "2013 wurde zuletzt ein Mond der Neptun gesichtet. Triton, Proteus und Larissa sind Beispiele für Monde der Neptun."),

    F175(175, 2,"Nach den Anschlägen vom 11. September begannen die USA ihren 'War on Terror' mit dem Einmarsch in...?","Afghanistan","Ägypten","Syrien","Saudi-Arabien","Unter War on Terror verstand die Regierung von Bush den Kampf sowohl gegen terroristische Vereinigungen als auch gegen Staaten, die terroristische Organisationen unterstützen."),

    F176(176, 4, "Was bedeutet ‘aviär’ in der Medizin?", "Von Vögeln abstammend", "Unterzuckert", "Mit Rillen versehen", "Kaukasisch", "Aviäre Erkrankungen (z.B. die Vogelgrippe) sind Krankheiten, die bevorzugt Vögel befallen oder bei denen Vögel das Erregerreservoir bilden."),

    F177(177,1,"Was ist für Anthropologen der beste Ort, um das Geschlecht zu bestimmen?","Becken","Fingerknochen","Brustbein","Wadenbein","Das Becken weist zwischen den Geschlechtern, in der Form, den größten Unterschied auf"),

    F178(178, 4, "Wo befindet sich die älteste, jetzt noch existierende, Bank der Welt?", "Siena", "Paris", "Rom", "Alexandria", "Die Banca Monte dei Paschi ist ein italienisches Kreditinstitut mit Sitz in Siena, Italien. Es ist die älteste noch existierende Bank der Welt. Gegründet wurde die Bank im Jahr 1472"),

    F179(179, 4, "Welcher dieser Opernkomponisten ist kein gebürtiger Italiener?", "Verdi", "Bellini", "Rossini", "Donizetti", "Giuseppe Verdi wurde 1813 im Französischen Königreich geboren. Seine bekanntesten Opern sind Rigoletto, Otello und Falstaff."),

    F180(180,3,"Wie viele Personen sind auf Leonardo da Vincis Abendmahl sichtbar?","13","6","10","16","Es sind die 12 Apostel und Jesus selbst auf dem Gemälde zu sehen"),

    F181(181, 4, "Wer einen IQ von 160 oder höher hat und dies auch nachweisen kann, darf in welchem Club Mitglied werden?", "Prometheus Society", "Mensa International", "Triple Nine Society", "Intertel", "Menschen mit einem IQ von 160 sind intelligenter als 99,97%. Im Vergleich, die Mensa International nimmt Personen mit einem IQ von mindestens 130 auf, und damit 600-mal weniger selektiv."),

    F182(182, 4, "Die Markierung von Verrätern durch eine Narbe auf der Wange nannte man wie?", "Schlichnerzinken", "Paukung", "Schmiss", "Mensur", "Verräter, auch Schlichner genannt, wurden Anfang des 19. Jahrhunderts oft ermordet. Später wurden sie mit dem Schlichnerzinken, der für jeden sichtbar war, bestraft. "),

    F183(183, 1,"Welches dieser Objekte wird am langsamsten im Erdboden zersetzt","Plastikflasche","Baumwollhemd","Kartonschachtel","Zeitung","Die meisten Plastikarten sind nicht biologisch abbaubar und zerfallen nur sehr langsam unter dem Einfluss von UV-Strahlen oder weil sie im Laufe der Zeit zerrieben werden."),

    F184(184, 4, "Wer hat keinen Stern auf dem Walk of Fame?", "Flipper", "Shrek", "Godzilla", "Lassie", "Die erste Person, welchen einen Stern auf dem Walk of Fame bekam, war Joanne Woodward."),

    F185(185,1,"Gegen welches Land häten die USA während der Kubakrise fast einen Krieg gestartet?","Sowjetunion","Kuba","Mexiko","Brasilien","Die Kuba-Krise von 1962 markierte den Höhepunkt des Kalten Krieges. Auf Kuba hatte die Sowjetunion Raketen stationiert, die unmittelbar auf die USA gerichtet waren"),

    F186(186, 3, "Wie heißt der tiefste Punkt der Erde, welcher nicht unterseeisch ist?", "Bentleygraben", "Marianengraben", "Japangraben", "Marschallgraben", "Der Bentley Graben, auch Bentley-Subglazialgraben, ist eine durch Gletschereis vollständig überdeckte Senke in der Westantarktis."),

    F187(187, 2, "Wie nennt man das Nachahmen von z.B. einer Anime- oder Mangafigur im Aussehen und auch verhalten?", "Cosplay", "Fanplay", "Playchar", "Copycat", "Den Ursprung hat Cosplay aus der Manga und Anime Scene Japans. Aber seit dem Boom des Genres in den 90er Jahren gibt es außerhalb davon eine stetig steigende Fan-Gemeinde auf der ganzen Welt."),

    F188(188, 2,"Auf welches Element konzentriert sich die organische Chemie?","Kohlenstoff","Phosphor","Magnesium","Lithium","Die organische Chemie ist ein Teilgebiet der Chemie. Darin werden die chemischen Verbindungen behandelt, die auf Kohlenstoff basieren"),

    F189(189, 4, "Was produzierte Otto Lagerfeld, der Vater von Modezar Karl Lagerfeld?", "Kondensmilch", "Nähmaschinen", "Damenbekleidung", "Fahrräder", "Otto Lagerfeld gründete 1919 die Firma Lagerfeld & Co zum Import von Carnation Dosenmilch aus den USA. 1923 führte er eine eigene Marke unter dem Namen 'Glücksklee' ein."),

    F190(190, 4, "Was ist die Vexillologie?", "Flaggenkunde", "Lehre der Sehnen und Bänder", "Palmenzucht", "Studium über Kanalbau", "Vexillologie lateinisch vexillum ‚Fahne' und -logie, auch Flaggenkunde, ist die Lehre vom Fahnen- und Flaggenwesen. Die Vexillologie ist eine sehr junge Wissenschaft."),

    F191(191, 3, "Die Merowinger waren das älteste bekannte Königsgeschlecht der...?", "Franken", "Schwaben", "Hessen", "Pfälzer", "Die Merowinger lebten vom 5. Jahrhundert bis 751. Sie wurden vom Geschlecht der Karolinger abgelöst."),

    F192(192, 2,"Wie wirkt die Strahlentherapie die bei Krebserkrankungen zum Einsatz kommt?","zerstört DNA","macht Zellen unsterblich","induziert Angiogenese","umgeht den Zelltod"," Bei der Strahlentherapie werden die Krebszellen zerstört. Die Strahlung schädigt die Erbsubstanz der Zellen, sodass die Zellteilung aufhört."),

    F193(193, 2, "Aus welcher Legierung besteht vermutlich der innere Erdkern?", "Eisen-Nickel", "Schwefel-Stickstoff", "Metalloxid-Silkat", "Wasser-Mineral", "Der Erdkern ist das metallische Innere der Erde. Obwohl der Kern mit einem Durchmesser von 6942 km nur ein Sechstel des Volumens der ganzen Erde ausmacht, trägt er aufgrund seiner hohen Dichte rund ein Drittel zu ihrer Masse bei."),

    F194(194, 2, "Island ist zwar Mitglied der Nato, hat aber...?", "keine Armee", "keine Luftwaffe", "kein Heer", "keine Marine", "Island hat tatsächlich keine Armee und gilt daher auch als ‘das friedlichste Land der Welt’."),

    F195(195, 1,"Welches Land führte 1941 einen Überraschungsangriff auf Pearl Harbor durch?","Japan","China","Russland","Vietnam","Durch den Angriff wollte Japan die Pazifik-Flotte der USA für ein halbes Jahr ausschalten, um sich Rohstoffe in Südost-Asien zu sichern"),

    F196(196, 3, "Wie heißt in Profiküchen der Koch, welcher zuständig für Braten- und Pfannengerichte ist?", "Rôtisseur", "Pâtissier", "Potager", "Entremetier", "Ein Pâtissier ist ein Feinbäcker,  ein Potager ein Obst- und Gemüsegarten und ein Entremetier ist zuständig für Suppen und kleine Zwischengerichte."),

    F197(197, 3, "Wie heißt die kleinste Stadt Deutschlands?", "Arnis", "Schwarzenborn", "Teupitz", "Orlamünde", "Arnis ist mit weniger als 300 Einwohnern die nach der Einwohnerzahl und mit 0,45 km² auch die nach der Fläche kleinste Stadt Deutschlands. Sie befindet sich in Schleswig-Holstein."),

    F198(198, 1, "Welche Tiere stehen für das auf und ab an der Börse?", "Bulle und Bär", "Hund und Wolf", "Dachs und Fuchs", "Katze und Maus", "Der stolze Bulle mit prächtigen Hörnern steht für die längerfristige Aufwärtstendenz oder Hausse, der sich duckende Bär mit gesenktem Schädel für die längerfristige Abwärtstendenz oder Baisse"),

    F199(199, 3, "Dass es ‘Nein, ich bin dein Vater.’ heißt, viele Menschen aber denken, es hieße ‘Luke, ich bin dein Vater’, wird auch wie genannt?", "Mandela-Effekt", "Cleveland-Effekt", "Johnson-Effekt", "Schmidt-Effekt", "Benannt wurde dieser Effekt nach Nelson Mandela, denn viele dachten, der Präsident Südafrikas wäre im Gefängnis gestorben, obwohl er das gar nicht ist."),

    F200(200, 1, "Wie heißt keiner der drei Gehörknöchelchen?", "Zange", "Hammer", "Amboss", "Steigbügel", "Hammer, Amboss und Steigbügel befinden sich im Ohr und sind mit zuständig dafür, dass man hören kann. Steigbügel ist der kleinste Knochen im menschlichen Körper.");



    private static int zahl;
    public static Integer zaehler = 1;
    private Integer id;
    private Integer schwierigkeit;
    private String frage;
    private String antwort1;
    private String antwort2;
    private String antwort3;
    private String antwort4;
    private String antwortsatz;




    Fragen(Integer id,Integer schwierigkeit,String frage,String antwort1,String antwort2,String antwort3,String antwort4,String antwortsatz) {


        this.id = id;

        this.schwierigkeit = schwierigkeit;

        this.frage = frage;

        this.antwort1 = antwort1;

        this.antwort2 = antwort2;

        this.antwort3 = antwort3;

        this.antwort4 = antwort4;

        this.antwortsatz = antwortsatz;
    }

    public Integer getid() {

        return id; }


    public Integer getschwierigkeit() { return schwierigkeit; }


    public String getfrage() { return frage; }


    public String getantwort1() { return antwort1; }


    public String getantwort2() { return antwort2; }


    public String getantwort3() { return antwort3; }


    public String getantwort4() { return antwort4; }


    public String getantwortsatz() { return antwortsatz; }

    private static List<Integer> gefalleneZahlen = new ArrayList<>();

    public static void setzeFragenKatalogZurueck() {
        gefalleneZahlen = new ArrayList<>();
    }

    public static Fragen getZufallFrage(){
        int anzahl = Fragen.values().length;
        boolean gefunden = false;
        while (!gefunden) {
            zahl = (int) (Math.random()*anzahl) + 1;
            if (Fragen.valueOf("F"+zahl).getschwierigkeit() == zaehler){
                if (!gefalleneZahlen.contains(zahl)) {
                    gefalleneZahlen.add(zahl);
                    gefunden = true;
                    if(gefalleneZahlen.size() == 5 || gefalleneZahlen.size() == 10 ||
                            gefalleneZahlen.size() == 13){
                        zaehler +=1;
                    }
            }
            }
        }
        return Fragen.valueOf("F"+ zahl);
    }

    public static String getRichtigeAntwort(){
        return Fragen.valueOf("F" + zahl).getantwort1();
    }

    public static String getAntworten(){
        int zahl2 = (int) (Math.random()*4) + 1;
        if(zahl2 == 1){

            return Fragen.valueOf("F"+zahl).getantwort1();
        }
        else if(zahl2 == 2){
            return Fragen.valueOf("F"+zahl).getantwort2();
        }
        else if(zahl2 == 3){
            return Fragen.valueOf("F"+zahl).getantwort3();
        }
        else{
            return Fragen.valueOf("F"+zahl).getantwort4();
        }
    }
// Gartenschlauch

}