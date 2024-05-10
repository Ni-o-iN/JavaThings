//package pr2.uebung03;
//
//import org.junit.Test;
//
//import pr2.uebung02.Element;
//import pr2.uebung02.StringElement;
//
//
//import static org.junit.Assert.*;
//
//public class HashTable1stTest {
//    String s1 = "abcdefghijk";
//    String s2 = "abcdefghijklmnop";
//    String s3 = "abcdefghijklmnopqrst";
//
//    Element ms1 = new StringElement(s1);
//    Element ms2 = new StringElement(s2);
//    Element ms3 = new StringElement(s3);
//
//    HashTable ht = new HashTable(5, new QuadraticProbing(0));
//
//    @Test
//    public void testsOnEmptyHT() {
//        assertEquals(0, ht.size());
//        assertNull(ht.get(ms1));
//        assertEquals(false, ht.contains(ms1));
//        assertEquals(false, ht.containsKey(s1));
//        assertEquals(true, ht.isEmpty());
//        ht.clear();
//    }
//    
//    @Test
//    public void testsOnHT() {
//
//        assertEquals(true, ht.isEmpty());
//
//        assertNull(ht.put(ms1, s1));
//        assertNull(ht.put(ms2, s2));
//        assertNull(ht.put(ms3, s3));
//
//        assertEquals(s1, ht.put(ms1, s1 + s2)); // returns old value when same
//                                                // key is inserted
//        assertEquals(3, ht.size());
//        assertEquals(s2, ht.get(ms2));
//        assertEquals(s1 + s2, ht.get(ms1));
//        assertEquals(false, ht.contains(s1));
//        assertEquals(true, ht.contains(s1 + s2));
//        assertEquals(true, ht.containsKey(ms2));
//        assertEquals(false, ht.isEmpty());
//
//        assertEquals(true, ht.remove(ms1));
//
//        assertEquals(false, ht.contains(s1 + s2));
//        assertEquals(true, ht.contains(s3));
//
//        assertEquals(2, ht.size());
//        assertEquals(true, ht.remove(ms2));
//        assertEquals(true, ht.remove(ms3));
//
//        assertEquals(0, ht.size());
//
//        assertNull(ht.put(ms1, s1));
//        assertNull(ht.put(ms2, s2));
//        assertNull(ht.put(ms3, s3));
//
//        assertEquals(3, ht.size());
//        ht.clear();
//        assertEquals(0, ht.size());
//
//        assertNull(ht.put(ms1, s1));
//        assertEquals(1, ht.size());
//        assertNull(ht.put(ms2, s2));
//        assertEquals(2, ht.size());
//
//    }
//}