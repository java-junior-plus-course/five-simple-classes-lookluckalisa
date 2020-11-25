public class Stock {
    private int id, quantity;
    String date;
    private boolean status;

    public void stock(int id, int quantity, boolean status) {
        this.id = id;
        this.quantity = quantity;
        this.status = status;
        new Order().getId();
        new Order().getDate();
        new Product().getId();
        new Order().getQuantity();
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public int getQuantity() {

        return quantity;
    }

    public void setQuantity() {

        this.quantity = quantity;
    }

    public String getDate() {

        return date;
    }

    public void setDate() {
        this.date = date;
    }

    public boolean addStock(int id, int quantity, boolean status) {
        this.id = id;
        this.quantity = quantity;
        this.status = status;
        return status = true;
    }

    public void editStock(int quantity, boolean status) {
        this.quantity = quantity;
        this.status = status;
        new Order().setId();
        new Order().setDate();
        new Product().setId();
        new Order().setQuantity();
    }
}