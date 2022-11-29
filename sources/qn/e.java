package qn;

import io.l;
import io.q;
import jo.b0;
import jo.p;
import l0.s0;
import l0.z1;
import u.w;
import w.m;
import w.y;
import wn.v;

/* loaded from: classes4.dex */
public final class e implements m {

    /* renamed from: a  reason: collision with root package name */
    public final h f49624a;

    /* renamed from: b  reason: collision with root package name */
    public final w<Float> f49625b;

    /* renamed from: c  reason: collision with root package name */
    public final u.i<Float> f49626c;

    /* renamed from: d  reason: collision with root package name */
    public final q<h, Integer, Integer, Integer> f49627d;

    /* renamed from: e  reason: collision with root package name */
    public final l<h, Float> f49628e;

    /* renamed from: f  reason: collision with root package name */
    public final s0 f49629f;

    @co.f(c = "dev.chrisbanes.snapper.SnapperFlingBehavior", f = "SnapperFlingBehavior.kt", l = {406, 416}, m = "flingToIndex")
    /* loaded from: classes4.dex */
    public static final class a extends co.d {
        public /* synthetic */ Object A;
        public int C;

        /* renamed from: w  reason: collision with root package name */
        public Object f49630w;

        /* renamed from: x  reason: collision with root package name */
        public Object f49631x;

        /* renamed from: y  reason: collision with root package name */
        public int f49632y;

        /* renamed from: z  reason: collision with root package name */
        public float f49633z;

        public a(ao.d<? super a> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.A = obj;
            this.C |= Integer.MIN_VALUE;
            return e.this.j(null, 0, 0.0f, this);
        }
    }

    @co.f(c = "dev.chrisbanes.snapper.SnapperFlingBehavior", f = "SnapperFlingBehavior.kt", l = {477}, m = "performDecayFling")
    /* loaded from: classes4.dex */
    public static final class b extends co.d {
        public int A;

        /* renamed from: w  reason: collision with root package name */
        public Object f49634w;

        /* renamed from: x  reason: collision with root package name */
        public Object f49635x;

        /* renamed from: y  reason: collision with root package name */
        public /* synthetic */ Object f49636y;

