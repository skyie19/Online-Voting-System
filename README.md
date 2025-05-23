# Online-Voting-System
This is a simple console-based Online Voting System implemented in Java. It allows multiple users to vote for registered candidates while preventing duplicate voting by the same user. The system uses Java's HashSet to track voters and a HashMap to count votes for each candidate.

#Features Register multiple candidates. Unique voter identification using user IDs. Each voter can vote only once. Votes are counted and tallied dynamically. Display final voting results.

#Working The program first asks for the number of candidates and their names to register them. Users enter their unique User ID to vote. If the User ID has already voted, the system rejects the vote. Votes are only accepted for registered candidates. Voting continues until the user chooses to stop. Finally, the program displays the total votes received by each candidate.

#Key Java Concepts Used HashSet: To store unique voters and ensure no duplicate votes. HashMap: To store candidates and their vote counts. Scanner: For interactive user input.
