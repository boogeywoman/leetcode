//https://leetcode.com/problems/median-of-two-sorted-arrays/
import java.util.Arrays;
public class Median {

        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int len1 = nums1.length;
            int len2 = nums2.length;
            double median;

            int len = len1 + len2;
            int []joint = new int [len];

            for (int i = 0; i<len1 ; i++){
                joint[i] = nums1[i];
            }

            for (int i = len1; i  < len ; i++){
                joint[i] = nums2[i - len1];
            }
            Arrays.sort(joint);         

             if (len % 2 == 0)
             {
                median = (joint[(len / 2) - 1] + joint[len / 2]) / 2.0;
             }
             else 
            {
                median = joint[(len - 1) / 2];
            }

            return median;
            }   

        }
