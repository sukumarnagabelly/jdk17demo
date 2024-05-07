package map;




import java.util.*;

public class TicketTestDemo {
    public static void main(String[] args) {
        List<Ticket>ticketList=new ArrayList<>();
        Map<Integer,Ticket> ticketMap=new HashMap<>();
        for(int i=0;i<1000;i++){
            Ticket ticket=new Ticket();
            ticket.pnr="1111"+i;
            ticketList.add(ticket);
            ticketMap.put(ticket.hashCode(),ticket);
        }
        ticketMap.forEach((integer, ticket) -> {
            System.out.println("key from forEach"+integer+"value"+ticket.pnr);
        });
        Ticket findTicket=new Ticket();
        findTicket.pnr="1111564";
        System.out.println("getting ticket form the list");
        long liststarttime=System.currentTimeMillis();


        Iterator<Ticket> ticketIterator = ticketList.iterator();
        for(;ticketIterator.hasNext();){
            Ticket ticket=ticketIterator.next();
            if(ticket.equals(findTicket)){
                System.out.println("find the ticket"+ticket.pnr);
                break;
            }

        }
        long listendtime=System.currentTimeMillis();
        System.out.println("timetaken"+(listendtime-liststarttime));
        System.out.println("getting ticket from map");
        long mapstarttime=System.currentTimeMillis();
        Ticket MapTicket=ticketMap.get(findTicket.hashCode());
        System.out.println("find the ticket from map"+MapTicket.pnr);
        long mapendtime=System.currentTimeMillis();
        System.out.println("time taken map"+(mapendtime-mapstarttime));


    }

}
