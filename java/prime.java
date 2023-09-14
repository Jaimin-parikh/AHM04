
public class prime {
    public static void main(String[] args) {
        for (int i=2;i<50;i++){
            Prime(i);
        }
    }
    public static void Prime(int i){
        boolean a = false;
        for(int j=2;j<i;j++){
            
            if(i % j == 0){
               a = false;
                break;
            }
            else
                a = true;
            }
        if(a == true)
            System.out.print(i+ " ");
    

}
}

