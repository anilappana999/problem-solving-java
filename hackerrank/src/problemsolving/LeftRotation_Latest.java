 public static List<Integer> rotateLeft(int d, List<Integer> arr) {
  List<Integer> arr1 = new ArrayList<>();
  
  for(int i=d;i<arr.size();i++){
      arr1.add(arr.get(i));
      
      
  }
  
  for(int i=0;i<d;i++){
      arr1.add(arr.get(i));
      
      
  }
  
  
  return arr1;
  

    }

}
