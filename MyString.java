public class MyString implements java.lang.CharSequence {

    private String x;

    public MyString(String a){
        x = a;
    }

    @Override
    public char charAt(int index) {        
        return x.charAt(index);
    }

    @Override
    public int length() {
        return x.length();
    }

    @Override
    public CharSequence subSequence(int arg0, int arg1) {
        return x.subSequence(arg0, arg1);
    }
    

    @Override
    public String toString(){
        String y = new String();
        for (int i=x.length()-1; i>=0; i--){
            y = y + x.charAt(i);
        }
        return y;
    }

    public static void main(String[] args) {

        MyString test = new MyString("Esto es una prueba");
        System.out.println(test.charAt(0)); //E
        System.out.println(test.length()); //18
        System.out.println(test.subSequence(3,6)); //o e
        System.out.println(test.toString()); //al reves
    }

}