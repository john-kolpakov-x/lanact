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

public class ActExprMulImpl extends ASTWrapperPsiElement implements ActExprMul {

  public ActExprMulImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ActVisitor visitor) {
    visitor.visitExprMul(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ActVisitor) accept((ActVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<ActExprAdd> getExprAddList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ActExprAdd.class);
  }

  @Override
  @NotNull
  public List<ActOpAdd> getOpAddList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ActOpAdd.class);
  }

}
