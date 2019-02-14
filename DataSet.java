import java.util.*;

class DataSet {
  public static Group[] getGroupsData() {
    return new Group[] { 
      new Group("Les fouteux", 1),
      new Group("Les trolls", 2),
      new Group("Les devs", 3),
      new Group("Les biz", 4),
      new Group("Les voileux", 5),
      new Group("Les pilotes", 6),
      new Group("La chorale", 7),
      new Group("Les cuistots", 8),
      new Group("Les skieurs", 9),
      new Group("Les gros mangeurs", 10),
      new Group("Les autres", 11)
    };
  }

  public static User[] getUsersData() {
    return new User[] {
      new User("Paul", 1, new Integer(34), new int[] {1, 2, 5}),
      new User("Marc", 2, new Integer(13), new int[] {4, 6, 10, 8}),
      new User("Alex", 3, new Integer(24), new int[] {2, 3}),
      new User("Dimitri", 4, new Integer(18), new int[] {11, 2, 9}),
      new User("Celestin", 5, new Integer(25), new int[] {1, 2, 5, 6, 3})
    };
  }
}