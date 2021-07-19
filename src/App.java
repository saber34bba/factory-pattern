public class App {
    public static void main(String[] args) throws Exception {
        Factory factory =new Factory();
       CalculeAbstract calculeAbstract;
       calculeAbstract=factory.test("Addition");
       System.out.println("addition: "+calculeAbstract.calcule(10, 10));
       calculeAbstract=factory.test("");
       System.out.println("multiplication: "+calculeAbstract.calcule(10, 10));
    }
}
