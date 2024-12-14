public class Main {
    
    public static void main(String[] args){

       Website website = new Website(3);
       
        Thread t1 = new Thread(website,"Thread-1");
        Thread t2 = new Thread(website,"Thread-2");
        Thread t3 = new Thread(website,"Thread-3");
        t1.start();
        t2.start();
        t3.start();

        try {
            // Wait for all threads to finish
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // After all threads have finished, print final visit counts for all pages
        for (int i = 0; i < 3; i++) {
            System.out.println("Final visit count for Page " + (i + 1) + ": " + website.getVisitCount(i));
        }
    }
}
