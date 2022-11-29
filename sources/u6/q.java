package u6;

import a7.r;
import android.graphics.Path;
import java.util.List;
import v6.a;

/* loaded from: classes.dex */
public class q implements m, a.b {

    /* renamed from: b  reason: collision with root package name */
    public final String f54575b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f54576c;

    /* renamed from: d  reason: collision with root package name */
    public final s6.f f54577d;

    /* renamed from: e  reason: collision with root package name */
    public final v6.a<?, Path> f54578e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f54579f;

    /* renamed from: a  reason: collision with root package name */
    public final Path f54574a = new Path();

    /* renamed from: g  reason: collision with root package name */
    public final b f54580g = new b();

    public q(s6.f fVar, b7.b bVar, a7.p pVar) {
        this.f54575b = pVar.b();
        this.f54576c = pVar.d();
        this.f54577d = fVar;
        v6.a<a7.m, Path> a10 = pVar.c().a();
        this.f54578e = a10;
        bVar.h(a10);
        a10.a(this);
    }

    public final void a() {
        this.f54579f = false;
        this.f54577d.invalidateSelf();
    }

    @Override // v6.a.b
    public void b() {
        a();
    }

    @Override // u6.c
    public void c(List<c> list, List<c> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            c cVar = list.get(i10);
            if (cVar instanceof s) {
                s sVar = (s) cVar;
                if (sVar.i() == r.a.SIMULTANEOUSLY) {
                    this.f54580g.a(sVar);
                    sVar.a(this);
                }
            }
        }
    }

    @Override // u6.m
    public Path getPath() {
        if (this.f54579f) {
            return this.f54574a;
        }
        this.f54574a.reset();
        if (this.f54576c) {
            this.f54579f = true;
            return this.f54574a;
        }
        Path h10 = this.f54578e.h();
        if (h10 == null) {
            return this.f54574a;
        }
        this.f54574a.set(h10);
        this.f54574a.setFillType(Path.FillType.EVEN_ODD);
        this.f54580g.b(this.f54574a);
        this.f54579f = true;
        return this.f54574a;
    }
}
