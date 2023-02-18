package kz.pompei.lanact.lexer;

import com.intellij.psi.tree.TokenSet;
import kz.pompei.lanact.gen.language.ActTokenTypes;

public interface ActTokenSets {

  TokenSet IDENTIFIERS = TokenSet.create(ActTokenTypes.WORD);

  TokenSet COMMENTS = TokenSet.create(ActTokenTypes.COMMENT);

}
