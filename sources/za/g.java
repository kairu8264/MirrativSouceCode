package za;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.f0;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.RecyclerView;
import db.e0;
import jo.p;
import wn.v;

/* loaded from: classes2.dex */
public final class g extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f62930b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f62931c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final e0 f62932a;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final g a(ViewGroup viewGroup) {
            p.h(viewGroup, "parent");
            e0 T = e0.T(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            p.g(T, "inflate(LayoutInflater.f….context), parent, false)");
            return new g(T);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e0 e0Var) {
        super(e0Var.u());
        p.h(e0Var, "binding");
        this.f62932a = e0Var;
    }

    public static final void f(g gVar, Boolean bool) {
        p.h(gVar, "this$0");
        p.g(bool, "it");
        if (bool.booleanValue()) {
            gVar.f62932a.J.setVisibility(0);
            Drawable background = gVar.f62932a.I.getBackground();
            p.f(background, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
            ((AnimationDrawable) background).start();
            return;
        }
        gVar.f62932a.J.setVisibility(8);
        Drawable background2 = gVar.f62932a.I.getBackground();
        p.f(background2, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
        ((AnimationDrawable) background2).stop();
    }

    public static final void g(g gVar, c cVar, m mVar) {
        p.h(gVar, "this$0");
        p.h(cVar, "$bindModel");
        gVar.f62932a.L.setTitle(mVar.b());
        gVar.f62932a.L.setVisibility(mVar.c());
        gVar.f62932a.L.setEnabled(mVar.d());
        if (mVar.a() && cVar.j()) {
            gVar.f62932a.G.setText(cVar.f());
            gVar.f62932a.G.setVisibility(0);
            gVar.f62932a.H.setAlpha(0.2f);
            return;
        }
        gVar.f62932a.G.setText("");
        gVar.f62932a.G.setVisibility(8);
        gVar.f62932a.H.setAlpha(1.0f);
    }

    public static final void h(c cVar, io.l lVar, View view) {
        p.h(cVar, "$bindModel");
        p.h(lVar, "$receivePrizesListener");
        if (p.c(cVar.a().f(), Boolean.TRUE)) {
            return;
        }
        lVar.invoke(Integer.valueOf(cVar.getId()));
    }

    public final void d(final c cVar, final io.l<? super Integer, v> lVar, u uVar) {
        p.h(cVar, "bindModel");
        p.h(lVar, "receivePrizesListener");
        p.h(uVar, "lifecycleOwner");
        this.f62932a.V(cVar);
        this.f62932a.K.a(cVar.h());
        this.f62932a.E.a(cVar.g());
        this.f62932a.M.setText(cVar.i());
        this.f62932a.B.setText(cVar.c());
        this.f62932a.B.setTextSize(cVar.d());
        ViewGroup.LayoutParams layoutParams = this.f62932a.F.getLayoutParams();
        p.f(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = (int) (cVar.e() * this.f62932a.u().getResources().getDisplayMetrics().density);
        cVar.a().i(uVar, new f0() { // from class: za.e
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                g.f(g.this, (Boolean) obj);
            }
        });
        cVar.b().i(uVar, new f0() { // from class: za.f
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                g.g(g.this, cVar, (m) obj);
            }
        });
        this.f62932a.L.setOnClickListener(new View.OnClickListener() { // from class: za.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                g.h(c.this, lVar, view);
            }
        });
    }
}
