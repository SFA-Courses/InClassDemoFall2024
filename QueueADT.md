## QueueADT
This abstract data type will provide operations for a queue (or line) for generic (QueueItemType) data types.

# +createQueue() 
Creates an empty queue.

# +isEmpty() : boolean
Returns true if the queue is empty; false otherwise.

# +removeAll() 
Removes all the items in the queue.

# +peek() : QueueItemType throws QueueException
Retrieves and returns the items at the front of the queue without removing the item or changing the queue. Throws an exception if the queue is empty.

# +dequeue() : QueueItemType throws QueueException
Retrieves, removes, and returns the item at the front of the queue. Throws an exception if the queue is empty.

# +enqueue(item : QueueItemType)
Adds the given item to the end of the queue. If the queue has a maximum capacity, then an exception is thrown when the queue is full.