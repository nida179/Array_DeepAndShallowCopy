public class ArrayShallowCopy implements Cloneable{
    private int[] anArray = {1,2,3,4,5,6};
    private int value;

    public void increment(){

        for(int i =0;i<anArray.length;i++){
            anArray[i]++;
        }
        value++;
    }
    @Override
    public String toString(){
        String result = "";
        for(int i =0;i<anArray.length;i++){
            result += anArray[i]+" ";
        }
        return result+" value: "+value;
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
