package Methoden;

public class nuetzlicheMethoden {
    public static void timer() throws InterruptedException {
        int count = 1;
        while (count <= 10) {
            System.out.println("Sekunde " + count);
            Thread.sleep(1000); // Pause für 1 Sekunde
            count++;
        }
        System.out.println("Timer abgelaufen!");
    }


    public static void main(String[] args) {
        try {
            timer();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
