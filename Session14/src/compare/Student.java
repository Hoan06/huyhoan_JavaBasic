package compare;

public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private double score;

    public Student(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        /*
        * trả về 1 nếu đối tượng this lớn hơn đối tượng o
        * trả về 0 nếu đối tượng this giống đối tượng o
        * trả về -1 nếu đối tượng this nhỏ hơn đối tượng o
        * */
        // Tiêu chí so sánh
        // theo tên
//        return this.name.compareTo(o.name);
        // sắp xếp theo tiêu chí : sắp xếp theo điểm tăng dần, nếu điểm giống nhau thì sx theo id giảm dần
        // Wrapper class : là kiểu đối tượng của các kiểu nguyên

        if (this.score == o.score){
            return o.id - this.id;
        } else {
            return Double.compare(this.score,o.score);
        }

    }
}
