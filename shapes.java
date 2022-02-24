import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class shapes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class shapes extends Actor
{
    /**
     * Act - do whatever the shapes wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    // 1  2  3  4
    // 5  6  7  8
    // 9  10 11 12
    // 13 14 15 16
    String[] shapes = {
    "XXOXXOOOOOOO","XOOXOOXOOXOO","XOOXOOXXOOOO",
    "OOXOOXOXXOOO","OXOXXXOOOOOO","XOOXXOOXOOOO",
    "OXOXXOXOOOOO"};
    //SQUARE,LINE,NORMAL L, BACKWARDS L, LINE WITH HEAD,
    public shapes(){
        int object = 1;
        String[] shape = shapes[object].split("");
        for (int i = 0; i < 11;i++ ){
            if (shape[i] == "X"){
                addObject(new block,)
            }
            if (shape[i] == "O"){
            
            }
        }
        
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
