# Fall 2024 Lab 12: APIs

## DirManager API
Issue: The newDirectory method uses integer return codes to indicate success or failure. This approach is outdated and non-descriptive, making the API harder to use and less intuitive. Using exceptions for error handling is a better practice.

Fix: Update the newDirectory method to throw exceptions for specific errors (e.g., DirectoryExistsException, InvalidPathException). This makes the API clearer and adheres to modern design principles.

## Library API
Issue: The getBooks method incorrectly splits the userId string using ":" and assigns the first part to name and the second part to id. This causes incorrect functionality and potential runtime exceptions for malformed userId.

Fix: Fix the logic to correctly split the userId into id (before :) and name (after :). Add validation for malformed userId and throw a descriptive exception if needed.

## Weather API
Issue 1: The setLengthScale method uses a boolean flag (true for inches, false for millimeters). Boolean flags are non-intuitive for API users, and the API should use an enumeration for better clarity.

Fix 1: Replace the boolean parameter with an enumeration (LengthScale) to specify the scale explicitly.

Issue 2: The getRainfall method applies the conversion incorrectly. The returned value should be in the selected unit.

Fix 2: Ensure the getRainfall method properly converts values based on the selected unit.