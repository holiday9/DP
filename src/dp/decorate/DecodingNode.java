package dp.decorate;

/**
 * 解码node
 */
public class DecodingNode extends StringNode{

    public DecodingNode(String text) {
        setText(text);
    }

    public String toPlainTextString() {
        return Translate.decode(text);
    }

    public boolean isShouldDecode() {
        return true;
    }
}
