package qf;

import ae.id;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import ud.l4;

/* loaded from: classes3.dex */
public final class w extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49411b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49412c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final id f49413a;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final w a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_emomo_comment_collab_recommend_live, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new w((id) e10, null);
        }
    }

    public w(id idVar) {
        super(idVar.u());
        this.f49413a = idVar;
    }

    public /* synthetic */ w(id idVar, jo.h hVar) {
        this(idVar);
    }

    public static final void c(io.l lVar, l4 l4Var, View view) {
        jo.p.h(lVar, "$clickListener");
        jo.p.h(l4Var, "$bindModel");
        lVar.invoke(l4Var.b());
    }

    public final void b(final l4 l4Var, final io.l<? super String, wn.v> lVar) {
        jo.p.h(l4Var, "bindModel");
        jo.p.h(lVar, "clickListener");
        AppCompatImageView appCompatImageView = this.f49413a.D;
        jo.p.g(appCompatImageView, "binding.profileImageView");
        de.f.e(appCompatImageView, l4Var.f(), Integer.valueOf(nd.y0.f42251g2));
        AppCompatImageView appCompatImageView2 = this.f49413a.B;
        jo.p.g(appCompatImageView2, "binding.badgeImage");
        td.a.f(appCompatImageView2, l4Var.g());
        int d10 = c3.a.d(this.f49413a.u().getContext(), nd.w0.f42242u0);
        String c10 = l4Var.c();
        AppCompatTextView appCompatTextView = this.f49413a.C;
        SpannableString spannableString = new SpannableString(l4Var.c() + ' ' + l4Var.a());
        spannableString.setSpan(new ForegroundColorSpan(d10), 0, c10.length(), 33);
        appCompatTextView.setText(spannableString);
        this.f49413a.E.setOnClickListener(new View.OnClickListener() { // from class: qf.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w.c(io.l.this, l4Var, view);
            }
        });
        this.f49413a.o();
    }
}
