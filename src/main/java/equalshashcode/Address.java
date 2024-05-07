package equalshashcode;

import java.util.Objects;

public class Address {
    public String area;
    public String street;
    public String pincode;
    public String state;
    public String flatno;

    @Override
    public String toString() {
        return "Address{" +
                "area='" + area + '\'' +
                ", street='" + street + '\'' +
                ", pincode='" + pincode + '\'' +
                ", state='" + state + '\'' +
                ", flatno='" + flatno + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(area, address.area) && Objects.equals(street, address.street) && Objects.equals(pincode, address.pincode) && Objects.equals(state, address.state) && Objects.equals(flatno, address.flatno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(area, street, pincode, state, flatno);
    }
}
