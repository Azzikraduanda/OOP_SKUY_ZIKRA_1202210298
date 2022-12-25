public class Restaurant implements Runnable {

    private boolean waitingforpickup = false;
    private static final Object lock = new Object();
    private static int FoodNumber = 1;

    @Override 
    public void run() {
        while (true) {
            makeFood();
            try {
                Thread.sleep(40000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void setWaitingForPickup(boolean waitingforpickup) {
        this.waitingforpickup = waitingforpickup;
    }

    public static int getFoodNumber() {
        return FoodNumber;
    }

    public void makeFood() {
        synchronized(Restaurant.lock) {
            if (this.waitingforpickup) {
                try {
                    System.out.println("restaurant: Waiting for the Waiter to deliver the food ");
                    Restaurant.lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

            waitingforpickup = true;
            System.out.println("restaurant:  Making food Number " + FoodNumber++);
            Restaurant.lock.notifyAll();
            System.out.println("restaurant: Telling the waiter to get the coffe\n");
        }
    }

    public static Object getLock() {
        return lock;
    }
}