public class SmartPhone extends SmartDevice{
    Boolean lectorHuella = true;

    public SmartPhone (){
    }

    public SmartPhone(String marca, String tipo, int anio, boolean lectorHuella) {
        super(marca, tipo, anio);
        this.lectorHuella=lectorHuella;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "lectorHuella=" + lectorHuella +
                ", marca='" + marca + '\'' +
                ", tipo='" + tipo + '\'' +
                ", anio=" + anio +
                '}';
    }
}
