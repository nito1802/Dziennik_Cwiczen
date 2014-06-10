/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projekt_kon;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Konrad
 */
public class DziennikSingletonModel 
{
    private ArrayList <Cwiczenia> arCwiczenia;
    
    private static DziennikSingletonModel instance = null;
   
    private DziennikSingletonModel() 
    {
        arCwiczenia = new ArrayList<>();
    }
    
    public static DziennikSingletonModel getInstance() 
    {
       if(instance == null) 
       {
          instance = new DziennikSingletonModel();
       }
       return instance;
    }
   
    public void ZapiszListe()
    {
        try
        {
            FileOutputStream fos = new FileOutputStream("Data.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(arCwiczenia);
        }
        catch(IOException e)
        {
            JOptionPane.showMessageDialog(null,"Błąd podczas zapisu.","Bląd",JOptionPane.WARNING_MESSAGE);
        }
        
    }
    
    public void WczytajListe()
    {
        try
        {
            FileInputStream fis = new FileInputStream("Data.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            arCwiczenia = (ArrayList<Cwiczenia>) ois.readObject();
            ois.close();
        }
        catch(IOException | ClassNotFoundException e)
        {
            
        }
    }
    
    public ArrayList<Cwiczenia> GetListaCwiczen(String A_Nazwa)
    {
        ArrayList<Cwiczenia> arList = new ArrayList<>();
        
        if("Pływanie".equals(A_Nazwa))
            A_Nazwa = "Plywanie";
        
        for(Cwiczenia item : arCwiczenia)
        {
            if(item.GetNazwa().equals(A_Nazwa))
                arList.add(item);
        }
        
        return arList;
    }
    
    public String[] GetCwiczeniaInfo(String nazwa)
    {
        String[] tabInfo = new String[3];
        tabInfo[0] = "Data";
        
        switch(nazwa)
        {
            case "Bieg":
                tabInfo[1] = "km";
                tabInfo[2] = "min";
                break;
            case "Pływanie":
                tabInfo[1] = "m";
                tabInfo[2] = "min";
                break;
            case "Skakanka":
                tabInfo[1] = "skoki";
                tabInfo[2] = "min";
                break;
            case "Rower":
                tabInfo[1] = "km";
                tabInfo[2] = "min";
                break;
            case "Pompki":
                tabInfo[1] = "powtórzenia";
                tabInfo[2] = "serie";
                break;
            case "Przysiady":
                tabInfo[1] = "powtórzenia";
                tabInfo[2] = "serie";
                break;
        }
        
        return tabInfo;
    }
    
    public void Dodaj(Cwiczenia c)
    {
        arCwiczenia.add(c);
    }
    
    public Date GetDataNajwczesniejsza()
    {
        if(arCwiczenia.isEmpty())
            return Calendar.getInstance().getTime();
        else
            return arCwiczenia.get(0).GetDataTreningu();
    }
    
    public Date GetDataNajpozniejsza()
    {
        if(arCwiczenia.isEmpty())
            return Calendar.getInstance().getTime();
        else
            return arCwiczenia.get(arCwiczenia.size()-1).GetDataTreningu();
    }
}
