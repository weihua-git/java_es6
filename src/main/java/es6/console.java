package es6;

/**
 * lwh 工具类
 */
public class console {

    public static void log(Object... str) {

        str[0] = "\n" + str[0];

        for (Object o : str) {

            System.out.print(o + "\t");

        }

    }

    public static void main(String[] args) {
        String a = "asdas";
        console.log("asdasd",a);
    }

}
