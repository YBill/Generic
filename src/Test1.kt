/**
 * Created by Bill on 2017/8/9.
 */

fun main(args: Array<String>) {
    var arrayA: Array<A> = arrayOf(A(), A())
    var arrayB: Array<B> = arrayOf(B(), B())
    copy(arrayB, arrayA)
}

open class A
class B : A()

fun copy(from: Array<out A>, to: Array<in A>) {
    for (i in from.indices)
        to[i] = from[i]
}