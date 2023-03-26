package java8.scaler;

public class StirngNum {
    public static void main(String[] args) {
        String text = "1234567899876543";
        //String text = "12345678998765ad";
        //String text = "12345678998765ad";
        //if (text.contains("[a-zA-Z]+") != true && text.length() == 16) {
        if (text.length() == 16 && text.matches("[0-9]+") != false) {
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}
