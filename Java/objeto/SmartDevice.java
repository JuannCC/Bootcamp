public class SmartDevice {
    private String marca;
    private String tipo;
    private int anio;
    public SmartDevice() {
    }

    public SmartDevice(String marca,String tipo,int anio) {
        this.marca=marca;
        this.tipo=tipo;
        this.anio=anio;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "marca='" + marca + '\'' +
                ", tipo='" + tipo + '\'' +
                ", anio=" + anio +
                '}';
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}
