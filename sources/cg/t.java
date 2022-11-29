package cg;

import android.content.Context;
import java.util.Collections;
import java.util.Set;
import kg.w;

/* loaded from: classes3.dex */
public class t implements s {

    /* renamed from: e  reason: collision with root package name */
    public static volatile u f19630e;

    /* renamed from: a  reason: collision with root package name */
    public final ng.a f19631a;

    /* renamed from: b  reason: collision with root package name */
    public final ng.a f19632b;

    /* renamed from: c  reason: collision with root package name */
    public final jg.e f19633c;

    /* renamed from: d  reason: collision with root package name */
    public final kg.s f19634d;

    public t(ng.a aVar, ng.a aVar2, jg.e eVar, kg.s sVar, w wVar) {
        this.f19631a = aVar;
        this.f19632b = aVar2;
        this.f19633c = eVar;
        this.f19634d = sVar;
        wVar.c();
    }

    public static t c() {
        u uVar = f19630e;
        if (uVar != null) {
            return uVar.c();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static Set<zf.b> d(f fVar) {
        if (fVar instanceof g) {
            return Collections.unmodifiableSet(((g) fVar).a());
        }
        return Collections.singleton(zf.b.b("proto"));
    }

    public static void f(Context context) {
        if (f19630e == null) {
            synchronized (t.class) {
                if (f19630e == null) {
                    f19630e = e.d().b(context).a();
                }
            }
        }
    }

    @Override // cg.s
    public void a(n nVar, zf.h hVar) {
        this.f19633c.a(nVar.f().f(nVar.c().c()), b(nVar), hVar);
    }

    public final i b(n nVar) {
        return i.a().i(this.f19631a.a()).k(this.f19632b.a()).j(nVar.g()).h(new h(nVar.b(), nVar.d())).g(nVar.c().a()).d();
    }

    public kg.s e() {
        return this.f19634d;
    }

    public zf.g g(f fVar) {
        return new p(d(fVar), o.a().b(fVar.getName()).c(fVar.getExtras()).a(), this);
    }
}
