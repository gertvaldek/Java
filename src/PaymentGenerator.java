import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class PaymentGenerator {


    private static int paymentIndex = 0;

    private static synchronized Payment giveMePayment(){
        if(paymentIndex < payments.size()){
            return payments.get(paymentIndex++);
        }
        return null;
    }


    private static List<Payment> payments = new ArrayList<>();
    public static void main(String[] args) {
        for (int i = 0; i<=1000; i++) {
            PaymentForeign p = new PaymentForeign();
            p.setReceiver("Maali Maasikas");
            p.setReceiverAccount("EE24101001000018");
            p.setSum(randomSum());
            p.setPaymentName("Ulekanne");
            p.setSenderAcoount("EE411111111111111");
            p.setCurrency("EUR");
            payments.add(p);

        }
        
        // Generating USD payments
        for (int i = 0; i<=250; i++) {
            PaymentForeign p = new PaymentForeign();
            p.setReceiver("Juhan Juurikas");
            p.setReceiverAccount("EE24101001000018");
            p.setSum(randomSum());
            p.setPaymentName("Ulekanne");
            p.setSenderAcoount("EE411111111111111");
            p.setCurrency("USD");
            payments.add(p);

        }
        
        // Generating GPB payments
        for (int i = 0; i<=250; i++) {
            PaymentForeign p = new PaymentForeign();
            p.setReceiver("Mari Kaalikas");
            p.setReceiverAccount("EE24101001000018");
            p.setSum(randomSum());
            p.setPaymentName("Ulekanne");
            p.setSenderAcoount("EE411111111111111");
            p.setCurrency("GPB");
            payments.add(p);

        }

        Runnable gertRunnable = new Runnable(){

            @Override
            public void run() {
                Payment p = null;
                while((p = giveMePayment())!= null){
                    System.out.println("Summa " + p.getSum());
                    System.out.println(p.getCurrency());
                    System.out.println(p.getReceiver());
                    System.out.println(p.getReceiverAccount());
                    System.out.println(p.getSenderAcoount());
                    System.out.println("Teenustasu " + p.getServiceFee());
                    System.out.println("Thread ID - " + Thread.currentThread().getName());
                    System.out.println("---------------------------");
                }
            }


        };

        for (int i = 0; i < 5; i++){
            Thread t = new Thread(gertRunnable);
            t.start();
            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
    		t.interrupt();
    		System.out.println("Finished");
        }

    }

    // Generating random numbers in this method
    private static int randomSum() {
        Random r = new Random();
        return r.nextInt(100);

    }

}