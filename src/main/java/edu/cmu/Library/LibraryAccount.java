package edu.cmu.Library;

public class LibraryAccount {
    private LibraryService libraryService;

    /**
     * Retrieves an array of checked-out books associated with the specified user ID. 
     * If the user has no books checked out, the returned list will be empty.
     *
     * @param userId the ID of the user whose books are to be retrieved, in the format "libraryID:userName"
     * @return an array of Book objects the user has checked out
     * @throws IllegalArgumentException if the userId format is invalid
     */
    public Book[] getBooks(String userId) {
        if (userId == null || !userId.contains(":")) {
            throw new IllegalArgumentException("Invalid userId format. Expected format: libraryID:userName");
        }
        
        String[] parts = userId.split(":", 2); // Split into two parts only
        String id = parts[0];
        String name = parts[1];
        return libraryService.getBooks(name, id);
    }
}

