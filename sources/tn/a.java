package tn;

import android.animation.Animator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jo.p;
import po.n;

/* loaded from: classes4.dex */
public abstract class a extends b0 {

    /* renamed from: t  reason: collision with root package name */
    public static final c f53839t = new c(null);

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList<RecyclerView.e0> f53840h = new ArrayList<>();

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList<RecyclerView.e0> f53841i = new ArrayList<>();

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList<f> f53842j = new ArrayList<>();

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList<b> f53843k = new ArrayList<>();

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList<ArrayList<RecyclerView.e0>> f53844l = new ArrayList<>();

    /* renamed from: m  reason: collision with root package name */
    public final ArrayList<ArrayList<f>> f53845m = new ArrayList<>();

    /* renamed from: n  reason: collision with root package name */
    public final ArrayList<ArrayList<b>> f53846n = new ArrayList<>();

    /* renamed from: o  reason: collision with root package name */
    public ArrayList<RecyclerView.e0> f53847o = new ArrayList<>();

    /* renamed from: p  reason: collision with root package name */
    public final ArrayList<RecyclerView.e0> f53848p = new ArrayList<>();

    /* renamed from: q  reason: collision with root package name */
    public ArrayList<RecyclerView.e0> f53849q = new ArrayList<>();

    /* renamed from: r  reason: collision with root package name */
    public final ArrayList<RecyclerView.e0> f53850r = new ArrayList<>();

    /* renamed from: s  reason: collision with root package name */
    public Interpolator f53851s = new DecelerateInterpolator();

    /* renamed from: tn.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0841a implements Animator.AnimatorListener {
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            p.h(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            p.h(animator, "animator");
        }
    }

    /* loaded from: classes4.dex */
    public static final class c {
        public c() {
        }

        public /* synthetic */ c(jo.h hVar) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public final class d extends C0841a {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.e0 f53858a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ a f53859b;

        public d(a aVar, RecyclerView.e0 e0Var) {
            p.h(e0Var, "viewHolder");
            this.f53859b = aVar;
            this.f53858a = e0Var;
        }

        @Override // tn.a.C0841a, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            p.h(animator, "animator");
            View view = this.f53858a.itemView;
            p.g(view, "viewHolder.itemView");
            vn.a.a(view);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            p.h(animator, "animator");
            View view = this.f53858a.itemView;
            p.g(view, "viewHolder.itemView");
            vn.a.a(view);
            this.f53859b.C(this.f53858a);
            this.f53859b.n0().remove(this.f53858a);
            this.f53859b.h0();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            p.h(animator, "animator");
            this.f53859b.D(this.f53858a);
        }
    }

    /* loaded from: classes4.dex */
    public final class e extends C0841a {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.e0 f53860a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ a f53861b;

        public e(a aVar, RecyclerView.e0 e0Var) {
            p.h(e0Var, "viewHolder");
            this.f53861b = aVar;
            this.f53860a = e0Var;
        }

        @Override // tn.a.C0841a, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            p.h(animator, "animator");
            View view = this.f53860a.itemView;
            p.g(view, "viewHolder.itemView");
            vn.a.a(view);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            p.h(animator, "animator");
            View view = this.f53860a.itemView;
            p.g(view, "viewHolder.itemView");
            vn.a.a(view);
            this.f53861b.I(this.f53860a);
            this.f53861b.p0().remove(this.f53860a);
            this.f53861b.h0();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            p.h(animator, "animator");
            this.f53861b.J(this.f53860a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.e0 f53862a;

        /* renamed from: b  reason: collision with root package name */
        public int f53863b;

        /* renamed from: c  reason: collision with root package name */
        public int f53864c;

        /* renamed from: d  reason: collision with root package name */
        public int f53865d;

        /* renamed from: e  reason: collision with root package name */
        public int f53866e;

        public f(RecyclerView.e0 e0Var, int i10, int i11, int i12, int i13) {
            p.h(e0Var, "holder");
            this.f53862a = e0Var;
            this.f53863b = i10;
            this.f53864c = i11;
            this.f53865d = i12;
            this.f53866e = i13;
        }

        public final int a() {
            return this.f53863b;
        }

        public final int b() {
            return this.f53864c;
        }

        public final RecyclerView.e0 c() {
            return this.f53862a;
        }

        public final int d() {
            return this.f53865d;
        }

        public final int e() {
            return this.f53866e;
        }
    }

