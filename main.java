public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Application started and running continuously...");
        
        // Keep the main thread alive indefinitely so Kubernetes doesn't crash the container
        while (true) {
            try {
                // Sleep for 60 seconds to keep CPU usage at 0%
                Thread.sleep(60000);
            } catch (InterruptedException e) {
                System.out.println("Application interrupted, shutting down.");
                break;
            }
        }
    }
}
