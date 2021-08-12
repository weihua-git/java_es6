package demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import es6.Array;

public class Demo01 {

    public static void main(String[] args) {

        Array<Student> students = new Array<Student>();
        students.push(new Student(123, "1asdsad", 123));
        students.push(new Student(123, "2asdsad", 123));
        students.push(new Student(123, "3asdsad", 123));
        students.push(new Student(123, "4asdsad", 123));
        students.push(new Student(12312, "5asdsad", 123));

        Array<Map<String, Object>> objects = new Array<>();

        students.each((Student r) -> {
            Map item = new HashMap<>();
            Map number = objects.find(x -> x.get("number") == r.getNumber());
            if (number == null) {
                item.put("number",r.getNumber());
                item.put("list",new Array<>());
                objects.push(item);
            }else{
                Array<Student> list = (Array<Student>) number.get("list");
                list.push(r);
            }
        });

        objects.print();

    }

}
