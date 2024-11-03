package demo;

import es6.Array;

import java.util.*;
import java.util.stream.Collectors;

import static es6.JavaSrciptApi.$;

public class Demo02 {

    public static void main(String[] args) {

        Array<Student> students = new Array<Student>();
        students.push(new Student(123, "1asdsad", 123));
        students.push(new Student(123, "2asdsad", 123));
        students.push(new Student(123, "3asdsad", 123));
        students.push(new Student(123, "4asdsad", 123));
        students.push(new Student(12312, "5asdsad", 123));
        students.push(new Student(12313, "5asdsad", 123));

        List<HashMap<String, Object>> collect = students.stream().map(r -> new HashMap<String, Object>() {{
            put("name", r.getName());
            put("b", r.getNumber());
        }}).filter(r -> (int) r.get("b") > 123).collect(Collectors.toList());

        collect.forEach(System.out::println);

        Array map = students.map(r -> new HashMap<String, Object>() {{
            put("name", r.getName());
            put("b", r.getNumber());
        }}).filter(r -> (int) r.get("b") > 123).sort_((a, b) -> (int) b.get("b") - (int) a.get("b"));

        Array<Number> list = new Array<>();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);


        List xiaodi = new ArrayList();
        xiaodi.add(1);
        xiaodi.add(2);
        xiaodi.add(3);
        xiaodi.add(4);
        xiaodi.add(5);

        // 使用示例
        $(xiaodi).filter(r -> (int) r > 3).print(); // 假设 xiaodi 是 ArrayList<Number>


        List<Student> students2 = new ArrayList<>();
        students2.add(new Student(123, "1asdsad", 123));
        students2.add(new Student(123, "2asdsad", 123));
        students2.add(new Student(123, "3asdsad", 123));
        students2.add(new Student(123, "4asdsad", 123));
        students2.add(new Student(12312, "5asdsad", 123));
        students2.add(new Student(12313, "5asdsad", 123));
        List<Student> collect1 = students2.stream().filter(r -> r.getNumber() > 123).collect(Collectors.toList());
        List<Student> filter = $(students2).filter(r -> r.getNumber() > 123);

    }


}
