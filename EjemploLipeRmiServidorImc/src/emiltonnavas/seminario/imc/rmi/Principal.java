/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package emiltonnavas.seminario.imc.rmi;

import emiltonnavas.seminario.imc.rmi.net.Servidor;

/**
 *
 * @author Emilton Navas
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Servidor servicio = new Servidor();
        try {
            servicio.iniciar();
        } catch (Exception ex) {
            System.out.println(ex.getLocalizedMessage());
        }
    }
    
}
