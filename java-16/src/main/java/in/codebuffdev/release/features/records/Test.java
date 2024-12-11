package in.codebuffdev.release.features.records;

public class Test {
    public static void main(String[] args) {
        Student student = new Student("sp","sp@");
        student.printAll();
        Student.blahBlah();

        System.out.println(student.email());
        System.out.println(student.toString());

        System.out.println("record by default extends " + student.getClass().getSuperclass());

        
    }
}
