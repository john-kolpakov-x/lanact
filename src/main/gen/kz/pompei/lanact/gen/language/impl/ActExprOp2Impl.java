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

public class ActExprOp2Impl extends ASTWrapperPsiElement implements ActExprOp2 {

  public ActExprOp2Impl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ActVisitor visitor) {
    visitor.visitExprOp2(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ActVisitor) accept((ActVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<ActExprDot> getExprDotList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ActExprDot.class);
  }

  @Override
  @Nullable
  public ActOperation1 getOperation1() {
    return findChildByClass(ActOperation1.class);
  }

  @Override
  @NotNull
  public List<ActOperation2> getOperation2List() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ActOperation2.class);
  }

}
