package dp.decorate;

/**
 * 编码、解码转换器
 */

public class Translate {
    public static String decode(String stringToDecode) {
        if (stringToDecode == null) {
            return null;
        }

        if (stringToDecode.contains("&amp;")) {
            return stringToDecode.replaceAll("&amp;", "&");
        } else {
            return stringToDecode;
        }
    }
}
