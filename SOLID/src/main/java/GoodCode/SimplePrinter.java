package GoodCode;

public class SimplePrinter implements Printer{
    @Override
    public void print(Document doc) {
        System.out.println("Print document ...");
    }
}
