import java.util.ArrayList;
import java.util.List;

public class Lista {
    List<Paqueteria> serviEntrega;

    public Lista(){
        serviEntrega =new ArrayList<Paqueteria>();
    }

    public void adicionarElemento(Paqueteria p) throws Exception {
        if(serviEntrega.isEmpty())
            serviEntrega.add(p);
        else{
            for(Paqueteria pa:serviEntrega)
                if(pa.getTracking()==p.getTracking())
                    throw new Exception("pauqete ya existe");
            serviEntrega.add(p);
        }
    }

    public String listarPaquetes(){
        String mensaje = "";
        for(Paqueteria p: serviEntrega)
            mensaje += p+"\n";
        return mensaje;
    }

    //trabajr con recursividad
    public int sumarTotalPaquetes(){
        return totalPaquetes(0);
    }

    private int totalPaquetes(int indice){
        if(serviEntrega.size()==indice)
            return 0;
        else{
            return 0+totalPaquetes(indice+1);
        }
    }

    public int sumarTotalPeso(){

    }

    private double totalPeso(int indice){
        if(serviEntrega.size()==indice)
            return 0;
        else{
        return serviEntrega.get(indice).getPeso()+totalPeso(indice+1);
    }

}
    }

