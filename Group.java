class Group {
  private String _name;
  private int _id;

  public Group(String name, int id) {
    _name = name;
    _id = id;
  }

  public Group(Group group) {
    _name = group.getName();
    _id = group.getId();
  }

  public int getId() {
    return _id;
  }

  public void setName(String name) {
    _name = name;
  }

  public String getName() {
    return _name;
  }

  public void display() {
    System.out.printf("This is the group %s\nMy id is %d.\n", _name, _id);
  }

}