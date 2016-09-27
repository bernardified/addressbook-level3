package seedu.addressbook.storage;

import seedu.addressbook.data.AddressBook;
import seedu.addressbook.data.exception.IllegalValueException;

public interface Storage {
    
    /**
     * Signals that the given file path does not fulfill the storage filepath constraints.
     */
    public static class InvalidStorageFilePathException extends IllegalValueException {
        public InvalidStorageFilePathException(String message) {
            super(message);
        }
    }

    /**
     * Signals that some error has occured while trying to convert and read/write data between the application
     * and the storage file.
     */
    public static class StorageOperationException extends Exception {
        public StorageOperationException(String message) {
            super(message);
        }
    }
    
    /**
     * Creates a new Storage object
     * @throws InvalidStorageFilePathException if the default path is invalid
     */
    public Storage initialise() throws InvalidStorageFilePathException;
    
    /**
     * Saves all data to this storage.
     *
     * @throws StorageOperationException if there were errors converting and/or storing data to file.
     */
    public void save(AddressBook addressBook) throws StorageOperationException;
    
    /**
     * Loads data from this storage.
     *
     * @throws StorageOperationException if there were errors reading and/or converting data from file.
     */
    public AddressBook load() throws StorageOperationException;
    
    String getPath();

}
