package rc_2.values.text_value;

public class Text_Values {

    private String str = " CREDIT: ";

    public static String str_search = "            SEARCH & RECYCLED!!!         ";

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }


    public static void runningString() throws InterruptedException {

        System.out.println("str_search = " + str_search);
        System.out.println("str_search =      " + str_search);
        String str_test = " ";
        for (int i = 0; i < 100; i++) {
            Thread.sleep(350);
            System.out.println();

            str_test += str_search;

            System.out.println("str_search = " + str_test);
            str_test += " ";
        }
    }
}

