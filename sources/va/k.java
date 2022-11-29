package va;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.net.api.response.notice.YourNotice;
import com.dena.mirrorman.net.api.response.notice.YourNoticeAttributedText;
import de.n;
import java.util.Iterator;
import jo.p;
import sa.w;

/* loaded from: classes2.dex */
public final class k extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f57266b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f57267c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final w f57268a;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final k a(ViewGroup viewGroup) {
            p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), qa.p.view_holder_notice_your, viewGroup, false);
            p.g(e10, "inflate(\n               …      false\n            )");
            return new k((w) e10, null);
        }
    }

    public k(w wVar) {
        super(wVar.u());
        this.f57268a = wVar;
        wVar.C.setLayoutManager(new LinearLayoutManager(wVar.u().getContext(), 0, false));
        RecyclerView recyclerView = wVar.C;
        View u10 = wVar.u();
        p.g(u10, "binding.root");
        recyclerView.g(new p001if.c(n.b(u10, 6), 0, 0, 0, 0, 0));
        wVar.C.setAdapter(new va.a());
    }

    public /* synthetic */ k(w wVar, jo.h hVar) {
        this(wVar);
    }

    public final void a(YourNotice yourNotice) {
        p.h(yourNotice, "yourNotice");
        this.f57268a.u().setBackgroundResource(yourNotice.isNew() ? qa.n.ripple_tealish30_rectangle_tealish10 : qa.n.ripple_tealish30_rectangle_whitethree);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Iterator<T> it = yourNotice.getAttributedTexts().iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            YourNoticeAttributedText yourNoticeAttributedText = (YourNoticeAttributedText) it.next();
            spannableStringBuilder.append((CharSequence) yourNoticeAttributedText.getText());
            if (yourNoticeAttributedText.isBold()) {
                spannableStringBuilder.setSpan(new StyleSpan(1), i10, yourNoticeAttributedText.getText().length() + i10, 33);
            }
            i10 += yourNoticeAttributedText.getText().length();
        }
        this.f57268a.G.setText(spannableStringBuilder);
        this.f57268a.C.setVisibility(yourNotice.getSmallIconImageUrls().isEmpty() ? 8 : 0);
        RecyclerView.h adapter = this.f57268a.C.getAdapter();
        p.f(adapter, "null cannot be cast to non-null type com.dena.mirrativ.notification.your.NoticeFollowerAdapter");
        ((va.a) adapter).c(yourNotice.getSmallIconImageUrls());
        w wVar = this.f57268a;
        AppCompatTextView appCompatTextView = wVar.B;
        of.c cVar = of.c.f45387a;
        Context context = wVar.u().getContext();
        p.g(context, "binding.root.context");
        appCompatTextView.setText(cVar.f(context, System.currentTimeMillis(), yourNotice.getCreatedAt() * 1000));
        if (yourNotice.getImageUrl().length() > 0) {
            this.f57268a.F.setVisibility(0);
            this.f57268a.D.setVisibility(8);
            AppCompatImageView appCompatImageView = this.f57268a.F;
            p.g(appCompatImageView, "binding.imageView");
            td.a.m(appCompatImageView, yourNotice.getImageUrl());
            return;
        }
        if (yourNotice.getIconImageUrl().length() > 0) {
            this.f57268a.F.setVisibility(8);
            this.f57268a.D.setVisibility(0);
            AppCompatImageView appCompatImageView2 = this.f57268a.D;
            p.g(appCompatImageView2, "binding.iconImageView");
            td.a.D(appCompatImageView2, yourNotice.getIconImageUrl());
            return;
        }
        this.f57268a.F.setVisibility(8);
        this.f57268a.D.setVisibility(0);
        this.f57268a.D.setImageResource(qa.n.f48871b);
    }
}
