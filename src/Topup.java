public class Topup extends Transaction{
    private String referenceNumber;
    private String paymentMethod;

    Topup(int nominal, String referenceNumber, String paymentMethod) {
        super(nominal);
        this.referenceNumber = referenceNumber;
        this.paymentMethod = paymentMethod;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    @Override
    public void displayDetail() {
        System.out.println("============================");
        System.out.println("Reference Number : " + this.getReferenceNumber());
        System.out.println("Payment Method   : " + this.getPaymentMethod());
        System.out.println("Nominal          : " + this.getNominal());
        System.out.println("Date/Time        : " + this.getDate().toString());
        System.out.println("============================");
    }
}
