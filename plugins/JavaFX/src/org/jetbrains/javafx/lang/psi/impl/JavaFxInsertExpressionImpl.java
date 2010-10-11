package org.jetbrains.javafx.lang.psi.impl;

import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.javafx.lang.psi.JavaFxInsertExpression;

/**
 * Created by IntelliJ IDEA.
 * Author: Alexey.Ivanov
 * Date:   12.05.2010
 * Time:   17:42:18
 */
public class JavaFxInsertExpressionImpl extends JavaFxVoidExpressionImpl implements JavaFxInsertExpression {
  public JavaFxInsertExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }
}
