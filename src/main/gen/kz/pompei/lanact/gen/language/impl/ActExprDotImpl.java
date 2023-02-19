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

public class ActExprDotImpl extends ASTWrapperPsiElement implements ActExprDot {

  public ActExprDotImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ActVisitor visitor) {
    visitor.visitExprDot(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ActVisitor) accept((ActVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<ActCortege> getCortegeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ActCortege.class);
  }

  @Override
  @Nullable
  public ActExprCall getExprCall() {
    return findChildByClass(ActExprCall.class);
  }

  @Override
  @Nullable
  public ActExprParen getExprParen() {
    return findChildByClass(ActExprParen.class);
  }

  @Override
  @Nullable
  public ActExprSquare getExprSquare() {
    return findChildByClass(ActExprSquare.class);
  }

  @Override
  @Nullable
  public ActExprStr getExprStr() {
    return findChildByClass(ActExprStr.class);
  }

  @Override
  @NotNull
  public List<ActId> getIdList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ActId.class);
  }

}
