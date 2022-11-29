package g8;

import g8.b;

/* loaded from: classes.dex */
public class a<R> implements b<R> {

    /* renamed from: a  reason: collision with root package name */
    public static final a<?> f32824a = new a<>();

    /* renamed from: b  reason: collision with root package name */
    public static final c<?> f32825b = new C0381a();

    /* renamed from: g8.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0381a<R> implements c<R> {
        @Override // g8.c
        public b<R> a(m7.a aVar, boolean z10) {
            return a.f32824a;
        }
    }

    public static <R> c<R> b() {
        return (c<R>) f32825b;
    }

    @Override // g8.b
    public boolean a(Object obj, b.a aVar) {
        return false;
    }
}
