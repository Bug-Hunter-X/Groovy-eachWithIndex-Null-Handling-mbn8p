```groovy
def unusualBug(list) {
  list.eachWithIndex { item, index ->
    if (item == null) {
      println "Null item found at index: $index"
      //This will not throw exception, but will silently skip the null value.
      return //This return statement only exits the eachWithIndex loop, not the unusualBug function
    }
    println "Processing item: $item at index: $index"
  }
}

 unusualBug(["apple", null, "banana"])
```