package e;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.DecorToolbar;
import androidx.appcompat.widget.ScrollingTabContainerView;
import androidx.appcompat.widget.Toolbar;
import e.a;
import j.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import o3.c0;
import o3.j0;
import o3.k0;
import o3.l0;
import o3.m0;

/* loaded from: classes.dex */
public class n extends e.a implements ActionBarOverlayLayout.ActionBarVisibilityCallback {
    public static final Interpolator E = new AccelerateInterpolator();
    public static final Interpolator F = new DecelerateInterpolator();
    public boolean A;

    /* renamed from: a  reason: collision with root package name */
    public Context f29991a;

    /* renamed from: b  reason: collision with root package name */
    public Context f29992b;

    /* renamed from: c  reason: collision with root package name */
    public Activity f29993c;

    /* renamed from: d  reason: collision with root package name */
    public ActionBarOverlayLayout f29994d;

    /* renamed from: e  reason: collision with root package name */
    public ActionBarContainer f29995e;

    /* renamed from: f  reason: collision with root package name */
    public DecorToolbar f29996f;

    /* renamed from: g  reason: collision with root package name */
    public ActionBarContextView f29997g;

    /* renamed from: h  reason: collision with root package name */
    public View f29998h;

    /* renamed from: i  reason: collision with root package name */
    public ScrollingTabContainerView f29999i;

    /* renamed from: l  reason: collision with root package name */
    public boolean f30002l;

    /* renamed from: m  reason: collision with root package name */
    public d f30003m;

    /* renamed from: n  reason: collision with root package name */
    public j.b f30004n;

    /* renamed from: o  reason: collision with root package name */
    public b.a f30005o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f30006p;

    /* renamed from: r  reason: collision with root package name */
    public boolean f30008r;

    /* renamed from: u  reason: collision with root package name */
    public boolean f30011u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f30012v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f30013w;

    /* renamed from: y  reason: collision with root package name */
    public j.h f30015y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f30016z;

    /* renamed from: j  reason: collision with root package name */
    public ArrayList<Object> f30000j = new ArrayList<>();

    /* renamed from: k  reason: collision with root package name */
    public int f30001k = -1;

    /* renamed from: q  reason: collision with root package name */
    public ArrayList<a.b> f30007q = new ArrayList<>();

    /* renamed from: s  reason: collision with root package name */
    public int f30009s = 0;

    /* renamed from: t  reason: collision with root package name */
    public boolean f30010t = true;

    /* renamed from: x  reason: collision with root package name */
    public boolean f30014x = true;
    public final k0 B = new a();
    public final k0 C = new b();
    public final m0 D = new c();

    /* loaded from: classes.dex */
    public class a extends l0 {
        public a() {
        }

