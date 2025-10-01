package payment;

public class CreditCardPayment extends PaymentMethod {
    public CreditCardPayment() {
        super("Không dùng tiền mặt", "Thẻ tín dụng");
    }

    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán " + amount + " bằng " + name + ".");
    }
}
