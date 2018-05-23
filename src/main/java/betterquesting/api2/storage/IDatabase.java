package betterquesting.api2.storage;

public interface IDatabase<T>
{
    int nextID();
    
    //T createNew(int id); // Probably useful in future
    
    DBEntry<T> add(int id, T value);
    boolean removeID(int key);
    boolean removeValue(T value);
    
    int getID(T value);
    T getValue(int id);
    
    int size();
    void reset();
    
    DBEntry<T>[] getEntries();
}
