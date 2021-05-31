package repository;

import model.Klijent;
import model.User;

import java.util.ArrayList;
import java.util.List;

class OtidjiUBazuPoUsere {

    public static ArrayList<User> get(){
        ArrayList<User> lista =new ArrayList<>();
        User admin = new User("admin", "123", true);
        User klijent = new Klijent("klijent", "123");
        lista.add(admin);
        lista.add(klijent);

        // snimanje u DB
        return lista;
    }
}
