package ue.account;

public class BankingDemo {

  public static void main(String[] args) {

    Bank bank = new Bank();

    try {
      bank.addAccount("hanspeter",500,500);
      bank.addAccount("max",3000,1000);

      System.out.println(bank);

      bank.transfer("hanspeter","max",100);
      bank.transfer("max","hanspeter",750);

      System.out.println(bank);


    } catch (BankException | AccountNotFoundException e) {
      e.printStackTrace();
    }

  }

}
