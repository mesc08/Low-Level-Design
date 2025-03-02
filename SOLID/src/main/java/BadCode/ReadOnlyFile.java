package BadCode;

public class ReadOnlyFile extends File{

    public void write(){
        throw new UnsupportedOperationException("Cant write to read only file");
    }
}
