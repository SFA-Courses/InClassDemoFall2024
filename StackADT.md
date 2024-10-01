# Stack ADT
This describes the operations on a stack. The items in the stack will be denoted by StackItemType.

## +createStack()
Create an empty stack.

## +isEmpty() : boolean
This returns true when the stack is empty; returns false otherwise.

## +push(newItem : StackItemType) 
Adds a new item to the top of the stack.

## +pop() : StackItemType throws StackException
Retrieves and removes the item on the top of the stack. Throws an exception if we attempt to remove an item from an empty stack.

## +peek() : : StackItemType throws StackException
Retrieves the item on the top of the stack without altering the stack. Throws an exception if we attempt to remove an item from an empty stack.

## +popAll() 
Removes all items from the stack. 