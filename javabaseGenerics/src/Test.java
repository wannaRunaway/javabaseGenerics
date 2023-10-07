public class Test {
    public static void main(String[] args) {
        System.out.println("test "+intab(1,2)+" float: "+floatab(1.1F, 2.22F)+" double "+doubleab(1.11
        , 2.22));
        System.out.println("secondline "+tab(1,2)+" splite "+tab(2L, 3.3));
        var typeclass = new Typeclass<Integer>();
        typeclass.setTdata(10);
        var typeclass2 = new Typeclass<String>();
        typeclass2.setTdata("aaaa");
        System.out.println("outprintln:  "+typeclass.getTdata()+typeclass2.getTdata());
        var manyTypeclass = new ManyTypeclass<Integer, String, Typeclass<String>>();
        manyTypeclass.setTdata(20);
        manyTypeclass.setKdata("kdata");
        var typeclassinside = new Typeclass<String>();
        typeclassinside.setTdata("stringInside");
        manyTypeclass.setVdata(typeclassinside);
        System.out.println(" T "+manyTypeclass.getTdata()+" K "+manyTypeclass.getKdata() +
                " V "+manyTypeclass.getVdata().getTdata());
        Info<String> info = new InfoImp<>("interfaceInfodata");
        System.out.println(info.getValue());
    }

    public static int intab(int a, int b){
        return a+b;
    }

    public static float floatab(float a, float b){
        return a+b;
    }

    public static double doubleab(double a, double b){
        return a+b;
    }

    //类型中的泛型在使用时指定
    public static <A extends Number> double tab(A a, A b){
        return a.doubleValue()+b.doubleValue();
    }
}

