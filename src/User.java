public class User {
    private int id;
    private String fullName, phone, email, address;
    private boolean status;

    public void user(int id, String fullName, String phone, String email, String address, boolean status) {
        this.id = id;
        this.fullName = fullName;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean addUser(String fullName, String phone) {
        this.fullName = fullName;
        this.phone = phone;
        return status = true;
    }

    public boolean addUser(String fullName, String phone, String email) {
        this.fullName = fullName;
        this.phone = phone;
        this.email = email;
        return status = true;
    }

    public void editUser(String fullName, String phone, String email, String address) {
        this.fullName = fullName;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public void deleteUser(int id) {
        System.out.println("Пользователь удалён");
    }

    public boolean block(){
        return status = false;
    }

}