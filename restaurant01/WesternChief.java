package restaurant;
//厨师是窗口的实现者
public class WesternChief implements FoodMenu{
    @Override
    public void hamburger() {
        System.out.println("chief cook homemade hamburger.");
    }

    @Override
    public void pizza() {
        System.out.println("chief cook Italian Pizza.");

    }

    @Override
    public void shrimp() {
        System.out.println("chief cook Thailand shrimp.");

    }
}
