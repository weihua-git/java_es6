import es6.Array;
import es6.console;

public class Demo {


    static class StudentVo {

        private String gradeName; // 年级名称
        private int number;
        private String name;
        private int score;

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public String getGradeName() {
            return gradeName;
        }

        public StudentVo(int number, String name, int score, String gradeName) {
            this.gradeName = gradeName;
            this.number = number;
            this.name = name;
            this.score = score;
        }

        public void setGradeName(String gradeName) {
            this.gradeName = gradeName;
        }

        @Override
        public String toString() {
            return "StudentVo{" +
                    "gradeName='" + gradeName + '\'' +
                    ", number=" + number +
                    ", name='" + name + '\'' +
                    ", score=" + score +
                    '}';
        }
    }


    static class Student{

        private int number;
        private String name;
        private int score;

        public Student(int number, String name, int score) {
            this.number = number;
            this.name = name;
            this.score = score;
        }

        public Student() {
        }

        public int getNumber() {
            return number;
        }

        public String getName() {
            return name;
        }

        public int getScore() {
            return score;
        }

        @Override
        public String toString() {
            return String.format("[%d] %s : %d", getNumber(), getName(), getScore());
        }


    }
    public static void main(String[] args) {

        Array<Student> array2 = new Array();

        array2.push(new Student(123, "1asdsad", 123));
        array2.push(new Student(123, "2asdsad", 123));
        array2.push(new Student(123, "3asdsad", 123));
        array2.push(new Student(123, "4asdsad", 123));
        array2.push(new Student(12312, "5asdsad", 123));


        array2.print();

        Array<StudentVo> asdad = array2.map(a -> new StudentVo(a.getNumber(), a.getName(), a.getScore(), "asdad"));
        asdad.print();

    }

}
