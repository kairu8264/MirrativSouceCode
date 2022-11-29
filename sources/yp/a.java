package yp;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy;
import java.util.Calendar;
import java.util.Date;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int[][] f62148a = {new int[]{14}, new int[]{13}, new int[]{12}, new int[]{11, 10}, new int[]{5, 5, 9}, new int[]{2, AnalyticsListener.EVENT_LOAD_COMPLETED}, new int[]{1}, new int[]{0}};

    /* renamed from: yp.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public enum EnumC1069a {
        TRUNCATE,
        ROUND,
        CEILING
    }

    public static void a(Calendar calendar, int i10, EnumC1069a enumC1069a) {
        int[][] iArr;
        char c10;
        int i11;
        boolean z10;
        char c11;
        if (calendar.get(1) > 280000000) {
            throw new ArithmeticException("Calendar value too large for accurate calculations");
        }
        if (i10 == 14) {
            return;
        }
        Date time = calendar.getTime();
        long time2 = time.getTime();
        int i12 = calendar.get(14);
        EnumC1069a enumC1069a2 = EnumC1069a.TRUNCATE;
        if (enumC1069a2 == enumC1069a || i12 < 500) {
            time2 -= i12;
        }
        boolean z11 = i10 == 13;
        int i13 = calendar.get(13);
        if (!z11 && (enumC1069a2 == enumC1069a || i13 < 30)) {
            time2 -= i13 * 1000;
        }
        if (i10 == 12) {
            z11 = true;
        }
        int i14 = calendar.get(12);
        if (!z11 && (enumC1069a2 == enumC1069a || i14 < 30)) {
            time2 -= i14 * DefaultLoadErrorHandlingPolicy.DEFAULT_TRACK_BLACKLIST_MS;
        }
        if (time.getTime() != time2) {
            time.setTime(time2);
            calendar.setTime(time);
        }
        boolean z12 = false;
        for (int[] iArr2 : f62148a) {
            for (int i15 : iArr2) {
                if (i15 == i10) {
                    if (enumC1069a == EnumC1069a.CEILING || (enumC1069a == EnumC1069a.ROUND && z12)) {
                        if (i10 == 1001) {
                            if (calendar.get(5) == 1) {
                                calendar.add(5, 15);
                                return;
                            }
                            calendar.add(5, -15);
                            calendar.add(2, 1);
                            return;
                        } else if (i10 == 9) {
                            if (calendar.get(11) == 0) {
                                calendar.add(11, 12);
                                return;
                            }
                            calendar.add(11, -12);
                            calendar.add(5, 1);
                            return;
                        } else {
                            calendar.add(iArr2[0], 1);
                            return;
                        }
                    }
                    return;
                }
            }
            if (i10 != 9) {
                if (i10 == 1001 && iArr2[0] == 5) {
                    int i16 = calendar.get(5) - 1;
                    if (i16 >= 15) {
                        i16 -= 15;
                    }
                    z12 = i16 > 7;
                    i11 = i16;
                    c10 = '\f';
                    z10 = true;
                }
                c10 = '\f';
                z10 = false;
                i11 = 0;
            } else {
                if (iArr2[0] == 11) {
                    int i17 = calendar.get(11);
                    c10 = '\f';
                    if (i17 >= 12) {
                        i17 -= 12;
                    }
                    z12 = i17 >= 6;
                    i11 = i17;
                    z10 = true;
                }
                c10 = '\f';
                z10 = false;
                i11 = 0;
            }
            if (z10) {
                c11 = 0;
            } else {
                c11 = 0;
                int actualMinimum = calendar.getActualMinimum(iArr2[0]);
                int actualMaximum = calendar.getActualMaximum(iArr2[0]);
                int i18 = calendar.get(iArr2[0]) - actualMinimum;
                z12 = i18 > (actualMaximum - actualMinimum) / 2;
                i11 = i18;
            }
            if (i11 != 0) {
                calendar.set(iArr2[c11], calendar.get(iArr2[c11]) - i11);
            }
        }
        throw new IllegalArgumentException("The field " + i10 + " is not supported");
    }

    public static Date b(Date date, int i10) {
        if (date != null) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            a(calendar, i10, EnumC1069a.TRUNCATE);
            return calendar.getTime();
        }
        throw new IllegalArgumentException("The date must not be null");
    }
}
