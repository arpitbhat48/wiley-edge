import java.util.*;

class Main {
    String name;
    double amount, cost;
    
    Main(String name, double a, double cost) {
        // System.out.println("Using Parameterised Constructor");
        this.name = name;
        this.amount =a;
        this.cost = cost;
    }
    
    public String getName() {
        return this.name;    
    }
    
    public Double getAmount() {
        return this.amount;    
    }
    
    public Double getCost() {
        return this.cost;    
    }
    
    public void display() {
        System.out.println("Name:" + getName());
        System.out.println("Deposit Amount:" + getAmount());
        System.out.println("Cost Per Day:" + getCost());
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        // Main m;
        String[] str = new String[n];
        String[] d1 = new String[n];
        String[] d2 = new String[n];
        for (int i=0; i<n; i++) {
            str[i] = scan.nextLine();
            d1[i] = scan.nextLine();
            d2[i] = scan.nextLine();
        }
        String s = scan.nextLine();
        
        Main m,res=null;
        double db1, db2;
        for(int i=0; i<n;i++) {
            System.out.println("Item Type Number " + (i+1) + ":");
            db1 = Double.parseDouble(d1[i]);
            db2 = Double.parseDouble(d2[i]);
            m = new Main(str[i], db1, db2);
            m.display();
            
            if (str[i].equals(s)) {
                // System.out.println("srrf");
                res = new Main(str[i], db1, db2);
            } 
            
        }
        if (res != null){
            System.out.println("Searched Item Type is:");
            res.display();
        } else {
            System.out.println("Searched Item Type not found");
        }
            
    }
}