package ep;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f31015a;

    /* renamed from: b  reason: collision with root package name */
    public final String f31016b;

    /* renamed from: c  reason: collision with root package name */
    public final String f31017c;

    /* renamed from: d  reason: collision with root package name */
    public final String f31018d;

    /* renamed from: e  reason: collision with root package name */
    public final String f31019e;

    /* renamed from: f  reason: collision with root package name */
    public final int f31020f;

    /* renamed from: g  reason: collision with root package name */
    public final List<String> f31021g;

    /* renamed from: h  reason: collision with root package name */
    public final List<String> f31022h;

    /* renamed from: i  reason: collision with root package name */
    public final String f31023i;

    /* renamed from: j  reason: collision with root package name */
    public final String f31024j;

    /* renamed from: l  reason: collision with root package name */
    public static final b f31014l = new b(null);

    /* renamed from: k  reason: collision with root package name */
    public static final char[] f31013k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: i  reason: collision with root package name */
        public static final C0314a f31025i = new C0314a(null);

        /* renamed from: a  reason: collision with root package name */
        public String f31026a;

        /* renamed from: d  reason: collision with root package name */
        public String f31029d;

        /* renamed from: f  reason: collision with root package name */
        public final List<String> f31031f;

        /* renamed from: g  reason: collision with root package name */
        public List<String> f31032g;

        /* renamed from: h  reason: collision with root package name */
        public String f31033h;

        /* renamed from: b  reason: collision with root package name */
        public String f31027b = "";

        /* renamed from: c  reason: collision with root package name */
        public String f31028c = "";

        /* renamed from: e  reason: collision with root package name */
        public int f31030e = -1;

        /* renamed from: ep.v$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0314a {
            public C0314a() {
            }

            public final int e(String str, int i10, int i11) {
                try {
                    int parseInt = Integer.parseInt(b.b(v.f31014l, str, i10, i11, "", false, false, false, false, null, 248, null));
                    if (1 <= parseInt && 65535 >= parseInt) {
                        return parseInt;
                    }
                    return -1;
                } catch (NumberFormatException unused) {
                    return -1;
                }
            }

            public final int f(String str, int i10, int i11) {
                while (i10 < i11) {
                    char charAt = str.charAt(i10);
                    if (charAt == ':') {
                        return i10;
                    }
                    if (charAt == '[') {
                        do {
                            i10++;
                            if (i10 < i11) {
                            }
                        } while (str.charAt(i10) != ']');
                    }
                    i10++;
                }
                return i11;
            }

            public final int g(String str, int i10, int i11) {
                if (i11 - i10 < 2) {
                    return -1;
                }
                char charAt = str.charAt(i10);
                if ((jo.p.j(charAt, 97) < 0 || jo.p.j(charAt, 122) > 0) && (jo.p.j(charAt, 65) < 0 || jo.p.j(charAt, 90) > 0)) {
                    return -1;
                }
                while (true) {
                    i10++;
                    if (i10 >= i11) {
                        return -1;
                    }
                    char charAt2 = str.charAt(i10);
                    if ('a' > charAt2 || 'z' < charAt2) {
                        if ('A' > charAt2 || 'Z' < charAt2) {
                            if ('0' > charAt2 || '9' < charAt2) {
                                if (charAt2 != '+' && charAt2 != '-' && charAt2 != '.') {
                                    if (charAt2 == ':') {
                                        return i10;
                                    }
                                    return -1;
                                }
                            }
                        }
                    }
                }
            }

            public final int h(String str, int i10, int i11) {
                int i12 = 0;
                while (i10 < i11) {
                    char charAt = str.charAt(i10);
                    if (charAt != '\\' && charAt != '/') {
                        break;
                    }
                    i12++;
                    i10++;
                }
                return i12;
            }

            public /* synthetic */ C0314a(jo.h hVar) {
                this();
            }
        }

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f31031f = arrayList;
            arrayList.add("");
        }

        public final a a(String str, String str2) {
            jo.p.h(str, "encodedName");
            if (this.f31032g == null) {
                this.f31032g = new ArrayList();
            }
            List<String> list = this.f31032g;
            jo.p.e(list);
            b bVar = v.f31014l;
            list.add(b.b(bVar, str, 0, 0, " \"'<>#&=", true, false, true, false, null, 211, null));
            List<String> list2 = this.f31032g;
            jo.p.e(list2);
            list2.add(str2 != null ? b.b(bVar, str2, 0, 0, " \"'<>#&=", true, false, true, false, null, 211, null) : null);
            return this;
        }

        public final a b(String str, String str2) {
            jo.p.h(str, "name");
            if (this.f31032g == null) {
                this.f31032g = new ArrayList();
            }
            List<String> list = this.f31032g;
            jo.p.e(list);
            b bVar = v.f31014l;
            list.add(b.b(bVar, str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219, null));
            List<String> list2 = this.f31032g;
            jo.p.e(list2);
            list2.add(str2 != null ? b.b(bVar, str2, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219, null) : null);
            return this;
        }

        public final v c() {
            ArrayList arrayList;
            String str = this.f31026a;
            if (str != null) {
                b bVar = v.f31014l;
                String h10 = b.h(bVar, this.f31027b, 0, 0, false, 7, null);
                String h11 = b.h(bVar, this.f31028c, 0, 0, false, 7, null);
                String str2 = this.f31029d;
                if (str2 != null) {
                    int d10 = d();
                    List<String> list = this.f31031f;
                    ArrayList arrayList2 = new ArrayList(xn.t.u(list, 10));
                    for (String str3 : list) {
                        arrayList2.add(b.h(v.f31014l, str3, 0, 0, false, 7, null));
                    }
                    List<String> list2 = this.f31032g;
                    if (list2 != null) {
                        arrayList = new ArrayList(xn.t.u(list2, 10));
                        for (String str4 : list2) {
                            arrayList.add(str4 != null ? b.h(v.f31014l, str4, 0, 0, true, 3, null) : null);
                        }
                    } else {
                        arrayList = null;
                    }
                    String str5 = this.f31033h;
                    return new v(str, h10, h11, str2, d10, arrayList2, arrayList, str5 != null ? b.h(v.f31014l, str5, 0, 0, false, 7, null) : null, toString());
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        public final int d() {
            int i10 = this.f31030e;
            if (i10 != -1) {
                return i10;
            }
            b bVar = v.f31014l;
            String str = this.f31026a;
            jo.p.e(str);
            return bVar.c(str);
        }

        public final a e(String str) {
            List<String> list;
            if (str != null) {
                b bVar = v.f31014l;
                String b10 = b.b(bVar, str, 0, 0, " \"'<>#", true, false, true, false, null, 211, null);
                if (b10 != null) {
                    list = bVar.j(b10);
                    this.f31032g = list;
                    return this;
                }
            }
            list = null;
            this.f31032g = list;
            return this;
        }

        public final a f(String str) {
            this.f31033h = str != null ? b.b(v.f31014l, str, 0, 0, "", false, false, false, true, null, 187, null) : null;
            return this;
        }

        public final List<String> g() {
            return this.f31031f;
        }

        public final a h(String str) {
            jo.p.h(str, "host");
            String e10 = fp.a.e(b.h(v.f31014l, str, 0, 0, false, 7, null));
            if (e10 != null) {
                this.f31029d = e10;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + str);
        }

        public final boolean i(String str) {
            return jo.p.c(str, TopicConstant.SEPARATOR) || so.n.q(str, "%2e", true);
        }

        public final boolean j(String str) {
            return jo.p.c(str, "..") || so.n.q(str, "%2e.", true) || so.n.q(str, ".%2e", true) || so.n.q(str, "%2e%2e", true);
        }

        public final a k(v vVar, String str) {
            int n10;
            int i10;
            int i11;
            String str2;
            boolean z10;
            int i12;
            String str3;
            int i13;
            boolean z11;
            boolean z12;
            jo.p.h(str, "input");
            int x10 = fp.b.x(str, 0, 0, 3, null);
            int z13 = fp.b.z(str, x10, 0, 2, null);
            C0314a c0314a = f31025i;
            int g10 = c0314a.g(str, x10, z13);
            String str4 = "(this as java.lang.Strin…ing(startIndex, endIndex)";
            char c10 = 65535;
            boolean z14 = true;
            if (g10 != -1) {
                if (so.n.z(str, "https:", x10, true)) {
                    this.f31026a = "https";
                    x10 += 6;
                } else if (so.n.z(str, "http:", x10, true)) {
                    this.f31026a = "http";
                    x10 += 5;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Expected URL scheme 'http' or 'https' but was '");
                    String substring = str.substring(0, g10);
                    jo.p.g(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    sb2.append(substring);
                    sb2.append("'");
                    throw new IllegalArgumentException(sb2.toString());
                }
            } else if (vVar != null) {
                this.f31026a = vVar.v();
            } else {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            }
            int h10 = c0314a.h(str, x10, z13);
            char c11 = '?';
            char c12 = '#';
            if (h10 < 2 && vVar != null && !(!jo.p.c(vVar.v(), this.f31026a))) {
                this.f31027b = vVar.g();
                this.f31028c = vVar.c();
                this.f31029d = vVar.i();
                this.f31030e = vVar.o();
                this.f31031f.clear();
                this.f31031f.addAll(vVar.e());
                if (x10 == z13 || str.charAt(x10) == '#') {
                    e(vVar.f());
                }
                i10 = z13;
            } else {
                int i14 = x10 + h10;
                boolean z15 = false;
                boolean z16 = false;
                while (true) {
                    n10 = fp.b.n(str, "@/\\?#", i14, z13);
                    char charAt = n10 != z13 ? str.charAt(n10) : c10;
                    if (charAt == c10 || charAt == c12 || charAt == '/' || charAt == '\\' || charAt == c11) {
                        break;
                    }
                    if (charAt != '@') {
                        z10 = z14;
                        str3 = str4;
                        i12 = z13;
                    } else {
                        if (!z15) {
                            int m10 = fp.b.m(str, ':', i14, n10);
                            b bVar = v.f31014l;
                            z10 = z14;
                            i12 = z13;
                            String str5 = str4;
                            String b10 = b.b(bVar, str, i14, m10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, PsExtractor.VIDEO_STREAM_MASK, null);
                            if (z16) {
                                b10 = this.f31027b + "%40" + b10;
                            }
                            this.f31027b = b10;
                            if (m10 != n10) {
                                this.f31028c = b.b(bVar, str, m10 + 1, n10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, PsExtractor.VIDEO_STREAM_MASK, null);
                                z12 = z10;
                            } else {
                                z12 = z15;
                            }
                            z15 = z12;
                            str3 = str5;
                            z11 = z10;
                            i13 = n10;
                        } else {
                            z10 = z14;
                            i12 = z13;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(this.f31028c);
                            sb3.append("%40");
                            str3 = str4;
                            i13 = n10;
                            sb3.append(b.b(v.f31014l, str, i14, n10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, PsExtractor.VIDEO_STREAM_MASK, null));
                            this.f31028c = sb3.toString();
                            z11 = z16;
                        }
                        i14 = i13 + 1;
                        z16 = z11;
                    }
                    str4 = str3;
                    z14 = z10;
                    z13 = i12;
                    c12 = '#';
                    c11 = '?';
                    c10 = 65535;
                }
                boolean z17 = z14;
                String str6 = str4;
                i10 = z13;
                C0314a c0314a2 = f31025i;
                int f10 = c0314a2.f(str, i14, n10);
                int i15 = f10 + 1;
                if (i15 < n10) {
                    i11 = i14;
                    this.f31029d = fp.a.e(b.h(v.f31014l, str, i14, f10, false, 4, null));
                    int e10 = c0314a2.e(str, i15, n10);
                    this.f31030e = e10;
                    if (!(e10 != -1 ? z17 : false)) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Invalid URL port: \"");
                        String substring2 = str.substring(i15, n10);
                        jo.p.g(substring2, str6);
                        sb4.append(substring2);
                        sb4.append('\"');
                        throw new IllegalArgumentException(sb4.toString().toString());
                    }
                    str2 = str6;
                } else {
                    i11 = i14;
                    str2 = str6;
                    b bVar2 = v.f31014l;
                    this.f31029d = fp.a.e(b.h(bVar2, str, i11, f10, false, 4, null));
                    String str7 = this.f31026a;
                    jo.p.e(str7);
                    this.f31030e = bVar2.c(str7);
                }
                if (!(this.f31029d != null ? z17 : false)) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Invalid URL host: \"");
                    String substring3 = str.substring(i11, f10);
                    jo.p.g(substring3, str2);
                    sb5.append(substring3);
                    sb5.append('\"');
                    throw new IllegalArgumentException(sb5.toString().toString());
                }
                x10 = n10;
            }
            int i16 = i10;
            int n11 = fp.b.n(str, "?#", x10, i16);
            r(str, x10, n11);
            if (n11 < i16 && str.charAt(n11) == '?') {
                int m11 = fp.b.m(str, '#', n11, i16);
                b bVar3 = v.f31014l;
                this.f31032g = bVar3.j(b.b(bVar3, str, n11 + 1, m11, " \"'<>#", true, false, true, false, null, 208, null));
                n11 = m11;
            }
            if (n11 < i16 && str.charAt(n11) == '#') {
                this.f31033h = b.b(v.f31014l, str, n11 + 1, i16, "", true, false, false, true, null, 176, null);
            }
            return this;
        }

        public final a l(String str) {
            jo.p.h(str, "password");
            this.f31028c = b.b(v.f31014l, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        public final void m() {
            List<String> list = this.f31031f;
            if ((list.remove(list.size() - 1).length() == 0) && (!this.f31031f.isEmpty())) {
                List<String> list2 = this.f31031f;
                list2.set(list2.size() - 1, "");
                return;
            }
            this.f31031f.add("");
        }

        public final a n(int i10) {
            boolean z10 = true;
            if ((1 > i10 || 65535 < i10) ? false : false) {
                this.f31030e = i10;
                return this;
            }
            throw new IllegalArgumentException(("unexpected port: " + i10).toString());
        }

        public final void o(String str, int i10, int i11, boolean z10, boolean z11) {
            String b10 = b.b(v.f31014l, str, i10, i11, " \"<>^`{}|/\\?#", z11, false, false, false, null, PsExtractor.VIDEO_STREAM_MASK, null);
            if (i(b10)) {
                return;
            }
            if (j(b10)) {
                m();
                return;
            }
            List<String> list = this.f31031f;
            if (list.get(list.size() - 1).length() == 0) {
                List<String> list2 = this.f31031f;
                list2.set(list2.size() - 1, b10);
            } else {
                this.f31031f.add(b10);
            }
            if (z10) {
                this.f31031f.add("");
            }
        }

        public final a p(String str) {
            List<String> list;
            if (str != null) {
                b bVar = v.f31014l;
                String b10 = b.b(bVar, str, 0, 0, " \"'<>#", false, false, true, false, null, 219, null);
                if (b10 != null) {
                    list = bVar.j(b10);
                    this.f31032g = list;
                    return this;
                }
            }
            list = null;
            this.f31032g = list;
            return this;
        }

        public final a q() {
            String str = this.f31029d;
            this.f31029d = str != null ? new so.e("[\"<>^`{|}]").b(str, "") : null;
            int size = this.f31031f.size();
            for (int i10 = 0; i10 < size; i10++) {
                List<String> list = this.f31031f;
                list.set(i10, b.b(v.f31014l, list.get(i10), 0, 0, "[]", true, true, false, false, null, 227, null));
            }
            List<String> list2 = this.f31032g;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    String str2 = list2.get(i11);
                    list2.set(i11, str2 != null ? b.b(v.f31014l, str2, 0, 0, "\\^`{|}", true, true, true, false, null, 195, null) : null);
                }
            }
            String str3 = this.f31033h;
            this.f31033h = str3 != null ? b.b(v.f31014l, str3, 0, 0, " \"#<>\\^`{|}", true, true, false, true, null, 163, null) : null;
            return this;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
            */
        /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0044 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0041 -> B:11:0x0029). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void r(java.lang.String r11, int r12, int r13) {
            /*
                r10 = this;
                if (r12 != r13) goto L3
                return
            L3:
                char r0 = r11.charAt(r12)
                r1 = 47
                java.lang.String r2 = ""
                r3 = 1
                if (r0 == r1) goto L1e
                r1 = 92
                if (r0 != r1) goto L13
                goto L1e
            L13:
                java.util.List<java.lang.String> r0 = r10.f31031f
                int r1 = r0.size()
                int r1 = r1 - r3
                r0.set(r1, r2)
                goto L29
            L1e:
                java.util.List<java.lang.String> r0 = r10.f31031f
                r0.clear()
                java.util.List<java.lang.String> r0 = r10.f31031f
                r0.add(r2)
                goto L41
            L29:
                r6 = r12
                if (r6 >= r13) goto L44
                java.lang.String r12 = "/\\"
                int r12 = fp.b.n(r11, r12, r6, r13)
                if (r12 >= r13) goto L36
                r0 = r3
                goto L37
            L36:
                r0 = 0
            L37:
                r9 = 1
                r4 = r10
                r5 = r11
                r7 = r12
                r8 = r0
                r4.o(r5, r6, r7, r8, r9)
                if (r0 == 0) goto L29
            L41:
                int r12 = r12 + 1
                goto L29
            L44:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ep.v.a.r(java.lang.String, int, int):void");
        }

        public final a s(String str) {
            jo.p.h(str, "scheme");
            if (so.n.q(str, "http", true)) {
                this.f31026a = "http";
            } else if (!so.n.q(str, "https", true)) {
                throw new IllegalArgumentException("unexpected scheme: " + str);
            } else {
                this.f31026a = "https";
            }
            return this;
        }

        public final void t(String str) {
            this.f31033h = str;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
            if ((r6.f31028c.length() > 0) != false) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0091, code lost:
            if (r1 != r3.c(r2)) goto L36;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String toString() {
            /*
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r6.f31026a
                if (r1 == 0) goto L12
                r0.append(r1)
                java.lang.String r1 = "://"
                r0.append(r1)
                goto L17
            L12:
                java.lang.String r1 = "//"
                r0.append(r1)
            L17:
                java.lang.String r1 = r6.f31027b
                int r1 = r1.length()
                r2 = 1
                r3 = 0
                if (r1 <= 0) goto L23
                r1 = r2
                goto L24
            L23:
                r1 = r3
            L24:
                r4 = 58
                if (r1 != 0) goto L35
                java.lang.String r1 = r6.f31028c
                int r1 = r1.length()
                if (r1 <= 0) goto L32
                r1 = r2
                goto L33
            L32:
                r1 = r3
            L33:
                if (r1 == 0) goto L53
            L35:
                java.lang.String r1 = r6.f31027b
                r0.append(r1)
                java.lang.String r1 = r6.f31028c
                int r1 = r1.length()
                if (r1 <= 0) goto L43
                goto L44
            L43:
                r2 = r3
            L44:
                if (r2 == 0) goto L4e
                r0.append(r4)
                java.lang.String r1 = r6.f31028c
                r0.append(r1)
            L4e:
                r1 = 64
                r0.append(r1)
            L53:
                java.lang.String r1 = r6.f31029d
                if (r1 == 0) goto L77
                jo.p.e(r1)
                r2 = 2
                r5 = 0
                boolean r1 = so.o.G(r1, r4, r3, r2, r5)
                if (r1 == 0) goto L72
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r6.f31029d
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L77
            L72:
                java.lang.String r1 = r6.f31029d
                r0.append(r1)
            L77:
                int r1 = r6.f31030e
                r2 = -1
                if (r1 != r2) goto L80
                java.lang.String r1 = r6.f31026a
                if (r1 == 0) goto L99
            L80:
                int r1 = r6.d()
                java.lang.String r2 = r6.f31026a
                if (r2 == 0) goto L93
                ep.v$b r3 = ep.v.f31014l
                jo.p.e(r2)
                int r2 = r3.c(r2)
                if (r1 == r2) goto L99
            L93:
                r0.append(r4)
                r0.append(r1)
            L99:
                ep.v$b r1 = ep.v.f31014l
                java.util.List<java.lang.String> r2 = r6.f31031f
                r1.i(r2, r0)
                java.util.List<java.lang.String> r2 = r6.f31032g
                if (r2 == 0) goto Lb1
                r2 = 63
                r0.append(r2)
                java.util.List<java.lang.String> r2 = r6.f31032g
                jo.p.e(r2)
                r1.k(r2, r0)
            Lb1:
                java.lang.String r1 = r6.f31033h
                if (r1 == 0) goto Lbf
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r6.f31033h
                r0.append(r1)
            Lbf:
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
                jo.p.g(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ep.v.a.toString():java.lang.String");
        }

        public final void u(String str) {
            jo.p.h(str, "<set-?>");
            this.f31028c = str;
        }

        public final void v(String str) {
            jo.p.h(str, "<set-?>");
            this.f31027b = str;
        }

        public final void w(String str) {
            this.f31029d = str;
        }

        public final void x(int i10) {
            this.f31030e = i10;
        }

        public final void y(String str) {
            this.f31026a = str;
        }

        public final a z(String str) {
            jo.p.h(str, "username");
            this.f31027b = b.b(v.f31014l, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        public b() {
        }

        public static /* synthetic */ String b(b bVar, String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset, int i12, Object obj) {
            return bVar.a(str, (i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? str.length() : i11, str2, (i12 & 8) != 0 ? false : z10, (i12 & 16) != 0 ? false : z11, (i12 & 32) != 0 ? false : z12, (i12 & 64) != 0 ? false : z13, (i12 & 128) != 0 ? null : charset);
        }

        public static /* synthetic */ String h(b bVar, String str, int i10, int i11, boolean z10, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = str.length();
            }
            if ((i12 & 4) != 0) {
                z10 = false;
            }
            return bVar.g(str, i10, i11, z10);
        }

        public final String a(String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
            jo.p.h(str, "$this$canonicalize");
            jo.p.h(str2, "encodeSet");
            int i12 = i10;
            while (i12 < i11) {
                int codePointAt = str.codePointAt(i12);
                if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || z13) && !so.o.G(str2, (char) codePointAt, false, 2, null))) {
                    if (codePointAt == 37) {
                        if (z10) {
                            if (z11) {
                                if (!e(str, i12, i11)) {
                                    rp.c cVar = new rp.c();
                                    cVar.g0(str, i10, i12);
                                    l(cVar, str, i12, i11, str2, z10, z11, z12, z13, charset);
                                    return cVar.N();
                                }
                                if (codePointAt == 43 || !z12) {
                                    i12 += Character.charCount(codePointAt);
                                } else {
                                    rp.c cVar2 = new rp.c();
                                    cVar2.g0(str, i10, i12);
                                    l(cVar2, str, i12, i11, str2, z10, z11, z12, z13, charset);
                                    return cVar2.N();
                                }
                            }
                        }
                    }
                    if (codePointAt == 43) {
                    }
                    i12 += Character.charCount(codePointAt);
                }
                rp.c cVar22 = new rp.c();
                cVar22.g0(str, i10, i12);
                l(cVar22, str, i12, i11, str2, z10, z11, z12, z13, charset);
                return cVar22.N();
            }
            String substring = str.substring(i10, i11);
            jo.p.g(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }

        public final int c(String str) {
            jo.p.h(str, "scheme");
            int hashCode = str.hashCode();
            if (hashCode != 3213448) {
                if (hashCode == 99617003 && str.equals("https")) {
                    return 443;
                }
            } else if (str.equals("http")) {
                return 80;
            }
            return -1;
        }

        public final v d(String str) {
            jo.p.h(str, "$this$toHttpUrl");
            return new a().k(null, str).c();
        }

        public final boolean e(String str, int i10, int i11) {
            int i12 = i10 + 2;
            return i12 < i11 && str.charAt(i10) == '%' && fp.b.E(str.charAt(i10 + 1)) != -1 && fp.b.E(str.charAt(i12)) != -1;
        }

        public final v f(String str) {
            jo.p.h(str, "$this$toHttpUrlOrNull");
            try {
                return d(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public final String g(String str, int i10, int i11, boolean z10) {
            jo.p.h(str, "$this$percentDecode");
            for (int i12 = i10; i12 < i11; i12++) {
                char charAt = str.charAt(i12);
                if (charAt == '%' || (charAt == '+' && z10)) {
                    rp.c cVar = new rp.c();
                    cVar.g0(str, i10, i12);
                    m(cVar, str, i12, i11, z10);
                    return cVar.N();
                }
            }
            String substring = str.substring(i10, i11);
            jo.p.g(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }

        public final void i(List<String> list, StringBuilder sb2) {
            jo.p.h(list, "$this$toPathString");
            jo.p.h(sb2, "out");
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append('/');
                sb2.append(list.get(i10));
            }
        }

        public final List<String> j(String str) {
            jo.p.h(str, "$this$toQueryNamesAndValues");
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (i10 <= str.length()) {
                int T = so.o.T(str, '&', i10, false, 4, null);
                if (T == -1) {
                    T = str.length();
                }
                int i11 = T;
                int T2 = so.o.T(str, '=', i10, false, 4, null);
                if (T2 != -1 && T2 <= i11) {
                    String substring = str.substring(i10, T2);
                    jo.p.g(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring);
                    String substring2 = str.substring(T2 + 1, i11);
                    jo.p.g(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring2);
                } else {
                    String substring3 = str.substring(i10, i11);
                    jo.p.g(substring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring3);
                    arrayList.add(null);
                }
                i10 = i11 + 1;
            }
            return arrayList;
        }

        public final void k(List<String> list, StringBuilder sb2) {
            jo.p.h(list, "$this$toQueryString");
            jo.p.h(sb2, "out");
            po.g s10 = po.n.s(po.n.t(0, list.size()), 2);
            int k10 = s10.k();
            int m10 = s10.m();
            int p10 = s10.p();
            if (p10 >= 0) {
                if (k10 > m10) {
                    return;
                }
            } else if (k10 < m10) {
                return;
            }
            while (true) {
                String str = list.get(k10);
                String str2 = list.get(k10 + 1);
                if (k10 > 0) {
                    sb2.append('&');
                }
                sb2.append(str);
                if (str2 != null) {
                    sb2.append('=');
                    sb2.append(str2);
                }
                if (k10 == m10) {
                    return;
                }
                k10 += p10;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x0065, code lost:
            if (e(r16, r5, r18) == false) goto L39;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void l(rp.c r15, java.lang.String r16, int r17, int r18, java.lang.String r19, boolean r20, boolean r21, boolean r22, boolean r23, java.nio.charset.Charset r24) {
            /*
                r14 = this;
                r0 = r15
                r1 = r16
                r2 = r18
                r3 = r24
                r4 = 0
                r5 = r17
                r6 = r4
            Lb:
                if (r5 >= r2) goto Lbf
                java.lang.String r7 = "null cannot be cast to non-null type java.lang.String"
                java.util.Objects.requireNonNull(r1, r7)
                int r7 = r1.codePointAt(r5)
                if (r20 == 0) goto L2e
                r8 = 9
                if (r7 == r8) goto L29
                r8 = 10
                if (r7 == r8) goto L29
                r8 = 12
                if (r7 == r8) goto L29
                r8 = 13
                if (r7 == r8) goto L29
                goto L2e
            L29:
                r8 = r14
                r12 = r19
                goto Lb8
            L2e:
                r8 = 43
                if (r7 != r8) goto L3f
                if (r22 == 0) goto L3f
                if (r20 == 0) goto L39
                java.lang.String r8 = "+"
                goto L3b
            L39:
                java.lang.String r8 = "%2B"
            L3b:
                r15.a0(r8)
                goto L29
            L3f:
                r8 = 32
                r9 = 37
                if (r7 < r8) goto L6f
                r8 = 127(0x7f, float:1.78E-43)
                if (r7 == r8) goto L6f
                r8 = 128(0x80, float:1.794E-43)
                if (r7 < r8) goto L4f
                if (r23 == 0) goto L6f
            L4f:
                char r8 = (char) r7
                r10 = 0
                r11 = 2
                r12 = r19
                boolean r8 = so.o.G(r12, r8, r10, r11, r4)
                if (r8 != 0) goto L6d
                if (r7 != r9) goto L68
                if (r20 == 0) goto L6d
                if (r21 == 0) goto L68
                r8 = r14
                boolean r10 = r14.e(r1, r5, r2)
                if (r10 != 0) goto L69
                goto L72
            L68:
                r8 = r14
            L69:
                r15.T0(r7)
                goto Lb8
            L6d:
                r8 = r14
                goto L72
            L6f:
                r8 = r14
                r12 = r19
            L72:
                if (r6 != 0) goto L79
                rp.c r6 = new rp.c
                r6.<init>()
            L79:
                if (r3 == 0) goto L8d
                java.nio.charset.Charset r10 = java.nio.charset.StandardCharsets.UTF_8
                boolean r10 = jo.p.c(r3, r10)
                if (r10 == 0) goto L84
                goto L8d
            L84:
                int r10 = java.lang.Character.charCount(r7)
                int r10 = r10 + r5
                r6.F0(r1, r5, r10, r3)
                goto L90
            L8d:
                r6.T0(r7)
            L90:
                boolean r10 = r6.a1()
                if (r10 != 0) goto Lb8
                byte r10 = r6.readByte()
                r10 = r10 & 255(0xff, float:3.57E-43)
                r15.b1(r9)
                char[] r11 = ep.v.a()
                int r13 = r10 >> 4
                r13 = r13 & 15
                char r11 = r11[r13]
                r15.b1(r11)
                char[] r11 = ep.v.a()
                r10 = r10 & 15
                char r10 = r11[r10]
                r15.b1(r10)
                goto L90
            Lb8:
                int r7 = java.lang.Character.charCount(r7)
                int r5 = r5 + r7
                goto Lb
            Lbf:
                r8 = r14
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ep.v.b.l(rp.c, java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset):void");
        }

        public final void m(rp.c cVar, String str, int i10, int i11, boolean z10) {
            int i12;
            while (i10 < i11) {
                Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                int codePointAt = str.codePointAt(i10);
                if (codePointAt == 37 && (i12 = i10 + 2) < i11) {
                    int E = fp.b.E(str.charAt(i10 + 1));
                    int E2 = fp.b.E(str.charAt(i12));
                    if (E != -1 && E2 != -1) {
                        cVar.b1((E << 4) + E2);
                        i10 = Character.charCount(codePointAt) + i12;
                    }
                    cVar.T0(codePointAt);
                    i10 += Character.charCount(codePointAt);
                } else {
                    if (codePointAt == 43 && z10) {
                        cVar.b1(32);
                        i10++;
                    }
                    cVar.T0(codePointAt);
                    i10 += Character.charCount(codePointAt);
                }
            }
        }

        public /* synthetic */ b(jo.h hVar) {
            this();
        }
    }

    public v(String str, String str2, String str3, String str4, int i10, List<String> list, List<String> list2, String str5, String str6) {
        jo.p.h(str, "scheme");
        jo.p.h(str2, "username");
        jo.p.h(str3, "password");
        jo.p.h(str4, "host");
        jo.p.h(list, "pathSegments");
        jo.p.h(str6, "url");
        this.f31016b = str;
        this.f31017c = str2;
        this.f31018d = str3;
        this.f31019e = str4;
        this.f31020f = i10;
        this.f31021g = list;
        this.f31022h = list2;
        this.f31023i = str5;
        this.f31024j = str6;
        this.f31015a = jo.p.c(str, "https");
    }

    public static final v h(String str) {
        return f31014l.d(str);
    }

    public static final v m(String str) {
        return f31014l.f(str);
    }

    public final String b() {
        if (this.f31023i == null) {
            return null;
        }
        String str = this.f31024j;
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(so.o.T(this.f31024j, '#', 0, false, 6, null) + 1);
        jo.p.g(substring, "(this as java.lang.String).substring(startIndex)");
        return substring;
    }

    public final String c() {
        if (this.f31018d.length() == 0) {
            return "";
        }
        int T = so.o.T(this.f31024j, '@', 0, false, 6, null);
        String str = this.f31024j;
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(so.o.T(this.f31024j, ':', this.f31016b.length() + 3, false, 4, null) + 1, T);
        jo.p.g(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public final String d() {
        int T = so.o.T(this.f31024j, '/', this.f31016b.length() + 3, false, 4, null);
        String str = this.f31024j;
        int n10 = fp.b.n(str, "?#", T, str.length());
        String str2 = this.f31024j;
        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        String substring = str2.substring(T, n10);
        jo.p.g(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public final List<String> e() {
        int T = so.o.T(this.f31024j, '/', this.f31016b.length() + 3, false, 4, null);
        String str = this.f31024j;
        int n10 = fp.b.n(str, "?#", T, str.length());
        ArrayList arrayList = new ArrayList();
        while (T < n10) {
            int i10 = T + 1;
            int m10 = fp.b.m(this.f31024j, '/', i10, n10);
            String str2 = this.f31024j;
            Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
            String substring = str2.substring(i10, m10);
            jo.p.g(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            arrayList.add(substring);
            T = m10;
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof v) && jo.p.c(((v) obj).f31024j, this.f31024j);
    }

    public final String f() {
        if (this.f31022h == null) {
            return null;
        }
        int T = so.o.T(this.f31024j, '?', 0, false, 6, null) + 1;
        String str = this.f31024j;
        int m10 = fp.b.m(str, '#', T, str.length());
        String str2 = this.f31024j;
        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        String substring = str2.substring(T, m10);
        jo.p.g(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public final String g() {
        if (this.f31017c.length() == 0) {
            return "";
        }
        int length = this.f31016b.length() + 3;
        String str = this.f31024j;
        int n10 = fp.b.n(str, ":@", length, str.length());
        String str2 = this.f31024j;
        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        String substring = str2.substring(length, n10);
        jo.p.g(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public int hashCode() {
        return this.f31024j.hashCode();
    }

    public final String i() {
        return this.f31019e;
    }

    public final boolean j() {
        return this.f31015a;
    }

    public final a k() {
        a aVar = new a();
        aVar.y(this.f31016b);
        aVar.v(g());
        aVar.u(c());
        aVar.w(this.f31019e);
        aVar.x(this.f31020f != f31014l.c(this.f31016b) ? this.f31020f : -1);
        aVar.g().clear();
        aVar.g().addAll(e());
        aVar.e(f());
        aVar.t(b());
        return aVar;
    }

    public final a l(String str) {
        jo.p.h(str, "link");
        try {
            return new a().k(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final List<String> n() {
        return this.f31021g;
    }

    public final int o() {
        return this.f31020f;
    }

    public final String p() {
        if (this.f31022h == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        f31014l.k(this.f31022h, sb2);
        return sb2.toString();
    }

    public final String q(int i10) {
        List<String> list = this.f31022h;
        if (list != null) {
            String str = list.get(i10 * 2);
            jo.p.e(str);
            return str;
        }
        throw new IndexOutOfBoundsException();
    }

    public final String r(int i10) {
        List<String> list = this.f31022h;
        if (list != null) {
            return list.get((i10 * 2) + 1);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int s() {
        List<String> list = this.f31022h;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    public final String t() {
        a l10 = l("/...");
        jo.p.e(l10);
        return l10.z("").l("").c().toString();
    }

    public String toString() {
        return this.f31024j;
    }

    public final v u(String str) {
        jo.p.h(str, "link");
        a l10 = l(str);
        if (l10 != null) {
            return l10.c();
        }
        return null;
    }

    public final String v() {
        return this.f31016b;
    }

    public final URI w() {
        String aVar = k().q().toString();
        try {
            return new URI(aVar);
        } catch (URISyntaxException e10) {
            try {
                URI create = URI.create(new so.e("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").b(aVar, ""));
                jo.p.g(create, "try {\n        val stripp…e) // Unexpected!\n      }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final URL x() {
        try {
            return new URL(this.f31024j);
        } catch (MalformedURLException e10) {
            throw new RuntimeException(e10);
        }
    }
}
