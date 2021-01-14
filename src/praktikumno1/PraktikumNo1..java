/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikumno1;

/**
 *
 * @author ASUS TUF A15
 */
public class PraktikumNo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 1; i <=4; i++) {
            for (int j =1; j <=4; j++) {
                if  (i==1 || i==4 || j==1 || j==4){
                System.out.print("@");    
                }else{
                
                    System.out.print(" ");
                
            }
            
        }System.out.println(" ");
    }
    }
}
    

