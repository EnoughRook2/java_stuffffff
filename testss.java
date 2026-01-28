import java.util.Scanner;

class Mixer {
    int arr[];

    // Constructor to initialize array size
    Mixer(int n) {
        arr = new int[n];
    }

    // Method to accept elements in ascending order without duplicates
    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + arr.length + " sorted elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
           
            
        }
    }

    // Merges current object's array with another Mixer object's array
    Mixer mix(Mixer A) {
        int n1 = this.arr.length;
        int n2 = A.arr.length;
        
        // Resultant size could be n1 + n2 (assuming no overlaps)
        Mixer result = new Mixer(n1 + n2);
        
        int i = 0, j = 0, k = 0;

        // Standard merge algorithm for two sorted arrays
        while (i < n1 && j < n2) {
            if (this.arr[i] < A.arr[j]) {
                result.arr[k++] = this.arr[i++];
            } else if (this.arr[i] > A.arr[j]) {
                result.arr[k++] = A.arr[j++];
            } else {
                // If elements are equal, take one and skip both (to avoid duplicates)
                result.arr[k++] = this.arr[i++];
                j++;
            }
        }

        // Copy remaining elements
        while (i < n1) result.arr[k++] = this.arr[i++];
        while (j < n2) result.arr[k++] = A.arr[j++];

        // Trim the array if k is smaller than n1 + n2 (due to duplicates)

        return result;
    }

    void display() {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        Mixer obj1 = new Mixer(sc.nextInt());
        obj1.accept();

        System.out.print("Enter size of second array: ");
        Mixer obj2 = new Mixer(sc.nextInt());
        obj2.accept();

        Mixer mergedObj = obj1.mix(obj2);

        System.out.println("\nArray 1:");
        obj1.display();
        System.out.println("Array 2:");
        obj2.display();
        System.out.println("Merged Array:");
        mergedObj.display();
    }
}