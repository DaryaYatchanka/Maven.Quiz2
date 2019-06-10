package com.zipcodewilmington.assessment2.part2;
import java.util.Arrays;
import java.util.stream.Stream;


public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
       int first =  array1.length-1;
       int second = array2.length-1;
     Integer[] array3 = new Integer[first+second];
        return array3;
    }



    public Integer[] rotate(Integer[] array, Integer index) {
        int first =  array[array.length-1]-array[index+1];
        int second = array[0] + array[index+1];
        Integer[] array3 = new Integer[first +second];
        return array3;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        Integer occurance = 0;

        for (int i = 0; i<array1.length; i++){
            if (array1[i]==valueToEvaluate){

                occurance ++;
            }
            
        }
        return occurance;
    }

    public Integer mostCommon(Integer[] array) {
        Integer popular = 0;
        Integer temp = 0;
        Integer occurance = 0;
        Integer previousOcc = 0;
        for (int i = 0; i<array.length; i++){
            for (int j = 0; j <array.length ; j++) {
                temp = array[i];

                if (array[i]==array[j]){
                    occurance ++;

               }

            }
            if(occurance>previousOcc){
                popular =array[i];
                previousOcc=occurance;
                occurance=0;
            }
        }

        return popular;

    }
}
