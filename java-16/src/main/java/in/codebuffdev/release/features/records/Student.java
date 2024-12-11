package in.codebuffdev.release.features.records;

// final instance variable
// concise all args constructors / canonical constructors
// we can't extend to another class
// implementing interface is allowed

public record Student(String firstName, String email) {

    // compact constructor (mostly used for custom validation purpose)
    public Student {
        if (firstName == null || email == null) {
            throw new IllegalArgumentException();
        }
    }


    // instance variables are not allowed, bcz default record is final
    // public int i;

    // instance method
    public void printAll() {
        System.out.println(firstName + " " + email);
    }

    // static var
    public static String what = "Static variables are allowed";

    // static method
    public static void blahBlah() {
        System.out.println("blah .. ");
    }
}