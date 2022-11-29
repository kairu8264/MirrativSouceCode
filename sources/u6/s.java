package u6;

import a7.r;
import java.util.ArrayList;
import java.util.List;
import v6.a;

/* loaded from: classes.dex */
public class s implements c, a.b {

    /* renamed from: a  reason: collision with root package name */
    public final String f54586a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f54587b;

    /* renamed from: c  reason: collision with root package name */
    public final List<a.b> f54588c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final r.a f54589d;

    /* renamed from: e  reason: collision with root package name */
    public final v6.a<?, Float> f54590e;

    /* renamed from: f  reason: collision with root package name */
    public final v6.a<?, Float> f54591f;

    /* renamed from: g  reason: collision with root package name */
    public final v6.a<?, Float> f54592g;

    public s(b7.b bVar, a7.r rVar) {
        this.f54586a = rVar.c();
        this.f54587b = rVar.g();
        this.f54589d = rVar.f();
        v6.a<Float, Float> a10 = rVar.e().a();
        this.f54590e = a10;
        v6.a<Float, Float> a11 = rVar.b().a();
        this.f54591f = a11;
        v6.a<Float, Float> a12 = rVar.d().a();
        this.f54592g = a12;
        bVar.h(a10);
        bVar.h(a11);
        bVar.h(a12);
        a10.a(this);
        a11.a(this);
        a12.a(this);
    }

    public void a(a.b bVar) {
        this.f54588c.add(bVar);
    }

    @Override // v6.a.b
    public void b() {
        for (int i10 = 0; i10 < this.f54588c.size(); i10++) {
            this.f54588c.get(i10).b();
        }
    }

    @Override // u6.c
    public void c(List<c> list, List<c> list2) {
    }

    public v6.a<?, Float> d() {
        return this.f54591f;
    }

    public v6.a<?, Float> f() {
        return this.f54592g;
    }

    public v6.a<?, Float> h() {
        return this.f54590e;
    }

    public r.a i() {
        return this.f54589d;
    }

    public boolean j() {
        return this.f54587b;
    }
}
