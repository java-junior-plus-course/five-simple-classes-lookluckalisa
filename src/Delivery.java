public class Delivery {
    private int id;
    private String company;
    private boolean status;

    public void delivery(int id, String companyName, boolean status) {
        this.id = id;
        this.company = company;
        this.status = status;
        new Order().getId();
        new User().getFullName();
        new User().getAddress();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {

        this.company = company;
    }

    public boolean addCompany(String company, boolean status) {
        this.company = company;
        return status = true;
    }

    public boolean addDelivery(String company, boolean status) {
        this.company = company;
        new Order().setId();
        new User().setFullName();
        new User().setAddress();
        return true;
    }

    public void editDelivery(String company, boolean status) {
        this.company = company;
        this.status = status;
        new Order().setId();
        new User().setFullName();
        new User().setAddress();
    }
}