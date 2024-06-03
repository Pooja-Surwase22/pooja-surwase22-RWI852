public class Poly_overloading {
    //method overloading (compile time)
    public void pooja(int i){
        System.out.println("Hi i am first pooja");
    }
    public void pooja(){
        System.out.println("Hi i am Secound pooja ");
    }
    public static void main(String[] args) {
        Poly_overloading sc = new Poly_overloading();
        sc.pooja();
        sc.pooja(5);
    }
}
