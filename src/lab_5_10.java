public class lab_5_10 {
    public static void main(String[] args) throws Exception {
    //№1
    System.out.println("Завдання № 1");
    int x = 500;
    while ( x <= 650 ){
        System.out.println(x);
        x = x + 10;
    } 
    //№2
    int p = 0;
    System.out.println("Завдання № 2");
    for (int a = 2; a < 5000; a = 2 * a - 1){
        p = a;
    }
    System.out.println(p);
    //№3
    System.out.println("Завдання № 3");
    float q = 10;
    for ( float y = 1; y <= 10; y++){
        if ( q / y == Math.round( q / y )){
            System.out.println(y);
        }
    }
    //№4
    System.out.println("Завдання № 4");
    int fact = 1;
    for (int r = 10; r > 0; r--){
        fact = fact * r;
    } 
    System.out.println(fact);
    //№5
    System.out.println("Завдання № 5");
    for (int h = 0; h <= 23; h++){
        for (int m = 0; m <= 50; m++){
            if ( m == h || h == m * 10 || h * 10 == m){
                if ( h < 10 && m < 10 ){
                    System.out.println("0" + h + ":0" + m );
                }
                if ( h < 10 && m >= 10){
                    System.out.println("0" + h + ":" + m );
                }
                if ( h >= 10 && m < 10){
                        System.out.println(h + ":0" + m );
                }
                if ( h >= 10 && m >= 10 ){
                    System.out.println( h + ":" + m );
                }
            }
        }
    }
    }
}