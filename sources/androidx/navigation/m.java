package androidx.navigation;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: j  reason: collision with root package name */
    public static final Pattern f15757j = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<String> f15758a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, c> f15759b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public Pattern f15760c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f15761d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f15762e;

    /* renamed from: f  reason: collision with root package name */
    public final String f15763f;

    /* renamed from: g  reason: collision with root package name */
    public final String f15764g;

    /* renamed from: h  reason: collision with root package name */
    public Pattern f15765h;

    /* renamed from: i  reason: collision with root package name */
    public final String f15766i;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public String f15767a;

        /* renamed from: b  reason: collision with root package name */
        public String f15768b;

        /* renamed from: c  reason: collision with root package name */
        public String f15769c;

        public m a() {
            return new m(this.f15767a, this.f15768b, this.f15769c);
        }

        public a b(String str) {
            if (!str.isEmpty()) {
                this.f15768b = str;
                return this;
            }
            throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
        }

        public a c(String str) {
            this.f15769c = str;
            return this;
        }

        public a d(String str) {
            this.f15767a = str;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static class b implements Comparable<b> {

        /* renamed from: w  reason: collision with root package name */
        public String f15770w;

        /* renamed from: x  reason: collision with root package name */
        public String f15771x;

        public b(String str) {
            String[] split = str.split("/", -1);
            this.f15770w = split[0];
            this.f15771x = split[1];
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(b bVar) {
            int i10 = this.f15770w.equals(bVar.f15770w) ? 2 : 0;
            return this.f15771x.equals(bVar.f15771x) ? i10 + 1 : i10;
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public String f15772a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<String> f15773b = new ArrayList<>();

        public void a(String str) {
            this.f15773b.add(str);
        }

        public String b(int i10) {
            return this.f15773b.get(i10);
        }

        public String c() {
            return this.f15772a;
        }

        public void d(String str) {
            this.f15772a = str;
        }

        public int e() {
            return this.f15773b.size();
        }
    }

    public m(String str, String str2, String str3) {
        this.f15760c = null;
        int i10 = 0;
        this.f15761d = false;
        this.f15762e = false;
        this.f15765h = null;
        this.f15763f = str;
        this.f15764g = str2;
        this.f15766i = str3;
        if (str != null) {
            Uri parse = Uri.parse(str);
            this.f15762e = parse.getQuery() != null;
            StringBuilder sb2 = new StringBuilder("^");
            if (!f15757j.matcher(str).find()) {
                sb2.append("http[s]?://");
            }
            Pattern compile = Pattern.compile("\\{(.+?)\\}");
            if (this.f15762e) {
                Matcher matcher = Pattern.compile("(\\?)").matcher(str);
                if (matcher.find()) {
                    a(str.substring(0, matcher.start()), sb2, compile);
                }
                this.f15761d = false;
                for (String str4 : parse.getQueryParameterNames()) {
                    StringBuilder sb3 = new StringBuilder();
                    String queryParameter = parse.getQueryParameter(str4);
                    Matcher matcher2 = compile.matcher(queryParameter);
                    c cVar = new c();
                    int i11 = i10;
                    while (matcher2.find()) {
                        cVar.a(matcher2.group(1));
                        sb3.append(Pattern.quote(queryParameter.substring(i11, matcher2.start())));
                        sb3.append("(.+?)?");
                        i11 = matcher2.end();
                    }
                    if (i11 < queryParameter.length()) {
                        sb3.append(Pattern.quote(queryParameter.substring(i11)));
                    }
                    cVar.d(sb3.toString().replace(".*", "\\E.*\\Q"));
                    this.f15759b.put(str4, cVar);
                    i10 = 0;
                }
            } else {
                this.f15761d = a(str, sb2, compile);
            }
            this.f15760c = Pattern.compile(sb2.toString().replace(".*", "\\E.*\\Q"), 2);
        }
        if (str3 != null) {
            if (Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(str3).matches()) {
                b bVar = new b(str3);
                this.f15765h = Pattern.compile(("^(" + bVar.f15770w + "|[*]+)/(" + bVar.f15771x + "|[*]+)$").replace("*|[*]", "[\\s\\S]"));
                return;
            }
            throw new IllegalArgumentException("The given mimeType " + str3 + " does not match to required \"type/subtype\" format");
        }
    }

    public final boolean a(String str, StringBuilder sb2, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        boolean z10 = !str.contains(".*");
        int i10 = 0;
        while (matcher.find()) {
            this.f15758a.add(matcher.group(1));
            sb2.append(Pattern.quote(str.substring(i10, matcher.start())));
            sb2.append("(.+?)");
            i10 = matcher.end();
            z10 = false;
        }
        if (i10 < str.length()) {
            sb2.append(Pattern.quote(str.substring(i10)));
        }
        sb2.append("($|(\\?(.)*))");
        return z10;
    }

    public String b() {
        return this.f15764g;
    }

    public Bundle c(Uri uri, Map<String, i> map) {
        Matcher matcher;
        Matcher matcher2 = this.f15760c.matcher(uri.toString());
        if (matcher2.matches()) {
            Bundle bundle = new Bundle();
            int size = this.f15758a.size();
            int i10 = 0;
            while (i10 < size) {
                String str = this.f15758a.get(i10);
                i10++;
                if (f(bundle, str, Uri.decode(matcher2.group(i10)), map.get(str))) {
                    return null;
                }
            }
            if (this.f15762e) {
                for (String str2 : this.f15759b.keySet()) {
                    c cVar = this.f15759b.get(str2);
                    String queryParameter = uri.getQueryParameter(str2);
                    if (queryParameter != null) {
                        matcher = Pattern.compile(cVar.c()).matcher(queryParameter);
                        if (!matcher.matches()) {
                            return null;
                        }
                    } else {
                        matcher = null;
                    }
                    for (int i11 = 0; i11 < cVar.e(); i11++) {
                        String decode = matcher != null ? Uri.decode(matcher.group(i11 + 1)) : null;
                        String b10 = cVar.b(i11);
                        i iVar = map.get(b10);
                        if (decode != null && !decode.replaceAll("[{}]", "").equals(b10) && f(bundle, b10, decode, iVar)) {
                            return null;
                        }
                    }
                }
            }
            return bundle;
        }
        return null;
    }

    public int d(String str) {
        if (this.f15766i == null || !this.f15765h.matcher(str).matches()) {
            return -1;
        }
        return new b(this.f15766i).compareTo(new b(str));
    }

    public boolean e() {
        return this.f15761d;
    }

    public final boolean f(Bundle bundle, String str, String str2, i iVar) {
        if (iVar != null) {
            try {
                iVar.a().g(bundle, str, str2);
                return false;
            } catch (IllegalArgumentException unused) {
                return true;
            }
        }
        bundle.putString(str, str2);
        return false;
    }
}
