class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list=new ArrayList<>();
       for(int i=1;i<=numRows;i++){
          list.add(generateRow(i));
       } 
       return list;
    }
    public List<Integer> generateRow(int rows){
        List<Integer> list=new ArrayList<>();
        int ans=1;
        list.add(1);
        for(int i=1;i<rows;i++){
          ans*=(rows-i);
          ans/=i;
          list.add(ans);
        }
        return list;
    }
}