package w6;

import jo.p;

/* loaded from: classes.dex */
public final class m {

    /* loaded from: classes.dex */
    public static final class a extends g7.c<T> {

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ io.l<g7.b<T>, T> f58190d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(io.l<? super g7.b<T>, ? extends T> lVar) {
            this.f58190d = lVar;
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
        @Override // g7.c
        public T a(g7.b<T> bVar) {
            p.h(bVar, "frameInfo");
            return this.f58190d.invoke(bVar);
        }
    }

    public static final <T> a b(io.l<? super g7.b<T>, ? extends T> lVar) {
        return new a(lVar);
    }
}
