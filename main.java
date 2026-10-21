import java.util.Scanner;
public class Main{
    public static void main(Stringp[]args){
        boolean infiniteLoop=true;
        double[]accountBalance=new double[1000];
        String[] accountName=new String[1000];
        int option,size=100;
        while(infiniteLoop){
            System.out.println("Welcome to codingal Banking services");
            System.out.println("Banking Menu: ");
            System.out.println("Select any one option from below.");
            System.out.println("1-> Add Customer");
            System.out.println("2-> Change Customer Name");
            System.out.println("3-> Check Account Balance");
            System.out.println("4-> Update Account Balance");
            System.out.println("5-> Summary of All Accounts");
            System.out.print1n("6-> Quit");
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter your option to proceed ahead:");
            option=sc.nextInt();
            if(option==1){
                System.out.println("\nAdd customer \nMenu->");
                sc.nextline();
                System.out.print("\nEnter Customer Name: ");
                String name=sc.nextLine();
                accountName[size]=name;
                System.out.print("Enter Opening Balance Amount:");
                double amt=sc.nextDouble();
                accountBalance[size]=amt;
                System.out.println("Account created successfully. \n");
                System.out.println("Account Detail:- \n");
                System.out.println("Account Name:"+accountName[size]);
                System.out.println("Account Balance:"+accountBalance[size]+"Rs \n");
            System.out.println("================================");
            size=size+1;
            }else if(option==2){
                System.out.println("\nChange Customer Name Menu");
                System.out.print("\nEnter your Account Number:");
                int accountIndex;
                String temp;
                accountIndex=sc.nextInt();
                sc.nextLine();
                if(accountIndex>size){
                    System.out.println("Account does not exist.");
                    System.out.println("Terminating...");
                }else{
                    temp=accountName[accountIndex];
                    String name=sc.nextLine();
                    accountName[accountIndex]=name;
                    System.out.println("Name is successfully updated from"+temp+"to"+name+".\n");
                }
        System.out.println("===============");
            }else if(option==3){
                System.out.println("\nCheck Account Balance Menu");
                System.out.print("\nEnter your Account Number:");
                int accountIndex;
                accountIndex=sc.nextInt();
                if (accountIndex > size) {
                    System.out.println("Account does not exist.");
                    System.out.println("Terminating...");   
                }else{
                    System.out.println(
                        accountNaame[accountIndex]+"your balance is"+accountBalance[accountIndex]+"RS.");
                    }
                System.out.println("==============");
                }else if(option==4){
                    System.out.println("\nUpdate Account Balance Menu");
                    System.out.println("\nEnter your Account Number:");
                    int accountIndex;
                    accountIndex=sc.nextInt();
                    if(accountIndex>size){
                        System.out.println("Account does not exist.");
                        System.out.println("Terminating...");
                    }else{
                        System.out.print("Enter the amount to be deposited:");
                        double amt=sc.nextDouble();
                        accountBalance[accountIndex]+=amt;
                        System.out.println(accountName[accountIndex]+accountBalance[accountIndex]+"RS. \n");
                    }
                System.out.println("============");
            }else if(option==5){
                System.out.println(accountName[accounIndex]+"your updated balance is:"+accountBalance[accountIndex]+"RS.\n");
            }
        System.out.println("Accounts registered\n");
        }
    System.out.println("=============");
        }else if (option==6){
        System.out.println("Developed & managed by ekaaksh@codingal");
        System.out.println("Built with in ♡ India");
            System.exit(0);        
    }
}   