        public b(ao.d<? super b> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f49636y = obj;
            this.A |= Integer.MIN_VALUE;
            return e.this.l(null, null, 0, 0.0f, false, this);
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends jo.q implements l<u.h<Float, u.m>, v> {
        public final /* synthetic */ boolean A;
        public final /* synthetic */ int B;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ b0 f49638w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ y f49639x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ b0 f49640y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ e f49641z;

        /* loaded from: classes4.dex */
        public /* synthetic */ class a extends jo.m implements l<Float, Float> {
            public a(Object obj) {
                super(1, obj, y.class, "scrollBy", "scrollBy(F)F", 0);
            }

            public final Float i(float f10) {
                return Float.valueOf(((y) this.f38131x).a(f10));
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ Float invoke(Float f10) {
                return i(f10.floatValue());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b0 b0Var, y yVar, b0 b0Var2, e eVar, boolean z10, int i10) {
            super(1);
            this.f49638w = b0Var;
            this.f49639x = yVar;
            this.f49640y = b0Var2;
            this.f49641z = eVar;
            this.A = z10;
            this.B = i10;
        }

        public final void a(u.h<Float, u.m> hVar) {
            p.h(hVar, "$this$animateDecay");
            float floatValue = hVar.e().floatValue() - this.f49638w.f38128w;
            float a10 = this.f49639x.a(floatValue);
            this.f49638w.f38128w = hVar.e().floatValue();
            this.f49640y.f38128w = hVar.f().floatValue();
            if (Math.abs(floatValue - a10) > 0.5f) {
                hVar.a();
            }
            i e10 = this.f49641z.f49624a.e();
            if (e10 == null) {
                hVar.a();
                return;
            }
            if (hVar.h() && this.A) {
                if (hVar.f().floatValue() > 0.0f && e10.a() == this.B - 1) {
                    hVar.a();
                } else if (hVar.f().floatValue() < 0.0f && e10.a() == this.B) {
                    hVar.a();
                }
            }
            if (hVar.h() && this.f49641z.n(hVar, e10, this.B, new a(this.f49639x))) {
                hVar.a();
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(u.h<Float, u.m> hVar) {
            a(hVar);
            return v.f59242a;
        }
    }

    @co.f(c = "dev.chrisbanes.snapper.SnapperFlingBehavior", f = "SnapperFlingBehavior.kt", l = {551}, m = "performSpringFling")
    /* loaded from: classes4.dex */
    public static final class d extends co.d {
        public int A;

        /* renamed from: w  reason: collision with root package name */
        public Object f49642w;

        /* renamed from: x  reason: collision with root package name */
        public Object f49643x;

        /* renamed from: y  reason: collision with root package name */
        public /* synthetic */ Object f49644y;

        public d(ao.d<? super d> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f49644y = obj;
            this.A |= Integer.MIN_VALUE;
            return e.this.o(null, null, 0, 0.0f, this);
        }
    }

    /* renamed from: qn.e$e  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0748e extends jo.q implements l<u.h<Float, u.m>, v> {
        public final /* synthetic */ int A;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ b0 f49646w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ y f49647x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ b0 f49648y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ e f49649z;

        /* renamed from: qn.e$e$a */
        /* loaded from: classes4.dex */
        public /* synthetic */ class a extends jo.m implements l<Float, Float> {
            public a(Object obj) {
                super(1, obj, y.class, "scrollBy", "scrollBy(F)F", 0);
            }

            public final Float i(float f10) {
                return Float.valueOf(((y) this.f38131x).a(f10));
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ Float invoke(Float f10) {
                return i(f10.floatValue());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0748e(b0 b0Var, y yVar, b0 b0Var2, e eVar, int i10) {
            super(1);
            this.f49646w = b0Var;
            this.f49647x = yVar;
            this.f49648y = b0Var2;
            this.f49649z = eVar;
            this.A = i10;
        }

        public final void a(u.h<Float, u.m> hVar) {
            p.h(hVar, "$this$animateTo");
            float floatValue = hVar.e().floatValue() - this.f49646w.f38128w;
            float a10 = this.f49647x.a(floatValue);
            this.f49646w.f38128w = hVar.e().floatValue();
            this.f49648y.f38128w = hVar.f().floatValue();
            i e10 = this.f49649z.f49624a.e();
            if (e10 != null) {
                if (this.f49649z.n(hVar, e10, this.A, new a(this.f49647x))) {
                    hVar.a();
                    return;
                } else if (Math.abs(floatValue - a10) > 0.5f) {
                    hVar.a();
                    return;
                } else {
                    return;
                }
            }
            hVar.a();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(u.h<Float, u.m> hVar) {
            a(hVar);
            return v.f59242a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(h hVar, w<Float> wVar, u.i<Float> iVar, q<? super h, ? super Integer, ? super Integer, Integer> qVar, l<? super h, Float> lVar) {
        s0 e10;
        this.f49624a = hVar;
        this.f49625b = wVar;
        this.f49626c = iVar;
        this.f49627d = qVar;
        this.f49628e = lVar;
        e10 = z1.e(null, null, 2, null);
        this.f49629f = e10;
    }

    public static /* synthetic */ Object m(e eVar, y yVar, i iVar, int i10, float f10, boolean z10, ao.d dVar, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            z10 = true;
        }
        return eVar.l(yVar, iVar, i10, f10, z10, dVar);
    }

    @Override // w.m
    public Object a(y yVar, float f10, ao.d<? super Float> dVar) {
        if (this.f49624a.b() && this.f49624a.a()) {
            j jVar = j.f49657a;
            float floatValue = this.f49628e.invoke(this.f49624a).floatValue();
            boolean z10 = true;
            if (floatValue > 0.0f) {
                i e10 = this.f49624a.e();
                if (e10 == null) {
                    return co.b.c(f10);
                }
                int intValue = this.f49627d.s0(this.f49624a, co.b.d(f10 < 0.0f ? e10.a() + 1 : e10.a()), co.b.d(this.f49624a.c(f10, this.f49625b, floatValue))).intValue();
                if (intValue < 0 || intValue >= this.f49624a.h()) {
                    z10 = false;
                }
                if (z10) {
                    return j(yVar, intValue, f10, dVar);
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Distance returned by maximumFlingDistance should be greater than 0".toString());
        }
        return co.b.c(f10);
    }

    public final int g(float f10, i iVar, int i10) {
        if (f10 > 0.0f && iVar.a() >= i10) {
            return this.f49624a.d(iVar.a());
        }
        if (f10 >= 0.0f || iVar.a() > i10 - 1) {
            return 0;
        }
        return this.f49624a.d(iVar.a() + 1);
    }

    public final boolean h(w<Float> wVar, float f10, i iVar) {
        if (Math.abs(f10) < 0.5f) {
            return false;
        }
        float a10 = u.y.a(wVar, 0.0f, f10);
        j jVar = j.f49657a;
        if (f10 < 0.0f) {
            if (a10 > this.f49624a.d(iVar.a())) {
                return false;
            }
        } else if (a10 < this.f49624a.d(iVar.a() + 1)) {
            return false;
        }
        return true;
    }

    public final float i(float f10) {
        if (f10 >= 0.0f || this.f49624a.b()) {
            if (f10 <= 0.0f || this.f49624a.a()) {
                return 0.0f;
            }
            return f10;
        }
        return f10;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(w.y r17, int r18, float r19, ao.d<? super java.lang.Float> r20) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: qn.e.j(w.y, int, float, ao.d):java.lang.Object");
    }

    public final Integer k() {
        return (Integer) this.f49629f.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(w.y r22, qn.i r23, int r24, float r25, boolean r26, ao.d<? super java.lang.Float> r27) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: qn.e.l(w.y, qn.i, int, float, boolean, ao.d):java.lang.Object");
    }

    public final boolean n(u.h<Float, u.m> hVar, i iVar, int i10, l<? super Float, Float> lVar) {
        j jVar = j.f49657a;
        int g10 = g(hVar.f().floatValue(), iVar, i10);
        if (g10 != 0) {
            lVar.invoke(Float.valueOf(g10));
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(w.y r26, qn.i r27, int r28, float r29, ao.d<? super java.lang.Float> r30) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: qn.e.o(w.y, qn.i, int, float, ao.d):java.lang.Object");
    }

    public final void p(Integer num) {
        this.f49629f.setValue(num);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(h hVar, w<Float> wVar, u.i<Float> iVar, q<? super h, ? super Integer, ? super Integer, Integer> qVar) {
        this(hVar, wVar, iVar, qVar, f.f49650a.a());
        p.h(hVar, "layoutInfo");
        p.h(wVar, "decayAnimationSpec");
        p.h(iVar, "springAnimationSpec");
        p.h(qVar, "snapIndex");
    }
}
