/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopcomputer;

/**
 *
 * @author Laurentiu
 */
public class Buton {
    private Character simbol;
    private Carcasa stapana; 
    
    public Buton(Character noulSimbol){
        simbol = noulSimbol;
    }
    public Buton(Character noulSimbol, Carcasa nouaCarcasa){
        simbol = noulSimbol;
        stapana = nouaCarcasa;
    }
    public void apasa(){
        Ecran ecranTemporar = stapana.getEcran();
        ecranTemporar.setAfisaj(simbol.toString());
      
        
    }
}
