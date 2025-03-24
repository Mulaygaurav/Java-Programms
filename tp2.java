class tp {

    public void m() {
        System.out.println("Hello, I am m of Parent class");
    }

    public void m1() {
        System.out.println("Hello, I am m1 of Parent class");
    }
}

class tp2 extends tp {

    
    public void m() {
        System.out.println("Hello, I am m of Child class");
    }

    public static void main(String[] args) {
        tp2 t = new tp2();
        t.m();
	tp t1 = new tp2();
        t.m1(); // This will call the overridden method in tp2
    }
}
