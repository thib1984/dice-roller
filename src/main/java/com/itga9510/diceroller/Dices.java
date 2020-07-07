package com.itga9510.diceroller;

import java.util.List;

import lombok.Data;

@Data
public class Dices {
    public int nbDes;
    public int nbFaces;
    public int somme;
    public float moyenne;
    private List<Dice> listeDes;

    public Dices(List<Dice> listeDes, int nbFaces) {
        this.listeDes = listeDes;
        this.nbFaces = nbFaces;
    }

    public int getNbDes() {
        return this.getListeDes().size();
    }

    public int getSomme() {
        return getListeDes().stream().mapToInt(o -> o.getResultat()).sum();
    }

    public float getMoyenne() {
        return Float.valueOf(getSomme()) / Float.valueOf(getNbDes());
    }

}