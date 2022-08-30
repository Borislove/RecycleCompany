package rc_2;

import rc_2.values.numeric_values.Values;

public class RC_2_Test {
    public static void main(String[] args) {

        ////////////////////////////////////
        //проверка рандомности в значениях
        Values values = new Values();
        values.priceRand();

        for (int i = 0; i < 100; i++) {
            values.priceRand();
        }

        /////////////////////////////////////
    }
}
