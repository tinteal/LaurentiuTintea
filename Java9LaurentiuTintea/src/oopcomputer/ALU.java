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
public class ALU {
    private Integer operandUnu;
    private Integer operandDoi;
    private Character operand;
    private Integer rezultat;

    public Character getOperand() {
        return operand;
    }

    public void setOperand(Character operand) {
        this.operand = operand;
    }

    public Integer getOperandUnu() {
        return operandUnu;
    }

    public void setOperandUnu(Integer operandUnu) {
        this.operandUnu = operandUnu;
    }

    public Integer getOperandDoi() {
        return operandDoi;
    }

    public void setOperandDoi(Integer operandDoi) {
        this.operandDoi = operandDoi;
    }

    public Integer getRezultat() {
        return rezultat;
    }

    public void setRezultat(Integer rezultat) {
        this.rezultat = rezultat;
    }

    
    public void calculeaza(){
        
        switch (operand){
        
            case '+': 
                rezultat = operandUnu + operandDoi;
                break;
            case '-': 
                rezultat = operandUnu - operandDoi;
                break;
            case '*': 
                rezultat = operandUnu * operandDoi;
                break;
            case '/': 
                rezultat = operandUnu / operandDoi;
                break;
            default: 
                System.out.println("Operatorul este incorect. Folositi +, -, * sau /");
        }
    }

    void setOperator(char c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
