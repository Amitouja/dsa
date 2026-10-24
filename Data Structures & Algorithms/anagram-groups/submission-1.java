
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();

        for(String s : strs) {
            char[] arr=s.toCharArray();
            Arrays.sort(arr);
            String group=new String(arr);

            if(!map.containsKey(group)) {
                map.put(group,new ArrayList<>());
            }

            map.get(group).add(s);
        }

        return new ArrayList<>(map.values());
    }
}

   