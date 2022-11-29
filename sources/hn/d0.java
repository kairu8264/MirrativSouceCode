package hn;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import javax.net.SocketFactory;

/* loaded from: classes4.dex */
public class d0 {

    /* renamed from: a  reason: collision with root package name */
    public final q0 f36139a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, List<String>> f36140b = new TreeMap(String.CASE_INSENSITIVE_ORDER);

    /* renamed from: c  reason: collision with root package name */
    public final h0 f36141c = new h0();

    /* renamed from: d  reason: collision with root package name */
    public boolean f36142d;

    /* renamed from: e  reason: collision with root package name */
    public String f36143e;

    /* renamed from: f  reason: collision with root package name */
    public int f36144f;

    /* renamed from: g  reason: collision with root package name */
    public String f36145g;

    /* renamed from: h  reason: collision with root package name */
    public String f36146h;

    /* renamed from: i  reason: collision with root package name */
    public String[] f36147i;

    public d0(q0 q0Var) {
        this.f36139a = q0Var;
        h();
    }

    public Map<String, List<String>> a() {
        return this.f36140b;
    }

    public String b() {
        return this.f36143e;
    }

    public String c() {
        return this.f36145g;
    }

    public String d() {
        return this.f36146h;
    }

    public int e() {
        return this.f36144f;
    }

    public String[] f() {
        return this.f36147i;
    }

    public boolean g() {
        return this.f36142d;
    }

    public d0 h() {
        this.f36142d = false;
        this.f36143e = null;
        this.f36144f = -1;
        this.f36145g = null;
        this.f36146h = null;
        this.f36140b.clear();
        this.f36147i = null;
        return this;
    }

    public SocketFactory i() {
        return this.f36141c.a(this.f36142d);
    }
}
