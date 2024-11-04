/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtask.tnode;

/**
 *
 * @author Abdul Waheed
 */
public class TNode {
 
    
    
     String data;
       
       TNode[] children;
       
       int childCount;
       
       public TNode(String val, int maxchildSize){
       
           this.data = val;
           
          this.children = new TNode[maxchildSize];
       
           this.childCount = 0;
            
       }

        public void addChild(TNode child){
          
          
          if(childCount<children.length){
          
          
              children[childCount++] = child;
              System.out.println(child.data+" have been added");
          }
          else{
              System.out.println(" Node is already filled ");
          
          }
         
          }
        
        public void displayNode(TNode node ,int level ){
        
        if(node == null){
        
            return;
        }
        
            System.out.println(level*1+" "+node.data);
            
            for(int i =0; i<node.childCount; i++){
            
                displayNode(node.children[i], level+1);
            
            }
        
        }

       
 
       }

 
