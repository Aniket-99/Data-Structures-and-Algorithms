import java.util.*;
class Flattener{
    public List<Object> flattenList = new ArrayList<>();

    public static void main(String[] args){
        List<Object> listOfLists = new ArrayList<>();
        List<Object> list1 = new ArrayList<>();
        List<Object> list2 = new ArrayList<>();
        List<Object> list3 = new ArrayList<>();

        list1.add(1);
        list1.add(null);
        list1.add(2);

        list2.add(1);
        list1.add(null);
        list2.add(3);
        list2.add(null);
        list2.add(4);

        list3.add(null);

        listOfLists.add(list1);
        listOfLists.add(list2);
        listOfLists.add(list3);

        System.out.println("List before removal of null: "+listOfLists);

        Flattener ft = new Flattener();
        System.out.println("List after removal of null: "+ft.flatten(listOfLists));

    }
    
    public List<Object> flatten(List<Object> listOfLists){
        List<Object> flattenList = new ArrayList<>();
            for(int i = 0; i < listOfLists.size(); i++){
                Object list = listOfLists.get(i);

                if(list instanceof List){
                    this.flatten((List<Object>) list);
                }
                else if(list == null){
                    continue;
                }
                else{
                    this.flattenList.add(list);
                }
            }
        return this.flattenList;
    }
}