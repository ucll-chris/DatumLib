package model.versie1;

import java.util.*;

public class Datum {

	private int dag,maand,jaar;
//testff
	//set methodes niet toegelate -> immutable
	//get
	public int getDag()
	{
		return dag;
	}
	public int getMaand()
	{
		return maand;
	}
	public int getJaar()
	{
		return jaar;
	}
	
	/**Constructor zonder parameter (systeemdatum)
	 * 
	 */
	public void Datum()
	{
	  Date D1 = new Date();
	  jaar = D1.getYear();
	  maand = D1.getMonth();
	  dag = D1.getDay();
	}
	/**
	 * Constructor met een datum object
	 * @param datum
	 */
	public void Datum(Datum datum)
	{
		
	}
	/**
	 * Constuctor met integers als input
	 * @param dag
	 * @param maand
	 * @param jaar
	 */
	public void Datum(int dag,int maand, int jaar)
	{
		
	}
	/**
	 * Constructor met string als input format DDMMJJJ, en met schijdingstekens (12/05/2009)
	 * Scheidingstekens zijn -, / en blanco
	 * Dag en maand moeten ingegeven worden met 2 cijfers, jaar getal met 4
	 * @param str
	 */
	public void Datum(String str)
	{
		
	}
	
	
}
