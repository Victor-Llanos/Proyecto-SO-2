/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoso2;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author yunch
 */
public class DeckBuilder {

    String[] cards = {
        "Mega Caballero",
        "Mago Eléctrico",
        "PEKKA",
        "Mini PEKKA",
        "Mago de hielo",
        "Bruja",
        "Bruja Oscura",
        "Leñador",
        "Monta Puercos",
        "Ram",
        "Minions",
        "Goblins",
        "Golem",
        "Bandida",
        "Choza",
        "Misil",
        "Veneno",
        "Ballesta",
        "Tronco",
        "Furia",
        "Cementerio",
        "Flechas",
        "Fireball",
        "Tornado",
        "Congelar",
        "Minero"
    };

    public static boolean contains(final int[] array, final int key) {
        for (final int i : array) {
            if (i == key) {
                return true;
            }
        }
        return false;
    }

    public static int deckWR() {
        int wr = 0;
        int i = 0;
        int [] broken = {2,13,12,14,17,25};
        int [] avg = {1,3,4,8,15,16,22,18,20,5,6,7,21,23};
        int [] no = {11,24,9,19,10};
        

        while (i < 10) {
            int rand = ThreadLocalRandom.current().nextInt(0, 26);

            if (rand == 0) {
                wr += 10;
            }
            else if(contains(broken,rand)){
                wr += 8;
            } else if(contains(avg,rand)){
                wr += 4;
            } else if(contains(no,rand)){
                wr += 2;
            }
            

            i++;
        }
        if (wr > 100){
            wr=100;
        }
        return wr;
    }
}
