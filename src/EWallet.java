import java.util.ArrayList;
import java.util.List;

public class EWallet {
    private String eWalletName;
    private int saldo;
    private List<Transaction> listTransactions = new ArrayList<>();

    EWallet(String eWalletName){
        this.eWalletName = eWalletName;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getEWalletName() {
        return eWalletName;
    }

    public int getSaldo() {
        return saldo;
    }
    
    public void cekSaldo() {
        System.out.println("-----[Check Balance]-----");
        // System.out.println("Ownler             : " + this.);
        System.out.println("eWallet Name       : " + this.eWalletName);
        System.out.println("Balance            : " + this.saldo);
        System.out.println("Total Transactions : " + this.listTransactions.size());
        System.out.println("-------------------------");
    }

    public List<Transaction> getListTransactions() {
        return listTransactions;
    }

    public Transaction getLastTransaction() {
        return listTransactions.get(listTransactions.size()-1);
    }

    public void topup(Topup t) {
        this.listTransactions.add(t);
        this.saldo += t.getNominal();
    }

    public void transfer(Transfer t) {
        this.listTransactions.add(t);
        this.saldo -= t.getNominal();
        t.getRecipient().eWallet.receiveTransfer(t);;
    }

    public void receiveTransfer(Transfer t) {
        this.listTransactions.add(t);
        this.saldo += t.getNominal();
    }
}
