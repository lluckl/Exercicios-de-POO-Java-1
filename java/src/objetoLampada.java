public class objetoLampada {
    public String Marca;
    public String modelo;
    public String Cor;
    public float Valor;
    public float volts;

    void lampada() {
        System.out.println("Valor:"+this.Valor);
        System.out.println("Marca:"+this.Marca);
        System.out.println("Modelo:"+this.modelo);
        System.out.println("Volts:"+this.volts);
        System.out.println("Cor:"+this.Cor);
    }
}
