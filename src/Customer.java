public class Customer {
    private String name;
    private String address;
    public EWallet eWallet;

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
}
