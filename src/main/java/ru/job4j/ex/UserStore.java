package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User found = null;
        for (User user : users) {
            if (user.getUsername().equals(login)) {
                found = user;
                break;
            }
        }
               if (found == null) {
                   throw new UserNotFoundException("������������ �� ������");
            }
        return found;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.isValid() && user.getUsername().length() >= 3) {
            return true;
        } else {
            throw new UserInvalidException("������������ �� ��������");
        }
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
            };
        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException e) {
            System.out.println(e.getMessage());
        } catch (UserNotFoundException d) {
            System.out.println(d.getMessage());
        }
    }
}