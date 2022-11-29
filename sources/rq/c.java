package rq;

import jo.h;
import jo.p;
import org.koin.core.error.InstanceCreationException;

/* loaded from: classes4.dex */
public abstract class c<T> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f51746b = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final qq.a<T> f51747a;

    /* loaded from: classes4.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    public c(qq.a<T> aVar) {
        p.h(aVar, "beanDefinition");
        this.f51747a = aVar;
    }

    public T a(b bVar) {
        p.h(bVar, "context");
        nq.a a10 = bVar.a();
        if (a10.d().f(sq.b.DEBUG)) {
            a10.d().b(p.o("| create instance for ", this.f51747a));
        }
        try {
            uq.a b10 = bVar.b();
            if (b10 == null) {
                b10 = uq.b.a();
            }
            return this.f51747a.a().invoke(bVar.c(), b10);
        } catch (Exception e10) {
            String d10 = cr.a.f28611a.d(e10);
            sq.c d11 = a10.d();
            d11.d("Instance creation error : could not create instance for " + this.f51747a + ": " + d10);
            throw new InstanceCreationException(p.o("Could not create instance for ", this.f51747a), e10);
        }
    }

    public abstract T b(b bVar);

    public final qq.a<T> c() {
        return this.f51747a;
    }
}
