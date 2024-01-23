package lambda;

public class RunnableLambdaExample {
    public static void main(String[] args) {

        /**
         * before java 8;
         */
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside runnable 1");
            }
        };

        new Thread(runnable).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 1.1");
            }
        }).start();

        //Java 8 Lambda

        // ()->{};

        //all are lambda methods.

        Runnable runnableLambda = () -> {
            System.out.println("Inside Runnable 2 (lambda)");
            System.out.println("For multiple statements");
        };

        new Thread(runnableLambda).start();

        Runnable runnableLambda1 = () -> System.out.println("Inside Runnable 3");

        new Thread(runnableLambda1).start();

        new Thread(() -> System.out.println("Inside Runnable 4")).start();
    }
}
