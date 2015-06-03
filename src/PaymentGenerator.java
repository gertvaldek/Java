import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class PaymentGenerator {
	
	
	
	private static List<Payment> payments = new ArrayList<>();
	public static void main(String[] args) {
		for (int i = 0; i<=1500; i++) {
		PaymentLocal p = new PaymentLocal();
		p.setReceiver("Maali Maasikas");
		p.setReceiverAccount("EE24101001000018");
		p.setSum(randomSum());
		p.setPaymentName("Ulekanne");
		p.setSenderAcoount("EE411111111111111");
		p.setCurrency("EUR");
		payments.add(p);

		}	
	
		Runnable gertRunnable = new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < payments.size(); i++) {
				Payment p = payments.get(i);
					System.out.println("Summa " + p.getSum());
					System.out.println(p.getCurrency());
					System.out.println(p.getReceiver());
					System.out.println(p.getReceiverAccount());
					System.out.println(p.getSenderAcoount());
					System.out.println("-------------- PROCESSED BY ");
					try {
						Thread.sleep(15);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
			}
		
			
		};
	
		for (int i = 0; i < 20; i++){
			Thread t = new Thread(gertRunnable);
			t.start();

		}
	
		
		
			
					

	
	}
	
		
	
	
	// Generating random numbers in this method
	private static int randomSum() {
		Random r = new Random();
		return r.nextInt(100);
	
	}

	
}

