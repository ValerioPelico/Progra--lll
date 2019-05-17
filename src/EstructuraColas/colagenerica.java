package EstructuraColas;
/**
 *
 * @autor Angel Ruiz
 * 0901-16-17865
 */
class colagenerica
 {
    public int max;
    protected Object dret;
    public Object c[];
    public int fre = -1;
    public int fin = -1;
 
    public colagenerica()
     {
        max=20;
        c=new Object [max];
     }
 
    public colagenerica(int n)
       { max=n;
        c=new Object [max];
       } 
 
    public boolean colallena(int fin,int max)
    {
      boolean llena;
      if (fin==max-1)
        llena=true;
        else
          llena=false;
      return llena;
     }
 
    public boolean colavacia(int fre)
    {
      boolean vacia;
      if (fre==-1)
        vacia=true;
        else
          vacia=false;
      return vacia;
     }   
 
    public boolean inscola(Object dato)
     {
        if (fin==max-1)
           return false;
        fin++;
        c[fin] = dato;
        if (fin==0)
           fre=0;
        return true;
     }
 
    public boolean retcola()
      {
        if (fre ==-1)
           return false;
        dret=c[fre];
        if (fre==fin)
          {
            fre=-1;
            fin=-1;
          }
         else
           fre++;
        return true;
      }
 }