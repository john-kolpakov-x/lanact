// This is a generated file. Not intended for manual editing.
package kz.pompei.lanact.gen.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ActStatementIf extends PsiElement {

  @NotNull
  ActExpression getExpression();

  @Nullable
  ActStatementElse getStatementElse();

  @NotNull
  List<ActStatementElseIf> getStatementElseIfList();

  @NotNull
  ActStatements getStatements();

}
