package mundo;


public class Jarras
{   private int jarra6, jarra8;

    public Jarras() 
    { jarra6 = jarra8 = 0;
    }

    public Jarras(int j6, int j8) 
    { jarra6 = j6; jarra8 = j8;
    }

    public int getJarra6() { return jarra6; }
    public int getJarra8() { return jarra8; }

    public void setJarra6(int jarra6) { this.jarra6 = jarra6; }
    public void setJarra8(int jarra8) { this.jarra8 = jarra8; }

    public void llenar6()
    {
         if (jarra6<=6) {
            jarra6 =6;
        }
    }    
    public void llenar8()
    {
         if (jarra8<=8) {
            jarra8 =8;
        }
    }
    
    public void descargar6()
    {
       if (jarra6>0) {
            jarra6 =0;
        }
    }
    public void descargar8()
    {
          if (jarra8>0) {
            jarra8 =0;
        }
    }
 
    public void llenar86()
    {
         if (jarra8<8 && jarra6>0) {
             int aux = jarra6 + jarra8;
             if (aux<=8)
             {
                 jarra8 = jarra8+jarra6;
             }
        }
    } 
    public void llenar68()
    {
        
    } 

    public void vaciar86()
    {
    } 
    public void vaciar68()
    {
    }
    
 
}
