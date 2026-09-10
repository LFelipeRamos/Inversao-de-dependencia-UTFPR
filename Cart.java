public class Cart {
    private int id;
    private double total;

    public Cart(int id, double total) {
        this.id = id;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public double getTotal() {
        return total;
    }
}
