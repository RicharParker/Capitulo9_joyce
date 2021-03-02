/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseproblems2;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author ARCHV
 */
public class Rental {
    private String contract;
    private Integer minutes;
    private Integer hours;
    private Integer extraMinutes;
    private Integer price;
    private Integer coupon;
    private String nTelefono;
    private ArrayList<Integer> typeRent;
    Scanner sc = new Scanner(System.in);

    public Rental(String contract, Integer minutes) {
        this.contract = contract;
        this.minutes = minutes;
        this.hours= minutes/60;
        this.extraMinutes=minutes %60;
        this.price= (this.hours * 40) + (this.extraMinutes / 40) + (this.extraMinutes % 40);
    }
    
    public void coupon(){
        for (int i = 0; i < getHours(); i++) {
            System.out.println("Coupon good for percent off next rental");
        }
    }
    
    public void rentar(){
        this.typeRent =new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Numero de contrato ");
            Integer contract = sc.nextInt();
            
            System.out.println("Numero de minutos ");
            Integer minuter = sc.nextInt();
            
            System.out.println("Numero de telefono");
            String nTelefono = sc.nextLine();
            System.out.println("Introduce el numero de equipo : [1]Moto acuatica [2]Ponton [3]Bote de remos[4]Canoa [5]Kayac [6]Silla de playa [7]Paraguas [8]Otro");
            typeRent.add(i);
        }
    }
    
    public static void masTiempo(Rental a, Rental b){
        if (a.getHours().equals(b.getHours())) {
        }if (a.getMinutes().equals(b.getMinutes())) {
           System.out.println("El tiempo es igual");
        }else if (a.getMinutes()>b.getMinutes()) {
            System.out.println("la mayor cantida de minutos prestados es : : "+ a.getMinutes());
        }else{
            System.out.println("la mayor cantida de minutos prestados es : "+ b.getMinutes());
        }
    }

    public String getnTelefono() {
        return nTelefono;
    }

    public void setnTelefono(String numero) {
        numero = numero.replace('(', '\0');
        numero = numero.replace(')', '\0');
        numero = numero.replace('-', '\0');
        numero = numero.replace(' ', '\0');
        numero = numero.replaceAll("\0", "");
        if (numero.length()!=10) {
            numero = "0000000000";
        }
        this.nTelefono = numero;
    }
    
    
    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }

    public Integer getMinutes() {
        return minutes;
    }

    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
        this.hours= minutes/60;
        this.extraMinutes=minutes %60;
        this.price= (this.hours * 40) + (this.extraMinutes / 40) + (this.extraMinutes % 40);
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Integer getExtraMinutes() {
        return extraMinutes;
    }

    public void setExtraMinutes(Integer extraMinutes) {
        this.extraMinutes = extraMinutes;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
