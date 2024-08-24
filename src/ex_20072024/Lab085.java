package ex_20072024;

public class Lab085 {
    public static void main(String[] args) {
        // JDK > 13
        char code = 'A';
        int val = switch (code) {
            case 'A':
                yield 65; // Yield is similar to return
                // return; We can't write like this because return is not supported here
            case 'B':
                yield 66;//// return
            default:
                throw new IllegalStateException("Unexpected value: " + code);
        };
        System.out.println(val);
    }
}

