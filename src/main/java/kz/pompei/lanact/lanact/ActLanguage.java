package kz.pompei.lanact.lanact;

import com.intellij.lang.Language;

public class ActLanguage extends Language {

  public static final ActLanguage INSTANCE = new ActLanguage();

  private ActLanguage() {
    super("Act");
  }
}
