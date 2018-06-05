package template;

public class BeverageTest {
    public static void main(String[] args){
        CoffeeWithHook coffeeHook = new CoffeeWithHook();
        System.out.println("Making coffee...");
        coffeeHook.prepareRecipe();
    }
}
