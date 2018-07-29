package defaultMethodsInInterface;

interface Formula {
    double calculate(int a);

    default double sqrt(int a) {
    	System.out.println("Value of a : " + a);
        return Math.sqrt(a);
    }
    default double sum(int a){
    	return a+2;
    }
}
