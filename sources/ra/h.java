package ra;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.net.api.response.notice.CampaignNotice;
import qa.q;

/* loaded from: classes2.dex */
public final class h extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f50605b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f50606c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final sa.o f50607a;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final h a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), qa.p.view_holder_notice_campaign_page_detail, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new h((sa.o) e10, null);
        }
    }

    public h(sa.o oVar) {
        super(oVar.u());
        this.f50607a = oVar;
    }

    public /* synthetic */ h(sa.o oVar, jo.h hVar) {
        this(oVar);
    }

    public final void a(CampaignNotice campaignNotice) {
        jo.p.h(campaignNotice, "campaignNotice");
        AppCompatImageView appCompatImageView = this.f50607a.C;
        jo.p.g(appCompatImageView, "binding.campaignImageView");
        td.a.m(appCompatImageView, campaignNotice.getImageUrl());
        this.f50607a.D.setTextColor(this.itemView.getResources().getColor(qa.l.f48866c));
        if (campaignNotice.isNow() | campaignNotice.isUpcoming()) {
            this.f50607a.C.setAlpha(1.0f);
        } else {
            this.f50607a.C.setAlpha(0.4f);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (campaignNotice.isNow() | campaignNotice.isUpcoming()) {
            if (campaignNotice.isNew()) {
                spannableStringBuilder.append((CharSequence) ("  " + campaignNotice.getText()));
                Drawable f10 = e3.h.f(this.itemView.getResources(), qa.n.ic_new_grapefruit, null);
                if (f10 != null) {
                    f10.setBounds(0, 0, f10.getIntrinsicWidth(), f10.getIntrinsicHeight());
                    spannableStringBuilder.setSpan(new ImageSpan(f10, 1), 0, 1, 34);
                }
            } else {
                spannableStringBuilder.append((CharSequence) campaignNotice.getText());
            }
        } else {
            String string = this.itemView.getContext().getString(q.text_notice_campaign_title_end);
            jo.p.g(string, "itemView.context.getStri…otice_campaign_title_end)");
            spannableStringBuilder.append((CharSequence) string);
            spannableStringBuilder.setSpan(new StyleSpan(1), 0, string.length(), 33);
            spannableStringBuilder.append((CharSequence) campaignNotice.getText());
            Resources resources = this.itemView.getResources();
            int i10 = qa.l.notice_campaign_text_slate;
            spannableStringBuilder.setSpan(new ForegroundColorSpan(resources.getColor(i10)), 0, spannableStringBuilder.length(), 33);
            this.f50607a.D.setTextColor(this.itemView.getResources().getColor(i10));
        }
        this.f50607a.F.setText(spannableStringBuilder);
        this.f50607a.D.setText(campaignNotice.getEventPeriod());
        this.f50607a.G.setVisibility(campaignNotice.getHasReceivableReward() ? 0 : 8);
    }
}
