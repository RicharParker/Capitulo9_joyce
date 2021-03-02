/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamezone3;

/**
 *
 * @author ARCHV
 */
public class Card {
    private Suit suit;
    private Integer numero;
    

    public Card(Integer a, Suit suit) {
        this.suit = suit;
        this.numero = numero;
    }
    
    public void pickCard(){
        switch (this.numero){
            case 1: System.out.println("1 de Ace");break;
            case 2:System.out.println("2 a 10");break;
            case 11: System.out.println("Q "+getSuit());break;
            case 12:System.out.println("K "+getSuit());break;
            case 13:System.out.println("J"+getSuit());break;
        } 
    }
    
    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }


    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        final int CARDS_IN_SUIT = 13;
        this.numero = ((int)(Math.random() * 100) % CARDS_IN_SUIT + 1);
    }
     
}
