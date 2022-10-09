package com.sda.lesson.ushtrimiHTML;

public class Implement {
    public static void main(String[] args) {
        // Test constructor and toString()
        Llogaria a1 = new Llogaria("A101", "Tan Ah Teck", 88);
        System.out.println(a1);  // toString();
        Llogaria a2 = new Llogaria("A102", "Kumar"); // default balance
        System.out.println(a2);
        Llogaria a3 = new Llogaria("23", "Kot", 123);
        Llogaria a4 = new Llogaria("123", "kot1", 222);
        Llogaria a5 = new Llogaria("111", "kot3", 333);
        Llogaria[] accounts = new Llogaria[]{a1, a2, a3, a4, a5};

        // Test Getters
        System.out.println("ID: " + a1.getID());
        System.out.println("Name: " + a1.getEmri());
        System.out.println("Balance: " + a1.getBalanca());
        // Test credit() and debit()
        a1.credit(100);

        a1.debit(50);

        // a1.debit(500);  // debit() error

        // Test transfer()
        a1.transferTo(a2, 100);  // toString()
        System.out.println(a1);
        System.out.println(a2);

        findTheHighestBalance(accounts);
        findAtLeast500LekeInBalance(accounts);
        findTheLowestBalance(accounts);
        sortArray(accounts);
        printArray(accounts);

        nesetedFor();
    }

    public static void findTheHighestBalance(Llogaria accounts[]){
        int max = accounts[0].getBalanca();
        for(int i = 1; i < accounts.length;i++){
            if(max < accounts[i].getBalanca()){
                max = accounts[i].getBalanca();
            }
        }

        System.out.println(max);
    }

    public static void findTheLowestBalance(Llogaria accounts[]){
        int min = accounts[0].getBalanca();
        for(int i = 1; i < accounts.length;i++){
            if(min > accounts[i].getBalanca()){
                min = accounts[i].getBalanca();
            }
        }

        System.out.println(min);
    }

    public static void findAtLeast500LekeInBalance(Llogaria accounts[]){
        for(int i = 0; i < accounts.length;i++){
            if( accounts[i].getBalanca() > 500){
                System.out.println("Acounti me id " + accounts[i].getID() + " ka balancen me te madhe se 500");
            }
        }
    }

    public static void printArray(Llogaria accounts[]){
        for(int i = 0; i < accounts.length;i++){
            System.out.println(accounts[i]);
        }
    }

    public static void sortArray(Llogaria accounts[]){
        for(int i = 0; i < accounts.length;i++){
            for (int j = i +1 ; j<accounts.length; j++){
                if(accounts[i].getBalanca() > accounts[j].getBalanca()){
                    int temp = accounts[i].getBalanca();
                    accounts[i].setBalanca(accounts[j].getBalanca());
                    accounts[j].setBalanca(temp);
                }
            }
        }
    }


    public static void nesetedFor(){
        for(int i = 0; i < 7;i++){
            System.out.println(i);
            for (int j = i +1 ; j<7; j++){
                System.out.print( " " + j);
            }
            System.out.println();
        }
    }

}
