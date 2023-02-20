// This is a generated file. Not intended for manual editing.
package kz.pompei.lanact.gen.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ActDefinitionOperator extends PsiElement {

  @NotNull
  List<ActAnnotation> getAnnotationList();

  @NotNull
  ActArgDefCortege getArgDefCortege();

  @Nullable
  ActId getId();

  @NotNull
  ActOperationName getOperationName();

  @Nullable
  ActStatementDoDone getStatementDoDone();

  @Nullable
  ActType getType();

}
