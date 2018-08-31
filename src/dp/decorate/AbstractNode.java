package dp.decorate;

public class AbstractNode implements Node{
    String text;

    @Override
    public String toHtml() {
        return null;
    }

    @Override
    public String toPlainTextString() {
        return null;
    }

    @Override
    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return text;
    }
}
