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

public class ActArgDefCortegeImpl extends ASTWrapperPsiElement implements ActArgDefCortege {

  public ActArgDefCortegeImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ActVisitor visitor) {
    visitor.visitArgDefCortege(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ActVisitor) accept((ActVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<ActExprSelect> getExprSelectList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ActExprSelect.class);
  }

  @Override
  @NotNull
  public List<ActId> getIdList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ActId.class);
  }

  @Override
  @NotNull
  public List<ActType> getTypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ActType.class);
  }

}
