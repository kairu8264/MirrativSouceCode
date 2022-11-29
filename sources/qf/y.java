package qf;

import ae.md;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.customview.YellRankIconView;
import ud.p4;

/* loaded from: classes3.dex */
public final class y extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49440b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49441c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final md f49442a;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final y a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_emomo_comment_gift, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new y((md) e10, null);
        }
    }

    public y(md mdVar) {
        super(mdVar.u());
        this.f49442a = mdVar;
    }

    public /* synthetic */ y(md mdVar, jo.h hVar) {
        this(mdVar);
    }

    public final void a(p4 p4Var) {
        jo.p.h(p4Var, "bindModel");
        this.f49442a.C.setBackgroundResource(p4Var.i());
        AppCompatImageView appCompatImageView = this.f49442a.G;
        jo.p.g(appCompatImageView, "binding.profileImage");
        de.f.e(appCompatImageView, p4Var.f(), Integer.valueOf(nd.y0.U1));
        if (TextUtils.isEmpty(p4Var.g())) {
            this.f49442a.B.setVisibility(4);
        } else {
            this.f49442a.B.setVisibility(0);
            of.f fVar = of.f.f45394a;
            Context context = this.f49442a.B.getContext();
            jo.p.g(context, "binding.badgeImage.context");
            fVar.c(context, p4Var.g(), this.f49442a.B);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (p4Var.p()) {
            Drawable f10 = c3.a.f(this.f49442a.u().getContext(), nd.y0.H1);
            if (f10 == null) {
                return;
            }
            jo.p.g(f10, "ContextCompat.getDrawabl…ic_cheerleader) ?: return");
            f10.setBounds(0, 0, de.m.a(this, 12), de.m.a(this, 12));
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.setSpan(new ImageSpan(f10, 1), 0, 1, 33);
        } else if (p4Var.q()) {
            Drawable f11 = c3.a.f(this.f49442a.u().getContext(), nd.y0.ic_moderator);
            if (f11 == null) {
                return;
            }
            jo.p.g(f11, "ContextCompat.getDrawabl…e.ic_moderator) ?: return");
            f11.setBounds(0, 0, de.m.a(this, 12), de.m.a(this, 12));
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.setSpan(new ImageSpan(f11, 1), 0, 1, 33);
        }
        if (p4Var.o() != we.g.NONE) {
            spannableStringBuilder.append((CharSequence) " ");
            if (p4Var.q() | p4Var.p()) {
                spannableStringBuilder.append((CharSequence) " ");
            }
            Context context2 = this.f49442a.u().getContext();
            jo.p.g(context2, "binding.root.context");
            spannableStringBuilder.setSpan(b(context2, p4Var.o(), p4Var.n()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) " ");
        }
        spannableStringBuilder.append((CharSequence) this.f49442a.F.getContext().getString(nd.f1.text_gift_comment_user, p4Var.c()));
        if (p4Var.j().length() > 0) {
            spannableStringBuilder.append((CharSequence) this.f49442a.u().getContext().getString(nd.f1.text_gift_comment_target_user, p4Var.j()));
        }
        this.f49442a.F.setText(TextUtils.concat(spannableStringBuilder, p4Var.l()));
        if (p4Var.j().length() == 0) {
            this.f49442a.E.setAlpha(1.0f);
        } else {
            this.f49442a.E.setAlpha(0.5f);
        }
        this.f49442a.o();
    }

    public final ImageSpan b(Context context, we.g gVar, int i10) {
        YellRankIconView yellRankIconView = new YellRankIconView(context);
        yellRankIconView.a(gVar, Integer.valueOf(i10));
        Bitmap b10 = yellRankIconView.b();
        return new ImageSpan(context, Bitmap.createScaledBitmap(b10, (int) (b10.getWidth() * 0.9d), (int) (b10.getHeight() * 0.9d), true), 0);
    }
}
