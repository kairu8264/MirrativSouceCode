package qb;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import hb.b2;
import hb.x1;
import kb.c1;
import ud.e2;

/* loaded from: classes2.dex */
public final class x extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f48948b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f48949c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final c1 f48950a;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final x a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), x1.view_holder_live_viewers_info, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new x((c1) e10, null);
        }
    }

    public x(c1 c1Var) {
        super(c1Var.u());
        this.f48950a = c1Var;
    }

    public /* synthetic */ x(c1 c1Var, jo.h hVar) {
        this(c1Var);
    }

    @SuppressLint({"SetTextI18n"})
    public final void a(e2 e2Var) {
        jo.p.h(e2Var, "viewModel");
        String string = this.f48950a.u().getResources().getString(b2.text_current_viewer_count, String.valueOf(e2Var.a()));
        jo.p.g(string, "binding.root.resources.g…ount.toString()\n        )");
        String string2 = this.f48950a.u().getResources().getString(b2.text_total_viewer_count, String.valueOf(e2Var.b()));
        jo.p.g(string2, "binding.root.resources.g…ount.toString()\n        )");
        AppCompatTextView appCompatTextView = this.f48950a.B;
        appCompatTextView.setText(string + '/' + string2);
    }
}
