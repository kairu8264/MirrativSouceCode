package z;

import com.google.android.exoplayer2.DefaultLoadControl;
import java.util.List;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    public static final float f62194a = m2.g.l((float) DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS);

    /* renamed from: b  reason: collision with root package name */
    public static final float f62195b = m2.g.l(1500);

    @co.f(c = "androidx.compose.foundation.lazy.LazyListScrollingKt$doSmoothScrollToItem$3", f = "LazyListScrolling.kt", l = {114, 205}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends co.l implements io.p<w.y, ao.d<? super wn.v>, Object> {
        public float A;
        public int B;
        public int C;
        public /* synthetic */ Object D;
        public final /* synthetic */ g0 E;
        public final /* synthetic */ int F;
        public final /* synthetic */ int G;

        /* renamed from: w  reason: collision with root package name */
        public Object f62196w;

        /* renamed from: x  reason: collision with root package name */
        public Object f62197x;

        /* renamed from: y  reason: collision with root package name */
        public Object f62198y;

        /* renamed from: z  reason: collision with root package name */
        public float f62199z;

        /* renamed from: z.f0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C1071a extends jo.q implements io.l<u.h<Float, u.m>, wn.v> {
            public final /* synthetic */ boolean A;
            public final /* synthetic */ float B;
            public final /* synthetic */ jo.c0 C;
            public final /* synthetic */ int D;
            public final /* synthetic */ g0 E;
            public final /* synthetic */ int F;
            public final /* synthetic */ jo.e0<u.k<Float, u.m>> G;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ float f62200w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ jo.b0 f62201x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ w.y f62202y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ jo.a0 f62203z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1071a(float f10, jo.b0 b0Var, w.y yVar, jo.a0 a0Var, boolean z10, float f11, jo.c0 c0Var, int i10, g0 g0Var, int i11, jo.e0<u.k<Float, u.m>> e0Var) {
                super(1);
                this.f62200w = f10;
                this.f62201x = b0Var;
                this.f62202y = yVar;
                this.f62203z = a0Var;
                this.A = z10;
                this.B = f11;
                this.C = c0Var;
                this.D = i10;
                this.E = g0Var;
                this.F = i11;
                this.G = e0Var;
            }

            public final void a(u.h<Float, u.m> hVar) {
                float c10;
                jo.p.h(hVar, "$this$animateTo");
                n e10 = f0.e(this.E, this.D);
                if (e10 == null) {
                    if (this.f62200w > 0.0f) {
                        c10 = po.n.h(hVar.e().floatValue(), this.f62200w);
                    } else {
                        c10 = po.n.c(hVar.e().floatValue(), this.f62200w);
                    }
                    float f10 = c10 - this.f62201x.f38128w;
                    float a10 = this.f62202y.a(f10);
                    n e11 = f0.e(this.E, this.D);
                    if (e11 == null && !a.i(this.A, this.E, this.D, this.F)) {
                        if (!(f10 == a10)) {
                            hVar.a();
                            this.f62203z.f38125w = false;
                            return;
                        }
                        this.f62201x.f38128w += f10;
                        if (this.A) {
                            if (hVar.e().floatValue() > this.B) {
                                hVar.a();
                            }
                        } else if (hVar.e().floatValue() < (-this.B)) {
                            hVar.a();
                        }
                        if (this.A) {
                            if (this.C.f38129w >= 2 && this.D - ((n) xn.a0.i0(this.E.p().b())).getIndex() > 100) {
                                this.E.E(this.D - 100, 0);
                            }
                        } else if (this.C.f38129w >= 2) {
                            int index = ((n) xn.a0.X(this.E.p().b())).getIndex();
                            int i10 = this.D;
                            if (index - i10 > 100) {
                                this.E.E(i10 + 100, 0);
                            }
                        }
                    }
                    e10 = e11;
                }
                if (!a.i(this.A, this.E, this.D, this.F)) {
                    if (e10 != null) {
                        throw new d(e10, this.G.f38136w);
                    }
                    return;
                }
                this.E.E(this.D, this.F);
                this.f62203z.f38125w = false;
                hVar.a();
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ wn.v invoke(u.h<Float, u.m> hVar) {
                a(hVar);
                return wn.v.f59242a;
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends jo.q implements io.l<u.h<Float, u.m>, wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ float f62204w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ jo.b0 f62205x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ w.y f62206y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(float f10, jo.b0 b0Var, w.y yVar) {
                super(1);
                this.f62204w = f10;
                this.f62205x = b0Var;
                this.f62206y = yVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
                if ((r1 == r6.e().floatValue()) == false) goto L15;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void a(u.h<java.lang.Float, u.m> r6) {
                /*
                    r5 = this;
                    java.lang.String r0 = "$this$animateTo"
                    jo.p.h(r6, r0)
                    float r0 = r5.f62204w
                    r1 = 0
                    int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                    if (r2 <= 0) goto L1d
                    java.lang.Object r0 = r6.e()
                    java.lang.Number r0 = (java.lang.Number) r0
                    float r0 = r0.floatValue()
                    float r1 = r5.f62204w
                    float r1 = po.n.h(r0, r1)
                    goto L31
                L1d:
                    int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                    if (r0 >= 0) goto L31
                    java.lang.Object r0 = r6.e()
                    java.lang.Number r0 = (java.lang.Number) r0
                    float r0 = r0.floatValue()
                    float r1 = r5.f62204w
                    float r1 = po.n.c(r0, r1)
                L31:
                    jo.b0 r0 = r5.f62205x
                    float r0 = r0.f38128w
                    float r0 = r1 - r0
                    w.y r2 = r5.f62206y
                    float r2 = r2.a(r0)
                    int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                    r3 = 1
                    r4 = 0
                    if (r2 != 0) goto L45
                    r2 = r3
                    goto L46
                L45:
                    r2 = r4
                L46:
                    if (r2 == 0) goto L5a
                    java.lang.Object r2 = r6.e()
                    java.lang.Number r2 = (java.lang.Number) r2
                    float r2 = r2.floatValue()
                    int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                    if (r1 != 0) goto L57
                    goto L58
                L57:
                    r3 = r4
                L58:
                    if (r3 != 0) goto L5d
                L5a:
                    r6.a()
                L5d:
                    jo.b0 r6 = r5.f62205x
                    float r1 = r6.f38128w
                    float r1 = r1 + r0
                    r6.f38128w = r1
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: z.f0.a.b.a(u.h):void");
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ wn.v invoke(u.h<Float, u.m> hVar) {
                a(hVar);
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g0 g0Var, int i10, int i11, ao.d<? super a> dVar) {
            super(2, dVar);
            this.E = g0Var;
            this.F = i10;
            this.G = i11;
        }

        public static final boolean i(boolean z10, g0 g0Var, int i10, int i11) {
            if (z10) {
                if (g0Var.m() <= i10 && (g0Var.m() != i10 || g0Var.n() <= i11)) {
                    return false;
                }
            } else if (g0Var.m() >= i10 && (g0Var.m() != i10 || g0Var.n() >= i11)) {
                return false;
            }
            return true;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            a aVar = new a(this.E, this.F, this.G, dVar);
            aVar.D = obj;
            return aVar;
        }

        @Override // io.p
        /* renamed from: g */
        public final Object invoke(w.y yVar, ao.d<? super wn.v> dVar) {
            return ((a) create(yVar, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x00b1 A[Catch: d -> 0x01d4, TryCatch #3 {d -> 0x01d4, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bd, B:32:0x00df, B:38:0x010d, B:45:0x0154, B:49:0x015d), top: B:85:0x00ad }] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00d0 A[Catch: d -> 0x01cb, TRY_ENTER, TRY_LEAVE, TryCatch #0 {d -> 0x01cb, blocks: (B:56:0x01be, B:30:0x00d0), top: B:79:0x01be }] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0107  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x014a  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x014c  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x014f  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0152  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0158  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x015b  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x01b5 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:55:0x01b6  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0221  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0224  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x0247 A[RETURN] */
        /* JADX WARN: Type inference failed for: r10v0, types: [u.k, T] */
        /* JADX WARN: Type inference failed for: r5v15, types: [u.k, T] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x01b6 -> B:79:0x01be). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r37) {
            /*
                Method dump skipped, instructions count: 596
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: z.f0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final Object d(g0 g0Var, int i10, int i11, ao.d<? super wn.v> dVar) {
        if (((float) i10) >= 0.0f) {
            Object b10 = w.b0.b(g0Var, null, new a(g0Var, i10, i11, null), dVar, 1, null);
            return b10 == bo.c.c() ? b10 : wn.v.f59242a;
        }
        throw new IllegalArgumentException(("Index should be non-negative (" + i10 + ')').toString());
    }

    public static final n e(g0 g0Var, int i10) {
        n nVar;
        List<n> b10 = g0Var.p().b();
        int size = b10.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                nVar = null;
                break;
            }
            nVar = b10.get(i11);
            if (nVar.getIndex() == i10) {
                break;
            }
            i11++;
        }
        return nVar;
    }
}
