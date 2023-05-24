/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package keretaapi;

/**
 *
 * @author Dewa
 */
public class KeretaApi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        WelcomingPage Wp = new WelcomingPage();
        Wp.setVisible(true);
        Wp.pack();
        Wp.setLocationRelativeTo(null);
        Wp.setDefaultCloseOperation(WelcomingPage.DISPOSE_ON_CLOSE);
    }
    
}
