package kz.pompei.lanact.parser;

import com.intellij.psi.tree.IElementType;
import kz.pompei.lanact.lan.ActLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class ActTokenType extends IElementType {
  public ActTokenType(@NonNls @NotNull String debugName) {
    super(debugName, ActLanguage.INSTANCE);
  }

  @Override
  public String toString() {
    return "ActTokenType." + super.toString();
  }
}
