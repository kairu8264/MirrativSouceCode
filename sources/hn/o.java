package hn;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* loaded from: classes4.dex */
public class o {

    /* renamed from: j  reason: collision with root package name */
    public static final String[] f36233j = {"Connection", "Upgrade"};

    /* renamed from: k  reason: collision with root package name */
    public static final String[] f36234k = {"Upgrade", "websocket"};

    /* renamed from: l  reason: collision with root package name */
    public static final String[] f36235l = {"Sec-WebSocket-Version", "13"};

    /* renamed from: a  reason: collision with root package name */
    public boolean f36236a;

    /* renamed from: b  reason: collision with root package name */
    public String f36237b;

    /* renamed from: c  reason: collision with root package name */
    public final String f36238c;

    /* renamed from: d  reason: collision with root package name */
    public final String f36239d;

    /* renamed from: e  reason: collision with root package name */
    public final URI f36240e;

    /* renamed from: f  reason: collision with root package name */
    public String f36241f;

    /* renamed from: g  reason: collision with root package name */
    public Set<String> f36242g;

    /* renamed from: h  reason: collision with root package name */
    public List<p0> f36243h;

    /* renamed from: i  reason: collision with root package name */
    public List<String[]> f36244i;

    public o(boolean z10, String str, String str2, String str3) {
        this.f36236a = z10;
        this.f36237b = str;
        this.f36238c = str2;
        this.f36239d = str3;
        Object[] objArr = new Object[3];
        objArr[0] = z10 ? "wss" : "ws";
        objArr[1] = str2;
        objArr[2] = str3;
        this.f36240e = URI.create(String.format("%s://%s%s", objArr));
    }

    public static String b(String str, List<String[]> list) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("\r\n");
        for (String[] strArr : list) {
            sb2.append(strArr[0]);
            sb2.append(": ");
            sb2.append(strArr[1]);
            sb2.append("\r\n");
        }
        sb2.append("\r\n");
        return sb2.toString();
    }

    public void a(String str, String str2) {
        if (str == null || str.length() == 0) {
            return;
        }
        if (str2 == null) {
            str2 = "";
        }
        synchronized (this) {
            if (this.f36244i == null) {
                this.f36244i = new ArrayList();
            }
            this.f36244i.add(new String[]{str, str2});
        }
    }

    public List<String[]> c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new String[]{"Host", this.f36238c});
        arrayList.add(f36233j);
        arrayList.add(f36234k);
        arrayList.add(f36235l);
        arrayList.add(new String[]{"Sec-WebSocket-Key", this.f36241f});
        Set<String> set = this.f36242g;
        if (set != null && set.size() != 0) {
            arrayList.add(new String[]{"Sec-WebSocket-Protocol", t.h(this.f36242g, ", ")});
        }
        List<p0> list = this.f36243h;
        if (list != null && list.size() != 0) {
            arrayList.add(new String[]{"Sec-WebSocket-Extensions", t.h(this.f36243h, ", ")});
        }
        String str = this.f36237b;
        if (str != null && str.length() != 0) {
            arrayList.add(new String[]{"Authorization", "Basic " + b.a(this.f36237b)});
        }
        List<String[]> list2 = this.f36244i;
        if (list2 != null && list2.size() != 0) {
            arrayList.addAll(this.f36244i);
        }
        return arrayList;
    }

    public String d() {
        return String.format("GET %s HTTP/1.1", this.f36239d);
    }

    public boolean e(String str) {
        if (str == null) {
            return false;
        }
        synchronized (this) {
            List<p0> list = this.f36243h;
            if (list == null) {
                return false;
            }
            for (p0 p0Var : list) {
                if (p0Var.c().equals(str)) {
                    return true;
                }
            }
            return false;
        }
    }

    public boolean f(String str) {
        synchronized (this) {
            Set<String> set = this.f36242g;
            if (set == null) {
                return false;
            }
            return set.contains(str);
        }
    }

    public void g(String str) {
        this.f36241f = str;
    }
}
