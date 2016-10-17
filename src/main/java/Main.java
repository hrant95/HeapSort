/**
 * Created by hrant95 on 10/17/16.
 */
public class Main {

    private static int[] arr = {40, 25, 60, 1, 100, 10, 20, 45, 17, 1000, 128, 354, 189, 7, 18, 3, 1, 50, 30};
    private static int lastNode;
    private static int startNode;

    public static void main(String[] args) {

        lastNode = arr.length - 1;
        startNode = lastNode / 2;

        while (true) {
            if (lastNode == 0) break;
            sort(startNode);
        }

        for (int i = 1; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void sort(int rootNode) {
        int minValIndex = 2 * rootNode;
        if ((2 * rootNode + 1) <= lastNode) {
            if (arr[2 * rootNode + 1] > arr[minValIndex]) {
                minValIndex = 2 * rootNode + 1;
            }
        }
        if (arr[rootNode] < arr[minValIndex]) {
            swipe(rootNode, minValIndex);
        }

        if (rootNode == 0) {
            swipe(rootNode, lastNode);
            lastNode--;
            startNode = lastNode / 2;
        } else {
            startNode--;
        }
    }

    private static void swipe(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
