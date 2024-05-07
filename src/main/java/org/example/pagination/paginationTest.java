package org.example.pagination;

import java.util.List;

public class paginationTest {
    public static void main(String[]args){
       DataService dataservice= new DataService();
  List<String> names=dataservice.getName();
  Pagination pagination=new Pagination();
  pagination.perPageRecordsize=10;
  System.out.println(names.size()%10);
  if(names.size()%10>0){
      pagination.totalpages=names.size()/10+1;
  }else{
      pagination.totalpages=names.size()/10;
  }
  for(int i=0;i<pagination.totalpages;i++){
      int endIndex=(i*pagination.perPageRecordsize)+pagination.perPageRecordsize;
      if (endIndex >names.size()){
          endIndex=names.size();
      }
      List<String> stringList=names.subList(i*pagination.perPageRecordsize,endIndex);
      System.out.println("page value" +i+" values"+stringList);
  }



    }
}
