/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method;

/**
 *
 * @author apit
 */
public class checkIPK {
    static void checkIPK(double ipk){
        if(ipk>3.5){
            System.out.println("Caumlaude");
        }
        
        else if(ipk>3.0){
            System.out.println("Sangat memuaskan");
        }
        else if(ipk>2.75){
            System.out.println("Cukup");
        }
        else{
            System.out.println("Jelek kuliah ngapain aja");
        }
    }
    public static void main(String[] args){
        checkIPK(2.80);
    }
}
