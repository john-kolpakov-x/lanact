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
  // COMMENT* CLASS id DO statements DONE
  static boolean actFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "actFile")) return false;
    if (!nextTokenIs(b, "", CLASS, COMMENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = actFile_0(b, l + 1);
    r = r && consumeToken(b, CLASS);
    r = r && id(b, l + 1);
    r = r && consumeToken(b, DO);
    r = r && statements(b, l + 1);
    r = r && consumeToken(b, DONE);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMENT*
  private static boolean actFile_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "actFile_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, COMMENT)) break;
      if (!empty_element_parsed_guard_(b, "actFile_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // ASSIGN expression
  public static boolean assign_part(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assign_part")) return false;
    if (!nextTokenIs(b, ASSIGN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ASSIGN);
    r = r && expression(b, l + 1);
    exit_section_(b, m, ASSIGN_PART, r);
    return r;
  }

  /* ********************************************************** */
  // id | expression_const | PAR_OPEN expression PAR_CLOSE | expression_sq | expression_str
  public static boolean expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION, "<expression>");
    r = id(b, l + 1);
    if (!r) r = expression_const(b, l + 1);
    if (!r) r = expression_2(b, l + 1);
    if (!r) r = expression_sq(b, l + 1);
    if (!r) r = expression_str(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // PAR_OPEN expression PAR_CLOSE
  private static boolean expression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PAR_OPEN);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, PAR_CLOSE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // NUMBER | YES | NO | STR_FULL
  public static boolean expression_const(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_const")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION_CONST, "<expression const>");
    r = consumeToken(b, NUMBER);
    if (!r) r = consumeToken(b, YES);
    if (!r) r = consumeToken(b, NO);
    if (!r) r = consumeToken(b, STR_FULL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // SQ_OPEN expression SQ_CLOSE
  public static boolean expression_sq(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_sq")) return false;
    if (!nextTokenIs(b, SQ_OPEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SQ_OPEN);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, SQ_CLOSE);
    exit_section_(b, m, EXPRESSION_SQ, r);
    return r;
  }

  /* ********************************************************** */
  // STR_OPEN expression (STR_INNER expression)* STR_CLOSE
  public static boolean expression_str(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_str")) return false;
    if (!nextTokenIs(b, STR_OPEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STR_OPEN);
    r = r && expression(b, l + 1);
    r = r && expression_str_2(b, l + 1);
    r = r && consumeToken(b, STR_CLOSE);
    exit_section_(b, m, EXPRESSION_STR, r);
    return r;
  }

  // (STR_INNER expression)*
  private static boolean expression_str_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_str_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expression_str_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expression_str_2", c)) break;
    }
    return true;
  }

  // STR_INNER expression
  private static boolean expression_str_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_str_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STR_INNER);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // WORD (WORD|NUMBER)*
  public static boolean id(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "id")) return false;
    if (!nextTokenIs(b, WORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WORD);
    r = r && id_1(b, l + 1);
    exit_section_(b, m, ID, r);
    return r;
  }

  // (WORD|NUMBER)*
  private static boolean id_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "id_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!id_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "id_1", c)) break;
    }
    return true;
  }

  // WORD|NUMBER
  private static boolean id_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "id_1_0")) return false;
    boolean r;
    r = consumeToken(b, WORD);
    if (!r) r = consumeToken(b, NUMBER);
    return r;
  }

  /* ********************************************************** */
  // statement_expr | statement_if | DO statements DONE
  public static boolean statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = statement_expr(b, l + 1);
    if (!r) r = statement_if(b, l + 1);
    if (!r) r = statement_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // DO statements DONE
  private static boolean statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DO);
    r = r && statements(b, l + 1);
    r = r && consumeToken(b, DONE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ELSE statements
  public static boolean statement_else(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_else")) return false;
    if (!nextTokenIs(b, ELSE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELSE);
    r = r && statements(b, l + 1);
    exit_section_(b, m, STATEMENT_ELSE, r);
    return r;
  }

  /* ********************************************************** */
  // ELSIF expression statements
  public static boolean statement_else_if(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_else_if")) return false;
    if (!nextTokenIs(b, ELSIF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELSIF);
    r = r && expression(b, l + 1);
    r = r && statements(b, l + 1);
    exit_section_(b, m, STATEMENT_ELSE_IF, r);
    return r;
  }

  /* ********************************************************** */
  // LET expression assign_part?
  public static boolean statement_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_expr")) return false;
    if (!nextTokenIs(b, LET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LET);
    r = r && expression(b, l + 1);
    r = r && statement_expr_2(b, l + 1);
    exit_section_(b, m, STATEMENT_EXPR, r);
    return r;
  }

  // assign_part?
  private static boolean statement_expr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_expr_2")) return false;
    assign_part(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // IF expression statements statement_else_if* statement_else? END IF
  public static boolean statement_if(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_if")) return false;
    if (!nextTokenIs(b, IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IF);
    r = r && expression(b, l + 1);
    r = r && statements(b, l + 1);
    r = r && statement_if_3(b, l + 1);
    r = r && statement_if_4(b, l + 1);
    r = r && consumeTokens(b, 0, END, IF);
    exit_section_(b, m, STATEMENT_IF, r);
    return r;
  }

  // statement_else_if*
  private static boolean statement_if_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_if_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!statement_else_if(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "statement_if_3", c)) break;
    }
    return true;
  }

  // statement_else?
  private static boolean statement_if_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_if_4")) return false;
    statement_else(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // statement*
  public static boolean statements(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statements")) return false;
    Marker m = enter_section_(b, l, _NONE_, STATEMENTS, "<statements>");
    while (true) {
      int c = current_position_(b);
      if (!statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "statements", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

}
