package soal1;

import Model.Mahasiswa;

public class soal1 {
    public static void getsoal1() {
        StackQueue stack = new StackQueue(10);
        stack.push(new Mahasiswa("Riswanto", "22552011095", "TIF RM 22 A "));
        stack.push(new Mahasiswa("Aris", "22552011000", "TIF RM 22 B "));
        stack.push(new Mahasiswa("Wanto", "22552011001", "TIF RM 22 C "));

        stack.print();
        stack.peek();
        stack.pop();
        stack.print();
        stack.clear();
        stack.print();

        StackQueue queue = new StackQueue(10);
        queue.enqueue(new Mahasiswa("Riswanto", "22552011095", "TIF RM 22 A "));
        queue.enqueue(new Mahasiswa("Aris", "22552011000", "TIF RM 22 B "));
        queue.enqueue(new Mahasiswa("Wanto", "22552011001", "TIF RM 22 C "));

        queue.printQueue();
        queue.peekFront();
        queue.peekRear();
        queue.dequeue();
        queue.printQueue();
    }
}
