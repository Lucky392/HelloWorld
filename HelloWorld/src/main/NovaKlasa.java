/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author stefan
 */
public class NovaKlasa {

    private int broj;
    
    public NovaKlasa(int i) {
        broj = i;
    }
    
    public static void main(String[] args) {
        NovaKlasa n = new NovaKlasa(50);
        System.out.println(n.broj);
    }
}
