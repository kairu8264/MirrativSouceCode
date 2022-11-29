package yd;

import android.view.View;

/* loaded from: classes2.dex */
public final class g1 {

    /* loaded from: classes2.dex */
    public static final class a extends jo.q implements io.l<View, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.l<View, wn.v> f61730w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(io.l<? super View, wn.v> lVar) {
            super(1);
            this.f61730w = lVar;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            this.f61730w.invoke(view);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    public static final void a(View view, io.l<? super View, wn.v> lVar) {
        jo.p.h(view, "<this>");
        jo.p.h(lVar, "onSafeClick");
        view.setOnClickListener(new f1(0, new a(lVar), 1, null));
    }
}
