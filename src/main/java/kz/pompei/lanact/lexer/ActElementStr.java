package kz.pompei.lanact.lexer;

import com.intellij.psi.tree.IElementType;
import kz.pompei.lanact.lan.ActLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class ActElementStr extends IElementType {

  public static final String STR_INNER = "STR_INNER";
  public static final String STR_OPEN  = "STR_OPEN";
  public static final String STR_CLOSE = "STR_CLOSE";
  public static final String STR_FULL  = "STR_FULL";

  public final String content;

  public ActElementStr(@NonNls @NotNull String debugName,
                       @NonNls @NotNull String content) {

    super(debugName, ActLanguage.INSTANCE);
    this.content = content;
  }
}
