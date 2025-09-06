public class AppDeep {
    public void run() throws CloneNotSupportedException{
        try {
            ArrayDeepCopy a = new ArrayDeepCopy();
            System.out.println("ORIGINAL ARRAY: " + a);
            a.increment();
            System.out.println("ORIGINAL ARRAY AFTER INCREMENT: " + a);
            ArrayDeepCopy b = (ArrayDeepCopy) a.clone();
            System.out.println("COPY OF ORIGINAL ARRAY: " + b);
            b.increment();
            System.out.println("COPY AFTER INCREMENT: " + b);
            System.out.println("ORIGINAL : " + a);
            System.out.println("COPY: " + b);
            System.out.println("...THIS IS A DEEP COPY OF THE ARRAY...");
            System.out.println(".............");
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone Not Supported");
        }
    }
}
