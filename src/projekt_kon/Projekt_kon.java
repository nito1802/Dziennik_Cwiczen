/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projekt_kon;

/**
 *
 * @author Konrad
 */

public class Projekt_kon  
{
    public static void main(String[]args) 
    {
        DziennikView View = new DziennikView();
        DziennikSingletonModel Model = DziennikSingletonModel.getInstance();
        
        DziennikController Controller = new DziennikController(Model, View);
    }
}

