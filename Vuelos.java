public class Vuelos {
    private String origen;
    private String destino;
    private int plazas;
    private String duracion;
    public Vuelos() {
    }

    public Vuelos(String origen, String destino, int plazas, String duracion) {
        this.origen = origen;
        this.destino = destino;
        this.plazas = plazas;
        this.duracion = duracion;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "vuelo de "+origen+" a "+destino+" con "+plazas+" plazas, duracion: "+duracion;
    }
}
