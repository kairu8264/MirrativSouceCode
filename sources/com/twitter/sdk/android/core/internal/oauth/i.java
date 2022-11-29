package com.twitter.sdk.android.core.internal.oauth;

import ep.d0;
import ep.w;
import ep.z;
import er.t;
import in.v;
import java.io.IOException;
import kn.j;

/* loaded from: classes4.dex */
public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    public final v f28297a;

    /* renamed from: b  reason: collision with root package name */
    public final j f28298b;

    /* renamed from: c  reason: collision with root package name */
    public final String f28299c;

    /* renamed from: d  reason: collision with root package name */
    public final t f28300d = new t.b().d(b().c()).g(new z.a().a(new w() { // from class: com.twitter.sdk.android.core.internal.oauth.h
        @Override // ep.w
        public final d0 intercept(w.a aVar) {
            d0 f10;
            f10 = i.this.f(aVar);
            return f10;
        }
    }).d(ln.b.b()).c()).b(fr.a.f()).e();

    public i(v vVar, j jVar) {
        this.f28297a = vVar;
        this.f28298b = jVar;
        this.f28299c = j.b("TwitterAndroidSDK", vVar.i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ d0 f(w.a aVar) throws IOException {
        return aVar.a(aVar.j().h().d("User-Agent", e()).b());
    }

    public j b() {
        return this.f28298b;
    }

    public t c() {
        return this.f28300d;
    }

    public v d() {
        return this.f28297a;
    }

    public String e() {
        return this.f28299c;
    }
}
