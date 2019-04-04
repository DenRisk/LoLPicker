package sample;

import java.util.ArrayList;
import java.util.Random;

public class SUPP {

    public static String getSupportString() {

        ArrayList<String> supportlist = new ArrayList<>();
        Random random = new Random();

        String alistar = "Alistar";
        String braum = "Braum";
        String blitz = "Blitzcrank";
        String brand = "Brand";
        String fiddle = "Fiddlesticks";
        String janna = "Janna";
        String karma = "Karma";
        String leona = "Leona";
        String lulu = "Lulu";
        String morg = "Morgana";
        String nami = "Nami";
        String naut = "Nautilus";
        String pyke = "Pyke";
        String rakan = "Rakan";
        String shen = "Shen";
        String sona = "Sona";
        String sora = "Soraka";
        String tahm = "Tahm Kench";
        String taric = "Taric";
        String thresh = "Thresh";
        String zyra = "Zyra";


        supportlist.add(alistar);
        supportlist.add(braum);
        supportlist.add(blitz);
        supportlist.add(brand);
        supportlist.add(fiddle);
        supportlist.add(janna);
        supportlist.add(karma);
        supportlist.add(leona);
        supportlist.add(lulu);
        supportlist.add(morg);
        supportlist.add(nami);
        supportlist.add(naut);
        supportlist.add(pyke);
        supportlist.add(rakan);
        supportlist.add(shen);
        supportlist.add(sona);
        supportlist.add(sora);
        supportlist.add(tahm);
        supportlist.add(taric);
        supportlist.add(thresh);
        supportlist.add(zyra);


        int randomsupp = random.nextInt(supportlist.size());
        String randomsuppName = supportlist.get(randomsupp);

        return randomsuppName;
    }

}
