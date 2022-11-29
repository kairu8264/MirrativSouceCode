package de;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.animation.Animation;
import androidx.lifecycle.u;
import ia.a;
import jo.p;
import wn.l;
import wn.v;

/* loaded from: classes2.dex */
public final class n {

    /* loaded from: classes2.dex */
    public static final class a implements ia.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ao.d<v> f29603a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(ao.d<? super v> dVar) {
            this.f29603a = dVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            a.C0469a.a(this, animation);
            ao.d<v> dVar = this.f29603a;
            l.a aVar = wn.l.f59224w;
            dVar.resumeWith(wn.l.a(v.f59242a));
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            a.C0469a.b(this, animation);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            a.C0469a.c(this, animation);
        }
    }

    public static final float a(View view, float f10) {
        p.h(view, "<this>");
        return view.getContext().getResources().getDisplayMetrics().density * f10;
    }

    public static final int b(View view, int i10) {
        p.h(view, "<this>");
        return (int) (view.getContext().getResources().getDisplayMetrics().density * i10);
    }

    public static final u c(View view) {
        p.h(view, "<this>");
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof u) {
                return (u) context;
            }
        }
        return null;
    }

    public static final Object d(View view, Animation animation, ao.d<? super v> dVar) {
        ao.i iVar = new ao.i(bo.b.b(dVar));
        animation.setAnimationListener(new a(iVar));
        view.startAnimation(animation);
        Object a10 = iVar.a();
        if (a10 == bo.c.c()) {
            co.h.c(dVar);
        }
        return a10 == bo.c.c() ? a10 : v.f59242a;
    }
}
