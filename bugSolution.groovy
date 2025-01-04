def list = [1, 2, 3, 4, 5]

// Correct way 1: Use collect to return a new list
def doubledList = list.collect { it * 2 }
println doubledList // Output: [2, 4, 6, 8, 10]

// Correct way 2: Modify the list in place using each and an index
list.eachWithIndex { item, index ->
  list[index] = item * 2
}
println list // Output: [2, 4, 6, 8, 10]

//Correct way 3: Using the spread operator to create a new list
def doubledList2 = [...list].each { it *= 2 }
println doubledList2 //Output: [2, 4, 6, 8, 10]