package kz.pompei.lanact.lexer;

import com.intellij.lexer.FlexAdapter;
import kz.pompei.lanact.gen.language.ActLexer;

public class ActLexerAdapter extends FlexAdapter {
  public ActLexerAdapter() {
    super(new ActLexer(null));
  }
}
