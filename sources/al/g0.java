package al;

import java.util.Map;

/* loaded from: classes2.dex */
public class g0 {

    /* renamed from: a  reason: collision with root package name */
    public String f13765a = null;

    /* renamed from: b  reason: collision with root package name */
    public final y f13766b = new y(64, 1024);

    /* renamed from: c  reason: collision with root package name */
    public final y f13767c = new y(64, 8192);

    public Map<String, String> a() {
        return this.f13766b.a();
    }

    public Map<String, String> b() {
        return this.f13767c.a();
    }

    public String c() {
        return this.f13765a;
    }

    public void d(String str, String str2) {
        this.f13766b.d(str, str2);
    }

    public void e(Map<String, String> map) {
        this.f13766b.e(map);
    }

    public void f(String str) {
        this.f13765a = this.f13766b.b(str);
    }
}
