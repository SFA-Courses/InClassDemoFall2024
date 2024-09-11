public class FavoriteList implements ListADT<Favorite> {
    private static final int MAX_FAVORITES = 50;
    private Favorite[] favorites;
    private int numFavorites;

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
        if (this.isFull())
            throw new ListException("List is full");

        if (index < 0 || index > this.size())
            throw new ListException("Index is out of bounds.");

        // shifts all the elements over one to the right
        // starting at index
        for (int i = this.size(); i > index; i--)
            this.favorites[i] = this.favorites[i-1];
        // insert new item into empty spot
        this.favorites[index] = item;

        // increase number of favorites by 1
        this.numFavorites++;
    }

    @Override
    public void remove(int index) throws ListException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public void removeAll() {        
        this.favorites = new Favorite[MAX_FAVORITES];
        this.numFavorites = 0;
    }

    @Override
    public Favorite get(int index) throws ListException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

}
