public class StringAutocorrect {
    //You've been tasked with writing an autocorrect service for messages sent by your legal
    //team. The messages which are sent to other lawyers need to be updated so that each message sent
    //references the lawyer's client for clarity.To do this you need to replace all instances of "you"
    //and its misspellings with "your client".
    //Complete the function so that it takes a string and replaces all instances of
    //"you", "youuu", or "u" (not case sensitive) with "your client" (always lower case).
    //Return the resulting string.
    //The Catch
    //Here's the slightly tricky part: These are informal messages, so there are different forms of "you" and "u".
    //For the purposes of this task, here's what you need to support:
    //"youuuuu" with any number of "u" characters tacked onto the end
    //"u" at the beginning, middle, or end of a string, but NOT part of a word
    //"you" but NOT as part of another word like "young" or "Bayou"
}
