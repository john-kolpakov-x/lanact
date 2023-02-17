package kz.pompei.lanact.gen.language;

import com.intellij.psi.tree.IElementType;
import java.io.IOException;
import kz.pompei.lanact.lexer.ActElementStr;
import org.junit.Test;

public class ActLexerTest {

  private static String toLen(int len, Object x) {
    String ret = "" + x;
    while (ret.length() < len) {
      //noinspection StringConcatenationInLoop
      ret = " " + ret;
    }
    return ret;
  }

  @Test
  public void advance() throws IOException {
    ActLexer lexer = new ActLexer(null);

    String s = ""
      + "import Int32 <- ROOT.kz.pompei.act.core.types.Signed Integer 32 bits\n"
      + "import Int64 <- ROOT.kz.pompei.act.core.types.Signed Integer 64 bits\n"
      + "import Text  <- ROOT.kz.pompei.act.core.types.Text\n"
      + "import Bool  <- ROOT.kz.pompei.act.core.types.Boolean\n"
      + "import Impl  <- ROOT.kz.pompei.act.core.annotations.Implements Interface\n"
      + "import Nullable   <- ROOT.kz.pompei.act.core.annotations.Nullable Type\n"
      + "import Override   <- ROOT.kz.pompei.act.core.annotations.Override Method\n"
      + "import Comparable <- ROOT.kz.pompei.act.core.interfaces.Comparable\n"
      + "\n"
      + "class Hello World @Impl(Comparable[Hello World])\n"
      + "  @Shortcut(HW)\n"
      + "  @Shortcut(HiWorld)\n"
      + "struct\n"
      + "  hello: Int32 <- 78_000\n"
      + "  world: Int64 <- 100\n"
      + "  message: Text <- {Hello World 9zu81tRrbF}\n"
      + "do\n"
      + "  operator=(__o__: ^Me @Nullable): Bool @Override\n"
      + "  do\n"
      + "    if __o__ = nil ret no fi\n"
      + "    ret hello = __o__.hello and world = __o__.world and message = __o__.message\n"
      + "  done\n"
      + "done\n";


    lexer.reset(s, 0, s.length(), ActLexer.YYINITIAL);

    for (int i = 0; ; i++) {
      IElementType advance = lexer.advance();

      if (advance == null) {
        break;
      }

      if (ActTokenTypes.WHITE_SPACE.equals(advance)) {
        continue;
      }

      System.out.println("37Gc1wPu7F " + toLen(3, i) + " :: " + toLen(20, advance)
                           + " :: " + toLen(3, lexer.getTokenStart())
                           + "..." + toLen(3, lexer.getTokenEnd())
                           + " : " + advanceStr2(advance, lexer.yytext()));
    }
  }

  private static CharSequence advanceStr2(IElementType advance, CharSequence defaultText) {
    if (advance instanceof ActElementStr) {
      return "`" + ((ActElementStr) advance).content + "`";
    }
    return defaultText;
  }

  @Test
  public void advance_curly() throws IOException {
    ActLexer lexer = new ActLexer(null);

    String s = ""
      + " let x <- {Hello World} "
      + " let y <- {Town {  x  } down}"
      + " let z <- {Sequence from {  x  } to { y } and the end}"
      //
      ;

    lexer.reset(s, 0, s.length(), ActLexer.YYINITIAL);

    for (int i = 0; ; i++) {
      IElementType advance = lexer.advance();

      if (advance == null) {
        System.out.println("8u2vW5dyOp :: lexer.str = " + lexer.str);
        break;
      }

      if (ActTokenTypes.WHITE_SPACE.equals(advance)) {
        continue;
      }

      System.out.println("37Gc1wPu7F " + toLen(3, i) + " :: " + toLen(20, advance)
                           + " :: " + toLen(3, lexer.getTokenStart())
                           + "..." + toLen(3, lexer.getTokenEnd())
                           + " : " + advanceStr2(advance, lexer.yytext()));
    }
  }

}
