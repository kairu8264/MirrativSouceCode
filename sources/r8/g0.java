package r8;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.customview.FollowButtonView;
import com.dena.mirrorman.net.glide.GlideApp;
import sn.c;

/* loaded from: classes.dex */
public final class g0 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49906b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49907c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final t8.y0 f49908a;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final g0 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            t8.y0 T = t8.y0.T(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            jo.p.g(T, "inflate(\n               …      false\n            )");
            return new g0(T);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(t8.y0 y0Var) {
        super(y0Var.u());
        jo.p.h(y0Var, "binding");
        this.f49908a = y0Var;
    }

    public static final void h(g0 g0Var, Boolean bool) {
        jo.p.h(g0Var, "this$0");
        FollowButtonView followButtonView = g0Var.f49908a.C;
        jo.p.g(bool, "it");
        followButtonView.setFollowing(bool.booleanValue());
    }

    public static final void i(h0 h0Var, s8.i iVar, View view) {
        jo.p.h(iVar, "$item");
        if (h0Var != null) {
            h0Var.a(iVar);
        }
    }

    public static final void j(h0 h0Var, s8.i iVar, View view) {
        jo.p.h(iVar, "$item");
        if (h0Var != null) {
            h0Var.b(iVar);
        }
    }

    public static final void k(h0 h0Var, s8.i iVar, View view) {
        jo.p.h(iVar, "$item");
        if (h0Var != null) {
            h0Var.c(iVar);
        }
    }

    public static final boolean l(g0 g0Var, View view, MotionEvent motionEvent) {
        jo.p.h(g0Var, "this$0");
        int action = motionEvent.getAction();
        if (action == 0) {
            g0Var.f49908a.u().startAnimation(AnimationUtils.loadAnimation(g0Var.f49908a.u().getContext(), z0.live_catalog_item_scale_down_animation));
            return false;
        } else if (action == 1 || action == 3) {
            g0Var.f49908a.u().startAnimation(AnimationUtils.loadAnimation(g0Var.f49908a.u().getContext(), z0.live_catalog_item_scale_up_animation));
            return false;
        } else {
            return false;
        }
    }

    @SuppressLint({"SetTextI18n"})
    public final void g(final s8.i iVar, androidx.lifecycle.u uVar, final h0 h0Var) {
        jo.p.h(iVar, "item");
        jo.p.h(uVar, "lifecycleOwner");
        Context context = this.f49908a.u().getContext();
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null && activity.isDestroyed()) {
            return;
        }
        iVar.g().i(uVar, new androidx.lifecycle.f0() { // from class: r8.f0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                g0.h(g0.this, (Boolean) obj);
            }
        });
        this.f49908a.B.setAdjustViewBounds(iVar.a());
        GlideApp.with(this.itemView.getContext()).load(iVar.d()).apply((e8.a<?>) e8.h.bitmapTransform(new m7.f(new v7.i(), new sn.c(de.m.a(this, 8), 0, c.b.TOP_LEFT), new sn.c(de.m.a(this, 8), 0, c.b.BOTTOM_LEFT)))).placeholder(g1.ic_cap_default).into(this.f49908a.B);
        this.f49908a.E.setOnClickListener(new View.OnClickListener() { // from class: r8.b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                g0.i(h0.this, iVar, view);
            }
        });
        this.f49908a.C.setOnClickListener(new View.OnClickListener() { // from class: r8.d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                g0.j(h0.this, iVar, view);
            }
        });
        this.f49908a.u().setOnClickListener(new View.OnClickListener() { // from class: r8.c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                g0.k(h0.this, iVar, view);
            }
        });
        this.f49908a.u().setOnTouchListener(new View.OnTouchListener() { // from class: r8.e0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean l10;
                l10 = g0.l(g0.this, view, motionEvent);
                return l10;
            }
        });
    }
}
