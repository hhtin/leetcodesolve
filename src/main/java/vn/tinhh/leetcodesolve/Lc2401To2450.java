package vn.tinhh.leetcodesolve;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.concurrent.PriorityBlockingQueue;

@Component
public class Lc2401To2450 {

    //2402
    //https://leetcode.com/problems/meeting-rooms-iii/?envType=daily-question&envId=2025-07-11
    public int mostBooked(int n, int[][] meetings) {
        Arrays.sort(meetings, (a, b) -> a[0] - b[0]);
        PriorityQueue<long[]> queue = new PriorityQueue<>(
                (a, b) -> a[0] == b[0] ? (int) (a[1] - b[1]) : (int) (a[0] - b[0]));
        // {endTime, room}

        int[] roomCount = new int[n]; // number of meeting of the room
        int result = 0;

        for (int i = 0; i < n; i++)
            queue.add(new long[] { 0, i });

        for (int[] item : meetings) {
            int time = item[0]; // new meeting start time

            while (queue.peek()[0] < time) // order all available room by room index
                queue.add(new long[] { time, queue.poll()[1] });

            long[] current = queue.poll();
            int curRoom = (int) current[1];
            long meetingEndTime = current[0] + (item[1] - item[0]); // current room endTime + this meeting time
            roomCount[curRoom]++;

            if (roomCount[curRoom] > roomCount[result]) // update result
                result = curRoom;
            else if (roomCount[curRoom] == roomCount[result])
                result = Math.min(result, curRoom);

            queue.add(new long[] { meetingEndTime, curRoom });
        }
        return result;
    }
}
