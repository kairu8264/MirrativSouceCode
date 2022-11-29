package qf;

import ae.sd;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.customview.RoundedButtonView;
import ud.s4;

/* loaded from: classes3.dex */
public final class b0 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49055b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49056c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final sd f49057a;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final b0 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_emomo_comment_shooter_matching_viewer_enter, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new b0((sd) e10, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends jo.q implements io.l<View, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f49058w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(io.a<wn.v> aVar) {
            super(1);
            this.f49058w = aVar;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            io.a<wn.v> aVar = this.f49058w;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    public b0(sd sdVar) {
        super(sdVar.u());
        this.f49057a = sdVar;
    }

    public /* synthetic */ b0(sd sdVar, jo.h hVar) {
        this(sdVar);
    }

    public final void a(s4 s4Var, io.a<wn.v> aVar) {
        jo.p.h(s4Var, "bindModel");
        AppCompatImageView appCompatImageView = this.f49057a.D;
        jo.p.g(appCompatImageView, "binding.profileImageView");
        td.a.i(appCompatImageView, s4Var.f());
        AppCompatTextView appCompatTextView = this.f49057a.B;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(s4Var.a());
        int U = so.o.U(spannableStringBuilder, s4Var.c(), 0, false, 6, null);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(c3.a.d(this.f49057a.u().getContext(), nd.w0.f42242u0)), U, s4Var.c().length() + U, 33);
        appCompatTextView.setText(spannableStringBuilder);
        RoundedButtonView roundedButtonView = this.f49057a.C;
        jo.p.g(roundedButtonView, "binding.playButtonView");
        yd.g1.a(roundedButtonView, new b(aVar));
    }
}
