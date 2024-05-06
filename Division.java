public class Division {
    // nombre de la clase
    private double a,b,r;
    // declaracion de variable
    public double mostrarDivision(double a, double b){
    // metodo o comportamiento de la clase
    r= this.a / this.b;
    // referencia de las variables, realizando la operacion
    return r;
    // retorno de la operacion
    }
    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }
    public double getR() {
        this.r=this.a / this.b;
        return r;
    }
    public void setR(double r) {
        this.r = r;
    }
    @Override
    public String toString() {
        return "Division [a=" + a + ", b=" + b + ", r=" + r + "]";
    }
}
// cierre del progama con llaves