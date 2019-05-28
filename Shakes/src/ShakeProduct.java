import java.util.ArrayList;

public class ShakeProduct {

    private ArrayList<String>ShakeComponents;

    public ShakeProduct(){

        ShakeComponents = new ArrayList<String>();

    }

    public void addComponent(String components){

        ShakeComponents.add(components);

    }

    public void PrintComponents(){

        for(int i =0;i<ShakeComponents.size() ;i++){

            if(ShakeComponents.get(i)!=null){

                System.out.println(ShakeComponents.get(i));

            }
        }
    }

    public int getPrice(){

        String temp = ShakeComponents.get(ShakeComponents.size()-1);

        temp = temp.substring(9,12);

        return Integer.parseInt(temp);

    }
}
