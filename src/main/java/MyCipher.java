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


}
