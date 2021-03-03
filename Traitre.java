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
public class Traitre extends Samourai implements Mechant {
    
    public Traitre(int argent, String boisson, String nom, String seigneur) {
        super(argent, boisson, nom, seigneur);
    }

    @Override
    public void extorquer(Commercant c) {
        this.gagnerArgent(c.getArgent());
        c.seFaireExtorquer();
        this.parler("je t nické " + c.getNom());
        this.setHonneur(this.getReputation()-1);
    }

    @Override
    public void gagnerDuel() {
        this.setHonneur(this.getReputation()+1);
        this.parler(" g gagné ");
    }

    @Override
    public int getReputation() {
        return this.getHonneur();
    }

    @Override
    public void perdreDuel() {
        this.perdreArgent(this.getArgent());
        if (this.getReputation() > 0) {
            this.setHonneur(this.getReputation()-1);
            this.parler("g perdu");
        }
    }
    
    
}
