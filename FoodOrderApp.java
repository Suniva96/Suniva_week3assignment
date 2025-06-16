class FoodItem {
    String name;
   double price;

    public FoodItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    
    public String displayMenuItem() {
        return "Item: " + name + "\nPrice: " + price;
    }
}

class Pizza extends FoodItem {
    String size;
    String[] toppings;

    public Pizza(String name, double price, String size, String[] toppings) {
        super(name, price);
        this.size = size;
        this.toppings = toppings;
    }

    public String getSize() {
        return size;
    }

    public String[] getToppings() {
        return toppings;
    }

    @Override
    public String displayMenuItem() {
        StringBuilder toppingList = new StringBuilder();
        for (String topping : toppings) {
            toppingList.append(topping).append(", ");
        }
        if (toppingList.length() > 0) {
            toppingList.setLength(toppingList.length() - 2);
        }
        return super.displayMenuItem() + 
               "\nSize: " + size + 
               "\nToppings: " + toppingList.toString();
    }
}
class Burger extends FoodItem {
     boolean cheese;
     String pattyType;

    public Burger(String name, double price, boolean cheese, String pattyType) {
        super(name, price);
        this.cheese = cheese;
        this.pattyType = pattyType;
    }

    public boolean hasCheese() {
        return cheese;
    }

    public String getPattyType() {
        return pattyType;
    }

    @Override
    public String displayMenuItem() {
        return super.displayMenuItem() + 
               "\nPatty Type: " + pattyType + 
               "\nCheese: " + (cheese ? "Yes" : "No");
    }
}
class Salad extends FoodItem {
     String[] ingredients;

    public Salad(String name, double price, String[] ingredients) {
        super(name, price);
        this.ingredients = ingredients;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    @Override
    public String displayMenuItem() {
        StringBuilder ingredientList = new StringBuilder();
        for (String ingredient : ingredients) {
            ingredientList.append(ingredient).append(", ");
        }
        if (ingredientList.length() > 0) {
            ingredientList.setLength(ingredientList.length() - 2);
        }
        return super.displayMenuItem() + 
               "\nIngredients: " + ingredientList.toString();
    }
}

public class FoodOrderApp {
    public static void main(String[] args) {

        Pizza pizza = new Pizza("Meat Pizza", 550, "Large", new String[]{"Meat", "Cheese", "Olives"});
        Burger burger = new Burger("Veg Burger", 350, true, "Potato");
        Salad salad = new Salad("Mix Salad", 450, new String[]{"Lettuce", "Tomato", "Feta Cheese", "Olives"});

        FoodItem[] menuItems = {pizza, burger, salad};

        for (FoodItem item : menuItems) {
            System.out.println(" Menu Item");
            System.out.println(item.displayMenuItem());
            System.out.println();
        }
    }
}
