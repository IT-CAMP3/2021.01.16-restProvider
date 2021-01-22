package pl.camp.it.rest.provider;

public class ProcesorDanych implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 15; i++) {
                System.out.println("Coś liczę");
                Thread.sleep(1000);
            }

            System.out.println("Policzyłem !!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
