package function;

import java.util.ArrayList;
import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
        Function<String,Integer> function1= new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        };



        Integer result = function1.apply("123");


        Function<String,Member> function2=(name)->new Member(name);

        Member member = function2.apply("name");
    }

    static class Member{
        String username;

        public Member(String username) {
            this.username = username;
        }
    }
}
