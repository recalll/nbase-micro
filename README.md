nbase-micro
====================
This repository contains experimental algorithms used in nBase.

Algorithms to work on
-----
Queries:
```JAVA
"person name parvinder" // Expacted result - returned objects name should be parvinder and type person

"person name prashana" //Empty result

"engineers in iincore" //Persons who are engineer in IINCORE

"person with degree MS"

"article of parvinder"

Create query windows to process like this - for first one

person name parvinder

person name

name parvinder

than find out which records answting the queries.

Minimal example:



private HashMap<String, Type> nbase(){
//this method returns you small data set to lookup. 
}

private boolean isAux(HashMap<String, Type> auxL, String keyword){
//this is checking is passed keyword is Auxiliary or not 
}

private void createWindowSizes(String query_inp){
//creating window sizes for query.
}

```

Class Type is object or main Type using that class we can create any type. Triple is property of the Object, 

which holds key and value and id of parent object.
[https://schema.org](https://schema.org) gives you better idea.


Contributing
------------

Kindly create new branch while pushing/commiting. so we can differentiate.

When committing, keep all lines to less than 80 characters, and try to
follow the existing style.

Before creating a pull request, squash your commits into a single commit.

Add the comments where needed, and provide ample explanation in the
commit message.
