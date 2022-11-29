package qf;

import ae.yc;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class p extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49318b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49319c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final yc f49320a;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final p a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_editable_next_live_announcement, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new p((yc) e10, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends jo.q implements io.l<View, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f49321w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(io.a<wn.v> aVar) {
            super(1);
            this.f49321w = aVar;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            this.f49321w.invoke();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    public p(yc ycVar) {
        super(ycVar.u());
        this.f49320a = ycVar;
        Context context = ycVar.u().getContext();
        ycVar.M(context instanceof androidx.lifecycle.u ? (androidx.lifecycle.u) context : null);
    }

    public /* synthetic */ p(yc ycVar, jo.h hVar) {
        this(ycVar);
    }

    public final void a(io.a<wn.v> aVar) {
        jo.p.h(aVar, "onClicked");
        ConstraintLayout constraintLayout = this.f49320a.D;
        jo.p.g(constraintLayout, "binding.timeSetView");
        yd.g1.a(constraintLayout, new b(aVar));
    }
}
