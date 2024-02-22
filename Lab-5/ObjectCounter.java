public class ObjectCounter {

     static int objectCount = 0; 

    public ObjectCounter() {
        objectCount++; 
        System.out.println("Object created: " + objectCount);
    }

    public static int getObjectCount() {
        return objectCount;  
    }

    public static void main(String[] args) {
        // Create multiple objects to demonstrate counting
        ObjectCounter abc = new ObjectCounter();
        ObjectCounter def = new ObjectCounter();
        //ObjectCounter ghi = new ObjectCounter();

        
        System.out.println("Total objects created: " + ObjectCounter.getObjectCount());
    }
}
