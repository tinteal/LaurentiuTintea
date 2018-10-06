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
public class Ecran {

    private String afisaj = "0";
    private Carcasa stapana;
    
    public Ecran(Carcasa nouaStapana) {
        this.stapana = nouaStapana;
    }

    public String getAfisaj() {
        return afisaj;
    }

    public void setAfisaj(String afisaj) {
        switch (afisaj) {
            case "+":
                operatiuneLocala('+');
                break;
            case "-":
                operatiuneLocala('-');
                break;
            case "*":
                operatiuneLocala('*');
                break;
            case "/":
                operatiuneLocala('/');
                break;
            case "=":
                operatiuneLocala('=');
                break;
            default:
        }
        this.afisaj = afisaj;
    }
    /**
     * Private method for computation
     */
    private void operatiuneLocala(char c) {
            stapana.getAlu().getOperandUnu(Integer.getInteger(afisaj);
            stapana.getAlu().setOperator('+');
            afisaj = Character.toString(c);
            }
}
