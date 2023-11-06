public class DessertHQ {
    public static void main(String[] args) {
        DessertHQ myFactory = new DessertHQ();
    }

    public DessertHQ(){
        Dessert cookie;
        cookie = new Dessert("cookie", "circle", 5, 0.5);
        cookie.printInfo();

        Dessert brownie;
        brownie = new Dessert("brownie", "square", 3, 2);
        brownie.printInfo();
    }
}
