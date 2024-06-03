public class AppMain {
    public static void main(String[] args) {
        // Register Andi & Budi as customers
        Customer Andi = new Customer();
        Andi.setName("Andi Wicaksono");
        Andi.setAddress("Jl. Tembolok 10");

        Customer Budi = new Customer();
        Budi.setName("Budi Harionto");
        Budi.setAddress("Jl. Mangroof 15");


        // Andi & Budi Create EWallet
        EWallet Andi_EWallet = new EWallet("Gopay");
        Andi.setEWallet(Andi_EWallet);
        
        EWallet Budi_EWallet = new EWallet("Dana");
        Budi.setEWallet(Budi_EWallet);


        // Andi & Budi Do Topup n' Display Topup Detail
        Topup Andi_Topup1 = new Topup(2_000_000, "REF001", "Alfamaret");
        Andi.eWallet.topup(Andi_Topup1);
        Andi.eWallet.getLastTransaction().displayDetail();
        
        Topup Budi_Topup1 = new Topup(1_000_000, "REF002", "QRIS");
        Budi.eWallet.topup(Budi_Topup1);
        Budi.eWallet.getLastTransaction().displayDetail();


        // Andi Transfer to Budi
        Transfer transfer1 = new Transfer(500_000, Budi);
        Andi.eWallet.transfer(transfer1);

        // Andi n Budi do Check Balance
        Andi.eWallet.cekSaldo();
        Budi.eWallet.cekSaldo();
    }
}
