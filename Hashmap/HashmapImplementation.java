public class HashmapImplementation {

    static class MyHashMap<K, V> {

        public static final int DEFAULT_CAPACITY = 4;

        private class Node {
            K key;
            V value;

            Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private Node[] buckets;
        private int size;

        MyHashMap() {
            buckets = (Node[]) new MyHashMap.Node[DEFAULT_CAPACITY];
            size = 0;
        }

        public int size() {   // return number of entries
            return size;
        }

        private int hashFunction(K key) {
            return Math.abs(key.hashCode()) % buckets.length;
        }

        public void put(K key, V value) {  // insert/update

            int index = hashFunction(key);

            if (buckets[index] == null) {
                buckets[index] = new Node(key, value);
                size++;
            } else {
                buckets[index].value = value; // update
            }
        }

        public V get(K key) {

            int index = hashFunction(key);

            if (buckets[index] != null && buckets[index].key.equals(key)) {
                return buckets[index].value;
            }

            return null;
        }

        public V remove(K key) {

            int index = hashFunction(key);

            if (buckets[index] != null && buckets[index].key.equals(key)) {
                V val = buckets[index].value;
                buckets[index] = null;
                size--;
                return val;
            }

            return null;
        }
    }

    public static void main(String[] args) {

        MyHashMap<String, Integer> mp = new MyHashMap<>();

        mp.put("A", 10);
        mp.put("B", 20);

        System.out.println(mp.get("A")); // 10
        System.out.println(mp.size());   // 2

        System.out.println(mp.remove("A")); // 10

        System.out.println(mp.get("A")); // null
        System.out.println(mp.size());   // 1
    }
}
