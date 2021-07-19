public class Addition implements CalculeAbstract{

    @Override
    public int calcule(int a,int b) {
        System.out.println("inside class addition");
        return a+b;
    }
    
}