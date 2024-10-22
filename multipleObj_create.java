class MultipleObj_create{
    void method1(){
        System.out.println("method 1 call");
    }
    public static void main(String[] args) {
        MultipleObj_create obj1=new MultipleObj_create();
        MultipleObj_create obj2=new MultipleObj_create();
        MultipleObj_create obj3=new MultipleObj_create();
        obj1.method1();
        obj2.method1();
        obj3.method1();

    }
}