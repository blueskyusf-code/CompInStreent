package com.kkz.compinstreent;

import java.util.Scanner;

public class Program {
  public static void main(String[]args) {
    Scanner Block = new Scanner(System.in);
    while (true) {
    
    System.out.println("Menu");
    System.out.println("1 / Boas Vindas");
    System.out.println("2 / Elogio");
    System.out.println("3 / sair");
    System.out.println("");
    System.out.println("Se precisar de ajuda digite --help");
    
    String optionvoid = Block.nextLine();
    
    if (optionvoid.equalsIgnoreCase("1")) {
      System.out.println("Eae!");
    }
    else if (optionvoid.equals("2")) {
      System.out.println("você é inteligentissimo!");
    }
    else if (optionvoid.equalsIgnoreCase("--help")) {
      System.out.println("Precisa de ajuda no menu?"); 
      System.out.println("Se quiser Um Boas vindas digite 1");
      System.out.println("Se quiser Elogios digite 2");
      System.out.println("se quiser sair digite 3");
    }
    else if (optionvoid.equalsIgnoreCase("3")) {
      break;
    }
    else {
      System.out.println("Opção Invalida, digite --help pra saber mais");
    }
    }
    }
}
