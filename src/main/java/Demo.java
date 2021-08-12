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
            return (
                    "StudentVo{" +
                            "gradeName='" +
                            gradeName +
                            '\'' +
                            ", number=" +
                            number +
                            ", name='" +
                            name +
                            '\'' +
                            ", score=" +
                            score +
                            '}'
            );
        }
    }


    public static void main(String[] args) {
        Long a = 1231244124112345698L;
        Long b = 1231244145123456912L;
        System.out.println(a ^ b);
    }
}
