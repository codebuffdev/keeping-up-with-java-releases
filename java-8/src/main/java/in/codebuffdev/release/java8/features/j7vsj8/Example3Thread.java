package in.codebuffdev.release.java8.features.j7vsj8;

public class Example3Thread {
    public static void main(String[] args) {
        //pre-java8
        Runnable r = new Runnable(){
            @Override
            public void run() {
                System.out.println("Running example");
            }
        };
        new Thread(r).start();

        //post-java8
        Runnable r2 = () -> System.out.println("Running example2");
        new Thread(r2).start();
    }
}
