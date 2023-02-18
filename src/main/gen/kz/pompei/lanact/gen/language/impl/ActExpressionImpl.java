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

public class ActExpressionImpl extends ASTWrapperPsiElement implements ActExpression {

  public ActExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ActVisitor visitor) {
    visitor.visitExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ActVisitor) accept((ActVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ActExpression getExpression() {
    return findChildByClass(ActExpression.class);
  }

  @Override
  @Nullable
  public ActExpressionConst getExpressionConst() {
    return findChildByClass(ActExpressionConst.class);
  }

  @Override
  @Nullable
  public ActExpressionSq getExpressionSq() {
    return findChildByClass(ActExpressionSq.class);
  }

  @Override
  @Nullable
  public ActExpressionStr getExpressionStr() {
    return findChildByClass(ActExpressionStr.class);
  }

  @Override
  @Nullable
  public ActId getId() {
    return findChildByClass(ActId.class);
  }

}
