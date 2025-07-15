public class FamilyTicket extends Ticket {
    private int tickets;

    public FamilyTicket(int value, String filmName, String tipe, int tickets){
       super(value, filmName, tipe);
       this.tickets = tickets;
   }

   @Override
   public int getValue() {
       if (tickets > 3){
           return value *= tickets - (value * 0.05);
       }else{
           return value * tickets;
       }
   }
}
