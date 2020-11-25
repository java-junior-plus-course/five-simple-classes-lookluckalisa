public class Main {
    public static void main(String[] args) {

        User user1 = new User();
        user1.user(1, "Иванов Иван Иванович", "+375 29 897 52 65", "info@mail.ru", "г.Минск", true);

        Order order1 = new Order();
        order1.order(1, 23, 230, "02/10/2020", true);

        Product product1 = new Product();
        product1.product();

        Stock stock1 = new Stock();
        stock1.stock(1, 1000, true);
    }
}