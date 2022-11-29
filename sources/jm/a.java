package jm;

import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import km.d;
import km.e;
import km.h;
import pk.c;
import vm.l;
import yl.f;
import zf.g;

/* loaded from: classes4.dex */
public final class a implements jm.b {

    /* renamed from: a  reason: collision with root package name */
    public rn.a<c> f38099a;

    /* renamed from: b  reason: collision with root package name */
    public rn.a<xl.b<l>> f38100b;

    /* renamed from: c  reason: collision with root package name */
    public rn.a<f> f38101c;

    /* renamed from: d  reason: collision with root package name */
    public rn.a<xl.b<g>> f38102d;

    /* renamed from: e  reason: collision with root package name */
    public rn.a<RemoteConfigManager> f38103e;

    /* renamed from: f  reason: collision with root package name */
    public rn.a<im.a> f38104f;

    /* renamed from: g  reason: collision with root package name */
    public rn.a<SessionManager> f38105g;

    /* renamed from: h  reason: collision with root package name */
    public rn.a<gm.c> f38106h;

    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public km.a f38107a;

        public jm.b a() {
            pn.b.a(this.f38107a, km.a.class);
            return new a(this.f38107a);
        }

        public b b(km.a aVar) {
            this.f38107a = (km.a) pn.b.b(aVar);
            return this;
        }

        public b() {
        }
    }

    public static b b() {
        return new b();
    }

    @Override // jm.b
    public gm.c a() {
        return this.f38106h.get();
    }

    public final void c(km.a aVar) {
        this.f38099a = km.c.a(aVar);
        this.f38100b = e.a(aVar);
        this.f38101c = d.a(aVar);
        this.f38102d = h.a(aVar);
        this.f38103e = km.f.a(aVar);
        this.f38104f = km.b.a(aVar);
        km.g a10 = km.g.a(aVar);
        this.f38105g = a10;
        this.f38106h = pn.a.a(gm.e.a(this.f38099a, this.f38100b, this.f38101c, this.f38102d, this.f38103e, this.f38104f, a10));
    }

    public a(km.a aVar) {
        c(aVar);
    }
}
