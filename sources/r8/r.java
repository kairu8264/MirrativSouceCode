package r8;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.net.api.response.user.UserBadgeImageUrl;
import com.dena.mirrorman.net.glide.GlideApp;
import java.util.List;
import ud.u1;

/* loaded from: classes.dex */
public final class r extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49984b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49985c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final t8.s0 f49986a;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final r a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            t8.s0 T = t8.s0.T(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            jo.p.g(T, "inflate(\n               …      false\n            )");
            return new r(T);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(t8.s0 s0Var) {
        super(s0Var.u());
        jo.p.h(s0Var, "binding");
        this.f49986a = s0Var;
    }

    public static final void d(io.l lVar, s8.f fVar, View view) {
        jo.p.h(fVar, "$bindModel");
        if (lVar != null) {
            lVar.invoke(fVar.f());
        }
    }

    public static final boolean f(r rVar, View view, MotionEvent motionEvent) {
        jo.p.h(rVar, "this$0");
        int action = motionEvent.getAction();
        if (action == 0) {
            rVar.f49986a.u().startAnimation(AnimationUtils.loadAnimation(rVar.f49986a.u().getContext(), z0.live_catalog_item_scale_down_animation));
            return false;
        } else if (action == 1 || action == 3) {
            rVar.f49986a.u().startAnimation(AnimationUtils.loadAnimation(rVar.f49986a.u().getContext(), z0.live_catalog_item_scale_up_animation));
            return false;
        } else {
            return false;
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void c(final s8.f fVar, final io.l<? super String, wn.v> lVar) {
        String smallImageUrl;
        jo.p.h(fVar, "bindModel");
        t8.s0 s0Var = this.f49986a;
        s0Var.B.setText(fVar.b());
        s0Var.H.setText(fVar.d().getName());
        boolean z10 = true;
        if (fVar.c().length() == 0) {
            this.f49986a.D.setVisibility(8);
        } else {
            this.f49986a.D.setVisibility(0);
            this.f49986a.D.setText(fVar.c());
        }
        GlideApp.with(this.itemView.getContext()).load(fVar.d().getProfileImageUrl()).placeholder(d1.f49850k).apply((e8.a<?>) new e8.h().circleCrop()).into(this.f49986a.G);
        List<UserBadgeImageUrl> badges = fVar.d().getBadges();
        if (badges != null && !badges.isEmpty()) {
            z10 = false;
        }
        if (z10) {
            this.f49986a.C.setVisibility(8);
        } else {
            UserBadgeImageUrl userBadgeImageUrl = (UserBadgeImageUrl) xn.a0.Z(fVar.d().getBadges());
            if (userBadgeImageUrl == null || (smallImageUrl = userBadgeImageUrl.getSmallImageUrl()) == null) {
                return;
            }
            this.f49986a.C.setVisibility(0);
            com.bumptech.glide.c.B(this.itemView.getContext()).m15load(smallImageUrl).into(this.f49986a.C);
        }
        u1 e10 = fVar.e();
        if (e10 == null) {
            this.f49986a.F.setVisibility(8);
        } else {
            this.f49986a.F.setVisibility(0);
            this.f49986a.F.a(e10);
        }
        this.f49986a.u().setOnClickListener(new View.OnClickListener() { // from class: r8.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r.d(io.l.this, fVar, view);
            }
        });
        this.f49986a.u().setOnTouchListener(new View.OnTouchListener() { // from class: r8.q
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean f10;
                f10 = r.f(r.this, view, motionEvent);
                return f10;
            }
        });
    }
}
