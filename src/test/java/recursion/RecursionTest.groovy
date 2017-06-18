package recursion

import spock.lang.Specification

/**
 * Created by 111 on 6/18/2017.
 */
class RecursionTest extends Specification {
    def "test Fibonacci_Sequence"() {
        def fib = new Recursion()
        expect:
        fib.fibonacci_Sequence(a)==b
        where:
        a||b
        1||1
        2||1
        3||2
        4||3
        10||55
    }
    def "test factorial" (){
        def fib = new Recursion()
        expect:
        fib.factorial(a)==b
        where:
        a|| b
        1||1
        2||2
        3||6
        4||24

    }
}
