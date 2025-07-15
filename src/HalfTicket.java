public class HalfTicket extends Ticket {

    public HalfTicket(int value, String filmName, String tipe) {
        super(value, filmName, tipe);
    }

    public int getValue() {
        return value / 2;
    }
}
