package ep;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    public final String f31037a;

    /* renamed from: b  reason: collision with root package name */
    public final String f31038b;

    /* renamed from: c  reason: collision with root package name */
    public final String f31039c;

    /* renamed from: d  reason: collision with root package name */
    public final String[] f31040d;

    /* renamed from: g  reason: collision with root package name */
    public static final a f31036g = new a(null);

    /* renamed from: e  reason: collision with root package name */
    public static final Pattern f31034e = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: f  reason: collision with root package name */
    public static final Pattern f31035f = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* loaded from: classes4.dex */
    public static final class a {
        public a() {
        }

        public final x a(String str) {
            jo.p.h(str, "$this$toMediaType");
            Matcher matcher = x.f31034e.matcher(str);
            if (matcher.lookingAt()) {
                String group = matcher.group(1);
                jo.p.g(group, "typeSubtype.group(1)");
                Locale locale = Locale.US;
                jo.p.g(locale, "Locale.US");
                Objects.requireNonNull(group, "null cannot be cast to non-null type java.lang.String");
                String lowerCase = group.toLowerCase(locale);
                jo.p.g(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                String group2 = matcher.group(2);
                jo.p.g(group2, "typeSubtype.group(2)");
                jo.p.g(locale, "Locale.US");
                Objects.requireNonNull(group2, "null cannot be cast to non-null type java.lang.String");
                String lowerCase2 = group2.toLowerCase(locale);
                jo.p.g(lowerCase2, "(this as java.lang.String).toLowerCase(locale)");
                ArrayList arrayList = new ArrayList();
                Matcher matcher2 = x.f31035f.matcher(str);
                int end = matcher.end();
                while (end < str.length()) {
                    matcher2.region(end, str.length());
                    if (matcher2.lookingAt()) {
                        String group3 = matcher2.group(1);
                        if (group3 == null) {
                            end = matcher2.end();
                        } else {
                            String group4 = matcher2.group(2);
                            if (group4 == null) {
                                group4 = matcher2.group(3);
                            } else if (so.n.C(group4, "'", false, 2, null) && so.n.p(group4, "'", false, 2, null) && group4.length() > 2) {
                                group4 = group4.substring(1, group4.length() - 1);
                                jo.p.g(group4, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                            }
                            arrayList.add(group3);
                            arrayList.add(group4);
                            end = matcher2.end();
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Parameter is not formatted correctly: \"");
                        String substring = str.substring(end);
                        jo.p.g(substring, "(this as java.lang.String).substring(startIndex)");
                        sb2.append(substring);
                        sb2.append("\" for: \"");
                        sb2.append(str);
                        sb2.append('\"');
                        throw new IllegalArgumentException(sb2.toString().toString());
                    }
                }
                Object[] array = arrayList.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                return new x(str, lowerCase, lowerCase2, (String[]) array, null);
            }
            throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
        }

        public final x b(String str) {
            jo.p.h(str, "$this$toMediaTypeOrNull");
            try {
                return a(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    public x(String str, String str2, String str3, String[] strArr) {
        this.f31037a = str;
        this.f31038b = str2;
        this.f31039c = str3;
        this.f31040d = strArr;
    }

    public static /* synthetic */ Charset d(x xVar, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = null;
        }
        return xVar.c(charset);
    }

    public static final x e(String str) {
        return f31036g.a(str);
    }

    public final Charset c(Charset charset) {
        String f10 = f("charset");
        if (f10 != null) {
            try {
                return Charset.forName(f10);
            } catch (IllegalArgumentException unused) {
                return charset;
            }
        }
        return charset;
    }

    public boolean equals(Object obj) {
        return (obj instanceof x) && jo.p.c(((x) obj).f31037a, this.f31037a);
    }

    public final String f(String str) {
        jo.p.h(str, "name");
        po.g s10 = po.n.s(xn.o.I(this.f31040d), 2);
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
        while (!so.n.q(this.f31040d[k10], str, true)) {
            if (k10 == m10) {
                return null;
            }
            k10 += p10;
        }
        return this.f31040d[k10 + 1];
    }

    public final String g() {
        return this.f31039c;
    }

    public final String h() {
        return this.f31038b;
    }

    public int hashCode() {
        return this.f31037a.hashCode();
    }

    public String toString() {
        return this.f31037a;
    }

    public /* synthetic */ x(String str, String str2, String str3, String[] strArr, jo.h hVar) {
        this(str, str2, str3, strArr);
    }
}
