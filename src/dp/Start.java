//class Start.java
package dp;

public class Start
	{
	public Start()
		{
		}

	public static void main(String[] args)
		{
		Fork F12 = new Fork("F1-2");
		Fork F23 = new Fork("F2-3");
		Fork F34 = new Fork("F3-4");
		Fork F45 = new Fork("F4-5");
		Fork F51 = new Fork("F5-1");
		Monk P1 = new Monk("P1", F51, F12);
		Monk P2 = new Monk("P2", F12, F23);
		Monk P3 = new Monk("P3", F23, F34);
		Monk P4 = new Monk("P4", F34, F45);
		Monk P5 = new Monk("P5", F45, F51);
		Thread TP1 = new Thread(P1);
		Thread TP2 = new Thread(P2);
		Thread TP3 = new Thread(P3);
		Thread TP4 = new Thread(P4);
		Thread TP5 = new Thread(P5);
		TP1.start();
		TP2.start();
		TP3.start();
		TP4.start();
		TP5.start();
		}
	}
