
package boletin33;

public class Circulo {
    
    double radio;
    static double pi;
    
public Circulo(){
    radio=radio;
    pi=pi;
    pi=3.14;
}

    public double getRadio() {
        return radio;
    }
    
    public void setRadio(double radio) {
        this.radio = radio;
    }

    public static double getPi() {
        return pi;
    }

    public static void setPi(double pi) {
        Circulo.pi = pi;
    }
    
    public double calcularArea(){
        int l=2;
        double area=  ( Math.pow(radio, l)*pi);
        return area;
    }
    public double calcularLonxitude(){
        double circunferencia = 2*pi*radio;
        return circunferencia;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio +"pi="+pi+ '}';
    }
    

}


//3- Implementa unha aplicación que nos permita traballar con circulos e circunferencias .
//Para eso crea a clase Circulo cas seguintes características :
//
//atributos : radio ( tipo double )
//Pi ( constante de tipo double e valor 3.14 )
//
//métodos : *   constructores, sen e con parámetros
//          *  métodos de acceso
//          *   calcularArea : Non recibe nada e devolve o valor da área . Para calcular radio ^ 2 utiliza a clase Math e o método pow (….)
//          *  calcularLonxitude : Non recibe nada e devolve o valor da lonxitude da circunferencias
//             Crea unha clase principal para comprobar que todo funciona ben
