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

public class ActDefinitionImpl extends ASTWrapperPsiElement implements ActDefinition {

  public ActDefinitionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ActVisitor visitor) {
    visitor.visitDefinition(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ActVisitor) accept((ActVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ActDefinitionFun getDefinitionFun() {
    return findChildByClass(ActDefinitionFun.class);
  }

  @Override
  @Nullable
  public ActDefinitionOperator getDefinitionOperator() {
    return findChildByClass(ActDefinitionOperator.class);
  }

}
