class UserWithGroupsNames extends User {
  private String[] _joinedGroupsNames;

  public UserWithGroupsNames(String name, int id, Integer age, int[] joinedGroupIds, String[] joinedGroupsNames) {
    super(name, id, age, joinedGroupIds);
    this._joinedGroupsNames = joinedGroupsNames;
  }

  public UserWithGroupsNames(User user, String[] joinedGroupsNames) {
    super(user.getName(), user.getId(), user.getAge(), user.getJoinedGroup());
    this._joinedGroupsNames = joinedGroupsNames;
  }

  public String[] getGroupsNames(){
    return this._joinedGroupsNames;
  }

  public void display() {
    super.display();
    System.out.println("And my groups are:");
    for (int i = 0; i < this._joinedGroupsNames.length; i++) {
      System.out.println(this._joinedGroupsNames[i]);
    }
  }
}