package graph

import spock.lang.Specification

/**
 * Created by 111 on 6/18/2017.
 */
class GraphTest extends Specification {
    def "test"(){
       expect:1==1
    }
    def "test initialize Matrix by input of string"(){
        def graph = new Graph()
        def input = "AB5, BC4, CD8, DC8, DE6, AD5, CE2, EB3, AE7"
        def vertexName = "ABCDE"
        graph.initializeByMatrix(input,vertexName)
        def result = graph.getAdjacentMatrix()
        //the adjacent matrix is like this:
        //       A[0]  B[1]  C[2]  D[3]  E[4]
        //A[0]    00    5     00    5     7
        //B[1]    00    00    4     00    00
        //C[2]    00    00    00    8     2
        //D[3]    00    00    8     00    6
        //E[4]    00    3     00    00    00

        expect:
        result[startIndex][endIndex]==weight
        where:
        startIndex|endIndex||weight
        0|1||5
        4|1||3
        2|3||8
        0|4||7

    }
}
