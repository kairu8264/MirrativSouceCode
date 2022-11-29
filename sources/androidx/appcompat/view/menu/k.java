package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.widget.MenuPopupWindow;
import o3.c0;

/* loaded from: classes.dex */
public final class k extends k.d implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public static final int R = d.g.f28754o;
    public final boolean A;
    public final int B;
    public final int C;
    public final int D;
    public final MenuPopupWindow E;
    public PopupWindow.OnDismissListener H;
    public View I;
    public View J;
    public i.a K;
    public ViewTreeObserver L;
    public boolean M;
    public boolean N;
    public int O;
    public boolean Q;

    /* renamed from: x  reason: collision with root package name */
    public final Context f14275x;

    /* renamed from: y  reason: collision with root package name */
    public final e f14276y;

    /* renamed from: z  reason: collision with root package name */
    public final d f14277z;
    public final ViewTreeObserver.OnGlobalLayoutListener F = new a();
    public final View.OnAttachStateChangeListener G = new b();
    public int P = 0;

    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!k.this.isShowing() || k.this.E.isModal()) {
                return;
            }
            View view = k.this.J;
            if (view != null && view.isShown()) {
                k.this.E.show();
            } else {
                k.this.dismiss();
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = k.this.L;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    k.this.L = view.getViewTreeObserver();
                }
                k kVar = k.this;
                kVar.L.removeGlobalOnLayoutListener(kVar.F);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public k(Context context, e eVar, View view, int i10, int i11, boolean z10) {
        this.f14275x = context;
        this.f14276y = eVar;
        this.A = z10;
        this.f14277z = new d(eVar, LayoutInflater.from(context), z10, R);
        this.C = i10;
        this.D = i11;
        Resources resources = context.getResources();
        this.B = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(d.d.f28676d));
        this.I = view;
        this.E = new MenuPopupWindow(context, null, i10, i11);
        eVar.c(this, context);
    }

    @Override // k.d
    public void a(e eVar) {
    }

    @Override // k.f
    public void dismiss() {
        if (isShowing()) {
            this.E.dismiss();
        }
    }

    @Override // k.d
    public void e(View view) {
        this.I = view;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean flagActionItems() {
        return false;
    }

    @Override // k.d
    public void g(boolean z10) {
        this.f14277z.d(z10);
    }

    @Override // k.f
    public ListView getListView() {
        return this.E.getListView();
    }

    @Override // k.d
    public void h(int i10) {
        this.P = i10;
    }

    @Override // k.d
    public void i(int i10) {
        this.E.setHorizontalOffset(i10);
    }

    @Override // k.f
    public boolean isShowing() {
        return !this.M && this.E.isShowing();
    }

    @Override // k.d
    public void j(PopupWindow.OnDismissListener onDismissListener) {
        this.H = onDismissListener;
    }

    @Override // k.d
    public void k(boolean z10) {
        this.Q = z10;
    }

    @Override // k.d
    public void l(int i10) {
        this.E.setVerticalOffset(i10);
    }

    public final boolean o() {
        View view;
        if (isShowing()) {
            return true;
        }
        if (this.M || (view = this.I) == null) {
            return false;
        }
        this.J = view;
        this.E.setOnDismissListener(this);
        this.E.setOnItemClickListener(this);
        this.E.setModal(true);
        View view2 = this.J;
        boolean z10 = this.L == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.L = viewTreeObserver;
        if (z10) {
            viewTreeObserver.addOnGlobalLayoutListener(this.F);
        }
        view2.addOnAttachStateChangeListener(this.G);
        this.E.setAnchorView(view2);
        this.E.setDropDownGravity(this.P);
        if (!this.N) {
            this.O = k.d.d(this.f14277z, null, this.f14275x, this.B);
            this.N = true;
        }
        this.E.setContentWidth(this.O);
        this.E.setInputMethodMode(2);
        this.E.setEpicenterBounds(c());
        this.E.show();
        ListView listView = this.E.getListView();
        listView.setOnKeyListener(this);
        if (this.Q && this.f14276y.x() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f14275x).inflate(d.g.f28753n, (ViewGroup) listView, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.f14276y.x());
            }
            frameLayout.setEnabled(false);
            listView.addHeaderView(frameLayout, null, false);
        }
        this.E.setAdapter(this.f14277z);
        this.E.show();
        return true;
    }

    @Override // androidx.appcompat.view.menu.i
    public void onCloseMenu(e eVar, boolean z10) {
        if (eVar != this.f14276y) {
            return;
        }
        dismiss();
        i.a aVar = this.K;
        if (aVar != null) {
            aVar.onCloseMenu(eVar, z10);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.M = true;
        this.f14276y.close();
        ViewTreeObserver viewTreeObserver = this.L;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.L = this.J.getViewTreeObserver();
            }
            this.L.removeGlobalOnLayoutListener(this.F);
            this.L = null;
        }
        this.J.removeOnAttachStateChangeListener(this.G);
        PopupWindow.OnDismissListener onDismissListener = this.H;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i10 == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean onSubMenuSelected(l lVar) {
        if (lVar.hasVisibleItems()) {
            h hVar = new h(this.f14275x, lVar, this.J, this.A, this.C, this.D);
            hVar.setPresenterCallback(this.K);
            hVar.setForceShowIcon(k.d.m(lVar));
            hVar.setOnDismissListener(this.H);
            this.H = null;
            this.f14276y.e(false);
            int horizontalOffset = this.E.getHorizontalOffset();
            int verticalOffset = this.E.getVerticalOffset();
            if ((Gravity.getAbsoluteGravity(this.P, c0.E(this.I)) & 7) == 5) {
                horizontalOffset += this.I.getWidth();
            }
            if (hVar.tryShow(horizontalOffset, verticalOffset)) {
                i.a aVar = this.K;
                if (aVar != null) {
                    aVar.onOpenSubMenu(lVar);
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public void setCallback(i.a aVar) {
        this.K = aVar;
    }

    @Override // k.f
    public void show() {
        if (!o()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public void updateMenuView(boolean z10) {
        this.N = false;
        d dVar = this.f14277z;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
    }
}
