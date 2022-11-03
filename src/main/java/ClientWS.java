import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService stub= new BanqueWS().getBanqueServicePort();
        System.out.println(stub.conversionDhToEuro(7000));
        Compte cpt= stub.getCompte(1);
        System.out.println(cpt.getCode());
        System.out.println(cpt.getSolde());

    }
}
