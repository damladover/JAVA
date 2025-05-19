public class FindMaximum {

	public static void main(String[] args){
		if(args.length >0 ) {
            int value1 = Integer.parseInt(args[0]);
            int value2 = Integer.parseInt(args[1]);


            //int value1 = 1;
            //int value2 = 4;


            boolean someCondition = value1 > value2;

            int result = someCondition ? value1 : value2;

            System.out.println(result);
        }
	}
}