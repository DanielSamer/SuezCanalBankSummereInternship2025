package JavaThreads;

public class Main1 {
    public static void main(String[] args) {
        // To get the count of active threads
        System.out.println(Thread.activeCount());

        //Setting and getting Names 
        Thread.currentThread().setName("MAIIIIINNN");
        System.out.println(Thread.currentThread().getName());

        //Setting and getting the priority of the thread
        Thread.currentThread().setPriority(10);
        System.out.println(Thread.currentThread().getPriority());

        //Check if the thread is alive
        System.out.println(Thread.currentThread().isAlive());

        //check if the thread is sleep 
        for (int i = 3; i>0; i--){
            System.out.println("Sleeping for " + i + " seconds...");
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted!");
            }
        }

        System.out.println ("We will start thread 2 here");
        //Making a second thread 
        MyThread thread2 = new MyThread(); 
        thread2.start(); // Start the thread (After the thread is started, the run method. that i have made in the MyThread class, will be called automatically)
        System.out.println(thread2.isAlive());// Check if the thread is alive 
        System.out.println(thread2.getName());
        thread2.setName("Thread 2");
        System.out.println(thread2.getName());






    }
}

