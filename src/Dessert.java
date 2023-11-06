public class Dessert {

    public String dessertName;

    public String shape;

    public int numBites;

    public double size;

    public void printInfo(){
        System.out.println("The dessert is a " + dessertName);
        System.out.println("The shape of the dessert is a " + shape);
        System.out.println("The number of bites needed to eat the dessert is " + numBites);
        System.out.println("The size of the dessert is " + size + " inches");
    }

    public Dessert (String paramDessertName, String paramShape, int paramNumBites, double paramSize){
        dessertName = paramDessertName;
        shape = paramShape;
        numBites = paramNumBites;
        size = paramSize;
    }
}
