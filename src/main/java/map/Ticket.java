package map;

import java.util.Objects;

public class Ticket {
    public String pnr;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return Objects.equals(pnr, ticket.pnr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pnr);
    }
}
