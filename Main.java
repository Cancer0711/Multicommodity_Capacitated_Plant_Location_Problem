/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.es_9_homework_2_logistica;

import Utility.Dati;
import ilog.concert.IloException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

/**
 *
 * @author diego
 */




//    int numero_prodotti;
//    protected double[] cf;// costi fissi giornalieri
//    protected double[] capacità;// capacità giornaliere
//    protected double[][] domande;// domande giornaliere
public class Main  {
public static void main (String[] args) throws FileNotFoundException, IOException, IloException {
    System.setOut(new PrintStream(args[0]));// questo comando permette di stampare in output un file .log con il risultato
   //Il file deve essere scritto in arguments
 //clicca sul nome progetto, tasto destro, Proprierties, RUN, Arguments, in prima posizione (posizione 1)c'è il nome del file .log
 double[][] c1ij = Dati.CostiC1ij();
 double[][] c2ij = Dati.CostiC2ij();
 int numero_siti_potenziali=Dati.NumeroSitiPotenziali();
 int numero_siti_da_servire=Dati.NumeroSitiDaServire();
int numero_prodotti=Dati.NumeroProdotti();
 double[] cf=Dati.CostiFissiGiornalieri();
 double[] capacità=Dati.CapacitàGiornaliere();
 double[][] domande=Dati.DomandeGiornaliereProdotti();
    
    Modello_CPL_Multiprodotto m= new Modello_CPL_Multiprodotto(c1ij,c2ij,cf,capacità,domande,numero_siti_potenziali,numero_siti_da_servire,numero_prodotti);
    m.risolviModello();
     }
    
    
    
    
}
