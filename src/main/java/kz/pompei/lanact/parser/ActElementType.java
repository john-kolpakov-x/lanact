package kz.pompei.lanact.parser;

import com.intellij.psi.tree.IElementType;
import kz.pompei.lanact.lan.ActLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class ActElementType extends IElementType {
  public ActElementType(@NonNls @NotNull String debugName) {
    super(debugName, ActLanguage.INSTANCE);
  }
}
