package behavioral.strategy.problem.compress;

public class Main {

    public static void main(String[] args) {
        Compressor c = new Compressor();
        System.out.println(c.compress("aaab", "RLE"));
        System.out.println(c.compress("aabb", "REPLACE"));
    }
}
