import java.util.Scanner;
public class Asgmt_06 {
    public static void main(String[] args)throws Exception {

        java.io.File myData;
        String path = "C:\\Users\\faisa\\OneDrive\\Documents\\NetBeansProjects\\InputTextFiles";
        myData = new java.io.File(path + "\\asgmt06.txt");
        System.out.println("Does File Exists?   "+myData.exists());
        System.out.println("\nWELCOME TO BROOKLYN  AUTO INVENTORY MENAGEMENT SYSTEM\n");

        Scanner inpFile;
        inpFile = new Scanner (myData);
        int price = 10000;
        int [] inv = new int [10];
        for (int i = 0; i < inv.length; i++){
            inv[i] = 0;

        }
        System.out.println("Inventory BEFORE processing Sales & Pruchases\n"
                + "Car Type \t Number of Cars");
        printStock(inv);

        System.out.println();

        System.out.println("    -----ENTRY LOG-----\n");
        int cnt = 0;
        int transType = inpFile.nextInt();
        int car       = inpFile.nextInt();
        int units     = inpFile.nextInt();
        while (transType != -1){

            cnt++;
            System.out.println("\nEntry #:" +cnt);

            if (transType == 2){
                inv[car] = inv[car] + units;
                System.out.print("--Purchase--  Car Type    Quantity");
                System.out.println("\n\t\t"+car+"\t     "+units);
            }
            else if (transType == 1){
                if (units > inv[car])
                    System.out.print("--Denied Sale--\n(INADEQUATE Inventory available for sale)\n");


                else{
                    inv[car] = inv[car] - units;
                    System.out.print("--Sale--      Car Type    Quantity");
                    System.out.println("\n\t\t"+car+"\t     "+units);
                }
                }
            else if (transType !=1 && transType !=2 && transType > 0)
                System.out.print("--ERROR--\n(Invalid Transaction Code)\n");

            //System.out.println("\n\t\t"+car+"\t   "+units);

            transType = inpFile.nextInt();
            car       = inpFile.nextInt();
            units     = inpFile.nextInt();

        }
        System.out.println("\nInventory AFTER processing Sales & Pruchases\n"
                + "Car Type \t Number of Cars");
        printStock(inv);

        System.out.println("\nTotal value of the CURRENT Inventory: $"+sales(inv,10,price)+"\n");
    }
    public static void printStock(int[] inv){

        for (int i = 0; i < 10; i++)
            System.out.println("  " + i + "\t\t\t" + inv[i] + " ");
    }
    public static double sales (int [] inv, int nelts, int price){
        double total;
        int sumInv = 0;
        for (int i = 0; i < nelts; i++)
            sumInv = sumInv + inv[i];
        total = sumInv * price;
        return total;
    }

}
