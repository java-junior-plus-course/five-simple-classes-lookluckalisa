public class Order {
    private int id, quantity;
    private float amount;
    private String date;
    private boolean status;


    public void order(int id, int quantity, float amount, String date, boolean status) {
        this.id = id;
        this.quantity = quantity;
        this.amount = amount;
        this.date = date;
        this.status = status;
        new User().getId();
        new User().getAddress();
        new User().getFullName();
        new User().getEmail();
        new User().getPhone();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDate() {
        return id;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getQuantity() {

        return quantity;
    }

    public void setQuantity(int id) {

        this.quantity = quantity;
    }

    public boolean isStatus() {

        return status;
    }

    public void setStatus(boolean status) {

        this.status = status;
    }

    public boolean createOrder(float amount) {
        new User().getId();
        new Product().getId();
        this.amount = amount;
        return status = true;
    }

    public boolean createOrder(float amount, String date) {
        new User().getFullName();
        new Product().getId();
        this.amount = amount;
        this.date = date;
    }

    public void editOrder(int quantity, float amount, String date) {
        this.quantity = quantity;
        this.amount = amount;
        this.date = date;
        new User().setAddress();
        new User().setFullName();
        new User().setEmail();
        new User().setPhone();
    }

    public void copyOrder(int quantity, float amount, String date) {
        this.quantity = quantity;
        this.amount = amount;
        this.date = date;
        new User().setAddress();
        new User().setFullName();
        new User().setEmail();
        new User().setPhone();
    }

    public void deleteOrder(int id) {
        System.out.println("Заказ удалён");
    }

    public boolean block() {
        return status = false;
    }
}