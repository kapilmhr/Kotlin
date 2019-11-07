package app.frantic.basickotlin

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // ** Variable Declaration **

        //val declaration example
        val a: Int = 1  // immediate assignment
        val b = 2   // `Int` type is inferred
        val c: Int  // Type required when no initializer is provided
        c = 3       // deferred assignment

        //val declaration example
        var x = 5
        x = x+5
        println(x)


        //** Conditionals **

        //If Else Condition
        ifelseCondition(55,66)

        //when condition
        whenCondition(5)

        var name = ArrayList<String>()
        name.add("Kapil")

        //For loop
        forLoop()
        anotherExample()

        //Function
        val sum = addValue(20,30)
        println("Sum is $sum")

        var p = Person(20,"Sujal")
        println("name ${p.name}")
        println("age ${p.age}")

    }

    private fun addValue(i: Int, j: Int):Int {
        return i+j
    }

    private fun anotherExample() {
        val items = listOf("apple", "banana", "kiwifruit")
        for (item in items) {
            println(item)
        }
    }

    private fun forLoop() {
        for (i in 1..10){
            println("Loop no. $i")
        }
    }

    private fun whenCondition(a: Int) {
        when{
            a==5 -> println("The number is 5")
            a>5 -> println("The number is greater than 5")
            else -> println("The number is less than 5")
        }
    }

    private fun ifelseCondition(a:Int,b:Int) {
        if (a>b){
            println("$a is the largest number")
        }else{
            println("$b is the largest number")

        }
    }


}
