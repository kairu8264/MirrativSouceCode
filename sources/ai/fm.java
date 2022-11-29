package ai;

import java.util.PriorityQueue;

/* loaded from: classes3.dex */
public final class fm {
    public static void a(String[] strArr, int i10, int i11, PriorityQueue<em> priorityQueue) {
        int length = strArr.length;
        if (length < 6) {
            b(i10, e(strArr, 0, length), c(strArr, 0, length), length, priorityQueue);
            return;
        }
        long e10 = e(strArr, 0, 6);
        b(i10, e10, c(strArr, 0, 6), 6, priorityQueue);
        long d10 = d(16785407L, 5);
        int i12 = 1;
        while (true) {
            int length2 = strArr.length;
            if (i12 >= length2 - 5) {
                return;
            }
            e10 = ((((((e10 + 1073807359) - ((((bm.a(strArr[i12 - 1]) + 2147483647L) % 1073807359) * d10) % 1073807359)) % 1073807359) * 16785407) % 1073807359) + ((bm.a(strArr[i12 + 5]) + 2147483647L) % 1073807359)) % 1073807359;
            b(i10, e10, c(strArr, i12, 6), length2, priorityQueue);
            i12++;
        }
    }

    public static void b(int i10, long j10, String str, int i11, PriorityQueue<em> priorityQueue) {
        em emVar = new em(j10, str, i11);
        if ((priorityQueue.size() != i10 || (priorityQueue.peek().f3725c <= emVar.f3725c && priorityQueue.peek().f3723a <= emVar.f3723a)) && !priorityQueue.contains(emVar)) {
            priorityQueue.add(emVar);
            if (priorityQueue.size() > i10) {
                priorityQueue.poll();
            }
        }
    }

    public static String c(String[] strArr, int i10, int i11) {
        int i12 = i11 + i10;
        if (strArr.length < i12) {
            uj0.c("Unable to construct shingle");
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int i13 = i12 - 1;
            if (i10 < i13) {
                sb2.append(strArr[i10]);
                sb2.append(' ');
                i10++;
            } else {
                sb2.append(strArr[i13]);
                return sb2.toString();
            }
        }
    }

    public static long d(long j10, int i10) {
        if (i10 == 1) {
            return j10;
        }
        return ((i10 & 1) == 0 ? d((j10 * j10) % 1073807359, i10 >> 1) : j10 * (d((j10 * j10) % 1073807359, i10 >> 1) % 1073807359)) % 1073807359;
    }

    public static long e(String[] strArr, int i10, int i11) {
        long a10 = (bm.a(strArr[0]) + 2147483647L) % 1073807359;
        for (int i12 = 1; i12 < i11; i12++) {
            a10 = (((a10 * 16785407) % 1073807359) + ((bm.a(strArr[i12]) + 2147483647L) % 1073807359)) % 1073807359;
        }
        return a10;
    }
}
