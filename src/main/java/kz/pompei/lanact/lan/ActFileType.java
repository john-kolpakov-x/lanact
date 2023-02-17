package kz.pompei.lanact.lan;

import com.intellij.openapi.fileTypes.LanguageFileType;
import javax.swing.Icon;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class ActFileType extends LanguageFileType {

  @SuppressWarnings("unused")
  public static final ActFileType INSTANCE = new ActFileType();

  private ActFileType() {
    super(ActLanguage.INSTANCE);
  }

  @Override
  public @NonNls @NotNull String getName() {
    return "Act File";
  }

  @Override
  public @NotNull String getDescription() {
    return "File with Act Language code";
  }

  @Override
  public @NotNull String getDefaultExtension() {
    return "act";
  }

  @Override
  public Icon getIcon() {
    return ActIcons.FILE;
  }
}
