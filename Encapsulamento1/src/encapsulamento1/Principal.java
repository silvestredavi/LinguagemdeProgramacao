/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package encapsulamento1;

/**
 *
 * @author Fatec
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cli = new Cliente ("Davi", "17/08/2003", 'M', "658451365","15553851");
        System.out.println(cli.getNome());
        System.out.println(cli.getSexo());
        System.out.println(cli.getCpf());
        System.out.println(cli.getDataNascimento());
        System.out.println(cli.getRg());
    }
    
}
