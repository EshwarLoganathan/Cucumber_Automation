package program.org;

public class TryCatch_block {
	
	public static void main(String[] args) {
		
		try {
			
			int a= 20;
			System.out.println(a/0);
			
			
		} catch (NullPointerException e) {
			System.out.println("Handle Null Pointer ");
		}
		catch (Exception e) {
			System.out.println("Handle Arithmetic ");
			//String s = null;
			//System.out.println(s.toLowerCase());
			//System.out.println("Execution success");
		}

}
}