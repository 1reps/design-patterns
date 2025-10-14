package behavioral.strategy.resolve.compress;

public class Main {

    public static void main(String[] args) {
        Compressor compressor = new Compressor();
        String data = "aabccccaaa";

        compressor.setCompressionStrategy(new RunLengthEncoding());
        System.out.println("RLE Compression: " + compressor.compress(data));

        compressor.setCompressionStrategy(new SimpleReplacementCompression());
        System.out.println("Simple Replacement: " + compressor.compress(data));
    }
}
