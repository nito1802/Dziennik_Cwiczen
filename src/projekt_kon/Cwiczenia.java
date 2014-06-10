/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projekt_kon;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Konrad
 */
public abstract class Cwiczenia implements Serializable
{
    private String nazwa;
    private Date dataTreningu;
    
    public String GetNazwa()
    {
        return nazwa;
    }
    
    public Date GetDataTreningu()
    {
        return dataTreningu;
    }
    
    abstract public String[] GetInfo();
    
    public Cwiczenia(String A_nazwa)
    {
        this.nazwa = A_nazwa;
        this.dataTreningu = Calendar.getInstance().getTime();
    }
}

class Bieg extends Cwiczenia
{
    private int iloscKm;
    private int czasMinuty;
    
    public int GetIloscKm()
    {
        return iloscKm;
    }
    
    public int GetCzasMinuty()
    {
        return czasMinuty;
    }
    
    public static String GetInfo1()
    {
        return "Ilość przebiegniętych km:";
    }
    
    public static String GetInfo2()
    {
        return "Czas w minutach:";
    }
    
    public Bieg(int A_iloscKm, int A_czasMinuty)
    {
        super("Bieg"); //wywolanie konstruktora klasy Cwiczenia
        
        this.iloscKm = A_iloscKm;
        this.czasMinuty = A_czasMinuty;
    }

    @Override
    public String[] GetInfo() 
    {
        String[] tabInfo = new String[3];
        tabInfo[0] = new SimpleDateFormat("dd-MM-yyyy  HH:mm").format(GetDataTreningu());
        tabInfo[1] = String.valueOf(GetIloscKm());
        tabInfo[2] = String.valueOf(GetCzasMinuty());
        
        return tabInfo;
    }
}

class Plywanie extends Cwiczenia
{
    int iloscM;
    int czasMinuty;

    public int GetIloscM()
    {
        return iloscM;
    }
    
    public int GetCzasMinuty()
    {
        return czasMinuty;
    }
    
    public static String GetInfo1()
    {
        return "Ilość przepłyniętych km:";
    }
    
    public static String GetInfo2()
    {
        return "Czas w minutach:";
    }
    
    public Plywanie(int A_iloscM, int A_czasMinuty)
    {
        super("Plywanie");
        
        this.iloscM = A_iloscM;
        this.czasMinuty = A_czasMinuty;
    }

    @Override
    public String[] GetInfo() 
    {
        String[] tabInfo = new String[3];
        tabInfo[0] = new SimpleDateFormat("dd-MM-yyyy  HH:mm").format(GetDataTreningu());
        tabInfo[1] = String.valueOf(GetIloscM());
        tabInfo[2] = String.valueOf(GetCzasMinuty());
        
        return tabInfo;
    }
}

class Skakanka extends Cwiczenia
{
    private int IloscSkokow;
    private int czasMinuty;
    
    public int GetIloscSkokow()
    {
        return IloscSkokow;
    }
    
    public int GetCzasMinuty()
    {
        return czasMinuty;
    }
    
    public static String GetInfo1()
    {
        return "Ilość skoków:";
    }
    
    public static String GetInfo2()
    {
        return "Ilość serii:";
    }
    
    public Skakanka(int A_IloscSkokow, int A_czasMinuty)
    {
        super("Skakanka");
        
        this.IloscSkokow = A_IloscSkokow;
        this.czasMinuty = A_czasMinuty;
    }

    @Override
    public String[] GetInfo() 
    {
        String[] tabInfo = new String[3];
        tabInfo[0] = new SimpleDateFormat("dd-MM-yyyy  HH:mm").format(GetDataTreningu());
        tabInfo[1] = String.valueOf(GetIloscSkokow());
        tabInfo[2] = String.valueOf(GetCzasMinuty());
        
        return tabInfo;
    }
}

class Rower extends Cwiczenia
{
    private int iloscKm;
    private int czasMinuty;
    
    public int GetIloscKm()
    {
        return iloscKm;
    }
    
    public int GetCzasMinuty()
    {
        return czasMinuty;
    }
    
    public static String GetInfo1()
    {
        return "Ilość przejechanych km:";
    }
    
    public static String GetInfo2()
    {
        return "Czas w minutach:";
    }
    
    public Rower(int A_iloscKm, int A_czasMinuty)
    {
        super("Rower");
        
        this.iloscKm = A_iloscKm;
        this.czasMinuty = A_czasMinuty;
    }

    @Override
    public String[] GetInfo() 
    {
        String[] tabInfo = new String[3];
        tabInfo[0] = new SimpleDateFormat("dd-MM-yyyy  HH:mm").format(GetDataTreningu());
        tabInfo[1] = String.valueOf(GetIloscKm());
        tabInfo[2] = String.valueOf(GetCzasMinuty());
        
        return tabInfo;
    }
}

class Pompki extends Cwiczenia
{
    private int iloscPowtorzen;
    private int iloscSerii;
    
    public int GetIloscPowtorzen()
    {
        return iloscPowtorzen;
    }
    
    public int GetIloscSerii()
    {
        return iloscSerii;
    }
    
    public static String GetInfo1()
    {
        return "Ilość powtórzeń:";
    }
    
    public static String GetInfo2()
    {
        return "Ilość serii:";
    }
    
    public Pompki(int A_iloscPowtorzen, int A_iloscSerii)
    {
        super("Pompki");
        
        this.iloscPowtorzen = A_iloscPowtorzen;
        this.iloscSerii = A_iloscSerii;
    }

    @Override
    public String[] GetInfo() 
    {
        String[] tabInfo = new String[3];
        tabInfo[0] = new SimpleDateFormat("dd-MM-yyyy  HH:mm").format(GetDataTreningu());
        tabInfo[1] = String.valueOf(GetIloscPowtorzen());
        tabInfo[2] = String.valueOf(GetIloscSerii());
        
        return tabInfo;
    }
}

class Przysiady extends Cwiczenia
{
    private int iloscPowtorzen;
    private int iloscSerii;
    
    public int GetIloscPowtorzen()
    {
        return iloscPowtorzen;
    }
    
    public int GetIloscSerii()
    {
        return iloscSerii;
    }
    
    public static String GetInfo1()
    {
        return "Ilość powtórzeń:";
    }
    
    public static String GetInfo2()
    {
        return "Ilość serii:";
    }
    
    public Przysiady(int A_iloscPowtorzen, int A_iloscSerii)
    {
        super("Przysiady");
        
        this.iloscPowtorzen = A_iloscPowtorzen;
        this.iloscSerii = A_iloscSerii;
    }

    @Override
    public String[] GetInfo() 
    {
        String[] tabInfo = new String[3];
        tabInfo[0] = new SimpleDateFormat("dd-MM-yyyy  HH:mm").format(GetDataTreningu());
        tabInfo[1] = String.valueOf(GetIloscPowtorzen());
        tabInfo[2] = String.valueOf(GetIloscSerii());
        
        return tabInfo;
    }
}