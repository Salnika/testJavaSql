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

  public static Group findGroupById(Group[] groups, int id) {
    for (int i = 0; i < groups.length; i++) {
      if (id == groups[i].getId())
        return groups[i];
    }
    return null;
  }

  public static UserWithGroupsNames[] getUsersWithGroupNames(User[] usersData, Group[] groupData) {
    UserWithGroupsNames[] userWithGroupNames = new UserWithGroupsNames[] {};

    for (int i = 0; i < usersData.length; i++) {
      int[] groupsIds = usersData[i].getJoinedGroup();
      String[] tmp = new String[] {};
      for (int y = 0; y < groupsIds.length; y++) {
        Group foundedGroup = findGroupById(groupData, groupsIds[y]);

        if (foundedGroup != null)
          tmp = ArrayUtils.add(tmp, foundedGroup.getName());
      }
      userWithGroupNames = ArrayUtils.add(userWithGroupNames, new UserWithGroupsNames(usersData[i], tmp));
    }
    return userWithGroupNames;
  }

  public static User[] birthdayForEveryone(User[] usersData) {
    User[] newUsersData = new User[] {};

    for (int i = 0; i < usersData.length; i++) {
      Integer age = new Integer(usersData[i].getAge() + 1);

      User tmp = new User(usersData[i], age);
      newUsersData = ArrayUtils.add(newUsersData, tmp);
    }

    return newUsersData;
  }

  public static void displayUserFromYoungestToOldest(User[] usersData) {
    Arrays.sort(usersData, new Comparator<User>() {
      public int compare(User a, User b) {
        return a.getAge().compareTo(b.getAge());
      }
    });
    for (int i = 0; i < usersData.length; i++) {
      usersData[i].display();
    }
  }
}