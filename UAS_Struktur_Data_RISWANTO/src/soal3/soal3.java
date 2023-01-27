package soal3;

public class soal3 {
    public static void getsoal3() {

        Tree tree = new Tree();

        System.out.println("Memasukan value: 10, 17, 15, 12, 19, 21, 13, 14, 16");
        tree.insert(10);
        tree.insert(17);
        tree.insert(15);
        tree.insert(12);
        tree.insert(19);
        tree.insert(21);
        tree.insert(13);
        tree.insert(14);
        tree.insert(16);


        // get size
        System.out.println("\nSize: " + tree.size());


        // traversal in order
        System.out.println("\nMelakukan traversal in order ");
        tree.traverseInOrder();

        // get max
        System.out.println("\nMax: " + tree.max());

    }
}
