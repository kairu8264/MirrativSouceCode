package w;

import androidx.compose.ui.platform.a1;
import androidx.compose.ui.platform.c1;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import l0.c2;
import l0.i;
import l0.s0;
import l0.u1;
import l0.z1;
import n1.o0;
import uo.q0;
import uo.r0;
import w.g;

/* loaded from: classes.dex */
public final class k {

    @co.f(c = "androidx.compose.foundation.gestures.DraggableKt", f = "Draggable.kt", l = {315, 324, 333, 335}, m = "awaitDownAndSlop")
    /* loaded from: classes.dex */
    public static final class a extends co.d {
        public Object A;
        public /* synthetic */ Object B;
        public int C;

        /* renamed from: w  reason: collision with root package name */
        public Object f57778w;

        /* renamed from: x  reason: collision with root package name */
        public Object f57779x;

        /* renamed from: y  reason: collision with root package name */
        public Object f57780y;

        /* renamed from: z  reason: collision with root package name */
        public Object f57781z;

        public a(ao.d<? super a> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.B = obj;
            this.C |= Integer.MIN_VALUE;
            return k.f(null, null, null, null, null, this);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.p<n1.w, Float, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ o1.g f57782w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ jo.b0 f57783x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(o1.g gVar, jo.b0 b0Var) {
            super(2);
            this.f57782w = gVar;
            this.f57783x = b0Var;
        }

        public final void a(n1.w wVar, float f10) {
            jo.p.h(wVar, "event");
            o1.h.b(this.f57782w, wVar);
            wVar.a();
            this.f57783x.f38128w = f10;
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(n1.w wVar, Float f10) {
            a(wVar, f10.floatValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.l<n1.w, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ o1.g f57784w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ q f57785x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ wo.b0<w.g> f57786y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ boolean f57787z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(o1.g gVar, q qVar, wo.b0<? super w.g> b0Var, boolean z10) {
            super(1);
            this.f57784w = gVar;
            this.f57785x = qVar;
            this.f57786y = b0Var;
            this.f57787z = z10;
        }

        public final void a(n1.w wVar) {
            jo.p.h(wVar, "event");
            o1.h.b(this.f57784w, wVar);
            float l10 = k.l(n1.n.g(wVar), this.f57785x);
            wVar.a();
            wo.b0<w.g> b0Var = this.f57786y;
            if (this.f57787z) {
                l10 *= -1;
            }
            b0Var.l(new g.b(l10, wVar.f(), null));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(n1.w wVar) {
            a(wVar);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends jo.q implements io.l<c1, wn.v> {
        public final /* synthetic */ x.m A;
        public final /* synthetic */ io.a B;
        public final /* synthetic */ io.q C;
        public final /* synthetic */ io.q D;
        public final /* synthetic */ io.p E;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.l f57788w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ q f57789x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ boolean f57790y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ boolean f57791z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(io.l lVar, q qVar, boolean z10, boolean z11, x.m mVar, io.a aVar, io.q qVar2, io.q qVar3, io.p pVar) {
            super(1);
            this.f57788w = lVar;
            this.f57789x = qVar;
            this.f57790y = z10;
            this.f57791z = z11;
            this.A = mVar;
            this.B = aVar;
            this.C = qVar2;
            this.D = qVar3;
            this.E = pVar;
        }

        public final void a(c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
            c1Var.b("draggable");
            c1Var.a().b("canDrag", this.f57788w);
            c1Var.a().b("orientation", this.f57789x);
            c1Var.a().b("enabled", Boolean.valueOf(this.f57790y));
            c1Var.a().b("reverseDirection", Boolean.valueOf(this.f57791z));
            c1Var.a().b("interactionSource", this.A);
            c1Var.a().b("startDragImmediately", this.B);
            c1Var.a().b("onDragStarted", this.C);
            c1Var.a().b("onDragStopped", this.D);
            c1Var.a().b("stateFactory", this.E);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(c1 c1Var) {
            a(c1Var);
            return wn.v.f59242a;
        }
    }

    @co.f(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$1", f = "Draggable.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class e extends co.l implements io.q<q0, b1.f, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f57792w;

        public e(ao.d<? super e> dVar) {
            super(3, dVar);
        }

        public final Object a(q0 q0Var, long j10, ao.d<? super wn.v> dVar) {
            return new e(dVar).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            if (this.f57792w == 0) {
                wn.m.b(obj);
                return wn.v.f59242a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ Object s0(q0 q0Var, b1.f fVar, ao.d<? super wn.v> dVar) {
            return a(q0Var, fVar.u(), dVar);
        }
    }

    @co.f(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$2", f = "Draggable.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class f extends co.l implements io.q<q0, Float, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f57793w;

        public f(ao.d<? super f> dVar) {
            super(3, dVar);
        }

        public final Object a(q0 q0Var, float f10, ao.d<? super wn.v> dVar) {
            return new f(dVar).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            if (this.f57793w == 0) {
                wn.m.b(obj);
                return wn.v.f59242a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ Object s0(q0 q0Var, Float f10, ao.d<? super wn.v> dVar) {
            return a(q0Var, f10.floatValue(), dVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends jo.q implements io.p<l0.i, Integer, s> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ w.l f57794w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(w.l lVar) {
            super(2);
            this.f57794w = lVar;
        }

        public final s a(l0.i iVar, int i10) {
            iVar.x(830271906);
            w.l lVar = this.f57794w;
            iVar.x(1157296644);
            boolean P = iVar.P(lVar);
            Object y10 = iVar.y();
            if (P || y10 == l0.i.f39065a.a()) {
                y10 = new o(lVar);
                iVar.q(y10);
            }
            iVar.O();
            o oVar = (o) y10;
            iVar.O();
            return oVar;
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ s invoke(l0.i iVar, Integer num) {
            return a(iVar, num.intValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends jo.q implements io.l<n1.w, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public static final h f57795w = new h();

        public h() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(n1.w wVar) {
            jo.p.h(wVar, "it");
            return Boolean.TRUE;
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends jo.q implements io.a<Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ boolean f57796w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(boolean z10) {
            super(0);
            this.f57796w = z10;
        }

        @Override // io.a
        /* renamed from: a */
        public final Boolean invoke() {
            return Boolean.valueOf(this.f57796w);
        }
    }

    @co.f(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$6", f = "Draggable.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class j extends co.l implements io.q<q0, b1.f, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f57797w;

        public j(ao.d<? super j> dVar) {
            super(3, dVar);
        }

        public final Object a(q0 q0Var, long j10, ao.d<? super wn.v> dVar) {
            return new j(dVar).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            if (this.f57797w == 0) {
                wn.m.b(obj);
                return wn.v.f59242a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ Object s0(q0 q0Var, b1.f fVar, ao.d<? super wn.v> dVar) {
            return a(q0Var, fVar.u(), dVar);
        }
    }

    @co.f(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$7", f = "Draggable.kt", l = {}, m = "invokeSuspend")
    /* renamed from: w.k$k  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0946k extends co.l implements io.q<q0, Float, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f57798w;

        public C0946k(ao.d<? super C0946k> dVar) {
            super(3, dVar);
        }

        public final Object a(q0 q0Var, float f10, ao.d<? super wn.v> dVar) {
            return new C0946k(dVar).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            if (this.f57798w == 0) {
                wn.m.b(obj);
                return wn.v.f59242a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ Object s0(q0 q0Var, Float f10, ao.d<? super wn.v> dVar) {
            return a(q0Var, f10.floatValue(), dVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class l extends jo.q implements io.q<x0.f, l0.i, Integer, x0.f> {
        public final /* synthetic */ io.q<q0, b1.f, ao.d<? super wn.v>, Object> A;
        public final /* synthetic */ io.q<q0, Float, ao.d<? super wn.v>, Object> B;
        public final /* synthetic */ q C;
        public final /* synthetic */ boolean D;
        public final /* synthetic */ boolean E;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.p<l0.i, Integer, s> f57799w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ x.m f57800x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a<Boolean> f57801y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ io.l<n1.w, Boolean> f57802z;

        /* loaded from: classes.dex */
        public static final class a extends jo.q implements io.l<l0.a0, l0.z> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ s0<x.b> f57803w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ x.m f57804x;

            /* renamed from: w.k$l$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0947a implements l0.z {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ s0 f57805a;

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ x.m f57806b;

                public C0947a(s0 s0Var, x.m mVar) {
                    this.f57805a = s0Var;
                    this.f57806b = mVar;
                }

                @Override // l0.z
                public void dispose() {
                    x.b bVar = (x.b) this.f57805a.getValue();
                    if (bVar != null) {
                        x.m mVar = this.f57806b;
                        if (mVar != null) {
                            mVar.a(new x.a(bVar));
                        }
                        this.f57805a.setValue(null);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(s0<x.b> s0Var, x.m mVar) {
                super(1);
                this.f57803w = s0Var;
                this.f57804x = mVar;
            }

            @Override // io.l
            /* renamed from: a */
            public final l0.z invoke(l0.a0 a0Var) {
                jo.p.h(a0Var, "$this$DisposableEffect");
                return new C0947a(this.f57803w, this.f57804x);
            }
        }

        @co.f(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$2", f = "Draggable.kt", l = {237, 239, 241, 251, 253, TsExtractor.TS_STREAM_TYPE_AIT}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class b extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {
            public final /* synthetic */ wo.i<w.g> A;
            public final /* synthetic */ s B;
            public final /* synthetic */ c2<w.i> C;

            /* renamed from: w  reason: collision with root package name */
            public Object f57807w;

            /* renamed from: x  reason: collision with root package name */
            public Object f57808x;

            /* renamed from: y  reason: collision with root package name */
            public int f57809y;

            /* renamed from: z  reason: collision with root package name */
            public /* synthetic */ Object f57810z;

            @co.f(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$2$2", f = "Draggable.kt", l = {246}, m = "invokeSuspend")
            /* loaded from: classes.dex */
            public static final class a extends co.l implements io.p<r, ao.d<? super wn.v>, Object> {
                public final /* synthetic */ wo.i<w.g> A;

                /* renamed from: w  reason: collision with root package name */
                public Object f57811w;

                /* renamed from: x  reason: collision with root package name */
                public int f57812x;

                /* renamed from: y  reason: collision with root package name */
                public /* synthetic */ Object f57813y;

                /* renamed from: z  reason: collision with root package name */
                public final /* synthetic */ jo.e0<w.g> f57814z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(jo.e0<w.g> e0Var, wo.i<w.g> iVar, ao.d<? super a> dVar) {
                    super(2, dVar);
                    this.f57814z = e0Var;
                    this.A = iVar;
                }

                @Override // io.p
                /* renamed from: a */
                public final Object invoke(r rVar, ao.d<? super wn.v> dVar) {
                    return ((a) create(rVar, dVar)).invokeSuspend(wn.v.f59242a);
                }

                @Override // co.a
                public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                    a aVar = new a(this.f57814z, this.A, dVar);
                    aVar.f57813y = obj;
                    return aVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x005e -> B:23:0x0064). Please submit an issue!!! */
                @Override // co.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                    /*
                        r8 = this;
                        java.lang.Object r0 = bo.c.c()
                        int r1 = r8.f57812x
                        r2 = 1
                        if (r1 == 0) goto L23
                        if (r1 != r2) goto L1b
                        java.lang.Object r1 = r8.f57811w
                        jo.e0 r1 = (jo.e0) r1
                        java.lang.Object r3 = r8.f57813y
                        w.r r3 = (w.r) r3
                        wn.m.b(r9)
                        r4 = r3
                        r3 = r1
                        r1 = r0
                        r0 = r8
                        goto L64
                    L1b:
                        java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r9.<init>(r0)
                        throw r9
                    L23:
                        wn.m.b(r9)
                        java.lang.Object r9 = r8.f57813y
                        w.r r9 = (w.r) r9
                        r3 = r9
                        r9 = r8
                    L2c:
                        jo.e0<w.g> r1 = r9.f57814z
                        T r1 = r1.f38136w
                        boolean r4 = r1 instanceof w.g.d
                        if (r4 != 0) goto L6a
                        boolean r4 = r1 instanceof w.g.a
                        if (r4 != 0) goto L6a
                        boolean r4 = r1 instanceof w.g.b
                        if (r4 == 0) goto L3f
                        w.g$b r1 = (w.g.b) r1
                        goto L40
                    L3f:
                        r1 = 0
                    L40:
                        if (r1 == 0) goto L4d
                        float r4 = r1.a()
                        long r5 = r1.b()
                        r3.b(r4, r5)
                    L4d:
                        jo.e0<w.g> r1 = r9.f57814z
                        wo.i<w.g> r4 = r9.A
                        r9.f57813y = r3
                        r9.f57811w = r1
                        r9.f57812x = r2
                        java.lang.Object r4 = r4.b(r9)
                        if (r4 != r0) goto L5e
                        return r0
                    L5e:
                        r7 = r0
                        r0 = r9
                        r9 = r4
                        r4 = r3
                        r3 = r1
                        r1 = r7
                    L64:
                        r3.f38136w = r9
                        r9 = r0
                        r0 = r1
                        r3 = r4
                        goto L2c
                    L6a:
                        wn.v r9 = wn.v.f59242a
                        return r9
                    */
                    throw new UnsupportedOperationException("Method not decompiled: w.k.l.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(wo.i<w.g> iVar, s sVar, c2<w.i> c2Var, ao.d<? super b> dVar) {
                super(2, dVar);
                this.A = iVar;
                this.B = sVar;
                this.C = c2Var;
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                b bVar = new b(this.A, this.B, this.C, dVar);
                bVar.f57810z = obj;
                return bVar;
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
                return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x0092  */
            /* JADX WARN: Removed duplicated region for block: B:36:0x00c5 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:37:0x00c6  */
            /* JADX WARN: Removed duplicated region for block: B:40:0x00d4 A[Catch: CancellationException -> 0x0100, TryCatch #0 {CancellationException -> 0x0100, blocks: (B:38:0x00c8, B:40:0x00d4, B:45:0x00ea, B:47:0x00ee), top: B:61:0x00c8 }] */
            /* JADX WARN: Removed duplicated region for block: B:45:0x00ea A[Catch: CancellationException -> 0x0100, TryCatch #0 {CancellationException -> 0x0100, blocks: (B:38:0x00c8, B:40:0x00d4, B:45:0x00ea, B:47:0x00ee), top: B:61:0x00c8 }] */
            /* JADX WARN: Removed duplicated region for block: B:55:0x0117 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:56:0x0118  */
            /* JADX WARN: Removed duplicated region for block: B:57:0x011c  */
            /* JADX WARN: Removed duplicated region for block: B:58:0x0120  */
            /* JADX WARN: Type inference failed for: r10v12, types: [T] */
            /* JADX WARN: Type inference failed for: r10v21 */
            /* JADX WARN: Type inference failed for: r10v29 */
            /* JADX WARN: Type inference failed for: r1v0, types: [int] */
            /* JADX WARN: Type inference failed for: r1v1 */
            /* JADX WARN: Type inference failed for: r1v2 */
            /* JADX WARN: Type inference failed for: r1v35 */
            /* JADX WARN: Type inference failed for: r1v43 */
            /* JADX WARN: Type inference failed for: r1v44 */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00e5 -> B:22:0x0067). Please submit an issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00fc -> B:22:0x0067). Please submit an issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0118 -> B:22:0x0067). Please submit an issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x011c -> B:22:0x0067). Please submit an issue!!! */
            @Override // co.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                /*
                    Method dump skipped, instructions count: 310
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: w.k.l.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @co.f(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$3", f = "Draggable.kt", l = {263}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class c extends co.l implements io.p<n1.e0, ao.d<? super wn.v>, Object> {
            public final /* synthetic */ c2<io.a<Boolean>> A;
            public final /* synthetic */ q B;
            public final /* synthetic */ wo.i<w.g> C;
            public final /* synthetic */ boolean D;

            /* renamed from: w  reason: collision with root package name */
            public int f57815w;

            /* renamed from: x  reason: collision with root package name */
            public /* synthetic */ Object f57816x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ boolean f57817y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ c2<io.l<n1.w, Boolean>> f57818z;

            @co.f(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1", f = "Draggable.kt", l = {265}, m = "invokeSuspend")
            /* loaded from: classes.dex */
            public static final class a extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {
                public final /* synthetic */ c2<io.a<Boolean>> A;
                public final /* synthetic */ q B;
                public final /* synthetic */ wo.i<w.g> C;
                public final /* synthetic */ boolean D;

                /* renamed from: w  reason: collision with root package name */
                public int f57819w;

                /* renamed from: x  reason: collision with root package name */
                public /* synthetic */ Object f57820x;

                /* renamed from: y  reason: collision with root package name */
                public final /* synthetic */ n1.e0 f57821y;

                /* renamed from: z  reason: collision with root package name */
                public final /* synthetic */ c2<io.l<n1.w, Boolean>> f57822z;

                @co.f(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1$1", f = "Draggable.kt", l = {268, 276}, m = "invokeSuspend")
                /* renamed from: w.k$l$c$a$a  reason: collision with other inner class name */
                /* loaded from: classes.dex */
                public static final class C0948a extends co.k implements io.p<n1.c, ao.d<? super wn.v>, Object> {
                    public Object A;
                    public boolean B;
                    public int C;
                    public int D;
                    public /* synthetic */ Object E;
                    public final /* synthetic */ q0 F;
                    public final /* synthetic */ c2<io.l<n1.w, Boolean>> G;
                    public final /* synthetic */ c2<io.a<Boolean>> H;
                    public final /* synthetic */ q I;
                    public final /* synthetic */ wo.i<w.g> J;
                    public final /* synthetic */ boolean K;

                    /* renamed from: x  reason: collision with root package name */
                    public Object f57823x;

                    /* renamed from: y  reason: collision with root package name */
                    public Object f57824y;

                    /* renamed from: z  reason: collision with root package name */
                    public Object f57825z;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0948a(q0 q0Var, c2<? extends io.l<? super n1.w, Boolean>> c2Var, c2<? extends io.a<Boolean>> c2Var2, q qVar, wo.i<w.g> iVar, boolean z10, ao.d<? super C0948a> dVar) {
                        super(2, dVar);
                        this.F = q0Var;
                        this.G = c2Var;
                        this.H = c2Var2;
                        this.I = qVar;
                        this.J = iVar;
                        this.K = z10;
                    }

                    @Override // io.p
                    /* renamed from: a */
                    public final Object invoke(n1.c cVar, ao.d<? super wn.v> dVar) {
                        return ((C0948a) create(cVar, dVar)).invokeSuspend(wn.v.f59242a);
                    }

                    @Override // co.a
                    public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                        C0948a c0948a = new C0948a(this.F, this.G, this.H, this.I, this.J, this.K, dVar);
                        c0948a.E = obj;
                        return c0948a;
                    }

                    /* JADX WARN: Can't wrap try/catch for region: R(8:27|(1:29)(1:64)|30|31|32|33|34|(1:36)(8:37|9|10|(0)(0)|16|17|18|(2:66|67)(0))) */
                    /* JADX WARN: Can't wrap try/catch for region: R(9:5|(3:6|7|8)|9|10|(3:12|(1:14)(1:68)|15)(1:69)|16|17|18|(2:20|(1:22)(3:24|25|(8:27|(1:29)(1:64)|30|31|32|33|34|(1:36)(8:37|9|10|(0)(0)|16|17|18|(2:66|67)(0)))(3:65|18|(0)(0))))(0)) */
                    /* JADX WARN: Code restructure failed: missing block: B:44:0x00fa, code lost:
                        r0 = e;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:46:0x00fc, code lost:
                        r0 = th;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:48:0x00fe, code lost:
                        r0 = e;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ff, code lost:
                        r14 = r2;
                        r11 = r7;
                        r2 = r15;
                        r9 = r10;
                        r10 = r17;
                        r8 = r18;
                        r13 = r19;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:50:0x010b, code lost:
                        r0 = th;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:51:0x010c, code lost:
                        r17 = r11;
                        r18 = r12;
                        r20 = r14;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:52:0x0112, code lost:
                        r11 = r7;
                        r10 = r17;
                        r8 = r18;
                        r12 = r20;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:53:0x011a, code lost:
                        r0 = e;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:54:0x011b, code lost:
                        r20 = r14;
                        r14 = r2;
                        r11 = r7;
                        r2 = r15;
                        r9 = r10;
                        r10 = r11;
                        r8 = r12;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:55:0x012e, code lost:
                        r12 = r20;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
                    /* JADX WARN: Removed duplicated region for block: B:25:0x0093  */
                    /* JADX WARN: Removed duplicated region for block: B:37:0x00df  */
                    /* JADX WARN: Removed duplicated region for block: B:42:0x00f4  */
                    /* JADX WARN: Removed duplicated region for block: B:58:0x0136  */
                    /* JADX WARN: Removed duplicated region for block: B:60:0x013f A[Catch: all -> 0x0140, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0140, blocks: (B:56:0x0130, B:60:0x013f), top: B:73:0x0130 }] */
                    /* JADX WARN: Removed duplicated region for block: B:63:0x0143  */
                    /* JADX WARN: Removed duplicated region for block: B:67:0x0156  */
                    /* JADX WARN: Removed duplicated region for block: B:70:0x015c  */
                    /* JADX WARN: Removed duplicated region for block: B:71:0x0162  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00c9 -> B:78:0x00d7). Please submit an issue!!! */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0136 -> B:59:0x013b). Please submit an issue!!! */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x015c -> B:17:0x0062). Please submit an issue!!! */
                    @Override // co.a
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
                        /*
                            Method dump skipped, instructions count: 357
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: w.k.l.c.a.C0948a.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public a(n1.e0 e0Var, c2<? extends io.l<? super n1.w, Boolean>> c2Var, c2<? extends io.a<Boolean>> c2Var2, q qVar, wo.i<w.g> iVar, boolean z10, ao.d<? super a> dVar) {
                    super(2, dVar);
                    this.f57821y = e0Var;
                    this.f57822z = c2Var;
                    this.A = c2Var2;
                    this.B = qVar;
                    this.C = iVar;
                    this.D = z10;
                }

                @Override // co.a
                public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                    a aVar = new a(this.f57821y, this.f57822z, this.A, this.B, this.C, this.D, dVar);
                    aVar.f57820x = obj;
                    return aVar;
                }

                @Override // io.p
                public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
                    return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
                }

                /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
                @Override // co.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r14) {
                    /*
                        r13 = this;
                        java.lang.Object r0 = bo.c.c()
                        int r1 = r13.f57819w
                        r2 = 1
                        if (r1 == 0) goto L1d
                        if (r1 != r2) goto L15
                        java.lang.Object r0 = r13.f57820x
                        uo.q0 r0 = (uo.q0) r0
                        wn.m.b(r14)     // Catch: java.util.concurrent.CancellationException -> L13
                        goto L4d
                    L13:
                        r14 = move-exception
                        goto L47
                    L15:
                        java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r14.<init>(r0)
                        throw r14
                    L1d:
                        wn.m.b(r14)
                        java.lang.Object r14 = r13.f57820x
                        uo.q0 r14 = (uo.q0) r14
                        n1.e0 r1 = r13.f57821y     // Catch: java.util.concurrent.CancellationException -> L43
                        w.k$l$c$a$a r11 = new w.k$l$c$a$a     // Catch: java.util.concurrent.CancellationException -> L43
                        l0.c2<io.l<n1.w, java.lang.Boolean>> r5 = r13.f57822z     // Catch: java.util.concurrent.CancellationException -> L43
                        l0.c2<io.a<java.lang.Boolean>> r6 = r13.A     // Catch: java.util.concurrent.CancellationException -> L43
                        w.q r7 = r13.B     // Catch: java.util.concurrent.CancellationException -> L43
                        wo.i<w.g> r8 = r13.C     // Catch: java.util.concurrent.CancellationException -> L43
                        boolean r9 = r13.D     // Catch: java.util.concurrent.CancellationException -> L43
                        r10 = 0
                        r3 = r11
                        r4 = r14
                        r3.<init>(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.util.concurrent.CancellationException -> L43
                        r13.f57820x = r14     // Catch: java.util.concurrent.CancellationException -> L43
                        r13.f57819w = r2     // Catch: java.util.concurrent.CancellationException -> L43
                        java.lang.Object r14 = r1.N(r11, r13)     // Catch: java.util.concurrent.CancellationException -> L43
                        if (r14 != r0) goto L4d
                        return r0
                    L43:
                        r0 = move-exception
                        r12 = r0
                        r0 = r14
                        r14 = r12
                    L47:
                        boolean r0 = uo.r0.g(r0)
                        if (r0 == 0) goto L50
                    L4d:
                        wn.v r14 = wn.v.f59242a
                        return r14
                    L50:
                        throw r14
                    */
                    throw new UnsupportedOperationException("Method not decompiled: w.k.l.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public c(boolean z10, c2<? extends io.l<? super n1.w, Boolean>> c2Var, c2<? extends io.a<Boolean>> c2Var2, q qVar, wo.i<w.g> iVar, boolean z11, ao.d<? super c> dVar) {
                super(2, dVar);
                this.f57817y = z10;
                this.f57818z = c2Var;
                this.A = c2Var2;
                this.B = qVar;
                this.C = iVar;
                this.D = z11;
            }

            @Override // io.p
            /* renamed from: a */
            public final Object invoke(n1.e0 e0Var, ao.d<? super wn.v> dVar) {
                return ((c) create(e0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                c cVar = new c(this.f57817y, this.f57818z, this.A, this.B, this.C, this.D, dVar);
                cVar.f57816x = obj;
                return cVar;
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f57815w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    n1.e0 e0Var = (n1.e0) this.f57816x;
                    if (!this.f57817y) {
                        return wn.v.f59242a;
                    }
                    a aVar = new a(e0Var, this.f57818z, this.A, this.B, this.C, this.D, null);
                    this.f57815w = 1;
                    if (r0.e(aVar, this) == c10) {
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
        public l(io.p<? super l0.i, ? super Integer, ? extends s> pVar, x.m mVar, io.a<Boolean> aVar, io.l<? super n1.w, Boolean> lVar, io.q<? super q0, ? super b1.f, ? super ao.d<? super wn.v>, ? extends Object> qVar, io.q<? super q0, ? super Float, ? super ao.d<? super wn.v>, ? extends Object> qVar2, q qVar3, boolean z10, boolean z11) {
            super(3);
            this.f57799w = pVar;
            this.f57800x = mVar;
            this.f57801y = aVar;
            this.f57802z = lVar;
            this.A = qVar;
            this.B = qVar2;
            this.C = qVar3;
            this.D = z10;
            this.E = z11;
        }

        public static final w.i c(c2<w.i> c2Var) {
            return c2Var.getValue();
        }

        public final x0.f b(x0.f fVar, l0.i iVar, int i10) {
            jo.p.h(fVar, "$this$composed");
            iVar.x(-1487259950);
            s invoke = this.f57799w.invoke(iVar, 0);
            iVar.x(-492369756);
            Object y10 = iVar.y();
            i.a aVar = l0.i.f39065a;
            if (y10 == aVar.a()) {
                y10 = z1.e(null, null, 2, null);
                iVar.q(y10);
            }
            iVar.O();
            s0 s0Var = (s0) y10;
            x.m mVar = this.f57800x;
            l0.c0.a(mVar, new a(s0Var, mVar), iVar, 0);
            iVar.x(-492369756);
            Object y11 = iVar.y();
            if (y11 == aVar.a()) {
                y11 = wo.l.b(Integer.MAX_VALUE, null, null, 6, null);
                iVar.q(y11);
            }
            iVar.O();
            wo.i iVar2 = (wo.i) y11;
            c2 l10 = u1.l(this.f57801y, iVar, 0);
            c2 l11 = u1.l(this.f57802z, iVar, 0);
            l0.c0.c(invoke, new b(iVar2, invoke, u1.l(new w.i(this.A, this.B, s0Var, this.f57800x), iVar, 0), null), iVar, 0);
            x0.f d10 = o0.d(x0.f.f59359u, new Object[]{this.C, Boolean.valueOf(this.D), Boolean.valueOf(this.E)}, new c(this.D, l11, l10, this.C, iVar2, this.E, null));
            iVar.O();
            return d10;
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ x0.f s0(x0.f fVar, l0.i iVar, Integer num) {
            return b(fVar, iVar, num.intValue());
        }
    }

    public static final w.l a(io.l<? super Float, wn.v> lVar) {
        jo.p.h(lVar, "onDelta");
        return new w.d(lVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object f(n1.c r9, l0.c2<? extends io.l<? super n1.w, java.lang.Boolean>> r10, l0.c2<? extends io.a<java.lang.Boolean>> r11, o1.g r12, w.q r13, ao.d<? super wn.k<n1.w, java.lang.Float>> r14) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w.k.f(n1.c, l0.c2, l0.c2, o1.g, w.q, ao.d):java.lang.Object");
    }

    public static final Object g(n1.c cVar, wn.k<n1.w, Float> kVar, o1.g gVar, wo.b0<? super w.g> b0Var, boolean z10, q qVar, ao.d<? super Boolean> dVar) {
        float floatValue = kVar.d().floatValue();
        n1.w c10 = kVar.c();
        long q10 = b1.f.q(c10.f(), b1.f.s(n(floatValue, qVar), Math.signum(l(c10.f(), qVar))));
        b0Var.l(new g.c(q10, null));
        if (z10) {
            floatValue *= -1;
        }
        b0Var.l(new g.b(floatValue, q10, null));
        c cVar2 = new c(gVar, qVar, b0Var, z10);
        if (qVar == q.Vertical) {
            return w.h.n(cVar, c10.e(), cVar2, dVar);
        }
        return w.h.k(cVar, c10.e(), cVar2, dVar);
    }

    public static final x0.f h(x0.f fVar, io.p<? super l0.i, ? super Integer, ? extends s> pVar, io.l<? super n1.w, Boolean> lVar, q qVar, boolean z10, x.m mVar, io.a<Boolean> aVar, io.q<? super q0, ? super b1.f, ? super ao.d<? super wn.v>, ? extends Object> qVar2, io.q<? super q0, ? super Float, ? super ao.d<? super wn.v>, ? extends Object> qVar3, boolean z11) {
        jo.p.h(fVar, "<this>");
        jo.p.h(pVar, "stateFactory");
        jo.p.h(lVar, "canDrag");
        jo.p.h(qVar, "orientation");
        jo.p.h(aVar, "startDragImmediately");
        jo.p.h(qVar2, "onDragStarted");
        jo.p.h(qVar3, "onDragStopped");
        return x0.e.c(fVar, a1.c() ? new d(lVar, qVar, z10, z11, mVar, aVar, qVar2, qVar3, pVar) : a1.a(), new l(pVar, mVar, aVar, lVar, qVar2, qVar3, qVar, z10, z11));
    }

    public static final x0.f i(x0.f fVar, w.l lVar, q qVar, boolean z10, x.m mVar, boolean z11, io.q<? super q0, ? super b1.f, ? super ao.d<? super wn.v>, ? extends Object> qVar2, io.q<? super q0, ? super Float, ? super ao.d<? super wn.v>, ? extends Object> qVar3, boolean z12) {
        jo.p.h(fVar, "<this>");
        jo.p.h(lVar, "state");
        jo.p.h(qVar, "orientation");
        jo.p.h(qVar2, "onDragStarted");
        jo.p.h(qVar3, "onDragStopped");
        return h(fVar, new g(lVar), h.f57795w, qVar, z10, mVar, new i(z11), qVar2, qVar3, z12);
    }

    public static final float l(long j10, q qVar) {
        return qVar == q.Vertical ? b1.f.n(j10) : b1.f.m(j10);
    }

    public static final float m(long j10, q qVar) {
        return qVar == q.Vertical ? m2.u.i(j10) : m2.u.h(j10);
    }

    public static final long n(float f10, q qVar) {
        return qVar == q.Vertical ? b1.g.a(0.0f, f10) : b1.g.a(f10, 0.0f);
    }
}
