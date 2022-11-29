package g1;

import androidx.compose.ui.platform.o0;
import c1.c0;
import c1.d0;
import java.util.Map;
import wn.v;

/* loaded from: classes.dex */
public final class s {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.p<l0.i, Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ q f32543w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ Map<String, n> f32544x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(q qVar, Map<String, ? extends n> map) {
            super(2);
            this.f32543w = qVar;
            this.f32544x = map;
        }

        public final void a(l0.i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
            } else {
                s.a((o) this.f32543w, this.f32544x, iVar, 64, 0);
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.p<l0.i, Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ o f32545w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ Map<String, n> f32546x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f32547y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f32548z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(o oVar, Map<String, ? extends n> map, int i10, int i11) {
            super(2);
            this.f32545w = oVar;
            this.f32546x = map;
            this.f32547y = i10;
            this.f32548z = i11;
        }

        public final void a(l0.i iVar, int i10) {
            s.a(this.f32545w, this.f32546x, iVar, this.f32547y | 1, this.f32548z);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements n {
    }

    /* loaded from: classes.dex */
    public static final class d implements n {
    }

    /* loaded from: classes.dex */
    public static final class e extends jo.q implements io.r<Float, Float, l0.i, Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ g1.c f32549w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(g1.c cVar) {
            super(4);
            this.f32549w = cVar;
        }

        @Override // io.r
        public /* bridge */ /* synthetic */ v F(Float f10, Float f11, l0.i iVar, Integer num) {
            a(f10.floatValue(), f11.floatValue(), iVar, num.intValue());
            return v.f59242a;
        }

        public final void a(float f10, float f11, l0.i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
            } else {
                s.a(this.f32549w.e(), null, iVar, 0, 2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(g1.o r23, java.util.Map<java.lang.String, ? extends g1.n> r24, l0.i r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 621
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.s.a(g1.o, java.util.Map, l0.i, int, int):void");
    }

    public static final r b(g1.c cVar, l0.i iVar, int i10) {
        jo.p.h(cVar, "image");
        iVar.x(1413834416);
        r c10 = c(cVar.c(), cVar.b(), cVar.i(), cVar.h(), cVar.d(), cVar.g(), cVar.f(), cVar.a(), s0.c.b(iVar, 1873274766, true, new e(cVar)), iVar, 100663296, 0);
        iVar.O();
        return c10;
    }

    public static final r c(float f10, float f11, float f12, float f13, String str, long j10, int i10, boolean z10, io.r<? super Float, ? super Float, ? super l0.i, ? super Integer, v> rVar, l0.i iVar, int i11, int i12) {
        jo.p.h(rVar, "content");
        iVar.x(1068590786);
        float f14 = (i12 & 4) != 0 ? Float.NaN : f12;
        float f15 = (i12 & 8) == 0 ? f13 : Float.NaN;
        String str2 = (i12 & 16) != 0 ? "VectorRootGroup" : str;
        long e10 = (i12 & 32) != 0 ? c0.f18634b.e() : j10;
        int z11 = (i12 & 64) != 0 ? c1.r.f18740b.z() : i10;
        boolean z12 = (i12 & 128) != 0 ? false : z10;
        m2.d dVar = (m2.d) iVar.G(o0.e());
        float I0 = dVar.I0(f10);
        float I02 = dVar.I0(f11);
        if (Float.isNaN(f14)) {
            f14 = I0;
        }
        if (Float.isNaN(f15)) {
            f15 = I02;
        }
        c0 g10 = c0.g(e10);
        c1.r D = c1.r.D(z11);
        int i13 = i11 >> 15;
        iVar.x(511388516);
        boolean P = iVar.P(g10) | iVar.P(D);
        Object y10 = iVar.y();
        if (P || y10 == l0.i.f39065a.a()) {
            y10 = !c0.m(e10, c0.f18634b.e()) ? d0.f18653b.a(e10, z11) : null;
            iVar.q(y10);
        }
        iVar.O();
        d0 d0Var = (d0) y10;
        iVar.x(-492369756);
        Object y11 = iVar.y();
        if (y11 == l0.i.f39065a.a()) {
            y11 = new r();
            iVar.q(y11);
        }
        iVar.O();
        r rVar2 = (r) y11;
        rVar2.x(b1.m.a(I0, I02));
        rVar2.u(z12);
        rVar2.w(d0Var);
        rVar2.n(str2, f14, f15, rVar, iVar, 32768 | ((i11 >> 12) & 14) | (i13 & 7168));
        iVar.O();
        return rVar2;
    }
}
