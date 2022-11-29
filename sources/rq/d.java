package rq;

import jo.p;
import jo.q;
import wn.v;

/* loaded from: classes4.dex */
public final class d<T> extends c<T> {

    /* renamed from: c  reason: collision with root package name */
    public T f51748c;

    /* loaded from: classes4.dex */
    public static final class a extends q implements io.a<v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ d<T> f51749w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ b f51750x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d<T> dVar, b bVar) {
            super(0);
            this.f51749w = dVar;
            this.f51750x = bVar;
        }

        public final void a() {
            if (this.f51749w.f(this.f51750x)) {
                return;
            }
            d<T> dVar = this.f51749w;
            dVar.f51748c = dVar.a(this.f51750x);
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(qq.a<T> aVar) {
        super(aVar);
        p.h(aVar, "beanDefinition");
    }

    @Override // rq.c
    public T a(b bVar) {
        p.h(bVar, "context");
        if (this.f51748c == null) {
            return (T) super.a(bVar);
        }
        return e();
    }

    @Override // rq.c
    public T b(b bVar) {
        p.h(bVar, "context");
        cr.a.f28611a.f(this, new a(this, bVar));
        return e();
    }

    public final T e() {
        T t10 = this.f51748c;
        if (t10 != null) {
            return t10;
        }
        throw new IllegalStateException("Single instance created couldn't return value".toString());
    }

    public boolean f(b bVar) {
        return this.f51748c != null;
    }
}
