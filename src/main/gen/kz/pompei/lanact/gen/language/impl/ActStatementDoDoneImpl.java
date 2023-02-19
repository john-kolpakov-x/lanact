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

public class ActStatementDoDoneImpl extends ASTWrapperPsiElement implements ActStatementDoDone {

  public ActStatementDoDoneImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ActVisitor visitor) {
    visitor.visitStatementDoDone(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ActVisitor) accept((ActVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ActDoDoneLast getDoDoneLast() {
    return findChildByClass(ActDoDoneLast.class);
  }

  @Override
  @NotNull
  public List<ActStatementDoDone> getStatementDoDoneList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ActStatementDoDone.class);
  }

  @Override
  @NotNull
  public List<ActStatementExpr> getStatementExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ActStatementExpr.class);
  }

  @Override
  @NotNull
  public List<ActStatementIf> getStatementIfList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ActStatementIf.class);
  }

  @Override
  @NotNull
  public List<ActStatementRet> getStatementRetList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ActStatementRet.class);
  }

  @Override
  @NotNull
  public List<ActStatementVarDef> getStatementVarDefList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ActStatementVarDef.class);
  }

}
