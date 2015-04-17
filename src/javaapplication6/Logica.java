/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.util.ArrayList;

/**
 *
 * @author ddizoya
 */
public class Logica {

    static int trigger = 6;
    static int aciertos;
    ArrayList impresion = new ArrayList();
    ArrayList<Integer> aleatorio = new ArrayList<>();
    ArrayList<Integer> respUsuario = new ArrayList<>();

    public void respUsuario(int num) {
        respUsuario.add(num);
        if (trigger>0)
            trigger--;
         }

    public void random() {

        for (int i = 0; i < 6; i++) {
            int y = (int) (Math.random() * 49 + 1);
            for (int x = 0; x < 6; i++) {
                if (aleatorio.indexOf(x) == y) {
                    i--;
                } else {
                    aleatorio.add(y);
                }
            }
        }
    }

    public void comparacion() {
        for (int i = 0; i < aleatorio.size(); i++) {
            int a = aleatorio.get(i);
            int b = respUsuario.get(i);
            if (a == b) {
                aciertos++;
            }
        }
    }

    public void impresion() {
        for (int i = 0; i < aleatorio.size(); i++) {
            int aux = aleatorio.get(i);
            impresion.add(aux + " ");
        }
    }
}
