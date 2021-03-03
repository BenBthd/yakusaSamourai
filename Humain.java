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
public class Humain {
    private int argent;
    private String boisson;
    private String nom;
    
    public Humain(int argent, String boisson, String nom) {
        this.argent = argent;
        this.boisson = boisson;
        this.nom = nom;
    }
    
    public int getArgent() {
        return this.argent;
    }

    public String getBoisson() {
        return this.boisson;
    }

    public String getNom() {
        return this.nom;
    }
    
    public void parler(String texte){
        System.out.println(this.nom + " " + texte);
    }
    
    public void direBonjour(){
        String message = this.boisson + " " + Integer.toString(this.argent) + "e";
        this.parler(message);
    }
    
    public void boire(){
        String message = "Ahhh, un bon verre de " + this.boisson + " ! GLOUPS !";
        this.parler(message);
    }
    
    public void gagnerArgent(int montant){
        if (montant > 0){
            this.argent +=montant;
        }
        else {
            System.out.println("probleme montant negatif ou nul");
        }
    }
    
    public void perdreArgent(int montant){
        if (montant > 0){
            this.argent -=montant;
        }
        else {
            System.out.println("probleme montant negatif ou nul");
        }
    }
    
}
