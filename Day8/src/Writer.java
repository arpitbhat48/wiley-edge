 public class Writer extends Thread {
    private ReadWriteList<Integer> sharedList;
    private int number;
 
    public Writer(ReadWriteList<Integer> sharedList, int num) {
        this.sharedList = sharedList;
        this.number = num;
    }
 
    public void run() {
        
        sharedList.add(number);
 
        try {
            Thread.sleep(100);
            System.out.println(getName() + " -> put: " + number);
        } catch (InterruptedException ie ) { ie.printStackTrace(); }
    }
}