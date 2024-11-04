/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package labtask.tnode;

/**
 *
 * @author Abdul Waheed
 */

  public class Tree{
       
            TNode root;
       
          public Tree(String rootvalue , int maxChildSize){
            
                root = new TNode(rootvalue,maxChildSize);
            }
          
         

       
       
       
      
    public static void main(String[] args) {
        Tree tree= new Tree("A", 2);
        
        TNode B = new TNode("B" ,3);
        TNode C = new TNode("C" ,2);
        
        
        tree.root.addChild(B);
        tree.root.addChild(C);
        
        TNode D = new TNode("D" ,2);
        TNode E = new TNode("E" ,2);
        TNode F = new TNode("F" ,2);
        
        B.addChild(D);
        B.addChild(E);
        B.addChild(F);
     
    }
}
