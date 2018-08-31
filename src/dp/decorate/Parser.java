package dp.decorate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Parser {
    List<Node> nodes = new ArrayList<>();
    private boolean shouldDecodeNodes;
    private final String stringToDecode;

    public Parser(String stringToDecode) {
        this.stringToDecode = stringToDecode;
    }

    public static Parser createParser(String string) {
        return new StringParser(string);
    }

    public Iterator<Node> elements() {
        String[] nodeTexts = stringToDecode.split(" ");

        for (String nodeText : nodeTexts) {
            Node node = null;
            if (nodeText.contains(">") || nodeText.contains("<")) {
                node = new Tag(nodeText);
            } else {
                node = StringNode.createStringNode(nodeText, shouldDecodeNodes);
            }

            if (node!= null) {
                nodes.add(node);
            }
        }

        return nodes.iterator();
    }

    public void setNodeDecoding(boolean shouldDecodeNodes) {
        this.shouldDecodeNodes = shouldDecodeNodes;
    }

    public boolean shouldDecodeNodes() {
        return shouldDecodeNodes;
    }

    // STEP 4 加入回车解析配置参数
}
