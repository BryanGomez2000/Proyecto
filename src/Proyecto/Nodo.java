package Proyecto;
import java.io.Serializable;
public class Nodo implements Serializable
{
  public static final long SerialVersionUID = 1L;
  private Object obj;
  private String etq;
  private Nodo sig=null;
  private Nodo ant=null;
  private Nodo abj=null;
    public Nodo(Object obj)
    {
        this.obj = obj;
    }
    public Nodo(Object obj, String etq)
    {
        this.obj = obj;
        this.etq = etq;
    }
    
    /**
     * @return the obj
     */
    public Object getObj()
    {
        return obj;
    }

    /**
     * @param obj the obj to set
     */
    public void setObj(Object obj)
    {
        this.obj = obj;
    }

    /**
     * @return the sig
     */
    public Nodo getSig()
    {
        return sig;
    }
    public void setSig(Nodo sig)
    {
        this.sig = sig;
    }
    public String getEtq()
    {
        return etq;
    }
    public void setEtq(String etq)
    {
        this.etq = etq;
    }
    public Nodo getAnt()
    {
        return ant;
    }
    public void setAnt(Nodo ant)
    {
        this.ant = ant;
    }

    /**
     * @return the abj
     */
    public Nodo getAbj()
    {
        return abj;
    }

    /**
     * @param abj the abj to set
     */
    public void setAbj(Nodo abj)
    {
        this.abj = abj;
    }

   

   
  
  
}
