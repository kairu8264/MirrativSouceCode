package xn;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes4.dex */
public class n extends m {
    public static final <T> List<T> c(T[] tArr) {
        jo.p.h(tArr, "<this>");
        List<T> a10 = p.a(tArr);
        jo.p.g(a10, "asList(this)");
        return a10;
    }

    public static final byte[] d(byte[] bArr, byte[] bArr2, int i10, int i11, int i12) {
        jo.p.h(bArr, "<this>");
        jo.p.h(bArr2, "destination");
        System.arraycopy(bArr, i11, bArr2, i10, i12 - i11);
        return bArr2;
    }

    public static final char[] e(char[] cArr, char[] cArr2, int i10, int i11, int i12) {
        jo.p.h(cArr, "<this>");
        jo.p.h(cArr2, "destination");
        System.arraycopy(cArr, i11, cArr2, i10, i12 - i11);
        return cArr2;
    }

    public static final float[] f(float[] fArr, float[] fArr2, int i10, int i11, int i12) {
        jo.p.h(fArr, "<this>");
        jo.p.h(fArr2, "destination");
        System.arraycopy(fArr, i11, fArr2, i10, i12 - i11);
        return fArr2;
    }

    public static final int[] g(int[] iArr, int[] iArr2, int i10, int i11, int i12) {
        jo.p.h(iArr, "<this>");
        jo.p.h(iArr2, "destination");
        System.arraycopy(iArr, i11, iArr2, i10, i12 - i11);
        return iArr2;
    }

    public static final long[] h(long[] jArr, long[] jArr2, int i10, int i11, int i12) {
        jo.p.h(jArr, "<this>");
        jo.p.h(jArr2, "destination");
        System.arraycopy(jArr, i11, jArr2, i10, i12 - i11);
        return jArr2;
    }

    public static final <T> T[] i(T[] tArr, T[] tArr2, int i10, int i11, int i12) {
        jo.p.h(tArr, "<this>");
        jo.p.h(tArr2, "destination");
        System.arraycopy(tArr, i11, tArr2, i10, i12 - i11);
        return tArr2;
    }

    public static /* synthetic */ byte[] j(byte[] bArr, byte[] bArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = bArr.length;
        }
        return d(bArr, bArr2, i10, i11, i12);
    }

    public static /* synthetic */ float[] k(float[] fArr, float[] fArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = fArr.length;
        }
        return f(fArr, fArr2, i10, i11, i12);
    }

    public static /* synthetic */ int[] l(int[] iArr, int[] iArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = iArr.length;
        }
        return g(iArr, iArr2, i10, i11, i12);
    }

    public static /* synthetic */ Object[] m(Object[] objArr, Object[] objArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = objArr.length;
        }
        return i(objArr, objArr2, i10, i11, i12);
    }

    public static final byte[] n(byte[] bArr, int i10, int i11) {
        jo.p.h(bArr, "<this>");
        l.b(i11, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i10, i11);
        jo.p.g(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    public static final float[] o(float[] fArr, int i10, int i11) {
        jo.p.h(fArr, "<this>");
        l.b(i11, fArr.length);
        float[] copyOfRange = Arrays.copyOfRange(fArr, i10, i11);
        jo.p.g(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    public static final <T> T[] p(T[] tArr, int i10, int i11) {
        jo.p.h(tArr, "<this>");
        l.b(i11, tArr.length);
        T[] tArr2 = (T[]) Arrays.copyOfRange(tArr, i10, i11);
        jo.p.g(tArr2, "copyOfRange(this, fromIndex, toIndex)");
        return tArr2;
    }

    public static final void q(int[] iArr, int i10, int i11, int i12) {
        jo.p.h(iArr, "<this>");
        Arrays.fill(iArr, i11, i12, i10);
    }

    public static final <T> void r(T[] tArr, T t10, int i10, int i11) {
        jo.p.h(tArr, "<this>");
        Arrays.fill(tArr, i10, i11, t10);
    }

    public static /* synthetic */ void s(int[] iArr, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = iArr.length;
        }
        q(iArr, i10, i11, i12);
    }

    public static /* synthetic */ void t(Object[] objArr, Object obj, int i10, int i11, int i12, Object obj2) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = objArr.length;
        }
        r(objArr, obj, i10, i11);
    }

    public static final int[] u(int[] iArr, int i10) {
        jo.p.h(iArr, "<this>");
        int length = iArr.length;
        int[] copyOf = Arrays.copyOf(iArr, length + 1);
        copyOf[length] = i10;
        jo.p.g(copyOf, "result");
        return copyOf;
    }

    public static final int[] v(int[] iArr, int[] iArr2) {
        jo.p.h(iArr, "<this>");
        jo.p.h(iArr2, "elements");
        int length = iArr.length;
        int length2 = iArr2.length;
        int[] copyOf = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(iArr2, 0, copyOf, length, length2);
        jo.p.g(copyOf, "result");
        return copyOf;
    }

    public static final <T> T[] w(T[] tArr, T t10) {
        jo.p.h(tArr, "<this>");
        int length = tArr.length;
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, length + 1);
        tArr2[length] = t10;
        jo.p.g(tArr2, "result");
        return tArr2;
    }

    public static final <T> void x(T[] tArr) {
        jo.p.h(tArr, "<this>");
        if (tArr.length > 1) {
            Arrays.sort(tArr);
        }
    }

    public static final <T> void y(T[] tArr, Comparator<? super T> comparator) {
        jo.p.h(tArr, "<this>");
        jo.p.h(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }

    public static final <T> void z(T[] tArr, Comparator<? super T> comparator, int i10, int i11) {
        jo.p.h(tArr, "<this>");
        jo.p.h(comparator, "comparator");
        Arrays.sort(tArr, i10, i11, comparator);
    }
}
