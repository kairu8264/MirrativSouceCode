package g5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import g5.a;
import g5.m;

/* loaded from: classes.dex */
public abstract class j0 extends m {

    /* renamed from: h0  reason: collision with root package name */
    public static final String[] f32718h0 = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: g0  reason: collision with root package name */
    public int f32719g0 = 3;

    /* loaded from: classes.dex */
    public class a extends n {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f32720a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f32721b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ View f32722c;

        public a(ViewGroup viewGroup, View view, View view2) {
            this.f32720a = viewGroup;
            this.f32721b = view;
            this.f32722c = view2;
        }

        @Override // g5.n, g5.m.f
        public void b(m mVar) {
            if (this.f32721b.getParent() == null) {
                x.a(this.f32720a).c(this.f32721b);
            } else {
                j0.this.cancel();
            }
        }

        @Override // g5.m.f
        public void c(m mVar) {
            this.f32722c.setTag(j.f32715b, null);
            x.a(this.f32720a).d(this.f32721b);
            mVar.W(this);
        }

        @Override // g5.n, g5.m.f
        public void e(m mVar) {
            x.a(this.f32720a).d(this.f32721b);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends AnimatorListenerAdapter implements m.f, a.InterfaceC0377a {

        /* renamed from: a  reason: collision with root package name */
        public final View f32724a;

        /* renamed from: b  reason: collision with root package name */
        public final int f32725b;

        /* renamed from: c  reason: collision with root package name */
        public final ViewGroup f32726c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f32727d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f32728e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f32729f = false;

        public b(View view, int i10, boolean z10) {
            this.f32724a = view;
            this.f32725b = i10;
            this.f32726c = (ViewGroup) view.getParent();
            this.f32727d = z10;
            g(true);
        }

        @Override // g5.m.f
        public void a(m mVar) {
        }

        @Override // g5.m.f
        public void b(m mVar) {
            g(true);
        }

        @Override // g5.m.f
        public void c(m mVar) {
            f();
            mVar.W(this);
        }

        @Override // g5.m.f
        public void d(m mVar) {
        }

        @Override // g5.m.f
        public void e(m mVar) {
            g(false);
        }

        public final void f() {
            if (!this.f32729f) {
                c0.h(this.f32724a, this.f32725b);
                ViewGroup viewGroup = this.f32726c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            g(false);
        }

        public final void g(boolean z10) {
            ViewGroup viewGroup;
            if (!this.f32727d || this.f32728e == z10 || (viewGroup = this.f32726c) == null) {
                return;
            }
            this.f32728e = z10;
            x.c(viewGroup, z10);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f32729f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, g5.a.InterfaceC0377a
        public void onAnimationPause(Animator animator) {
            if (this.f32729f) {
                return;
            }
            c0.h(this.f32724a, this.f32725b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, g5.a.InterfaceC0377a
        public void onAnimationResume(Animator animator) {
            if (this.f32729f) {
                return;
            }
            c0.h(this.f32724a, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f32730a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f32731b;

        /* renamed from: c  reason: collision with root package name */
        public int f32732c;

        /* renamed from: d  reason: collision with root package name */
        public int f32733d;

        /* renamed from: e  reason: collision with root package name */
        public ViewGroup f32734e;

        /* renamed from: f  reason: collision with root package name */
        public ViewGroup f32735f;
    }

    @Override // g5.m
    public String[] H() {
        return f32718h0;
    }

    @Override // g5.m
    public boolean J(s sVar, s sVar2) {
        if (sVar == null && sVar2 == null) {
            return false;
        }
        if (sVar == null || sVar2 == null || sVar2.f32777a.containsKey("android:visibility:visibility") == sVar.f32777a.containsKey("android:visibility:visibility")) {
            c l02 = l0(sVar, sVar2);
            if (l02.f32730a) {
                return l02.f32732c == 0 || l02.f32733d == 0;
            }
            return false;
        }
        return false;
    }

    @Override // g5.m
    public void i(s sVar) {
        j0(sVar);
    }

    public final void j0(s sVar) {
        sVar.f32777a.put("android:visibility:visibility", Integer.valueOf(sVar.f32778b.getVisibility()));
        sVar.f32777a.put("android:visibility:parent", sVar.f32778b.getParent());
        int[] iArr = new int[2];
        sVar.f32778b.getLocationOnScreen(iArr);
        sVar.f32777a.put("android:visibility:screenLocation", iArr);
    }

    public final c l0(s sVar, s sVar2) {
        c cVar = new c();
        cVar.f32730a = false;
        cVar.f32731b = false;
        if (sVar != null && sVar.f32777a.containsKey("android:visibility:visibility")) {
            cVar.f32732c = ((Integer) sVar.f32777a.get("android:visibility:visibility")).intValue();
            cVar.f32734e = (ViewGroup) sVar.f32777a.get("android:visibility:parent");
        } else {
            cVar.f32732c = -1;
            cVar.f32734e = null;
        }
        if (sVar2 != null && sVar2.f32777a.containsKey("android:visibility:visibility")) {
            cVar.f32733d = ((Integer) sVar2.f32777a.get("android:visibility:visibility")).intValue();
            cVar.f32735f = (ViewGroup) sVar2.f32777a.get("android:visibility:parent");
        } else {
            cVar.f32733d = -1;
            cVar.f32735f = null;
        }
        if (sVar != null && sVar2 != null) {
            int i10 = cVar.f32732c;
            int i11 = cVar.f32733d;
            if (i10 == i11 && cVar.f32734e == cVar.f32735f) {
                return cVar;
            }
            if (i10 != i11) {
                if (i10 == 0) {
                    cVar.f32731b = false;
                    cVar.f32730a = true;
                } else if (i11 == 0) {
                    cVar.f32731b = true;
                    cVar.f32730a = true;
                }
            } else if (cVar.f32735f == null) {
                cVar.f32731b = false;
                cVar.f32730a = true;
            } else if (cVar.f32734e == null) {
                cVar.f32731b = true;
                cVar.f32730a = true;
            }
        } else if (sVar == null && cVar.f32733d == 0) {
            cVar.f32731b = true;
            cVar.f32730a = true;
        } else if (sVar2 == null && cVar.f32732c == 0) {
            cVar.f32731b = false;
            cVar.f32730a = true;
        }
        return cVar;
    }

    @Override // g5.m
    public void m(s sVar) {
        j0(sVar);
    }

    public abstract Animator m0(ViewGroup viewGroup, View view, s sVar, s sVar2);

    public Animator n0(ViewGroup viewGroup, s sVar, int i10, s sVar2, int i11) {
        if ((this.f32719g0 & 1) != 1 || sVar2 == null) {
            return null;
        }
        if (sVar == null) {
            View view = (View) sVar2.f32778b.getParent();
            if (l0(x(view, false), I(view, false)).f32730a) {
                return null;
            }
        }
        return m0(viewGroup, sVar2.f32778b, sVar, sVar2);
    }

    public abstract Animator o0(ViewGroup viewGroup, View view, s sVar, s sVar2);

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0089, code lost:
        if (r17.S != false) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.animation.Animator p0(android.view.ViewGroup r18, g5.s r19, int r20, g5.s r21, int r22) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.j0.p0(android.view.ViewGroup, g5.s, int, g5.s, int):android.animation.Animator");
    }

    public void q0(int i10) {
        if ((i10 & (-4)) == 0) {
            this.f32719g0 = i10;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    @Override // g5.m
    public Animator r(ViewGroup viewGroup, s sVar, s sVar2) {
        c l02 = l0(sVar, sVar2);
        if (l02.f32730a) {
            if (l02.f32734e == null && l02.f32735f == null) {
                return null;
            }
            if (l02.f32731b) {
                return n0(viewGroup, sVar, l02.f32732c, sVar2, l02.f32733d);
            }
            return p0(viewGroup, sVar, l02.f32732c, sVar2, l02.f32733d);
        }
        return null;
    }
}
