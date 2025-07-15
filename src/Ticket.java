public class Ticket {

    int value;
    String filmName;
    String tipe;

    public Ticket(int value, String filmName, String tipe){
        this.value = value;
        this.filmName = filmName;
        this.tipe = tipe;
    }

    public int getValue() {
        return value;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }
}
