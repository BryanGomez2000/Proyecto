
package Proyecto;
//hola
public class Multilistas
{
  public static Nodo insertar(Nodo r, Nodo n, int nivel, String []etq)
    {
        if(nivel == etq.length-1)
        {
            LSL ls = new LSL();
            ls.setR(r);
            ls.inserta(n);
            r=ls.getR();
            
            return r;
        }else
        {
            Nodo aux = busca(r, etq[nivel]);
            if (aux == null)
            {
                System.out.println("no encontere el dato " + etq[nivel] + "del nivel  " + nivel);
                return r;
            }else
            {
                aux.setAbj(insertar(aux.getAbj(), n, nivel+1, etq));
                return r;
            }
        }
    }
    
    public static Nodo busca(Nodo r,String etq)
    {
        Nodo aux = r;
        while (aux != null)
        {
            if(aux.getEtq().equals(etq))
            {
                return aux;
            }else
            {
                aux=aux.getSig();
            }
        }
        return aux;
    }
    /*public static void desp(Nodo r, int nivel, String []etq){
       Nodo aux = busca(r, etq[nivel]);
        if (aux==null) {
            System.out.println("No se encontro el pais");
        }else{
        System.out.println("Los Estados de: "+ etq[nivel]+" son : ");
        Nodo aux2=aux.getAbj();
        if (aux2==null) {
            System.out.println("No hay Estados en");
        }else{
           while (aux2!=null) {            
            System.out.println(aux2.getEtq());
            aux2=aux2.getSig();
        } 
        }
        }
    }*/
    
   public static Nodo elimina(Nodo r, Nodo n, int nivel, String []etq)
    {
        if(nivel == etq.length-1)
        {
            LSL ls = new LSL();
            ls.setR(r);
            ls.elimina(etq[nivel]);
            r=ls.getR();
            return r;
        }else
        {
            Nodo aux = busca(r, etq[nivel]);
            if (aux == null)
            {
                System.out.println("no encontere el dato " + etq[nivel] + "del nivel  " + nivel);
                return r;
            }else
            {
                aux.setAbj(elimina(aux.getAbj(), n, nivel+1, etq));
                return r;
            }
        }
    }
    public static String desp(Nodo r , int nivel){
        String s="";
        
        while (r!=null) {  
            String ss="";
            for (int i = 0; i <nivel; i++) {
                ss+="\t";
            }
            s+=ss+"Nivel = " + String.valueOf(nivel)+ "\n";
            s+=ss+r.getEtq()+"\n";         
            s+=desp(r.getAbj(), nivel+1);
            r=r.getSig();
        }
        return s;
    }
}
