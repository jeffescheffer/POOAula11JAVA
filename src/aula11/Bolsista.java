/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula11;

/**
 *
 * @author Jefferson
 */
public class Bolsista extends Pessoa{
    private float bolsa;
    
    public void renovarBolsa(){
        System.out.println("Renovando bolsa de " + this.getNome());
    }
    
    public void pagarMensalidade(){
        System.out.println(this.getNome() + " é bolsista! Pagamento diferenciado");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }

    @Override
    public String toString() {
        return "Bolsista{" + "nome = " + nome + ", idade = " + idade + ", sexo = " + sexo + ", bolsa = " + bolsa + '}';
    }
    
    
    
}
