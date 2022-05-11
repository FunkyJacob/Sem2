package Opgave1;

public class Demo {

   private volatile boolean part1done = false;

    public synchronized void part1()
    {
        System.out.println("Welcome to India");
        part1done = true;
        notify(); //has been commented, waiting
        // thread remains waiting forever notify();
    }

    public synchronized void part2()
    {
        while (!part1done) {
            try {
                wait();
            }
            catch (Exception e) {
                System.out.println("Exception : "
                        + e.getClass());
                // quit program after exception is thrown
                System.exit(-1);
            }
        }
        System.out.println("Do visit Taj Mahal");
    }

}
