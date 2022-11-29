package e6;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import co.l;
import e6.b;
import h6.c;
import io.p;
import j6.m;
import j6.o;
import java.util.List;
import jo.e0;
import o6.k;
import o6.s;
import uo.j;
import uo.q0;
import wn.v;

/* loaded from: classes.dex */
public final class a implements e6.b {

    /* renamed from: e  reason: collision with root package name */
    public static final C0299a f30255e = new C0299a(null);

    /* renamed from: a  reason: collision with root package name */
    public final x5.e f30256a;

    /* renamed from: b  reason: collision with root package name */
    public final o f30257b;

    /* renamed from: c  reason: collision with root package name */
    public final s f30258c;

    /* renamed from: d  reason: collision with root package name */
    public final h6.d f30259d;

    /* renamed from: e6.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0299a {
        public C0299a() {
        }

        public /* synthetic */ C0299a(jo.h hVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final Drawable f30260a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f30261b;

        /* renamed from: c  reason: collision with root package name */
        public final a6.d f30262c;

        /* renamed from: d  reason: collision with root package name */
        public final String f30263d;

        public b(Drawable drawable, boolean z10, a6.d dVar, String str) {
            this.f30260a = drawable;
            this.f30261b = z10;
            this.f30262c = dVar;
            this.f30263d = str;
        }

        public static /* synthetic */ b b(b bVar, Drawable drawable, boolean z10, a6.d dVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                drawable = bVar.f30260a;
            }
            if ((i10 & 2) != 0) {
                z10 = bVar.f30261b;
            }
            if ((i10 & 4) != 0) {
                dVar = bVar.f30262c;
            }
            if ((i10 & 8) != 0) {
                str = bVar.f30263d;
            }
            return bVar.a(drawable, z10, dVar, str);
        }

        public final b a(Drawable drawable, boolean z10, a6.d dVar, String str) {
            return new b(drawable, z10, dVar, str);
        }

        public final a6.d c() {
            return this.f30262c;
        }

        public final String d() {
            return this.f30263d;
        }

        public final Drawable e() {
            return this.f30260a;
        }