    /* loaded from: classes4.dex */
    public static final class g extends C0841a {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ b f53868b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f53869c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ View f53870d;

        public g(b bVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f53868b = bVar;
            this.f53869c = viewPropertyAnimator;
            this.f53870d = view;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            p.h(animator, "animator");
            this.f53869c.setListener(null);
            this.f53870d.setAlpha(1.0f);
            this.f53870d.setTranslationX(0.0f);
            this.f53870d.setTranslationY(0.0f);
            a.this.E(this.f53868b.d(), true);
            if (this.f53868b.d() != null) {
                ArrayList arrayList = a.this.f53850r;
                RecyclerView.e0 d10 = this.f53868b.d();
                p.e(d10);
                arrayList.remove(d10);
            }
            a.this.h0();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            p.h(animator, "animator");
            a.this.F(this.f53868b.d(), true);
        }
    }

    /* loaded from: classes4.dex */
    public static final class h extends C0841a {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ b f53872b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f53873c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ View f53874d;

        public h(b bVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f53872b = bVar;
            this.f53873c = viewPropertyAnimator;
            this.f53874d = view;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            p.h(animator, "animator");
            this.f53873c.setListener(null);
            this.f53874d.setAlpha(1.0f);
            this.f53874d.setTranslationX(0.0f);
            this.f53874d.setTranslationY(0.0f);
            a.this.E(this.f53872b.c(), false);
            if (this.f53872b.c() != null) {
                ArrayList arrayList = a.this.f53850r;
                RecyclerView.e0 c10 = this.f53872b.c();
                p.e(c10);
                arrayList.remove(c10);
            }
            a.this.h0();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            p.h(animator, "animator");
            a.this.F(this.f53872b.c(), false);
        }
    }

    /* loaded from: classes4.dex */
    public static final class i extends C0841a {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ RecyclerView.e0 f53876b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ int f53877c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ View f53878d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ int f53879e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f53880f;

        public i(RecyclerView.e0 e0Var, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator) {
            this.f53876b = e0Var;
            this.f53877c = i10;
            this.f53878d = view;
            this.f53879e = i11;
            this.f53880f = viewPropertyAnimator;
        }

        @Override // tn.a.C0841a, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            p.h(animator, "animator");
            if (this.f53877c != 0) {
                this.f53878d.setTranslationX(0.0f);
            }
            if (this.f53879e != 0) {
                this.f53878d.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            p.h(animator, "animator");
            this.f53880f.setListener(null);
            a.this.G(this.f53876b);
            a.this.f53848p.remove(this.f53876b);
            a.this.h0();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            p.h(animator, "animator");
            a.this.H(this.f53876b);
        }
    }

    /* loaded from: classes4.dex */
    public static final class j implements Runnable {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ ArrayList f53882x;

