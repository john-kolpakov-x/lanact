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
  // COMMENT* CLASS id statement_do_done
  static boolean actFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "actFile")) return false;
    if (!nextTokenIs(b, "", CLASS, COMMENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = actFile_0(b, l + 1);
    r = r && consumeToken(b, CLASS);
    r = r && id(b, l + 1);
    r = r && statement_do_done(b, l + 1);
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
  // ASSIGN expr
  public static boolean assign_part(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assign_part")) return false;
    if (!nextTokenIs(b, ASSIGN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ASSIGN);
    r = r && expr(b, l + 1);
    exit_section_(b, m, ASSIGN_PART, r);
    return r;
  }

  /* ********************************************************** */
  // PAR_OPEN (expr (COMMA expr)* COMMA?)? PAR_CLOSE
  public static boolean cortege(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cortege")) return false;
    if (!nextTokenIs(b, PAR_OPEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PAR_OPEN);
    r = r && cortege_1(b, l + 1);
    r = r && consumeToken(b, PAR_CLOSE);
    exit_section_(b, m, CORTEGE, r);
    return r;
  }

  // (expr (COMMA expr)* COMMA?)?
  private static boolean cortege_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cortege_1")) return false;
    cortege_1_0(b, l + 1);
    return true;
  }

  // expr (COMMA expr)* COMMA?
  private static boolean cortege_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cortege_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1);
    r = r && cortege_1_0_1(b, l + 1);
    r = r && cortege_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA expr)*
  private static boolean cortege_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cortege_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!cortege_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "cortege_1_0_1", c)) break;
    }
    return true;
  }

  // COMMA expr
  private static boolean cortege_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cortege_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean cortege_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cortege_1_0_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // expr_mul
  static boolean expr(PsiBuilder b, int l) {
    return expr_mul(b, l + 1);
  }

  /* ********************************************************** */
  // expr_dot (op_mul expr_dot)*
  public static boolean expr_add(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_add")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR_ADD, "<expr add>");
    r = expr_dot(b, l + 1);
    r = r && expr_add_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (op_mul expr_dot)*
  private static boolean expr_add_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_add_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expr_add_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expr_add_1", c)) break;
    }
    return true;
  }

  // op_mul expr_dot
  private static boolean expr_add_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_add_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = op_mul(b, l + 1);
    r = r && expr_dot(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // id cortege?
  public static boolean expr_call(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_call")) return false;
    if (!nextTokenIs(b, WORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = id(b, l + 1);
    r = r && expr_call_1(b, l + 1);
    exit_section_(b, m, EXPR_CALL, r);
    return r;
  }

  // cortege?
  private static boolean expr_call_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_call_1")) return false;
    cortege(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // NUMBER | YES | NO | STR_CONST
  static boolean expr_const(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_const")) return false;
    boolean r;
    r = consumeToken(b, NUMBER);
    if (!r) r = consumeToken(b, YES);
    if (!r) r = consumeToken(b, NO);
    if (!r) r = consumeToken(b, STR_CONST);
    return r;
  }

  /* ********************************************************** */
  // expr_primary (DOT id cortege?)*
  public static boolean expr_dot(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_dot")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR_DOT, "<expr dot>");
    r = expr_primary(b, l + 1);
    r = r && expr_dot_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (DOT id cortege?)*
  private static boolean expr_dot_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_dot_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expr_dot_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expr_dot_1", c)) break;
    }
    return true;
  }

  // DOT id cortege?
  private static boolean expr_dot_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_dot_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT);
    r = r && id(b, l + 1);
    r = r && expr_dot_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // cortege?
  private static boolean expr_dot_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_dot_1_0_2")) return false;
    cortege(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // expr_add (op_add expr_add)*
  public static boolean expr_mul(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_mul")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR_MUL, "<expr mul>");
    r = expr_add(b, l + 1);
    r = r && expr_mul_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (op_add expr_add)*
  private static boolean expr_mul_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_mul_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expr_mul_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expr_mul_1", c)) break;
    }
    return true;
  }

  // op_add expr_add
  private static boolean expr_mul_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_mul_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = op_add(b, l + 1);
    r = r && expr_add(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // PAR_OPEN expr PAR_CLOSE
  public static boolean expr_paren(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_paren")) return false;
    if (!nextTokenIs(b, PAR_OPEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PAR_OPEN);
    r = r && expr(b, l + 1);
    r = r && consumeToken(b, PAR_CLOSE);
    exit_section_(b, m, EXPR_PAREN, r);
    return r;
  }

  /* ********************************************************** */
  // expr_call | expr_const | expr_square | expr_str | expr_paren
  static boolean expr_primary(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_primary")) return false;
    boolean r;
    r = expr_call(b, l + 1);
    if (!r) r = expr_const(b, l + 1);
    if (!r) r = expr_square(b, l + 1);
    if (!r) r = expr_str(b, l + 1);
    if (!r) r = expr_paren(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // SQ_OPEN expr SQ_CLOSE
  public static boolean expr_square(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_square")) return false;
    if (!nextTokenIs(b, SQ_OPEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SQ_OPEN);
    r = r && expr(b, l + 1);
    r = r && consumeToken(b, SQ_CLOSE);
    exit_section_(b, m, EXPR_SQUARE, r);
    return r;
  }

  /* ********************************************************** */
  // STR_LEFT expr (STR_INNER expr)* STR_RIGHT
  public static boolean expr_str(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_str")) return false;
    if (!nextTokenIs(b, STR_LEFT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STR_LEFT);
    r = r && expr(b, l + 1);
    r = r && expr_str_2(b, l + 1);
    r = r && consumeToken(b, STR_RIGHT);
    exit_section_(b, m, EXPR_STR, r);
    return r;
  }

  // (STR_INNER expr)*
  private static boolean expr_str_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_str_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expr_str_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expr_str_2", c)) break;
    }
    return true;
  }

  // STR_INNER expr
  private static boolean expr_str_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_str_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STR_INNER);
    r = r && expr(b, l + 1);
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
  // PLUS | MINUS
  static boolean op_add(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "op_add")) return false;
    if (!nextTokenIs(b, "", MINUS, PLUS)) return false;
    boolean r;
    r = consumeToken(b, PLUS);
    if (!r) r = consumeToken(b, MINUS);
    return r;
  }

  /* ********************************************************** */
  // MUL | DIV
  static boolean op_mul(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "op_mul")) return false;
    if (!nextTokenIs(b, "", DIV, MUL)) return false;
    boolean r;
    r = consumeToken(b, MUL);
    if (!r) r = consumeToken(b, DIV);
    return r;
  }

  /* ********************************************************** */
  // statement_expr | statement_if | statement_do_done
  public static boolean statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = statement_expr(b, l + 1);
    if (!r) r = statement_if(b, l + 1);
    if (!r) r = statement_do_done(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // DO statements DONE
  public static boolean statement_do_done(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_do_done")) return false;
    if (!nextTokenIs(b, DO)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DO);
    r = r && statements(b, l + 1);
    r = r && consumeToken(b, DONE);
    exit_section_(b, m, STATEMENT_DO_DONE, r);
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
  // ELSIF expr statements
  public static boolean statement_else_if(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_else_if")) return false;
    if (!nextTokenIs(b, ELSIF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELSIF);
    r = r && expr(b, l + 1);
    r = r && statements(b, l + 1);
    exit_section_(b, m, STATEMENT_ELSE_IF, r);
    return r;
  }

  /* ********************************************************** */
  // LET expr assign_part?
  public static boolean statement_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_expr")) return false;
    if (!nextTokenIs(b, LET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LET);
    r = r && expr(b, l + 1);
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
  // IF expr statements statement_else_if* statement_else? END IF
  public static boolean statement_if(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_if")) return false;
    if (!nextTokenIs(b, IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IF);
    r = r && expr(b, l + 1);
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
  static boolean statements(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statements")) return false;
    while (true) {
      int c = current_position_(b);
      if (!statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "statements", c)) break;
    }
    return true;
  }

}
