package study.list;

public class BatchProcessorMain {

    public static void main(String[] args) {
        //MyArrayList<Integer> study.list = new MyArrayList<>();
        MyLinkedList<Integer> list = new MyLinkedList<>();

        BatchProcessor processor = new BatchProcessor(list);
        processor.logic(50_000);
    }
}