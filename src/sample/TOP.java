package sample;

import java.util.ArrayList;
import java.util.Random;

public class TOP {

    public static String getTopString() {

        ArrayList<String> toplist = new ArrayList<>();
        Random random = new Random();

        String aatrox = "Aatrox";
        String camille = "Camille";
        String chogath = "Cho'Gath";
        String darius = "Darius";
        String mundo = "Dr.Mundo";
        String fiora = "Fiora";
        String gp = "Gankplank";
        String garen = "Garen";
        String gnar = "Gnar";
        String heimer = "Heimerdinger";
        String akali = "Akali";
        String galio = "Galio";
        String illaoi = "Illaoi";
        String irelia = "Irelia";
        String jayce = "Jayce";
        String kayle = "Kayle";
        String kennen = "Kennen";
        String kled = "Kled";
        String malph = "Malphite";
        String mao = "Maokai";
        String morde = "Mordekaiser";
        String nasus = "Nasus";
        String naut = "Nautilus";
        String ornn = "Ornn";
        String pan = "Pantheon";
        String poppy = "Poppy";
        String quinn = "Quinn";
        String rene = "Renekton";
        String riven = "Riven";
        String rumble = "Rumble";
        String shen = "Shen";
        String singed = "Singed";
        String sion = "Sion";
        String swain = "Swain";
        String teemo = "Teemo";
        String tryn = "Tryndamere";
        String urgot = "Urgot";
        String voli = "Volibear";
        String wu = "Wukong";
        String yorick = "Yorick";
        String yasuo = "Yasuo";


        toplist.add(aatrox);
        toplist.add(camille);
        toplist.add(chogath);
        toplist.add(darius);
        toplist.add(mundo);
        toplist.add(fiora);
        toplist.add(gp);
        toplist.add(garen);
        toplist.add(gnar);
        toplist.add(heimer);
        toplist.add(akali);
        toplist.add(galio);
        toplist.add(illaoi);
        toplist.add(irelia);
        toplist.add(kayle);
        toplist.add(kennen);
        toplist.add(kled);
        toplist.add(malph);
        toplist.add(morde);
        toplist.add(nasus);
        toplist.add(naut);
        toplist.add(mao);
        toplist.add(ornn);
        toplist.add(pan);
        toplist.add(poppy);
        toplist.add(quinn);
        toplist.add(rene);
        toplist.add(riven);
        toplist.add(rumble);
        toplist.add(singed);
        toplist.add(sion);
        toplist.add(swain);
        toplist.add(shen);
        toplist.add(teemo);
        toplist.add(tryn);
        toplist.add(urgot);
        toplist.add(voli);
        toplist.add(wu);
        toplist.add(yorick);
        toplist.add(yasuo);

        int randomtop = random.nextInt(toplist.size());
        String randomtopName = toplist.get(randomtop);

        return randomtopName;
    }
}
