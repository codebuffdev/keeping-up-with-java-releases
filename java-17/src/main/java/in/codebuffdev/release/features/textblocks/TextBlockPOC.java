package in.codebuffdev.release.features.textblocks;

/*
 * Java 13: preview feature
 * Java 15: finalized
 * */

public class TextBlockPOC {

    public static String jsonString = """
            {
                "name": "John Doe",
                "age": 30,
                "email": "john.doe@example.com",
                "isActive": true
            }
            """;

    public static void main(String[] args) {
        System.out.println("jsonString = " + jsonString);
    }
}
