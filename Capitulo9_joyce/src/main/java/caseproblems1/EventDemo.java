/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseproblems1;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author ARCHV
 */
public class EventDemo {
    private final static Integer precioxInvitado = 30;
    private final static Integer grandEvent = 50;
    private String evento;
    private Integer nInvitados;
    private Integer Costo;
    private String nTelefono;
    private ArrayList<Integer> typeEvent;
    Scanner sc = new Scanner(System.in);


    public EventDemo(String evento, Integer nInvitados) {
        this.evento = evento;
        this.nInvitados = nInvitados;
        this.Costo = nInvitados * precioxInvitado ;
    }
                
    public void elegirEvento(){
        this.typeEvent =new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            System.out.println("Elige el nombre del evento ");
            String evento = sc.nextLine();
            
            System.out.println("Numero de invitados ");
            Integer nInvitados = sc.nextInt();
            
            System.out.println("Numero de telefono");
            String nTelefono = sc.nextLine();
            
            System.out.println("Introduce el tipo de evento:  [1]Bautizo [2]Boda [3]Fiesta de Cumpleaños [4]Coorporativo [5]Otro");
            typeEvent.add(i);
    }
    }
    public void invitar(){
        for (int i = 0; i < this.nInvitados; i++) {
            System.out.println("Please come to my event");
        }
    }
    
    public void regirstrar(){
           for (int i = 0; i < 1 ; i++) {
            System.out.println("Nombre del evento " + i+1 + ".");
            String nombre = sc.nextLine();

            System.out.println("numero de telefono");
            String telefono = sc.nextLine();

            System.out.println("Ingrese el tipo de evento Modo de evento: [0]boda [1]bautizo [2]cumpleanios [3]empresarial [4]otro");
            int evento = sc.nextInt();

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
    
    
    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public Integer getnInvitados() {
        return nInvitados;
    }

    public void setnInvitados(Integer nInvitados) {
        
     while (this.nInvitados > 100 || this.nInvitados <5){
          this.Costo = nInvitados * precioxInvitado;
      }
    }

    public Integer getCosto() {
        return Costo  ;
    }

    public void setCosto(Integer Costo) {
        this.Costo = Costo;
    }
    
    
}
