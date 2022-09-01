package rc_2;

import rc_2.values.numeric_values.Values;
import rc_2.values.text_value.Text_Values;

public class RC_2_Test {
    public static void main(String[] args) throws InterruptedException {

        ////////////////////////////////////
        //проверка рандомности в значениях
       /* Values values = new Values();
        values.priceRand();*/

      /*  for (int i = 0; i < 100; i++) {
            values.priceRand();
        }*/

        /////////////////////////////////////

        //test runningStroke
        Text_Values text_values = new Text_Values();
        text_values.runningString();
    }
}
