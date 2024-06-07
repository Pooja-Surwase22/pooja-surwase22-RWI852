interface pooja{
    void gym();
}

class abhinav implements pooja{
    public void gym(){
        System.out.println("gym");
    }
}

public class Intarf {
    public static void main(String[] args) {
        abhinav sc = new abhinav();
        sc.gym();
    }
    
}
