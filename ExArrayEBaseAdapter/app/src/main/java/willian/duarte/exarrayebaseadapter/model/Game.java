package willian.duarte.exarrayebaseadapter.model;

public class Game {
    private String game;
    private double price;

    public Game() {
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double calcSummerSale(){
        return this.price * 0.90;
    }

    @Override
    public String toString() {
        return "\nGame: " + this.game +
                "\nPrice: " + this.price +
                "\nSummer sale price: " + this.calcSummerSale();
    }
}
