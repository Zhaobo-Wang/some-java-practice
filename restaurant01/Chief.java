package restaurant;
// 厨师是窗口的实现者
public class Chief implements FoodMenu{
    @Override
    public void hamburger() {
        System.out.println("中国师傅做汉堡");

    }

    @Override
    public void pizza() {
        System.out.println("中国师傅做pizza");

    }

    @Override
    public void shrimp() {
        System.out.println("中国师傅做虾");

    }
}
