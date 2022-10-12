package Drink;

public class Alcoholic extends Drinks{
    private double content;
    public Alcoholic(String name,String unit,int price, double content){
        super(name,unit,price);
        this.content = content;
    }

    public double getContent() {
        return content;
    }

    public void setContent(double content) {
        this.content = content;
    }
    @Override
    public String toString(){
        return String.format("%.1f%% V/V ",this.content) + super.toString();
    }
}
