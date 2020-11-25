public class Product {
    private int id, quantity;
    private float price, weight;
    private String name, manufacturer;
    boolean status;

    public void product(int id, float price, String name, String manufacturer, float weight, boolean status) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.manufacturer = manufacturer;
        this.weight = weight;
        this.status = status;
        new Stock().getQuantity();
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String fullName) {
        this.name = name;
    }

    public boolean addProduct(String name, float price) {
        this.name = name;
        this.price = price;
        return status = true;
    }

    public void editProduct(float price, String name, String manufacturer, float weight, boolean status) {
        this.price = price;
        this.name = name;
        this.manufacturer = manufacturer;
        this.weight = weight;
        this.status = status;
    }

    public void deleteUser(int id) {
        System.out.println("Товар удалён");
    }

    public boolean block() {
        return status = false;
    }

}