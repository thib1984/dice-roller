package com.itga9510.diceroller;

import java.util.ArrayList;

public class DiceRollerService {

    static public Dices diceRoller(int nb, int face) {
        Dices dices = new Dices(new ArrayList<Dice>(), face);
        for (int i = 0; i < nb; i++) {
            Dice oneDiceRoller = oneDiceRoller(dices.getNbFaces());
            dices.getListeDes().add(oneDiceRoller);

        }
        return dices;
    }

    static public Dice oneDiceRoller(int face) {
        return new Dice(face);
    }

}