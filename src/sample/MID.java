package sample;

import java.util.ArrayList;
import java.util.Random;

public class MID {

    public static String getMidString() {

        ArrayList<String> midlist = new ArrayList<>();
        Random random = new Random();

        String ahri = "Ahri";
        String akali = "Akali";
        String anivia = "Anivia";
        String aurelionSol = "Aurelion Sol";
        String annie = "Annie";
        String cassiopeia = "Cassiopeia";
        String corki = "Corki";
        String azir = "Azir";
        String diana = "Diana";
        String ekko = "Ekko";
        String fizz = "Fizz";
        String galio = "Galio";
        String heimer = "Heimerdinger";
        String brand = "Brand";
        String irelia = "Irelia";
        String karthus = "Karthus";
        String kassadin = "Kassadin";
        String kata = "Katarina";
        String leblanc = "LeBlanc";
        String lissandra = "Lissandra";
        String lux = "Lux";
        String ori = "Orianna";
        String ryze = "Ryze";
        String syndra = "Syndra";
        String mal = "Malzahar";
        String talon = "Talon";
        String tf = "Twisted Fate";
        String tali = "Taliyah";
        String veigar = "Veigar";
        String velkoz = "Vel'Koz";
        String vik = "Viktor";
        String xerath = "Xerath";
        String vlad = "Vladimir";
        String yasuo = "Yasuo";
        String zed = "Zed";
        String ziggs = "Ziggs";
        String zilean = "Zilean";
        String zoe = "Zoe";



        midlist.add(ahri);
        midlist.add(akali);
        midlist.add(anivia);
        midlist.add(aurelionSol);
        midlist.add(annie);
        midlist.add(azir);
        midlist.add(cassiopeia);
        midlist.add(corki);
        midlist.add(diana);
        midlist.add(ekko);
        midlist.add(galio);
        midlist.add(heimer);
        midlist.add(brand);
        midlist.add(irelia);
        midlist.add(karthus);
        midlist.add(kassadin);
        midlist.add(leblanc);
        midlist.add(lissandra);
        midlist.add(lux);
        midlist.add(mal);
        midlist.add(ori);
        midlist.add(ryze);
        midlist.add(syndra);
        midlist.add(tali);
        midlist.add(talon);
        midlist.add(tf);
        midlist.add(veigar);
        midlist.add(velkoz);
        midlist.add(vik);
        midlist.add(vlad);
        midlist.add(xerath);
        midlist.add(yasuo);
        midlist.add(zed);
        midlist.add(ziggs);
        midlist.add(zilean);
        midlist.add(zoe);
        midlist.add(kata);
        midlist.add(fizz);



        int randommid = random.nextInt(midlist.size());
        String randommidName = midlist.get(randommid);


        return randommidName;
    }
}
