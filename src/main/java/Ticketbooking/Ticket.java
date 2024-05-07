package Ticketbooking;

public class Ticket {
    public String  status;
    public String seatNum;
    public String ticketNum;

    @Override
    public String toString() {
        return "Ticket{" +
                "status='" + status + '\'' +
                ", seatnum='" + seatNum + '\'' +
                ", ticketnum='" + ticketNum + '\'' +
                '}';
    }
}
