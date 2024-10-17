class Solution {   
    public int numUniqueEmails(String[] emails) {
        // HashSet automatically handles duplicate entries by not allowing them
        Set<String> uniqueEmails = new HashSet<>();

        // Iterate through each email
        for (int i = 0; i < emails.length; i++) {
            String email = emails[i];
            
            // Split the email into local and domain parts
            String[] arr = email.split("@");
            String localName = arr[0];
            String domainName = arr[1];

            // Split the local name at the '+' sign and keep the first part only
            // If '+' exists, we discard everything after it
            if (localName.contains("+")) {
                localName = localName.substring(0, localName.indexOf("+"));
            }

            // Replace all dots in the local name with an empty string
            localName = localName.replace(".", "");

            // Reconstruct the formatted email and add it to the uniqueEmails set
            String formattedEmail = localName + "@" + domainName;
            // HashSet only stores unique values, so if the email is already present, it won't be added again
            uniqueEmails.add(formattedEmail);
        }

        return uniqueEmails.size();
    }
}


//-----------------------------------------------------------

class Solution {
    // Helper method to format email address according to the specified rules
    // Remove everything after '+' in the local part of the email.
    // Remove all dots ('.') in the local part.
    private String getFormattedEmail(String email) {
        // Split the email into local and domain parts
        String[] arr = email.split("@");
        String localName = arr[0];
        String domainName = arr[1];

        // Split the local name at the '+' sign and keep the first part only
        String[] arrLocalWithPlus = localName.split("\\+");
        localName = arrLocalWithPlus[0];

        // Replace all dots in the local name with an empty string
        localName = localName.replace(".", "");

        // Reconstruct and return the formatted email address
        return localName + "@" + domainName;
    }
    
    public int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmails = new HashSet<>();

        // Iterate through each email
        for (int i = 0; i < emails.length; i++) {
            // Get the formatted version of the email
            String formattedEmail = getFormattedEmail(emails[i]);
            // Add the formatted email to the set (duplicates will be ignored by the set)
            uniqueEmails.add(formattedEmail);
        }

        return uniqueEmails.size();
    }
}