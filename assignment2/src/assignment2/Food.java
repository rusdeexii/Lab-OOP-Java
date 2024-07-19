package assignment2;

public class Food {
    private String name;
    private double fat;
    private double protein;
    private double carbohydrate;
    private int perServing;

  
    public Food(String n, double f, double p, double c, int s) {
        this.name = n;
        this.fat = f;
        this.protein = p;
        this.carbohydrate = c;
        this.perServing = s;
    }

   
    public String getName() {
        return name;
    }

  
    public int getPerServing() {
        return perServing;
    }

    
    public double getCalorie() {
        return (fat * 9 + protein * 4 + carbohydrate * 4) * perServing;
    }

   
    public double getJoule() {
        return getCalorie() * 4.184;
    }
}
