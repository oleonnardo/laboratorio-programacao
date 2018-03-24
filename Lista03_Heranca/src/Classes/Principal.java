package Classes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leonardo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa("Leo", "Endereço", "83991023481");
        
        Fornecedor f1 = new Fornecedor(p1, 300, 283);
        
        System.out.println(f1.getPessoa().getNome());
        
    }
    
}
