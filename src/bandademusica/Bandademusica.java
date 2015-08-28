/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandademusica;

/**
 *
 * @author Sebastian
 */
public class Bandademusica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        instrumentos [] a = new instrumentos[5];
        a[0] = new flauta();
        a[0].tocar('A');
        a[1] = new cuerda();
        a[1].tocar('B');
        a[2] = new Ipercusion();
        a[2].tocar('C');
        
    }
    
}
