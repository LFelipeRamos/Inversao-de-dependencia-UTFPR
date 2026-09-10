public class Frete {
    private String zipcode;
    private double cost;
    private int days;
    private TransportCompany transportCompany;

    public Frete(String zipcode, double cost, int days, TransportCompany transportCompany) {
        this.zipcode = zipcode;
        this.cost = cost;
        this.days = days;
        this.transportCompany = transportCompany;
    }

    public String getZipcode() {
        return zipcode;
    }

    public double getCost() {
        return cost;
    }

    public int getDays() {
        return days;
    }

    public TransportCompany getTransportCompany() {
        return transportCompany;
    }
}