        public final boolean f() {
            return this.f30261b;
        }
    }

    @co.f(c = "coil.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {199}, m = "decode")
    /* loaded from: classes.dex */
    public static final class c extends co.d {
        public Object A;
        public Object B;
        public Object C;
        public Object D;
        public int E;
        public /* synthetic */ Object F;
        public int H;

        /* renamed from: w  reason: collision with root package name */
        public Object f30264w;

        /* renamed from: x  reason: collision with root package name */
        public Object f30265x;

        /* renamed from: y  reason: collision with root package name */
        public Object f30266y;

        /* renamed from: z  reason: collision with root package name */
        public Object f30267z;

        public c(ao.d<? super c> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.F = obj;
            this.H |= Integer.MIN_VALUE;
            return a.this.h(null, null, null, null, null, null, this);
        }
    }

    @co.f(c = "coil.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {122, 126, 144}, m = "execute")
    /* loaded from: classes.dex */
    public static final class d extends co.d {
        public Object A;
        public Object B;
        public Object C;
        public Object D;
        public /* synthetic */ Object E;
        public int G;

        /* renamed from: w  reason: collision with root package name */
        public Object f30268w;

        /* renamed from: x  reason: collision with root package name */
        public Object f30269x;

        /* renamed from: y  reason: collision with root package name */
        public Object f30270y;

        /* renamed from: z  reason: collision with root package name */
        public Object f30271z;

        public d(ao.d<? super d> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.E = obj;
            this.G |= Integer.MIN_VALUE;
            return a.this.i(null, null, null, null, this);
        }
    }

    @co.f(c = "coil.intercept.EngineInterceptor$execute$executeResult$1", f = "EngineInterceptor.kt", l = {127}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class e extends l implements p<q0, ao.d<? super b>, Object> {
        public final /* synthetic */ j6.i A;
        public final /* synthetic */ Object B;
        public final /* synthetic */ e0<m> C;
        public final /* synthetic */ x5.c D;

        /* renamed from: w  reason: collision with root package name */
        public int f30272w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ e0<d6.g> f30274y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ e0<x5.b> f30275z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(e0<d6.g> e0Var, e0<x5.b> e0Var2, j6.i iVar, Object obj, e0<m> e0Var3, x5.c cVar, ao.d<? super e> dVar) {
            super(2, dVar);
            this.f30274y = e0Var;
            this.f30275z = e0Var2;
            this.A = iVar;
            this.B = obj;
            this.C = e0Var3;
            this.D = cVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new e(this.f30274y, this.f30275z, this.A, this.B, this.C, this.D, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super b> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f30272w;
            if (i10 == 0) {
                wn.m.b(obj);
                x5.c cVar = this.D;
                this.f30272w = 1;
                obj = a.this.h((d6.l) this.f30274y.f38136w, this.f30275z.f38136w, this.A, this.B, this.C.f38136w, cVar, this);
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

    @co.f(c = "coil.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {165}, m = "fetch")
    /* loaded from: classes.dex */
    public static final class f extends co.d {
        public Object A;
        public Object B;
        public Object C;
        public int D;
        public /* synthetic */ Object E;
        public int G;

        /* renamed from: w  reason: collision with root package name */
        public Object f30276w;

        /* renamed from: x  reason: collision with root package name */
        public Object f30277x;

        /* renamed from: y  reason: collision with root package name */
        public Object f30278y;

        /* renamed from: z  reason: collision with root package name */
        public Object f30279z;

        public f(ao.d<? super f> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.E = obj;
            this.G |= Integer.MIN_VALUE;
            return a.this.j(null, null, null, null, null, this);
        }
    }

    @co.f(c = "coil.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {73}, m = "intercept")
    /* loaded from: classes.dex */
    public static final class g extends co.d {
        public int A;

        /* renamed from: w  reason: collision with root package name */
        public Object f30280w;

        /* renamed from: x  reason: collision with root package name */
        public Object f30281x;

        /* renamed from: y  reason: collision with root package name */
        public /* synthetic */ Object f30282y;

        public g(ao.d<? super g> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f30282y = obj;
            this.A |= Integer.MIN_VALUE;
            return a.this.a(null, this);
        }
    }

    @co.f(c = "coil.intercept.EngineInterceptor$intercept$2", f = "EngineInterceptor.kt", l = {75}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class h extends l implements p<q0, ao.d<? super j6.p>, Object> {
        public final /* synthetic */ m A;
        public final /* synthetic */ x5.c B;
        public final /* synthetic */ c.b C;
        public final /* synthetic */ b.a D;

        /* renamed from: w  reason: collision with root package name */
        public int f30284w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ j6.i f30286y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ Object f30287z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(j6.i iVar, Object obj, m mVar, x5.c cVar, c.b bVar, b.a aVar, ao.d<? super h> dVar) {
            super(2, dVar);
            this.f30286y = iVar;
            this.f30287z = obj;
            this.A = mVar;
            this.B = cVar;
            this.C = bVar;
            this.D = aVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new h(this.f30286y, this.f30287z, this.A, this.B, this.C, this.D, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super j6.p> dVar) {
            return ((h) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f30284w;
            if (i10 == 0) {
                wn.m.b(obj);
                a aVar = a.this;
                j6.i iVar = this.f30286y;
                Object obj2 = this.f30287z;
                m mVar = this.A;
                x5.c cVar = this.B;
                this.f30284w = 1;
                obj = aVar.i(iVar, obj2, mVar, cVar, this);
                if (obj == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            b bVar = (b) obj;
            return new j6.p(bVar.e(), this.f30286y, bVar.c(), a.this.f30259d.h(this.C, this.f30286y, bVar) ? this.C : null, bVar.d(), bVar.f(), k.t(this.D));
        }
    }

    @co.f(c = "coil.intercept.EngineInterceptor$transform$3", f = "EngineInterceptor.kt", l = {242}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class i extends l implements p<q0, ao.d<? super b>, Object> {
        public int A;
        public /* synthetic */ Object B;
        public final /* synthetic */ b D;
        public final /* synthetic */ m E;
        public final /* synthetic */ List<m6.c> F;
        public final /* synthetic */ x5.c G;
        public final /* synthetic */ j6.i H;

        /* renamed from: w  reason: collision with root package name */
        public Object f30288w;

        /* renamed from: x  reason: collision with root package name */
        public Object f30289x;

        /* renamed from: y  reason: collision with root package name */
        public int f30290y;

        /* renamed from: z  reason: collision with root package name */
        public int f30291z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(b bVar, m mVar, List<? extends m6.c> list, x5.c cVar, j6.i iVar, ao.d<? super i> dVar) {
            super(2, dVar);
            this.D = bVar;
            this.E = mVar;
            this.F = list;
            this.G = cVar;
            this.H = iVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            i iVar = new i(this.D, this.E, this.F, this.G, this.H, dVar);
            iVar.B = obj;
            return iVar;
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super b> dVar) {
            return ((i) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0088  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0081 -> B:14:0x0082). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                r19 = this;
                r0 = r19
                java.lang.Object r1 = bo.c.c()
                int r2 = r0.A
                r3 = 1
                if (r2 == 0) goto L2e
                if (r2 != r3) goto L26
                int r2 = r0.f30291z
                int r4 = r0.f30290y
                java.lang.Object r5 = r0.f30289x
                j6.m r5 = (j6.m) r5
                java.lang.Object r6 = r0.f30288w
                java.util.List r6 = (java.util.List) r6
                java.lang.Object r7 = r0.B
                uo.q0 r7 = (uo.q0) r7
                wn.m.b(r20)
                r9 = r0
                r8 = r7
                r7 = r4
                r4 = r20
                goto L82
            L26:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L2e:
                wn.m.b(r20)
                java.lang.Object r2 = r0.B
                uo.q0 r2 = (uo.q0) r2
                e6.a r4 = e6.a.this
                e6.a$b r5 = r0.D
                android.graphics.drawable.Drawable r5 = r5.e()
                j6.m r6 = r0.E
                java.util.List<m6.c> r7 = r0.F
                android.graphics.Bitmap r4 = e6.a.b(r4, r5, r6, r7)
                x5.c r5 = r0.G
                j6.i r6 = r0.H
                r5.k(r6, r4)
                java.util.List<m6.c> r5 = r0.F
                j6.m r6 = r0.E
                r7 = 0
                int r8 = r5.size()
                r9 = r0
                r17 = r8
                r8 = r2
                r2 = r17
                r18 = r6
                r6 = r5
                r5 = r18
            L60:
                if (r7 >= r2) goto L88
                int r10 = r7 + 1
                java.lang.Object r7 = r6.get(r7)
                m6.c r7 = (m6.c) r7
                k6.h r11 = r5.o()
                r9.B = r8
                r9.f30288w = r6
                r9.f30289x = r5
                r9.f30290y = r10
                r9.f30291z = r2
                r9.A = r3
                java.lang.Object r4 = r7.b(r4, r11, r9)
                if (r4 != r1) goto L81
                return r1
            L81:
                r7 = r10
            L82:
                android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
                uo.r0.f(r8)
                goto L60
            L88:
                x5.c r1 = r9.G
                j6.i r2 = r9.H
                r1.q(r2, r4)
                e6.a$b r10 = r9.D
                j6.i r1 = r9.H
                android.content.Context r1 = r1.l()
                android.content.res.Resources r1 = r1.getResources()
                android.graphics.drawable.BitmapDrawable r11 = new android.graphics.drawable.BitmapDrawable
                r11.<init>(r1, r4)
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 14
                r16 = 0
                e6.a$b r1 = e6.a.b.b(r10, r11, r12, r13, r14, r15, r16)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: e6.a.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public a(x5.e eVar, o oVar, s sVar) {
        this.f30256a = eVar;
        this.f30257b = oVar;
        this.f30258c = sVar;
        this.f30259d = new h6.d(eVar, oVar, sVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ad  */
    @Override // e6.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(e6.b.a r14, ao.d<? super j6.j> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof e6.a.g
            if (r0 == 0) goto L13
            r0 = r15
            e6.a$g r0 = (e6.a.g) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            e6.a$g r0 = new e6.a$g
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f30282y
            java.lang.Object r1 = bo.c.c()
            int r2 = r0.A
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r14 = r0.f30281x
            e6.b$a r14 = (e6.b.a) r14
            java.lang.Object r0 = r0.f30280w
            e6.a r0 = (e6.a) r0
            wn.m.b(r15)     // Catch: java.lang.Throwable -> L31
            goto L9b
        L31:
            r15 = move-exception
            goto L9e
        L33:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L3b:
            wn.m.b(r15)
            j6.i r6 = r14.b()     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r15 = r6.m()     // Catch: java.lang.Throwable -> L9c
            k6.h r2 = r14.a()     // Catch: java.lang.Throwable -> L9c
            x5.c r9 = o6.k.g(r14)     // Catch: java.lang.Throwable -> L9c
            j6.o r4 = r13.f30257b     // Catch: java.lang.Throwable -> L9c
            j6.m r8 = r4.f(r6, r2)     // Catch: java.lang.Throwable -> L9c
            k6.g r4 = r8.n()     // Catch: java.lang.Throwable -> L9c
            r9.i(r6, r15)     // Catch: java.lang.Throwable -> L9c
            x5.e r5 = r13.f30256a     // Catch: java.lang.Throwable -> L9c
            x5.b r5 = r5.getComponents()     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r7 = r5.g(r15, r8)     // Catch: java.lang.Throwable -> L9c
            r9.m(r6, r7)     // Catch: java.lang.Throwable -> L9c
            h6.d r15 = r13.f30259d     // Catch: java.lang.Throwable -> L9c
            h6.c$b r10 = r15.f(r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L9c
            if (r10 != 0) goto L72
            r15 = 0
            goto L78
        L72:
            h6.d r15 = r13.f30259d     // Catch: java.lang.Throwable -> L9c
            h6.c$c r15 = r15.a(r6, r10, r2, r4)     // Catch: java.lang.Throwable -> L9c
        L78:
            if (r15 == 0) goto L81
            h6.d r0 = r13.f30259d     // Catch: java.lang.Throwable -> L9c
            j6.p r14 = r0.g(r14, r6, r10, r15)     // Catch: java.lang.Throwable -> L9c
            return r14
        L81:
            uo.k0 r15 = r6.v()     // Catch: java.lang.Throwable -> L9c
            e6.a$h r2 = new e6.a$h     // Catch: java.lang.Throwable -> L9c
            r12 = 0
            r4 = r2
            r5 = r13
            r11 = r14
            r4.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L9c
            r0.f30280w = r13     // Catch: java.lang.Throwable -> L9c
            r0.f30281x = r14     // Catch: java.lang.Throwable -> L9c
            r0.A = r3     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r15 = uo.j.f(r15, r2, r0)     // Catch: java.lang.Throwable -> L9c
            if (r15 != r1) goto L9b
            return r1
        L9b:
            return r15
        L9c:
            r15 = move-exception
            r0 = r13
        L9e:
            boolean r1 = r15 instanceof java.util.concurrent.CancellationException
            if (r1 != 0) goto Lad
            j6.o r0 = r0.f30257b
            j6.i r14 = r14.b()
            j6.e r14 = r0.b(r14, r15)
            return r14
        Lad:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: e6.a.a(e6.b$a, ao.d):java.lang.Object");
    }

    public final Bitmap g(Drawable drawable, m mVar, List<? extends m6.c> list) {
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            Bitmap.Config c10 = o6.a.c(bitmap);
            if (xn.o.B(k.o(), c10)) {
                return bitmap;
            }
            s sVar = this.f30258c;
            if (sVar != null && sVar.b() <= 4) {
                sVar.a("EngineInterceptor", 4, "Converting bitmap with config " + c10 + " to apply transformations: " + list + '.', null);
            }
        } else {
            s sVar2 = this.f30258c;
            if (sVar2 != null && sVar2.b() <= 4) {
                sVar2.a("EngineInterceptor", 4, "Converting drawable of type " + ((Object) drawable.getClass().getCanonicalName()) + " to apply transformations: " + list + '.', null);
            }
        }
        return o6.m.f44102a.a(drawable, mVar.f(), mVar.o(), mVar.n(), mVar.c());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00ab -> B:21:0x00b4). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(d6.l r17, x5.b r18, j6.i r19, java.lang.Object r20, j6.m r21, x5.c r22, ao.d<? super e6.a.b> r23) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e6.a.h(d6.l, x5.b, j6.i, java.lang.Object, j6.m, x5.c, ao.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015c A[Catch: all -> 0x0216, TRY_LEAVE, TryCatch #1 {all -> 0x0216, blocks: (B:45:0x0151, B:47:0x015c, B:53:0x019c, B:55:0x01a0, B:80:0x0210, B:81:0x0215, B:27:0x00a5, B:29:0x00b1, B:30:0x00df, B:32:0x00e5, B:41:0x0114, B:34:0x00eb, B:36:0x00fa, B:37:0x0101, B:39:0x0107, B:40:0x010e), top: B:95:0x00a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x019c A[Catch: all -> 0x0216, TRY_ENTER, TryCatch #1 {all -> 0x0216, blocks: (B:45:0x0151, B:47:0x015c, B:53:0x019c, B:55:0x01a0, B:80:0x0210, B:81:0x0215, B:27:0x00a5, B:29:0x00b1, B:30:0x00df, B:32:0x00e5, B:41:0x0114, B:34:0x00eb, B:36:0x00fa, B:37:0x0101, B:39:0x0107, B:40:0x010e), top: B:95:0x00a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01f4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0223  */
    /* JADX WARN: Type inference failed for: r1v13, types: [T, x5.b] */
    /* JADX WARN: Type inference failed for: r1v20, types: [T, j6.m] */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, x5.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(j6.i r36, java.lang.Object r37, j6.m r38, x5.c r39, ao.d<? super e6.a.b> r40) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e6.a.i(j6.i, java.lang.Object, j6.m, x5.c, ao.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0092 -> B:21:0x0097). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(x5.b r10, j6.i r11, java.lang.Object r12, j6.m r13, x5.c r14, ao.d<? super d6.g> r15) {
        /*
            Method dump skipped, instructions count: 201
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e6.a.j(x5.b, j6.i, java.lang.Object, j6.m, x5.c, ao.d):java.lang.Object");
    }

    public final Object k(b bVar, j6.i iVar, m mVar, x5.c cVar, ao.d<? super b> dVar) {
        List<m6.c> O = iVar.O();
        if (O.isEmpty()) {
            return bVar;
        }
        if (!(bVar.e() instanceof BitmapDrawable) && !iVar.g()) {
            s sVar = this.f30258c;
            if (sVar != null && sVar.b() <= 4) {
                String canonicalName = bVar.e().getClass().getCanonicalName();
                sVar.a("EngineInterceptor", 4, "allowConversionToBitmap=false, skipping transformations for type " + ((Object) canonicalName) + '.', null);
            }
            return bVar;
        }
        return j.f(iVar.N(), new i(bVar, mVar, O, cVar, iVar, null), dVar);
    }
}
