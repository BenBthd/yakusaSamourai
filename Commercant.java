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
public class Commercant extends Humain {
    
    public Commercant(int argent, String nom){
        super(argent, "Thé", nom);
    }
    
    public void faireDesAffaires(int montant, Humain h){
        this.gagnerArgent(montant);
        this.parler(" je te remercie " + h.getNom() + "pour cette affaire" );
    }
    
    public void seFaireExtorquer(){
        this.perdreArgent(this.getArgent());
        this.parler("le monde est injuste");
        
    }
}
