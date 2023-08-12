package org.instrong.Utils;

public class RiotUtils {

    public static String toRiotId(String username, String tag) {
        return toUrlEncoded(username) + "#" + tag;
    }

    public static String toUrlEncoded(String line) {
        return line.replaceAll(" ", "%20");
    }
}
