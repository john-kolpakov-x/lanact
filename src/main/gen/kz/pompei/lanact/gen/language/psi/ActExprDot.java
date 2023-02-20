// This is a generated file. Not intended for manual editing.
package kz.pompei.lanact.gen.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ActExprDot extends PsiElement {

  @NotNull
  List<ActCortege> getCortegeList();

  @NotNull
  List<ActCortegeSq> getCortegeSqList();

  @Nullable
  ActExprCall getExprCall();

  @Nullable
  ActExprParen getExprParen();

  @Nullable
  ActExprSquare getExprSquare();

  @Nullable
  ActExprStr getExprStr();

  @NotNull
  List<ActId> getIdList();

}
