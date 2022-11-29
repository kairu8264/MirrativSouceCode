package qf;

import ae.u7;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.net.api.response.user.UrgeUser;
import com.dena.mirrorman.net.glide.GlideApp;

/* loaded from: classes3.dex */
public final class h3 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49207b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49208c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final u7 f49209a;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final h3 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.item_userlist_urge_home, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new h3((u7) e10, null);
        }
    }

    public h3(u7 u7Var) {
        super(u7Var.u());
        this.f49209a = u7Var;
    }

    public /* synthetic */ h3(u7 u7Var, jo.h hVar) {
        this(u7Var);
    }

    @SuppressLint({"SetTextI18n"})
    public final void a(UrgeUser urgeUser) {
        jo.p.h(urgeUser, "urgeUser");
        this.f49209a.G.setText(urgeUser.getName());
        GlideApp.with(this.itemView.getContext()).load(urgeUser.getProfileImageUrl()).placeholder(nd.y0.W1).apply((e8.a<?>) new e8.h().circleCrop()).into(this.f49209a.D);
        this.f49209a.C.setVisibility(0);
        if (urgeUser.getRequestFollow()) {
            this.f49209a.C.setBackgroundResource(nd.y0.btn_checkbox_checked);
        } else {
            this.f49209a.C.setBackgroundResource(nd.y0.btn_checkbox_default);
        }
        if (of.b.a(urgeUser.getBadges())) {
            this.f49209a.B.setVisibility(8);
        } else {
            this.f49209a.B.setVisibility(0);
            of.f fVar = of.f.f45394a;
            Context context = this.itemView.getContext();
            jo.p.g(context, "itemView.context");
            fVar.c(context, urgeUser.getBadges().get(0).getSmallImageUrl(), this.f49209a.B);
        }
        if (urgeUser.getReason() != null && !TextUtils.isEmpty(urgeUser.getReason().getText())) {
            this.f49209a.H.setVisibility(8);
            this.f49209a.F.setVisibility(0);
            this.f49209a.F.setText(urgeUser.getReason().getText());
            this.f49209a.F.setTextColor(Color.parseColor('#' + Integer.toHexString(urgeUser.getReason().getColor())));
            this.f49209a.F.setBackgroundColor(this.itemView.getContext().getResources().getColor(nd.w0.X0));
            return;
        }
        this.f49209a.F.setVisibility(8);
        this.f49209a.H.setVisibility(0);
        AppCompatTextView appCompatTextView = this.f49209a.H;
        appCompatTextView.setText(urgeUser.getTotalViewerNum() + "view");
    }

    public final void b(boolean z10) {
        if (z10) {
            this.f49209a.C.setBackgroundResource(nd.y0.btn_checkbox_checked);
        } else {
            this.f49209a.C.setBackgroundResource(nd.y0.btn_checkbox_default);
        }
    }
}
