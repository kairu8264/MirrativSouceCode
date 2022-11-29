package xb;

import ac.x6;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import yd.g1;

/* loaded from: classes2.dex */
public final class x extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f60114b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f60115c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final x6 f60116a;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final x a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), p.view_holder_ranking_focus_event, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new x((x6) e10, null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.l<View, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.l<t, wn.v> f60117w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ t f60118x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(io.l<? super t, wn.v> lVar, t tVar) {
            super(1);
            this.f60117w = lVar;
            this.f60118x = tVar;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            io.l<t, wn.v> lVar = this.f60117w;
            if (lVar != null) {
                lVar.invoke(this.f60118x);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    public x(x6 x6Var) {
        super(x6Var.u());
        this.f60116a = x6Var;
    }

    public /* synthetic */ x(x6 x6Var, jo.h hVar) {
        this(x6Var);
    }

    public final void a(t tVar, io.l<? super t, wn.v> lVar) {
        jo.p.h(tVar, "bindModel");
        AppCompatImageView appCompatImageView = this.f60116a.B;
        jo.p.g(appCompatImageView, "binding.focusEventImageView");
        td.a.t(appCompatImageView, tVar.f(), 4, null, null);
        if (tVar.i()) {
            this.f60116a.B.setAlpha(1.0f);
            View view = this.f60116a.C;
            jo.p.g(view, "binding.roundBorderView");
            td.c.c(view, 4, 2, Integer.valueOf(c3.a.d(this.f60116a.u().getContext(), l.f59943n)), Integer.valueOf(c3.a.d(this.f60116a.u().getContext(), l.whiteThree20)));
        } else {
            this.f60116a.B.setAlpha(tVar.e() ? 0.4f : 1.0f);
            View view2 = this.f60116a.C;
            jo.p.g(view2, "binding.roundBorderView");
            td.c.c(view2, 4, 0, Integer.valueOf(c3.a.d(this.f60116a.u().getContext(), l.thumbnail_frame_not_selected_border)), Integer.valueOf(c3.a.d(this.f60116a.u().getContext(), l.whiteThree20)));
        }
        View view3 = this.itemView;
        jo.p.g(view3, "itemView");
        g1.a(view3, new b(lVar, tVar));
    }
}
