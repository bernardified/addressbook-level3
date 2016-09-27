package seedu.addressbook.storage;

import seedu.addressbook.data.AddressBook;

public class StorageStub implements Storage {

    /**
     * Creates StorageStub object
     */
    @Override
    public Storage initialise() throws InvalidStorageFilePathException {
        return new StorageStub();
    }
    
    /**
     * Does nothing
     *
     */
    @Override
    public void save(AddressBook addressBook) throws StorageOperationException {
        
    }
    
    /**
     * @return null
     */
    public AddressBook load() throws StorageOperationException {
        return null;
    }
    
    /**
     *  @return null
     */
    public String getPath() {
        return null;
    }
}
