package x5;

import a6.b;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import co.l;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import d6.a;
import d6.b;
import d6.c;
import d6.d;
import d6.e;
import d6.i;
import d6.j;
import d6.k;
import ep.e;
import j6.i;
import j6.j;
import j6.o;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import o6.k;
import o6.p;
import o6.s;
import o6.u;
import uo.b3;
import uo.g1;
import uo.l0;
import uo.q0;
import uo.r0;
import uo.y0;
import wn.m;
import wn.v;
import x5.c;
import xn.a0;

/* loaded from: classes.dex */
public final class h implements x5.e {

    /* renamed from: r  reason: collision with root package name */
    public static final a f59724r = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final Context f59725a;

    /* renamed from: b  reason: collision with root package name */
    public final j6.b f59726b;

    /* renamed from: c  reason: collision with root package name */
    public final wn.f<h6.c> f59727c;

    /* renamed from: d  reason: collision with root package name */
    public final wn.f<b6.a> f59728d;

    /* renamed from: e  reason: collision with root package name */
    public final wn.f<e.a> f59729e;

    /* renamed from: f  reason: collision with root package name */
    public final c.d f59730f;

    /* renamed from: g  reason: collision with root package name */
    public final x5.b f59731g;

    /* renamed from: h  reason: collision with root package name */
    public final p f59732h;

    /* renamed from: i  reason: collision with root package name */
    public final s f59733i;

    /* renamed from: j  reason: collision with root package name */
    public final q0 f59734j = r0.a(b3.b(null, 1, null).plus(g1.c().h0()).plus(new f(l0.f56050r, this)));

    /* renamed from: k  reason: collision with root package name */
    public final u f59735k;

    /* renamed from: l  reason: collision with root package name */
    public final o f59736l;

    /* renamed from: m  reason: collision with root package name */
    public final wn.f f59737m;

    /* renamed from: n  reason: collision with root package name */
    public final wn.f f59738n;

    /* renamed from: o  reason: collision with root package name */
    public final x5.b f59739o;

    /* renamed from: p  reason: collision with root package name */
    public final List<e6.b> f59740p;

