package by.epamtc.bakulin.task02.runner;

import by.epamtc.bakulin.view.AbstractConsoleInput;
import by.epamtc.bakulin.task02.entity.PlainBall;
import by.epamtc.bakulin.task02.entity.PlainBasket;
import by.epamtc.bakulin.task02.enums.Color;

import java.util.List;

public class Task02Runner extends AbstractConsoleInput {
    public static void main(String[] args) {
        printConsoleMessage("Task02: Started...");
        printConsoleMessage("[TASK]: Создать класс Мяч. Создать класс Корзина. Наполнить корзину мячами. Определить вес мячей в корзине и кол-во синих мячей");
        List<PlainBall> balls = List.of(
                new PlainBall(Color.RED.getColorName(), 0.25),
                new PlainBall(Color.BLUE.getColorName(), 0.25),
                new PlainBall(Color.YELLOW.getColorName(), 0.25),
                new PlainBall(Color.GREEN.getColorName(), 0.25),
                new PlainBall(Color.BLUE.getColorName(), 0.25),
                new PlainBall(Color.YELLOW.getColorName(), 0.25));

        PlainBasket basket = new PlainBasket();
        basket.putBallsCollection(balls);
        basket.putBall(new PlainBall(Color.GREEN.getColorName(), 0.25));

        //[Comment]: Get All Balls In A Basket
        List<PlainBall> basketContent =  basket.getBasketContent();
        printConsoleMessage("[Get basket content]: Started");
        for(int i = 0; i < basketContent.size(); i++) {
            printConsoleMessage(String.format("\t %s", basketContent.get(i)));
        }
        printConsoleMessage("[Get basket content]: Finished\n");

        //[Comment]: Get Basket Weight
        double basketWeight = basket.calculateBasketWeight();
        printConsoleMessage("[Get basket weight]: Started");
        printConsoleMessage(String.format("\t basketWeight = %.3f", basketWeight));
        printConsoleMessage("[Get basket weight]: Finished\n");

        //[Comment]: Find All Blue Balls In A Basket
        List<PlainBall> blue = basket.findAllBallsByColor("blue");
        printConsoleMessage("[Get all blue balls]: Started");
        for(int i = 0; i < blue.size(); i++) {
            printConsoleMessage(String.format("\t %s", blue.get(i)));
        }
        printConsoleMessage("[Get all blue balls]: Finished\n");

        //[Comment]: Calculate All Blue Balls Weight
        double sortedWeight = PlainBasket.calculateBallsWeight(blue);
        printConsoleMessage("[Get sorted(Blue) basket weight]: Started");
        printConsoleMessage(String.format("\t basketWeight = %.3f", sortedWeight));
        printConsoleMessage("[Get sorted(Blue) basket weight]: Finished\n");

        printConsoleMessage("Task02: Finished...");
    }

}
