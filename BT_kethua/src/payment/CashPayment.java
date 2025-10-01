package payment;

public class CashPayment extends PaymentMethod {
    public CashPayment() {
        super("Trực tiếp", "Tiền mặt");
    }

    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán " + amount + " bằng " + name + ".");
    }
}

