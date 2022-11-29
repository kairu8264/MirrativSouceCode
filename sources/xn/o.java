package xn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes4.dex */
public class o extends n {
    public static final boolean A(int[] iArr, int i10) {
        jo.p.h(iArr, "<this>");
        return M(iArr, i10) >= 0;
    }

    public static final <T> boolean B(T[] tArr, T t10) {
        jo.p.h(tArr, "<this>");
        return N(tArr, t10) >= 0;
    }

    public static final List<Byte> C(byte[] bArr, int i10) {
        jo.p.h(bArr, "<this>");
        if (i10 >= 0) {
            return a0(bArr, po.n.d(bArr.length - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static final <T> List<T> D(T[] tArr) {
        jo.p.h(tArr, "<this>");
        return (List) E(tArr, new ArrayList());
    }

    public static final <C extends Collection<? super T>, T> C E(T[] tArr, C c10) {
        jo.p.h(tArr, "<this>");
        jo.p.h(c10, "destination");
        for (T t10 : tArr) {
            if (t10 != null) {
                c10.add(t10);
            }
        }
        return c10;
    }

    public static final <T> T F(T[] tArr) {
        jo.p.h(tArr, "<this>");
        if (!(tArr.length == 0)) {
            return tArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final <T> T G(T[] tArr) {
        jo.p.h(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[0];
    }

    public static final po.i H(int[] iArr) {
        jo.p.h(iArr, "<this>");
        return new po.i(0, K(iArr));
    }

    public static final <T> po.i I(T[] tArr) {
        jo.p.h(tArr, "<this>");
        return new po.i(0, L(tArr));
    }

    public static final int J(byte[] bArr) {
        jo.p.h(bArr, "<this>");
        return bArr.length - 1;
    }

    public static final int K(int[] iArr) {
        jo.p.h(iArr, "<this>");
        return iArr.length - 1;
    }

    public static final <T> int L(T[] tArr) {
        jo.p.h(tArr, "<this>");
        return tArr.length - 1;
    }

    public static final int M(int[] iArr, int i10) {
        jo.p.h(iArr, "<this>");
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (i10 == iArr[i11]) {
                return i11;
            }
        }
        return -1;
    }

    public static final <T> int N(T[] tArr, T t10) {
        jo.p.h(tArr, "<this>");
        int i10 = 0;
        if (t10 == null) {
            int length = tArr.length;
            while (i10 < length) {
                if (tArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i10 < length2) {
            if (jo.p.c(t10, tArr[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final <T, A extends Appendable> A O(T[] tArr, A a10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, io.l<? super T, ? extends CharSequence> lVar) {
        jo.p.h(tArr, "<this>");
        jo.p.h(a10, "buffer");
        jo.p.h(charSequence, "separator");
        jo.p.h(charSequence2, "prefix");
        jo.p.h(charSequence3, "postfix");
        jo.p.h(charSequence4, "truncated");
        a10.append(charSequence2);
        int i11 = 0;
        for (T t10 : tArr) {
            i11++;
            if (i11 > 1) {
                a10.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            so.f.a(a10, t10, lVar);
        }
        if (i10 >= 0 && i11 > i10) {
            a10.append(charSequence4);
        }
        a10.append(charSequence3);
        return a10;
    }

    public static final <T> String P(T[] tArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, io.l<? super T, ? extends CharSequence> lVar) {
        jo.p.h(tArr, "<this>");
        jo.p.h(charSequence, "separator");
        jo.p.h(charSequence2, "prefix");
        jo.p.h(charSequence3, "postfix");
        jo.p.h(charSequence4, "truncated");
        String sb2 = ((StringBuilder) O(tArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
        jo.p.g(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    public static /* synthetic */ String Q(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, io.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        String str = (i11 & 2) != 0 ? "" : charSequence2;
        String str2 = (i11 & 4) == 0 ? charSequence3 : "";
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return P(objArr, charSequence, str, str2, i12, charSequence5, lVar);
    }

    public static final <T> T R(T[] tArr) {
        jo.p.h(tArr, "<this>");
        if (!(tArr.length == 0)) {
            return tArr[L(tArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final <T> int S(T[] tArr, T t10) {
        jo.p.h(tArr, "<this>");
        if (t10 == null) {
            int length = tArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i10 = length - 1;
                    if (tArr[length] == null) {
                        return length;
                    }
                    if (i10 < 0) {
                        break;
                    }
                    length = i10;
                }
            }
        } else {
            int length2 = tArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i11 = length2 - 1;
                    if (jo.p.c(t10, tArr[length2])) {
                        return length2;
                    }
                    if (i11 < 0) {
                        break;
                    }
                    length2 = i11;
                }
            }
        }
        return -1;
    }

    public static final List<Byte> T(byte[] bArr) {
        jo.p.h(bArr, "<this>");
        if (bArr.length == 0) {
            return s.k();
        }
        List<Byte> e02 = e0(bArr);
        z.K(e02);
        return e02;
    }

    public static final byte[] U(byte[] bArr) {
        jo.p.h(bArr, "<this>");
        if (bArr.length == 0) {
            return bArr;
        }
        byte[] bArr2 = new byte[bArr.length];
        int J = J(bArr);
        i0 it = new po.i(0, J).iterator();
        while (it.hasNext()) {
            int b10 = it.b();
            bArr2[J - b10] = bArr[b10];
        }
        return bArr2;
    }

    public static final char V(char[] cArr) {
        jo.p.h(cArr, "<this>");
        int length = cArr.length;
        if (length != 0) {
            if (length == 1) {
                return cArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final <T> T W(T[] tArr) {
        jo.p.h(tArr, "<this>");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    public static final byte[] X(byte[] bArr, po.i iVar) {
        jo.p.h(bArr, "<this>");
        jo.p.h(iVar, "indices");
        return iVar.isEmpty() ? new byte[0] : n.n(bArr, iVar.d().intValue(), iVar.j().intValue() + 1);
    }

    public static final <T> T[] Y(T[] tArr, Comparator<? super T> comparator) {
        jo.p.h(tArr, "<this>");
        jo.p.h(comparator, "comparator");
        if (tArr.length == 0) {
            return tArr;
        }
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, tArr.length);
        jo.p.g(tArr2, "copyOf(this, size)");
        n.y(tArr2, comparator);
        return tArr2;
    }

    public static final <T> List<T> Z(T[] tArr, Comparator<? super T> comparator) {
        jo.p.h(tArr, "<this>");
        jo.p.h(comparator, "comparator");
        return n.c(Y(tArr, comparator));
    }

    public static final List<Byte> a0(byte[] bArr, int i10) {
        jo.p.h(bArr, "<this>");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        } else if (i10 == 0) {
            return s.k();
        } else {
            int length = bArr.length;
            if (i10 >= length) {
                return c0(bArr);
            }
            if (i10 == 1) {
                return r.d(Byte.valueOf(bArr[length - 1]));
            }
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = length - i10; i11 < length; i11++) {
                arrayList.add(Byte.valueOf(bArr[i11]));
            }
            return arrayList;
        }
    }

    public static final <T, C extends Collection<? super T>> C b0(T[] tArr, C c10) {
        jo.p.h(tArr, "<this>");
        jo.p.h(c10, "destination");
        for (T t10 : tArr) {
            c10.add(t10);
        }
        return c10;
    }

    public static final List<Byte> c0(byte[] bArr) {
        jo.p.h(bArr, "<this>");
        int length = bArr.length;
        if (length != 0) {
            if (length != 1) {
                return e0(bArr);
            }
            return r.d(Byte.valueOf(bArr[0]));
        }
        return s.k();
    }

    public static final <T> List<T> d0(T[] tArr) {
        jo.p.h(tArr, "<this>");
        int length = tArr.length;
        if (length != 0) {
            if (length != 1) {
                return g0(tArr);
            }
            return r.d(tArr[0]);
        }
        return s.k();
    }

    public static final List<Byte> e0(byte[] bArr) {
        jo.p.h(bArr, "<this>");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b10 : bArr) {
            arrayList.add(Byte.valueOf(b10));
        }
        return arrayList;
    }

    public static final List<Integer> f0(int[] iArr) {
        jo.p.h(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i10 : iArr) {
            arrayList.add(Integer.valueOf(i10));
        }
        return arrayList;
    }

    public static final <T> List<T> g0(T[] tArr) {
        jo.p.h(tArr, "<this>");
        return new ArrayList(s.f(tArr));
    }

    public static final List<Boolean> h0(boolean[] zArr) {
        jo.p.h(zArr, "<this>");
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z10 : zArr) {
            arrayList.add(Boolean.valueOf(z10));
        }
        return arrayList;
    }

    public static final <T> Set<T> i0(T[] tArr) {
        jo.p.h(tArr, "<this>");
        int length = tArr.length;
        if (length != 0) {
            if (length != 1) {
                return (Set) b0(tArr, new LinkedHashSet(m0.b(tArr.length)));
            }
            return s0.a(tArr[0]);
        }
        return t0.b();
    }
}
