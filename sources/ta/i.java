package ta;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.net.api.response.notice.NewsNotice;
import jo.p;
import qa.n;
import sa.s;

/* loaded from: classes2.dex */
public final class i extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f53419b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f53420c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final s f53421a;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final i a(ViewGroup viewGroup) {
            p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), qa.p.view_holder_notice_news, viewGroup, false);
            p.g(e10, "inflate(\n               …      false\n            )");
            return new i((s) e10, null);
        }
    }

    public i(s sVar) {
        super(sVar.u());
        this.f53421a = sVar;
    }

    public /* synthetic */ i(s sVar, jo.h hVar) {
        this(sVar);
    }

    public final void a(NewsNotice newsNotice) {
        p.h(newsNotice, "newsNotice");
        this.f53421a.u().setBackgroundResource(newsNotice.isNew() ? n.ripple_tealish30_rectangle_tealish10 : n.ripple_tealish30_rectangle_whitethree);
        this.f53421a.E.setText(newsNotice.getTitle());
        this.f53421a.E.setVisibility(newsNotice.getTitle().length() == 0 ? 8 : 0);
        AppCompatImageView appCompatImageView = this.f53421a.C;
        p.g(appCompatImageView, "binding.imageView");
        td.a.p(appCompatImageView, newsNotice.getImageUrl());
        this.f53421a.C.setVisibility(newsNotice.getImageUrl().length() == 0 ? 8 : 0);
        this.f53421a.D.setText(newsNotice.getText());
        s sVar = this.f53421a;
        AppCompatTextView appCompatTextView = sVar.B;
        of.c cVar = of.c.f45387a;
        Context context = sVar.u().getContext();
        p.g(context, "binding.root.context");
        appCompatTextView.setText(cVar.f(context, System.currentTimeMillis(), newsNotice.getCreatedAt() * 1000));
    }
}
