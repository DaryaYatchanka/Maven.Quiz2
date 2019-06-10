package com.zipcodewilmington.assessment2.part1;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
         if(array.length%2== 0){
             return true;
        }
        return false;
    }

    public Integer[] range(int start, int stop) {
        Integer[] b = new Integer[start- stop];
        Integer between = stop - start;

        return b;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
      Integer sum =  array[0]+array[1];
        return sum;
    }

    public Integer getProductOfFirstTwo(Integer[] array) {

        Integer product = array[array.length-1]*array[array.length-2];
        return product;
    }
}
