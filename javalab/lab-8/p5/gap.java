class CounterThread extends Thread {
    private int start;
    private int end;

    public CounterThread(int start, int end, String name) {
        super(name);
        this.start = start;
        this.end = end;
    }


    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class  gap{
    public static void main(String[] args) {
        String threadName = "ChildThread";
        if (args.length > 0) {
            threadName = args[0];
        }

        CounterThread childThread = new CounterThread(1, 100, threadName);

        childThread.start();
    }
}
