package ep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class u implements Iterable<wn.k<? extends String, ? extends String>>, ko.a {

    /* renamed from: x  reason: collision with root package name */
    public static final b f31010x = new b(null);

    /* renamed from: w  reason: collision with root package name */
    public final String[] f31011w;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final List<String> f31012a = new ArrayList(20);

        public final a a(String str) {
            jo.p.h(str, "line");
            int T = so.o.T(str, ':', 0, false, 6, null);
            if (T != -1) {
                String substring = str.substring(0, T);
                jo.p.g(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                Objects.requireNonNull(substring, "null cannot be cast to non-null type kotlin.CharSequence");
                String obj = so.o.L0(substring).toString();
                String substring2 = str.substring(T + 1);
                jo.p.g(substring2, "(this as java.lang.String).substring(startIndex)");
                b(obj, substring2);
                return this;
            }
            throw new IllegalArgumentException(("Unexpected header: " + str).toString());
        }

        public final a b(String str, String str2) {
            jo.p.h(str, "name");
            jo.p.h(str2, "value");
            b bVar = u.f31010x;
            bVar.d(str);
            bVar.e(str2, str);
            e(str, str2);
            return this;
        }

        public final a c(u uVar) {
            jo.p.h(uVar, "headers");
            int size = uVar.size();
            for (int i10 = 0; i10 < size; i10++) {
                e(uVar.g(i10), uVar.m(i10));
            }
            return this;
        }

        public final a d(String str) {
            jo.p.h(str, "line");
            int T = so.o.T(str, ':', 1, false, 4, null);
            if (T != -1) {
                String substring = str.substring(0, T);
                jo.p.g(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                String substring2 = str.substring(T + 1);
                jo.p.g(substring2, "(this as java.lang.String).substring(startIndex)");
                e(substring, substring2);
            } else if (str.charAt(0) == ':') {
                String substring3 = str.substring(1);
                jo.p.g(substring3, "(this as java.lang.String).substring(startIndex)");
                e("", substring3);
            } else {
                e("", str);
            }
            return this;
        }

        public final a e(String str, String str2) {
            jo.p.h(str, "name");
            jo.p.h(str2, "value");
            this.f31012a.add(str);
            this.f31012a.add(so.o.L0(str2).toString());
            return this;
        }

        public final a f(String str, String str2) {
            jo.p.h(str, "name");
            jo.p.h(str2, "value");
            u.f31010x.d(str);
            e(str, str2);
            return this;
        }

        public final u g() {
            Object[] array = this.f31012a.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            return new u((String[]) array, null);
        }

        public final List<String> h() {
            return this.f31012a;
        }

        public final a i(String str) {
            jo.p.h(str, "name");
            int i10 = 0;
            while (i10 < this.f31012a.size()) {
                if (so.n.q(str, this.f31012a.get(i10), true)) {
                    this.f31012a.remove(i10);
                    this.f31012a.remove(i10);
                    i10 -= 2;
                }
                i10 += 2;
            }
            return this;
        }

        public final a j(String str, String str2) {
            jo.p.h(str, "name");
            jo.p.h(str2, "value");
            b bVar = u.f31010x;
            bVar.d(str);
            bVar.e(str2, str);
            i(str);
            e(str, str2);
            return this;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        public b() {
        }

        public final void d(String str) {
            if (str.length() > 0) {
                int length = str.length();
                for (int i10 = 0; i10 < length; i10++) {
                    char charAt = str.charAt(i10);
                    if (!('!' <= charAt && '~' >= charAt)) {
                        throw new IllegalArgumentException(fp.b.q("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i10), str).toString());
                    }
                }
                return;
            }
            throw new IllegalArgumentException("name is empty".toString());
        }

        public final void e(String str, String str2) {
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char charAt = str.charAt(i10);
                if (!(charAt == '\t' || (' ' <= charAt && '~' >= charAt))) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(fp.b.q("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i10), str2));
                    sb2.append(fp.b.D(str2) ? "" : ": " + str);
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
            }
        }

        public final String f(String[] strArr, String str) {
            po.g s10 = po.n.s(po.n.q(strArr.length - 2, 0), 2);
            int k10 = s10.k();
            int m10 = s10.m();
            int p10 = s10.p();
            if (p10 >= 0) {
                if (k10 > m10) {
                    return null;
                }
            } else if (k10 < m10) {
                return null;
            }
            while (!so.n.q(str, strArr[k10], true)) {
                if (k10 == m10) {
                    return null;
                }
                k10 += p10;
            }
            return strArr[k10 + 1];
        }

        public final u g(String... strArr) {
            jo.p.h(strArr, "namesAndValues");
            if (strArr.length % 2 == 0) {
                Object clone = strArr.clone();
                Objects.requireNonNull(clone, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                String[] strArr2 = (String[]) clone;
                int length = strArr2.length;
                for (int i10 = 0; i10 < length; i10++) {
                    if (strArr2[i10] != null) {
                        String str = strArr2[i10];
                        Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
                        strArr2[i10] = so.o.L0(str).toString();
                    } else {
                        throw new IllegalArgumentException("Headers cannot be null".toString());
                    }
                }
                po.g s10 = po.n.s(xn.o.I(strArr2), 2);
                int k10 = s10.k();
                int m10 = s10.m();
                int p10 = s10.p();
                if (p10 < 0 ? k10 >= m10 : k10 <= m10) {
                    while (true) {
                        String str2 = strArr2[k10];
                        String str3 = strArr2[k10 + 1];
                        d(str2);
                        e(str3, str2);
                        if (k10 == m10) {
                            break;
                        }
                        k10 += p10;
                    }
                }
                return new u(strArr2, null);
            }
            throw new IllegalArgumentException("Expected alternating header names and values".toString());
        }

        public /* synthetic */ b(jo.h hVar) {
            this();
        }
    }

    public u(String[] strArr) {
        this.f31011w = strArr;
    }

    public static final u k(String... strArr) {
        return f31010x.g(strArr);
    }

    public final String d(String str) {
        jo.p.h(str, "name");
        return f31010x.f(this.f31011w, str);
    }

    public boolean equals(Object obj) {
        return (obj instanceof u) && Arrays.equals(this.f31011w, ((u) obj).f31011w);
    }

    public final Date f(String str) {
        jo.p.h(str, "name");
        String d10 = d(str);
        if (d10 != null) {
            return kp.c.a(d10);
        }
        return null;
    }

    public final String g(int i10) {
        return this.f31011w[i10 * 2];
    }

    public int hashCode() {
        return Arrays.hashCode(this.f31011w);
    }

    @Override // java.lang.Iterable
    public Iterator<wn.k<? extends String, ? extends String>> iterator() {
        int size = size();
        wn.k[] kVarArr = new wn.k[size];
        for (int i10 = 0; i10 < size; i10++) {
            kVarArr[i10] = wn.q.a(g(i10), m(i10));
        }
        return jo.c.a(kVarArr);
    }

    public final a j() {
        a aVar = new a();
        xn.x.z(aVar.h(), this.f31011w);
        return aVar;
    }

    public final String m(int i10) {
        return this.f31011w[(i10 * 2) + 1];
    }

    public final List<String> p(String str) {
        jo.p.h(str, "name");
        int size = size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            if (so.n.q(str, g(i10), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(m(i10));
            }
        }
        if (arrayList != null) {
            List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
            jo.p.g(unmodifiableList, "Collections.unmodifiableList(result)");
            return unmodifiableList;
        }
        return xn.s.k();
    }

    public final int size() {
        return this.f31011w.length / 2;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            String g10 = g(i10);
            String m10 = m(i10);
            sb2.append(g10);
            sb2.append(": ");
            if (fp.b.D(g10)) {
                m10 = "██";
            }
            sb2.append(m10);
            sb2.append("\n");
        }
        String sb3 = sb2.toString();
        jo.p.g(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public /* synthetic */ u(String[] strArr, jo.h hVar) {
        this(strArr);
    }
}
