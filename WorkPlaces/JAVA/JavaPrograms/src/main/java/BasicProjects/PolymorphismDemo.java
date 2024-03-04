package BasicProjects;

class PolymorphismDemo {
  
    // Method with 2 parameter
    static int Add(int a, int b)
    {
        return a + b;
    }
  
    // Method with the same name but 3 parameter
    static int Add(int a, int b, int c)
    {
        return a + b + c;
    }

  

    public static void main(String[] args)
    {
        System.out.println(PolymorphismDemo.Add(2, 4));
  
        System.out.println(PolymorphismDemo.Add(2, 7, 3));
    }

}

