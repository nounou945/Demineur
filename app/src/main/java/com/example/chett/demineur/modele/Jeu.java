package com.example.chett.demineur.modele;

import java.util.Random;

/**
 * Created by chett on 05/02/2017.
 */

public class Jeu {

    public static int[][]jeu(int bomb ,final int width ,final int height){
     Random lst =new Random();
     int [][] grille=new int [width][ height];
        for (int x=0 ;x<width;x++){
            grille[x]=new int [height];
        }
        while (bomb>1){
            int x=lst.nextInt(width);
            int y=lst.nextInt(height);

            if(grille[x][y]!=-1){
                grille[x][y]=-1;
                bomb--;
            }
        }
    }



    private static int [][] calculVoisinage(int[][] grille,final int width,final int height){

        for(int x=0; x<width;x++){
            for (int y =0;y<height;y++){
                grille  [x][y]= getNombreVoisins(grille,x,y,width,height);
        }
    }

    }

    private static int getNombreVoisins(final int grille [][],final int x,final int y,final int width,final int height ){
        if (grille [x][y]==-1){
            return -1; //pas besoin de calculer les voisins
        }

        int cpt=0;
        if(grille [x-1][y]==-1){
            cpt++;
        }
    }


    private static boolean estUneMine(final int[][] grille,final int x,final int y,final int width,final int height){
        if (x>=0 && y>=0 && x<width && y<height){
            if(grille[x][y]==-1){
                return true;
            }

        }

        return false;
    }


}
