package defaultMethodsInInterface;

public class FormulaImpl {

	public static void main(String[] args) {
	Formula formula = new  Formula() {
		
		
		@Override
		public double calculate(int a) {
			System.out.println("in annonymous ");
			return sqrt(a);
		}
	};
	formula.calculate(20);
	}

	

}
