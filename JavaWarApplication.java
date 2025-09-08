public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World from AWS EC2!");
        // Keep app running to see output in logs (optional)
        try {
            Thread.sleep(60000); // sleep for 60 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
