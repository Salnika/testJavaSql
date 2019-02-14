import java.util.*;
import org.apache.commons.lang3.ArrayUtils;

class technicalTest {
  public static void main(String[] arg) {
    Group[] groupsData = DataSet.getGroupsData();
    User[] usersData = DataSet.getUsersData();

    usersData = birthdayForEveryone(usersData);
    displayUserFromYoungestToOldest(usersData);

    UserWithGroupsNames[] listWithNames = getUsersWithGroupNames(usersData, groupsData);

    for (int i = 0; i < listWithNames.length; i++) {
      listWithNames[i].display();
    }
  }

  public static User[] birthdayForEveryone(User[] usersData) {
  }

  public static void displayUserFromYoungestToOldest(User[] usersData) {
  }

  public static UserWithGroupsNames[] getUsersWithGroupNames(User[] usersData, Group[] groupData) {
  }

 
  
}