public class VueloRegular extends Vuelos{
    private String aerolinea;
    private String avion;
    private String horarios;

    public VueloRegular(String origen, String destino, int plazas, String duracion, String aerolinea, String avion, String horarios) {
        super(origen, destino, plazas, duracion);
        this.aerolinea = aerolinea;
        this.avion = avion;
        this.horarios = horarios;
    }

    @Override
    public String toString() {
        return super.toString()+", aerolinea: "+aerolinea+", avion: "+avion+", horarios: "+horarios;
    }
}
