package org.example.pagination;

import java.util.ArrayList;
import java.util.List;

public class DataService {
    public List<String>getName (){
        List<String> name=new ArrayList<>();
        for(int i=0;i<102;i++){
            name.add(String.valueOf(i));
        }
    return name;
    }

}
