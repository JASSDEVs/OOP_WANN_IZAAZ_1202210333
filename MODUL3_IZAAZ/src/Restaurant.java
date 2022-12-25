public class Restaurant implements Runnable {
    private boolean waitingForPickup = false;
    private static final Object lock = new Object();
    private static int foodnumber = 1; 
    
    public void run(){
        while(true) {
            makeFood();
            try{
                Thread.sleep(4000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    public void setwaitingForPickup(boolean waitingForPickup){
        this.waitingForPickup = waitingForPickup;
    }
    public static int getFoodNumber(){
        return foodnumber;
    }
    public void makeFood(){
        synchronized(Restaurant.lock){
            if(this.waitingForPickup){
                try{
                    System.out.println("Restaurant : Waiting for the waiter to deliver the food");
                    Restaurant.lock.wait();
                } catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
            waitingForPickup = true;
            System.out.println("Restourant: Making Food "+foodnumber++);
            Restaurant.lock.notifyAll();
            System.out.println("Restourant: Telling the waiter to get the coffe\n");
        }
    }
    public static Object getLock() {
        return lock;
    }
}