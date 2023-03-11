package sk.stuba.fei.uim.oop;

public class Student {
    int ID;
    String meno;
    String priezvisko;
    int vek;

    public Student(int ID, String meno, String priezvisko, int vek) {
        this.ID = ID;
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.vek = vek;
    }
    public Student( String meno) {
        this.meno = meno;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public void setPriezvisko(String priezvisko) {
        this.priezvisko = priezvisko;
    }

    public void setVek(int vek) {
        this.vek = vek;
    }

    public int getID() {
        return ID;
    }

    public String getMeno() {
        return meno;
    }

    public String getPriezvisko() {
        return priezvisko;
    }

    public int getVek() {
        return vek;
    }
    public String toString() {
        return  " " + this.meno.toString();
    }
}
