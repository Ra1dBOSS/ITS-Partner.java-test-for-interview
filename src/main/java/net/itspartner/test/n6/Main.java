package net.itspartner.test.n6;

/**
 * Task: Process file resources/n6/source in a special way and write result to the new file.
 * Source file contains data in following format:
 * username,password,email
 *
 * You need to:
 * 1) remove duplicates by username
 * 2) make email lowercase
 * 3) remove records where password doesn't meet following conditions:
 * 3.1) password length must be at least 8 symbols
 * 3.2) password must contain at least one special character (#, @, -)
 * 3.3) password must contain exactly one uppercase character
 *
 * All the rest records should be saved in new file in the same format.
 */
public class Main {

    public static boolean passwordCheck(String password) {

        boolean f = false;
        int k = 0;
        if (password.length() < 8)
            return false;
        for (int i = 0; i<password.length(); i++) {
            if (("A" <= password[i]) && (password[i] <= "Z"))
                k++;
            if (!f && ((password[i] == "#") || (password[i] == "-") || (password[i] == "@")))
                f = true;
            }
        }
        if ((k == 1) && f)
            return true;
        return false;
    }

    public static void main(String[] args) {

    }
}
