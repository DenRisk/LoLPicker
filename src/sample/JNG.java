package sample;

import java.util.ArrayList;
import java.util.Random;

public class JNG {

    public static String getJungleString() {

        ArrayList<String> junglelist = new ArrayList<>();
        Random random = new Random();

        String Amumu = "Amumu";
        String elise = "Elise";
        String evelyn = "Evelyn";
        String gragi = "Gragas";
        String graves = "Graves";
        String heca = "Hecarim";
        String camille = "Camille";
        String diana = "Diana";
        String ivern = "Ivern";
        String Jarvan = "Jarvan IV";
        String jax = "Jax";
        String kayn = "Kayn";
        String khazix = "Kha'Zix";
        String kindred = "Kindred";
        String leesin = "Lee Sin";
        String yi = "Master Yi";
        String nida = "Nidalee";
        String noc = "Nocturne";
        String nunu = "Nunu";
        String olaf = "Olaf";
        String rammus = "Rammus";
        String reksai = "Rek'Sai";
        String renger = "Renger";
        String seju = "Sejuani";
        String shy = "Shyvana";
        String skarner = "Skarner";
        String tali = "Taliyah";
        String shaco = "Shaco";
        String trundle = "Trundle";
        String udyr = "Udyr";
        String vi = "Vi";
        String ww = "Warwick";
        String xin  = "Xin Zhao";
        String zac = "Zac";





        junglelist.add(Amumu);
        junglelist.add(elise);
        junglelist.add(evelyn);
        junglelist.add(gragi);
        junglelist.add(graves);
        junglelist.add(heca);
        junglelist.add(camille);
        junglelist.add(diana);
        junglelist.add(ivern);
        junglelist.add(Jarvan);
        junglelist.add(jax);
        junglelist.add(kayn);
        junglelist.add(khazix);
        junglelist.add(kindred);
        junglelist.add(leesin);
        junglelist.add(yi);
        junglelist.add(nida);
        junglelist.add(noc);
        junglelist.add(nunu);
        junglelist.add(olaf);
        junglelist.add(reksai);
        junglelist.add(renger);
        junglelist.add(seju);
        junglelist.add(shaco);
        junglelist.add(shy);
        junglelist.add(skarner);
        junglelist.add(tali);
        junglelist.add(trundle);
        junglelist.add(udyr);
        junglelist.add(vi);
        junglelist.add(ww);
        junglelist.add(xin);
        junglelist.add(zac);



        int randomjgl = random.nextInt(junglelist.size());
        String randomjglName = junglelist.get(randomjgl);


        return randomjglName;
    }
}
