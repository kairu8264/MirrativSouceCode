package qf;

import ae.cd;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.customview.YellRankIconView;
import com.dena.mirrorman.net.glide.GlideApp;
import ud.d4;
import ud.j4;

/* loaded from: classes3.dex */
public final class c0 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49082b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49083c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final cd f49084a;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final c0 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_emomo_comment, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new c0((cd) e10, null);
        }
    }

    public c0(cd cdVar) {
        super(cdVar.u());
        this.f49084a = cdVar;
    }

    public /* synthetic */ c0(cd cdVar, jo.h hVar) {
        this(cdVar);
    }

    public final void a(d4 d4Var, boolean z10, boolean z11, we.g gVar, int i10) {
        int i11;
        jo.p.h(d4Var, "bindModel");
        jo.p.h(gVar, "yellRank");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z10) {
            Drawable f10 = c3.a.f(this.f49084a.u().getContext(), nd.y0.H1);
            if (f10 == null) {
                return;
            }
            jo.p.g(f10, "ContextCompat.getDrawabl…ic_cheerleader) ?: return");
            f10.setBounds(0, 0, de.m.a(this, 12), de.m.a(this, 12));
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.setSpan(new ImageSpan(f10, 1), 0, 1, 33);
        } else if (z11) {
            Drawable f11 = c3.a.f(this.f49084a.u().getContext(), nd.y0.ic_moderator);
            if (f11 == null) {
                return;
            }
            jo.p.g(f11, "ContextCompat.getDrawabl…e.ic_moderator) ?: return");
            f11.setBounds(0, 0, de.m.a(this, 12), de.m.a(this, 12));
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.setSpan(new ImageSpan(f11, 1), 0, 1, 33);
        }
        if (gVar != we.g.NONE) {
            spannableStringBuilder.append((CharSequence) " ");
            if (z11 | z10) {
                spannableStringBuilder.append((CharSequence) " ");
            }
            Context context = this.f49084a.u().getContext();
            jo.p.g(context, "binding.root.context");
            spannableStringBuilder.setSpan(b(context, gVar, i10), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) " ");
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        j4 j4Var = d4Var instanceof j4 ? (j4) d4Var : null;
        if (j4Var != null) {
            spannableStringBuilder2.append((CharSequence) j4Var.j());
        } else {
            spannableStringBuilder2.append((CharSequence) d4Var.c());
        }
        Context context2 = this.f49084a.u().getContext();
        if (z10) {
            i11 = nd.w0.Q;
        } else if (z11) {
            i11 = nd.w0.moderator;
        } else {
            i11 = nd.w0.f42242u0;
        }
        spannableStringBuilder2.setSpan(new ForegroundColorSpan(c3.a.d(context2, i11)), so.o.U(spannableStringBuilder2, d4Var.c(), 0, false, 6, null), so.o.U(spannableStringBuilder2, d4Var.c(), 0, false, 6, null) + d4Var.c().length(), 33);
        spannableStringBuilder2.append((CharSequence) d4Var.a());
        spannableStringBuilder2.setSpan(new ForegroundColorSpan(c3.a.d(this.f49084a.u().getContext(), nd.w0.U0)), so.o.U(spannableStringBuilder2, d4Var.a(), d4Var.c().length(), false, 4, null), so.o.U(spannableStringBuilder2, d4Var.a(), d4Var.c().length(), false, 4, null) + d4Var.a().length(), 33);
        this.f49084a.D.setText(TextUtils.concat(spannableStringBuilder, spannableStringBuilder2));
        if (d4Var.d() == 123456) {
            GlideApp.with(this.f49084a.E).load(Integer.valueOf(nd.y0.f42251g2)).apply((e8.a<?>) new e8.h().circleCrop()).into(this.f49084a.E);
        } else {
            AppCompatImageView appCompatImageView = this.f49084a.E;
            jo.p.g(appCompatImageView, "binding.profileImage");
            de.f.e(appCompatImageView, d4Var.f(), Integer.valueOf(nd.y0.U1));
        }
        if (d4Var.d() == 123456) {
            this.f49084a.B.setVisibility(0);
            this.f49084a.B.setImageResource(nd.y0.ic_official_badge);
        } else if (TextUtils.isEmpty(d4Var.g())) {
            this.f49084a.B.setVisibility(4);
        } else {
            this.f49084a.B.setVisibility(0);
            of.f fVar = of.f.f45394a;
            Context context3 = this.f49084a.B.getContext();
            jo.p.g(context3, "binding.badgeImage.context");
            fVar.c(context3, d4Var.g(), this.f49084a.B);
        }
        this.f49084a.o();
    }

    public final ImageSpan b(Context context, we.g gVar, int i10) {
        YellRankIconView yellRankIconView = new YellRankIconView(context);
        yellRankIconView.a(gVar, Integer.valueOf(i10));
        Bitmap b10 = yellRankIconView.b();
        return new ImageSpan(context, Bitmap.createScaledBitmap(b10, (int) (b10.getWidth() * 0.9d), (int) (b10.getHeight() * 0.9d), true), 0);
    }
}
