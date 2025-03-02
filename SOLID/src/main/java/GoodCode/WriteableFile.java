package GoodCode;

public class WriteableFile extends ReadableFile implements Writeable{

    @Override
    public void write() {
        System.out.println("Writing into file");
    }
}
