package repository;

import model.User;

import java.util.List;

public class UserRepository {
    List<User> listaUsera = OtidjiUBazuPoUsere.get();

    public List<User> getListaUsera() {
        return listaUsera;
    }
}
