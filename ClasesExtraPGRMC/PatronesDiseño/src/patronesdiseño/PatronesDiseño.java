package patronesdiseño;

/**
 *
 * @author Walter
 */
public class PatronesDiseño {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona walter = new Persona.PersonaBuilder()
                .buildNombre("Walter")
                .buildApellido("Martin Lopes")
                .buildEdad(24)
                .build();
        
        System.out.println(walter.toString());
    }
    
}
