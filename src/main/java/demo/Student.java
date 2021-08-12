package demo;

public class Student {

    private Integer number;
    private String name;
    private Integer score;

    private Integer gradeId;

    public Student(Integer number, String name, Integer score, Integer gradeId) {
        this.number = number;
        this.name = name;
        this.score = score;
        this.gradeId = gradeId;
    }

    public Integer getGradeId() {
        return gradeId;
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
    }

    public Student(Integer number, String name, Integer score) {
        this.number = number;
        this.name = name;
        this.score = score;
    }

    public Student() {
    }

    public Integer getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public Integer getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student [gradeId=" + gradeId + ", name=" + name + ", number=" + number + ", score=" + score + "]";
    }

}
