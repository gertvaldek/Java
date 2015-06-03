
public class Payment {
	
	private String receiver;
	private String receiverAccount;
	private String paymentName;
	private String senderAcoount;
	private String currency;
	private String swift;
	private double sum;
	
	public double getSum() {
		return sum;
	}
	public void setSum(double sum) {
		this.sum = sum;
	}

	public String getReceiver() {
		return receiver;
	}
	
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	
	public String getReceiverAccount() {
		return receiverAccount;
	}
	
	public void setReceiverAccount(String receiverAccount) {
		this.receiverAccount = receiverAccount;
	}
	
	public String getPaymentName() {
		return paymentName;
	}
	
	public void setPaymentName(String name) {
		this.paymentName = name;
	}
	
	public String getSenderAcoount() {
		return senderAcoount;
	}
	
	public void setSenderAcoount(String senderAcoount) {
		this.senderAcoount = senderAcoount;
	}
	
	public String getCurrency() {
		return currency;
	}
	
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	public String getSwift() {
		return swift;
	}
	
	public void setSwift(String swift) {
		this.swift = swift;
	}

	
	
	
	
	
	

}
