package intro.islandofknowledge;

public class AreEquallyStrong {
  boolean areEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
    Person me = new Person();
    me.personArm = new PersonArms(yourLeft, yourRight);

    Person myFriend = new Person();
    myFriend.personArm = new PersonArms(friendsLeft, friendsRight);

    return me.equals(myFriend);
  }

  class Person {
    PersonArms personArm;

    public boolean equals(Person other){
      int currentStrongest = this.personArm.getStrongest();
      int otherStrongest = other.personArm.getStrongest();
      int currentLiftCapacity = this.personArm.getLiftCapacity();
      int otherLiftCapacity = other.personArm.getLiftCapacity();

      return currentStrongest == otherStrongest && currentLiftCapacity == otherLiftCapacity;
    }
  }

  class PersonArms {
    int leftLiftCapacity;
    int rightLiftCapacity;

    public PersonArms(int left, int right){
      this.leftLiftCapacity = left;
      this.rightLiftCapacity = right;
    }

    public int getStrongest(){
      if (leftLiftCapacity > rightLiftCapacity)
        return leftLiftCapacity;

      return rightLiftCapacity;
    }

    public int getLiftCapacity(){
      return leftLiftCapacity + rightLiftCapacity;
    }
  }
}
