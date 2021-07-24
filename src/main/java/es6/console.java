package es6;


public class console {

    /**
     * str,str,str
     * @param str
     */
    public static void log(Object... str) {

        str[0] = "\n" + str[0];

        for (Object o : str) {

            System.out.print(o + "\t");

        }

    }



}
