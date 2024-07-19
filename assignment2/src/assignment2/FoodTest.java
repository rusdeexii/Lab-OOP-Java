package assignment2;

public class FoodTest {

    public static void main(String[] args) {
        Food cracker = new Food("Cracker",  1.5, 2.0, 10.0, 4);

        System.out.println("Name: " + cracker.getName());
        System.out.println("PerServing: " + cracker.getPerServing() + " "+"pieces");
        System.out.println("Calorie: " + cracker.getCalorie() + " kgCal");
        System.out.println("Kilo Joule: " + cracker.getJoule() + " Kilo Joule");

        int piecesFor1200Calories = (int) (1200 / cracker.getCalorie() * cracker.getPerServing());
        System.out.println("# of Piece: " + piecesFor1200Calories + " Pieces of 1200.0 kgCal");
    }

}
