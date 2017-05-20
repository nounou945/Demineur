package com.example.chett.demineur.controleur;

import android.content.Context;

/**
 * Created by chett on 05/02/2017.
 */

public class Controle {
 // proriétés de la classe Controle
    private static  Controle instance ;
    private Context context;

    /**
     *  permet d'avoir une seul instance de Controle
     * @return
     */
    public static Controle getInstance(){
        if (instance==null){
            instance=new Controle();
    }
        return instance;
    }

    /**
     * Constructeur
     */
    private Controle(){};

    /**
     * creer la grille du jeu
     * @param context
     */
    private void creerGrille(Context context){

        this.context=context;
    }


}

