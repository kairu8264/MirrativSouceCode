package w;

import androidx.compose.ui.platform.g2;
import java.util.List;
import n1.j0;
import uo.q0;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final float f57701a;

    /* renamed from: b  reason: collision with root package name */
    public static final float f57702b;

    /* renamed from: c  reason: collision with root package name */
    public static final float f57703c;

    @co.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {823}, m = "awaitDragOrCancellation-rnUCldI")
    /* loaded from: classes.dex */
    public static final class a extends co.d {

        /* renamed from: w  reason: collision with root package name */
        public Object f57704w;

        /* renamed from: x  reason: collision with root package name */
        public Object f57705x;

        /* renamed from: y  reason: collision with root package name */
        public /* synthetic */ Object f57706y;

        /* renamed from: z  reason: collision with root package name */
        public int f57707z;

        public a(ao.d<? super a> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f57706y = obj;
            this.f57707z |= Integer.MIN_VALUE;
            return h.c(null, 0L, this);
        }
    }

    @co.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {829, 867}, m = "awaitHorizontalPointerSlopOrCancellation-gDDlDlE")
    /* loaded from: classes.dex */
    public static final class b extends co.d {
        public float A;
        public float B;
        public /* synthetic */ Object C;
        public int D;

        /* renamed from: w  reason: collision with root package name */
        public Object f57708w;

        /* renamed from: x  reason: collision with root package name */
        public Object f57709x;

        /* renamed from: y  reason: collision with root package name */
        public Object f57710y;

        /* renamed from: z  reason: collision with root package name */
        public Object f57711z;

        public b(ao.d<? super b> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.C = obj;
            this.D |= Integer.MIN_VALUE;
            return h.d(null, 0L, 0, null, this);
        }
    }

    @co.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {754}, m = "awaitLongPressOrCancellation")
    /* loaded from: classes.dex */
    public static final class c extends co.d {

        /* renamed from: w  reason: collision with root package name */
        public Object f57712w;

        /* renamed from: x  reason: collision with root package name */
        public Object f57713x;

        /* renamed from: y  reason: collision with root package name */
        public /* synthetic */ Object f57714y;

        /* renamed from: z  reason: collision with root package name */
        public int f57715z;

        public c(ao.d<? super c> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f57714y = obj;
            this.f57715z |= Integer.MIN_VALUE;
            return h.e(null, null, this);
        }
    }

    @co.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2", f = "DragGestureDetector.kt", l = {755}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class d extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f57716w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ n1.e0 f57717x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ jo.e0<n1.w> f57718y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ jo.e0<n1.w> f57719z;

        @co.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2$1", f = "DragGestureDetector.kt", l = {758, 775}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends co.k implements io.p<n1.c, ao.d<? super wn.v>, Object> {
            public /* synthetic */ Object A;
            public final /* synthetic */ jo.e0<n1.w> B;
            public final /* synthetic */ jo.e0<n1.w> C;

            /* renamed from: x  reason: collision with root package name */
            public Object f57720x;

            /* renamed from: y  reason: collision with root package name */
            public int f57721y;

            /* renamed from: z  reason: collision with root package name */
            public int f57722z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(jo.e0<n1.w> e0Var, jo.e0<n1.w> e0Var2, ao.d<? super a> dVar) {
                super(2, dVar);
                this.B = e0Var;
                this.C = e0Var2;
            }

            @Override // io.p
            /* renamed from: a */
            public final Object invoke(n1.c cVar, ao.d<? super wn.v> dVar) {
                return ((a) create(cVar, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                a aVar = new a(this.B, this.C, dVar);
                aVar.A = obj;
                return aVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x0088  */
            /* JADX WARN: Removed duplicated region for block: B:39:0x00b1  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x00c2 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:43:0x00c3  */
            /* JADX WARN: Removed duplicated region for block: B:46:0x00d2  */
            /* JADX WARN: Removed duplicated region for block: B:52:0x00e6  */
            /* JADX WARN: Removed duplicated region for block: B:55:0x00f7  */
            /* JADX WARN: Removed duplicated region for block: B:63:0x012c  */
            /* JADX WARN: Removed duplicated region for block: B:76:0x015e  */
            /* JADX WARN: Removed duplicated region for block: B:78:0x00e3 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:83:0x0079 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:84:0x00ae A[SYNTHETIC] */
            /* JADX WARN: Type inference failed for: r12v6 */
            /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r9v8, types: [T, n1.w] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00c3 -> B:44:0x00c5). Please submit an issue!!! */
            @Override // co.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r18) {
                /*
                    Method dump skipped, instructions count: 353
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: w.h.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(n1.e0 e0Var, jo.e0<n1.w> e0Var2, jo.e0<n1.w> e0Var3, ao.d<? super d> dVar) {
            super(2, dVar);
            this.f57717x = e0Var;
            this.f57718y = e0Var2;
            this.f57719z = e0Var3;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d(this.f57717x, this.f57718y, this.f57719z, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f57716w;
            if (i10 == 0) {
                wn.m.b(obj);
                n1.e0 e0Var = this.f57717x;
                a aVar = new a(this.f57718y, this.f57719z, null);
                this.f57716w = 1;
                if (e0Var.N(aVar, this) == c10) {
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

    @co.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {103, 132}, m = "awaitPointerSlopOrCancellation-gDDlDlE")
    /* loaded from: classes.dex */
    public static final class e extends co.d {
        public long A;
        public float B;
        public /* synthetic */ Object C;
        public int D;

        /* renamed from: w  reason: collision with root package name */
        public Object f57723w;

        /* renamed from: x  reason: collision with root package name */
        public Object f57724x;

        /* renamed from: y  reason: collision with root package name */
        public Object f57725y;

        /* renamed from: z  reason: collision with root package name */
        public Object f57726z;

        public e(ao.d<? super e> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.C = obj;
            this.D |= Integer.MIN_VALUE;
            return h.f(null, 0L, 0, null, this);
        }
    }

    @co.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {829, 867}, m = "awaitVerticalPointerSlopOrCancellation-gDDlDlE")
    /* loaded from: classes.dex */
    public static final class f extends co.d {
        public float A;
        public float B;
        public /* synthetic */ Object C;
        public int D;

        /* renamed from: w  reason: collision with root package name */
        public Object f57727w;

        /* renamed from: x  reason: collision with root package name */
        public Object f57728x;

        /* renamed from: y  reason: collision with root package name */
        public Object f57729y;

        /* renamed from: z  reason: collision with root package name */
        public Object f57730z;

        public f(ao.d<? super f> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.C = obj;
            this.D |= Integer.MIN_VALUE;
            return h.g(null, 0L, 0, null, this);
        }
    }

    @co.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5", f = "DragGestureDetector.kt", l = {224}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class g extends co.l implements io.p<n1.e0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ io.a<wn.v> A;
        public final /* synthetic */ io.a<wn.v> B;

        /* renamed from: w  reason: collision with root package name */
        public int f57731w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f57732x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.l<b1.f, wn.v> f57733y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ io.p<n1.w, b1.f, wn.v> f57734z;

        @co.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5$1", f = "DragGestureDetector.kt", l = {225, 229, 241}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends co.k implements io.p<n1.c, ao.d<? super wn.v>, Object> {
            public /* synthetic */ Object A;
            public final /* synthetic */ io.l<b1.f, wn.v> B;
            public final /* synthetic */ io.p<n1.w, b1.f, wn.v> C;
            public final /* synthetic */ io.a<wn.v> D;
            public final /* synthetic */ io.a<wn.v> E;

            /* renamed from: x  reason: collision with root package name */
            public Object f57735x;

            /* renamed from: y  reason: collision with root package name */
            public Object f57736y;

            /* renamed from: z  reason: collision with root package name */
            public int f57737z;

            /* renamed from: w.h$g$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0943a extends jo.q implements io.p<n1.w, b1.f, wn.v> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ jo.d0 f57738w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0943a(jo.d0 d0Var) {
                    super(2);
                    this.f57738w = d0Var;
                }

                public final void a(n1.w wVar, long j10) {
                    jo.p.h(wVar, "change");
                    wVar.a();
                    this.f57738w.f38135w = j10;
                }

                @Override // io.p
                public /* bridge */ /* synthetic */ wn.v invoke(n1.w wVar, b1.f fVar) {
                    a(wVar, fVar.u());
                    return wn.v.f59242a;
                }
            }

            /* loaded from: classes.dex */
            public static final class b extends jo.q implements io.l<n1.w, wn.v> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ io.p<n1.w, b1.f, wn.v> f57739w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public b(io.p<? super n1.w, ? super b1.f, wn.v> pVar) {
                    super(1);
                    this.f57739w = pVar;
                }

                public final void a(n1.w wVar) {
                    jo.p.h(wVar, "it");
                    this.f57739w.invoke(wVar, b1.f.d(n1.n.g(wVar)));
                    wVar.a();
                }

                @Override // io.l
                public /* bridge */ /* synthetic */ wn.v invoke(n1.w wVar) {
                    a(wVar);
                    return wn.v.f59242a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(io.l<? super b1.f, wn.v> lVar, io.p<? super n1.w, ? super b1.f, wn.v> pVar, io.a<wn.v> aVar, io.a<wn.v> aVar2, ao.d<? super a> dVar) {
                super(2, dVar);
                this.B = lVar;
                this.C = pVar;
                this.D = aVar;
                this.E = aVar2;
            }

            @Override // io.p
            /* renamed from: a */
            public final Object invoke(n1.c cVar, ao.d<? super wn.v> dVar) {
                return ((a) create(cVar, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                a aVar = new a(this.B, this.C, this.D, this.E, dVar);
                aVar.A = obj;
                return aVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:18:0x007d A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:19:0x007e  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x0090  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x00cb  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x00d1  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x007e -> B:20:0x0081). Please submit an issue!!! */
            @Override // co.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r14) {
                /*
                    Method dump skipped, instructions count: 217
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: w.h.g.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(io.l<? super b1.f, wn.v> lVar, io.p<? super n1.w, ? super b1.f, wn.v> pVar, io.a<wn.v> aVar, io.a<wn.v> aVar2, ao.d<? super g> dVar) {
            super(2, dVar);
            this.f57733y = lVar;
            this.f57734z = pVar;
            this.A = aVar;
            this.B = aVar2;
        }

        @Override // io.p
        /* renamed from: a */
        public final Object invoke(n1.e0 e0Var, ao.d<? super wn.v> dVar) {
            return ((g) create(e0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            g gVar = new g(this.f57733y, this.f57734z, this.A, this.B, dVar);
            gVar.f57732x = obj;
            return gVar;
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f57731w;
            if (i10 == 0) {
                wn.m.b(obj);
                a aVar = new a(this.f57733y, this.f57734z, this.A, this.B, null);
                this.f57731w = 1;
                if (((n1.e0) this.f57732x).N(aVar, this) == c10) {
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

    @co.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5", f = "DragGestureDetector.kt", l = {276, 280, 284}, m = "invokeSuspend")
    /* renamed from: w.h$h  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0944h extends co.l implements io.p<n1.e0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ io.a<wn.v> A;
        public final /* synthetic */ io.p<n1.w, b1.f, wn.v> B;

        /* renamed from: w  reason: collision with root package name */
        public int f57740w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f57741x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.l<b1.f, wn.v> f57742y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f57743z;

        @co.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$1", f = "DragGestureDetector.kt", l = {286}, m = "invokeSuspend")
        /* renamed from: w.h$h$a */
        /* loaded from: classes.dex */
        public static final class a extends co.k implements io.p<n1.c, ao.d<? super wn.v>, Object> {
            public final /* synthetic */ io.a<wn.v> A;
            public final /* synthetic */ io.a<wn.v> B;
            public final /* synthetic */ io.p<n1.w, b1.f, wn.v> C;

            /* renamed from: x  reason: collision with root package name */
            public int f57744x;

            /* renamed from: y  reason: collision with root package name */
            public /* synthetic */ Object f57745y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ n1.w f57746z;

            /* renamed from: w.h$h$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0945a extends jo.q implements io.l<n1.w, wn.v> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ io.p<n1.w, b1.f, wn.v> f57747w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0945a(io.p<? super n1.w, ? super b1.f, wn.v> pVar) {
                    super(1);
                    this.f57747w = pVar;
                }

                public final void a(n1.w wVar) {
                    jo.p.h(wVar, "it");
                    this.f57747w.invoke(wVar, b1.f.d(n1.n.g(wVar)));
                    wVar.a();
                }

                @Override // io.l
                public /* bridge */ /* synthetic */ wn.v invoke(n1.w wVar) {
                    a(wVar);
                    return wn.v.f59242a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(n1.w wVar, io.a<wn.v> aVar, io.a<wn.v> aVar2, io.p<? super n1.w, ? super b1.f, wn.v> pVar, ao.d<? super a> dVar) {
                super(2, dVar);
                this.f57746z = wVar;
                this.A = aVar;
                this.B = aVar2;
                this.C = pVar;
            }

            @Override // io.p
            /* renamed from: a */
            public final Object invoke(n1.c cVar, ao.d<? super wn.v> dVar) {
                return ((a) create(cVar, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                a aVar = new a(this.f57746z, this.A, this.B, this.C, dVar);
                aVar.f57745y = obj;
                return aVar;
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                n1.c cVar;
                Object c10 = bo.c.c();
                int i10 = this.f57744x;
                if (i10 == 0) {
                    wn.m.b(obj);
                    n1.c cVar2 = (n1.c) this.f57745y;
                    long e10 = this.f57746z.e();
                    C0945a c0945a = new C0945a(this.C);
                    this.f57745y = cVar2;
                    this.f57744x = 1;
                    Object j10 = h.j(cVar2, e10, c0945a, this);
                    if (j10 == c10) {
                        return c10;
                    }
                    cVar = cVar2;
                    obj = j10;
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    cVar = (n1.c) this.f57745y;
                    wn.m.b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    List<n1.w> c11 = cVar.o0().c();
                    int size = c11.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        n1.w wVar = c11.get(i11);
                        if (n1.n.c(wVar)) {
                            wVar.a();
                        }
                    }
                    this.A.invoke();
                } else {
                    this.B.invoke();
                }
                return wn.v.f59242a;
            }
        }

        @co.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$down$1", f = "DragGestureDetector.kt", l = {277}, m = "invokeSuspend")
        /* renamed from: w.h$h$b */
        /* loaded from: classes.dex */
        public static final class b extends co.k implements io.p<n1.c, ao.d<? super n1.w>, Object> {

            /* renamed from: x  reason: collision with root package name */
            public int f57748x;

            /* renamed from: y  reason: collision with root package name */
            public /* synthetic */ Object f57749y;

            public b(ao.d<? super b> dVar) {
                super(2, dVar);
            }

            @Override // io.p
            /* renamed from: a */
            public final Object invoke(n1.c cVar, ao.d<? super n1.w> dVar) {
                return ((b) create(cVar, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                b bVar = new b(dVar);
                bVar.f57749y = obj;
                return bVar;
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f57748x;
                if (i10 == 0) {
                    wn.m.b(obj);
                    this.f57748x = 1;
                    obj = e0.d((n1.c) this.f57749y, false, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0944h(io.l<? super b1.f, wn.v> lVar, io.a<wn.v> aVar, io.a<wn.v> aVar2, io.p<? super n1.w, ? super b1.f, wn.v> pVar, ao.d<? super C0944h> dVar) {
            super(2, dVar);
            this.f57742y = lVar;
            this.f57743z = aVar;
            this.A = aVar2;
            this.B = pVar;
        }

        @Override // io.p
        /* renamed from: a */
        public final Object invoke(n1.e0 e0Var, ao.d<? super wn.v> dVar) {
            return ((C0944h) create(e0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            C0944h c0944h = new C0944h(this.f57742y, this.f57743z, this.A, this.B, dVar);
            c0944h.f57741x = obj;
            return c0944h;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x005d A[Catch: CancellationException -> 0x0017, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0017, blocks: (B:7:0x0012, B:14:0x0025, B:25:0x0058, B:27:0x005d, B:22:0x004d), top: B:34:0x000a }] */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r11.f57740w
                r2 = 0
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L31
                if (r1 == r5) goto L29
                if (r1 == r4) goto L21
                if (r1 != r3) goto L19
                wn.m.b(r12)     // Catch: java.util.concurrent.CancellationException -> L17
                goto L82
            L17:
                r12 = move-exception
                goto L85
            L19:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L21:
                java.lang.Object r1 = r11.f57741x
                n1.e0 r1 = (n1.e0) r1
                wn.m.b(r12)     // Catch: java.util.concurrent.CancellationException -> L17
                goto L58
            L29:
                java.lang.Object r1 = r11.f57741x
                n1.e0 r1 = (n1.e0) r1
                wn.m.b(r12)
                goto L4b
            L31:
                wn.m.b(r12)
                java.lang.Object r12 = r11.f57741x
                n1.e0 r12 = (n1.e0) r12
                w.h$h$b r1 = new w.h$h$b
                r1.<init>(r2)
                r11.f57741x = r12
                r11.f57740w = r5
                java.lang.Object r1 = r12.N(r1, r11)
                if (r1 != r0) goto L48
                return r0
            L48:
                r10 = r1
                r1 = r12
                r12 = r10
            L4b:
                n1.w r12 = (n1.w) r12
                r11.f57741x = r1     // Catch: java.util.concurrent.CancellationException -> L17
                r11.f57740w = r4     // Catch: java.util.concurrent.CancellationException -> L17
                java.lang.Object r12 = w.h.a(r1, r12, r11)     // Catch: java.util.concurrent.CancellationException -> L17
                if (r12 != r0) goto L58
                return r0
            L58:
                r5 = r12
                n1.w r5 = (n1.w) r5     // Catch: java.util.concurrent.CancellationException -> L17
                if (r5 == 0) goto L82
                io.l<b1.f, wn.v> r12 = r11.f57742y     // Catch: java.util.concurrent.CancellationException -> L17
                long r6 = r5.f()     // Catch: java.util.concurrent.CancellationException -> L17
                b1.f r4 = b1.f.d(r6)     // Catch: java.util.concurrent.CancellationException -> L17
                r12.invoke(r4)     // Catch: java.util.concurrent.CancellationException -> L17
                w.h$h$a r12 = new w.h$h$a     // Catch: java.util.concurrent.CancellationException -> L17
                io.a<wn.v> r6 = r11.A     // Catch: java.util.concurrent.CancellationException -> L17
                io.a<wn.v> r7 = r11.f57743z     // Catch: java.util.concurrent.CancellationException -> L17
                io.p<n1.w, b1.f, wn.v> r8 = r11.B     // Catch: java.util.concurrent.CancellationException -> L17
                r9 = 0
                r4 = r12
                r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.util.concurrent.CancellationException -> L17
                r11.f57741x = r2     // Catch: java.util.concurrent.CancellationException -> L17
                r11.f57740w = r3     // Catch: java.util.concurrent.CancellationException -> L17
                java.lang.Object r12 = r1.N(r12, r11)     // Catch: java.util.concurrent.CancellationException -> L17
                if (r12 != r0) goto L82
                return r0
            L82:
                wn.v r12 = wn.v.f59242a
                return r12
            L85:
                io.a<wn.v> r0 = r11.f57743z
                r0.invoke()
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: w.h.C0944h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {163}, m = "drag-jO51t88")
    /* loaded from: classes.dex */
    public static final class i extends co.d {

        /* renamed from: w  reason: collision with root package name */
        public Object f57750w;

        /* renamed from: x  reason: collision with root package name */
        public Object f57751x;

        /* renamed from: y  reason: collision with root package name */
        public /* synthetic */ Object f57752y;

        /* renamed from: z  reason: collision with root package name */
        public int f57753z;

        public i(ao.d<? super i> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f57752y = obj;
            this.f57753z |= Integer.MIN_VALUE;
            return h.j(null, 0L, null, this);
        }
    }

    @co.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {829}, m = "horizontalDrag-jO51t88")
    /* loaded from: classes.dex */
    public static final class j extends co.d {
        public /* synthetic */ Object A;
        public int B;

        /* renamed from: w  reason: collision with root package name */
        public Object f57754w;

        /* renamed from: x  reason: collision with root package name */
        public Object f57755x;

        /* renamed from: y  reason: collision with root package name */
        public Object f57756y;

        /* renamed from: z  reason: collision with root package name */
        public Object f57757z;

        public j(ao.d<? super j> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.A = obj;
            this.B |= Integer.MIN_VALUE;
            return h.k(null, 0L, null, this);
        }
    }

    @co.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {829}, m = "verticalDrag-jO51t88")
    /* loaded from: classes.dex */
    public static final class k extends co.d {
        public /* synthetic */ Object A;
        public int B;

        /* renamed from: w  reason: collision with root package name */
        public Object f57758w;

        /* renamed from: x  reason: collision with root package name */
        public Object f57759x;

        /* renamed from: y  reason: collision with root package name */
        public Object f57760y;

        /* renamed from: z  reason: collision with root package name */
        public Object f57761z;

        public k(ao.d<? super k> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.A = obj;
            this.B |= Integer.MIN_VALUE;
            return h.n(null, 0L, null, this);
        }
    }

    static {
        float l10 = m2.g.l((float) 0.125d);
        f57701a = l10;
        float l11 = m2.g.l(18);
        f57702b = l11;
        f57703c = l10 / l11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00cb, code lost:
        if (n1.n.j(r11) != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0067 -> B:22:0x006c). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(n1.c r17, long r18, ao.d<? super n1.w> r20) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w.h.c(n1.c, long, ao.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x011c -> B:60:0x0168). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x015b -> B:56:0x015e). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0182 -> B:60:0x0168). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(n1.c r19, long r20, int r22, io.p<? super n1.w, ? super java.lang.Float, wn.v> r23, ao.d<? super n1.w> r24) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w.h.d(n1.c, long, int, io.p, ao.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARN: Type inference failed for: r9v0, types: [T, java.lang.Object, n1.w] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v4, types: [n1.w] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e(n1.e0 r8, n1.w r9, ao.d<? super n1.w> r10) {
        /*
            boolean r0 = r10 instanceof w.h.c
            if (r0 == 0) goto L13
            r0 = r10
            w.h$c r0 = (w.h.c) r0
            int r1 = r0.f57715z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f57715z = r1
            goto L18
        L13:
            w.h$c r0 = new w.h$c
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f57714y
            java.lang.Object r1 = bo.c.c()
            int r2 = r0.f57715z
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            java.lang.Object r8 = r0.f57713x
            jo.e0 r8 = (jo.e0) r8
            java.lang.Object r9 = r0.f57712w
            n1.w r9 = (n1.w) r9
            wn.m.b(r10)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L64
            goto L6d
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3a:
            wn.m.b(r10)
            jo.e0 r10 = new jo.e0
            r10.<init>()
            jo.e0 r2 = new jo.e0
            r2.<init>()
            r2.f38136w = r9
            androidx.compose.ui.platform.g2 r5 = r8.getViewConfiguration()
            long r5 = r5.c()
            w.h$d r7 = new w.h$d     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L63
            r7.<init>(r8, r2, r10, r3)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L63
            r0.f57712w = r9     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L63
            r0.f57713x = r10     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L63
            r0.f57715z = r4     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L63
            java.lang.Object r8 = uo.g3.c(r5, r7, r0)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L63
            if (r8 != r1) goto L6d
            return r1
        L63:
            r8 = r10
        L64:
            T r8 = r8.f38136w
            n1.w r8 = (n1.w) r8
            if (r8 != 0) goto L6c
            r3 = r9
            goto L6d
        L6c:
            r3 = r8
        L6d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: w.h.e(n1.e0, n1.w, ao.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0156 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00dd A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0115 -> B:68:0x017f). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x016f -> B:64:0x0176). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object f(n1.c r19, long r20, int r22, io.p<? super n1.w, ? super b1.f, wn.v> r23, ao.d<? super n1.w> r24) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w.h.f(n1.c, long, int, io.p, ao.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x011c -> B:60:0x0168). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x015b -> B:56:0x015e). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0182 -> B:60:0x0168). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object g(n1.c r19, long r20, int r22, io.p<? super n1.w, ? super java.lang.Float, wn.v> r23, ao.d<? super n1.w> r24) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w.h.g(n1.c, long, int, io.p, ao.d):java.lang.Object");
    }

    public static final Object h(n1.e0 e0Var, io.l<? super b1.f, wn.v> lVar, io.a<wn.v> aVar, io.a<wn.v> aVar2, io.p<? super n1.w, ? super b1.f, wn.v> pVar, ao.d<? super wn.v> dVar) {
        Object d10 = n.d(e0Var, new g(lVar, pVar, aVar2, aVar, null), dVar);
        return d10 == bo.c.c() ? d10 : wn.v.f59242a;
    }

    public static final Object i(n1.e0 e0Var, io.l<? super b1.f, wn.v> lVar, io.a<wn.v> aVar, io.a<wn.v> aVar2, io.p<? super n1.w, ? super b1.f, wn.v> pVar, ao.d<? super wn.v> dVar) {
        Object d10 = n.d(e0Var, new C0944h(lVar, aVar2, aVar, pVar, null), dVar);
        return d10 == bo.c.c() ? d10 : wn.v.f59242a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0048 -> B:18:0x004b). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object j(n1.c r4, long r5, io.l<? super n1.w, wn.v> r7, ao.d<? super java.lang.Boolean> r8) {
        /*
            boolean r0 = r8 instanceof w.h.i
            if (r0 == 0) goto L13
            r0 = r8
            w.h$i r0 = (w.h.i) r0
            int r1 = r0.f57753z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f57753z = r1
            goto L18
        L13:
            w.h$i r0 = new w.h$i
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f57752y
            java.lang.Object r1 = bo.c.c()
            int r2 = r0.f57753z
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f57751x
            io.l r4 = (io.l) r4
            java.lang.Object r5 = r0.f57750w
            n1.c r5 = (n1.c) r5
            wn.m.b(r8)
            r7 = r4
            r4 = r5
            goto L4b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            wn.m.b(r8)
        L3e:
            r0.f57750w = r4
            r0.f57751x = r7
            r0.f57753z = r3
            java.lang.Object r8 = c(r4, r5, r0)
            if (r8 != r1) goto L4b
            return r1
        L4b:
            n1.w r8 = (n1.w) r8
            if (r8 != 0) goto L55
            r4 = 0
            java.lang.Boolean r4 = co.b.a(r4)
            return r4
        L55:
            boolean r5 = n1.n.d(r8)
            if (r5 == 0) goto L60
            java.lang.Boolean r4 = co.b.a(r3)
            return r4
        L60:
            r7.invoke(r8)
            long r5 = r8.e()
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: w.h.j(n1.c, long, io.l, ao.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f5, code lost:
        if ((!(b1.f.m(n1.n.h(r13)) == 0.0f)) != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0082 -> B:23:0x0088). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object k(n1.c r18, long r19, io.l<? super n1.w, wn.v> r21, ao.d<? super java.lang.Boolean> r22) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w.h.k(n1.c, long, io.l, ao.d):java.lang.Object");
    }

    public static final boolean l(n1.m mVar, long j10) {
        n1.w wVar;
        List<n1.w> c10 = mVar.c();
        int size = c10.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                wVar = null;
                break;
            }
            wVar = c10.get(i10);
            if (n1.v.d(wVar.e(), j10)) {
                break;
            }
            i10++;
        }
        n1.w wVar2 = wVar;
        if (wVar2 != null && wVar2.g()) {
            z10 = true;
        }
        return true ^ z10;
    }

    public static final float m(g2 g2Var, int i10) {
        jo.p.h(g2Var, "$this$pointerSlop");
        return j0.g(i10, j0.f41449a.b()) ? g2Var.e() * f57703c : g2Var.e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f5, code lost:
        if ((!(b1.f.n(n1.n.h(r13)) == 0.0f)) != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0082 -> B:23:0x0088). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object n(n1.c r18, long r19, io.l<? super n1.w, wn.v> r21, ao.d<? super java.lang.Boolean> r22) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w.h.n(n1.c, long, io.l, ao.d):java.lang.Object");
    }
}
