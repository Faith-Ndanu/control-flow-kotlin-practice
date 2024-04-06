
fun main() {

    noteApp("text")
    noteApp("words")
    noteApp("images")
    noteApp("texts")
    noteApp("deleteContent")
    numbers()
    println(names(arrayOf("Edan","Ainembambazi","faith","Yvonne","Nabacwa")))
    party(4)
    party(12)
    party(23)
}
fun noteApp(notes:String,){
    if(notes=="text"){
        println("newText")
    }
    else if(notes=="words"){
        println("addText")
    }
    else if(notes=="texts"){
        println("editText")
    }
    else if(notes=="images") {
        println("addImages")
    }
    else{
        println("deleteContent")
    }
}
//Create a function that prints out all odd numbers between 1 and 100
fun numbers(){
    for (num in 1..100){
        if(num%2==0)
            println(num)
    }
}
//create an array that takes in an array of numbers and returns the number of names longer than 5 characters

fun names(name:Array<String>):Int{
    return name.count{it.length>5}
}

//
fun party(age:Int){
    if(age<6){
        println("milk")
    }
    else if (age<=15 &&age >6){
        println("fanta orange")
    }
    else{
        println("cocacola")
    }
}















