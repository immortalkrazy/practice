import java.util.Scanner;
import java.io.PrintStream;
public class CarDealer {

    public static void main(String[]args) throws Exception{

        String [] car = new String [8];
        int    [] inv = new int    [8];

        int ele = car.length;

        java.io.File myCars;
        java.io.File myTrans;
        java.io.File myOutFile;

        String path = "C:\\Users\\faisa\\OneDrive\\Documents"
                + "\\NetBeansProjects\\InputTextFiles\\asgmt07a";
        myCars    = new java.io.File (path + "\\car.txt");
        myTrans   = new java.io.File (path + "\\trans.txt");
        myOutFile = new java.io.File (path + "\\javaTestOut.txt");

        System.out.println("Car names File exists?      "+myCars.exists());
        System.out.println("Transactions File exists?   "+myTrans.exists());

        Scanner     flC;
        Scanner     flT;
        PrintStream myOut;
        flC = new Scanner (myCars);
        flT = new Scanner (myTrans);
        myOut = new PrintStream (myOutFile);

        System.out.println("\nSetting-up array values to zero:");
        int nCars = flC.nextInt();
        for (int i = 0; i < nCars; i++){
            car [i] = "No";
            inv [i] = 0;
        }



        printStock(car,inv);
        for (int i = 0; i < nCars; i++){
            car [i] = flC.next();
        }
        System.out.println("\n\nInventory BEFORE processing Sale/Pruchase File\n");
        printStock(car,inv);
        System.out.println("");
        System.out.println("---Processing data File---");
        System.out.println("    -----ENTRY LOG-----");
        int cnt = 0;
        int trType    = flT.nextInt();
        String model  = flT.next();
        int qty       = flT.nextInt();
        while (trType != -1){
            cnt++;
            System.out.println("\nEntry #:" +cnt);
            int pos = lookup(car,model);
            if(pos == -1)
                System.out.println("---ERROR---\n(Invalid Car Model)\n");
            else {
                if (trType == 2){
                    inv[pos] = inv[pos] + qty;
                    System.out.print("--Purchase--  Car Model    Quantity");
                    System.out.println("\n\t\t"+car[pos]+"\t     "+qty);
                }
                else if (trType == 1){
                    if (qty > inv[pos])
                        System.out.println("--Denied Sale--\n"
                               + "(INADEQUATE Inventory available for sale)\n");
                    else{
                        inv[pos] = inv[pos] - qty;
                        System.out.print("--Sale--      Car Model    Quantity");
                        System.out.println("\n\t\t"+car[pos]+"\t    "+qty);
                    }
                }
                else
                    System.out.println("--ERROR--\n(Invalid Transaction Code)\n");
            }
            trType = flT.nextInt();
            model  = flT.next();
            qty    = flT.nextInt();
        }

        System.out.println("\nInventory AFTER processing Sale/Purchase File:");
        printStock(car,inv);


        System.out.println("\nInventory Sorted by INVENTORY:");
        sortByQuan(inv,car,ele);
        printStock(car,inv);

        System.out.println("\nInventory Sorted by CAR MODEL:");
        sortByCar(car,inv,ele);
        printStock(car,inv);

        myOut.print ("Hello to File");
        myOut.close();
        /*String tire = "Toyota";
        System.out.println("If the part Exists:     "+lookup(car,tire));*/

    }

    public static void printStock (String car[], int inv[]){
        System.out.println("Car Model \t Current Inventory");
        for (int i = 0; i < car.length; i++){
            System.out.println(car[i]+ "\t\t\t"+ inv[i]);
        }
    }

    public static void sortByCar (String car[], int inv[], int nelts){

        int nPass = nelts - 1;
        for (int pass = 1; pass <= nelts; pass++)
            for (int ind = 0; ind < nPass; ind++)
                if (car[ind] .compareTo(car[ind+1]) >0){
                    String tempCar = car[ind];
                    int tempInv = inv[ind];
                    car[ind]    = car[ind+1];
                    inv[ind]    = inv[ind+1];
                    car[ind+1]  = tempCar;
                    inv[ind+1]  = tempInv;
                }

    }




    public static void sortByQuan (int inv[], String car[], int nelts){

        int nPass = nelts - 1;
        for (int pass = 1; pass <= nelts; pass++)
            for (int ind = 0; ind < nPass; ind++)
                if (inv[ind] < inv[ind+1]){
                    String tempCar = car[ind];
                    int tempInv = inv[ind];
                    car[ind]    = car[ind+1];
                    inv[ind]    = inv[ind+1];
                    car[ind+1]  = tempCar;
                    inv[ind+1]  = tempInv;
                }

    }

    public static int lookup(String []a, String arg){
        for (int i = 0; i < a.length; i++)
            if(a[i] .equals (arg))
                return i;
        return -1;
    }
}
