package restaurant;

public class Test {
    public static void main(String[] args) {
        //创建厨师对象
        FoodMenu chief1 = new Chief();
        
        //创建顾客对象
        Customer customer1 = new Customer(chief1);
        //顾客点菜

        customer1.order();

    }
}
