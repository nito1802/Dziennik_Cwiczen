/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projekt_kon;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Konrad
 */
public class DziennikController 
{
    private DziennikSingletonModel Model;
    private DziennikView View;
    
    public DziennikController(DziennikSingletonModel A_Model, DziennikView A_View)
    {
        Model = A_Model;
        View = A_View;
        
        Model.WczytajListe();
        View.SetDataOd(new SimpleDateFormat("dd-MM-yyyy").format(Model.GetDataNajwczesniejsza()));
        View.SetDataDo(new SimpleDateFormat("dd-MM-yyyy").format(Model.GetDataNajpozniejsza()));
        View.AddGlowneOknoCwiczeniaBtnListener(new GlowneOknoButtonsListener());
        View.AddWsteczListener(new WsteczButtonsListener());
        View.AddZapiszTreningListener(new ZapiszTreningButtonsListener());
        View.AddPokazStatystykiListener(new PokazStatystykiButtonsListener()); 
        View.AddWsteczStatTabela(new WsteczButtonStatTabelaListener());
    }
    
    class GlowneOknoButtonsListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent ae) {
            JButton btn =  (JButton) ae.getSource();
            
            if(View.CzyWcisnietyUzupelnijDziennik())
            {
                String Info1 = null;
                String Info2 = null;

                switch(btn.getText())
                {
                    case "Bieg":
                        Info1 = Bieg.GetInfo1();
                        Info2 = Bieg.GetInfo2();
                        break;
                    case "Pływanie":
                        Info1 = Plywanie.GetInfo1();
                        Info2 = Plywanie.GetInfo2();
                        break;
                    case "Skakanka":
                        Info1 = Skakanka.GetInfo1();
                        Info2 = Skakanka.GetInfo2();
                        break;
                    case "Rower":
                        Info1 = Rower.GetInfo1();
                        Info2 = Rower.GetInfo2();
                        break;
                    case "Pompki":
                        Info1 = Pompki.GetInfo1();
                        Info2 = Pompki.GetInfo2();
                        break;
                    case "Przysiady":
                        Info1 = Przysiady.GetInfo1();
                        Info2 = Przysiady.GetInfo2();
                        break;
                }
            
            
            
                View.WyswietlUzupelnijDziennik(btn.getText(), Info1, Info2);
            }
            else
            {
                View.WyswietlStatystyki(btn.getText());
            }
        }
        
    }
    
    class WsteczButtonsListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent ae) {
            View.WyswietlGlowneOkno();
        }
    }
    
    class WsteczButtonStatTabelaListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent ae) {
            View.WyswietlStatystyki(View.GetStatystykiNazwa());
        }
    }
    
    class ZapiszTreningButtonsListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent ae) {
            
            int Val1, Val2;
            
            View.UzupDziennikResetIncValues();
            
            try
            {
                try
                {
                    Val1 = View.GetDziennikLiczba1();
                    if(Val1 < 1)
                    {
                        throw new NumberFormatException("Wartość musi być większa od 0.");
                    }
                }
                catch(Exception e)
                {
                    View.UzupDziennikSetIncValue(1);
                    throw e;
                }

                try
                {
                    Val2 = View.GetDziennikLiczba2();
                    if(Val2 < 1)
                    {
                        throw new NumberFormatException("Wartość musi być większa od 0.");
                    }
                }
                catch(Exception e)
                {
                    View.UzupDziennikSetIncValue(2);
                    throw e;
                }
                
                switch(View.GetDziennikNazwaCwiczenia())
                {
                    case "Bieg":
                        Model.Dodaj(new Bieg(Val1, Val2));
                        break;
                    case "Pływanie":
                        Model.Dodaj(new Plywanie(Val1, Val2));
                        break;
                    case "Skakanka":
                        Model.Dodaj(new Skakanka(Val1, Val2));
                        break;
                    case "Rower":
                        Model.Dodaj(new Rower(Val1, Val2));
                        break;
                    case "Pompki":
                        Model.Dodaj(new Pompki(Val1, Val2));
                        break;
                    case "Przysiady":
                        Model.Dodaj(new Przysiady(Val1, Val2));
                        break;
                }
                
                Model.ZapiszListe();
                JOptionPane.showMessageDialog(null,"Zapisano Trening.","Informacja",JOptionPane.INFORMATION_MESSAGE);
            }
            catch(Exception ex)
            {
                
            }
        }
    }
    
    class PokazStatystykiButtonsListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent ae) 
        {
            View.StatystykiResetIncValues();
            View.CzyscTabeleStat();
            
            try
            {
                Date dateOd = null;
                Date dateDo = null;
                
                try 
                {
                    DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
                    formatter.setLenient(false);
                    dateOd = formatter.parse(View.GetDateOd());
                    dateOd.setHours(0);
                    dateOd.setMinutes(0);
                } 
                catch (ParseException e) 
                { 
                    View.StatystykiSetIncValue(1);
                    throw e;
                }
                
                try 
                {
                    DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
                    formatter.setLenient(false);
                    dateDo = formatter.parse(View.GetDateDo());
                    dateDo.setHours(23);
                    dateDo.setMinutes(59);
                } 
                catch (ParseException e) 
                { 
                    View.StatystykiSetIncValue(2);
                    throw e;
                }
                
                View.WyswietlStatTabele(View.GetStatystykiNazwa(), dateOd, dateDo);
                
                String[] headers = Model.GetCwiczeniaInfo(View.GetStatystykiNazwa());
                
                View.SetHeadersStatTabela(headers[0], headers[1], headers[2]);
                ArrayList<Cwiczenia> arList = Model.GetListaCwiczen(View.GetStatystykiNazwa());
                
                for(Cwiczenia item : arList)
                {
                    String[] tabInfo = item.GetInfo();
                    View.DodajWierszStatTabela(item.GetDataTreningu(), 
                            tabInfo[0],
                            tabInfo[1], 
                            tabInfo[2]);
                }
                
            } 
            catch(ParseException ex)
            {
                
            }
        }
    }
}
