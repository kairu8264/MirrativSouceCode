package so;

import java.util.ArrayList;
import java.util.List;
import xn.a0;
import xn.s;
import xn.t;

/* loaded from: classes4.dex */
public class g extends f {

    /* loaded from: classes4.dex */
    public static final class a extends jo.q implements io.l<String, String> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f52790w = new a();

        public a() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final String invoke(String str) {
            jo.p.h(str, "line");
            return str;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends jo.q implements io.l<String, String> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f52791w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(1);
            this.f52791w = str;
        }

        @Override // io.l
        /* renamed from: a */
        public final String invoke(String str) {
            jo.p.h(str, "line");
            return this.f52791w + str;
        }
    }

    public static final io.l<String, String> b(String str) {
        return str.length() == 0 ? a.f52790w : new b(str);
    }

    public static final int c(String str) {
        int length = str.length();
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            } else if (!so.a.c(str.charAt(i10))) {
                break;
            } else {
                i10++;
            }
        }
        return i10 == -1 ? str.length() : i10;
    }

    public static final String d(String str, String str2) {
        String invoke;
        jo.p.h(str, "<this>");
        jo.p.h(str2, "newIndent");
        List<String> c02 = o.c0(str);
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : c02) {
            if (!n.r((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(t.u(arrayList, 10));
        for (String str3 : arrayList) {
            arrayList2.add(Integer.valueOf(c(str3)));
        }
        Integer num = (Integer) a0.m0(arrayList2);
        int i10 = 0;
        int intValue = num != null ? num.intValue() : 0;
        int length = str.length() + (str2.length() * c02.size());
        io.l<String, String> b10 = b(str2);
        int l10 = s.l(c02);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : c02) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                s.t();
            }
            String str4 = (String) obj2;
            if ((i10 == 0 || i10 == l10) && n.r(str4)) {
                str4 = null;
            } else {
                String M0 = q.M0(str4, intValue);
                if (M0 != null && (invoke = b10.invoke(M0)) != null) {
                    str4 = invoke;
                }
            }
            if (str4 != null) {
                arrayList3.add(str4);
            }
            i10 = i11;
        }
        String sb2 = ((StringBuilder) a0.e0(arrayList3, new StringBuilder(length), "\n", null, null, 0, null, null, 124, null)).toString();
        jo.p.g(sb2, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb2;
    }

    public static final String e(String str, String str2, String str3) {
        int i10;
        String invoke;
        jo.p.h(str, "<this>");
        jo.p.h(str2, "newIndent");
        jo.p.h(str3, "marginPrefix");
        if (!n.r(str3)) {
            List<String> c02 = o.c0(str);
            int length = str.length() + (str2.length() * c02.size());
            io.l<String, String> b10 = b(str2);
            int l10 = s.l(c02);
            ArrayList arrayList = new ArrayList();
            int i11 = 0;
            for (Object obj : c02) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    s.t();
                }
                String str4 = (String) obj;
                String str5 = null;
                if ((i11 == 0 || i11 == l10) && n.r(str4)) {
                    str4 = null;
                } else {
                    int length2 = str4.length();
                    int i13 = 0;
                    while (true) {
                        if (i13 >= length2) {
                            i10 = -1;
                            break;
                        } else if (!so.a.c(str4.charAt(i13))) {
                            i10 = i13;
                            break;
                        } else {
                            i13++;
                        }
                    }
                    if (i10 != -1) {
                        int i14 = i10;
                        if (n.B(str4, str3, i10, false, 4, null)) {
                            jo.p.f(str4, "null cannot be cast to non-null type java.lang.String");
                            str5 = str4.substring(i14 + str3.length());
                            jo.p.g(str5, "this as java.lang.String).substring(startIndex)");
                        }
                    }
                    if (str5 != null && (invoke = b10.invoke(str5)) != null) {
                        str4 = invoke;
                    }
                }
                if (str4 != null) {
                    arrayList.add(str4);
                }
                i11 = i12;
            }
            String sb2 = ((StringBuilder) a0.e0(arrayList, new StringBuilder(length), "\n", null, null, 0, null, null, 124, null)).toString();
            jo.p.g(sb2, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
            return sb2;
        }
        throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
    }

    public static final String f(String str) {
        jo.p.h(str, "<this>");
        return d(str, "");
    }

    public static final String g(String str, String str2) {
        jo.p.h(str, "<this>");
        jo.p.h(str2, "marginPrefix");
        return e(str, "", str2);
    }

    public static /* synthetic */ String h(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = "|";
        }
        return g(str, str2);
    }
}
