import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Aeropuerto>aeropuertos=new ArrayList<>();
        List<Vuelos>vuelos=new ArrayList<>();
        Set<Compania>compania=new HashSet<>();

        Aeropuerto aeropuerto1=new Aeropuerto("BCN01","El Prat","Barcelona","España",1);
        Aeropuerto aeropuerto2=new Aeropuerto("MAD01","Barajas","Madrid","España",1);
        Aeropuerto aeropuerto3=new Aeropuerto("PAR01","Orly","Paris","Francia",1);
        Aeropuerto aeropuerto4=new Aeropuerto("LON01","Heathrow","Londres","Gran Bretaña",0);
        Aeropuerto aeropuerto5=new Aeropuerto("SPA01","Guarulhos","Sao Paulo","Brasil",-3);
        aeropuertos.add(aeropuerto1);
        aeropuertos.add(aeropuerto2);
        aeropuertos.add(aeropuerto3);
        aeropuertos.add(aeropuerto4);
        aeropuertos.add(aeropuerto5);

        VueloRegular vueloR1=new VueloRegular("BCN01","MAD01",150,"01:00","Iberia","Airbus","L-15:00 X-15:00 V-15:00 D-15:00");
        compania.add(new Compania("Iberia"));
        VueloRegular vueloR2=new VueloRegular("MAD01","BCN01",150,"01:00","Iberia","Airbus","L-18:00 J-20:00 S-20:00");
        VueloRegular vueloR3=new VueloRegular("BCN01","LON01",180,"01:05","British Air","Boeing","L-10:00 J-10:00");
        compania.add(new Compania("British Air"));
        VueloRegular vueloR4=new VueloRegular("LON01","BCN01",180,"01:05","British Air","Boeing","180;L-15:00 J-15:00");
        VueloRegular vueloR5=new VueloRegular("BCN01","LON01",120,"01:10","Ryan Air","Airbus","120;L-10:00 J-10:00");
        compania.add(new Compania("Ryan Air"));
        VueloRegular vueloR6=new VueloRegular("LON01","BCN01",120,"01:10","Ryan Air","Airbus","120;J-15:10 J-15:10");
        VueloRegular vueloR7=new VueloRegular("LON01","SPA01",200,"07:00","British Air","Boeing","X-09:45 J-09:45 S-09:45");
        VueloRegular vueloR8=new VueloRegular("SPA01","MAD01",200,"07:00","British Air","Boeing","200;X-20:25 J-20:25 S-20:25");

        VueloCharter vueloC1=new VueloCharter("BCN01","MAD01",150,"01:00","Viajes Condor","1/2009/15 20:30");
        compania.add(new Compania("Spanair"));
        VueloCharter vueloC2=new VueloCharter("BCN01","MAD01",150,"01:00","Viajes Condor","1/2009/15 20:30");
        VueloCharter vueloC3=new VueloCharter("MAD01","BCN01",150,"01:00","Viajes Condor","1/2009/22 20:30");
        VueloCharter vueloC4=new VueloCharter("BCN01","LON01",180,"01:00","Viaje Ilusion","2/2009/22 20:30");
        VueloCharter vueloC5=new VueloCharter("LON01","BCN01",180,"01:00","Viaje Ilusion","3/2009/05 15:19");
        VueloCharter vueloC6=new VueloCharter("LON01","BCN01",180,"01:00","Viaje Ilusion","3/2009/05 15:19");
        VueloCharter vueloC7=new VueloCharter("BCN01","LON01",120,"01:00","TravelPlan","1/2009/25 15:18");
        VueloCharter vueloC8=new VueloCharter("SPA01","SPA01",120,"01:00","TravelPlan","1/2009/31 22:20");
        VueloCharter vueloC9=new VueloCharter("SI01","SPA01",120,"01:00","TravelPlan","1/2009/31 22:20");

        vuelos.add(vueloR1);
        vuelos.add(vueloR2);
        vuelos.add(vueloR3);
        vuelos.add(vueloR4);
        vuelos.add(vueloR5);
        vuelos.add(vueloR6);
        vuelos.add(vueloR7);
        vuelos.add(vueloR8);

        vuelos.add(vueloC1);
        vuelos.add(vueloC2);
        vuelos.add(vueloC3);
        vuelos.add(vueloC4);
        vuelos.add(vueloC5);
        vuelos.add(vueloC6);
        vuelos.add(vueloC7);
        vuelos.add(vueloC8);
        vuelos.add(vueloC9);

        // Mostrar la lista de vuelos de salida de cada aeropuerto
        System.out.println("\nVuelos de salida desde cada aeropuerto:\n");
        for (Aeropuerto aeropuerto : aeropuertos) {
            System.out.println("Desde " + aeropuerto + ":");
            for (Vuelos vuelo : vuelos) {
                if (vuelo.getOrigen()==aeropuerto.getCodigo()) {
                    System.out.println("  " + vuelo);
                }
            }
            System.out.println("----------------------------------------------");
        }

        // Mostrar la lista de vuelos de llegada a cada aeropuerto
        System.out.println("\nVuelos de llegada a cada aeropuerto:\n");
        for (Aeropuerto aeropuerto : aeropuertos) {
            System.out.println("\nA " + aeropuerto + ":\n");
            for (Vuelos vuelo : vuelos) {
                if (vuelo.getDestino()==aeropuerto.getCodigo()) {
                    System.out.println("  " + vuelo);
                }
            }
            System.out.println("----------------------------------------------");
        }
    }
}