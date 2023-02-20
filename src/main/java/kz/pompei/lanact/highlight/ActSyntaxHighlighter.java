package kz.pompei.lanact.highlight;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import kz.pompei.lanact.gen.language.ActTokenTypes;
import kz.pompei.lanact.lexer.ActLexerAdapter;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class ActSyntaxHighlighter extends SyntaxHighlighterBase {

  //
  // Keys
  //

  public static final TextAttributesKey STRING        = createTextAttributesKey("ACT_STRING", DefaultLanguageHighlighterColors.STRING);
  public static final TextAttributesKey COMMENT       = createTextAttributesKey("ACT_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
  public static final TextAttributesKey BAD_CHARACTER = createTextAttributesKey("ACT_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);
  public static final TextAttributesKey OPERATION     = createTextAttributesKey("ACT_OP2", DefaultLanguageHighlighterColors.OPERATION_SIGN);

  public static final TextAttributesKey BRACKETS = createTextAttributesKey("ACT_BRACKETS", DefaultLanguageHighlighterColors.BRACKETS);
  public static final TextAttributesKey COMMA    = createTextAttributesKey("ACT_COMMA", DefaultLanguageHighlighterColors.COMMA);

  public static final TextAttributesKey NUMBER      = createTextAttributesKey("ACT_NUMBER", DefaultLanguageHighlighterColors.NUMBER);
  public static final TextAttributesKey DOT         = createTextAttributesKey("ACT_DOT", DefaultLanguageHighlighterColors.DOT);
  public static final TextAttributesKey KEYWORD     = createTextAttributesKey("ACT_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
  public static final TextAttributesKey PARENTHESES = createTextAttributesKey("ACT_PARENTHESES", DefaultLanguageHighlighterColors.PARENTHESES);
  public static final TextAttributesKey IDENTIFIER  = createTextAttributesKey("ACT_IDENTIFIER", DefaultLanguageHighlighterColors.IDENTIFIER);

  //
  // Keys Array
  //

  private static final TextAttributesKey[] STR_KEYS     = new TextAttributesKey[]{STRING};
  private static final TextAttributesKey[] BRACKET_KEYS = new TextAttributesKey[]{BRACKETS};
  private static final TextAttributesKey[] NUMBER_KEYS  = new TextAttributesKey[]{NUMBER};
  private static final TextAttributesKey[] COMMA_KEYS   = new TextAttributesKey[]{COMMA};

  private static final TextAttributesKey[] BAD_CHAR_KEYS    = new TextAttributesKey[]{BAD_CHARACTER};
  private static final TextAttributesKey[] OP_KEYS          = new TextAttributesKey[]{OPERATION};
  private static final TextAttributesKey[] DOT_KEYS         = new TextAttributesKey[]{DOT};
  private static final TextAttributesKey[] COMMENT_KEYS     = new TextAttributesKey[]{COMMENT};
  private static final TextAttributesKey[] KEYWORD_KEYS     = new TextAttributesKey[]{KEYWORD};
  private static final TextAttributesKey[] PARENTHESES_KEYS = new TextAttributesKey[]{PARENTHESES};
  private static final TextAttributesKey[] IDENTIFIER_KEYS  = new TextAttributesKey[]{IDENTIFIER};

  private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

  @NotNull
  @Override
  public Lexer getHighlightingLexer() {
    return new ActLexerAdapter();
  }

  @SuppressWarnings("DuplicateCondition")
  @Override
  public TextAttributesKey @NotNull [] getTokenHighlights(IElementType tokenType) {
    if (false
      || tokenType.equals(ActTokenTypes.STR_CONST)
      || tokenType.equals(ActTokenTypes.STR_LEFT)
      || tokenType.equals(ActTokenTypes.STR_RIGHT)
      || tokenType.equals(ActTokenTypes.STR_INNER)
    ) {
      return STR_KEYS;
    }

    if (false
      || tokenType.equals(ActTokenTypes.OP1)
      || tokenType.equals(ActTokenTypes.OP2)
      || tokenType.equals(ActTokenTypes.OP12)
      || tokenType.equals(ActTokenTypes.QUESTION)
      || tokenType.equals(ActTokenTypes.PIPE)
      || tokenType.equals(ActTokenTypes.COLON)
      || tokenType.equals(ActTokenTypes.COLON2)
    ) {
      return OP_KEYS;
    }
    if (tokenType.equals(ActTokenTypes.COMMENT)) {
      return COMMENT_KEYS;
    }
    if (false
      || tokenType.equals(ActTokenTypes.SQ_OPEN)
      || tokenType.equals(ActTokenTypes.SQ_CLOSE)
    ) {
      return BRACKET_KEYS;
    }
    if (false
      || tokenType.equals(ActTokenTypes.NUMBER)
    ) {
      return NUMBER_KEYS;
    }
    if (false
      || tokenType.equals(ActTokenTypes.COMMA)
    ) {
      return COMMA_KEYS;
    }
    if (false
      || tokenType.equals(ActTokenTypes.DOT)
    ) {
      return DOT_KEYS;
    }
    if (false
      || tokenType.equals(ActTokenTypes.ID)
    ) {
      return IDENTIFIER_KEYS;
    }
    if (false
      || tokenType.equals(ActTokenTypes.LET)
      || tokenType.equals(ActTokenTypes.DO)
      || tokenType.equals(ActTokenTypes.DONE)
      || tokenType.equals(ActTokenTypes.OPERATOR)
      || tokenType.equals(ActTokenTypes.RET)
      || tokenType.equals(ActTokenTypes.FUN)
      || tokenType.equals(ActTokenTypes.CLASS)
      || tokenType.equals(ActTokenTypes.INTERFACE)
      || tokenType.equals(ActTokenTypes.IMPORT)
      || tokenType.equals(ActTokenTypes.ASSIGN)
      || tokenType.equals(ActTokenTypes.RIGHT_ARROW)
      || tokenType.equals(ActTokenTypes.CATCH)
      || tokenType.equals(ActTokenTypes.FINALLY)
      || tokenType.equals(ActTokenTypes.END)
      || tokenType.equals(ActTokenTypes.IF)
      || tokenType.equals(ActTokenTypes.ELSIF)
      || tokenType.equals(ActTokenTypes.ELSE)
      || tokenType.equals(ActTokenTypes.DOG)
    ) {
      return KEYWORD_KEYS;
    }
    if (false
      || tokenType.equals(ActTokenTypes.PAR_OPEN)
      || tokenType.equals(ActTokenTypes.PAR_CLOSE)
    ) {
      return PARENTHESES_KEYS;
    }
    if (tokenType.equals(TokenType.BAD_CHARACTER)) {
      return BAD_CHAR_KEYS;
    }
    return EMPTY_KEYS;
  }

}
