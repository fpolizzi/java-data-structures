# Arrays 
 - **Fixed Size:** Once created, an array's size cannot be changed
 - **Zero-Based Indexing:** Array indices start at 0
 - **Homogeneous Elements:** All elements must be of the same type
 - **Random Access:** Index can access elements directly in O(1) time

# 2-Dimensional Arrays
 - **Nested Structure:** Consists of multiple arrays arranged in rows and columns
 - **Indexing:** Accessed using row and column indices
 - **Traversal:** Can be traversed row by row or column by column
 - **Jagged Arrays:** Can have different numbers of rows and columns
 - **Good choice for matrix** (grid or table use cases)
 - **Ideal for board games** (chess board, Conways Game of Life, etc.)

# ArrayLists
 - **Dynamic Size:** Can grow or shrink as needed
 - **Zero-Based Indexing:** Similar to arrays
 - **Homogeneous Elements:** All elements must be of the same type
 - **Random Access:** Index can access elements directly in O(1) time
 - **Efficient Insertion and Deletion:** Supports adding and removing elements efficiently
 - **Good choice for dynamic data** (collections, lists, etc.)
 - **Ideal for dynamic programming** (dynamic programming, etc.)

# Stacks
- **LIFO Order:** Last element in is the first element out
- **Push Operation:** Adds an element to the top of the stack
- **Pop Operation:** Removes and returns the top element
- **Peek Operation:** Views the top element without removing it
- **Fixed or Dynamic Size:** Can be implemented with fixed or resizable capacity
- **push(E element):** Adds element to top of stack
- **pop():** Removes and returns top element
- **peek():** Returns top element without removing it
- **empty():** Returns true if stack contains no elements
- **search(Object o):** Returns position of element from top of stack
- **Undo/Redo Operations:** In text editors and graphics programs
- **Browser History:** Back/Forward navigation
- **Function Call Management:** Program execution stack
- **Expression Evaluation:** Parsing mathematical expressions
- **The built-in Stack class** (extends Vector)
- **ArrayDeque** as a more efficient alternative
- **ArrayList or LinkedList** with stack operations
- **Array-based** custom implementation