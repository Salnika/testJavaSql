class User {
  private String _name;
  private int _id;
  private int[] _joinedGroup;
  private Integer _age;

  User(String name, int id, Integer age, int[] joinedGroup) {
    _name = name;
    _id = id;
    _joinedGroup = joinedGroup;
    _age = age;
  }

  User(User user) {
    _name = user.getName();
    _id = user.getId();
    _joinedGroup = user.getJoinedGroup();
    _age = user.getAge();
  }

  User(User user, Integer age) {
    _name = user.getName();
    _id = user.getId();
    _joinedGroup = user.getJoinedGroup();
    _age = age;
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

  public void setAge(Integer age) {
    _age = age;
  }

  public Integer getAge() {
    return _age;
  }

  public int[] getJoinedGroup() {
    return _joinedGroup;
  }

  public void display() {
    System.out.printf("Hello I'm %s !\nI'm %d and my id is %d.\n", 
    _name, _age, _id);
  }

}