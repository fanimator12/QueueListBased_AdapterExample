import utility.collection.QueueADT;

public class Test
{
  public static void main(String[] args)
  {
    QueueADT<String> list = new QueueListBased<>();
    list.enqueue("element");
    System.out.println(list);
  }
}
