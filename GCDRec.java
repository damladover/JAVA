
public class GCDRec {
    public static void main(String[] args) {
        int a =Integer.parseInt(args[0]);
        int b =Integer.parseInt(args[1]);

        int greater=a>b ? a:b;
        int smaller=a<b ? a:b;

        System.out.println("GCD between "+greater+" and "+smaller+" is "+gcd(greater,smaller));
    }
    public static int gcd(int g, int s){
        if(s==0)
            return g;
        return gcd(s,g%s);
    }
}