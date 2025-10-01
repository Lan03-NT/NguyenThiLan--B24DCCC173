package payment;

public class PayPalPayment extends PaymentMethod {
    public PayPalPayment() {
        super("Không dùng tiền mặt", "PayPal");
    }

    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán " + amount + " qua " + name + ".");
    }
}
