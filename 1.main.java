
// for(String it:hm.keySet()){
          //     res.add(hm.get(it));
          // }
          // return res;
          return hm.values().stream().collect(Collectors.toList());
          return new ArrayList<>(hm.values());
          
          
      char[] temp = s.toCharArray();
      Arrays.sort(temp);
      String _s = String.valueOf(temp);
      ht.putIfAbsent(_s, new ArrayList<>());
      ht.get(_s).add(s);
