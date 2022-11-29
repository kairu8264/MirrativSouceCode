package so;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import xn.a0;
import xn.i0;
import xn.r;
import xn.t;

/* loaded from: classes4.dex */
public class o extends n {

    /* loaded from: classes4.dex */
    public static final class a extends jo.q implements io.p<CharSequence, Integer, wn.k<? extends Integer, ? extends Integer>> {

        /* renamed from: w */
        public final /* synthetic */ char[] f52792w;

        /* renamed from: x */
        public final /* synthetic */ boolean f52793x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(char[] cArr, boolean z10) {
            super(2);
            this.f52792w = cArr;
            this.f52793x = z10;
        }

        public final wn.k<Integer, Integer> a(CharSequence charSequence, int i10) {
            jo.p.h(charSequence, "$this$$receiver");
            int V = o.V(charSequence, this.f52792w, i10, this.f52793x);
            if (V < 0) {
                return null;
            }
            return wn.q.a(Integer.valueOf(V), 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.k<? extends Integer, ? extends Integer> invoke(CharSequence charSequence, Integer num) {
            return a(charSequence, num.intValue());
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends jo.q implements io.p<CharSequence, Integer, wn.k<? extends Integer, ? extends Integer>> {

        /* renamed from: w */
        public final /* synthetic */ List<String> f52794w;

        /* renamed from: x */
        public final /* synthetic */ boolean f52795x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<String> list, boolean z10) {
            super(2);
            this.f52794w = list;
            this.f52795x = z10;
        }

        public final wn.k<Integer, Integer> a(CharSequence charSequence, int i10) {
            jo.p.h(charSequence, "$this$$receiver");
            wn.k M = o.M(charSequence, this.f52794w, i10, this.f52795x, false);
            if (M != null) {
                return wn.q.a(M.c(), Integer.valueOf(((String) M.d()).length()));
            }
            return null;
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.k<? extends Integer, ? extends Integer> invoke(CharSequence charSequence, Integer num) {
            return a(charSequence, num.intValue());
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends jo.q implements io.l<po.i, String> {

        /* renamed from: w */
        public final /* synthetic */ CharSequence f52796w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(CharSequence charSequence) {
            super(1);
            this.f52796w = charSequence;
        }

        @Override // io.l
        /* renamed from: a */
        public final String invoke(po.i iVar) {
            jo.p.h(iVar, "it");
            return o.y0(this.f52796w, iVar);
        }
    }

    public static final String A0(String str, String str2, String str3) {
        jo.p.h(str, "<this>");
        jo.p.h(str2, TtmlNode.RUBY_DELIMITER);
        jo.p.h(str3, "missingDelimiterValue");
        int U = U(str, str2, 0, false, 6, null);
        if (U == -1) {
            return str3;
        }
        String substring = str.substring(U + str2.length(), str.length());
        jo.p.g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String B0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return z0(str, c10, str2);
    }

    public static /* synthetic */ String C0(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return A0(str, str2, str3);
    }

    public static final String D0(String str, char c10, String str2) {
        jo.p.h(str, "<this>");
        jo.p.h(str2, "missingDelimiterValue");
        int Y = Y(str, c10, 0, false, 6, null);
        if (Y == -1) {
            return str2;
        }
        String substring = str.substring(Y + 1, str.length());
        jo.p.g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final boolean E(CharSequence charSequence, char c10, boolean z10) {
        jo.p.h(charSequence, "<this>");
        return T(charSequence, c10, 0, z10, 2, null) >= 0;
    }

    public static /* synthetic */ String E0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return D0(str, c10, str2);
    }

    public static final boolean F(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        jo.p.h(charSequence, "<this>");
        jo.p.h(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (U(charSequence, (String) charSequence2, 0, z10, 2, null) >= 0) {
                return true;
            }
        } else if (S(charSequence, charSequence2, 0, charSequence.length(), z10, false, 16, null) >= 0) {
            return true;
        }
        return false;
    }

    public static final String F0(String str, char c10, String str2) {
        jo.p.h(str, "<this>");
        jo.p.h(str2, "missingDelimiterValue");
        int T = T(str, c10, 0, false, 6, null);
        if (T == -1) {
            return str2;
        }
        String substring = str.substring(0, T);
        jo.p.g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ boolean G(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return E(charSequence, c10, z10);
    }

    public static final String G0(String str, String str2, String str3) {
        jo.p.h(str, "<this>");
        jo.p.h(str2, TtmlNode.RUBY_DELIMITER);
        jo.p.h(str3, "missingDelimiterValue");
        int U = U(str, str2, 0, false, 6, null);
        if (U == -1) {
            return str3;
        }
        String substring = str.substring(0, U);
        jo.p.g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ boolean H(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return F(charSequence, charSequence2, z10);
    }

    public static /* synthetic */ String H0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return F0(str, c10, str2);
    }

    public static final boolean I(CharSequence charSequence, char c10, boolean z10) {
        jo.p.h(charSequence, "<this>");
        return charSequence.length() > 0 && so.b.d(charSequence.charAt(O(charSequence)), c10, z10);
    }

    public static /* synthetic */ String I0(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return G0(str, str2, str3);
    }

    public static final boolean J(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        jo.p.h(charSequence, "<this>");
        jo.p.h(charSequence2, "suffix");
        if (!z10 && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return n.p((String) charSequence, (String) charSequence2, false, 2, null);
        }
        return j0(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), z10);
    }

    public static final String J0(String str, char c10, String str2) {
        jo.p.h(str, "<this>");
        jo.p.h(str2, "missingDelimiterValue");
        int Y = Y(str, c10, 0, false, 6, null);
        if (Y == -1) {
            return str2;
        }
        String substring = str.substring(0, Y);
        jo.p.g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ boolean K(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return I(charSequence, c10, z10);
    }

    public static /* synthetic */ String K0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return J0(str, c10, str2);
    }

    public static /* synthetic */ boolean L(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return J(charSequence, charSequence2, z10);
    }

    public static final CharSequence L0(CharSequence charSequence) {
        jo.p.h(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean c10 = so.a.c(charSequence.charAt(!z10 ? i10 : length));
            if (z10) {
                if (!c10) {
                    break;
                }
                length--;
            } else if (c10) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }

    public static final wn.k<Integer, String> M(CharSequence charSequence, Collection<String> collection, int i10, boolean z10, boolean z11) {
        Object obj;
        Object obj2;
        if (!z10 && collection.size() == 1) {
            String str = (String) a0.s0(collection);
            int U = !z11 ? U(charSequence, str, i10, false, 4, null) : Z(charSequence, str, i10, false, 4, null);
            if (U < 0) {
                return null;
            }
            return wn.q.a(Integer.valueOf(U), str);
        }
        po.g iVar = !z11 ? new po.i(po.n.d(i10, 0), charSequence.length()) : po.n.q(po.n.i(i10, O(charSequence)), 0);
        if (charSequence instanceof String) {
            int k10 = iVar.k();
            int m10 = iVar.m();
            int p10 = iVar.p();
            if ((p10 > 0 && k10 <= m10) || (p10 < 0 && m10 <= k10)) {
                while (true) {
                    Iterator<T> it = collection.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        String str2 = (String) obj2;
                        if (n.s(str2, 0, (String) charSequence, k10, str2.length(), z10)) {
                            break;
                        }
                    }
                    String str3 = (String) obj2;
                    if (str3 == null) {
                        if (k10 == m10) {
                            break;
                        }
                        k10 += p10;
                    } else {
                        return wn.q.a(Integer.valueOf(k10), str3);
                    }
                }
            }
        } else {
            int k11 = iVar.k();
            int m11 = iVar.m();
            int p11 = iVar.p();
            if ((p11 > 0 && k11 <= m11) || (p11 < 0 && m11 <= k11)) {
                while (true) {
                    Iterator<T> it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        String str4 = (String) obj;
                        if (j0(str4, 0, charSequence, k11, str4.length(), z10)) {
                            break;
                        }
                    }
                    String str5 = (String) obj;
                    if (str5 == null) {
                        if (k11 == m11) {
                            break;
                        }
                        k11 += p11;
                    } else {
                        return wn.q.a(Integer.valueOf(k11), str5);
                    }
                }
            }
        }
        return null;
    }

    public static final po.i N(CharSequence charSequence) {
        jo.p.h(charSequence, "<this>");
        return new po.i(0, charSequence.length() - 1);
    }

    public static final int O(CharSequence charSequence) {
        jo.p.h(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int P(CharSequence charSequence, char c10, int i10, boolean z10) {
        jo.p.h(charSequence, "<this>");
        if (!z10 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c10, i10);
        }
        return V(charSequence, new char[]{c10}, i10, z10);
    }

    public static final int Q(CharSequence charSequence, String str, int i10, boolean z10) {
        jo.p.h(charSequence, "<this>");
        jo.p.h(str, "string");
        if (!z10 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i10);
        }
        return S(charSequence, str, i10, charSequence.length(), z10, false, 16, null);
    }

    public static final int R(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11) {
        po.g q10;
        if (!z11) {
            q10 = new po.i(po.n.d(i10, 0), po.n.i(i11, charSequence.length()));
        } else {
            q10 = po.n.q(po.n.i(i10, O(charSequence)), po.n.d(i11, 0));
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int k10 = q10.k();
            int m10 = q10.m();
            int p10 = q10.p();
            if ((p10 <= 0 || k10 > m10) && (p10 >= 0 || m10 > k10)) {
                return -1;
            }
            while (!n.s((String) charSequence2, 0, (String) charSequence, k10, charSequence2.length(), z10)) {
                if (k10 == m10) {
                    return -1;
                }
                k10 += p10;
            }
            return k10;
        }
        int k11 = q10.k();
        int m11 = q10.m();
        int p11 = q10.p();
        if ((p11 <= 0 || k11 > m11) && (p11 >= 0 || m11 > k11)) {
            return -1;
        }
        while (!j0(charSequence2, 0, charSequence, k11, charSequence2.length(), z10)) {
            if (k11 == m11) {
                return -1;
            }
            k11 += p11;
        }
        return k11;
    }

    public static /* synthetic */ int S(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11, int i12, Object obj) {
        if ((i12 & 16) != 0) {
            z11 = false;
        }
        return R(charSequence, charSequence2, i10, i11, z10, z11);
    }

    public static /* synthetic */ int T(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return P(charSequence, c10, i10, z10);
    }

    public static /* synthetic */ int U(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return Q(charSequence, str, i10, z10);
    }

    public static final int V(CharSequence charSequence, char[] cArr, int i10, boolean z10) {
        boolean z11;
        jo.p.h(charSequence, "<this>");
        jo.p.h(cArr, "chars");
        if (!z10 && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(xn.o.V(cArr), i10);
        }
        i0 it = new po.i(po.n.d(i10, 0), O(charSequence)).iterator();
        while (it.hasNext()) {
            int b10 = it.b();
            char charAt = charSequence.charAt(b10);
            int length = cArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    z11 = false;
                    continue;
                    break;
                } else if (so.b.d(cArr[i11], charAt, z10)) {
                    z11 = true;
                    continue;
                    break;
                } else {
                    i11++;
                }
            }
            if (z11) {
                return b10;
            }
        }
        return -1;
    }

    public static final int W(CharSequence charSequence, char c10, int i10, boolean z10) {
        jo.p.h(charSequence, "<this>");
        if (!z10 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(c10, i10);
        }
        return a0(charSequence, new char[]{c10}, i10, z10);
    }

    public static final int X(CharSequence charSequence, String str, int i10, boolean z10) {
        jo.p.h(charSequence, "<this>");
        jo.p.h(str, "string");
        if (!z10 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(str, i10);
        }
        return R(charSequence, str, i10, 0, z10, true);
    }

    public static /* synthetic */ int Y(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = O(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return W(charSequence, c10, i10, z10);
    }

    public static /* synthetic */ int Z(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = O(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return X(charSequence, str, i10, z10);
    }

    public static final int a0(CharSequence charSequence, char[] cArr, int i10, boolean z10) {
        jo.p.h(charSequence, "<this>");
        jo.p.h(cArr, "chars");
        if (!z10 && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(xn.o.V(cArr), i10);
        }
        for (int i11 = po.n.i(i10, O(charSequence)); -1 < i11; i11--) {
            char charAt = charSequence.charAt(i11);
            int length = cArr.length;
            boolean z11 = false;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    break;
                } else if (so.b.d(cArr[i12], charAt, z10)) {
                    z11 = true;
                    break;
                } else {
                    i12++;
                }
            }
            if (z11) {
                return i11;
            }
        }
        return -1;
    }

    public static final ro.g<String> b0(CharSequence charSequence) {
        jo.p.h(charSequence, "<this>");
        return t0(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, null);
    }

    public static final List<String> c0(CharSequence charSequence) {
        jo.p.h(charSequence, "<this>");
        return ro.n.v(b0(charSequence));
    }

    public static final CharSequence d0(CharSequence charSequence, int i10, char c10) {
        jo.p.h(charSequence, "<this>");
        if (i10 >= 0) {
            if (i10 <= charSequence.length()) {
                return charSequence.subSequence(0, charSequence.length());
            }
            StringBuilder sb2 = new StringBuilder(i10);
            i0 it = new po.i(1, i10 - charSequence.length()).iterator();
            while (it.hasNext()) {
                it.b();
                sb2.append(c10);
            }
            sb2.append(charSequence);
            return sb2;
        }
        throw new IllegalArgumentException("Desired length " + i10 + " is less than zero.");
    }

    public static final String e0(String str, int i10, char c10) {
        jo.p.h(str, "<this>");
        return d0(str, i10, c10).toString();
    }

    public static final ro.g<po.i> f0(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11) {
        m0(i11);
        return new d(charSequence, i10, i11, new a(cArr, z10));
    }

    public static final ro.g<po.i> g0(CharSequence charSequence, String[] strArr, int i10, boolean z10, int i11) {
        m0(i11);
        return new d(charSequence, i10, i11, new b(xn.n.c(strArr), z10));
    }

    public static /* synthetic */ ro.g h0(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return f0(charSequence, cArr, i10, z10, i11);
    }

    public static /* synthetic */ ro.g i0(CharSequence charSequence, String[] strArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return g0(charSequence, strArr, i10, z10, i11);
    }

    public static final boolean j0(CharSequence charSequence, int i10, CharSequence charSequence2, int i11, int i12, boolean z10) {
        jo.p.h(charSequence, "<this>");
        jo.p.h(charSequence2, "other");
        if (i11 < 0 || i10 < 0 || i10 > charSequence.length() - i12 || i11 > charSequence2.length() - i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!so.b.d(charSequence.charAt(i10 + i13), charSequence2.charAt(i11 + i13), z10)) {
                return false;
            }
        }
        return true;
    }

    public static final String k0(String str, CharSequence charSequence) {
        jo.p.h(str, "<this>");
        jo.p.h(charSequence, "prefix");
        if (x0(str, charSequence, false, 2, null)) {
            String substring = str.substring(charSequence.length());
            jo.p.g(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        return str;
    }

    public static final String l0(String str, CharSequence charSequence) {
        jo.p.h(str, "<this>");
        jo.p.h(charSequence, "suffix");
        if (L(str, charSequence, false, 2, null)) {
            String substring = str.substring(0, str.length() - charSequence.length());
            jo.p.g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return str;
    }

    public static final void m0(int i10) {
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i10).toString());
    }

    public static final List<String> n0(CharSequence charSequence, char[] cArr, boolean z10, int i10) {
        jo.p.h(charSequence, "<this>");
        jo.p.h(cArr, "delimiters");
        if (cArr.length == 1) {
            return p0(charSequence, String.valueOf(cArr[0]), z10, i10);
        }
        Iterable<po.i> f10 = ro.n.f(h0(charSequence, cArr, 0, z10, i10, 2, null));
        ArrayList arrayList = new ArrayList(t.u(f10, 10));
        for (po.i iVar : f10) {
            arrayList.add(y0(charSequence, iVar));
        }
        return arrayList;
    }

    public static final List<String> o0(CharSequence charSequence, String[] strArr, boolean z10, int i10) {
        jo.p.h(charSequence, "<this>");
        jo.p.h(strArr, "delimiters");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (!(str.length() == 0)) {
                return p0(charSequence, str, z10, i10);
            }
        }
        Iterable<po.i> f10 = ro.n.f(i0(charSequence, strArr, 0, z10, i10, 2, null));
        ArrayList arrayList = new ArrayList(t.u(f10, 10));
        for (po.i iVar : f10) {
            arrayList.add(y0(charSequence, iVar));
        }
        return arrayList;
    }

    public static final List<String> p0(CharSequence charSequence, String str, boolean z10, int i10) {
        m0(i10);
        int i11 = 0;
        int Q = Q(charSequence, str, 0, z10);
        if (Q != -1 && i10 != 1) {
            boolean z11 = i10 > 0;
            ArrayList arrayList = new ArrayList(z11 ? po.n.i(i10, 10) : 10);
            do {
                arrayList.add(charSequence.subSequence(i11, Q).toString());
                i11 = str.length() + Q;
                if (z11 && arrayList.size() == i10 - 1) {
                    break;
                }
                Q = Q(charSequence, str, i11, z10);
            } while (Q != -1);
            arrayList.add(charSequence.subSequence(i11, charSequence.length()).toString());
            return arrayList;
        }
        return r.d(charSequence.toString());
    }

    public static /* synthetic */ List q0(CharSequence charSequence, char[] cArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return n0(charSequence, cArr, z10, i10);
    }

    public static /* synthetic */ List r0(CharSequence charSequence, String[] strArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return o0(charSequence, strArr, z10, i10);
    }

    public static final ro.g<String> s0(CharSequence charSequence, String[] strArr, boolean z10, int i10) {
        jo.p.h(charSequence, "<this>");
        jo.p.h(strArr, "delimiters");
        return ro.n.r(i0(charSequence, strArr, 0, z10, i10, 2, null), new c(charSequence));
    }

    public static /* synthetic */ ro.g t0(CharSequence charSequence, String[] strArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return s0(charSequence, strArr, z10, i10);
    }

    public static final boolean u0(CharSequence charSequence, char c10, boolean z10) {
        jo.p.h(charSequence, "<this>");
        return charSequence.length() > 0 && so.b.d(charSequence.charAt(0), c10, z10);
    }

    public static final boolean v0(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        jo.p.h(charSequence, "<this>");
        jo.p.h(charSequence2, "prefix");
        if (!z10 && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return n.C((String) charSequence, (String) charSequence2, false, 2, null);
        }
        return j0(charSequence, 0, charSequence2, 0, charSequence2.length(), z10);
    }

    public static /* synthetic */ boolean w0(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return u0(charSequence, c10, z10);
    }

    public static /* synthetic */ boolean x0(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return v0(charSequence, charSequence2, z10);
    }

    public static final String y0(CharSequence charSequence, po.i iVar) {
        jo.p.h(charSequence, "<this>");
        jo.p.h(iVar, "range");
        return charSequence.subSequence(iVar.d().intValue(), iVar.j().intValue() + 1).toString();
    }

    public static final String z0(String str, char c10, String str2) {
        jo.p.h(str, "<this>");
        jo.p.h(str2, "missingDelimiterValue");
        int T = T(str, c10, 0, false, 6, null);
        if (T == -1) {
            return str2;
        }
        String substring = str.substring(T + 1, str.length());
        jo.p.g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }
}
