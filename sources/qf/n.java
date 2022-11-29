package qf;

import ae.wc;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import ud.u4;

/* loaded from: classes3.dex */
public final class n extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49300b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49301c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final wc f49302a;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final n a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_comment_live_shared, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new n((wc) e10, null);
        }
    }

    public n(wc wcVar) {
        super(wcVar.u());
        this.f49302a = wcVar;
    }

    public /* synthetic */ n(wc wcVar, jo.h hVar) {
        this(wcVar);
    }

    public final void a(u4 u4Var) {
        jo.p.h(u4Var, "bindModel");
        AppCompatImageView appCompatImageView = this.f49302a.D;
        jo.p.g(appCompatImageView, "binding.profileImageView");
        td.a.i(appCompatImageView, u4Var.f());
        AppCompatImageView appCompatImageView2 = this.f49302a.B;
        jo.p.g(appCompatImageView2, "binding.badgeImageView");
        td.a.f(appCompatImageView2, u4Var.g());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (u4Var.i()) {
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.setSpan(new ImageSpan(this.f49302a.u().getContext(), nd.y0.ic_moderator, 1), 0, 1, 33);
        }
        spannableStringBuilder.append((CharSequence) u4Var.a());
        this.f49302a.F.setText(spannableStringBuilder);
        this.f49302a.o();
    }
}
