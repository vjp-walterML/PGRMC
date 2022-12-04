package bosque;

public class Bosque {

    public static void main(String[] args) {
        final Arbol arbolCentenario = new Arbol(5);

        System.out.println("Puntero arbolCentenario: "+arbolCentenario);

        arbolCentenario.setHojas(500);
        
        Arbol arbolMilenario = arbolCentenario;
        
        System.out.println("ArbolCentenario: "+arbolCentenario.getHojas());
        
        System.out.println("ArbolMilenario: "+arbolMilenario.getHojas());

        System.out.println("Puntero a arbolCentenario: "+arbolCentenario);
        
        System.out.println("Puntero a arbolMilenario: "+arbolMilenario);
        
        arbolCentenario.setHojas(1000);
        
        System.out.println("ArbolCentenario: "+arbolCentenario.getHojas());
        
        System.out.println("ArbolMilenario: "+arbolMilenario.getHojas());
        
    }

}
