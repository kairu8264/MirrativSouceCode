package r8;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.net.glide.GlideApp;
import sn.c;

/* loaded from: classes.dex */
public final class f extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49896b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49897c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final t8.k0 f49898a;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final f a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            t8.k0 T = t8.k0.T(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            jo.p.g(T, "inflate(\n               …      false\n            )");
            return new f(T);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(t8.k0 k0Var) {
        super(k0Var.u());
        jo.p.h(k0Var, "binding");
        this.f49898a = k0Var;
    }

    public static final void d(c cVar, s8.b bVar, View view) {
        jo.p.h(bVar, "$bindModel");
        if (cVar != null) {
            cVar.a(bVar);
        }
    }

    public static final boolean f(f fVar, View view, MotionEvent motionEvent) {
        jo.p.h(fVar, "this$0");
        int action = motionEvent.getAction();
        if (action == 0) {
            fVar.f49898a.u().startAnimation(AnimationUtils.loadAnimation(fVar.f49898a.u().getContext(), z0.live_catalog_item_scale_down_animation));
            return false;
        } else if (action == 1 || action == 3) {
            fVar.f49898a.u().startAnimation(AnimationUtils.loadAnimation(fVar.f49898a.u().getContext(), z0.live_catalog_item_scale_up_animation));
            return false;
        } else {
            return false;
        }
    }

    public final void c(final s8.b bVar, final c cVar) {
        jo.p.h(bVar, "bindModel");
        Context context = this.f49898a.u().getContext();
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null && activity.isDestroyed()) {
            return;
        }
        this.f49898a.C.setText(bVar.d());
        AppCompatTextView appCompatTextView = this.f49898a.C;
        jo.p.g(appCompatTextView, "binding.labelTextView");
        td.c.e(appCompatTextView, Boolean.valueOf(bVar.e()));
        this.f49898a.D.setText(bVar.f());
        this.f49898a.E.setText(bVar.g());
        this.f49898a.B.setAdjustViewBounds(bVar.a());
        AppCompatImageView appCompatImageView = this.f49898a.B;
        jo.p.g(appCompatImageView, "binding.bannerImageView");
        int b10 = de.n.b(appCompatImageView, 8);
        GlideApp.with(this.itemView.getContext()).load(bVar.b()).apply((e8.a<?>) e8.h.bitmapTransform(new m7.f(new sn.c(b10, 0, c.b.TOP_LEFT), new sn.c(b10, 0, c.b.BOTTOM_LEFT)))).placeholder(g1.ic_cap_default).into(this.f49898a.B);
        this.f49898a.u().setOnClickListener(new View.OnClickListener() { // from class: r8.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f.d(c.this, bVar, view);
            }
        });
        this.f49898a.u().setOnTouchListener(new View.OnTouchListener() { // from class: r8.e
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean f10;
                f10 = f.f(f.this, view, motionEvent);
                return f10;
            }
        });
    }
}
