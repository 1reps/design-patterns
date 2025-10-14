package behavioral.strategy.before.compress;

public class Compressor {

    public String compress(String data, String type) {
        if ("RLE".equals(type)) {
            StringBuilder sb = new StringBuilder();
            int n = data.length();
            for (int i = 0; i < n; ) {
                char c = data.charAt(i);
                int j = i;
                while (j < n && data.charAt(j) == c) j++;
                sb.append(c).append(j - i);
                i = j;
            }
            return sb.toString();
        } else if ("REPLACE".equals(type)) {
            return data.replace("aa", "A").replace("bb", "B");
        }
        return data; // no-op
    }
}

