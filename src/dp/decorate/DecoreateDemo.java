package dp.decorate;

import org.junit.Assert;

import java.util.Iterator;

public class DecoreateDemo {
    public static void main(String args[]) {
        new DecoreateDemo().testDecodeingAmpersand();
    }

    public void testDecodeingAmpersand() {
        String ENCODED_WORKSHOP_TITLE = "The Testing &amp; Refactoring Workshop";

        String DECODE_WORKSHOP_TITLE = "The Testing & Refactoring Workshop";

        StringBuffer decodeContent = new StringBuffer();
        Parser parser = Parser.createParser(ENCODED_WORKSHOP_TITLE);
        // STEP 5 配置解析参数
        parser.setNodeDecoding(true);
        Iterator<Node> nodes = parser.elements();

        int i = 0;
        while (nodes.hasNext()) {
            String pre = i == 0 ? "" : " ";

            decodeContent.append(pre + nodes.next().toPlainTextString());

            i++;
        }

        Assert.assertEquals("ampersna in string", DECODE_WORKSHOP_TITLE
                , decodeContent.toString());
    }
}
