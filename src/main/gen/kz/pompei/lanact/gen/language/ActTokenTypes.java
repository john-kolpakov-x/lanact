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
  IElementType EXPRESSION = new ActElementType("EXPRESSION");
  IElementType EXPRESSION_CONST = new ActElementType("EXPRESSION_CONST");
  IElementType EXPRESSION_SQ = new ActElementType("EXPRESSION_SQ");
  IElementType EXPRESSION_STR = new ActElementType("EXPRESSION_STR");
  IElementType ID = new ActElementType("ID");
  IElementType STATEMENT = new ActElementType("STATEMENT");
  IElementType STATEMENTS = new ActElementType("STATEMENTS");
  IElementType STATEMENT_DO_DONE = new ActElementType("STATEMENT_DO_DONE");
  IElementType STATEMENT_ELSE = new ActElementType("STATEMENT_ELSE");
  IElementType STATEMENT_ELSE_IF = new ActElementType("STATEMENT_ELSE_IF");
  IElementType STATEMENT_EXPR = new ActElementType("STATEMENT_EXPR");
  IElementType STATEMENT_IF = new ActElementType("STATEMENT_IF");

  IElementType ASSIGN = new ActTokenType("ASSIGN");
  IElementType CLASS = new ActTokenType("CLASS");
  IElementType COMMENT = new ActTokenType("COMMENT");
  IElementType DO = new ActTokenType("DO");
  IElementType DONE = new ActTokenType("DONE");
  IElementType ELSE = new ActTokenType("ELSE");
  IElementType ELSIF = new ActTokenType("ELSIF");
  IElementType END = new ActTokenType("END");
  IElementType IF = new ActTokenType("IF");
  IElementType LET = new ActTokenType("LET");
  IElementType NO = new ActTokenType("NO");
  IElementType NUMBER = new ActTokenType("NUMBER");
  IElementType PAR_CLOSE = new ActTokenType("PAR_CLOSE");
  IElementType PAR_OPEN = new ActTokenType("PAR_OPEN");
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
      else if (type == EXPRESSION) {
        return new ActExpressionImpl(node);
      }
      else if (type == EXPRESSION_CONST) {
        return new ActExpressionConstImpl(node);
      }
      else if (type == EXPRESSION_SQ) {
        return new ActExpressionSqImpl(node);
      }
      else if (type == EXPRESSION_STR) {
        return new ActExpressionStrImpl(node);
      }
      else if (type == ID) {
        return new ActIdImpl(node);
      }
      else if (type == STATEMENT) {
        return new ActStatementImpl(node);
      }
      else if (type == STATEMENTS) {
        return new ActStatementsImpl(node);
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
