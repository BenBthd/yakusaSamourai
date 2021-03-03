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
public class Ronin extends Humain {
    int honneur;

    public Ronin(int argent, String boisson, String nom) {
        super(argent, boisson, nom);
        this.honneur = 1;
    }

    public int getHonneur() {
        return honneur;
    }

    public void setHonneur(int honneur) {
        this.honneur = honneur;
    }
    
    
    
    public void donner(int montant, Commercant c){
        this.perdreArgent(montant);
        c.faireDesAffaires(montant, this);
    }
    
    public void provoquer(Mechant m){
        if (2*this.honneur > m.getReputation()) {
            this.gagnerArgent(((Humain)(m)).getArgent());
            m.perdreDuel();
            this.honneur ++;
            this.parler("g gagné petit batard de yaku");
        }
        else {
            this.honneur --;
            this.parler("g perdu bouhbouuuuhhh");
            m.gagnerDuel();  
        }
    }
    
}
