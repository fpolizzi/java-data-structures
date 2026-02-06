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

# Queues
- **FIFO Order:** First element in is the first element out
- **Enqueue Operation:** Adds an element to the back of the queue
- **Dequeue Operation:** Removes and returns the front element
- **Peek Operation:** Views the front element without removing it
- **Fixed or Dynamic Size:** Can be implemented with fixed or resizable capacity
- **enqueue(E element):** Adds element to back of queue
- **dequeue():** Removes and returns front element
- **peek():** Returns the front element without removing it
- **empty():** Returns true if the queue contains no elements
- **typical use case:** Message queues, task scheduling, 
managing customer support tickets, print job management

# Linked Lists
- **Dynamic Size:** Grows and shrinks as needed
- **Non-Contiguous Memory:** Elements not stored in contiguous memory locations
- **Bidirectional:** Can be traversed in both directions (in doubly-linked lists)
- **Reference-Based:** Uses references to connect nodes
- **No Index-Based Access:** Must traverse from start/end to reach elements
- **add(E element):** Adds an element to the end of the list
- **add(int index, E element):** Inserts element at specified position
- **remove(Object o):** Removes first occurrence of element
- **get(int index):** Returns element at specified position
- **set(int index, E element):** Replaces element at specified position
- Efficient insertion/deletion at beginning and end (O(1))
- Dynamic memory allocation
- No need to resize or reallocate
- Memory efficient for large elements
- No random access to elements
- Extra memory for storing references
- Not cache-friendly due to non-contiguous storage
- Sequential access can be slower than arrays
- The built-in LinkedList class
- Custom implementation with Node class
- As a doubly-linked or singly-linked list
- With various specialized behaviors (circular, skip lists, etc.)

# Sets
- **No Duplicates:** Each element can appear only once in a set
- **Unordered:** Elements typically have no defined order (except for LinkedHashSet)
- **Null Elements:** Some implementations allow null elements, others don't
- **Fast Lookup:** Generally provides fast lookup operations
- **Dynamic Size:** Grows and shrinks as needed
- **add(E element):** Adds element if not already present
- **remove(Object o):** Removes specified element if present
- **contains(Object o):** Returns true if element exists in set
- **size():** Returns number of elements in set
- **isEmpty():** Returns true if set contains no elements
- **HashSet:** Most common implementation, uses hash table
- **TreeSet:** Sorted set based on tree structure
- **LinkedHashSet:** Hash table with linked list, maintains insertion order
- **EnumSet:** Specialized implementation for enum types
- **Removing Duplicates:** Converting collections to sets
- **Membership Testing:** Checking if elements exist
- **Mathematical Set Operations:** Union, intersection, difference
- **Unique Constraint:** Ensuring uniqueness in data
- **Caching:** Storing unique values for quick lookup