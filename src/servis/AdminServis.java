package servis;

import model.Bankomat;
import model.User;

import java.util.Scanner;

public class AdminServis {
    public void meni(User user, Bankomat bankomat) {
        prvaPoruka("Ulogovani ste kao admin..ovdje ide meni za admina");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        ispisMenija();
        while (input != 0) {
            switch (input) {
                case 1: {
                    stanjeUBankomatu(bankomat);
                    break;
                }
                case 2: {
                    System.out.println("Klijentovo stanje");
                    break;
                }
                case 3: {
                    System.out.println("Dodaj novac metoda...");
                    break;
                }
                case 4: {
                    break;
                }
                case 6: {
                    ispisMenija();
                    break;
                }
            }
        }
    }

    private void ispisMenija() {
        System.out.println("0) - izlaz\n" +
                "1) - Pregled stanja u bankomatu\n" +
                "2) Dodajte novog klijenta\n" +
                "3) Dodajte novog admina\n" +
                "4) Dodaj novac na klijentov račun" +
                "5) Ispis svih klijenata\n" +
                "6) Ispiši meni" +
                "****************************");
    }

    private void prvaPoruka(String s) {
        System.out.println(s);
    }

    private void stanjeUBankomatu(Bankomat bankomat) {
        prvaPoruka("Stanje U bankomatu" + bankomat.stanje);
    }
}
