package ep;

import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* loaded from: classes4.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final String f30964a;

    /* renamed from: b  reason: collision with root package name */
    public final String f30965b;

    /* renamed from: c  reason: collision with root package name */
    public final long f30966c;

    /* renamed from: d  reason: collision with root package name */
    public final String f30967d;

    /* renamed from: e  reason: collision with root package name */
    public final String f30968e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f30969f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f30970g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f30971h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f30972i;

    /* renamed from: n  reason: collision with root package name */
    public static final b f30963n = new b(null);

    /* renamed from: j  reason: collision with root package name */
    public static final Pattern f30959j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k  reason: collision with root package name */
    public static final Pattern f30960k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l  reason: collision with root package name */
    public static final Pattern f30961l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m  reason: collision with root package name */
    public static final Pattern f30962m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public String f30973a;

        /* renamed from: b  reason: collision with root package name */
        public String f30974b;

        /* renamed from: d  reason: collision with root package name */
        public String f30976d;

        /* renamed from: f  reason: collision with root package name */
        public boolean f30978f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f30979g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f30980h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f30981i;

        /* renamed from: c  reason: collision with root package name */
        public long f30975c = 253402300799999L;

        /* renamed from: e  reason: collision with root package name */
        public String f30977e = "/";

        public final m a() {
            String str = this.f30973a;
            Objects.requireNonNull(str, "builder.name == null");
            String str2 = this.f30974b;
            Objects.requireNonNull(str2, "builder.value == null");
            long j10 = this.f30975c;
            String str3 = this.f30976d;
            Objects.requireNonNull(str3, "builder.domain == null");
            return new m(str, str2, j10, str3, this.f30977e, this.f30978f, this.f30979g, this.f30980h, this.f30981i, null);
        }

        public final a b(String str) {
            jo.p.h(str, "domain");
            return c(str, false);
        }

        public final a c(String str, boolean z10) {
            String e10 = fp.a.e(str);
            if (e10 != null) {
                this.f30976d = e10;
                this.f30981i = z10;
                return this;
            }
            throw new IllegalArgumentException("unexpected domain: " + str);
        }

        public final a d(String str) {
            jo.p.h(str, "name");
            if (jo.p.c(so.o.L0(str).toString(), str)) {
                this.f30973a = str;
                return this;
            }
            throw new IllegalArgumentException("name is not trimmed".toString());
        }

        public final a e(String str) {
            jo.p.h(str, "value");
            if (jo.p.c(so.o.L0(str).toString(), str)) {
                this.f30974b = str;
                return this;
            }
            throw new IllegalArgumentException("value is not trimmed".toString());
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        public b() {
        }

        public final int a(String str, int i10, int i11, boolean z10) {
            while (i10 < i11) {
                char charAt = str.charAt(i10);
                if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || ('0' <= charAt && '9' >= charAt) || (('a' <= charAt && 'z' >= charAt) || (('A' <= charAt && 'Z' >= charAt) || charAt == ':'))) == (!z10)) {
                    return i10;
                }
                i10++;
            }
            return i11;
        }

        public final boolean b(String str, String str2) {
            if (jo.p.c(str, str2)) {
                return true;
            }
            return so.n.p(str, str2, false, 2, null) && str.charAt((str.length() - str2.length()) - 1) == '.' && !fp.b.f(str);
        }

        public final m c(v vVar, String str) {
            jo.p.h(vVar, "url");
            jo.p.h(str, "setCookie");
            return d(System.currentTimeMillis(), vVar, str);
        }

        /* JADX WARN: Code restructure failed: missing block: B:56:0x0102, code lost:
            if (r1 > 253402300799999L) goto L86;
         */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0114  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0117  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x015a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final ep.m d(long r26, ep.v r28, java.lang.String r29) {
            /*
                Method dump skipped, instructions count: 373
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ep.m.b.d(long, ep.v, java.lang.String):ep.m");
        }

        public final List<m> e(v vVar, u uVar) {
            jo.p.h(vVar, "url");
            jo.p.h(uVar, "headers");
            List<String> p10 = uVar.p("Set-Cookie");
            int size = p10.size();
            ArrayList arrayList = null;
            for (int i10 = 0; i10 < size; i10++) {
                m c10 = c(vVar, p10.get(i10));
                if (c10 != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(c10);
                }
            }
            if (arrayList != null) {
                List<m> unmodifiableList = Collections.unmodifiableList(arrayList);
                jo.p.g(unmodifiableList, "Collections.unmodifiableList(cookies)");
                return unmodifiableList;
            }
            return xn.s.k();
        }

        public final String f(String str) {
            if (!so.n.p(str, TopicConstant.SEPARATOR, false, 2, null)) {
                String e10 = fp.a.e(so.o.k0(str, TopicConstant.SEPARATOR));
                if (e10 != null) {
                    return e10;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        public final long g(String str, int i10, int i11) {
            int a10 = a(str, i10, i11, false);
            Matcher matcher = m.f30962m.matcher(str);
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            while (a10 < i11) {
                int a11 = a(str, a10 + 1, i11, true);
                matcher.region(a10, a11);
                if (i13 != -1 || !matcher.usePattern(m.f30962m).matches()) {
                    if (i14 != -1 || !matcher.usePattern(m.f30961l).matches()) {
                        if (i15 != -1 || !matcher.usePattern(m.f30960k).matches()) {
                            if (i12 == -1 && matcher.usePattern(m.f30959j).matches()) {
                                String group = matcher.group(1);
                                jo.p.g(group, "matcher.group(1)");
                                i12 = Integer.parseInt(group);
                            }
                        } else {
                            String group2 = matcher.group(1);
                            jo.p.g(group2, "matcher.group(1)");
                            Locale locale = Locale.US;
                            jo.p.g(locale, "Locale.US");
                            Objects.requireNonNull(group2, "null cannot be cast to non-null type java.lang.String");
                            String lowerCase = group2.toLowerCase(locale);
                            jo.p.g(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                            String pattern = m.f30960k.pattern();
                            jo.p.g(pattern, "MONTH_PATTERN.pattern()");
                            i15 = so.o.U(pattern, lowerCase, 0, false, 6, null) / 4;
                        }
                    } else {
                        String group3 = matcher.group(1);
                        jo.p.g(group3, "matcher.group(1)");
                        i14 = Integer.parseInt(group3);
                    }
                } else {
                    String group4 = matcher.group(1);
                    jo.p.g(group4, "matcher.group(1)");
                    i13 = Integer.parseInt(group4);
                    String group5 = matcher.group(2);
                    jo.p.g(group5, "matcher.group(2)");
                    i16 = Integer.parseInt(group5);
                    String group6 = matcher.group(3);
                    jo.p.g(group6, "matcher.group(3)");
                    i17 = Integer.parseInt(group6);
                }
                a10 = a(str, a11 + 1, i11, false);
            }
            if (70 <= i12 && 99 >= i12) {
                i12 += 1900;
            }
            if (i12 >= 0 && 69 >= i12) {
                i12 += 2000;
            }
            if (i12 >= 1601) {
                if (i15 != -1) {
                    if (1 <= i14 && 31 >= i14) {
                        if (i13 >= 0 && 23 >= i13) {
                            if (i16 >= 0 && 59 >= i16) {
                                if (i17 >= 0 && 59 >= i17) {
                                    GregorianCalendar gregorianCalendar = new GregorianCalendar(fp.b.f32118f);
                                    gregorianCalendar.setLenient(false);
                                    gregorianCalendar.set(1, i12);
                                    gregorianCalendar.set(2, i15 - 1);
                                    gregorianCalendar.set(5, i14);
                                    gregorianCalendar.set(11, i13);
                                    gregorianCalendar.set(12, i16);
                                    gregorianCalendar.set(13, i17);
                                    gregorianCalendar.set(14, 0);
                                    return gregorianCalendar.getTimeInMillis();
                                }
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        public final long h(String str) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong <= 0) {
                    return Long.MIN_VALUE;
                }
                return parseLong;
            } catch (NumberFormatException e10) {
                if (new so.e("-?\\d+").a(str)) {
                    return so.n.C(str, "-", false, 2, null) ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                throw e10;
            }
        }

        public /* synthetic */ b(jo.h hVar) {
            this();
        }
    }

    public m(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f30964a = str;
        this.f30965b = str2;
        this.f30966c = j10;
        this.f30967d = str3;
        this.f30968e = str4;
        this.f30969f = z10;
        this.f30970g = z11;
        this.f30971h = z12;
        this.f30972i = z13;
    }

    public final String e() {
        return this.f30964a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (jo.p.c(mVar.f30964a, this.f30964a) && jo.p.c(mVar.f30965b, this.f30965b) && mVar.f30966c == this.f30966c && jo.p.c(mVar.f30967d, this.f30967d) && jo.p.c(mVar.f30968e, this.f30968e) && mVar.f30969f == this.f30969f && mVar.f30970g == this.f30970g && mVar.f30971h == this.f30971h && mVar.f30972i == this.f30972i) {
                return true;
            }
        }
        return false;
    }

    public final String f(boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f30964a);
        sb2.append('=');
        sb2.append(this.f30965b);
        if (this.f30971h) {
            if (this.f30966c == Long.MIN_VALUE) {
                sb2.append("; max-age=0");
            } else {
                sb2.append("; expires=");
                sb2.append(kp.c.b(new Date(this.f30966c)));
            }
        }
        if (!this.f30972i) {
            sb2.append("; domain=");
            if (z10) {
                sb2.append(TopicConstant.SEPARATOR);
            }
            sb2.append(this.f30967d);
        }
        sb2.append("; path=");
        sb2.append(this.f30968e);
        if (this.f30969f) {
            sb2.append("; secure");
        }
        if (this.f30970g) {
            sb2.append("; httponly");
        }
        String sb3 = sb2.toString();
        jo.p.g(sb3, "toString()");
        return sb3;
    }

    public final String g() {
        return this.f30965b;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return ((((((((((((((((527 + this.f30964a.hashCode()) * 31) + this.f30965b.hashCode()) * 31) + Long.hashCode(this.f30966c)) * 31) + this.f30967d.hashCode()) * 31) + this.f30968e.hashCode()) * 31) + Boolean.hashCode(this.f30969f)) * 31) + Boolean.hashCode(this.f30970g)) * 31) + Boolean.hashCode(this.f30971h)) * 31) + Boolean.hashCode(this.f30972i);
    }

    public String toString() {
        return f(false);
    }

    public /* synthetic */ m(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13, jo.h hVar) {
        this(str, str2, j10, str3, str4, z10, z11, z12, z13);
    }
}
