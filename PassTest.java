class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void print() {
        System.out.println("Date: " + day + "/" + month + "/" + year);
    }
}


public class PassTest {
  public static void changeInt(int value){
    value = 55;
  }
  public static void changeObjectRef(MyDate ref){
    ref = new MyDate(1,1,2000);
  }
  public static void changeObjectAttr(MyDate ref){
    ref.setDay(4);
  }
  public static void main(String args[]){
    MyDate date;
    int val;
    
    //assign the int
    val = 11;

    // Try to change it
    changeInt(val);

    // What is the current value?
    System.out.println("Int value is: " + val);

    // Assign the date
    date = new MyDate(22, 7, 1964);

    // Try to change the reference
    changeObjectRef(date);

    // What is the current value?
    date.print();

    // Now change the day attribute through the object.
    changeObjectAttr(date);

    // What is the current value?
    date.print();
  }
}

