/* Generated By:JJTree: Do not edit this line. ASTIfExpr.java */

package net.sourceforge.pmd.jerry.ast.xpath;

public class ASTIfExpr extends SimpleNode {
  public ASTIfExpr(int id) {
    super(id);
  }

  public ASTIfExpr(XPath2Parser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(XPath2ParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}