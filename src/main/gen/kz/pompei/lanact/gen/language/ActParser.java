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
  // class
  static boolean actFile(PsiBuilder b, int l) {
    return class_$(b, l + 1);
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
  // 'class' name_ DO DONE
  public static boolean class_$(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_$")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLASS, "<class $>");
    r = consumeToken(b, "class");
    r = r && name_(b, l + 1);
    r = r && consumeTokens(b, 0, DO, DONE);
    exit_section_(b, l, m, r, false, null);
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

  /* ********************************************************** */
  // WORD (WORD|NUMBER)*
  public static boolean name_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "name_")) return false;
    if (!nextTokenIs(b, WORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WORD);
    r = r && name__1(b, l + 1);
    exit_section_(b, m, NAME_, r);
    return r;
  }

  // (WORD|NUMBER)*
  private static boolean name__1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "name__1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!name__1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "name__1", c)) break;
    }
    return true;
  }

  // WORD|NUMBER
  private static boolean name__1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "name__1_0")) return false;
    boolean r;
    r = consumeToken(b, WORD);
    if (!r) r = consumeToken(b, NUMBER);
    return r;
  }

}
