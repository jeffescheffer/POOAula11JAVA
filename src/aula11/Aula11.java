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
public class Aula11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Visitante v1 = new Visitante();
        Aluno a1 = new Aluno();
        Bolsista b1 = new Bolsista();
        
        a1.setNome("Roberto");
        a1.setIdade(30);
        a1.setSexo("M");
        a1.setCurso("Administração");
        a1.setMatricula(12208);
        
        v1.setNome("Renata");
        v1.setIdade(31);
        v1.setSexo("F");
        
        b1.setNome("Mariana");
        b1.setIdade(32);
        b1.setSexo("F");
        b1.setBolsa(75);
        b1.pagarMensalidade();
        
        System.out.println(a1.toString());
        System.out.println(v1.toString());
        System.out.println(b1.toString());
        
    }
    
}
