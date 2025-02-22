```groovy
def handleNulls(list) {
  list.eachWithIndex { item, index ->
    try {
      println "Processing item: $item at index: $index"
    } catch (NullPointerException e) {
      println "Null item found at index: $index. Handling the exception."
    }
  }
}

def filterNulls(list) {
  list.findAll {it != null}.eachWithIndex {item, index ->
    println "Processing item: $item at index: $index"
  }
}

handleNulls(["apple", null, "banana"])
println "\nUsing filterNulls:\n"
filterNulls(["apple", null, "banana"])
```