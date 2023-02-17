package kz.pompei.lanact.lexer;

import com.intellij.psi.tree.IElementType;

public interface ActLexerTypes {

  IElementType WHITE_SPACE     = new ActElementType("WHITE_SPACE");
  IElementType WORD            = new ActElementType("WORD");
  IElementType SIGN            = new ActElementType("SIGN");
  IElementType DOT             = new ActElementType("DOT");
  IElementType KEYWORD         = new ActElementType("KEYWORD");
  IElementType KEYWORD_STARTER = new ActElementType("KEYWORD_STARTER");
  IElementType NUMBER          = new ActElementType("NUMBER");

  IElementType IF    = new ActElementType("IF");
  IElementType ELSIF = new ActElementType("ELSIF");
  IElementType ELSE  = new ActElementType("ELSE");
  IElementType FI    = new ActElementType("FI");

  IElementType PARENTHESIS_OPEN  = new ActElementType("PARENTHESIS_OPEN");
  IElementType PARENTHESIS_CLOSE = new ActElementType("PARENTHESIS_CLOSE");
  IElementType SQUARE_OPEN       = new ActElementType("SQUARE_OPEN");
  IElementType SQUARE_CLOSE      = new ActElementType("SQUARE_CLOSE");

  IElementType DO   = new ActElementType("DO");
  IElementType DONE = new ActElementType("DONE");

}
