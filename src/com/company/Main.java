package com.company;

import model.Bankomat;
import model.Klijent;
import model.User;
import repository.UserRepository;
import servis.AdminServis;
import servis.KlijentServis;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Bankomat bankomat= new Bankomat();
        AdminServis adminServis = new AdminServis();
        UserRepository userRepository = new UserRepository();
        List<User> listaUsera = userRepository.getListaUsera();
        User ulogovaniUser = getUser(listaUsera);

        if (ulogovaniUser.isAdmin()) {
            adminServis.meni(ulogovaniUser, bankomat);
        } else if (ulogovaniUser.equals(null)) {
            nijeNadjenKlijent();
        } else {
            KlijentServis.meni((Klijent) ulogovaniUser);
        }
    }

    private static void nijeNadjenKlijent() {
        System.out.println("Nemamo u evidenciji usera sa tim kredencijalima");
    }

    private static User getUser(List<User> listaUsera) {
        System.out.println("ATM.... \n Enter your name ");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.next();
        System.out.println("unesite vaš password ");
        String pass = scanner.next();
        for (User user : listaUsera) {
            if (user.getPass().equals(pass) &&
                    user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }
}