        public j(ArrayList arrayList) {
            this.f53882x = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (a.this.f53844l.remove(this.f53882x)) {
                Iterator it = this.f53882x.iterator();
                while (it.hasNext()) {
                    RecyclerView.e0 e0Var = (RecyclerView.e0) it.next();
                    a aVar = a.this;
                    p.g(e0Var, "holder");
                    aVar.i0(e0Var);
                }
                this.f53882x.clear();
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class k implements Runnable {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ ArrayList f53884x;

        public k(ArrayList arrayList) {
            this.f53884x = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (a.this.f53846n.remove(this.f53884x)) {
                Iterator it = this.f53884x.iterator();
                while (it.hasNext()) {
                    b bVar = (b) it.next();
                    a aVar = a.this;
                    p.g(bVar, "change");
                    aVar.d0(bVar);
                }
                this.f53884x.clear();
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class l implements Runnable {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ ArrayList f53886x;

        public l(ArrayList arrayList) {
            this.f53886x = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (a.this.f53845m.remove(this.f53886x)) {
                Iterator it = this.f53886x.iterator();
                while (it.hasNext()) {
                    f fVar = (f) it.next();
                    a.this.e0(fVar.c(), fVar.a(), fVar.b(), fVar.d(), fVar.e());
                }
                this.f53886x.clear();
            }
        }
    }

    public a() {
        S(false);
    }

    @Override // androidx.recyclerview.widget.b0
    public boolean A(RecyclerView.e0 e0Var, int i10, int i11, int i12, int i13) {
        p.h(e0Var, "holder");
        View view = e0Var.itemView;
        p.g(view, "holder.itemView");
        View view2 = e0Var.itemView;
        p.g(view2, "holder.itemView");
        int translationX = i10 + ((int) view2.getTranslationX());
        View view3 = e0Var.itemView;
        p.g(view3, "holder.itemView");
        int translationY = i11 + ((int) view3.getTranslationY());
        j(e0Var);
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
        this.f53842j.add(new f(e0Var, translationX, translationY, i12, i13));
        return true;
    }

    @Override // androidx.recyclerview.widget.b0
    public boolean B(RecyclerView.e0 e0Var) {
        p.h(e0Var, "holder");
        j(e0Var);
        t0(e0Var);
        this.f53840h.add(e0Var);
        return true;
    }

    public abstract void c0(RecyclerView.e0 e0Var);

    public final void d0(b bVar) {
        RecyclerView.e0 d10 = bVar.d();
        View view = d10 != null ? d10.itemView : null;
        RecyclerView.e0 c10 = bVar.c();
        View view2 = c10 != null ? c10.itemView : null;
        if (view != null) {
            if (bVar.d() != null) {
                ArrayList<RecyclerView.e0> arrayList = this.f53850r;
                RecyclerView.e0 d11 = bVar.d();
                p.e(d11);
                arrayList.add(d11);
            }
            ViewPropertyAnimator duration = view.animate().setDuration(m());
            duration.translationX(bVar.e() - bVar.a());
            duration.translationY(bVar.f() - bVar.b());
            duration.alpha(0.0f).setListener(new g(bVar, duration, view)).start();
        }
        if (view2 != null) {
            if (bVar.c() != null) {
                ArrayList<RecyclerView.e0> arrayList2 = this.f53850r;
                RecyclerView.e0 c11 = bVar.c();
                p.e(c11);
                arrayList2.add(c11);
            }
            ViewPropertyAnimator animate = view2.animate();
            animate.translationX(0.0f).translationY(0.0f).setDuration(m()).alpha(1.0f).setListener(new h(bVar, animate, view2)).start();
        }
    }

    public final void e0(RecyclerView.e0 e0Var, int i10, int i11, int i12, int i13) {
        View view = e0Var.itemView;
        p.g(view, "holder.itemView");
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (i14 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i15 != 0) {
            view.animate().translationY(0.0f);
        }
        this.f53848p.add(e0Var);
        ViewPropertyAnimator animate = view.animate();
        animate.setDuration(n()).setListener(new i(e0Var, i14, view, i15, animate)).start();
    }

    public abstract void f0(RecyclerView.e0 e0Var);

    public final void g0(List<? extends RecyclerView.e0> list) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            list.get(size).itemView.animate().cancel();
        }
    }

    public final void h0() {
        if (p()) {
            return;
        }
        i();
    }

    public final void i0(RecyclerView.e0 e0Var) {
        if (e0Var instanceof un.a) {
            ((un.a) e0Var).d(e0Var, new d(this, e0Var));
        } else {
            c0(e0Var);
        }
        this.f53847o.add(e0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void j(RecyclerView.e0 e0Var) {
        p.h(e0Var, "item");
        View view = e0Var.itemView;
        p.g(view, "item.itemView");
        view.animate().cancel();
        int size = this.f53842j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            f fVar = this.f53842j.get(size);
            p.g(fVar, "pendingMoves[i]");
            if (fVar.c() == e0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                G(e0Var);
                this.f53842j.remove(size);
            }
        }
        k0(this.f53843k, e0Var);
        if (this.f53840h.remove(e0Var)) {
            View view2 = e0Var.itemView;
            p.g(view2, "item.itemView");
            vn.a.a(view2);
            I(e0Var);
        }
        if (this.f53841i.remove(e0Var)) {
            View view3 = e0Var.itemView;
            p.g(view3, "item.itemView");
            vn.a.a(view3);
            C(e0Var);
        }
        int size2 = this.f53846n.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList<b> arrayList = this.f53846n.get(size2);
            p.g(arrayList, "changesList[i]");
            ArrayList<b> arrayList2 = arrayList;
            k0(arrayList2, e0Var);
            if (arrayList2.isEmpty()) {
                this.f53846n.remove(size2);
            }
        }
        int size3 = this.f53845m.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList<f> arrayList3 = this.f53845m.get(size3);
            p.g(arrayList3, "movesList[i]");
            ArrayList<f> arrayList4 = arrayList3;
            int size4 = arrayList4.size();
            while (true) {
                size4--;
                if (size4 >= 0) {
                    f fVar2 = arrayList4.get(size4);
                    p.g(fVar2, "moves[j]");
                    if (fVar2.c() == e0Var) {
                        view.setTranslationY(0.0f);
                        view.setTranslationX(0.0f);
                        G(e0Var);
                        arrayList4.remove(size4);
                        if (arrayList4.isEmpty()) {
                            this.f53845m.remove(size3);
                        }
                    }
                }
            }
        }
        int size5 = this.f53844l.size();
        while (true) {
            size5--;
            if (size5 >= 0) {
                ArrayList<RecyclerView.e0> arrayList5 = this.f53844l.get(size5);
                p.g(arrayList5, "additionsList[i]");
                ArrayList<RecyclerView.e0> arrayList6 = arrayList5;
                if (arrayList6.remove(e0Var)) {
                    View view4 = e0Var.itemView;
                    p.g(view4, "item.itemView");
                    vn.a.a(view4);
                    C(e0Var);
                    if (arrayList6.isEmpty()) {
                        this.f53844l.remove(size5);
                    }
                }
            } else {
                this.f53849q.remove(e0Var);
                this.f53847o.remove(e0Var);
                this.f53850r.remove(e0Var);
                this.f53848p.remove(e0Var);
                h0();
                return;
            }
        }
    }

    public final void j0(RecyclerView.e0 e0Var) {
        if (e0Var instanceof un.a) {
            ((un.a) e0Var).b(e0Var, new e(this, e0Var));
        } else {
            f0(e0Var);
        }
        this.f53849q.add(e0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void k() {
        int size = this.f53842j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            f fVar = this.f53842j.get(size);
            p.g(fVar, "pendingMoves[i]");
            f fVar2 = fVar;
            View view = fVar2.c().itemView;
            p.g(view, "item.holder.itemView");
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            G(fVar2.c());
            this.f53842j.remove(size);
        }
        for (int size2 = this.f53840h.size() - 1; size2 >= 0; size2--) {
            RecyclerView.e0 e0Var = this.f53840h.get(size2);
            p.g(e0Var, "pendingRemovals[i]");
            I(e0Var);
            this.f53840h.remove(size2);
        }
        int size3 = this.f53841i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.e0 e0Var2 = this.f53841i.get(size3);
            p.g(e0Var2, "pendingAdditions[i]");
            RecyclerView.e0 e0Var3 = e0Var2;
            View view2 = e0Var3.itemView;
            p.g(view2, "item.itemView");
            vn.a.a(view2);
            C(e0Var3);
            this.f53841i.remove(size3);
        }
        for (int size4 = this.f53843k.size() - 1; size4 >= 0; size4--) {
            b bVar = this.f53843k.get(size4);
            p.g(bVar, "pendingChanges[i]");
            l0(bVar);
        }
        this.f53843k.clear();
        if (p()) {
            for (int size5 = this.f53845m.size() - 1; size5 >= 0; size5--) {
                ArrayList<f> arrayList = this.f53845m.get(size5);
                p.g(arrayList, "movesList[i]");
                ArrayList<f> arrayList2 = arrayList;
                for (int size6 = arrayList2.size() - 1; size6 >= 0; size6--) {
                    f fVar3 = arrayList2.get(size6);
                    p.g(fVar3, "moves[j]");
                    f fVar4 = fVar3;
                    View view3 = fVar4.c().itemView;
                    p.g(view3, "item.itemView");
                    view3.setTranslationY(0.0f);
                    view3.setTranslationX(0.0f);
                    G(fVar4.c());
                    arrayList2.remove(size6);
                    if (arrayList2.isEmpty()) {
                        this.f53845m.remove(arrayList2);
                    }
                }
            }
            for (int size7 = this.f53844l.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.e0> arrayList3 = this.f53844l.get(size7);
                p.g(arrayList3, "additionsList[i]");
                ArrayList<RecyclerView.e0> arrayList4 = arrayList3;
                for (int size8 = arrayList4.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.e0 e0Var4 = arrayList4.get(size8);
                    p.g(e0Var4, "additions[j]");
                    RecyclerView.e0 e0Var5 = e0Var4;
                    View view4 = e0Var5.itemView;
                    p.g(view4, "item.itemView");
                    view4.setAlpha(1.0f);
                    C(e0Var5);
                    if (size8 < arrayList4.size()) {
                        arrayList4.remove(size8);
                    }
                    if (arrayList4.isEmpty()) {
                        this.f53844l.remove(arrayList4);
                    }
                }
            }
            for (int size9 = this.f53846n.size() - 1; size9 >= 0; size9--) {
                ArrayList<b> arrayList5 = this.f53846n.get(size9);
                p.g(arrayList5, "changesList[i]");
                ArrayList<b> arrayList6 = arrayList5;
                for (int size10 = arrayList6.size() - 1; size10 >= 0; size10--) {
                    b bVar2 = arrayList6.get(size10);
                    p.g(bVar2, "changes[j]");
                    l0(bVar2);
                    if (arrayList6.isEmpty()) {
                        this.f53846n.remove(arrayList6);
                    }
                }
            }
            g0(this.f53849q);
            g0(this.f53848p);
            g0(this.f53847o);
            g0(this.f53850r);
            i();
        }
    }

    public final void k0(List<b> list, RecyclerView.e0 e0Var) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            b bVar = list.get(size);
            if (m0(bVar, e0Var) && bVar.d() == null && bVar.c() == null) {
                list.remove(bVar);
            }
        }
    }

