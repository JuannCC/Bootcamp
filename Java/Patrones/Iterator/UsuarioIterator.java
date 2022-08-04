public interface UsuarioIterator {
    //Hay mas usuarios en el iterador
    boolean hayMas();
    //Reinicia el contador
    void reinicia();
    //Obtiene el siguiente
    Usuario siguiente();
}
