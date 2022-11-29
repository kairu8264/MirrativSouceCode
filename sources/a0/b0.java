package a0;

import com.google.android.exoplayer2.DefaultLoadControl;
import java.util.List;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    public static final float f13a = m2.g.l((float) DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS);

    /* renamed from: b  reason: collision with root package name */
    public static final float f14b = m2.g.l(1500);

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<Integer, Integer> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ boolean f15w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ List<i> f16x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(boolean z10, List<? extends i> list) {
            super(1);
            this.f15w = z10;
            this.f16x = list;
        }

        public final Integer a(int i10) {
            return Integer.valueOf(this.f15w ? this.f16x.get(i10).b() : this.f16x.get(i10).c());
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @co.f(c = "androidx.compose.foundation.lazy.grid.LazyGridScrollingKt$doSmoothScrollToItem$3", f = "LazyGridScrolling.kt", l = {128, 223}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends co.l implements io.p<w.y, ao.d<? super wn.v>, Object> {
        public float A;
        public int B;
        public int C;
        public /* synthetic */ Object D;
        public final /* synthetic */ e0 E;
        public final /* synthetic */ int F;
        public final /* synthetic */ int G;
        public final /* synthetic */ int H;

        /* renamed from: w  reason: collision with root package name */
        public Object f17w;

        /* renamed from: x  reason: collision with root package name */
        public Object f18x;

        /* renamed from: y  reason: collision with root package name */
        public Object f19y;

        /* renamed from: z  reason: collision with root package name */
        public float f20z;

        /* loaded from: classes.dex */
        public static final class a extends jo.q implements io.l<u.h<Float, u.m>, wn.v> {
            public final /* synthetic */ boolean A;
            public final /* synthetic */ float B;
            public final /* synthetic */ jo.c0 C;
            public final /* synthetic */ int D;
            public final /* synthetic */ e0 E;
            public final /* synthetic */ int F;
            public final /* synthetic */ jo.e0<u.k<Float, u.m>> G;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ float f21w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ jo.b0 f22x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ w.y f23y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ jo.a0 f24z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(float f10, jo.b0 b0Var, w.y yVar, jo.a0 a0Var, boolean z10, float f11, jo.c0 c0Var, int i10, e0 e0Var, int i11, jo.e0<u.k<Float, u.m>> e0Var2) {
                super(1);
                this.f21w = f10;
                this.f22x = b0Var;
                this.f23y = yVar;
                this.f24z = a0Var;
                this.A = z10;
                this.B = f11;
                this.C = c0Var;
                this.D = i10;
                this.E = e0Var;
                this.F = i11;
                this.G = e0Var2;
            }

            public final void a(u.h<Float, u.m> hVar) {
                float c10;
                jo.p.h(hVar, "$this$animateTo");
                i g10 = b0.g(this.E, this.D);
                if (g10 == null) {
                    if (this.f21w > 0.0f) {
                        c10 = po.n.h(hVar.e().floatValue(), this.f21w);
                    } else {
                        c10 = po.n.c(hVar.e().floatValue(), this.f21w);
                    }
                    float f10 = c10 - this.f22x.f38128w;
                    float a10 = this.f23y.a(f10);
                    i g11 = b0.g(this.E, this.D);
                    if (g11 == null && !b.i(this.A, this.E, this.D, this.F)) {
                        if (!(f10 == a10)) {
                            hVar.a();
                            this.f24z.f38125w = false;
                            return;
                        }
                        this.f22x.f38128w += f10;
                        if (this.A) {
                            if (hVar.e().floatValue() > this.B) {
                                hVar.a();
                            }
                        } else if (hVar.e().floatValue() < (-this.B)) {
                            hVar.a();
                        }
                        if (this.A) {
                            if (this.C.f38129w >= 2 && this.D - ((i) xn.a0.i0(this.E.p().b())).getIndex() > 200) {
                                this.E.I(this.D - 200, 0);
                            }
                        } else if (this.C.f38129w >= 2) {
                            int index = ((i) xn.a0.X(this.E.p().b())).getIndex();
                            int i10 = this.D;
                            if (index - i10 > 100) {
                                this.E.I(i10 + 200, 0);
                            }
                        }
                    }
                    g10 = g11;
                }
                if (!b.i(this.A, this.E, this.D, this.F)) {
                    if (g10 != null) {
                        throw new d(g10, this.G.f38136w);
                    }
                    return;
                }
                this.E.I(this.D, this.F);
                this.f24z.f38125w = false;
                hVar.a();
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ wn.v invoke(u.h<Float, u.m> hVar) {
                a(hVar);
                return wn.v.f59242a;
            }
        }

        /* renamed from: a0.b0$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0001b extends jo.q implements io.l<u.h<Float, u.m>, wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ float f25w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ jo.b0 f26x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ w.y f27y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0001b(float f10, jo.b0 b0Var, w.y yVar) {
                super(1);
                this.f25w = f10;
                this.f26x = b0Var;
                this.f27y = yVar;
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
                    float r0 = r5.f25w
                    r1 = 0
                    int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                    if (r2 <= 0) goto L1d
                    java.lang.Object r0 = r6.e()
                    java.lang.Number r0 = (java.lang.Number) r0
                    float r0 = r0.floatValue()
                    float r1 = r5.f25w
                    float r1 = po.n.h(r0, r1)
                    goto L31
                L1d:
                    int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                    if (r0 >= 0) goto L31
                    java.lang.Object r0 = r6.e()
                    java.lang.Number r0 = (java.lang.Number) r0
                    float r0 = r0.floatValue()
                    float r1 = r5.f25w
                    float r1 = po.n.c(r0, r1)
                L31:
                    jo.b0 r0 = r5.f26x
                    float r0 = r0.f38128w
                    float r0 = r1 - r0
                    w.y r2 = r5.f27y
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
                    jo.b0 r6 = r5.f26x
                    float r1 = r6.f38128w
                    float r1 = r1 + r0
                    r6.f38128w = r1
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: a0.b0.b.C0001b.a(u.h):void");
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ wn.v invoke(u.h<Float, u.m> hVar) {
                a(hVar);
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e0 e0Var, int i10, int i11, int i12, ao.d<? super b> dVar) {
            super(2, dVar);
            this.E = e0Var;
            this.F = i10;
            this.G = i11;
            this.H = i12;
        }

        public static final boolean i(boolean z10, e0 e0Var, int i10, int i11) {
            if (z10) {
                if (e0Var.m() <= i10 && (e0Var.m() != i10 || e0Var.n() <= i11)) {
                    return false;
                }
            } else if (e0Var.m() >= i10 && (e0Var.m() != i10 || e0Var.n() >= i11)) {
                return false;
            }
            return true;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            b bVar = new b(this.E, this.F, this.G, this.H, dVar);
            bVar.D = obj;
            return bVar;
        }

        @Override // io.p
        /* renamed from: g */
        public final Object invoke(w.y yVar, ao.d<? super wn.v> dVar) {
            return ((b) create(yVar, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00b1 A[Catch: d -> 0x01d5, TryCatch #4 {d -> 0x01d5, blocks: (B:23:0x00ad, B:25:0x00b1, B:27:0x00bd, B:31:0x00d8, B:35:0x00ea, B:41:0x010d, B:48:0x0152, B:52:0x015b), top: B:88:0x00ad }] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00d5  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00d7  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00e7  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00e9  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0107  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0148  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x014a  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x014d  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0150  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0156  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0159  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x01b5 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:58:0x01b6  */
        /* JADX WARN: Type inference failed for: r10v0, types: [u.k, T] */
        /* JADX WARN: Type inference failed for: r4v15, types: [u.k, T] */
        /* JADX WARN: Type inference failed for: r5v18 */
        /* JADX WARN: Type inference failed for: r5v6 */
        /* JADX WARN: Type inference failed for: r5v7, types: [int] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x01b6 -> B:85:0x01be). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r37) {
            /*
                Method dump skipped, instructions count: 600
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: a0.b0.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final int e(List<? extends i> list, boolean z10) {
        int g10;
        a aVar = new a(z10, list);
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < list.size()) {
            int intValue = aVar.invoke(Integer.valueOf(i10)).intValue();
            if (intValue == -1) {
                i10++;
            } else {
                int i13 = 0;
                while (i10 < list.size() && aVar.invoke(Integer.valueOf(i10)).intValue() == intValue) {
                    if (z10) {
                        g10 = m2.o.f(list.get(i10).a());
                    } else {
                        g10 = m2.o.g(list.get(i10).a());
                    }
                    i13 = Math.max(i13, g10);
                    i10++;
                }
                i11 += i13;
                i12++;
            }
        }
        return i11 / i12;
    }

    public static final Object f(e0 e0Var, int i10, int i11, int i12, ao.d<? super wn.v> dVar) {
        if (((float) i10) >= 0.0f) {
            Object b10 = w.b0.b(e0Var, null, new b(e0Var, i10, i12, i11, null), dVar, 1, null);
            return b10 == bo.c.c() ? b10 : wn.v.f59242a;
        }
        throw new IllegalArgumentException(("Index should be non-negative (" + i10 + ')').toString());
    }

    public static final i g(e0 e0Var, int i10) {
        i iVar;
        List<i> b10 = e0Var.p().b();
        int size = b10.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                iVar = null;
                break;
            }
            iVar = b10.get(i11);
            if (iVar.getIndex() == i10) {
                break;
            }
            i11++;
        }
        return iVar;
    }
}