        @Override // o3.l0, o3.k0
        public void onAnimationEnd(View view) {
            View view2;
            n nVar = n.this;
            if (nVar.f30010t && (view2 = nVar.f29998h) != null) {
                view2.setTranslationY(0.0f);
                n.this.f29995e.setTranslationY(0.0f);
            }
            n.this.f29995e.setVisibility(8);
            n.this.f29995e.setTransitioning(false);
            n nVar2 = n.this;
            nVar2.f30015y = null;
            nVar2.y();
            ActionBarOverlayLayout actionBarOverlayLayout = n.this.f29994d;
            if (actionBarOverlayLayout != null) {
                c0.o0(actionBarOverlayLayout);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends l0 {
        public b() {
        }

        @Override // o3.l0, o3.k0
        public void onAnimationEnd(View view) {
            n nVar = n.this;
            nVar.f30015y = null;
            nVar.f29995e.requestLayout();
        }
    }

    /* loaded from: classes.dex */
    public class c implements m0 {
        public c() {
        }

        @Override // o3.m0
        public void a(View view) {
            ((View) n.this.f29995e.getParent()).invalidate();
        }
    }

    /* loaded from: classes.dex */
    public class d extends j.b implements e.a {
        public b.a A;
        public WeakReference<View> B;

        /* renamed from: y  reason: collision with root package name */
        public final Context f30020y;

        /* renamed from: z  reason: collision with root package name */
        public final androidx.appcompat.view.menu.e f30021z;

        public d(Context context, b.a aVar) {
            this.f30020y = context;
            this.A = aVar;
            androidx.appcompat.view.menu.e S = new androidx.appcompat.view.menu.e(context).S(1);
            this.f30021z = S;
            S.R(this);
        }

        @Override // j.b
        public void a() {
            n nVar = n.this;
            if (nVar.f30003m != this) {
                return;
            }
            if (!n.x(nVar.f30011u, nVar.f30012v, false)) {
                n nVar2 = n.this;
                nVar2.f30004n = this;
                nVar2.f30005o = this.A;
            } else {
                this.A.b(this);
            }
            this.A = null;
            n.this.w(false);
            n.this.f29997g.closeMode();
            n nVar3 = n.this;
            nVar3.f29994d.setHideOnContentScrollEnabled(nVar3.A);
            n.this.f30003m = null;
        }

        @Override // j.b
        public View b() {
            WeakReference<View> weakReference = this.B;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // j.b
        public Menu c() {
            return this.f30021z;
        }

        @Override // j.b
        public MenuInflater d() {
            return new j.g(this.f30020y);
        }

        @Override // j.b
        public CharSequence e() {
            return n.this.f29997g.getSubtitle();
        }

        @Override // j.b
        public CharSequence g() {
            return n.this.f29997g.getTitle();
        }

        @Override // j.b
        public void i() {
            if (n.this.f30003m != this) {
                return;
            }
            this.f30021z.d0();
            try {
                this.A.d(this, this.f30021z);
            } finally {
                this.f30021z.c0();
            }
        }

        @Override // j.b
        public boolean j() {
            return n.this.f29997g.isTitleOptional();
        }

        @Override // j.b
        public void k(View view) {
            n.this.f29997g.setCustomView(view);
            this.B = new WeakReference<>(view);
        }

        @Override // j.b
        public void l(int i10) {
            m(n.this.f29991a.getResources().getString(i10));
        }

        @Override // j.b
        public void m(CharSequence charSequence) {
            n.this.f29997g.setSubtitle(charSequence);
        }

        @Override // j.b
        public void o(int i10) {
            p(n.this.f29991a.getResources().getString(i10));
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean onMenuItemSelected(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            b.a aVar = this.A;
            if (aVar != null) {
                return aVar.c(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void onMenuModeChange(androidx.appcompat.view.menu.e eVar) {
            if (this.A == null) {
                return;
            }
            i();
            n.this.f29997g.showOverflowMenu();
        }

        @Override // j.b
        public void p(CharSequence charSequence) {
            n.this.f29997g.setTitle(charSequence);
        }

        @Override // j.b
        public void q(boolean z10) {
            super.q(z10);
            n.this.f29997g.setTitleOptional(z10);
        }

        public boolean r() {
            this.f30021z.d0();
            try {
                return this.A.a(this, this.f30021z);
            } finally {
                this.f30021z.c0();
            }
        }
    }

    public n(Activity activity, boolean z10) {
        this.f29993c = activity;
        View decorView = activity.getWindow().getDecorView();
        E(decorView);
        if (z10) {
            return;
        }
        this.f29998h = decorView.findViewById(16908290);
    }

    public static boolean x(boolean z10, boolean z11, boolean z12) {
        if (z12) {
            return true;
        }
        return (z10 || z11) ? false : true;
    }

    public void A(boolean z10) {
        View view;
        View view2;
        int[] iArr;
        j.h hVar = this.f30015y;
        if (hVar != null) {
            hVar.a();
        }
        this.f29995e.setVisibility(0);
        if (this.f30009s == 0 && (this.f30016z || z10)) {
            this.f29995e.setTranslationY(0.0f);
            float f10 = -this.f29995e.getHeight();
            if (z10) {
                this.f29995e.getLocationInWindow(new int[]{0, 0});
                f10 -= iArr[1];
            }
            this.f29995e.setTranslationY(f10);
            j.h hVar2 = new j.h();
            j0 k10 = c0.e(this.f29995e).k(0.0f);
            k10.i(this.D);
            hVar2.c(k10);
            if (this.f30010t && (view2 = this.f29998h) != null) {
                view2.setTranslationY(f10);
                hVar2.c(c0.e(this.f29998h).k(0.0f));
            }
            hVar2.f(F);
            hVar2.e(250L);
            hVar2.g(this.C);
            this.f30015y = hVar2;
            hVar2.h();
        } else {
            this.f29995e.setAlpha(1.0f);
            this.f29995e.setTranslationY(0.0f);
            if (this.f30010t && (view = this.f29998h) != null) {
                view.setTranslationY(0.0f);
            }
            this.C.onAnimationEnd(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f29994d;
        if (actionBarOverlayLayout != null) {
            c0.o0(actionBarOverlayLayout);
        }
    }

    public final DecorToolbar B(View view) {
        if (view instanceof DecorToolbar) {
            return (DecorToolbar) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Can't make a decor toolbar out of ");
        sb2.append(view != null ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb2.toString());
    }

    public int C() {
        return this.f29996f.getNavigationMode();
    }

    public final void D() {
        if (this.f30013w) {
            this.f30013w = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f29994d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            M(false);
        }
    }

    public final void E(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(d.f.f28730q);
        this.f29994d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f29996f = B(view.findViewById(d.f.f28714a));
        this.f29997g = (ActionBarContextView) view.findViewById(d.f.f28719f);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(d.f.f28716c);
        this.f29995e = actionBarContainer;
        DecorToolbar decorToolbar = this.f29996f;
        if (decorToolbar != null && this.f29997g != null && actionBarContainer != null) {
            this.f29991a = decorToolbar.getContext();
            boolean z10 = (this.f29996f.getDisplayOptions() & 4) != 0;
            if (z10) {
                this.f30002l = true;
            }
            j.a b10 = j.a.b(this.f29991a);
            J(b10.a() || z10);
            H(b10.g());
            TypedArray obtainStyledAttributes = this.f29991a.obtainStyledAttributes(null, d.j.f28785a, d.a.f28616c, 0);
            if (obtainStyledAttributes.getBoolean(d.j.f28835k, false)) {
                I(true);
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(d.j.f28825i, 0);
            if (dimensionPixelSize != 0) {
                G(dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
    }

    public void F(int i10, int i11) {
        int displayOptions = this.f29996f.getDisplayOptions();
        if ((i11 & 4) != 0) {
            this.f30002l = true;
        }
        this.f29996f.setDisplayOptions((i10 & i11) | ((~i11) & displayOptions));
    }

    public void G(float f10) {
        c0.z0(this.f29995e, f10);
    }

    public final void H(boolean z10) {
        this.f30008r = z10;
        if (!z10) {
            this.f29996f.setEmbeddedTabView(null);
            this.f29995e.setTabContainer(this.f29999i);
        } else {
            this.f29995e.setTabContainer(null);
            this.f29996f.setEmbeddedTabView(this.f29999i);
        }
        boolean z11 = true;
        boolean z12 = C() == 2;
        ScrollingTabContainerView scrollingTabContainerView = this.f29999i;
        if (scrollingTabContainerView != null) {
            if (z12) {
                scrollingTabContainerView.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f29994d;
                if (actionBarOverlayLayout != null) {
                    c0.o0(actionBarOverlayLayout);
                }
            } else {
                scrollingTabContainerView.setVisibility(8);
            }
        }
        this.f29996f.setCollapsible(!this.f30008r && z12);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f29994d;
        if (this.f30008r || !z12) {
            z11 = false;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z11);
    }

    public void I(boolean z10) {
        if (z10 && !this.f29994d.isInOverlayMode()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.A = z10;
        this.f29994d.setHideOnContentScrollEnabled(z10);
    }

    public void J(boolean z10) {
        this.f29996f.setHomeButtonEnabled(z10);
    }

    public final boolean K() {
        return c0.V(this.f29995e);
    }

    public final void L() {
        if (this.f30013w) {
            return;
        }
        this.f30013w = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f29994d;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        M(false);
    }

    public final void M(boolean z10) {
        if (x(this.f30011u, this.f30012v, this.f30013w)) {
            if (this.f30014x) {
                return;
            }
            this.f30014x = true;
            A(z10);
        } else if (this.f30014x) {
            this.f30014x = false;
            z(z10);
        }
    }

    @Override // e.a
    public boolean b() {
        DecorToolbar decorToolbar = this.f29996f;
        if (decorToolbar == null || !decorToolbar.hasExpandedActionView()) {
            return false;
        }
        this.f29996f.collapseActionView();
        return true;
    }

    @Override // e.a
    public void c(boolean z10) {
        if (z10 == this.f30006p) {
            return;
        }
        this.f30006p = z10;
        int size = this.f30007q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f30007q.get(i10).a(z10);
        }
    }

    @Override // e.a
    public int d() {
        return this.f29996f.getDisplayOptions();
    }

    @Override // e.a
    public Context e() {
        if (this.f29992b == null) {
            TypedValue typedValue = new TypedValue();
            this.f29991a.getTheme().resolveAttribute(d.a.f28626h, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                this.f29992b = new ContextThemeWrapper(this.f29991a, i10);
            } else {
                this.f29992b = this.f29991a;
            }
        }
        return this.f29992b;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void enableContentAnimations(boolean z10) {
        this.f30010t = z10;
    }

    @Override // e.a
    public void g(Configuration configuration) {
        H(j.a.b(this.f29991a).g());
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void hideForSystem() {
        if (this.f30012v) {
            return;
        }
        this.f30012v = true;
        M(true);
    }

    @Override // e.a
    public boolean i(int i10, KeyEvent keyEvent) {
        Menu c10;
        d dVar = this.f30003m;
        if (dVar == null || (c10 = dVar.c()) == null) {
            return false;
        }
        c10.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return c10.performShortcut(i10, keyEvent, 0);
    }

    @Override // e.a
    public void l(Drawable drawable) {
        this.f29995e.setPrimaryBackground(drawable);
    }

    @Override // e.a
    public void m(boolean z10) {
        if (this.f30002l) {
            return;
        }
        n(z10);
    }

    @Override // e.a
    public void n(boolean z10) {
        F(z10 ? 4 : 0, 4);
    }

    @Override // e.a
    public void o(boolean z10) {
        F(z10 ? 2 : 0, 2);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void onContentScrollStarted() {
        j.h hVar = this.f30015y;
        if (hVar != null) {
            hVar.a();
            this.f30015y = null;
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void onContentScrollStopped() {
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void onWindowVisibilityChanged(int i10) {
        this.f30009s = i10;
    }

    @Override // e.a
    public void p(boolean z10) {
        F(z10 ? 8 : 0, 8);
    }

    @Override // e.a
    public void q(int i10) {
        this.f29996f.setNavigationIcon(i10);
    }

    @Override // e.a
    public void r(Drawable drawable) {
        this.f29996f.setLogo(drawable);
    }

    @Override // e.a
    public void s(boolean z10) {
        j.h hVar;
        this.f30016z = z10;
        if (z10 || (hVar = this.f30015y) == null) {
            return;
        }
        hVar.a();
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void showForSystem() {
        if (this.f30012v) {
            this.f30012v = false;
            M(true);
        }
    }

    @Override // e.a
    public void t(CharSequence charSequence) {
        this.f29996f.setTitle(charSequence);
    }

    @Override // e.a
    public void u(CharSequence charSequence) {
        this.f29996f.setWindowTitle(charSequence);
    }

    @Override // e.a
    public j.b v(b.a aVar) {
        d dVar = this.f30003m;
        if (dVar != null) {
            dVar.a();
        }
        this.f29994d.setHideOnContentScrollEnabled(false);
        this.f29997g.killMode();
        d dVar2 = new d(this.f29997g.getContext(), aVar);
        if (dVar2.r()) {
            this.f30003m = dVar2;
            dVar2.i();
            this.f29997g.initForMode(dVar2);
            w(true);
            return dVar2;
        }
        return null;
    }

    public void w(boolean z10) {
        j0 j0Var;
        j0 j0Var2;
        if (z10) {
            L();
        } else {
            D();
        }
        if (!K()) {
            if (z10) {
                this.f29996f.setVisibility(4);
                this.f29997g.setVisibility(0);
                return;
            }
            this.f29996f.setVisibility(0);
            this.f29997g.setVisibility(8);
            return;
        }
        if (z10) {
            j0Var2 = this.f29996f.setupAnimatorToVisibility(4, 100L);
            j0Var = this.f29997g.setupAnimatorToVisibility(0, 200L);
        } else {
            j0Var = this.f29996f.setupAnimatorToVisibility(0, 200L);
            j0Var2 = this.f29997g.setupAnimatorToVisibility(8, 100L);
        }
        j.h hVar = new j.h();
        hVar.d(j0Var2, j0Var);
        hVar.h();
    }

    public void y() {
        b.a aVar = this.f30005o;
        if (aVar != null) {
            aVar.b(this.f30004n);
            this.f30004n = null;
            this.f30005o = null;
        }
    }

    public void z(boolean z10) {
        View view;
        int[] iArr;
        j.h hVar = this.f30015y;
        if (hVar != null) {
            hVar.a();
        }
        if (this.f30009s == 0 && (this.f30016z || z10)) {
            this.f29995e.setAlpha(1.0f);
            this.f29995e.setTransitioning(true);
            j.h hVar2 = new j.h();
            float f10 = -this.f29995e.getHeight();
            if (z10) {
                this.f29995e.getLocationInWindow(new int[]{0, 0});
                f10 -= iArr[1];
            }
            j0 k10 = c0.e(this.f29995e).k(f10);
            k10.i(this.D);
            hVar2.c(k10);
            if (this.f30010t && (view = this.f29998h) != null) {
                hVar2.c(c0.e(view).k(f10));
            }
            hVar2.f(E);
            hVar2.e(250L);
            hVar2.g(this.B);
            this.f30015y = hVar2;
            hVar2.h();
            return;
        }
        this.B.onAnimationEnd(null);
    }

    public n(Dialog dialog) {
        E(dialog.getWindow().getDecorView());
    }
}
