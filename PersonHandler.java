
/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;
    String firstName;
    String lastName;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        String result = "";
        int count = 0;
        while(count < personArray.length){
            Person identity = personArray[count];
            result += identity.toString();
            count++;
        }
        return result;
    }

    public String forLoop() {
        String result = "";
        for(int i=0; i < personArray.length; i++){
            Person identity = personArray[i];
            result += identity.toString();
        }
        return result;
    }

    public String forEachLoop() {
        String result = "";
        for(Person person: personArray){
            Person identity = (person);
            result += identity.toString();
        }
        return result;
    }

    public Person[] getPersonArray() {
        return personArray;
    }
}
