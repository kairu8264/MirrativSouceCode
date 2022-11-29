package e0;

import b1.l;
import c1.g1;
import c1.q0;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import jo.p;
import m2.q;

/* loaded from: classes.dex */
public abstract class a implements g1 {

    /* renamed from: a  reason: collision with root package name */
    public final b f30022a;

    /* renamed from: b  reason: collision with root package name */
    public final b f30023b;

    /* renamed from: c  reason: collision with root package name */
    public final b f30024c;

    /* renamed from: d  reason: collision with root package name */
    public final b f30025d;

    public a(b bVar, b bVar2, b bVar3, b bVar4) {
        p.h(bVar, "topStart");
        p.h(bVar2, "topEnd");
        p.h(bVar3, "bottomEnd");
        p.h(bVar4, "bottomStart");
        this.f30022a = bVar;
        this.f30023b = bVar2;
        this.f30024c = bVar3;
        this.f30025d = bVar4;
    }

    @Override // c1.g1
    public final q0 a(long j10, q qVar, m2.d dVar) {
        p.h(qVar, "layoutDirection");
        p.h(dVar, "density");
        float a10 = this.f30022a.a(j10, dVar);
        float a11 = this.f30023b.a(j10, dVar);
        float a12 = this.f30024c.a(j10, dVar);
        float a13 = this.f30025d.a(j10, dVar);
        float h10 = l.h(j10);
        float f10 = a10 + a13;
        if (f10 > h10) {
            float f11 = h10 / f10;
            a10 *= f11;
            a13 *= f11;
        }
        float f12 = a13;
        float f13 = a11 + a12;
        if (f13 > h10) {
            float f14 = h10 / f13;
            a11 *= f14;
            a12 *= f14;
        }
        if (a10 >= 0.0f && a11 >= 0.0f && a12 >= 0.0f && f12 >= 0.0f) {
            return d(j10, a10, a11, a12, f12, qVar);
        }
        throw new IllegalArgumentException(("Corner size in Px can't be negative(topStart = " + a10 + ", topEnd = " + a11 + ", bottomEnd = " + a12 + ", bottomStart = " + f12 + ")!").toString());
    }

    public final a b(b bVar) {
        p.h(bVar, TtmlNode.COMBINE_ALL);
        return c(bVar, bVar, bVar, bVar);
    }

    public abstract a c(b bVar, b bVar2, b bVar3, b bVar4);

    public abstract q0 d(long j10, float f10, float f11, float f12, float f13, q qVar);

    public final b e() {
        return this.f30024c;
    }

    public final b f() {
        return this.f30025d;
    }

    public final b g() {
        return this.f30023b;
    }

    public final b h() {
        return this.f30022a;
    }
}
