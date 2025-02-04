package org.apache.ibatis.test;

/**
 * @description:
 * @author:Xueyu
 * @date: 2022/7/1
 * @copyRight:
 */
public class Test {

  private String id;
  private String name;

  public Test(String id, String name) {
    this.id = id;
    this.name = name;
  }

  public Test() {
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Test{" +
      "id='" + id + '\'' +
      ", name='" + name + '\'' +
      '}';
  }
}
