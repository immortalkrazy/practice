import java.util.Scanner;
public class Asgmt_07 {

    public static void main(String[]args) throws Exception{

        int [] car = new int [8];
        int [] inv = new int [8];

        int ele = car.length;

        java.io.File myCars;
        java.io.File myTrans;

        String path = "C:\\Users\\faisa\\OneDrive\\Documents"
                + "\\NetBeansProjects\\InputTextFiles\\asgmt07";
        myCars  = new java.io.File (path + "\\car.txt");
        myTrans = new java.io.File (path + "\\trans.txt");

        System.out.println(myCars.exists());
        System.out.println(myTrans.exists());

        Scanner flC;
        flC = new Scanner (myCars);
        Scanner flT;
        flT = new Scanner (myTrans);

        System.out.println("Seeting-up array values to zero:\n"
                + "Car Models\tInventory Value");
        int nCars = flC.nextInt();
        for (int i = 0; i < nCars; i++){
            car [i] = 0;
            inv [i] = 0;
        }
        printStock(car,inv);

        System.out.println("");

        for (int i = 0; i < nCars; i++)
            car [i] = flC.nextInt();

        System.out.println("Inventory BEFORE processing Sale/Pruchase File\n"
                + "Car Model \t Current Inventory");
        printStock(car,inv);
        System.out.println();

        System.out.println("    -----ENTRY LOG-----\n");
        int cnt = 0;
        int trType = flT.nextInt();
        int model  = flT.nextInt();
        int qty    = flT.nextInt();
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
            model  = flT.nextInt();
            qty    = flT.nextInt();

        }
        System.out.println("\n\nInventory AFTER processing Sale/Purchase File:"
                + "\n\nCar Model \t Current Inventory");
        printStock(car,inv);

        System.out.println("\n\nInventory sorted by CAR MODELS:\n\n"
                + "Car Model \t Current Inventory");
        sortByCar(car,inv,ele);
        printStock(car,inv);

        System.out.println("\nInventory sorted by Available Models:\n\n"
                + "Car Model \t Current Inventory");
        sortByQuan(inv,car,ele);
        printStock(car,inv);
        System.out.println("");

    }

    public static void printStock (int car[], int inv[]){
        for (int i = 0; i < car.length; i++)
            System.out.printf("%4d \t\t\t%4d\n",car[i], inv[i]);

    }

    public static void sortByCar (int car[], int inv[], int nelts){

        int nPass = nelts - 1;
        for (int pass = 1; pass <= nelts; pass++)
            for (int ind = 0; ind < nPass; ind++)
                if (car[ind] > car[ind+1]){
                    int tempCar = car[ind];
                    int tempInv = inv[ind];
                    car[ind]    = car[ind+1];
                    inv[ind]    = inv[ind+1];
                    car[ind+1]  = tempCar;
                    inv[ind+1]  = tempInv;
                }

    }
    public static void sortByQuan (int inv[], int car[], int nelts){

        int nPass = nelts - 1;
        for (int pass = 1; pass <= nelts; pass++)
            for (int ind = 0; ind < nPass; ind++)
                if (inv[ind] < inv[ind+1]){
                    int tempCar = car[ind];
                    int tempInv = inv[ind];
                    car[ind]    = car[ind+1];
                    inv[ind]    = inv[ind+1];
                    car[ind+1]  = tempCar;
                    inv[ind+1]  = tempInv;
                }

    }
    public static int lookup(int []a, int arg){
        for (int i = 0; i < a.length; i++)
            if(a[i] == arg)
                return i;
        return -1;
    }

}
