class Satu{
    Satu(){
        System.out.println("Satu...");
    }
}
class Dua extends Satu{
    Dua(){
        System.out.println("Dua....");
    }
}
class Tiga extends Dua{
    Tiga(){
        System.out.println("Tiga...");
    }
}
class Empat extends Tiga{
    Empat(){
        System.out.println("Empat...");
    }
}

public class TestTururnan {
    public static void main(String[] a){
        new Empat();
    }
}