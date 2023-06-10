import java.util.*;

class Program {
  // This is an input class. Do not edit.
  static class BinaryTree {
    public int value;
    public BinaryTree left = null;
    public BinaryTree right = null;

    public BinaryTree(int value) {
      this.value = value;
    }
  }

  public boolean heightBalancedBinaryTree(BinaryTree tree) {
    return height(tree) >= 0;
  }

  public int height(BinaryTree tree){
    if(tree==null) return 0;
    int left = height(tree.left);
    int right = height(tree.right);
    if(left<0 || right<0 || Math.abs(left-right)>1) return -1;
    return 1 + Math.max(left,right);
  }
}

