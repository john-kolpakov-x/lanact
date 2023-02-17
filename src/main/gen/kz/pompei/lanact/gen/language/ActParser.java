// This is a generated file. Not intended for manual editing.
package kz.pompei.lanact.gen.language;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static kz.pompei.lanact.gen.language.ActTokenTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class ActParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return actFile(b, l + 1);
  }

  /* ********************************************************** */
  // item_ all
  static boolean actFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "actFile")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = item_(b, l + 1);
    r = r && all(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // WHITE_SPACE WORD SIGN DOT KEYWORD KEYWORD_STARTER NUMBER IF ELSIF ELSE FI PARENTHESIS_OPEN PARENTHESIS_CLOSE SQUARE_OPEN SQUARE_CLOSE DO DONE
  static boolean all(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "all")) return false;
    if (!nextTokenIs(b, WHITE_SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, WHITE_SPACE, WORD, SIGN, DOT, KEYWORD, KEYWORD_STARTER, NUMBER, IF, ELSIF, ELSE, FI, PARENTHESIS_OPEN, PARENTHESIS_CLOSE, SQUARE_OPEN, SQUARE_CLOSE, DO, DONE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // all|COMMENT|CRLF|ASD
  static boolean item_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "item_")) return false;
    boolean r;
    r = all(b, l + 1);
    if (!r) r = consumeToken(b, COMMENT);
    if (!r) r = consumeToken(b, CRLF);
    if (!r) r = consumeToken(b, ASD);
    return r;
  }

}
