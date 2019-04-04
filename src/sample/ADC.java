package sample;

import java.util.ArrayList;
import java.util.Random;

public class ADC {

    public static String getADCString() {

        ArrayList<String> adclist = new ArrayList<>();
        Random random = new Random();

        String ashe = "Ashe";
        String caitlyn = "Caitlyn";
        String draven = "Draven";
        String ezreal = "Ezreal";
        String jhin= "Jhin";
        String jinx = "Jinx";
        String kaisa = "Kai'sa";
        String kalista = "Kalista";
        String kog = "Kog'Maw";
        String lucian = "Lucian";
        String mf = "Miss Fortune";
        String sivir = "Sivir";
        String trist = "Tristana";
        String twitch = "Twitch";
        String varus = "Varus";
        String vayne = "Vayne";
        String xay = "Xayah";

        adclist.add(ashe);
        adclist.add(caitlyn);
        adclist.add(draven);
        adclist.add(ezreal);
        adclist.add(jinx);
        adclist.add(jhin);
        adclist.add(kaisa);
        adclist.add(kalista);
        adclist.add(kog);
        adclist.add(lucian);
        adclist.add(mf);
        adclist.add(sivir);
        adclist.add(trist);
        adclist.add(twitch);
        adclist.add(varus);
        adclist.add(vayne);
        adclist.add(xay);


        int randomadc = random.nextInt(adclist.size());
        String randomadcName = adclist.get(randomadc);


        return randomadcName;
    }
}
