package by.epamtc.bakulin.task02.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PlainBasket implements Serializable {

    private List<PlainBall> basket = new ArrayList<>();
    private double basketWeight;

    public List<PlainBall> getBasketContent() {
        return this.basket;
    }

    public double getBasketWeight() {
        return this.basketWeight;
    }

    public boolean putBall(PlainBall ball) {
        boolean result = false;
        if (ball != null) {
            this.basket.add(ball);
            this.basketWeight += ball.getBallWeight();
            result = true;
        }
        return result;
    }


    public PlainBall getBall(int index) {
        return this.basket.get(index);
    }

    public PlainBall removeBall(int index) {
        return this.basket.remove(index);
    }

    public PlainBall removeBall(PlainBall ballToRemove) {
        this.basket.remove(ballToRemove);
        this.basketWeight -= ballToRemove.getBallWeight();
        return ballToRemove;
    }

    public List<PlainBall> findBallsByColor(String searchingColor) {
        List<PlainBall> ballsSortedByColor = new ArrayList<>();

        for(int i = 0; i < this.basket.size(); i++) {
            PlainBall currentBall = getBall(i);

            if(currentBall.getBallColor().equalsIgnoreCase(searchingColor)) {
                ballsSortedByColor.add(currentBall);
            }
        }
        return ballsSortedByColor;
    }

    public static double calculateBallsWeight(List<PlainBall> balls) {
        double totalWeight = 0;
        for (int i = 0; i < balls.size(); i++) {
            PlainBall currentBall = balls.get(i);
            totalWeight += currentBall.getBallWeight();
        }
        return totalWeight;
    }

}
