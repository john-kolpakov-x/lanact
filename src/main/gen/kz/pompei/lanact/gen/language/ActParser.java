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
  // COMMENT* part_import* definition_top
  static boolean actFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "actFile")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = actFile_0(b, l + 1);
    r = r && actFile_1(b, l + 1);
    r = r && definition_top(b, l + 1);
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

  // part_import*
  private static boolean actFile_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "actFile_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!part_import(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "actFile_1", c)) break;
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
  // CLASS id definitions END CLASS
  public static boolean definition_class(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "definition_class")) return false;
    if (!nextTokenIs(b, CLASS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CLASS);
    r = r && id(b, l + 1);
    r = r && definitions(b, l + 1);
    r = r && consumeTokens(b, 0, END, CLASS);
    exit_section_(b, m, DEFINITION_CLASS, r);
    return r;
  }

  /* ********************************************************** */
  // FUN id statement_do_done?
  public static boolean definition_fun(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "definition_fun")) return false;
    if (!nextTokenIs(b, FUN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FUN);
    r = r && id(b, l + 1);
    r = r && definition_fun_2(b, l + 1);
    exit_section_(b, m, DEFINITION_FUN, r);
    return r;
  }

  // statement_do_done?
  private static boolean definition_fun_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "definition_fun_2")) return false;
    statement_do_done(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // INTERFACE id definitions END INTERFACE
  public static boolean definition_interface(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "definition_interface")) return false;
    if (!nextTokenIs(b, INTERFACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INTERFACE);
    r = r && id(b, l + 1);
    r = r && definitions(b, l + 1);
    r = r && consumeTokens(b, 0, END, INTERFACE);
    exit_section_(b, m, DEFINITION_INTERFACE, r);
    return r;
  }

  /* ********************************************************** */
  // definition_class | definition_interface
  static boolean definition_top(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "definition_top")) return false;
    if (!nextTokenIs(b, "", CLASS, INTERFACE)) return false;
    boolean r;
    r = definition_class(b, l + 1);
    if (!r) r = definition_interface(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // definition_fun
  public static boolean definitions(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "definitions")) return false;
    if (!nextTokenIs(b, FUN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = definition_fun(b, l + 1);
    exit_section_(b, m, DEFINITIONS, r);
    return r;
  }

  /* ********************************************************** */
  // part_catch+ part_finally?
  public static boolean do_done_last(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "do_done_last")) return false;
    if (!nextTokenIs(b, CATCH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = do_done_last_0(b, l + 1);
    r = r && do_done_last_1(b, l + 1);
    exit_section_(b, m, DO_DONE_LAST, r);
    return r;
  }

  // part_catch+
  private static boolean do_done_last_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "do_done_last_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = part_catch(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!part_catch(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "do_done_last_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // part_finally?
  private static boolean do_done_last_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "do_done_last_1")) return false;
    part_finally(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // expr_op2
  static boolean expr(PsiBuilder b, int l) {
    return expr_op2(b, l + 1);
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
  // NUMBER | YES | NO | NIL | STR_CONST
  static boolean expr_const(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_const")) return false;
    boolean r;
    r = consumeToken(b, NUMBER);
    if (!r) r = consumeToken(b, YES);
    if (!r) r = consumeToken(b, NO);
    if (!r) r = consumeToken(b, NIL);
    if (!r) r = consumeToken(b, STR_CONST);
    return r;
  }

  /* ********************************************************** */
  // expr_single (DOT id cortege?)*
  public static boolean expr_dot(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_dot")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR_DOT, "<expr dot>");
    r = expr_single(b, l + 1);
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
  // operation1? expr_dot
  static boolean expr_op1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_op1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr_op1_0(b, l + 1);
    r = r && expr_dot(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // operation1?
  private static boolean expr_op1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_op1_0")) return false;
    operation1(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // expr_op1 (operation2 expr_dot)*
  public static boolean expr_op2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_op2")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR_OP_2, "<expr op 2>");
    r = expr_op1(b, l + 1);
    r = r && expr_op2_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (operation2 expr_dot)*
  private static boolean expr_op2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_op2_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expr_op2_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expr_op2_1", c)) break;
    }
    return true;
  }

  // operation2 expr_dot
  private static boolean expr_op2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_op2_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = operation2(b, l + 1);
    r = r && expr_dot(b, l + 1);
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
  static boolean expr_single(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_single")) return false;
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
  // OP1 | OP12
  public static boolean operation1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operation1")) return false;
    if (!nextTokenIs(b, "<operation 1>", OP1, OP12)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPERATION_1, "<operation 1>");
    r = consumeToken(b, OP1);
    if (!r) r = consumeToken(b, OP12);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // OP2 | OP12
  public static boolean operation2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operation2")) return false;
    if (!nextTokenIs(b, "<operation 2>", OP12, OP2)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPERATION_2, "<operation 2>");
    r = consumeToken(b, OP2);
    if (!r) r = consumeToken(b, OP12);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // CATCH   statements
  public static boolean part_catch(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "part_catch")) return false;
    if (!nextTokenIs(b, CATCH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CATCH);
    r = r && statements(b, l + 1);
    exit_section_(b, m, PART_CATCH, r);
    return r;
  }

  /* ********************************************************** */
  // FINALLY statements
  public static boolean part_finally(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "part_finally")) return false;
    if (!nextTokenIs(b, FINALLY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FINALLY);
    r = r && statements(b, l + 1);
    exit_section_(b, m, PART_FINALLY, r);
    return r;
  }

  /* ********************************************************** */
  // IMPORT id ASSIGN expr
  public static boolean part_import(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "part_import")) return false;
    if (!nextTokenIs(b, IMPORT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IMPORT);
    r = r && id(b, l + 1);
    r = r && consumeToken(b, ASSIGN);
    r = r && expr(b, l + 1);
    exit_section_(b, m, PART_IMPORT, r);
    return r;
  }

  /* ********************************************************** */
  // statement_expr | statement_if | statement_do_done
  static boolean statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement")) return false;
    boolean r;
    r = statement_expr(b, l + 1);
    if (!r) r = statement_if(b, l + 1);
    if (!r) r = statement_do_done(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // DO statements do_done_last? DONE
  public static boolean statement_do_done(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_do_done")) return false;
    if (!nextTokenIs(b, DO)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DO);
    r = r && statements(b, l + 1);
    r = r && statement_do_done_2(b, l + 1);
    r = r && consumeToken(b, DONE);
    exit_section_(b, m, STATEMENT_DO_DONE, r);
    return r;
  }

  // do_done_last?
  private static boolean statement_do_done_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_do_done_2")) return false;
    do_done_last(b, l + 1);
    return true;
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
