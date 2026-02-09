# Arrays
### Key Characteristics
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
### Key Characteristics of List Interface
- **Ordered Collection:** Elements maintain their insertion order
- **Index-Based Access:** Elements can be accessed by their integer index (position)
- **Allows Duplicates:** The same element can appear multiple times in the list
- **Null Elements:** Most List implementations allow null elements

### Common List Operations
- **add(E element):** Appends element to the end of list
- **add(int index, E element):** Inserts element at specified position
- **get(int index):** Returns element at specified position
- **remove(int index):** Removes element at specified position
- **set(int index, E element):** Replaces element at specified position

### Common Implementations
- **ArrayList:** Dynamic array implementation
- **LinkedList:** Doubly-linked list implementation
- **Vector:** Thread-safe dynamic array (legacy class)
- **Stack:** LIFO stack implementation (extends Vector)

# Stacks
### Key Characteristics
- **LIFO Order:** Last element in is the first element out
- **Push Operation:** Adds an element to the top of the stack
- **Pop Operation:** Removes and returns the top element
- **Peek Operation:** Views the top element without removing it
- **Fixed or Dynamic Size:** Can be implemented with fixed or resizable capacity

### Common Stack Operations
- **push(E element):** Adds element to top of stack
- **pop():** Removes and returns top element
- **peek():** Returns top element without removing it
- **empty():** Returns true if stack contains no elements
- **search(Object o):** Returns position of element from top of stack

### Real-World Examples
- **Undo/Redo Operations:** In text editors and graphics programs
- **Browser History:** Back/Forward navigation
- **Function Call Management:** Program execution stack
- **Expression Evaluation:** Parsing mathematical expressions

### Java Implementation
- **The built-in Stack class** (extends Vector)
- **ArrayDeque** as a more efficient alternative
- **ArrayList or LinkedList** with stack operations
- **Array-based** custom implementation

# Queues
### Key Characteristics
- **FIFO Order:** First element in is the first element out
- **Enqueue Operation:** Adds an element to the back of the queue
- **Dequeue Operation:** Removes and returns the front element
- **Peek Operation:** Views the front element without removing it
- **Bounded or Unbounded:** Can have fixed or dynamic capacity

### Common Queue Operations
- offer(E element): Adds element to back of queue
- poll(): Removes and returns front element
- peek(): Returns front element without removing it
- isEmpty(): Returns true if queue contains no elements
- size(): Returns number of elements in queue

### Real-World Examples
- **Print Job Management:** Documents waiting to be printed
- **Customer Service Systems:** Managing customer support tickets
- **Task Scheduling:** Process and thread management in operating systems
- **Buffering:** Managing data streams in networking

### Java Implementation
- The **Queue** interface with implementations like LinkedList
- **ArrayDeque** for efficient double-ended queue operations
- **PriorityQueue** for priority-based ordering
- Custom array-based or linked implementations

# Linked Lists
### Key Characteristics
- **Dynamic Size:** Grows and shrinks as needed
- **Non-Contiguous Memory:** Elements not stored in contiguous memory locations
- **Bidirectional:** Can be traversed in both directions (in doubly-linked lists)
- **Reference-Based:** Uses references to connect nodes
- **No Index-Based Access:** Must traverse from start/end to reach elements

### Common LikedList Operations
- **add(E element):** Adds an element to the end of the list
- **add(int index, E element):** Inserts element at specified position
- **remove(Object o):** Removes first occurrence of element
- **get(int index):** Returns element at specified position
- **set(int index, E element):** Replaces element at specified position

### Advantages
- Efficient insertion/deletion at beginning and end (O(1))
- Dynamic memory allocation
- No need to resize or reallocate
- Memory efficient for large elements

### Disadvantages
- No random access to elements
- Extra memory for storing references
- Not cache-friendly due to non-contiguous storage
- Sequential access can be slower than arrays

### Java Implementation
- The built-in LinkedList class
- Custom implementation with Node class
- As a doubly-linked or singly-linked list
- With various specialized behaviors (circular, skip lists, etc.)

# Sets
### Key Characteristics
- **No Duplicates:** Each element can appear only once in a set
- **Unordered:** Elements typically have no defined order (except for LinkedHashSet)
- **Null Elements:** Some implementations allow null elements, others don't
- **Fast Lookup:** Generally provides fast lookup operations
- **Dynamic Size:** Grows and shrinks as needed

### Common Set Operations
- **add(E element):** Adds element if not already present
- **remove(Object o):** Removes specified element if present
- **contains(Object o):** Returns true if element exists in set
- **size():** Returns number of elements in set
- **isEmpty():** Returns true if set contains no elements

### Set Implementations in Java
- **HashSet:** Most common implementation, uses hash table
- **TreeSet:** Sorted set based on tree structure
- **LinkedHashSet:** Hash table with linked list, maintains insertion order
- **EnumSet:** Specialized implementation for enum types

### Common Use Cases
- **Removing Duplicates:** Converting collections to sets
- **Membership Testing:** Checking if elements exist
- **Mathematical Set Operations:** Union, intersection, difference
- **Unique Constraint:** Ensuring uniqueness in data
- **Caching:** Storing unique values for quick lookup

# Maps
### Key Characteristics
- **Key-Value Pairs:** Each element consists of a key and associated value
- **Unique Keys:** No duplicate keys allowed, but values can be duplicated
- **Null Handling:** Some implementations allow null keys and values
- **Dynamic Size:** Grows and shrinks as needed
- **Fast Access:** Provides quick lookup by key

### Common Map Operations
- **put(K key, V value):** Associates key with value
- **get(Object key):** Returns value associated with key
- **remove(Object key):** Removes entry for specified key
- **containsKey(Object key):** Checks if key exists
- **containsValue(Object value):** Checks if value exists

### Map Implementations in Java
- **HashMap:** Most common implementation, uses hash table
- **TreeMap:** Sorted map based red-black tree
- **LinkedHashMap:** Hash table with linked list, maintains insertion order
- **Hashtable:** Thread-safe legacy class (synchronized)

### Common Use Cases
- **Caching:** Storing computed results
- **Counting:** Tracking frequency of items
- **Lookup Tables:** Quick data retrieval
- **Dictionaries:** Word definitions or translations
- **Configuration:** Storing settings as key-value pairs