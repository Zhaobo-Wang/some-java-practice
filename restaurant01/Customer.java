package restaurant;
//顾客手里有菜单，
//customer has a menu
// ”has a “ 统一以属性(attribute)的方式存在
//cat is a Animal
// "is a "是继承的关系
public class Customer {
    private FoodMenu foodMenu;//接口的使用离不开多态

    //如果这样写，顾客只能吃西餐或中餐，写死了，没有可以插拔了
    //WesternChief wc
    //Chief c

    public Customer() {
    }

    public Customer(FoodMenu foodMenu) {
        this.foodMenu = foodMenu;
    }

    public FoodMenu getFoodMenu() {
        return foodMenu;
    }

    public void setFoodMenu(FoodMenu foodMenu) {
        this.foodMenu = foodMenu;
    }

    //提供一个点菜的method
    public void order(){
        FoodMenu fm = this.getFoodMenu();//拿到菜单 才能点菜
        fm.hamburger();//调接口里面的method
        fm.shrimp();

    }
}
