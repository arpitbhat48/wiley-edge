import java.util.*;
 
/**
 * ReadWriteLockTest.java
 * Test program for understanding ReadWriteLock
 * @author www.codejava.net
 */
public class Simple {
    static final int READER_SIZE = 10;
    static final int WRITER_SIZE = 2;
 
    public static void main(String[] args) {
        Integer[] initialElements = {10, 20, 30, 40};
 
        ReadWriteList<Integer> sharedList = new ReadWriteList<>(initialElements);
 
//        for (int i = 0; i < WRITER_SIZE; i++) {
//            new Writer(sharedList, 60).start();
//        }
        new Writer(sharedList, 100).start();
        new Writer(sharedList, 200).start();
 
        for (int i = 0; i < READER_SIZE; i++) {
            new Reader(sharedList).start();
        }
 
    }
}