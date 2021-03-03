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
public class Yakuza extends Humain implements Mechant {
    String clan;
    int reputation;
    public Yakuza(int argent, String boisson, String nom, String clan ) {
        super(argent,boisson,nom);
        this.clan = clan;
        this.reputation = 0;
       
    }

    public String getClan() {
        return clan;
    }

    public int getReputation() {
        return reputation;
    }
    
    public void setReputation(int n) {
        this.reputation = n;
    }
    
    public void extorquer(Commercant c){
        this.gagnerArgent(c.getArgent());
        c.seFaireExtorquer();
        this.parler("je t nické " + c.getNom());
    }
    
    @Override
    public void direBonjour(){
        String message = this.getBoisson() + " " + Integer.toString(this.getArgent()) + "e" + " " + "clan" + this.getClan();
        this.parler(message);
    }
    
    public void gagnerDuel(){
        this.setReputation(this.getReputation()+1);
        this.parler(" g gagné ");
    }
    
    public void perdreDuel(){
        this.perdreArgent(this.getArgent());
        if (this.getReputation() > 0) {
            this.setReputation(this.getReputation()-1);
            this.parler("g perdu");
        }
    }
}
