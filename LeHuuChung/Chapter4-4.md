# **Question:**
Find a refactoring in some large, existing system. Build tests that capture the behavior relevant to that part of the system. Refactor, and then check that the tests still pass.

**<h2>Dịch</h2>**
> Tìm một tái cấu trúc trong một hệ thống đã tồn tại. Xây dựng một ca kiểm thử bắt được hành động liên quan đến bộ phận của hệ thống. Cấu trúc lại và sau đó kiểm tra ca kiểm thử.

# **Answer:**
`Thuật toán BinarySearch.java`
```java
package Searches;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

import static java.lang.String.format;

/**
 *
 * Binary search is one of the most popular algorithms
 * The algorithm finds the position of a target value within a sorted array
 *
 * Worst-case performance	O(log n)
 * Best-case performance	O(1)
 * Average performance	O(log n)
 * Worst-case space complexity	O(1)
 *
 *
 * @author Varun Upadhyay (https://github.com/varunu28)
 * @author Podshivalov Nikita (https://github.com/nikitap492)
 *
 * @see SearchAlgorithm
 * @see IterativeBinarySearch
 *
 */

class BinarySearch implements SearchAlgorithm {

    /**
     *
     * @param array is an array where the element should be found
     * @param key is an element which should be found
     * @param <T> is any comparable type
     * @return index of the element
     */
    @Override
    public  <T extends Comparable<T>> int find(T[] array, T key) {
        return search(array, key, 0, array.length);
    }

    /**
     * This method implements the Generic Binary Search
     *
     * @param array The array to make the binary search
     * @param key The number you are looking for
     * @param left The lower bound
     * @param right The  upper bound
     * @return the location of the key
     **/
    private <T extends Comparable<T>> int search(T array[], T key, int left, int right){
        if (right < left) return -1; // this means that the key not found

        // find median
        int median = (left + right) >>> 1;
        int comp = key.compareTo(array[median]);

        if (comp == 0) {
            return median;
        } else if (comp < 0) {
            return search(array, key, left, median - 1);
        } else {
            return search(array, key, median + 1, right);
        }
    }

    // Driver Program
    public static void main(String[] args) {
        // Just generate data
        Random r = ThreadLocalRandom.current();

        int size = 100;
        int maxElement = 100000;

        Integer[] integers = IntStream.generate(() -> r.nextInt(maxElement)).limit(size).sorted().boxed().toArray(Integer[]::new);


        // The element that should be found
        int shouldBeFound = integers[r.nextInt(size - 1)];

        BinarySearch search = new BinarySearch();
        int atIndex = search.find(integers, shouldBeFound);

        System.out.println(format(
            "Should be found: %d. Found %d at index %d. An array length %d",
            shouldBeFound, integers[atIndex], atIndex, size
        ));

        int toCheck = Arrays.binarySearch(integers, shouldBeFound);
        System.out.println(format("Found by system method at an index: %d. Is equal: %b", toCheck, toCheck == atIndex));
    }
}
```
Được lấy từ tải khoản Github TheAlgorithms từ kho Java với [liên kết](https://github.com/TheAlgorithms/Java/tree/master/Searches)

Sau khi tái cấu trúc code:
```java
import java.util.*;
// Java implementation of recursive Binary Search
class BinarySearch {
    // Returns index of x if it is present in arr[l, r], else return -1
    int binarySearch(int arr[], int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, r, x);
        }

        // We reach here when element is not present
        // in array
        return -1;
    }

    // Driver method to test above
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int initSize = sc.nextInt();
        BinarySearch ob = new BinarySearch();
        int arr[] = new int[initSize];
        for (int i=0; i<initSize; i++) {
            arr[i] = sc.nextInt();
        }
        int n = arr.length;
        int x = 10;
        int result = ob.binarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }
}
```

Sau khi tái cấu trúc đoạn code thì các bài kiểm tra vẫn có thể vượt qua.

