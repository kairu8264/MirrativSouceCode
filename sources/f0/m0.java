package f0;

import l0.c2;
import l0.i;
import l0.u1;
import l0.z1;
import x0.f;

/* loaded from: classes.dex */
public final class m0 {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.q<x0.f, l0.i, Integer, x0.f> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.l<b1.f, wn.v> f31534w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ x.m f31535x;

        /* renamed from: f0.m0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0334a extends jo.q implements io.l<l0.a0, l0.z> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ l0.s0<x.p> f31536w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ x.m f31537x;

            /* renamed from: f0.m0$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0335a implements l0.z {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ l0.s0 f31538a;

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ x.m f31539b;

                public C0335a(l0.s0 s0Var, x.m mVar) {
                    this.f31538a = s0Var;
                    this.f31539b = mVar;
                }

                @Override // l0.z
                public void dispose() {
                    x.p pVar = (x.p) this.f31538a.getValue();
                    if (pVar != null) {
                        x.o oVar = new x.o(pVar);
                        x.m mVar = this.f31539b;
                        if (mVar != null) {
                            mVar.a(oVar);
                        }
                        this.f31538a.setValue(null);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0334a(l0.s0<x.p> s0Var, x.m mVar) {
                super(1);
                this.f31536w = s0Var;
                this.f31537x = mVar;
            }

            @Override // io.l
            /* renamed from: a */
            public final l0.z invoke(l0.a0 a0Var) {
                jo.p.h(a0Var, "$this$DisposableEffect");
                return new C0335a(this.f31536w, this.f31537x);
            }
        }

        @co.f(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2", f = "TextFieldPressGestureFilter.kt", l = {55}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class b extends co.l implements io.p<n1.e0, ao.d<? super wn.v>, Object> {
            public final /* synthetic */ x.m A;
            public final /* synthetic */ c2<io.l<b1.f, wn.v>> B;

            /* renamed from: w  reason: collision with root package name */
            public int f31540w;

            /* renamed from: x  reason: collision with root package name */
            public /* synthetic */ Object f31541x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ uo.q0 f31542y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ l0.s0<x.p> f31543z;

            @co.f(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1", f = "TextFieldPressGestureFilter.kt", l = {68}, m = "invokeSuspend")
            /* renamed from: f0.m0$a$b$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0336a extends co.l implements io.q<w.t, b1.f, ao.d<? super wn.v>, Object> {
                public final /* synthetic */ l0.s0<x.p> A;
                public final /* synthetic */ x.m B;

                /* renamed from: w  reason: collision with root package name */
                public int f31544w;

                /* renamed from: x  reason: collision with root package name */
                public /* synthetic */ Object f31545x;

                /* renamed from: y  reason: collision with root package name */
                public /* synthetic */ long f31546y;

                /* renamed from: z  reason: collision with root package name */
                public final /* synthetic */ uo.q0 f31547z;

                @co.f(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1", f = "TextFieldPressGestureFilter.kt", l = {61, 65}, m = "invokeSuspend")
                /* renamed from: f0.m0$a$b$a$a  reason: collision with other inner class name */
                /* loaded from: classes.dex */
                public static final class C0337a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
                    public final /* synthetic */ x.m A;

                    /* renamed from: w  reason: collision with root package name */
                    public Object f31548w;

                    /* renamed from: x  reason: collision with root package name */
                    public int f31549x;

                    /* renamed from: y  reason: collision with root package name */
                    public final /* synthetic */ l0.s0<x.p> f31550y;

                    /* renamed from: z  reason: collision with root package name */
                    public final /* synthetic */ long f31551z;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0337a(l0.s0<x.p> s0Var, long j10, x.m mVar, ao.d<? super C0337a> dVar) {
                        super(2, dVar);
                        this.f31550y = s0Var;
                        this.f31551z = j10;
                        this.A = mVar;
                    }

                    @Override // co.a
                    public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                        return new C0337a(this.f31550y, this.f31551z, this.A, dVar);
                    }

                    @Override // io.p
                    public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
                        return ((C0337a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
                    @Override // co.a
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                        /*
                            r7 = this;
                            java.lang.Object r0 = bo.c.c()
                            int r1 = r7.f31549x
                            r2 = 0
                            r3 = 2
                            r4 = 1
                            if (r1 == 0) goto L27
                            if (r1 == r4) goto L1f
                            if (r1 != r3) goto L17
                            java.lang.Object r0 = r7.f31548w
                            x.p r0 = (x.p) r0
                            wn.m.b(r8)
                            goto L66
                        L17:
                            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r8.<init>(r0)
                            throw r8
                        L1f:
                            java.lang.Object r1 = r7.f31548w
                            l0.s0 r1 = (l0.s0) r1
                            wn.m.b(r8)
                            goto L4b
                        L27:
                            wn.m.b(r8)
                            l0.s0<x.p> r8 = r7.f31550y
                            java.lang.Object r8 = r8.getValue()
                            x.p r8 = (x.p) r8
                            if (r8 == 0) goto L4f
                            x.m r1 = r7.A
                            l0.s0<x.p> r5 = r7.f31550y
                            x.o r6 = new x.o
                            r6.<init>(r8)
                            if (r1 == 0) goto L4c
                            r7.f31548w = r5
                            r7.f31549x = r4
                            java.lang.Object r8 = r1.b(r6, r7)
                            if (r8 != r0) goto L4a
                            return r0
                        L4a:
                            r1 = r5
                        L4b:
                            r5 = r1
                        L4c:
                            r5.setValue(r2)
                        L4f:
                            x.p r8 = new x.p
                            long r4 = r7.f31551z
                            r8.<init>(r4, r2)
                            x.m r1 = r7.A
                            if (r1 == 0) goto L67
                            r7.f31548w = r8
                            r7.f31549x = r3
                            java.lang.Object r1 = r1.b(r8, r7)
                            if (r1 != r0) goto L65
                            return r0
                        L65:
                            r0 = r8
                        L66:
                            r8 = r0
                        L67:
                            l0.s0<x.p> r0 = r7.f31550y
                            r0.setValue(r8)
                            wn.v r8 = wn.v.f59242a
                            return r8
                        */
                        throw new UnsupportedOperationException("Method not decompiled: f0.m0.a.b.C0336a.C0337a.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                @co.f(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$2", f = "TextFieldPressGestureFilter.kt", l = {77}, m = "invokeSuspend")
                /* renamed from: f0.m0$a$b$a$b  reason: collision with other inner class name */
                /* loaded from: classes.dex */
                public static final class C0338b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
                    public final /* synthetic */ x.m A;

                    /* renamed from: w  reason: collision with root package name */
                    public Object f31552w;

                    /* renamed from: x  reason: collision with root package name */
                    public int f31553x;

                    /* renamed from: y  reason: collision with root package name */
                    public final /* synthetic */ l0.s0<x.p> f31554y;

                    /* renamed from: z  reason: collision with root package name */
                    public final /* synthetic */ boolean f31555z;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0338b(l0.s0<x.p> s0Var, boolean z10, x.m mVar, ao.d<? super C0338b> dVar) {
                        super(2, dVar);
                        this.f31554y = s0Var;
                        this.f31555z = z10;
                        this.A = mVar;
                    }

                    @Override // co.a
                    public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                        return new C0338b(this.f31554y, this.f31555z, this.A, dVar);
                    }

                    @Override // io.p
                    public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
                        return ((C0338b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
                    }

                    @Override // co.a
                    public final Object invokeSuspend(Object obj) {
                        l0.s0<x.p> s0Var;
                        x.j oVar;
                        l0.s0<x.p> s0Var2;
                        Object c10 = bo.c.c();
                        int i10 = this.f31553x;
                        if (i10 == 0) {
                            wn.m.b(obj);
                            x.p value = this.f31554y.getValue();
                            if (value != null) {
                                boolean z10 = this.f31555z;
                                x.m mVar = this.A;
                                s0Var = this.f31554y;
                                if (z10) {
                                    oVar = new x.q(value);
                                } else {
                                    oVar = new x.o(value);
                                }
                                if (mVar != null) {
                                    this.f31552w = s0Var;
                                    this.f31553x = 1;
                                    if (mVar.b(oVar, this) == c10) {
                                        return c10;
                                    }
                                    s0Var2 = s0Var;
                                }
                                s0Var.setValue(null);
                            }
                            return wn.v.f59242a;
                        } else if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        } else {
                            s0Var2 = (l0.s0) this.f31552w;
                            wn.m.b(obj);
                        }
                        s0Var = s0Var2;
                        s0Var.setValue(null);
                        return wn.v.f59242a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0336a(uo.q0 q0Var, l0.s0<x.p> s0Var, x.m mVar, ao.d<? super C0336a> dVar) {
                    super(3, dVar);
                    this.f31547z = q0Var;
                    this.A = s0Var;
                    this.B = mVar;
                }

                public final Object a(w.t tVar, long j10, ao.d<? super wn.v> dVar) {
                    C0336a c0336a = new C0336a(this.f31547z, this.A, this.B, dVar);
                    c0336a.f31545x = tVar;
                    c0336a.f31546y = j10;
                    return c0336a.invokeSuspend(wn.v.f59242a);
                }

                @Override // co.a
                public final Object invokeSuspend(Object obj) {
                    Object c10 = bo.c.c();
                    int i10 = this.f31544w;
                    if (i10 == 0) {
                        wn.m.b(obj);
                        uo.l.d(this.f31547z, null, null, new C0337a(this.A, this.f31546y, this.B, null), 3, null);
                        this.f31544w = 1;
                        obj = ((w.t) this.f31545x).d1(this);
                        if (obj == c10) {
                            return c10;
                        }
                    } else if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        wn.m.b(obj);
                    }
                    uo.l.d(this.f31547z, null, null, new C0338b(this.A, ((Boolean) obj).booleanValue(), this.B, null), 3, null);
                    return wn.v.f59242a;
                }

                @Override // io.q
                public /* bridge */ /* synthetic */ Object s0(w.t tVar, b1.f fVar, ao.d<? super wn.v> dVar) {
                    return a(tVar, fVar.u(), dVar);
                }
            }

            /* renamed from: f0.m0$a$b$b  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0339b extends jo.q implements io.l<b1.f, wn.v> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ c2<io.l<b1.f, wn.v>> f31556w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0339b(c2<? extends io.l<? super b1.f, wn.v>> c2Var) {
                    super(1);
                    this.f31556w = c2Var;
                }

                public final void a(long j10) {
                    this.f31556w.getValue().invoke(b1.f.d(j10));
                }

                @Override // io.l
                public /* bridge */ /* synthetic */ wn.v invoke(b1.f fVar) {
                    a(fVar.u());
                    return wn.v.f59242a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(uo.q0 q0Var, l0.s0<x.p> s0Var, x.m mVar, c2<? extends io.l<? super b1.f, wn.v>> c2Var, ao.d<? super b> dVar) {
                super(2, dVar);
                this.f31542y = q0Var;
                this.f31543z = s0Var;
                this.A = mVar;
                this.B = c2Var;
            }

            @Override // io.p
            /* renamed from: a */
            public final Object invoke(n1.e0 e0Var, ao.d<? super wn.v> dVar) {
                return ((b) create(e0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                b bVar = new b(this.f31542y, this.f31543z, this.A, this.B, dVar);
                bVar.f31541x = obj;
                return bVar;
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f31540w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    C0336a c0336a = new C0336a(this.f31542y, this.f31543z, this.A, null);
                    C0339b c0339b = new C0339b(this.B);
                    this.f31540w = 1;
                    if (w.e0.i((n1.e0) this.f31541x, c0336a, c0339b, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(io.l<? super b1.f, wn.v> lVar, x.m mVar) {
            super(3);
            this.f31534w = lVar;
            this.f31535x = mVar;
        }

        public final x0.f a(x0.f fVar, l0.i iVar, int i10) {
            jo.p.h(fVar, "$this$composed");
            iVar.x(-102778667);
            iVar.x(773894976);
            iVar.x(-492369756);
            Object y10 = iVar.y();
            i.a aVar = l0.i.f39065a;
            if (y10 == aVar.a()) {
                l0.s sVar = new l0.s(l0.c0.i(ao.h.f16651w, iVar));
                iVar.q(sVar);
                y10 = sVar;
            }
            iVar.O();
            uo.q0 d10 = ((l0.s) y10).d();
            iVar.O();
            iVar.x(-492369756);
            Object y11 = iVar.y();
            if (y11 == aVar.a()) {
                y11 = z1.e(null, null, 2, null);
                iVar.q(y11);
            }
            iVar.O();
            l0.s0 s0Var = (l0.s0) y11;
            c2 l10 = u1.l(this.f31534w, iVar, 0);
            x.m mVar = this.f31535x;
            l0.c0.a(mVar, new C0334a(s0Var, mVar), iVar, 0);
            f.a aVar2 = x0.f.f59359u;
            x.m mVar2 = this.f31535x;
            x0.f b10 = n1.o0.b(aVar2, mVar2, new b(d10, s0Var, mVar2, l10, null));
            iVar.O();
            return b10;
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ x0.f s0(x0.f fVar, l0.i iVar, Integer num) {
            return a(fVar, iVar, num.intValue());
        }
    }

    public static final x0.f a(x0.f fVar, x.m mVar, boolean z10, io.l<? super b1.f, wn.v> lVar) {
        jo.p.h(fVar, "<this>");
        jo.p.h(lVar, "onTap");
        return z10 ? x0.e.d(fVar, null, new a(lVar, mVar), 1, null) : fVar;
    }
}
