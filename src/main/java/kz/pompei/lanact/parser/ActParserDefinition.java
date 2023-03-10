package kz.pompei.lanact.parser;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import kz.pompei.lanact.gen.language.ActParser;
import kz.pompei.lanact.gen.language.ActTokenTypes;
import kz.pompei.lanact.lan.ActFile;
import kz.pompei.lanact.lan.ActLanguage;
import kz.pompei.lanact.lexer.ActLexerAdapter;
import kz.pompei.lanact.lexer.ActTokenSets;
import org.jetbrains.annotations.NotNull;

public class ActParserDefinition implements ParserDefinition {

  public static final IFileElementType FILE = new IFileElementType(ActLanguage.INSTANCE);

  @Override
  public @NotNull Lexer createLexer(Project project) {
    return new ActLexerAdapter();
  }

  @Override
  public @NotNull PsiParser createParser(Project project) {
    return new ActParser();
  }

  @Override
  public @NotNull IFileElementType getFileNodeType() {
    return FILE;
  }

  @Override
  public @NotNull TokenSet getCommentTokens() {
    return ActTokenSets.COMMENTS;
  }

  @Override
  public @NotNull TokenSet getStringLiteralElements() {
    return TokenSet.EMPTY;
  }

  @Override
  public @NotNull PsiElement createElement(ASTNode node) {
    return ActTokenTypes.Factory.createElement(node);
  }

  @Override
  public @NotNull PsiFile createFile(@NotNull FileViewProvider viewProvider) {
    return new ActFile(viewProvider);
  }
}
