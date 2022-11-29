package d2;

import d2.o0;
import java.util.List;
import l0.c2;
import l0.s0;
import l0.z1;
import uo.q0;

/* loaded from: classes.dex */
public final class g implements c2<Object> {
    public final b0 A;
    public final s0 B;
    public boolean C;

    /* renamed from: w  reason: collision with root package name */
    public final List<k> f29066w;

    /* renamed from: x  reason: collision with root package name */
    public final m0 f29067x;

    /* renamed from: y  reason: collision with root package name */
    public final h f29068y;

    /* renamed from: z  reason: collision with root package name */
    public final io.l<o0.b, wn.v> f29069z;

    @co.f(c = "androidx.compose.ui.text.font.AsyncFontListLoader", f = "FontListFontFamilyTypefaceAdapter.kt", l = {272, 285}, m = "load")
    /* loaded from: classes.dex */
    public static final class a extends co.d {
        public int A;
        public /* synthetic */ Object B;
        public int D;

        /* renamed from: w  reason: collision with root package name */
        public Object f29070w;

        /* renamed from: x  reason: collision with root package name */
        public Object f29071x;

        /* renamed from: y  reason: collision with root package name */
        public Object f29072y;

        /* renamed from: z  reason: collision with root package name */
        public int f29073z;

        public a(ao.d<? super a> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.B = obj;
            this.D |= Integer.MIN_VALUE;
            return g.this.k(this);
        }
    }

    @co.f(c = "androidx.compose.ui.text.font.AsyncFontListLoader$load$2$typeface$1", f = "FontListFontFamilyTypefaceAdapter.kt", l = {273}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends co.l implements io.l<ao.d<? super Object>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f29074w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ k f29076y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(k kVar, ao.d<? super b> dVar) {
            super(1, dVar);
            this.f29076y = kVar;
        }

        @Override // io.l
        /* renamed from: a */
        public final Object invoke(ao.d<Object> dVar) {
            return ((b) create(dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final ao.d<wn.v> create(ao.d<?> dVar) {
            return new b(this.f29076y, dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f29074w;
            if (i10 == 0) {
                wn.m.b(obj);
                g gVar = g.this;
                k kVar = this.f29076y;
                this.f29074w = 1;
                obj = gVar.p(kVar, this);
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

    @co.f(c = "androidx.compose.ui.text.font.AsyncFontListLoader", f = "FontListFontFamilyTypefaceAdapter.kt", l = {304}, m = "loadWithTimeoutOrNull$ui_text_release")
    /* loaded from: classes.dex */
    public static final class c extends co.d {

        /* renamed from: w  reason: collision with root package name */
        public Object f29077w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f29078x;

        /* renamed from: z  reason: collision with root package name */
        public int f29080z;

        public c(ao.d<? super c> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f29078x = obj;
            this.f29080z |= Integer.MIN_VALUE;
            return g.this.p(null, this);
        }
    }

    @co.f(c = "androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2", f = "FontListFontFamilyTypefaceAdapter.kt", l = {305}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class d extends co.l implements io.p<q0, ao.d<? super Object>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f29081w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ k f29083y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(k kVar, ao.d<? super d> dVar) {
            super(2, dVar);
            this.f29083y = kVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d(this.f29083y, dVar);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, ao.d<? super Object> dVar) {
            return invoke2(q0Var, (ao.d<Object>) dVar);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(q0 q0Var, ao.d<Object> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f29081w;
            if (i10 == 0) {
                wn.m.b(obj);
                b0 b0Var = g.this.A;
                k kVar = this.f29083y;
                this.f29081w = 1;
                obj = b0Var.c(kVar, this);
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

    /* JADX WARN: Multi-variable type inference failed */
    public g(List<? extends k> list, Object obj, m0 m0Var, h hVar, io.l<? super o0.b, wn.v> lVar, b0 b0Var) {
        s0 e10;
        jo.p.h(list, "fontList");
        jo.p.h(obj, "initialType");
        jo.p.h(m0Var, "typefaceRequest");
        jo.p.h(hVar, "asyncTypefaceCache");
        jo.p.h(lVar, "onCompletion");
        jo.p.h(b0Var, "platformFontLoader");
        this.f29066w = list;
        this.f29067x = m0Var;
        this.f29068y = hVar;
        this.f29069z = lVar;
        this.A = b0Var;
        e10 = z1.e(obj, null, 2, null);
        this.B = e10;
        this.C = true;
    }

    @Override // l0.c2
    public Object getValue() {
        return this.B.getValue();
    }

    public final boolean j() {
        return this.C;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bb A[Catch: all -> 0x0107, TRY_LEAVE, TryCatch #1 {all -> 0x0107, blocks: (B:28:0x0075, B:30:0x008c, B:35:0x00bb, B:38:0x00ef), top: B:55:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ef A[Catch: all -> 0x0107, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0107, blocks: (B:28:0x0075, B:30:0x008c, B:35:0x00bb, B:38:0x00ef), top: B:55:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0102 -> B:42:0x0103). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x010a -> B:46:0x010c). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(ao.d<? super wn.v> r20) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.g.k(ao.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object p(d2.k r8, ao.d<java.lang.Object> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof d2.g.c
            if (r0 == 0) goto L13
            r0 = r9
            d2.g$c r0 = (d2.g.c) r0
            int r1 = r0.f29080z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29080z = r1
            goto L18
        L13:
            d2.g$c r0 = new d2.g$c
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f29078x
            java.lang.Object r1 = bo.c.c()
            int r2 = r0.f29080z
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r8 = r0.f29077w
            d2.k r8 = (d2.k) r8
            wn.m.b(r9)     // Catch: java.lang.Exception -> L4d java.util.concurrent.CancellationException -> L7a
            goto L4b
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            wn.m.b(r9)
            r5 = 15000(0x3a98, double:7.411E-320)
            d2.g$d r9 = new d2.g$d     // Catch: java.lang.Exception -> L4d java.util.concurrent.CancellationException -> L7a
            r9.<init>(r8, r4)     // Catch: java.lang.Exception -> L4d java.util.concurrent.CancellationException -> L7a
            r0.f29077w = r8     // Catch: java.lang.Exception -> L4d java.util.concurrent.CancellationException -> L7a
            r0.f29080z = r3     // Catch: java.lang.Exception -> L4d java.util.concurrent.CancellationException -> L7a
            java.lang.Object r9 = uo.g3.d(r5, r9, r0)     // Catch: java.lang.Exception -> L4d java.util.concurrent.CancellationException -> L7a
            if (r9 != r1) goto L4b
            return r1
        L4b:
            r4 = r9
            goto L85
        L4d:
            r9 = move-exception
            ao.g r1 = r0.getContext()
            uo.l0$a r2 = uo.l0.f56050r
            ao.g$b r1 = r1.get(r2)
            uo.l0 r1 = (uo.l0) r1
            if (r1 == 0) goto L85
            ao.g r0 = r0.getContext()
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Unable to load font "
            r3.append(r5)
            r3.append(r8)
            java.lang.String r8 = r3.toString()
            r2.<init>(r8, r9)
            r1.handleException(r0, r2)
            goto L85
        L7a:
            r8 = move-exception
            ao.g r9 = r0.getContext()
            boolean r9 = uo.g2.m(r9)
            if (r9 == 0) goto L86
        L85:
            return r4
        L86:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.g.p(d2.k, ao.d):java.lang.Object");
    }

    public final void setValue(Object obj) {
        this.B.setValue(obj);
    }
}
