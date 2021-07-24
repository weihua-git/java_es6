import es6.Array;
import es6.console;

public class Demo {

    public static void main(String[] args) {

        Array<String> array = new Array();

        array.push("a");
        array.push("b");
        array.push("c");
        array.push("d");

        String a = array.find(r -> r.equals("b"));
        console.log(a);

    }

}
