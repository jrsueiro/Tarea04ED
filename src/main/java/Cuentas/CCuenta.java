package Cuentas;

public class CCuenta {

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInteres
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * @param tipoInteres the tipoInteres to set
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;
    
    
    /**
     * Clase CCuenta que a partir de las variables nombre, cuenta y
     * saldo permite registrar un ingreso o retirada de dinero de la
     * cuenta.
     */
    

    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    
    /**
     * @return the getSaldo
     */
   
    public double estado()
    {
        return getSaldo();
    }
    
    /**
     * Si la cantidad a ingresar es negativa imprime  "No se puede ingresar
     * una cantidad negativa".
     * El saldo se incrementará en el importe ingresado, @cantidad.
     */

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    
    /**
     * Si la cantidad a retirar es negativa o igual a cero imprime  
     * "No se puede retirar una cantidad negativa".
     * Si el saldo actual @estado() es menor que la cantidad a retirar @cantidad,
     * se imprimirá "No se hay suficiente saldo".
     * El saldo disminuirá en el importe retirado, @cantidad.
     */

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
