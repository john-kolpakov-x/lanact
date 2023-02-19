// This is a generated file. Not intended for manual editing.
package kz.pompei.lanact.gen.language;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import kz.pompei.lanact.parser.ActElementType;
import kz.pompei.lanact.parser.ActTokenType;
import kz.pompei.lanact.gen.language.impl.*;

public interface ActTokenTypes {

  IElementType ASSIGN_PART = new ActElementType("ASSIGN_PART");
  IElementType CORTEGE = new ActElementType("CORTEGE");
  IElementType EXPR_ADD = new ActElementType("EXPR_ADD");
  IElementType EXPR_CALL = new ActElementType("EXPR_CALL");
  IElementType EXPR_DOT = new ActElementType("EXPR_DOT");
  IElementType EXPR_MUL = new ActElementType("EXPR_MUL");
  IElementType EXPR_PAREN = new ActElementType("EXPR_PAREN");
  IElementType EXPR_SQUARE = new ActElementType("EXPR_SQUARE");
  IElementType EXPR_STR = new ActElementType("EXPR_STR");
  IElementType ID = new ActElementType("ID");
  IElementType STATEMENT = new ActElementType("STATEMENT");
  IElementType STATEMENT_DO_DONE = new ActElementType("STATEMENT_DO_DONE");
  IElementType STATEMENT_ELSE = new ActElementType("STATEMENT_ELSE");
  IElementType STATEMENT_ELSE_IF = new ActElementType("STATEMENT_ELSE_IF");
  IElementType STATEMENT_EXPR = new ActElementType("STATEMENT_EXPR");
  IElementType STATEMENT_IF = new ActElementType("STATEMENT_IF");

  IElementType ASSIGN = new ActTokenType("ASSIGN");
  IElementType CLASS = new ActTokenType("CLASS");
  IElementType COMMA = new ActTokenType("COMMA");
  IElementType COMMENT = new ActTokenType("COMMENT");
  IElementType DIV = new ActTokenType("DIV");
  IElementType DO = new ActTokenType("DO");
  IElementType DONE = new ActTokenType("DONE");
  IElementType DOT = new ActTokenType("DOT");
  IElementType ELSE = new ActTokenType("ELSE");
  IElementType ELSIF = new ActTokenType("ELSIF");
  IElementType END = new ActTokenType("END");
  IElementType IF = new ActTokenType("IF");
  IElementType LET = new ActTokenType("LET");
  IElementType MINUS = new ActTokenType("MINUS");
  IElementType MUL = new ActTokenType("MUL");
  IElementType NO = new ActTokenType("NO");
  IElementType NUMBER = new ActTokenType("NUMBER");
  IElementType PAR_CLOSE = new ActTokenType("PAR_CLOSE");
  IElementType PAR_OPEN = new ActTokenType("PAR_OPEN");
  IElementType PLUS = new ActTokenType("PLUS");
  IElementType SQ_CLOSE = new ActTokenType("SQ_CLOSE");
  IElementType SQ_OPEN = new ActTokenType("SQ_OPEN");
  IElementType STR_CONST = new ActTokenType("STR_CONST");
  IElementType STR_INNER = new ActTokenType("STR_INNER");
  IElementType STR_LEFT = new ActTokenType("STR_LEFT");
  IElementType STR_RIGHT = new ActTokenType("STR_RIGHT");
  IElementType WORD = new ActTokenType("WORD");
  IElementType YES = new ActTokenType("YES");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ASSIGN_PART) {
        return new ActAssignPartImpl(node);
      }
      else if (type == CORTEGE) {
        return new ActCortegeImpl(node);
      }
      else if (type == EXPR_ADD) {
        return new ActExprAddImpl(node);
      }
      else if (type == EXPR_CALL) {
        return new ActExprCallImpl(node);
      }
      else if (type == EXPR_DOT) {
        return new ActExprDotImpl(node);
      }
      else if (type == EXPR_MUL) {
        return new ActExprMulImpl(node);
      }
      else if (type == EXPR_PAREN) {
        return new ActExprParenImpl(node);
      }
      else if (type == EXPR_SQUARE) {
        return new ActExprSquareImpl(node);
      }
      else if (type == EXPR_STR) {
        return new ActExprStrImpl(node);
      }
      else if (type == ID) {
        return new ActIdImpl(node);
      }
      else if (type == STATEMENT) {
        return new ActStatementImpl(node);
      }
      else if (type == STATEMENT_DO_DONE) {
        return new ActStatementDoDoneImpl(node);
      }
      else if (type == STATEMENT_ELSE) {
        return new ActStatementElseImpl(node);
      }
      else if (type == STATEMENT_ELSE_IF) {
        return new ActStatementElseIfImpl(node);
      }
      else if (type == STATEMENT_EXPR) {
        return new ActStatementExprImpl(node);
      }
      else if (type == STATEMENT_IF) {
        return new ActStatementIfImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
