

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//The idea behind merging intervals is to first sort the intervals by their starting point. Once sorted, you can iterate through the intervals and merge them if they
// overlap. Two intervals overlap if the start of one interval is less than or equal to the end of the previous interval. If they overlap, you merge them by updating
// the end of the current interval to the maximum end of the overlapping intervals.
class Solution {
    public int[][] merge(int[][] intervals) {
        // Step 1: Sort the intervals based on their starting points.
        // Sorting is necessary to ensure that we can easily merge overlapping intervals.
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // Step 2: Create a list to store the merged intervals.
        List<int[]> mergedList = new ArrayList<>();

        // Step 3: Iterate over the intervals to merge them.
        for (int i = 0; i < intervals.length; i++) {
            int start = intervals[i][0];  // Start of the current interval
            int end = intervals[i][1];    // End of the current interval
            
            // Step 4: Check for overlapping intervals.
            // While the current interval overlaps with the next one,
            // update the end to the maximum end of the overlapping intervals.
            while (i < intervals.length - 1 && end >= intervals[i + 1][0]) {
                end = Math.max(end, intervals[i + 1][1]);
                i++; // Move to the next interval
            }
            
            // Step 5: Add the merged interval to the result list.
            mergedList.add(new int[]{start, end});
        }

        // Step 6: Convert the list of merged intervals back into a 2D array.
        return mergedList.toArray(new int[mergedList.size()][]);
    }
}




public class mergeOverlapping {
    public static void main(String[] args) {
        
    }
}
