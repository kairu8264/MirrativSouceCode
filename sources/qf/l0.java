package qf;

import ae.ae;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.user.UrgeUser;
import com.dena.mirrorman.net.api.response.user.UserBadgeImageUrl;
import com.dena.mirrorman.net.glide.GlideApp;
import java.util.List;

/* loaded from: classes3.dex */
public final class l0 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49280b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49281c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final ae f49282a;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final l0 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_follow_push_setting, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new l0((ae) e10, null);
        }
    }

    public l0(ae aeVar) {
        super(aeVar.u());
        this.f49282a = aeVar;
    }

    public /* synthetic */ l0(ae aeVar, jo.h hVar) {
        this(aeVar);
    }

    public static final void c(io.l lVar, CompoundButton compoundButton, boolean z10) {
        jo.p.h(lVar, "$onCheckedChangeListener");
        lVar.invoke(Boolean.valueOf(z10));
    }

    public final void b(UrgeUser urgeUser, final io.l<? super Boolean, wn.v> lVar) {
        jo.p.h(urgeUser, MRLog.TARGET_TYPE_USER);
        jo.p.h(lVar, "onCheckedChangeListener");
        this.f49282a.F.setText(urgeUser.getName());
        this.f49282a.C.setText(urgeUser.getDescription());
        GlideApp.with(this.f49282a.D).load(urgeUser.getProfileImageUrl()).placeholder(nd.y0.X1).apply((e8.a<?>) new e8.h().circleCrop()).into(this.f49282a.D);
        List<UserBadgeImageUrl> badges = urgeUser.getBadges();
        if (badges == null || badges.isEmpty()) {
            this.f49282a.B.setVisibility(8);
        } else {
            of.f fVar = of.f.f45394a;
            Context context = this.f49282a.u().getContext();
            jo.p.g(context, "binding.root.context");
            fVar.c(context, urgeUser.getBadges().get(0).getImageUrl(), this.f49282a.B);
            this.f49282a.B.setVisibility(0);
        }
        this.f49282a.E.setVisibility(0);
        this.f49282a.E.setOnCheckedChangeListener(null);
        this.f49282a.E.setChecked(urgeUser.getPushEnabled());
        this.f49282a.E.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: qf.k0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                l0.c(io.l.this, compoundButton, z10);
            }
        });
    }
}
