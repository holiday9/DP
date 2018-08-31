package dp.decorate;

/**
 * 解码node
 */
public class DecodingNode implements Node{
    private Node delegate;

    public DecodingNode(String text) {
        delegate = new StringNode();

        setText(text);
    }

    @Override
    public String toHtml() {
        return delegate.toHtml();
    }

    public String toPlainTextString() {
        return Translate.decode(delegate.toPlainTextString());
    }

    @Override
    public void setText(String text) {
        delegate.setText(text);
    }

    @Override
    public String getText() {
        return delegate.getText();
    }

    public boolean isShouldDecode() {
        return true;
    }
}
