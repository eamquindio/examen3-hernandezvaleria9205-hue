package edu.eam.ingesoft.fundamentos.parqueadero.logica;

/**
 * Clase que representa un propietario de vehículo en el parqueadero.
 * El propietario es responsable de gestionar su propia información,
 * calcular su categoría y descuento según las horas acumuladas.
 */
public class Propietario {

    // ==================== ATRIBUTOS ====================

    private String cedula;
    private String nombre;
    private int horasAcumuladas;

    // ==================== CONSTRUCTOR ====================

    /**
     * Crea una nueva instancia de Propietario.
     * Las horas acumuladas deben iniciar en 0.
     * @param cedula Número de identificación único del propietario
     * @param nombre Nombre completo del propietario
     */
    public Propietario(String cedula, String nombre) {
        // TODO: Implementar constructor
        this.cedula = cedula;
        this.nombre = nombre;
    }

    // ==================== GETTERS ====================

    /**
     * @return La cédula del propietario
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @return El nombre del propietario
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return El total de horas acumuladas en el parqueadero
     */
    public int getHorasAcumuladas() {
        return horasAcumuladas;
    }

    // ==================== MÉTODOS DE NEGOCIO ====================

    /**
     * Incrementa las horas acumuladas del propietario.
     * @param horas Cantidad de horas a sumar
     */
    public void acumularHoras(int horas) {
        // TODO: Implementar método
        this.horasAcumuladas += horas;
    }

    /**
     * Determina la categoría del cliente según sus horas acumuladas.
     * - ESTANDAR: 0 a 100 horas
     * - ESPECIAL: 101 a 500 horas
     * - VIP: más de 500 horas
     * @return La categoría del cliente ("ESTANDAR", "ESPECIAL" o "VIP")
     */
    public String obtenerCategoria() {
        // TODO: Implementar método usando if-else múltiple
        String categoria = "ESTANDAR";
        if (horasAcumuladas >= 101 && horasAcumuladas <= 500)
            categoria = "ESPECIAL";
        else if (horasAcumuladas > 500)
            categoria = "VIP";
        return categoria;
    }

    /**
     * Calcula el porcentaje de descuento según la categoría del cliente.
     * - ESTANDAR: 0% (0.0)
     * - ESPECIAL: 10% (0.10)
     * - VIP: 15% (0.15)
     * Pista: Usar el método obtenerCategoria() para saber la categoría
     * @return El porcentaje de descuento como valor decimal
     */
    public double obtenerDescuento() {
        // TODO: Implementar método usando switch
        double descuento = 0;

        switch (obtenerCategoria()){
            case "ESPECIAL":
                descuento = 0.10;
                break;
            case "VIP":
                descuento = 0.15;
                break;
        }
        return descuento;
    }

    /**
     * Indica si el propietario tiene categoría VIP.
     * @return true si tiene más de 500 horas acumuladas, false en caso contrario
     */
    public boolean esVIP() {
        // TODO: Implementar método usando if simple
        return horasAcumuladas > 500;
    }
}
