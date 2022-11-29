package ai;

import android.os.Build;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class vj {

    /* renamed from: a  reason: collision with root package name */
    public static final int f11100a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f11101b;

    /* renamed from: c  reason: collision with root package name */
    public static final String f11102c;

    /* renamed from: d  reason: collision with root package name */
    public static final String f11103d;

    /* renamed from: e  reason: collision with root package name */
    public static final String f11104e;

    /* renamed from: f  reason: collision with root package name */
    public static final Pattern f11105f;

    /* renamed from: g  reason: collision with root package name */
    public static final Pattern f11106g;

    /* renamed from: h  reason: collision with root package name */
    public static final Pattern f11107h;

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 25 && Build.VERSION.CODENAME.charAt(0) == 'O') {
            i10 = 26;
        }
        f11100a = i10;
        String str = Build.DEVICE;
        f11101b = str;
        String str2 = Build.MANUFACTURER;
        f11102c = str2;
        String str3 = Build.MODEL;
        f11103d = str3;
        int length = String.valueOf(str).length();
        StringBuilder sb2 = new StringBuilder(length + 17 + String.valueOf(str3).length() + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(", ");
        sb2.append(str3);
        sb2.append(", ");
        sb2.append(str2);
        sb2.append(", ");
        sb2.append(i10);
        f11104e = sb2.toString();
        f11105f = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f11106g = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        f11107h = Pattern.compile("%([A-Fa-f0-9]{2})");
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static ExecutorService b(String str) {
        return Executors.newSingleThreadExecutor(new uj("Loader:ExtractorMediaPeriod"));
    }

    public static void c(ui uiVar) {
        if (uiVar != null) {
            try {
                uiVar.d();
            } catch (IOException unused) {
            }
        }
    }

    public static byte[] d(String str) {
        return str.getBytes(Charset.defaultCharset());
    }

    public static int e(int i10, int i11) {
        return ((i10 + i11) - 1) / i11;
    }

    public static int f(int i10, int i11, int i12) {
        return Math.max(i11, Math.min(i10, i12));
    }

    public static float g(float f10, float f11, float f12) {
        return Math.max(0.1f, Math.min(f10, 8.0f));
    }

    public static int h(long[] jArr, long j10, boolean z10, boolean z11) {
        int i10;
        int binarySearch = Arrays.binarySearch(jArr, j10);
        if (binarySearch < 0) {
            i10 = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
            } while (jArr[binarySearch] == j10);
            i10 = binarySearch + 1;
        }
        return z11 ? Math.max(0, i10) : i10;
    }

    public static int i(long[] jArr, long j10, boolean z10, boolean z11) {
        int i10;
        int binarySearch = Arrays.binarySearch(jArr, j10);
        if (binarySearch < 0) {
            i10 = ~binarySearch;
        } else {
            do {
                binarySearch++;
                if (binarySearch >= jArr.length) {
                    break;
                }
            } while (jArr[binarySearch] == j10);
            i10 = z10 ? binarySearch - 1 : binarySearch;
        }
        return z11 ? Math.min(jArr.length - 1, i10) : i10;
    }

    public static long j(long j10, long j11, long j12) {
        int i10 = (j12 > j11 ? 1 : (j12 == j11 ? 0 : -1));
        if (i10 < 0 || j12 % j11 != 0) {
            return (i10 >= 0 || j11 % j12 != 0) ? (long) (j10 * (j11 / j12)) : j10 * (j11 / j12);
        }
        return j10 / (j12 / j11);
    }

    public static void k(long[] jArr, long j10, long j11) {
        int i10 = (j11 > 1000000L ? 1 : (j11 == 1000000L ? 0 : -1));
        int i11 = 0;
        if (i10 >= 0 && j11 % 1000000 == 0) {
            long j12 = j11 / 1000000;
            while (i11 < jArr.length) {
                jArr[i11] = jArr[i11] / j12;
                i11++;
            }
        } else if (i10 >= 0 || 1000000 % j11 != 0) {
            double d10 = 1000000.0d / j11;
            while (i11 < jArr.length) {
                jArr[i11] = (long) (jArr[i11] * d10);
                i11++;
            }
        } else {
            long j13 = 1000000 / j11;
            while (i11 < jArr.length) {
                jArr[i11] = jArr[i11] * j13;
                i11++;
            }
        }
    }

    public static int l(String str) {
        int length = str.length();
        fj.a(length <= 4);
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            i10 = (i10 << 8) | str.charAt(i11);
        }
        return i10;
    }

    public static byte[] m(String str) {
        byte[] bArr = new byte[38];
        for (int i10 = 0; i10 < 38; i10++) {
            int i11 = i10 + i10;
            bArr[i10] = (byte) ((Character.digit("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78".charAt(i11), 16) << 4) + Character.digit("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78".charAt(i11 + 1), 16));
        }
        return bArr;
    }

    public static String n(Object[] objArr) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (true) {
            int length = objArr.length;
            if (i10 >= length) {
                return sb2.toString();
            }
            sb2.append(objArr[i10].getClass().getSimpleName());
            if (i10 < length - 1) {
                sb2.append(", ");
            }
            i10++;
        }
    }

    public static int o(int i10) {
        if (i10 != 8) {
            if (i10 != 16) {
                if (i10 != 24) {
                    return i10 != 32 ? 0 : 1073741824;
                }
                return Integer.MIN_VALUE;
            }
            return 2;
        }
        return 3;
    }

    public static int p(int i10, int i11) {
        if (i10 != Integer.MIN_VALUE) {
            if (i10 != 1073741824) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        return i11;
                    }
                    throw new IllegalArgumentException();
                }
                return i11 + i11;
            }
            return i11 * 4;
        }
        return i11 * 3;
    }

    public static int q(int i10) {
        return i10 != 1 ? 13107200 : 3538944;
    }
}
