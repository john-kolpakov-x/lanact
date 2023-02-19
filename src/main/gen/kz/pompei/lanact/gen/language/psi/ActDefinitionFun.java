// This is a generated file. Not intended for manual editing.
package kz.pompei.lanact.gen.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ActDefinitionFun extends PsiElement {

  @NotNull
  List<ActAnnotation> getAnnotationList();

  @Nullable
  ActArgDefCortege getArgDefCortege();

  @NotNull
  List<ActId> getIdList();

  @Nullable
  ActStatementDoDone getStatementDoDone();

  @Nullable
  ActType getType();

}
