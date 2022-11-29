package e1;

import b1.l;
import b1.m;
import c1.u0;
import c1.w;
import jo.p;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final m2.d f30040a = m2.f.a(1.0f, 1.0f);

    /* loaded from: classes.dex */
    public static final class a implements g {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f30041a;

        public a(d dVar) {
            this.f30041a = dVar;
        }

        @Override // e1.g
        public void a(float f10, float f11, float f12, float f13, int i10) {
            this.f30041a.e().a(f10, f11, f12, f13, i10);
        }

        @Override // e1.g
        public void b(float f10, float f11) {
            this.f30041a.e().b(f10, f11);
        }

        @Override // e1.g
        public void c(u0 u0Var, int i10) {
            p.h(u0Var, "path");
            this.f30041a.e().c(u0Var, i10);
        }

        @Override // e1.g
        public void d(float[] fArr) {
            p.h(fArr, "matrix");
            this.f30041a.e().s(fArr);
        }

        @Override // e1.g
        public void g(float f10, float f11, long j10) {
            w e10 = this.f30041a.e();
            e10.b(b1.f.m(j10), b1.f.n(j10));
            e10.e(f10, f11);
            e10.b(-b1.f.m(j10), -b1.f.n(j10));
        }

        @Override // e1.g
        public void h(float f10, long j10) {
            w e10 = this.f30041a.e();
            e10.b(b1.f.m(j10), b1.f.n(j10));
            e10.m(f10);
            e10.b(-b1.f.m(j10), -b1.f.n(j10));
        }

        @Override // e1.g
        public void i(float f10, float f11, float f12, float f13) {
            w e10 = this.f30041a.e();
            d dVar = this.f30041a;
            long a10 = m.a(l.i(j()) - (f12 + f10), l.g(j()) - (f13 + f11));
            if (l.i(a10) >= 0.0f && l.g(a10) >= 0.0f) {
                dVar.f(a10);
                e10.b(f10, f11);
                return;
            }
            throw new IllegalArgumentException("Width and height must be greater than or equal to zero".toString());
        }

        public long j() {
            return this.f30041a.c();
        }
    }

    public static final g c(d dVar) {
        return new a(dVar);
    }
}
