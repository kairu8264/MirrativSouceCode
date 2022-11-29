package lc;

import ac.f7;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class p0 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f39950b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f39951c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final f7 f39952a;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final p0 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), xb.p.view_holder_thumbnail_frame_v2, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new p0((f7) e10, null);
        }
    }

    public p0(f7 f7Var) {
        super(f7Var.u());
        this.f39952a = f7Var;
    }

    public /* synthetic */ p0(f7 f7Var, jo.h hVar) {
        this(f7Var);
    }

    public final void a(o0 o0Var) {
        jo.p.h(o0Var, "thumbnailFrameBindModel");
        AppCompatImageView appCompatImageView = this.f39952a.C;
        jo.p.g(appCompatImageView, "binding.thumbnailImageView");
        td.a.t(appCompatImageView, o0Var.a(), 4, null, null);
        if (o0Var.c()) {
            View view = this.f39952a.B;
            jo.p.g(view, "binding.roundBorderView");
            td.c.c(view, 4, 2, Integer.valueOf(c3.a.d(this.f39952a.u().getContext(), xb.l.f59943n)), Integer.valueOf(c3.a.d(this.f39952a.u().getContext(), xb.l.whiteThree20)));
            return;
        }
        View view2 = this.f39952a.B;
        jo.p.g(view2, "binding.roundBorderView");
        td.c.c(view2, 4, 0, Integer.valueOf(c3.a.d(this.f39952a.u().getContext(), xb.l.thumbnail_frame_not_selected_border)), Integer.valueOf(c3.a.d(this.f39952a.u().getContext(), xb.l.whiteThree20)));
    }
}
