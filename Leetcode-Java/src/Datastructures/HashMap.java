package Datastructures;

/**
 * HashMap
 */
public class HashMap<K,V> {

    /**
     * Node
     */
    public class Node {
        int hash;
        K key;
        V value;
        Node next;
        
    }

    /**
     * Key
     */
    public class Key {
        String key;

        public Key(String k){
            key = k;
        }

        public int hashcode(){
            int test = 0;
            for(int i=0; i<key.length();i++){
                test+=(int)key.charAt(0);
            }
            return test;
        }

        @Override
        public boolean equals(Object obj)   {
            return key.equals((String)obj);
        }
        
    }

    public static void main(String[] args) {
        HashMap h = new HashMap();
        h.testcase();
    }
    
    public void testcase(){
        Key test = new Key("test");
        System.out.println("code" + test.hashcode());
    }
    
}