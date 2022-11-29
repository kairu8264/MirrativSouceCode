package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class i extends b0 {

    /* renamed from: s  reason: collision with root package name */
    public static TimeInterpolator f16135s;

    /* renamed from: h  reason: collision with root package name */
    public ArrayList<RecyclerView.e0> f16136h = new ArrayList<>();

    /* renamed from: i  reason: collision with root package name */
    public ArrayList<RecyclerView.e0> f16137i = new ArrayList<>();

    /* renamed from: j  reason: collision with root package name */
    public ArrayList<j> f16138j = new ArrayList<>();

    /* renamed from: k  reason: collision with root package name */
    public ArrayList<C0076i> f16139k = new ArrayList<>();

    /* renamed from: l  reason: collision with root package name */
    public ArrayList<ArrayList<RecyclerView.e0>> f16140l = new ArrayList<>();

    /* renamed from: m  reason: collision with root package name */
    public ArrayList<ArrayList<j>> f16141m = new ArrayList<>();

    /* renamed from: n  reason: collision with root package name */
    public ArrayList<ArrayList<C0076i>> f16142n = new ArrayList<>();

    /* renamed from: o  reason: collision with root package name */
    public ArrayList<RecyclerView.e0> f16143o = new ArrayList<>();

    /* renamed from: p  reason: collision with root package name */
    public ArrayList<RecyclerView.e0> f16144p = new ArrayList<>();

    /* renamed from: q  reason: collision with root package name */
    public ArrayList<RecyclerView.e0> f16145q = new ArrayList<>();

    /* renamed from: r  reason: collision with root package name */
    public ArrayList<RecyclerView.e0> f16146r = new ArrayList<>();

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ArrayList f16147w;

        public a(ArrayList arrayList) {
            this.f16147w = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f16147w.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                i.this.V(jVar.f16181a, jVar.f16182b, jVar.f16183c, jVar.f16184d, jVar.f16185e);
            }
            this.f16147w.clear();
            i.this.f16141m.remove(this.f16147w);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ArrayList f16149w;

        public b(ArrayList arrayList) {
            this.f16149w = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f16149w.iterator();
            while (it.hasNext()) {
                i.this.U((C0076i) it.next());
            }
            this.f16149w.clear();
            i.this.f16142n.remove(this.f16149w);
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ArrayList f16151w;

        public c(ArrayList arrayList) {
            this.f16151w = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f16151w.iterator();
            while (it.hasNext()) {
                i.this.T((RecyclerView.e0) it.next());
            }
            this.f16151w.clear();
            i.this.f16140l.remove(this.f16151w);
        }
    }

    /* loaded from: classes.dex */
    public class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RecyclerView.e0 f16153a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f16154b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ View f16155c;

        public d(RecyclerView.e0 e0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f16153a = e0Var;
            this.f16154b = viewPropertyAnimator;
            this.f16155c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f16154b.setListener(null);
            this.f16155c.setAlpha(1.0f);
            i.this.I(this.f16153a);
            i.this.f16145q.remove(this.f16153a);
            i.this.Y();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            i.this.J(this.f16153a);
        }
    }

    /* loaded from: classes.dex */
    public class e extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RecyclerView.e0 f16157a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f16158b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f16159c;

        public e(RecyclerView.e0 e0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f16157a = e0Var;
            this.f16158b = view;
            this.f16159c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f16158b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f16159c.setListener(null);
            i.this.C(this.f16157a);
            i.this.f16143o.remove(this.f16157a);
            i.this.Y();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            i.this.D(this.f16157a);
        }
    }

    /* loaded from: classes.dex */
    public class f extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RecyclerView.e0 f16161a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f16162b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ View f16163c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ int f16164d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f16165e;

        public f(RecyclerView.e0 e0Var, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator) {
            this.f16161a = e0Var;
            this.f16162b = i10;
            this.f16163c = view;
            this.f16164d = i11;
            this.f16165e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f16162b != 0) {
                this.f16163c.setTranslationX(0.0f);
            }
            if (this.f16164d != 0) {
                this.f16163c.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f16165e.setListener(null);
            i.this.G(this.f16161a);
            i.this.f16144p.remove(this.f16161a);
            i.this.Y();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            i.this.H(this.f16161a);
        }
    }

    /* loaded from: classes.dex */
    public class g extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ C0076i f16167a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f16168b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ View f16169c;

        public g(C0076i c0076i, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f16167a = c0076i;
            this.f16168b = viewPropertyAnimator;
            this.f16169c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f16168b.setListener(null);
            this.f16169c.setAlpha(1.0f);
            this.f16169c.setTranslationX(0.0f);
            this.f16169c.setTranslationY(0.0f);
            i.this.E(this.f16167a.f16175a, true);
            i.this.f16146r.remove(this.f16167a.f16175a);
            i.this.Y();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            i.this.F(this.f16167a.f16175a, true);
        }
    }

    /* loaded from: classes.dex */
    public class h extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ C0076i f16171a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f16172b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ View f16173c;

        public h(C0076i c0076i, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f16171a = c0076i;
            this.f16172b = viewPropertyAnimator;
            this.f16173c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f16172b.setListener(null);
            this.f16173c.setAlpha(1.0f);
            this.f16173c.setTranslationX(0.0f);
            this.f16173c.setTranslationY(0.0f);
            i.this.E(this.f16171a.f16176b, false);
            i.this.f16146r.remove(this.f16171a.f16176b);
            i.this.Y();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            i.this.F(this.f16171a.f16176b, false);
        }
    }

    /* loaded from: classes.dex */
    public static class j {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.e0 f16181a;

        /* renamed from: b  reason: collision with root package name */
        public int f16182b;

        /* renamed from: c  reason: collision with root package name */
        public int f16183c;

        /* renamed from: d  reason: collision with root package name */
        public int f16184d;

        /* renamed from: e  reason: collision with root package name */
        public int f16185e;

        public j(RecyclerView.e0 e0Var, int i10, int i11, int i12, int i13) {
            this.f16181a = e0Var;
            this.f16182b = i10;
            this.f16183c = i11;
            this.f16184d = i12;
            this.f16185e = i13;
        }
    }

    @Override // androidx.recyclerview.widget.b0
    public boolean A(RecyclerView.e0 e0Var, int i10, int i11, int i12, int i13) {
        View view = e0Var.itemView;
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) e0Var.itemView.getTranslationY());
        c0(e0Var);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            G(e0Var);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        this.f16138j.add(new j(e0Var, translationX, translationY, i12, i13));
        return true;
    }

    @Override // androidx.recyclerview.widget.b0
    public boolean B(RecyclerView.e0 e0Var) {
        c0(e0Var);
        this.f16136h.add(e0Var);
        return true;
    }

    public void T(RecyclerView.e0 e0Var) {
        View view = e0Var.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.f16143o.add(e0Var);
        animate.alpha(1.0f).setDuration(l()).setListener(new e(e0Var, view, animate)).start();
    }

    public void U(C0076i c0076i) {
        RecyclerView.e0 e0Var = c0076i.f16175a;
        View view = e0Var == null ? null : e0Var.itemView;
        RecyclerView.e0 e0Var2 = c0076i.f16176b;
        View view2 = e0Var2 != null ? e0Var2.itemView : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(m());
            this.f16146r.add(c0076i.f16175a);
            duration.translationX(c0076i.f16179e - c0076i.f16177c);
            duration.translationY(c0076i.f16180f - c0076i.f16178d);
            duration.alpha(0.0f).setListener(new g(c0076i, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            this.f16146r.add(c0076i.f16176b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(m()).alpha(1.0f).setListener(new h(c0076i, animate, view2)).start();
        }
    }

    public void V(RecyclerView.e0 e0Var, int i10, int i11, int i12, int i13) {
        View view = e0Var.itemView;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (i14 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i15 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.f16144p.add(e0Var);
        animate.setDuration(n()).setListener(new f(e0Var, i14, view, i15, animate)).start();
    }

    public final void W(RecyclerView.e0 e0Var) {
        View view = e0Var.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.f16145q.add(e0Var);
        animate.setDuration(o()).alpha(0.0f).setListener(new d(e0Var, animate, view)).start();
    }

    public void X(List<RecyclerView.e0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).itemView.animate().cancel();
        }
    }

    public void Y() {
        if (p()) {
            return;
        }
        i();
    }

    public final void Z(List<C0076i> list, RecyclerView.e0 e0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C0076i c0076i = list.get(size);
            if (b0(c0076i, e0Var) && c0076i.f16175a == null && c0076i.f16176b == null) {
                list.remove(c0076i);
            }
        }
    }

    public final void a0(C0076i c0076i) {
        RecyclerView.e0 e0Var = c0076i.f16175a;
        if (e0Var != null) {
            b0(c0076i, e0Var);
        }
        RecyclerView.e0 e0Var2 = c0076i.f16176b;
        if (e0Var2 != null) {
            b0(c0076i, e0Var2);
        }
    }

    public final boolean b0(C0076i c0076i, RecyclerView.e0 e0Var) {
        boolean z10 = false;
        if (c0076i.f16176b == e0Var) {
            c0076i.f16176b = null;
        } else if (c0076i.f16175a != e0Var) {
            return false;
        } else {
            c0076i.f16175a = null;
            z10 = true;
        }
        e0Var.itemView.setAlpha(1.0f);
        e0Var.itemView.setTranslationX(0.0f);
        e0Var.itemView.setTranslationY(0.0f);
        E(e0Var, z10);
        return true;
    }

    public final void c0(RecyclerView.e0 e0Var) {
        if (f16135s == null) {
            f16135s = new ValueAnimator().getInterpolator();
        }
        e0Var.itemView.animate().setInterpolator(f16135s);
        j(e0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean g(RecyclerView.e0 e0Var, List<Object> list) {
        return !list.isEmpty() || super.g(e0Var, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void j(RecyclerView.e0 e0Var) {
        View view = e0Var.itemView;
        view.animate().cancel();
        int size = this.f16138j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.f16138j.get(size).f16181a == e0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                G(e0Var);
                this.f16138j.remove(size);
            }
        }
        Z(this.f16139k, e0Var);
        if (this.f16136h.remove(e0Var)) {
            view.setAlpha(1.0f);
            I(e0Var);
        }
        if (this.f16137i.remove(e0Var)) {
            view.setAlpha(1.0f);
            C(e0Var);
        }
        for (int size2 = this.f16142n.size() - 1; size2 >= 0; size2--) {
            ArrayList<C0076i> arrayList = this.f16142n.get(size2);
            Z(arrayList, e0Var);
            if (arrayList.isEmpty()) {
                this.f16142n.remove(size2);
            }
        }
        for (int size3 = this.f16141m.size() - 1; size3 >= 0; size3--) {
            ArrayList<j> arrayList2 = this.f16141m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (arrayList2.get(size4).f16181a == e0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    G(e0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f16141m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f16140l.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.e0> arrayList3 = this.f16140l.get(size5);
            if (arrayList3.remove(e0Var)) {
                view.setAlpha(1.0f);
                C(e0Var);
                if (arrayList3.isEmpty()) {
                    this.f16140l.remove(size5);
                }
            }
        }
        this.f16145q.remove(e0Var);
        this.f16143o.remove(e0Var);
        this.f16146r.remove(e0Var);
        this.f16144p.remove(e0Var);
        Y();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void k() {
        int size = this.f16138j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = this.f16138j.get(size);
            View view = jVar.f16181a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            G(jVar.f16181a);
            this.f16138j.remove(size);
        }
        for (int size2 = this.f16136h.size() - 1; size2 >= 0; size2--) {
            I(this.f16136h.get(size2));
            this.f16136h.remove(size2);
        }
        int size3 = this.f16137i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.e0 e0Var = this.f16137i.get(size3);
            e0Var.itemView.setAlpha(1.0f);
            C(e0Var);
            this.f16137i.remove(size3);
        }
        for (int size4 = this.f16139k.size() - 1; size4 >= 0; size4--) {
            a0(this.f16139k.get(size4));
        }
        this.f16139k.clear();
        if (p()) {
            for (int size5 = this.f16141m.size() - 1; size5 >= 0; size5--) {
                ArrayList<j> arrayList = this.f16141m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = arrayList.get(size6);
                    View view2 = jVar2.f16181a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    G(jVar2.f16181a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f16141m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f16140l.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.e0> arrayList2 = this.f16140l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.e0 e0Var2 = arrayList2.get(size8);
                    e0Var2.itemView.setAlpha(1.0f);
                    C(e0Var2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f16140l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f16142n.size() - 1; size9 >= 0; size9--) {
                ArrayList<C0076i> arrayList3 = this.f16142n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    a0(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f16142n.remove(arrayList3);
                    }
                }
            }
            X(this.f16145q);
            X(this.f16144p);
            X(this.f16143o);
            X(this.f16146r);
            i();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean p() {
        return (this.f16137i.isEmpty() && this.f16139k.isEmpty() && this.f16138j.isEmpty() && this.f16136h.isEmpty() && this.f16144p.isEmpty() && this.f16145q.isEmpty() && this.f16143o.isEmpty() && this.f16146r.isEmpty() && this.f16141m.isEmpty() && this.f16140l.isEmpty() && this.f16142n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void v() {
        boolean z10 = !this.f16136h.isEmpty();
        boolean z11 = !this.f16138j.isEmpty();
        boolean z12 = !this.f16139k.isEmpty();
        boolean z13 = !this.f16137i.isEmpty();
        if (z10 || z11 || z13 || z12) {
            Iterator<RecyclerView.e0> it = this.f16136h.iterator();
            while (it.hasNext()) {
                W(it.next());
            }
            this.f16136h.clear();
            if (z11) {
                ArrayList<j> arrayList = new ArrayList<>();
                arrayList.addAll(this.f16138j);
                this.f16141m.add(arrayList);
                this.f16138j.clear();
                a aVar = new a(arrayList);
                if (z10) {
                    o3.c0.k0(arrayList.get(0).f16181a.itemView, aVar, o());
                } else {
                    aVar.run();
                }
            }
            if (z12) {
                ArrayList<C0076i> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.f16139k);
                this.f16142n.add(arrayList2);
                this.f16139k.clear();
                b bVar = new b(arrayList2);
                if (z10) {
                    o3.c0.k0(arrayList2.get(0).f16175a.itemView, bVar, o());
                } else {
                    bVar.run();
                }
            }
            if (z13) {
                ArrayList<RecyclerView.e0> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.f16137i);
                this.f16140l.add(arrayList3);
                this.f16137i.clear();
                c cVar = new c(arrayList3);
                if (!z10 && !z11 && !z12) {
                    cVar.run();
                } else {
                    o3.c0.k0(arrayList3.get(0).itemView, cVar, (z10 ? o() : 0L) + Math.max(z11 ? n() : 0L, z12 ? m() : 0L));
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.b0
    public boolean y(RecyclerView.e0 e0Var) {
        c0(e0Var);
        e0Var.itemView.setAlpha(0.0f);
        this.f16137i.add(e0Var);
        return true;
    }

    @Override // androidx.recyclerview.widget.b0
    public boolean z(RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2, int i10, int i11, int i12, int i13) {
        if (e0Var == e0Var2) {
            return A(e0Var, i10, i11, i12, i13);
        }
        float translationX = e0Var.itemView.getTranslationX();
        float translationY = e0Var.itemView.getTranslationY();
        float alpha = e0Var.itemView.getAlpha();
        c0(e0Var);
        int i14 = (int) ((i12 - i10) - translationX);
        int i15 = (int) ((i13 - i11) - translationY);
        e0Var.itemView.setTranslationX(translationX);
        e0Var.itemView.setTranslationY(translationY);
        e0Var.itemView.setAlpha(alpha);
        if (e0Var2 != null) {
            c0(e0Var2);
            e0Var2.itemView.setTranslationX(-i14);
            e0Var2.itemView.setTranslationY(-i15);
            e0Var2.itemView.setAlpha(0.0f);
        }
        this.f16139k.add(new C0076i(e0Var, e0Var2, i10, i11, i12, i13));
        return true;
    }

    /* renamed from: androidx.recyclerview.widget.i$i  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0076i {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.e0 f16175a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView.e0 f16176b;

        /* renamed from: c  reason: collision with root package name */
        public int f16177c;

        /* renamed from: d  reason: collision with root package name */
        public int f16178d;

        /* renamed from: e  reason: collision with root package name */
        public int f16179e;

        /* renamed from: f  reason: collision with root package name */
        public int f16180f;

        public C0076i(RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2) {
            this.f16175a = e0Var;
            this.f16176b = e0Var2;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f16175a + ", newHolder=" + this.f16176b + ", fromX=" + this.f16177c + ", fromY=" + this.f16178d + ", toX=" + this.f16179e + ", toY=" + this.f16180f + '}';
        }

        public C0076i(RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2, int i10, int i11, int i12, int i13) {
            this(e0Var, e0Var2);
            this.f16177c = i10;
            this.f16178d = i11;
            this.f16179e = i12;
            this.f16180f = i13;
        }
    }
}
