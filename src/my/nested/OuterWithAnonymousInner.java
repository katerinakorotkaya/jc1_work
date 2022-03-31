package my.nested;

public class OuterWithAnonymousInner {
    public void buildAnonymousInner() {
        getSomeInterface(new SomeInterface() {
            @Override
            public void doSomething() {
                System.out.println("Do something #1");
            }
        });
    }

    public void buildAnotherAnonymous() {
        getSomeInterface(new SomeInterface() {
            @Override
            public void doSomething() {
                System.out.println("Another inner class implementation #2");
            }
        });
    }

    private void getSomeInterface(SomeInterface someInterface) {
        someInterface.doSomething();
    }

    public static void main(String[] args) {
        new OuterWithAnonymousInner().buildAnonymousInner();
        new OuterWithAnonymousInner().buildAnotherAnonymous();
    }
}

interface SomeInterface {
    void doSomething();
}

