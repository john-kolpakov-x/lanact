package kz.pompei.lanact.gen.language;

import com.intellij.testFramework.ParsingTestCase;
import kz.pompei.lanact.parser.ActParserDefinition;

public class ActParsingTest extends ParsingTestCase {
  public ActParsingTest() {
    super("", "act", new ActParserDefinition());
  }

  public void testFirst() {
    doTest(true);
  }

  public void testPlus() {
    doTest(true);
  }

  @Override
  protected boolean skipSpaces() {
    return true;
  }

  @Override
  protected boolean includeRanges() {
    return true;
  }

  @Override
  protected String getTestDataPath() {
    return "src/test/testData";
  }
}
