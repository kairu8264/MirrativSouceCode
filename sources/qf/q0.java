package qf;

import ae.af;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ia.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class q0 extends RecyclerView.e0 {

    /* renamed from: f  reason: collision with root package name */
    public static final a f49339f = new a(null);

    /* renamed from: g  reason: collision with root package name */
    public static final int f49340g = 8;

    /* renamed from: a  reason: collision with root package name */
    public final af f49341a;

    /* renamed from: b  reason: collision with root package name */
    public final int f49342b;

    /* renamed from: c  reason: collision with root package name */
    public final io.a<wn.v> f49343c;

    /* renamed from: d  reason: collision with root package name */
    public final int f49344d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f49345e;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final q0 a(ViewGroup viewGroup, int i10, List<ud.q0> list, io.a<wn.v> aVar) {
            jo.p.h(viewGroup, "parent");
            jo.p.h(list, "giftGachaUserBindModels");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_gift_gacha_roulette, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new q0((af) e10, i10, list, aVar, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements ia.a {

        /* loaded from: classes3.dex */
        public static final class a implements ia.a {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ q0 f49347a;

            public a(q0 q0Var) {
                this.f49347a = q0Var;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                io.a aVar = this.f49347a.f49343c;
                if (aVar != null) {
                    aVar.invoke();
                }
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

        public b() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            RecyclerView recyclerView = q0.this.f49341a.C;
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, q0.this.f49344d * 13.0f, q0.this.f49344d * 12.0f);
            q0 q0Var = q0.this;
            translateAnimation.setInterpolator(new LinearInterpolator());
            translateAnimation.setDuration(230L);
            translateAnimation.setFillAfter(true);
            translateAnimation.setAnimationListener(new a(q0Var));
            recyclerView.startAnimation(translateAnimation);
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

    public q0(af afVar, int i10, List<ud.q0> list, io.a<wn.v> aVar) {
        super(afVar.u());
        this.f49341a = afVar;
        this.f49342b = i10;
        this.f49343c = aVar;
        int dimensionPixelSize = afVar.u().getResources().getDimensionPixelSize(nd.x0.gift_gacha_roulette_user_height);
        this.f49344d = dimensionPixelSize;
        this.f49345e = true;
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        cVar.g(afVar.D);
        cVar.l(afVar.C.getId(), dimensionPixelSize * 14);
        cVar.c(afVar.D);
        afVar.C.setLayoutManager(new LinearLayoutManager(afVar.u().getContext()));
        afVar.C.g(new p001if.c(de.m.a(this, 30), 0, de.m.a(this, 15), 0, de.m.a(this, 15), 0, 32, null));
        ArrayList arrayList = new ArrayList();
        if (!list.isEmpty()) {
            while (arrayList.size() < list.size() + 13) {
                arrayList.addAll(list);
            }
            ArrayList arrayList2 = new ArrayList(xn.t.u(arrayList, 10));
            int i11 = 0;
            for (Object obj : arrayList) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    xn.s.t();
                }
                arrayList2.add(wn.q.a(Integer.valueOf(i11), (ud.q0) obj));
                i11 = i12;
            }
            Iterator it = arrayList2.iterator();
            int i13 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i13 = -1;
                    break;
                }
                wn.k kVar = (wn.k) it.next();
                if (((Number) kVar.a()).intValue() >= 12 && ((ud.q0) kVar.b()).c() == this.f49342b) {
                    break;
                }
                i13++;
            }
            if (i13 >= 0) {
                this.f49341a.C.setAdapter(new rd.b0(arrayList.subList(i13 - 12, 13)));
            }
        }
    }

    public /* synthetic */ q0(af afVar, int i10, List list, io.a aVar, jo.h hVar) {
        this(afVar, i10, list, aVar);
    }

    public final void d() {
        RecyclerView recyclerView = this.f49341a.C;
        RecyclerView.h adapter = recyclerView.getAdapter();
        jo.p.e(adapter);
        recyclerView.p1(adapter.getItemCount() - 1);
        if (this.f49345e) {
            this.f49345e = false;
            RecyclerView recyclerView2 = this.f49341a.C;
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, this.f49344d * 13.0f);
            translateAnimation.setInterpolator(new LinearInterpolator());
            translateAnimation.setDuration(2760L);
            translateAnimation.setAnimationListener(new b());
            recyclerView2.startAnimation(translateAnimation);
        }
    }
}
