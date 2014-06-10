/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projekt_kon;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Konrad
 */
public class DziennikView extends JFrame
{
    private JPanel panelWyswietlany;
    private GlowneOknoJPanel panelMain;
    private UzupelnijDziennikJPanel dziennik;
    private StatystykiJPanel statystyki;
    private StatystykiTabelaJPanel statTabela;
    public static final int WIDTH = 420;
    public static final int HEIGHT = 320;
    
    public DziennikView()
    {
        this.panelMain = new GlowneOknoJPanel();
        panelWyswietlany = panelMain;
        
        this.dziennik = new UzupelnijDziennikJPanel();
        this.statystyki = new StatystykiJPanel();
        this.statTabela = new StatystykiTabelaJPanel();
        
        this.add(panelWyswietlany);
        this.getContentPane().add(panelMain);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(WIDTH, HEIGHT);
        this.setVisible(true);
        this.setResizable(false);
    }
    
    private void Wyswietl(JPanel A_Panel)
    {
        getContentPane().remove(panelWyswietlany);
        getContentPane().add(A_Panel);
        
        panelWyswietlany = A_Panel;
        revalidate();
        repaint();
    }
    
    public void WyswietlGlowneOkno()
    {
        Wyswietl(panelMain);
    }
    
    public void WyswietlUzupelnijDziennik(String A_Nazwa, String A_LabPierwszy, String A_LabDrugi)
    {
        dziennik.SetNazwa(A_Nazwa, A_LabPierwszy, A_LabDrugi);
        Wyswietl(dziennik);
    }
    
    public void WyswietlStatystyki(String A_Nazwa)
    {
        statystyki.SetNazwa(A_Nazwa);
        Wyswietl(statystyki);
    }
    
    public void WyswietlStatTabele(String A_Nazwa, Date A_DataOd, Date A_DataDo)
    {
        statTabela.SetNazwa(A_Nazwa);
        statTabela.SetDaty(A_DataOd, A_DataDo);
        Wyswietl(statTabela);
    }
    
    public boolean CzyWcisnietyUzupelnijDziennik()
    {
        return panelMain.CzyWcisnietyUzupelnijDziennik();
    }
    
    public String GetDziennikNazwaCwiczenia()
    {
        return dziennik.GetNazwaCwiczenia();
    }
    
    public int GetDziennikLiczba1()
    {
        return Integer.parseInt(dziennik.GetText1());
    }
    
    public int GetDziennikLiczba2()
    {
        return Integer.parseInt(dziennik.GetText2());
    }
    
    public String GetStatystykiNazwa()
    {
        return statystyki.GetNazwa();
    }
    
    public String GetDateOd()
    {
        return statystyki.GetDataOd();
    }
    
    public String GetDateDo()
    {
        return statystyki.GetDataDo();
    }
    
    public void SetDataOd(String data)
    {
        statystyki.SetDataOd(data);
    }
    
    public void SetDataDo(String data)
    {
        statystyki.SetDataDo(data);
    }
    
    public void UzupDziennikResetIncValues()
    {
        dziennik.SetIncVal1Visible(false);
        dziennik.SetIncVal2Visible(false);
        repaint();    
    }
    
    public void StatystykiResetIncValues()
    {
        statystyki.SetIncVal1Visible(false);
        statystyki.SetIncVal2Visible(false);
        revalidate();
        repaint();
    }
    
    public void UzupDziennikSetIncValue(int index)
    {
        if(index == 1)
            dziennik.SetIncVal1Visible(true);
        else if(index == 2)
            dziennik.SetIncVal2Visible(true);
    }
    
    public void StatystykiSetIncValue(int index)
    {
        if(index == 1)
            statystyki.SetIncVal1Visible(true);
        else if(index == 2)
            statystyki.SetIncVal2Visible(true);
        revalidate();
        repaint();
    }
    
    public void SetHeadersStatTabela(String Header1, String Header2, String Header3)
    {
        statTabela.SetHeadery(Header1, Header2, Header3);
    }
    
    public void DodajWierszStatTabela(Date data, String strData, String str1, String str2)
    {
        statTabela.DodajWiersz(data, strData, str1, str2);
    }
    
    public void CzyscTabeleStat()
    {
        statTabela.CzyscTabele();
    }
    
    //--------------------------------------------------------------------------
    //Listeners
    public void AddGlowneOknoCwiczeniaBtnListener(ActionListener listenForBtnCwiczenia)
    {
        ArrayList<JButton> arButtony = panelMain.GetCwiczeniaButtons();
        
        for(JButton item : arButtony)
        {
            item.addActionListener(listenForBtnCwiczenia);
        }
    }
    
    public void AddPokazStatystykiListener(ActionListener listenForBtnPokazStat)
    {
        statystyki.GetButtonPokazStat().addActionListener(listenForBtnPokazStat);
    }
    
    public void AddZapiszTreningListener(ActionListener listenForZapiszTrening)
    {
        dziennik.GetButtonZapisz().addActionListener(listenForZapiszTrening);
    }
    
    public void AddWsteczListener(ActionListener listenForBtnWstecz)
    {
        dziennik.GetButtonWstecz().addActionListener(listenForBtnWstecz);
        statystyki.GetButtonWstecz().addActionListener(listenForBtnWstecz);
    }
    
    public void AddWsteczStatTabela(ActionListener listenForBtnWstecz)
    {
        statTabela.GetButtonWstecz().addActionListener(listenForBtnWstecz);
    }
}
