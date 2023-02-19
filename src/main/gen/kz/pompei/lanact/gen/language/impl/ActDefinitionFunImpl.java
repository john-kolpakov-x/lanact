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

public class ActDefinitionFunImpl extends ASTWrapperPsiElement implements ActDefinitionFun {

  public ActDefinitionFunImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ActVisitor visitor) {
    visitor.visitDefinitionFun(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ActVisitor) accept((ActVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<ActAnnotation> getAnnotationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ActAnnotation.class);
  }

  @Override
  @Nullable
  public ActArgDefCortege getArgDefCortege() {
    return findChildByClass(ActArgDefCortege.class);
  }

  @Override
  @NotNull
  public List<ActId> getIdList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ActId.class);
  }

  @Override
  @Nullable
  public ActStatementDoDone getStatementDoDone() {
    return findChildByClass(ActStatementDoDone.class);
  }

  @Override
  @Nullable
  public ActType getType() {
    return findChildByClass(ActType.class);
  }

}
