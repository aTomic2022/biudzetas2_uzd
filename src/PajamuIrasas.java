import java.time.LocalDate;

public class PajamuIrasas {
    private float suma;
    private String data;
    private String kategorija;
    private boolean pozymisaArIbanka;
    private String papildomaInfo;


    public PajamuIrasas(float suma, String data, String kategorija, boolean pozymisaArIbanka, String papildomaInfo) {
        this.suma = suma;
        this.data = data;
        this.kategorija = kategorija;
        this.pozymisaArIbanka = pozymisaArIbanka;
        this.papildomaInfo = papildomaInfo;
    }

    public float getSuma() {
        return suma;
    }

    public void setSuma(float suma) {
        this.suma = suma;
    }

    public String getData() {
        return data;
    }


    public String getKategorija() {
        return kategorija;
    }

    public void setKategorija(String kategorija) {
        this.kategorija = kategorija;
    }

    public boolean getPozymisaArIbanka() {
        return pozymisaArIbanka;
    }

    public void setPozymisaArIbanka(boolean pozymisaArIbanka) {
        this.pozymisaArIbanka = pozymisaArIbanka;
    }

    public String getPapildomaInfo() {
        return papildomaInfo;
    }

    public void setPapildomaInfo(String papildomaInfo) {
        this.papildomaInfo = papildomaInfo;
    }
}