public class Restaurant {
    private String nameRestaurant;
    private String menu;
    private String menuName;
    private double price;

    public Restaurant(){
    }

    public void setNameRestaurant(String nameRestaurant) {
        this.nameRestaurant = nameRestaurant;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getNameRestaurant() {
        return nameRestaurant;
    }

    public String getMenu() {
        return menu;
    }

    public String getMenuName() {
        return menuName;
    }

    public double getPrice() {
        return price;
    }
}
