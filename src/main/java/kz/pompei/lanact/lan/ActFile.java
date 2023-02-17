package kz.pompei.lanact.lan;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

public class ActFile extends PsiFileBase {

  public ActFile(@NotNull FileViewProvider viewProvider) {
    super(viewProvider, ActLanguage.INSTANCE);
  }

  @Override
  public @NotNull FileType getFileType() {
    return ActFileType.INSTANCE;
  }

  @Override
  public String toString() {
    return "Act File";
  }
}
