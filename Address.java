public class Address {
    private int id;
    private String street;
    private String city;
    private String zipcode;
    private String number;

    public Address(int id, String street, String city, String zipcode, String number) {
        this.id = id;
        this.street = street;
        this.city = city;
        this.zipcode = zipcode;
        this.number = number;
    }

    // Dependência invertida:
    // agora Address usa TransportCompany.
    public Frete calcFrete(TransportCompany company, Cart cart) {
        System.out.println("Address está chamando a TransportCompany...");
        return company.calcFrete(zipcode, cart);
    }

    public int getId() {
        return id;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public String getNumber() {
        return number;
    }
}
