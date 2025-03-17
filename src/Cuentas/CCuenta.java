package Cuentas;

/**
 * Clase que representa una cuenta bancaria con las funcionalidades ingresar,
 * retirar, y consultar saldo.
 */
public class CCuenta {

    /**
     * Nombre del titular de la cuenta
     */
    private String nombre;

    /**
     * Número de cuenta
     */
    private String cuenta;

    /**
     * Saldo actual de la cuenta
     */
    private double saldo;

    /**
     * Tipo de interés aplicado a la cuenta
     */
    private double tipoInteres;

    /**
     * Constructor vacío de la clase CCuenta
     */
    public CCuenta() {
    }

    /**
     * Constructor con parámetros para inicializar una cuenta
     *
     * @param nom  Nombre del titular de la cuenta
     * @param cue  Número de cuenta
     * @param sal  Saldo inicial de la cuenta
     * @param tipo Tipo de interés de la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    /**
     * Obtiene el tipo de interés aplicado a la cuenta
     *
     * @return Tipo de interés de la cuenta
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * Establece el tipo de interés aplicado a la cuenta
     *
     * @param tipoInteres Tipo de interés a asignar
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    /**
     * Obtiene el saldo actual de la cuenta
     *
     * @return Saldo actual
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo de la cuenta
     *
     * @param saldo Saldo a asignar
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Obtiene el número de cuenta
     *
     * @return Número de cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Establece el número de cuenta
     *
     * @param cuenta Número de cuenta a asignar
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Obtiene el nombre del titular de la cuenta
     *
     * @return Nombre del titular
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del titular de la cuenta
     *
     * @param nombre Nombre del titular a asignar
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el saldo actual de la cuenta
     *
     * @return Saldo actual de la cuenta
     */
    public double estado() {
        return saldo;
    }

    /**
     * Ingresa una cantidad en la cuenta
     *
     * @param cantidad Cantidad a ingresar
     * @throws Exception Si la cantidad a ingresar es negativa
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        saldo = saldo + cantidad;
    }

    /**
     * Retira una cantidad de la cuenta
     *
     * @param cantidad Cantidad a retirar
     * @throws Exception Si la cantidad es negativa o mayor al saldo disponible
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No hay suficiente saldo");
        }
        saldo = saldo - cantidad;
    }
}