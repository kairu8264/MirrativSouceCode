package de;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import java.util.List;
import wn.l;
import wn.v;

/* loaded from: classes2.dex */
public final class h {

    /* loaded from: classes2.dex */
    public static final class a implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ao.d<v> f29601w;

        /* JADX WARN: Multi-variable type inference failed */
        public a(ao.d<? super v> dVar) {
            this.f29601w = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ao.d<v> dVar = this.f29601w;
            l.a aVar = wn.l.f59224w;
            dVar.resumeWith(wn.l.a(v.f59242a));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, VH extends RecyclerView.e0> Object a(t<T, VH> tVar, List<? extends T> list, ao.d<? super v> dVar) {
        ao.i iVar = new ao.i(bo.b.b(dVar));
        tVar.f(list, new a(iVar));
        Object a10 = iVar.a();
        if (a10 == bo.c.c()) {
            co.h.c(dVar);
        }
        return a10 == bo.c.c() ? a10 : v.f59242a;
    }
}
