# Kotlin
Start kotlin today


### Variable Declaration



``` 
      Val -> assign only once. Values can’t be changed 
      Var -> value can be changed

        val declaration 
        val a: Int = 1  // immediate assignment
        val b = 2   // `Int` type is inferred
        val c: Int  // Type required when no initializer is provided
        c = 3       // deferred assignment

 //var declaration example
        var x = 5
        x = x+5
        println(x)
```


### Conditionals
``` 
        private fun ifelseCondition(a:Int,b:Int) {
        if (a>b){
            println("$a is the largest number")
        }else{
            println("$b is the largest number")

        }
    }
```

### When Condition
``` 
        private fun whenCondition(a: Int) {
        when{
            a==5 -> println("The number is 5")
            a>5 -> println("The number is greater than 5")
            else -> println("The number is less than 5")
        }
    }
```


### Loop
``` 
       private fun forLoop() {
        for (i in 1..10){
            println("Loop no. $i")
        }
    }
```

``` 
       private fun anotherExample() {
        val items = listOf("apple", "banana", "kiwifruit")
        for (item in items) {
            println(item)
        }
    }
```

### Function
   uses key word fun
   ``` 
        val sum = addValue(20,30)
        println("Sum is $sum")
         
     private fun addValue(i: Int, j: Int):Int {
        return i+j
    }
```

### Class
   uses key word fun
   ``` 
   Classes with a few primary constructor parameters can be written in a single line:
   
        var p = Person(20,"Sujal")
        
        println("name ${p.name}")
        println("age ${p.age}")
        
     data class Person(var age:Int, var name:String)

```
   
