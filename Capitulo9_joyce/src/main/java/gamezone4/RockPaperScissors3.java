/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamezone4;

import java.util.Scanner;

/**
 *
 * @author ARCHV
 */
public class RockPaperScissors3 {
    Scanner sc = new Scanner(System.in);
    private Integer optionUser;
    private Integer optionPc;
    private Integer numero;
    private Mano mano;

    public void recorrer(){
        for (int i = 0; i < 10; i++) {
            play();
        }
    }
    
    
    public void play(){
        System.out.println("[1]Piedra [2]Papel [3]Tijeras ");
        setOptionPc();
        optionUser = sc.nextInt();
        System.out.println(getOptionPc());
        if (optionUser == optionPc) {
            System.out.println("Empate");
        }else if ((optionUser ==1&& optionPc==3)||(optionUser ==2&& optionPc==1)||(optionUser ==3&& optionPc==2)) {
            System.out.println("Ganaste"); 
        }else if ((optionUser ==1&& optionPc==2)||(optionUser ==2&& optionPc==3)||(optionUser ==3&& optionPc==1)) {
            System.out.println("Perdiste");
        }
    }
    
    public void tirar(){
     this.numero = (int) (Math.random() * 3 + 1);
     switch (this.numero)  {
         case 1: this.mano= mano.PIEDRA;break;
         case 2: this.mano= mano.PAPEL;break;
         case 3: this.mano= mano.TIJERAS;break;
     } 
    }
    
    public Integer getOptionUser() {
        return optionUser;
    }

    public void setOptionUser(Integer optionUser) {
        this.optionUser = optionUser;
    }

    public Integer getOptionPc() {
        return optionPc;
    }

    public void setOptionPc() {
        this.optionPc = (int) (Math.random() * 3 + 1);
    }
      
}
