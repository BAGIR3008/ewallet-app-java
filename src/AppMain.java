public class AppMain {
    public static void main(String[] args) {
        // Register Andi & Budi as customers
        Customer Andi = new Customer();
        Andi.setName("Andi Wicaksono");
        Andi.setAddress("Jl. Tembolok 10");

        Customer Budi = new Customer();
        Budi.setName("Budi Harionto");
        Budi.setAddress("Jl. Mangroof 15");


        // Andi & Budi Set EWallet's name
        Andi.getEWallet().setEWalletName("Gopay");
        Budi.getEWallet().setEWalletName("Dana");


        // Andi & Budi Do Topup n' Display Topup Detail
        Andi.getEWallet().topup(2_000_000, "REF001", "Alfamaret");
        Andi.getEWallet().displayLastTransaction();
        
        Budi.getEWallet().topup(1_000_000, "REF002", "QRIS");
        Budi.getEWallet().displayLastTransaction();


        // Andi Transfer to Budi
        Andi.getEWallet().transfer(500_000, Andi, Budi);
        Andi.getEWallet().displayLastTransaction();
        Budi.getEWallet().displayLastTransaction();


        // Andi n Budi do Check Balance
        Andi.getEWallet().cekSaldo();
        Budi.getEWallet().cekSaldo();
        
        
        // Andi n Budi do Check Information Account
        Andi.displayAccount();
        Budi.displayAccount();
    }
}
