public class AppShallow {
    public void run() throws CloneNotSupportedException {
        ArrayShallowCopy c = new ArrayShallowCopy();
        System.out.println("ORIGINAL ARRAY: " + c);
        c.increment();
        System.out.println("ORIGINAL ARRAY AFTER INCREMENT: " + c);
        ArrayShallowCopy d = (ArrayShallowCopy) c.clone();
        System.out.println("COPY OF THE ORIGINAL ARRAY: " + d);
        d.increment();
        System.out.println("COPY AFTER INCREMENT: " + d);
        System.out.println("ORIGINAL: " + c);
        System.out.println("COPY: " + d);
        System.out.println("THIS IS A SHALLOW COPY");
        System.out.println("...........");
    }
}
