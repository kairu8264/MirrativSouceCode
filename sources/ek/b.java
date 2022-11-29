package ek;

import co.h;
import io.l;
import jo.q;
import uo.p;
import wn.l;
import wn.m;
import wn.v;

/* loaded from: classes3.dex */
public final class b {

    /* loaded from: classes3.dex */
    public static final class a extends q implements l<Throwable, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f30633w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ jk.d f30634x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(io.a aVar, jk.d dVar) {
            super(1);
            this.f30633w = aVar;
            this.f30634x = dVar;
        }

        public final void a(Throwable th2) {
            this.f30633w.invoke();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(Throwable th2) {
            a(th2);
            return v.f59242a;
        }
    }

    /* renamed from: ek.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0306b extends q implements io.a<v> {

        /* renamed from: w  reason: collision with root package name */
        public static final C0306b f30635w = new C0306b();

        public C0306b() {
            super(0);
        }

        public final void a() {
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c<ResultT> implements jk.c<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ p f30636a;

        public c(p pVar) {
            this.f30636a = pVar;
        }

        @Override // jk.c
        public final void onSuccess(T t10) {
            p pVar = this.f30636a;
            l.a aVar = wn.l.f59224w;
            pVar.resumeWith(wn.l.a(t10));
        }
    }

    /* loaded from: classes3.dex */
    public static final class d implements jk.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ p f30637a;

        public d(p pVar) {
            this.f30637a = pVar;
        }

        @Override // jk.b
        public final void a(Exception exc) {
            p pVar = this.f30637a;
            jo.p.d(exc, "exception");
            l.a aVar = wn.l.f59224w;
            pVar.resumeWith(wn.l.a(m.a(exc)));
        }
    }

    public static final <T> Object a(jk.d<T> dVar, io.a<v> aVar, ao.d<? super T> dVar2) {
        uo.q qVar = new uo.q(bo.b.b(dVar2), 1);
        qVar.y();
        qVar.M(new a(aVar, dVar));
        if (dVar.h()) {
            if (dVar.i()) {
                T g10 = dVar.g();
                l.a aVar2 = wn.l.f59224w;
                qVar.resumeWith(wn.l.a(g10));
            } else {
                Exception f10 = dVar.f();
                if (f10 == null) {
                    jo.p.r();
                }
                jo.p.d(f10, "task.exception!!");
                l.a aVar3 = wn.l.f59224w;
                qVar.resumeWith(wn.l.a(m.a(f10)));
            }
        } else {
            dVar.e(new c(qVar));
            jo.p.d(dVar.c(new d(qVar)), "task.addOnFailureListene…ithException(exception) }");
        }
        Object t10 = qVar.t();
        if (t10 == bo.c.c()) {
            h.c(dVar2);
        }
        return t10;
    }

    public static /* synthetic */ Object b(jk.d dVar, io.a aVar, ao.d dVar2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            aVar = C0306b.f30635w;
        }
        return a(dVar, aVar, dVar2);
    }
}
