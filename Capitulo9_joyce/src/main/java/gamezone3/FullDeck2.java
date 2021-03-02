/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamezone3;

import java.util.ArrayList;

/**
 *
 * @author ARCHV
 */
public class FullDeck2 {
    private ArrayList<Card> cards;
    private  ArrayList<Integer> nRepetidos; 

    public FullDeck2() {
        this.cards = new ArrayList<>();
        for (int i = 0; i < 52; i++) {         
            Card b = new Card(i,Suit.DIAMANTES);
        for (int j = 0; j <= 13; j++) {
            Card a = new Card(j,Suit.CORAZONES);
        }
        for (int j = 0; j < 13; j++) {
                Card a = new Card(i,Suit.ESPADAS);
            }
        for (int j = 0; j < 13; j++) {
                Card a = new Card(i,Suit.PICAS);
            }
    }

    }
  

  public void obetenerFullDeck(){
      for (int i = 0; i < cards.size(); i++) {
          System.out.println(cards.get(i).getNumero());
       for (int j = 0; j < 52; j++) {
          if (cards.get(i) == cards.get(j)) {
              i--;
          }          
      }
     
      }
  
  }
  
    
}
