public class ThreadAssignment {

    static class Counter {
        void count() {
            //todo implement me
        	for(int i = 350; i>0;i--) {
        		System.out.println(i);
        	}
        	System.out.println("FINISH !");
        }
    }

    static class MyThread extends Thread {
        private final Counter counter;
        //private String name;
        public MyThread(Counter counter) {
            this.counter = counter;
            //this.name = name;
        }

        @Override
        public void run() {
        	synchronized (counter) {
                counter.count();
                //System.out.println(this.name);
        	}
        }
    }

    public static void main(String[] args) {
        Counter counter = new Counter();

        new MyThread(counter).start();
        new MyThread(counter).start();
    }
}