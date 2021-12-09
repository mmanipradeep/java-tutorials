Why hashmap.

- performance
- Time Complexity is o (n) - to find specific elelment in a list .
O(log n) if it is sorted. - Example Binary Search

With HashMap, we can achieve an average time complexity of O(1) for the put and get operations and space complexity of O(n).
Instead of iterating over all its elements, HashMap attempts to calculate the position of a value based on its key.

HashMap stores elements in so-called buckets and the number of buckets is called capacity.

When we add an element to the map, HashMap calculates the bucket. If the bucket already contains a value, the value is added to the list (or tree) belonging to that bucket. If the load factor becomes bigger than the maximum load factor of the map, the capacity is doubled.

When we want to get a value from the map, HashMap calculates the bucket and gets the value with the same key from the list (or tree).

For this to work correctly, equal keys must have the same hash, however, different keys can have the same hash. If two different keys have the same hash, the two values belonging to them will be stored in the same bucket. Inside a bucket, values are stored in a list and retrieved by looping over all elements. The cost of this is O(n).

As of Java 8 (see JEP 180), the data structure in which the values inside one bucket are stored is changed from a list to a balanced tree if a bucket contains 8 or more values, and it's changed back to a list if, at some point, only 6 values are left in the bucket. This improves the performance to be O(log n).

5.4. Capacity and Load Factor
To avoid having many buckets with multiple values, the capacity is doubled if 75% (the load factor) of the buckets become non-empty. The default value for the load factor is 75%, and the default initial capacity is 16. Both can be set in the constructor.

HashMap extends AbstractMap class and implements the Map interface.

Traversing Using Stream API
Java
1
students.entrySet().stream().forEach(student -> {
2
        //Do Stuff
3
  });
4
​


https://www.journaldev.com/11560/java-hashmap