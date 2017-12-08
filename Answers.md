# Answers.md
## By Larisa Kreismanis and Nathan Bullock

### 1.) What is the complexity of each of the four search methods in terms of array or list size n?
- findTeamPosition() in an array complexity: O(n)
- findTeamPosition() in a list complexity: O(n)
- findTeamMinFunding() complexity: O(n)
- findTeamMinFundingFast() complexity: O(log(n))

### 2.) What happens in the case of binary search if the array is not sorted?
- If the array is not sorted in the case of a binary search, the results will be undefined and the search will be unsuccessful.

### 3.) What is the purpose of constructor argument validity checking?
- The purpose of constructor argument validity checking is to ensure that values are not null or empty, especially if those values are used in other methods in classes.

### 4.) What is the purpose of using the keyword `final` with variables and arguments?
- The purpose of using the keyword `final` with variables and arguments is to assign a constant value that cannot be changed or overriden by subclasses.  `Final` prevents the user from being able to change that variable or argument.

### 5.) What are alternatives to using `Optional` and how do they compare?
- Alternatives to using `Optional` include using get() calls instead. The advantage of using `Optional` is to avoid null pointer exceptions that arise at run-time.