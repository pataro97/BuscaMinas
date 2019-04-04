package minesweeper;



public class Casilla 
{
    private boolean mine;

    /*
     *  perrito chico
     */
       
    //Only the content of the Cell is visible to the player.
    private String content;

    //Number of adjacent surrounding mines
    private int surroundingMines;

    
    //----------------------------------------------------------//

    public Casilla()
    {
        mine = false;
        content = "";
        surroundingMines = 0;
    }


    
    //-------------paco ven pa' ca----------------------------//
    public boolean cogeMina()
    {
        return mine;
    }

    public void seleccionaMina(boolean mine)
    {
        this.mine = mine;
    }

    public String cogeContenido()
    {
        return content;
    }

    public void seleccionaContenido(String content)
    {
        this.content = content;
    }

    public int getSurroundingMines()
    {
        return surroundingMines;
    }

    public void setSurroundingMines(int surroundingMines)
    {
        this.surroundingMines = surroundingMines;
    }

    //-------------------------------------------------------------//
}
