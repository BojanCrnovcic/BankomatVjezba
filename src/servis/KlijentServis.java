package servis;

import model.Bankomat;
import model.Klijent;
import model.User;
import validacija.ValidacijaUsera;

public class KlijentServis {
    public static void meni(Klijent user){
        if(ValidacijaUsera.validan(user)){}
        else {}
        System.out.println("Upravo ste se ulogovali kao " + user);
    }

    public void povlacenjeNovca(double iznosKojipovlacis,Bankomat bankomat, Klijent user){
    }
}
