// This is a generated file. Not intended for manual editing.
package kz.pompei.lanact.gen.language.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static kz.pompei.lanact.gen.language.ActTokenTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import kz.pompei.lanact.gen.language.psi.*;

public class ActStatementIfImpl extends ASTWrapperPsiElement implements ActStatementIf {

  public ActStatementIfImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ActVisitor visitor) {
    visitor.visitStatementIf(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ActVisitor) accept((ActVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public ActExprMul getExprMul() {
    return findNotNullChildByClass(ActExprMul.class);
  }

  @Override
  @NotNull
  public List<ActStatement> getStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ActStatement.class);
  }

  @Override
  @Nullable
  public ActStatementElse getStatementElse() {
    return findChildByClass(ActStatementElse.class);
  }

  @Override
  @NotNull
  public List<ActStatementElseIf> getStatementElseIfList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ActStatementElseIf.class);
  }

}
