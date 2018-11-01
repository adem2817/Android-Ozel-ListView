package e.adem2.ozellistview;

import java.io.Serializable;

public class Ulke implements Serializable {

    private String ulkeAdi;
    private String Nufusu;

    public Ulke(String ulkeAdi, String nufusu) {
        this.ulkeAdi = ulkeAdi;
        Nufusu = nufusu;
    }

    public String getUlkeAdi() {
        return ulkeAdi;
    }

    public void setUlkeAdi(String ulkeAdi) {
        this.ulkeAdi = ulkeAdi;
    }

    public String getNufusu() {
        return Nufusu;
    }

    public void setNufusu(String nufusu) {
        Nufusu = nufusu;
    }
}
