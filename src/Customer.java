public class Customer {
    private String name;
    private String address;
    private EWallet eWallet = new EWallet("");

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public EWallet getEWallet() {
        return eWallet;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEWallet(EWallet eWallet) {
        this.eWallet = eWallet;
    }

    public void displayAccount() {
        System.out.println("-----[Info Account]-----");
        System.out.println("Owner Name    : " + this.name);
        System.out.println("Owner Address : " + this.address);
        System.out.println("eWallet Name  : " + this.eWallet.getEWalletName());
        System.out.println("Balance       : " + this.eWallet.getSaldo());
        System.out.println("------------------------");
    }
}
