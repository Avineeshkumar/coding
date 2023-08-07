package coding;

class OuterClass {
    private void privateMethod() {
        System.out.println("Private method in the outer class");
    }

    // Inner class
    class InnerClass extends OuterClass {
        // Compiler error: Cannot override the private method
        // @Override
        // private void privateMethod() {
        //     System.out.println("Overridden private method in the inner class");
        // }
    }
    
    
    public static void main(String[] args) {
		
	}
}
