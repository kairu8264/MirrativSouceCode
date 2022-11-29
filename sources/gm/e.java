package gm;

import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import vm.l;
import yl.f;
import zf.g;

/* loaded from: classes4.dex */
public final class e implements rn.a {

    /* renamed from: a  reason: collision with root package name */
    public final rn.a<pk.c> f33674a;

    /* renamed from: b  reason: collision with root package name */
    public final rn.a<xl.b<l>> f33675b;

    /* renamed from: c  reason: collision with root package name */
    public final rn.a<f> f33676c;

    /* renamed from: d  reason: collision with root package name */
    public final rn.a<xl.b<g>> f33677d;

    /* renamed from: e  reason: collision with root package name */
    public final rn.a<RemoteConfigManager> f33678e;

    /* renamed from: f  reason: collision with root package name */
    public final rn.a<im.a> f33679f;

    /* renamed from: g  reason: collision with root package name */
    public final rn.a<SessionManager> f33680g;

    public e(rn.a<pk.c> aVar, rn.a<xl.b<l>> aVar2, rn.a<f> aVar3, rn.a<xl.b<g>> aVar4, rn.a<RemoteConfigManager> aVar5, rn.a<im.a> aVar6, rn.a<SessionManager> aVar7) {
        this.f33674a = aVar;
        this.f33675b = aVar2;
        this.f33676c = aVar3;
        this.f33677d = aVar4;
        this.f33678e = aVar5;
        this.f33679f = aVar6;
        this.f33680g = aVar7;
    }

    public static e a(rn.a<pk.c> aVar, rn.a<xl.b<l>> aVar2, rn.a<f> aVar3, rn.a<xl.b<g>> aVar4, rn.a<RemoteConfigManager> aVar5, rn.a<im.a> aVar6, rn.a<SessionManager> aVar7) {
        return new e(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    public static c c(pk.c cVar, xl.b<l> bVar, f fVar, xl.b<g> bVar2, RemoteConfigManager remoteConfigManager, im.a aVar, SessionManager sessionManager) {
        return new c(cVar, bVar, fVar, bVar2, remoteConfigManager, aVar, sessionManager);
    }

    @Override // rn.a
    /* renamed from: b */
    public c get() {
        return c(this.f33674a.get(), this.f33675b.get(), this.f33676c.get(), this.f33677d.get(), this.f33678e.get(), this.f33679f.get(), this.f33680g.get());
    }
}
