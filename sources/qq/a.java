package qq;

import io.l;
import io.p;
import java.util.List;
import java.util.Objects;
import jo.q;
import xn.a0;

/* loaded from: classes4.dex */
public final class a<T> {

    /* renamed from: a  reason: collision with root package name */
    public final vq.a f49663a;

    /* renamed from: b  reason: collision with root package name */
    public final qo.b<?> f49664b;

    /* renamed from: c  reason: collision with root package name */
    public final vq.a f49665c;

    /* renamed from: d  reason: collision with root package name */
    public final p<xq.a, uq.a, T> f49666d;

    /* renamed from: e  reason: collision with root package name */
    public final d f49667e;

    /* renamed from: f  reason: collision with root package name */
    public List<? extends qo.b<?>> f49668f;

    /* renamed from: g  reason: collision with root package name */
    public c<T> f49669g;

    /* renamed from: qq.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0750a extends q implements l<qo.b<?>, CharSequence> {

        /* renamed from: w  reason: collision with root package name */
        public static final C0750a f49670w = new C0750a();

        public C0750a() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final CharSequence invoke(qo.b<?> bVar) {
            jo.p.h(bVar, "it");
            return ar.a.a(bVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(vq.a aVar, qo.b<?> bVar, vq.a aVar2, p<? super xq.a, ? super uq.a, ? extends T> pVar, d dVar, List<? extends qo.b<?>> list) {
        jo.p.h(aVar, "scopeQualifier");
        jo.p.h(bVar, "primaryType");
        jo.p.h(pVar, "definition");
        jo.p.h(dVar, "kind");
        jo.p.h(list, "secondaryTypes");
        this.f49663a = aVar;
        this.f49664b = bVar;
        this.f49665c = aVar2;
        this.f49666d = pVar;
        this.f49667e = dVar;
        this.f49668f = list;
        this.f49669g = new c<>(null, 1, null);
    }

    public final p<xq.a, uq.a, T> a() {
        return this.f49666d;
    }

    public final qo.b<?> b() {
        return this.f49664b;
    }

    public final vq.a c() {
        return this.f49665c;
    }

    public final vq.a d() {
        return this.f49663a;
    }

    public final List<qo.b<?>> e() {
        return this.f49668f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type org.koin.core.definition.BeanDefinition<*>");
        a aVar = (a) obj;
        return jo.p.c(this.f49664b, aVar.f49664b) && jo.p.c(this.f49665c, aVar.f49665c) && jo.p.c(this.f49663a, aVar.f49663a);
    }

    public final void f(List<? extends qo.b<?>> list) {
        jo.p.h(list, "<set-?>");
        this.f49668f = list;
    }

    public int hashCode() {
        vq.a aVar = this.f49665c;
        return ((((aVar == null ? 0 : aVar.hashCode()) * 31) + this.f49664b.hashCode()) * 31) + this.f49663a.hashCode();
    }

    public String toString() {
        String o10;
        String str = this.f49667e.toString();
        String str2 = '\'' + ar.a.a(this.f49664b) + '\'';
        if (this.f49665c == null || (o10 = jo.p.o(",qualifier:", c())) == null) {
            o10 = "";
        }
        return '[' + str + ':' + str2 + o10 + (jo.p.c(this.f49663a, wq.c.f59298e.a()) ? "" : jo.p.o(",scope:", d())) + (this.f49668f.isEmpty() ^ true ? jo.p.o(",binds:", a0.g0(this.f49668f, ",", null, null, 0, null, C0750a.f49670w, 30, null)) : "") + ']';
    }
}