    /* renamed from: q  reason: collision with root package name */
    public final AtomicBoolean f59741q;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    @co.f(c = "coil.RealImageLoader$enqueue$job$1", f = "RealImageLoader.kt", l = {111}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends l implements io.p<q0, ao.d<? super j>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f59742w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ i f59744y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(i iVar, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f59744y = iVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f59744y, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super j> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            s i10;
            Object c10 = bo.c.c();
            int i11 = this.f59742w;
            if (i11 == 0) {
                m.b(obj);
                h hVar = h.this;
                i iVar = this.f59744y;
                this.f59742w = 1;
                obj = hVar.g(iVar, 0, this);
                if (obj == c10) {
                    return c10;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                m.b(obj);
            }
            h hVar2 = h.this;
            j jVar = (j) obj;
            if ((jVar instanceof j6.e) && (i10 = hVar2.i()) != null) {
                o6.i.a(i10, "RealImageLoader", ((j6.e) jVar).c());
            }
            return obj;
        }
    }

    @co.f(c = "coil.RealImageLoader$execute$2", f = "RealImageLoader.kt", l = {TsExtractor.TS_STREAM_TYPE_SPLICE_INFO}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends l implements io.p<q0, ao.d<? super j>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f59745w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f59746x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ i f59747y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ h f59748z;

        @co.f(c = "coil.RealImageLoader$execute$2$job$1", f = "RealImageLoader.kt", l = {127}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends l implements io.p<q0, ao.d<? super j>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f59749w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ h f59750x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ i f59751y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(h hVar, i iVar, ao.d<? super a> dVar) {
                super(2, dVar);
                this.f59750x = hVar;
                this.f59751y = iVar;
            }

            @Override // co.a
            public final ao.d<v> create(Object obj, ao.d<?> dVar) {
                return new a(this.f59750x, this.f59751y, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super j> dVar) {
                return ((a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f59749w;
                if (i10 == 0) {
                    m.b(obj);
                    h hVar = this.f59750x;
                    i iVar = this.f59751y;
                    this.f59749w = 1;
                    obj = hVar.g(iVar, 1, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    m.b(obj);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(i iVar, h hVar, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f59747y = iVar;
            this.f59748z = hVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            c cVar = new c(this.f59747y, this.f59748z, dVar);
            cVar.f59746x = obj;
            return cVar;
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super j> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            y0<? extends j> b10;
            Object c10 = bo.c.c();
            int i10 = this.f59745w;
            if (i10 == 0) {
                m.b(obj);
                b10 = uo.l.b((q0) this.f59746x, g1.c().h0(), null, new a(this.f59748z, this.f59747y, null), 2, null);
                if (this.f59747y.M() instanceof l6.b) {
                    k.l(((l6.b) this.f59747y.M()).a()).b(b10);
                }
                this.f59745w = 1;
                obj = b10.o(this);
                if (obj == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                m.b(obj);
            }
            return obj;
        }
    }

    @co.f(c = "coil.RealImageLoader", f = "RealImageLoader.kt", l = {157, 168, TsExtractor.TS_STREAM_TYPE_AC4}, m = "executeMain")
    /* loaded from: classes.dex */
    public static final class d extends co.d {
        public Object A;
        public /* synthetic */ Object B;
        public int D;

        /* renamed from: w  reason: collision with root package name */
        public Object f59752w;

        /* renamed from: x  reason: collision with root package name */
        public Object f59753x;

        /* renamed from: y  reason: collision with root package name */
        public Object f59754y;

        /* renamed from: z  reason: collision with root package name */
        public Object f59755z;

        public d(ao.d<? super d> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.B = obj;
            this.D |= Integer.MIN_VALUE;
            return h.this.g(null, 0, this);
        }
    }

    @co.f(c = "coil.RealImageLoader$executeMain$result$1", f = "RealImageLoader.kt", l = {181}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class e extends l implements io.p<q0, ao.d<? super j>, Object> {
        public final /* synthetic */ x5.c A;
        public final /* synthetic */ Bitmap B;

        /* renamed from: w  reason: collision with root package name */
        public int f59756w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ i f59757x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ h f59758y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ k6.h f59759z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(i iVar, h hVar, k6.h hVar2, x5.c cVar, Bitmap bitmap, ao.d<? super e> dVar) {
            super(2, dVar);
            this.f59757x = iVar;
            this.f59758y = hVar;
            this.f59759z = hVar2;
            this.A = cVar;
            this.B = bitmap;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new e(this.f59757x, this.f59758y, this.f59759z, this.A, this.B, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super j> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f59756w;
            if (i10 == 0) {
                m.b(obj);
                e6.c cVar = new e6.c(this.f59757x, this.f59758y.f59740p, 0, this.f59757x, this.f59759z, this.A, this.B != null);
                i iVar = this.f59757x;
                this.f59756w = 1;
                obj = cVar.j(iVar, this);
                if (obj == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                m.b(obj);
            }
            return obj;
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends ao.a implements l0 {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ h f59760w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(l0.a aVar, h hVar) {
            super(aVar);
            this.f59760w = hVar;
        }

        @Override // uo.l0
        public void handleException(ao.g gVar, Throwable th2) {
            s i10 = this.f59760w.i();
            if (i10 == null) {
                return;
            }
            o6.i.a(i10, "RealImageLoader", th2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(Context context, j6.b bVar, wn.f<? extends h6.c> fVar, wn.f<? extends b6.a> fVar2, wn.f<? extends e.a> fVar3, c.d dVar, x5.b bVar2, p pVar, s sVar) {
        this.f59725a = context;
        this.f59726b = bVar;
        this.f59727c = fVar;
        this.f59728d = fVar2;
        this.f59729e = fVar3;
        this.f59730f = dVar;
        this.f59731g = bVar2;
        this.f59732h = pVar;
        this.f59733i = sVar;
        u uVar = new u(this, context, pVar.c());
        this.f59735k = uVar;
        o oVar = new o(this, uVar, sVar);
        this.f59736l = oVar;
        this.f59737m = fVar;
        this.f59738n = fVar2;
        this.f59739o = bVar2.h().d(new g6.b(), ep.v.class).d(new g6.f(), String.class).d(new g6.a(), Uri.class).d(new g6.e(), Uri.class).d(new g6.d(), Integer.class).c(new f6.c(), Uri.class).c(new f6.a(pVar.a()), File.class).b(new j.b(fVar3, fVar2, pVar.d()), Uri.class).b(new i.a(), File.class).b(new a.C0273a(), Uri.class).b(new d.a(), Uri.class).b(new k.b(), Uri.class).b(new e.a(), Drawable.class).b(new b.a(), Bitmap.class).b(new c.a(), ByteBuffer.class).a(new b.c(pVar.b())).e();
        this.f59740p = a0.p0(getComponents().c(), new e6.a(this, oVar, sVar));
        this.f59741q = new AtomicBoolean(false);
    }

    @Override // x5.e
    public j6.b a() {
        return this.f59726b;
    }

    @Override // x5.e
    public Object b(j6.i iVar, ao.d<? super j6.j> dVar) {
        return r0.e(new c(iVar, this, null), dVar);
    }

    @Override // x5.e
    public j6.d c(j6.i iVar) {
        y0<? extends j6.j> b10;
        b10 = uo.l.b(this.f59734j, null, null, new b(iVar, null), 3, null);
        if (iVar.M() instanceof l6.b) {
            return o6.k.l(((l6.b) iVar.M()).a()).b(b10);
        }
        return new j6.l(b10);
    }

    @Override // x5.e
    public h6.c d() {
        return (h6.c) this.f59737m.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fa A[Catch: all -> 0x01ae, TryCatch #5 {all -> 0x01ae, blocks: (B:42:0x00f2, B:56:0x0120, B:57:0x0124, B:61:0x012e, B:65:0x013b, B:64:0x0138, B:60:0x012b, B:54:0x0111, B:45:0x00fa, B:51:0x0109, B:48:0x0102), top: B:104:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0111 A[Catch: all -> 0x01ae, TryCatch #5 {all -> 0x01ae, blocks: (B:42:0x00f2, B:56:0x0120, B:57:0x0124, B:61:0x012e, B:65:0x013b, B:64:0x0138, B:60:0x012b, B:54:0x0111, B:45:0x00fa, B:51:0x0109, B:48:0x0102), top: B:104:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0120 A[Catch: all -> 0x01ae, TryCatch #5 {all -> 0x01ae, blocks: (B:42:0x00f2, B:56:0x0120, B:57:0x0124, B:61:0x012e, B:65:0x013b, B:64:0x0138, B:60:0x012b, B:54:0x0111, B:45:0x00fa, B:51:0x0109, B:48:0x0102), top: B:104:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012b A[Catch: all -> 0x01ae, TryCatch #5 {all -> 0x01ae, blocks: (B:42:0x00f2, B:56:0x0120, B:57:0x0124, B:61:0x012e, B:65:0x013b, B:64:0x0138, B:60:0x012b, B:54:0x0111, B:45:0x00fa, B:51:0x0109, B:48:0x0102), top: B:104:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0138 A[Catch: all -> 0x01ae, TryCatch #5 {all -> 0x01ae, blocks: (B:42:0x00f2, B:56:0x0120, B:57:0x0124, B:61:0x012e, B:65:0x013b, B:64:0x0138, B:60:0x012b, B:54:0x0111, B:45:0x00fa, B:51:0x0109, B:48:0x0102), top: B:104:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0154 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0186 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0191 A[Catch: all -> 0x004b, TryCatch #4 {all -> 0x004b, blocks: (B:14:0x0046, B:73:0x018b, B:75:0x0191, B:76:0x019c, B:78:0x01a0), top: B:103:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x019c A[Catch: all -> 0x004b, TryCatch #4 {all -> 0x004b, blocks: (B:14:0x0046, B:73:0x018b, B:75:0x0191, B:76:0x019c, B:78:0x01a0), top: B:103:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c2 A[Catch: all -> 0x01d7, TRY_LEAVE, TryCatch #2 {all -> 0x01d7, blocks: (B:87:0x01be, B:89:0x01c2, B:92:0x01d3, B:93:0x01d6), top: B:101:0x01be }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d3 A[Catch: all -> 0x01d7, TRY_ENTER, TryCatch #2 {all -> 0x01d7, blocks: (B:87:0x01be, B:89:0x01c2, B:92:0x01d3, B:93:0x01d6), top: B:101:0x01be }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(j6.i r21, int r22, ao.d<? super j6.j> r23) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x5.h.g(j6.i, int, ao.d):java.lang.Object");
    }

    @Override // x5.e
    public x5.b getComponents() {
        return this.f59739o;
    }

    public final c.d h() {
        return this.f59730f;
    }

    public final s i() {
        return this.f59733i;
    }

    public final void j(j6.i iVar, x5.c cVar) {
        s sVar = this.f59733i;
        if (sVar != null && sVar.b() <= 4) {
            sVar.a("RealImageLoader", 4, jo.p.o("🏗  Cancelled - ", iVar.m()), null);
        }
        cVar.c(iVar);
        i.b A = iVar.A();
        if (A == null) {
            return;
        }
        A.c(iVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
        if (r8 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(j6.e r7, l6.a r8, x5.c r9) {
        /*
            r6 = this;
            j6.i r0 = r7.b()
            o6.s r1 = r6.f59733i
            if (r1 != 0) goto L9
            goto L37
        L9:
            r2 = 4
            int r3 = r1.b()
            if (r3 > r2) goto L37
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "🚨 Failed - "
            r3.append(r4)
            java.lang.Object r4 = r0.m()
            r3.append(r4)
            java.lang.String r4 = " - "
            r3.append(r4)
            java.lang.Throwable r4 = r7.c()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = 0
            java.lang.String r5 = "RealImageLoader"
            r1.a(r5, r2, r3, r4)
        L37:
            boolean r1 = r8 instanceof n6.d
            if (r1 != 0) goto L3e
            if (r8 != 0) goto L51
            goto L6a
        L3e:
            j6.i r1 = r7.b()
            n6.c$a r1 = r1.P()
            r2 = r8
            n6.d r2 = (n6.d) r2
            n6.c r1 = r1.a(r2, r7)
            boolean r2 = r1 instanceof n6.b
            if (r2 == 0) goto L59
        L51:
            android.graphics.drawable.Drawable r1 = r7.a()
            r8.k(r1)
            goto L6a
        L59:
            j6.i r8 = r7.b()
            r9.e(r8, r1)
            r1.a()
            j6.i r8 = r7.b()
            r9.g(r8, r1)
        L6a:
            r9.d(r0, r7)
            j6.i$b r8 = r0.A()
            if (r8 != 0) goto L74
            goto L77
        L74:
            r8.d(r0, r7)
        L77:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x5.h.k(j6.e, l6.a, x5.c):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0046, code lost:
        if (r8 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(j6.p r7, l6.a r8, x5.c r9) {
        /*
            r6 = this;
            j6.i r0 = r7.b()
            a6.d r1 = r7.c()
            o6.s r2 = r6.f59733i
            if (r2 != 0) goto Ld
            goto L42
        Ld:
            r3 = 4
            int r4 = r2.b()
            if (r4 > r3) goto L42
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = o6.k.f(r1)
            r4.append(r5)
            java.lang.String r5 = " Successful ("
            r4.append(r5)
            java.lang.String r1 = r1.name()
            r4.append(r1)
            java.lang.String r1 = ") - "
            r4.append(r1)
            java.lang.Object r1 = r0.m()
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r4 = 0
            java.lang.String r5 = "RealImageLoader"
            r2.a(r5, r3, r1, r4)
        L42:
            boolean r1 = r8 instanceof n6.d
            if (r1 != 0) goto L49
            if (r8 != 0) goto L5c
            goto L75
        L49:
            j6.i r1 = r7.b()
            n6.c$a r1 = r1.P()
            r2 = r8
            n6.d r2 = (n6.d) r2
            n6.c r1 = r1.a(r2, r7)
            boolean r2 = r1 instanceof n6.b
            if (r2 == 0) goto L64
        L5c:
            android.graphics.drawable.Drawable r1 = r7.a()
            r8.e(r1)
            goto L75
        L64:
            j6.i r8 = r7.b()
            r9.e(r8, r1)
            r1.a()
            j6.i r8 = r7.b()
            r9.g(r8, r1)
        L75:
            r9.b(r0, r7)
            j6.i$b r8 = r0.A()
            if (r8 != 0) goto L7f
            goto L82
        L7f:
            r8.b(r0, r7)
        L82:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x5.h.l(j6.p, l6.a, x5.c):void");
    }

    public final void m(int i10) {
        h6.c value;
        wn.f<h6.c> fVar = this.f59727c;
        if (fVar == null || (value = fVar.getValue()) == null) {
            return;
        }
        value.a(i10);
    }
}
