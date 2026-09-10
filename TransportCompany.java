public class TransportCompany {
    private int id;
    private String name;

    public TransportCompany(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // TransportCompany não depende mais de Address.
    // Recebe apenas o CEP necessário para calcular o frete.
    public Frete calcFrete(String zipcode, Cart cart) {
        System.out.println("TransportCompany recebeu somente o CEP: " + zipcode);

        double cost = 20.0;

        if (cart.getTotal() >= 200.0) {
            cost = 10.0;
        }

        int days = 5;

        return new Frete(zipcode, cost, days, this);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
