package er;

import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import java.lang.reflect.Method;
import kotlin.KotlinNullPointerException;
import retrofit2.HttpException;
import wn.l;

/* loaded from: classes4.dex */
public final class l {

    /* loaded from: classes4.dex */
    public static final class a extends jo.q implements io.l<Throwable, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ er.b f31134w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(er.b bVar) {
            super(1);
            this.f31134w = bVar;
        }

        public final void a(Throwable th2) {
            this.f31134w.cancel();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Throwable th2) {
            a(th2);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends jo.q implements io.l<Throwable, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ er.b f31135w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(er.b bVar) {
            super(1);
            this.f31135w = bVar;
        }

        public final void a(Throwable th2) {
            this.f31135w.cancel();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Throwable th2) {
            a(th2);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements er.d<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ uo.p f31136a;

        public c(uo.p pVar) {
            this.f31136a = pVar;
        }

        @Override // er.d
        public void a(er.b<T> bVar, Throwable th2) {
            jo.p.i(bVar, "call");
            jo.p.i(th2, TopicConstant.PACKET_TYPE_TEXT);
            uo.p pVar = this.f31136a;
            l.a aVar = wn.l.f59224w;
            pVar.resumeWith(wn.l.a(wn.m.a(th2)));
        }

        @Override // er.d
        public void b(er.b<T> bVar, s<T> sVar) {
            jo.p.i(bVar, "call");
            jo.p.i(sVar, "response");
            if (sVar.f()) {
                Object a10 = sVar.a();
                if (a10 == null) {
                    Object i10 = bVar.j().i(k.class);
                    if (i10 == null) {
                        jo.p.r();
                    }
                    jo.p.d(i10, "call.request().tag(Invocation::class.java)!!");
                    Method a11 = ((k) i10).a();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Response from ");
                    jo.p.d(a11, "method");
                    Class<?> declaringClass = a11.getDeclaringClass();
                    jo.p.d(declaringClass, "method.declaringClass");
                    sb2.append(declaringClass.getName());
                    sb2.append('.');
                    sb2.append(a11.getName());
                    sb2.append(" was null but response body type was declared as non-null");
                    KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException(sb2.toString());
                    uo.p pVar = this.f31136a;
                    l.a aVar = wn.l.f59224w;
                    pVar.resumeWith(wn.l.a(wn.m.a(kotlinNullPointerException)));
                    return;
                }
                uo.p pVar2 = this.f31136a;
                l.a aVar2 = wn.l.f59224w;
                pVar2.resumeWith(wn.l.a(a10));
                return;
            }
            uo.p pVar3 = this.f31136a;
            HttpException httpException = new HttpException(sVar);
            l.a aVar3 = wn.l.f59224w;
            pVar3.resumeWith(wn.l.a(wn.m.a(httpException)));
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements er.d<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ uo.p f31137a;

        public d(uo.p pVar) {
            this.f31137a = pVar;
        }

        @Override // er.d
        public void a(er.b<T> bVar, Throwable th2) {
            jo.p.i(bVar, "call");
            jo.p.i(th2, TopicConstant.PACKET_TYPE_TEXT);
            uo.p pVar = this.f31137a;
            l.a aVar = wn.l.f59224w;
            pVar.resumeWith(wn.l.a(wn.m.a(th2)));
        }

        @Override // er.d
        public void b(er.b<T> bVar, s<T> sVar) {
            jo.p.i(bVar, "call");
            jo.p.i(sVar, "response");
            if (sVar.f()) {
                uo.p pVar = this.f31137a;
                Object a10 = sVar.a();
                l.a aVar = wn.l.f59224w;
                pVar.resumeWith(wn.l.a(a10));
                return;
            }
            uo.p pVar2 = this.f31137a;
            HttpException httpException = new HttpException(sVar);
            l.a aVar2 = wn.l.f59224w;
            pVar2.resumeWith(wn.l.a(wn.m.a(httpException)));
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends jo.q implements io.l<Throwable, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ er.b f31138w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(er.b bVar) {
            super(1);
            this.f31138w = bVar;
        }

        public final void a(Throwable th2) {
            this.f31138w.cancel();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Throwable th2) {
            a(th2);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class f implements er.d<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ uo.p f31139a;

        public f(uo.p pVar) {
            this.f31139a = pVar;
        }

        @Override // er.d
        public void a(er.b<T> bVar, Throwable th2) {
            jo.p.i(bVar, "call");
            jo.p.i(th2, TopicConstant.PACKET_TYPE_TEXT);
            uo.p pVar = this.f31139a;
            l.a aVar = wn.l.f59224w;
            pVar.resumeWith(wn.l.a(wn.m.a(th2)));
        }

        @Override // er.d
        public void b(er.b<T> bVar, s<T> sVar) {
            jo.p.i(bVar, "call");
            jo.p.i(sVar, "response");
            uo.p pVar = this.f31139a;
            l.a aVar = wn.l.f59224w;
            pVar.resumeWith(wn.l.a(sVar));
        }
    }

    /* loaded from: classes4.dex */
    public static final class g implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ao.d f31140w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ Exception f31141x;

        public g(ao.d dVar, Exception exc) {
            this.f31140w = dVar;
            this.f31141x = exc;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ao.d b10 = bo.b.b(this.f31140w);
            Exception exc = this.f31141x;
            l.a aVar = wn.l.f59224w;
            b10.resumeWith(wn.l.a(wn.m.a(exc)));
        }
    }

    @co.f(c = "retrofit2.KotlinExtensions", f = "KotlinExtensions.kt", l = {113}, m = "suspendAndThrow")
    /* loaded from: classes4.dex */
    public static final class h extends co.d {

        /* renamed from: w  reason: collision with root package name */
        public /* synthetic */ Object f31142w;

        /* renamed from: x  reason: collision with root package name */
        public int f31143x;

        /* renamed from: y  reason: collision with root package name */
        public Object f31144y;

        public h(ao.d dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f31142w = obj;
            this.f31143x |= Integer.MIN_VALUE;
            return l.d(null, this);
        }
    }

    public static final <T> Object a(er.b<T> bVar, ao.d<? super T> dVar) {
        uo.q qVar = new uo.q(bo.b.b(dVar), 1);
        qVar.M(new a(bVar));
        bVar.D0(new c(qVar));
        Object t10 = qVar.t();
        if (t10 == bo.c.c()) {
            co.h.c(dVar);
        }
        return t10;
    }

    public static final <T> Object b(er.b<T> bVar, ao.d<? super T> dVar) {
        uo.q qVar = new uo.q(bo.b.b(dVar), 1);
        qVar.M(new b(bVar));
        bVar.D0(new d(qVar));
        Object t10 = qVar.t();
        if (t10 == bo.c.c()) {
            co.h.c(dVar);
        }
        return t10;
    }

    public static final <T> Object c(er.b<T> bVar, ao.d<? super s<T>> dVar) {
        uo.q qVar = new uo.q(bo.b.b(dVar), 1);
        qVar.M(new e(bVar));
        bVar.D0(new f(qVar));
        Object t10 = qVar.t();
        if (t10 == bo.c.c()) {
            co.h.c(dVar);
        }
        return t10;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(java.lang.Exception r4, ao.d<?> r5) {
        /*
            boolean r0 = r5 instanceof er.l.h
            if (r0 == 0) goto L13
            r0 = r5
            er.l$h r0 = (er.l.h) r0
            int r1 = r0.f31143x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31143x = r1
            goto L18
        L13:
            er.l$h r0 = new er.l$h
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f31142w
            java.lang.Object r1 = bo.c.c()
            int r2 = r0.f31143x
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f31144y
            java.lang.Exception r4 = (java.lang.Exception) r4
            wn.m.b(r5)
            goto L5c
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            wn.m.b(r5)
            r0.f31144y = r4
            r0.f31143x = r3
            uo.k0 r5 = uo.g1.a()
            ao.g r2 = r0.getContext()
            er.l$g r3 = new er.l$g
            r3.<init>(r0, r4)
            r5.X(r2, r3)
            java.lang.Object r4 = bo.c.c()
            java.lang.Object r5 = bo.c.c()
            if (r4 != r5) goto L59
            co.h.c(r0)
        L59:
            if (r4 != r1) goto L5c
            return r1
        L5c:
            wn.v r4 = wn.v.f59242a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: er.l.d(java.lang.Exception, ao.d):java.lang.Object");
    }
}
