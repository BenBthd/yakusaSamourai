/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

/**
 *
 * @author benjaminberthaud
 */
public class Samourai extends Ronin {

    String seigneur;
    
    public Samourai(int argent, String boisson, String nom, String seigneur) {
        super(argent, boisson, nom);
        this.seigneur = seigneur;
    }

    public String getSeigneur() {
        return seigneur;
    }
    
    

    @Override
    public void direBonjour(){
        super.direBonjour();
        System.out.println(" je suis la pute de : " + this.getSeigneur());
        
    }
    
    public void boire(String boisson){
        String message = "Ahhh, un bon verre de " + boisson + " ! GLOUPS !";
        this.parler(message);
    }
}
