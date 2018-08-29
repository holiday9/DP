package dp.decorate;

public class StringNode extends AbstractNode {
    String text;
    private boolean shouldDecode;

    // STEP 1 加入回车解析控制参数
    public StringNode(String text, boolean shouldDecode) {
        this.text = text;
        this.shouldDecode = shouldDecode;
    }

    public String toPlainTextString() {
        String result = text;
        if (shouldDecode)
            result = Translate.decode(result);

        // STEP 2 执行回车转义

        return result;
    }
}
