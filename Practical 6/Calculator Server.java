import java.rmi.registry.Registry;
public class CalcServer {
    public static void main(String args[]) {
        try {
            Registry r = java.rmi.registry.LocateRegistry.createRegistry(1099);
            r.rebind("Calc", new CalcRmi());
            System.out.println("Server connected");
        } catch (Exception e) {
            System.out.println("Server not connected " + e);
        }
    }
}