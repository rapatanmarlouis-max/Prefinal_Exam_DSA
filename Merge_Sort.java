/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Merge_Sort {
    private int splitCount = 0;
    private final int mergeCount = 0;
    
    public Player[] sortElements(Player[] arr){
        System.out.println("\========== MERGE SORT START ==========");
        return mergeSortRecursive(arr, 0);
    }
    
    private Player[] mergeSortRecursive(Player[] arr, int depth){
        String indent = " ".repeat(depth);
        System.out.println(indent + "SPLIT #" + (++splitCount) + ": " + arrayToString(arr));
        
        
        int len = arr.length;
        if (len <= 1) {
            System.out.println(indent + " -> Base case(single element), return " + arrayToString(arr));
            return arr;
        }
        
        int mid = len / 2;
    }

    
