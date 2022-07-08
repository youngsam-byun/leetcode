package Deque;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution1438 {
    public int longestSubarray(int[] nums, int limit) {

        Deque<Integer> maxQ = new ArrayDeque<>(), minQ = new ArrayDeque<>();

        int res = 1, i = 0, j = 0;

        for (; i < nums.length; i++) {

            int a = nums[i];

            while (!maxQ.isEmpty() && maxQ.peekLast() < a)
                maxQ.pollLast();

            while (!minQ.isEmpty() && a < minQ.peekLast())
                minQ.pollLast();

            maxQ.offerLast(a);
            minQ.offerLast(a);

            while (!maxQ.isEmpty() && !minQ.isEmpty() && maxQ.peekFirst() - minQ.peekFirst() > limit) {
                int b = nums[j++];
                if (maxQ.peekFirst() == b)
                    maxQ.pollFirst();
                if (minQ.peekFirst() == b)
                    minQ.pollFirst();
            }


            res = Math.max(res, i - j + 1);

        }

        return res;
    }
}