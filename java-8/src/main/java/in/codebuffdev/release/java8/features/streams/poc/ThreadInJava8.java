package in.codebuffdev.release.java8.features.streams.poc;

/*
 * resource:devoxxVenkatsubramaniam*/
public class ThreadInJava8 {
    public static void main(String[] args) {
        new Thread(()->{
            System.out.println("Child Thread");
        }).start();
        System.out.println("main thread");
    }
}
