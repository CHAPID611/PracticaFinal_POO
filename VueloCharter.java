public class VueloCharter extends Vuelos{
    private String paquete;
    private String fecha;

    public VueloCharter(String origen, String destino, int plazas, String duracion, String paquete, String fecha) {
        super(origen, destino, plazas, duracion);
        this.paquete = paquete;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return super.toString()+", paquete: "+paquete+", fecha: "+fecha;
    }

}
