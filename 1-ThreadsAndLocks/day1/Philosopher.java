import java.util.Random;

class Chopstick {
  private int id;
  public Chopstick(int id) { this.id = id; }
  public int getId() { return id; }
}

class Philosopher extends Thread {

  private Chopstick left, right;
  private Random random;

  public Philosopher(Chopstick left, Chopstick right) {
    this.left =left;
    this.right =right;
    random = new Random();
  }

  public void run() {
    try {
      while(true) {
        System.out.println("I will think for a while");
        Thread.sleep(random.nextInt(1000));
        synchronized(left) {
          synchronized(right) {
            System.out.println("I will sleep for a while");
            Thread.sleep(random.nextInt(1000));
          }
        }
      }
    } catch (InterruptedException e) {}
  }
}

class DiningPhilosopher {
  public static void main(String[] args) throws InterruptedException {
    Chopstick bag1 = new Chopstick(1);
    Chopstick bag2 = new Chopstick(2);

    Philosopher P1 = new Philosopher(bag1, bag2);
    Philosopher P2 = new Philosopher(bag2, bag1);

    P1.start();
    P2.start();
    P1.join();
    P2.join();

  }
}