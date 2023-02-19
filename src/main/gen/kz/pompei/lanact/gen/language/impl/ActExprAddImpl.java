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

public class ActExprAddImpl extends ASTWrapperPsiElement implements ActExprAdd {

  public ActExprAddImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ActVisitor visitor) {
    visitor.visitExprAdd(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ActVisitor) accept((ActVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<ActExprParen> getExprParenList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ActExprParen.class);
  }

  @Override
  @NotNull
  public List<ActExprSquare> getExprSquareList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ActExprSquare.class);
  }

  @Override
  @NotNull
  public List<ActExpressionStr> getExpressionStrList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ActExpressionStr.class);
  }

  @Override
  @NotNull
  public List<ActId> getIdList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ActId.class);
  }

  @Override
  @NotNull
  public List<ActOpMul> getOpMulList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ActOpMul.class);
  }

  @Override
  @NotNull
  public List<ActStatementDoDone> getStatementDoDoneList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ActStatementDoDone.class);
  }

}
