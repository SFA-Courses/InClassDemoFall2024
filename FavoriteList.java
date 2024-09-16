public class FavoriteList implements ListADT<Favorite> {
    private static final int MAX_FAVORITES = 50;
    private Favorite[] favorites;
    private int numFavorites;

    // create an empty list
    public FavoriteList() {
        this.numFavorites = 0;
        this.favorites = new Favorite[MAX_FAVORITES];
    }

    @Override
    public boolean isEmpty() {
        return (this.numFavorites == 0);
    }

    public boolean isFull() {
        return (this.numFavorites == MAX_FAVORITES);
    }

    @Override
    public int size() {
        return this.numFavorites;
    }

    @Override
    public void add(int index, Favorite item) throws ListException {
        // check for exceptions
        if (this.isFull())
            throw new ListException("List is at maximum capacity.");

        if (index < 0)
            throw new ListException("Index must be non-negative.");

        if (index > this.size())
            throw new ListException("Index outside of allowable range.");

        // shift the elements to the right
        for (int i = this.size(); i > index; i--)
            this.favorites[i] = this.favorites[i - 1];

        // insert the new element
        this.favorites[index] = item;

        // update the number of favorites
        this.numFavorites++;
    }

    @Override
    public void remove(int index) throws ListException {
        if (index < 0 || index >= this.size())
            throw new ListException("Index out of range.");

        if (index == MAX_FAVORITES - 1)
            this.favorites[index] = null;
        else {
            // shift everything after the element to remove
            // to the left
            for (int i = index; i < this.size(); i++)
                this.favorites[i] = this.favorites[i + 1];
        }

        // reduce the size of the list by 1
        this.numFavorites--;
    }

    @Override
    public void removeAll() {
        this.numFavorites = 0;
        this.favorites = new Favorite[MAX_FAVORITES];
    }

    @Override
    public Favorite get(int index) throws ListException {
        if (index < 0 || index >= this.size())
            throw new ListException("Index out of range.");

        return this.favorites[index];
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < this.size(); i++)
            s = s + i + ": " + this.get(i) + " \n ";

        return s;

    }

}