    public final void l0(b bVar) {
        if (bVar.d() != null) {
            m0(bVar, bVar.d());
        }
        if (bVar.c() != null) {
            m0(bVar, bVar.c());
        }
    }

    public final boolean m0(b bVar, RecyclerView.e0 e0Var) {
        boolean z10 = false;
        if (bVar.c() == e0Var) {
            bVar.g(null);
        } else if (bVar.d() != e0Var) {
            return false;
        } else {
            bVar.h(null);
            z10 = true;
        }
        p.e(e0Var);
        View view = e0Var.itemView;
        p.g(view, "item!!.itemView");
        view.setAlpha(1.0f);
        View view2 = e0Var.itemView;
        p.g(view2, "item.itemView");
        view2.setTranslationX(0.0f);
        View view3 = e0Var.itemView;
        p.g(view3, "item.itemView");
        view3.setTranslationY(0.0f);
        E(e0Var, z10);
        return true;
    }

    public final ArrayList<RecyclerView.e0> n0() {
        return this.f53847o;
    }

    public final long o0(RecyclerView.e0 e0Var) {
        p.h(e0Var, "holder");
        return Math.abs((e0Var.getAdapterPosition() * l()) / 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean p() {
        return (this.f53841i.isEmpty() ^ true) || (this.f53843k.isEmpty() ^ true) || (this.f53842j.isEmpty() ^ true) || (this.f53840h.isEmpty() ^ true) || (this.f53848p.isEmpty() ^ true) || (this.f53849q.isEmpty() ^ true) || (this.f53847o.isEmpty() ^ true) || (this.f53850r.isEmpty() ^ true) || (this.f53845m.isEmpty() ^ true) || (this.f53844l.isEmpty() ^ true) || (this.f53846n.isEmpty() ^ true);
    }

    public final ArrayList<RecyclerView.e0> p0() {
        return this.f53849q;
    }

    public final long q0(RecyclerView.e0 e0Var) {
        p.h(e0Var, "holder");
        return Math.abs((e0Var.getOldPosition() * o()) / 4);
    }

    public final void r0(RecyclerView.e0 e0Var) {
        View view = e0Var.itemView;
        p.g(view, "holder.itemView");
        vn.a.a(view);
        if (e0Var instanceof un.a) {
            ((un.a) e0Var).a(e0Var);
        } else {
            s0(e0Var);
        }
    }

    public abstract void s0(RecyclerView.e0 e0Var);

    public final void t0(RecyclerView.e0 e0Var) {
        View view = e0Var.itemView;
        p.g(view, "holder.itemView");
        vn.a.a(view);
        if (e0Var instanceof un.a) {
            ((un.a) e0Var).c(e0Var);
        } else {
            u0(e0Var);
        }
    }

    public void u0(RecyclerView.e0 e0Var) {
        p.h(e0Var, "holder");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void v() {
        boolean z10 = !this.f53840h.isEmpty();
        boolean z11 = !this.f53842j.isEmpty();
        boolean z12 = !this.f53843k.isEmpty();
        boolean z13 = !this.f53841i.isEmpty();
        if (z10 || z11 || z13 || z12) {
            Iterator<RecyclerView.e0> it = this.f53840h.iterator();
            while (it.hasNext()) {
                RecyclerView.e0 next = it.next();
                p.g(next, "holder");
                j0(next);
            }
            this.f53840h.clear();
            if (z11) {
                ArrayList<f> arrayList = new ArrayList<>(this.f53842j);
                this.f53845m.add(arrayList);
                this.f53842j.clear();
                l lVar = new l(arrayList);
                if (z10) {
                    View view = arrayList.get(0).c().itemView;
                    p.g(view, "moves[0].holder.itemView");
                    view.postOnAnimationDelayed(lVar, o());
                } else {
                    lVar.run();
                }
            }
            if (z12) {
                ArrayList<b> arrayList2 = new ArrayList<>(this.f53843k);
                this.f53846n.add(arrayList2);
                this.f53843k.clear();
                k kVar = new k(arrayList2);
                if (z10) {
                    RecyclerView.e0 d10 = arrayList2.get(0).d();
                    p.e(d10);
                    d10.itemView.postOnAnimationDelayed(kVar, o());
                } else {
                    kVar.run();
                }
            }
            if (z13) {
                ArrayList<RecyclerView.e0> arrayList3 = new ArrayList<>(this.f53841i);
                this.f53844l.add(arrayList3);
                this.f53841i.clear();
                j jVar = new j(arrayList3);
                if (!z10 && !z11 && !z12) {
                    jVar.run();
                    return;
                }
                long o10 = (z10 ? o() : 0L) + n.e(z11 ? n() : 0L, z12 ? m() : 0L);
                View view2 = arrayList3.get(0).itemView;
                p.g(view2, "additions[0].itemView");
                view2.postOnAnimationDelayed(jVar, o10);
            }
        }
    }

    @Override // androidx.recyclerview.widget.b0
    public boolean y(RecyclerView.e0 e0Var) {
        p.h(e0Var, "holder");
        j(e0Var);
        r0(e0Var);
        this.f53841i.add(e0Var);
        return true;
    }

    @Override // androidx.recyclerview.widget.b0
    public boolean z(RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2, int i10, int i11, int i12, int i13) {
        p.h(e0Var, "oldHolder");
        p.h(e0Var2, "newHolder");
        if (e0Var == e0Var2) {
            return A(e0Var, i10, i11, i12, i13);
        }
        View view = e0Var.itemView;
        p.g(view, "oldHolder.itemView");
        float translationX = view.getTranslationX();
        View view2 = e0Var.itemView;
        p.g(view2, "oldHolder.itemView");
        float translationY = view2.getTranslationY();
        View view3 = e0Var.itemView;
        p.g(view3, "oldHolder.itemView");
        float alpha = view3.getAlpha();
        j(e0Var);
        View view4 = e0Var.itemView;
        p.g(view4, "oldHolder.itemView");
        view4.setTranslationX(translationX);
        View view5 = e0Var.itemView;
        p.g(view5, "oldHolder.itemView");
        view5.setTranslationY(translationY);
        View view6 = e0Var.itemView;
        p.g(view6, "oldHolder.itemView");
        view6.setAlpha(alpha);
        j(e0Var2);
        View view7 = e0Var2.itemView;
        p.g(view7, "newHolder.itemView");
        view7.setTranslationX(-((int) ((i12 - i10) - translationX)));
        View view8 = e0Var2.itemView;
        p.g(view8, "newHolder.itemView");
        view8.setTranslationY(-((int) ((i13 - i11) - translationY)));
        View view9 = e0Var2.itemView;
        p.g(view9, "newHolder.itemView");
        view9.setAlpha(0.0f);
        this.f53843k.add(new b(e0Var, e0Var2, i10, i11, i12, i13));
        return true;
    }

    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.e0 f53852a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView.e0 f53853b;

        /* renamed from: c  reason: collision with root package name */
        public int f53854c;

        /* renamed from: d  reason: collision with root package name */
        public int f53855d;

        /* renamed from: e  reason: collision with root package name */
        public int f53856e;

        /* renamed from: f  reason: collision with root package name */
        public int f53857f;

        public b(RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2) {
            this.f53852a = e0Var;
            this.f53853b = e0Var2;
        }

        public final int a() {
            return this.f53854c;
        }

        public final int b() {
            return this.f53855d;
        }

        public final RecyclerView.e0 c() {
            return this.f53853b;
        }

        public final RecyclerView.e0 d() {
            return this.f53852a;
        }

        public final int e() {
            return this.f53856e;
        }

        public final int f() {
            return this.f53857f;
        }

        public final void g(RecyclerView.e0 e0Var) {
            this.f53853b = e0Var;
        }

        public final void h(RecyclerView.e0 e0Var) {
            this.f53852a = e0Var;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f53852a + ", newHolder=" + this.f53853b + ", fromX=" + this.f53854c + ", fromY=" + this.f53855d + ", toX=" + this.f53856e + ", toY=" + this.f53857f + '}';
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b(RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2, int i10, int i11, int i12, int i13) {
            this(e0Var, e0Var2);
            p.h(e0Var, "oldHolder");
            p.h(e0Var2, "newHolder");
            this.f53854c = i10;
            this.f53855d = i11;
            this.f53856e = i12;
            this.f53857f = i13;
        }
    }
}
