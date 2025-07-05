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
        // it appears here enaha user thread bas if we wrote that line after we change it to daemon thread el output hait8aiar 3ady 

        System.out.println(thread2.isAlive());// Check if the thread is alive 
        System.out.println(thread2.getName());
        thread2.setName("Thread 2");
        System.out.println(thread2.getName());

        //it inherits the priority of the main thread 
        System.out.println(thread2.getPriority());

        //change the priority of the thread
        thread2.setPriority(5); // Set the priority of thread2 to 5
        System.out.println(thread2.getPriority());

        System.out.println(Thread.activeCount()); // Print the number of active threads

        /*There are
         *********USER THREADS*********
         * User threads are the main threads that run your application code. They are created by the programmer and can be either foreground or background threads.
         * * They are typically used for tasks that require user interaction or processing.
         *********DAEMON THREADS*********
         * Daemon threads are used for background tasks and do not prevent the JVM from exiting.
         * * They are typically used for tasks that run in the background, such as garbage collection or monitoring.
         */

        //Check if the thread is a daemon thread 
        System.out.println("Is thread2 a daemon thread? " + thread2.isDaemon());

        //Setting the thread as a daemon thread
        thread2.setDaemon(true);
        System.out.println("Is thread2 a daemon thread? " + thread2.isDaemon());
        
        //thread2.start(); // Start the thread (After the thread is started, the run method. that i have made in the MyThread class, will be called automatically)
    }
}

