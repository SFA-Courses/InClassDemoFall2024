# ListADT

+createList() - Creates an empty list

+isEmpty() : boolean - determines whether or not the list is empty

+size() : integer - returns the number of items on the list

+add(index : integer, item : ListItemType) - inserts the given item at the given provided; throws and exception if the index is not in the range 0 <= index < size(). If index < size(), items are renumbered, so that the item at index moves to index + 1, the item at index +1 moves to index +2, and so on.

+remove(index : integer) - removes the item at the index given. If index < size() - 1, then the itemas are renumbered so that the item at index+1 becomes the item at index, the item at index +2, becomes the intem at index+1, and so on. 
Throws an exception when index is out of range or if the list is empty.

+removeAll() - removes all the items from the list

+get(index : integer) : ListObjectType - returns the item at the given index if 0 <= index < size(). Throws an exception if the index is out of range.