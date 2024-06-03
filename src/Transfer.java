public class Transfer extends Transaction{
    private Customer sender;
    private Customer recipient;

    Transfer(int nominal, Customer recipient) {
        super(nominal);
        this.sender = super.getCustomer();
        this.recipient = recipient;
    }

    public void setSender(Customer sender) {
        this.sender = sender;
    }

    public void setRecipient(Customer recipient) {
        this.recipient = recipient;
    }

    public Customer getSender() {
        return sender;
    }

    public Customer getRecipient() {
        return recipient;
    }

    @Override
    public void displayDetail() {
        System.out.println("============================");
        System.out.println("Sender's name    : " + this.sender.getName());
        System.out.println("Recipient's name : " + this.recipient.getName());
        System.out.println("Nominal          : " + this.getNominal());
        System.out.println("Date/Time        : " + this.getDate().toString());
        System.out.println("============================");
    }
    
}
