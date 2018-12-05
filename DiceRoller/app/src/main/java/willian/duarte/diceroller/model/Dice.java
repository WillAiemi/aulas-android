package willian.duarte.diceroller.model;

import java.util.Random;

public class Dice {
    private final Random r = new Random();

    public int rollDice(int faces){
        return r.nextInt(faces)+1;
    }
}
