package kl;

import java.util.HashMap;

/* loaded from: classes4.dex */
public class c implements d {

    /* renamed from: a  reason: collision with root package name */
    public final int f38866a;

    public c(int i10) {
        this.f38866a = i10;
    }

    public static boolean b(StackTraceElement[] stackTraceElementArr, int i10, int i11) {
        int i12 = i11 - i10;
        if (i11 + i12 > stackTraceElementArr.length) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!stackTraceElementArr[i10 + i13].equals(stackTraceElementArr[i11 + i13])) {
                return false;
            }
        }
        return true;
    }

    public static StackTraceElement[] c(StackTraceElement[] stackTraceElementArr, int i10) {
        int i11;
        HashMap hashMap = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i12 = 0;
        int i13 = 0;
        int i14 = 1;
        while (i12 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i12];
            Integer num = (Integer) hashMap.get(stackTraceElement);
            if (num != null && b(stackTraceElementArr, num.intValue(), i12)) {
                int intValue = i12 - num.intValue();
                if (i14 < i10) {
                    System.arraycopy(stackTraceElementArr, i12, stackTraceElementArr2, i13, intValue);
                    i13 += intValue;
                    i14++;
                }
                i11 = (intValue - 1) + i12;
            } else {
                stackTraceElementArr2[i13] = stackTraceElementArr[i12];
                i13++;
                i14 = 1;
                i11 = i12;
            }
            hashMap.put(stackTraceElement, Integer.valueOf(i12));
            i12 = i11 + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i13];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i13);
        return stackTraceElementArr3;
    }

    @Override // kl.d
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        StackTraceElement[] c10 = c(stackTraceElementArr, this.f38866a);
        return c10.length < stackTraceElementArr.length ? c10 : stackTraceElementArr;
    }
}
