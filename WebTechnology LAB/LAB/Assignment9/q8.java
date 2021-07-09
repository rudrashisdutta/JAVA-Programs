package WebTechJAVA.LAB.Assignment9;

import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        int limitForStack1;
        System.out.print("Enter the limit for your stack: ");
        limitForStack1 = Stack.scanner.nextInt();
        Stack stack1 = new Stack(limitForStack1);
        stack1.menu();
        System.out.println("EXITED!");
        Stack.scanner.close();
    }
}

class Stack {
    static Scanner scanner = new Scanner(System.in);
    private int limit, available;
    private int[] stack;
    private final static int PUSHED = 1;
    private final static int POPPED = 0;

    Stack(int limit) {
        this.limit = limit;
        stack = new int[this.limit];
    }

    private void push() {
        try {
            if (available == limit) {
                throw new StackStorageOutOfRange(limit, PUSHED);
            }
            System.out.print("Enter the number to be pushed: ");
            stack[available++] = scanner.nextInt();
        } catch (StackStorageOutOfRange stackStorageOutOfRange) {
            stackStorageOutOfRange.printStackTrace();
        }
    }

    private void pop() {
        try {
            if (available == 0) {
                throw new StackStorageOutOfRange(limit, POPPED);
            }
            stack[--available] = 0;
        } catch (StackStorageOutOfRange stackStorageOutOfRange) {
            stackStorageOutOfRange.printStackTrace();
        }
    }

    private void showStack() {
        System.out.println("\n\n");
        if (available == 0) {
            System.out.println("No element is present in the stack!");
        } else {
            System.out.print("The Elements in the stack are:  ");
            for (int i = 0; i < available; i++) {
                System.out.print(stack[i] + "  ");
            }
            System.out.println("\n\n");
        }
    }

    public void menu() {
        int choice;
        while (true) {
            System.out.print("\n\nLimit: " + limit + "\nAvailable elements: " + available
                    + "\nPRESS:\n1: PUSH\n2: POP\n3: Show Elements in stack\n4: EXIT\n\nYOUR CHOICE: ");
            choice = scanner.nextInt();
            if (choice == 1) {
                push();
            } else if (choice == 2) {
                pop();
            } else if (choice == 3) {
                showStack();
            } else if (choice == 4) {
                System.out.println("\n\nEXIT FUNCTION ON INITIATION!");
                break;
            } else {
                System.out.println("\n\nTHIS IS A WRONG CHOICE!\nCHOOSE AGAIN!\n\n\n");
            }

        }
    }
}

class StackStorageOutOfRange extends Exception {
    private static final long serialVersionUID = 1L;
    int limit, version;

    StackStorageOutOfRange(int limit, int version) {
        this.limit = limit;
        this.version = version;
    }

    public void printStackTrace() {
        if (version == 0) {
            System.out.println("\n\nPop function could not process!\nThere are 0 elements in the stack!");
        } else if (version == 1) {
            System.out.println("\n\nNo new element can be pushed in the stack!\nThere are " + limit
                    + " elements present in the stack! That is the maximum limit!");
        }
    }
}