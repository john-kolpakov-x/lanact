// This is a generated file. Not intended for manual editing.
package kz.pompei.lanact.gen.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ActExprAdd extends PsiElement {

  @NotNull
  List<ActExprParen> getExprParenList();

  @NotNull
  List<ActExprSquare> getExprSquareList();

  @NotNull
  List<ActExpressionStr> getExpressionStrList();

  @NotNull
  List<ActId> getIdList();

  @NotNull
  List<ActOpMul> getOpMulList();

  @NotNull
  List<ActStatementDoDone> getStatementDoDoneList();

}
