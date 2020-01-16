/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cookbook;


public class Recipe {
    
    private String name;
    private String type;
    private String instructions;
    private String DoLu;
    private String servings;
    
    public Recipe(){
           name = "";
           type = " ";
           instructions = "";
           DoLu = "";
           servings = "";
    
    }
    public Recipe(String n, String t, String i, String d, String s){
        this.name = n;
        this.type = t;
        this.instructions = i;
        this.DoLu = d;
        this.servings = s;
        
              
    }
    public String getName(){
        return name;
    }
    public String getType(){
        return type;
    }
    public String getInstuctions(){
        return instructions;
    }
    public String getDate(){
        return DoLu;
    }
    public String getServings(){
        return servings;
    }
    public Recipe deepCopy() {
        Recipe copy = new Recipe(name, type, instructions,DoLu,servings);
        return copy;
    }
    
       @Override
    public String toString() {
        return ("Name is " + name
                +"\n type " + type
                + "\n instructions " + instructions
                + "\n Date of Last Use " + DoLu 
                + "\n Servings for " + servings + "\n");
    }
    
    public int compareTo(String data) {
        return name.compareTo(data);
    }
    
}
