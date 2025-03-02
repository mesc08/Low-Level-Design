package BadCode;

public class ClientCode {

    public static void main(String[] args){
        File file = new ReadOnlyFile();
        file.read();
        file.write();
    }

}
