/*
* Nell'ambito di un programma di geometria, si implementi la classe Triangolo
* il cui costruttore accetta le misure dei tre lati. Se tali misure non danno luogo
* ad un triangolo, il costruttore deve lanciare un'eccezione.
* Il metodo getArea restituisce l'area di questo triangolo.
* Si implementino anche la classe Triangolo.Rettangolo, il cui costruttore accetta
* le misure dei due cateti, e la classe Triangolo.Isoscele, il cui costruttore accetta le
* misure della base e di uno degli altri lati.
*
* Si ricordi che:
* Tre numeri a, b e c possono essere i lati di un triangolo a patto che a<b+c,
* b<a+c e c<a+b
*
* L'area di un triangolo di lati a, b e c è data da sqrt(p(p-a)(p-b)(p-c))
* dove p è il semiperimetro
*
* Esempio d'uso:
* Triangolo x = new Triangolo(10,20,25);
* Triangolo y = new Triangolo.Rettangolo(5,8);
* Triangolo z = new Triangolo.Isoscele(6,5);
* System.out.println(x.getArea());
* System.out.println(y.getArea());
* System.out.println(z.getArea());
*
* Output dell'esempio d'uso:
* 94.9918
* 19.9999
* 12.0
* */

public class Triangolo {

    private final int l1;
    private final int l2;
    private final int l3;
    private final double semip;

    public Triangolo(int l1, int l2, int l3) throws IllegalArgumentException {
        if ((l1<l2+l3) && (l2<l1+l3) && (l3<l2+l1)) {
            this.l1 = l1;
            this.l2 = l2;
            this.l3 = l3;
            semip = calcolaSemiperimetro();
        } else throw new IllegalArgumentException("Misure non valide");
    }

    class Rettangolo {
        private double a;
    }

    class Isoscele {
        private double b;
    }

    private double calcolaSemiperimetro(){
        return (l1+l2+l3)/2f;
    }

    public double getArea(){
        return Math.sqrt(semip*(semip-l1)*(semip-l2)*(semip-l3));
    }
}
