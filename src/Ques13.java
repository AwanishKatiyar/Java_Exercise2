class NoNameFoundException extends Exception {
    public NoNameFoundException(String message) {
        super(message);
    }
}
class Manager {
    public Ques13 create(String name) throws NoNameFoundException {
        if (!name.equals("Awanish")) {
            return new Ques13();
        } else {
            throw new NoNameFoundException("Name " + name + " Already created");
        }
    }
}
public class Ques13 {
    public static void main(String[] args) {
        String name = "Awanish";
        Manager mgr = new Manager();
        try {
            Ques13 obj = mgr.create(name);
        } catch (NoNameFoundException ex) {
            System.out.println(ex);
        }
    }
}
