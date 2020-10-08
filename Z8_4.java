package Zad;

public class Z8_4 {
public static void main (String []args) {
	int[][] teste = new int[4][13];
	int boq;
	int nomer;
	int[] proverka = new int[4];
	int i=0;
  while(i<4) {
	  boq = (int)(Math.random() * 4);
	  nomer = (int)(Math.random() * 13);

	  boolean povtarq_se = false;
	  
	  proverka[i]=100*boq+nomer;
	  for(int j=0;j<i;j++) {
		  if(proverka[i] == proverka[j]) {povtarq_se = true;
		  break;}
	  }
	  if(povtarq_se == true) {continue;};
	  switch(nomer) {
	  case 0: System.out.print("aso");  break;
	  case 1: System.out.print("dvojka");  break;
	  case 2: System.out.print("trojka");  break;
	  case 3: System.out.print("chetvorka");  break;
	  case 4: System.out.print("petica");  break;
	  case 5: System.out.print("shestica");  break;
	  case 6: System.out.print("sedmica");  break;
	  case 7: System.out.print("osmica");  break;
	  case 8: System.out.print("devetka");  break;
	  case 9: System.out.print("desetka");  break;
	  case 10: System.out.print("vale");  break;
	  case 11: System.out.print("dama");  break;
	  case 12: System.out.print("pop");  break;
	  }
	  
	  switch(boq) {
	  case 0: System.out.print(" spatiq");  break;
	  case 1: System.out.print(" karo");  break;
	  case 2: System.out.print(" kupa");  break;
	  case 3: System.out.print(" pika");  break;
	  }
	  System.out.println();
	  boq= -1;
	  nomer = -1;
	  i++;
  }
}
}
