package model;

public class Klijent extends User {
    private double stanje;

    public Klijent(String username, String pass) {
        super(username, pass);
        stanje= 1200;
    }

    public double getStanje() {
        return stanje;
    }

    public void setStanje(double stanje) {
        this.stanje = stanje;
    }
}
