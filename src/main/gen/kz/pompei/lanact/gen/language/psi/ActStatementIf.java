// This is a generated file. Not intended for manual editing.
package kz.pompei.lanact.gen.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ActStatementIf extends PsiElement {

  @NotNull
  ActExprSelect getExprSelect();

  @NotNull
  List<ActStatementDoDone> getStatementDoDoneList();

  @Nullable
  ActStatementElse getStatementElse();

  @NotNull
  List<ActStatementElseIf> getStatementElseIfList();

  @NotNull
  List<ActStatementExpr> getStatementExprList();

  @NotNull
  List<ActStatementIf> getStatementIfList();

  @NotNull
  List<ActStatementRet> getStatementRetList();

  @NotNull
  List<ActStatementVarDef> getStatementVarDefList();

}
