public class Main {
    public static void main(String[] args) {
        MyList<Integer> list = new MyArrayList<>();
        list.add(10);
        list.add(5);
        list.add(20);

        System.out.println("ArrayList size: " + list.size());
        System.out.println("First element: " + list.getFirst());

        list.sort();
        System.out.println("After sort, first element: " + list.getFirst());

        MyList<String> names = new MyLinkedList<>();
        names.add("Almaty");
        names.add("Astana");
        System.out.println("LinkedList size: " + names.size());
    }
}