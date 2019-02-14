class Group {
  private String _name;
  private int _id;

  public Group(String name, int id) {
    this._name = name;
    this._id = id;
  }

  public int getId() {
    return this._id;
  }

  public void setName(String name) {
    this._name = name;
  }

  public String getName() {
    return this._name;
  }

  public void display() {
    System.out.printf("This is the group %s\nMy id is %d.\n",
     this._name, this._id);
  }

}