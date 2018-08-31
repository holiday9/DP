package dp.decorate;

public class StringNode extends AbstractNode {
    public StringNode() {}

    // STEP 1 加入回车解析控制参数
    private StringNode(String text) {
        this.text = text;
    }

    public static Node createStringNode(String text, boolean shouldDecode) {
        if (shouldDecode) {
            return new DecodingNode(new StringNode(text));
        }
        return new StringNode(text);
    }

    public String toPlainTextString() {
        return text;
    }

    public boolean isShouldDecode() {
        return false;
    }
}
