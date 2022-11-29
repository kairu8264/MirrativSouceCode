package km;

import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import vm.l;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public final pk.c f38871a;

    /* renamed from: b  reason: collision with root package name */
    public final yl.f f38872b;

    /* renamed from: c  reason: collision with root package name */
    public final xl.b<l> f38873c;

    /* renamed from: d  reason: collision with root package name */
    public final xl.b<zf.g> f38874d;

    public a(pk.c cVar, yl.f fVar, xl.b<l> bVar, xl.b<zf.g> bVar2) {
        this.f38871a = cVar;
        this.f38872b = fVar;
        this.f38873c = bVar;
        this.f38874d = bVar2;
    }

    public im.a a() {
        return im.a.f();
    }

    public pk.c b() {
        return this.f38871a;
    }

    public yl.f c() {
        return this.f38872b;
    }

    public xl.b<l> d() {
        return this.f38873c;
    }

    public RemoteConfigManager e() {
        return RemoteConfigManager.getInstance();
    }

    public SessionManager f() {
        return SessionManager.getInstance();
    }

    public xl.b<zf.g> g() {
        return this.f38874d;
    }
}
