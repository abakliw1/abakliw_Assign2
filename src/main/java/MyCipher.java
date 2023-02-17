import java.io.*;
public class MyCipher {
    public int compute(String str){
        String[] val= str.split(" ");
        switch (val[0]){
            case "+": return Integer.valueOf(val[1])+Integer.valueOf(val[2]);
            case "-": return Integer.valueOf(val[1])-Integer.valueOf(val[2]);
            case "*": return Integer.valueOf(val[1])*Integer.valueOf(val[2]);
            case "/": return Integer.valueOf(val[1])/Integer.valueOf(val[2]);
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        MyCipher c=new MyCipher();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String st= br.readLine();
        System.out.println(c.compute(st));
    }

}
