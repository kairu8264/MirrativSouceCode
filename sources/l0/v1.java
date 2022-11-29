package l0;

import com.google.android.exoplayer2.text.ttml.TtmlNode;

/* loaded from: classes.dex */
public final /* synthetic */ class v1 {

    /* renamed from: a  reason: collision with root package name */
    public static final a2<n0.e<wn.k<io.l<x<?>, wn.v>, io.l<x<?>, wn.v>>>> f39287a = new a2<>();

    /* renamed from: b  reason: collision with root package name */
    public static final a2<Boolean> f39288b = new a2<>();

    public static final <T> c2<T> c(io.a<? extends T> aVar) {
        jo.p.h(aVar, "calculation");
        return new w(aVar);
    }

    public static final <R> void d(io.l<? super c2<?>, wn.v> lVar, io.l<? super c2<?>, wn.v> lVar2, io.a<? extends R> aVar) {
        jo.p.h(lVar, TtmlNode.START);
        jo.p.h(lVar2, "done");
        jo.p.h(aVar, "block");
        a2<n0.e<wn.k<io.l<x<?>, wn.v>, io.l<x<?>, wn.v>>>> a2Var = f39287a;
        n0.e<wn.k<io.l<x<?>, wn.v>, io.l<x<?>, wn.v>>> a10 = a2Var.a();
        try {
            n0.e<wn.k<io.l<x<?>, wn.v>, io.l<x<?>, wn.v>>> a11 = a2Var.a();
            if (a11 == null) {
                a11 = n0.a.b();
            }
            a2Var.b(a11.add((n0.e<wn.k<io.l<x<?>, wn.v>, io.l<x<?>, wn.v>>>) wn.q.a(lVar, lVar2)));
            aVar.invoke();
            a2Var.b(a10);
        } catch (Throwable th2) {
            f39287a.b(a10);
            throw th2;
        }
    }
}
