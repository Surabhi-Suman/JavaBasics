import java.util.ArrayList;
import java.util.List;

public class CallByReferenceQuestions {
    public static void main(String[] args)
    {
        Integer a=1;
        callPrimitiveorItsWrapper(a);
        System.out.println(a);
        String text = new String("Testing String");
        callString(text);
        System.out.println(text);
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        callList(integerList);
        System.out.println(integerList.size());
        TestObject testObject = new TestObject("Surabhi",1);
        callObject(testObject);
        System.out.println(testObject);
    }

    //calling Primitive or its wrapper
    public static void callPrimitiveorItsWrapper(Integer a)
    {
        a=15;
    }

    public static void callString(String str)
    {
        str = "Testing Object";
    }

    public static void callList(List list)
    {
        list.add(5);
    }

    public static void callObject(TestObject called)
    {
        called.setName("Shambhawi");
        called.setId(2);
    }

    /*
    Output of the above program is like this

    1
Testing String
4
Shambhawi:2

Note : This question was asked to me in Java coding round in Morgan Stanley.

     */


}
