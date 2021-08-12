package demo;

import es6.Array;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo02 {

    public static void main(String[] args) {

        Array<Student> students = new Array<Student>();
        students.push(new Student(123, "1asdsad", 123));
        students.push(new Student(123, "2asdsad", 123));
        students.push(new Student(123, "3asdsad", 123));
        students.push(new Student(123, "4asdsad", 123));
        students.push(new Student(12312, "5asdsad", 123));

        List<HashMap<String, Object>> collect = students.stream().map(r -> new HashMap<String, Object>() {{
            put("name", r.getName());
            put("b", r.getNumber());
        }}).collect(Collectors.toList());

        collect.forEach(System.out::println);
//
//        Array<Object> map = students.map(r ->
//                new HashMap<String, Object>() {{
//                    put("name", r.getName());
//                    put("b", r.getNumber());
//                }}
//        );
//
//        map.print();

    }

}
