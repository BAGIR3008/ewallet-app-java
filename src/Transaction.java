import java.util.Date;

public abstract class Transaction {
    private int nominal;
    private Date date = new Date();
    private Customer customer;

    Transaction(int nominal) {
        if (nominal > 0) {
            this.nominal = nominal;
        }
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getNominal() {
        return nominal;
    }

    public Date getDate() {
        return date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public abstract void displayDetail();
}
