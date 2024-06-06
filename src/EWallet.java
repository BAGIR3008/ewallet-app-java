import java.util.ArrayList;
import java.util.List;

public class EWallet {
    private String eWalletName;
    private int saldo;
    private List<Transaction> listTransactions = new ArrayList<>();

    EWallet(String eWalletName){
        this.eWalletName = eWalletName;
    }

    public void setEWalletName(String eWalletName) {
        this.eWalletName = eWalletName;
    }

    public String getEWalletName() {
        return eWalletName;
    }

    public int getSaldo() {
        return saldo;
    }
    
    public void cekSaldo() {
        System.out.println("-----[Check Balance]-----");
        System.out.println("eWallet Name       : " + this.eWalletName);
        System.out.println("Balance            : " + this.saldo);
        System.out.println("Total Transactions : " + this.listTransactions.size());
        System.out.println("-------------------------");
    }

    public List<Transaction> getListTransactions() {
        return listTransactions;
    }

    public void displayLastTransaction() {
        if (listTransactions == null) {
            System.out.println("No Transaction History");
            return;
        }

        listTransactions.get(listTransactions.size()-1).displayDetail();;
    }

    public Boolean topup(int nominal, String referenceNumber, String paymentMethod) {
        if (nominal < 1 || referenceNumber == "" || paymentMethod == "") {
            return false;
        }

        Topup topup = new Topup(nominal, referenceNumber, paymentMethod);
        this.listTransactions.add(topup);
        this.saldo += nominal;
        return true;
    }

    public Boolean transfer(int nominal, Customer sender, Customer recipient) {
        if (sender == null || recipient == null ||
            nominal < 1 || sender.getEWallet().getSaldo() < nominal) {
            return false;
        }

        Transfer transfer = new Transfer(nominal, sender, recipient);
        this.listTransactions.add(transfer);
        this.saldo -= nominal;
        recipient.getEWallet().receiveTransfer(transfer);
        return true;
    }

    public void receiveTransfer(Transfer t) {
        this.listTransactions.add(t);
        this.saldo += t.getNominal();
    }
}
