public class SmartWatch extends SmartDevice{
    Boolean gps = true;

    public SmartWatch (){
    }

    public SmartWatch(String marca, String tipo, int anio, boolean gps) {
        super(marca, tipo, anio);
        this.gps=gps;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "gps=" + gps +
                ", marca='" + getMarca() + '\'' +
                ", tipo='" + getTipo() + '\'' +
                ", anio=" + getAnio() +
                '}';
    }
}
