package com.itga9510.diceroller;

import lombok.Data;

@Data
public class Dice {

    int resultat;

    public Dice(int nb_face) {
        this.resultat = 1 + (int) (Math.random() * ((nb_face - 1) + 1));
    }

}
