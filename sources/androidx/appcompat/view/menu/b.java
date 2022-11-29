package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.widget.MenuItemHoverListener;
import androidx.appcompat.widget.MenuPopupWindow;
import java.util.ArrayList;
import java.util.List;
import o3.c0;

/* loaded from: classes.dex */
public final class b extends k.d implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public static final int X = d.g.f28746g;
    public final int A;
    public final boolean B;
    public final Handler C;
    public View K;
    public View L;
    public boolean N;
    public boolean O;
    public int P;
    public int Q;
    public boolean S;
    public i.a T;
    public ViewTreeObserver U;
    public PopupWindow.OnDismissListener V;
    public boolean W;

    /* renamed from: x  reason: collision with root package name */
    public final Context f14194x;

    /* renamed from: y  reason: collision with root package name */
    public final int f14195y;

    /* renamed from: z  reason: collision with root package name */
    public final int f14196z;
    public final List<e> D = new ArrayList();
    public final List<d> E = new ArrayList();
    public final ViewTreeObserver.OnGlobalLayoutListener F = new a();
    public final View.OnAttachStateChangeListener G = new View$OnAttachStateChangeListenerC0046b();
    public final MenuItemHoverListener H = new c();
    public int I = 0;
    public int J = 0;
    public boolean R = false;
    public int M = s();

    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!b.this.isShowing() || b.this.E.size() <= 0 || b.this.E.get(0).f14204a.isModal()) {
                return;
            }
            View view = b.this.L;
            if (view != null && view.isShown()) {
                for (d dVar : b.this.E) {
                    dVar.f14204a.show();
                }
                return;
            }
            b.this.dismiss();
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class View$OnAttachStateChangeListenerC0046b implements View.OnAttachStateChangeListener {
        public View$OnAttachStateChangeListenerC0046b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = b.this.U;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    b.this.U = view.getViewTreeObserver();
                }
                b bVar = b.this;
                bVar.U.removeGlobalOnLayoutListener(bVar.F);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* loaded from: classes.dex */
    public class c implements MenuItemHoverListener {

        /* loaded from: classes.dex */
        public class a implements Runnable {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ d f14200w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ MenuItem f14201x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ e f14202y;

            public a(d dVar, MenuItem menuItem, e eVar) {
                this.f14200w = dVar;
                this.f14201x = menuItem;
                this.f14202y = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.f14200w;
                if (dVar != null) {
                    b.this.W = true;
                    dVar.f14205b.e(false);
                    b.this.W = false;
                }
                if (this.f14201x.isEnabled() && this.f14201x.hasSubMenu()) {
                    this.f14202y.L(this.f14201x, 4);
                }
            }
        }

        public c() {
        }

        @Override // androidx.appcompat.widget.MenuItemHoverListener
        public void onItemHoverEnter(e eVar, MenuItem menuItem) {
            b.this.C.removeCallbacksAndMessages(null);
            int size = b.this.E.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    i10 = -1;
                    break;
                } else if (eVar == b.this.E.get(i10).f14205b) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 == -1) {
                return;
            }
            int i11 = i10 + 1;
            b.this.C.postAtTime(new a(i11 < b.this.E.size() ? b.this.E.get(i11) : null, menuItem, eVar), eVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.MenuItemHoverListener
        public void onItemHoverExit(e eVar, MenuItem menuItem) {
            b.this.C.removeCallbacksAndMessages(eVar);
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final MenuPopupWindow f14204a;

        /* renamed from: b  reason: collision with root package name */
        public final e f14205b;

        /* renamed from: c  reason: collision with root package name */
        public final int f14206c;

        public d(MenuPopupWindow menuPopupWindow, e eVar, int i10) {
            this.f14204a = menuPopupWindow;
            this.f14205b = eVar;
            this.f14206c = i10;
        }

        public ListView a() {
            return this.f14204a.getListView();
        }
    }

    public b(Context context, View view, int i10, int i11, boolean z10) {
        this.f14194x = context;
        this.K = view;
        this.f14196z = i10;
        this.A = i11;
        this.B = z10;
        Resources resources = context.getResources();
        this.f14195y = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(d.d.f28676d));
        this.C = new Handler();
    }

    @Override // k.d
    public void a(e eVar) {
        eVar.c(this, this.f14194x);
        if (isShowing()) {
            u(eVar);
        } else {
            this.D.add(eVar);
        }
    }

    @Override // k.d
    public boolean b() {
        return false;
    }

    @Override // k.f
    public void dismiss() {
        int size = this.E.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.E.toArray(new d[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                d dVar = dVarArr[i10];
                if (dVar.f14204a.isShowing()) {
                    dVar.f14204a.dismiss();
                }
            }
        }
    }

    @Override // k.d
    public void e(View view) {
        if (this.K != view) {
            this.K = view;
            this.J = o3.f.b(this.I, c0.E(view));
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean flagActionItems() {
        return false;
    }

    @Override // k.d
    public void g(boolean z10) {
        this.R = z10;
    }

    @Override // k.f
    public ListView getListView() {
        if (this.E.isEmpty()) {
            return null;
        }
        List<d> list = this.E;
        return list.get(list.size() - 1).a();
    }

    @Override // k.d
    public void h(int i10) {
        if (this.I != i10) {
            this.I = i10;
            this.J = o3.f.b(i10, c0.E(this.K));
        }
    }

    @Override // k.d
    public void i(int i10) {
        this.N = true;
        this.P = i10;
    }

    @Override // k.f
    public boolean isShowing() {
        return this.E.size() > 0 && this.E.get(0).f14204a.isShowing();
    }

    @Override // k.d
    public void j(PopupWindow.OnDismissListener onDismissListener) {
        this.V = onDismissListener;
    }

    @Override // k.d
    public void k(boolean z10) {
        this.S = z10;
    }

    @Override // k.d
    public void l(int i10) {
        this.O = true;
        this.Q = i10;
    }

    public final MenuPopupWindow o() {
        MenuPopupWindow menuPopupWindow = new MenuPopupWindow(this.f14194x, null, this.f14196z, this.A);
        menuPopupWindow.setHoverListener(this.H);
        menuPopupWindow.setOnItemClickListener(this);
        menuPopupWindow.setOnDismissListener(this);
        menuPopupWindow.setAnchorView(this.K);
        menuPopupWindow.setDropDownGravity(this.J);
        menuPopupWindow.setModal(true);
        menuPopupWindow.setInputMethodMode(2);
        return menuPopupWindow;
    }

    @Override // androidx.appcompat.view.menu.i
    public void onCloseMenu(e eVar, boolean z10) {
        int p10 = p(eVar);
        if (p10 < 0) {
            return;
        }
        int i10 = p10 + 1;
        if (i10 < this.E.size()) {
            this.E.get(i10).f14205b.e(false);
        }
        d remove = this.E.remove(p10);
        remove.f14205b.O(this);
        if (this.W) {
            remove.f14204a.setExitTransition(null);
            remove.f14204a.setAnimationStyle(0);
        }
        remove.f14204a.dismiss();
        int size = this.E.size();
        if (size > 0) {
            this.M = this.E.get(size - 1).f14206c;
        } else {
            this.M = s();
        }
        if (size != 0) {
            if (z10) {
                this.E.get(0).f14205b.e(false);
                return;
            }
            return;
        }
        dismiss();
        i.a aVar = this.T;
        if (aVar != null) {
            aVar.onCloseMenu(eVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.U;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.U.removeGlobalOnLayoutListener(this.F);
            }
            this.U = null;
        }
        this.L.removeOnAttachStateChangeListener(this.G);
        this.V.onDismiss();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.E.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                dVar = null;
                break;
            }
            dVar = this.E.get(i10);
            if (!dVar.f14204a.isShowing()) {
                break;
            }
            i10++;
        }
        if (dVar != null) {
            dVar.f14205b.e(false);
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
        for (d dVar : this.E) {
            if (lVar == dVar.f14205b) {
                dVar.a().requestFocus();
                return true;
            }
        }
        if (lVar.hasVisibleItems()) {
            a(lVar);
            i.a aVar = this.T;
            if (aVar != null) {
                aVar.onOpenSubMenu(lVar);
            }
            return true;
        }
        return false;
    }

    public final int p(e eVar) {
        int size = this.E.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (eVar == this.E.get(i10).f14205b) {
                return i10;
            }
        }
        return -1;
    }

    public final MenuItem q(e eVar, e eVar2) {
        int size = eVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = eVar.getItem(i10);
            if (item.hasSubMenu() && eVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    public final View r(d dVar, e eVar) {
        androidx.appcompat.view.menu.d dVar2;
        int i10;
        int firstVisiblePosition;
        MenuItem q10 = q(dVar.f14205b, eVar);
        if (q10 == null) {
            return null;
        }
        ListView a10 = dVar.a();
        ListAdapter adapter = a10.getAdapter();
        int i11 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i10 = headerViewListAdapter.getHeadersCount();
            dVar2 = (androidx.appcompat.view.menu.d) headerViewListAdapter.getWrappedAdapter();
        } else {
            dVar2 = (androidx.appcompat.view.menu.d) adapter;
            i10 = 0;
        }
        int count = dVar2.getCount();
        while (true) {
            if (i11 >= count) {
                i11 = -1;
                break;
            } else if (q10 == dVar2.getItem(i11)) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 != -1 && (firstVisiblePosition = (i11 + i10) - a10.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a10.getChildCount()) {
            return a10.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    public final int s() {
        return c0.E(this.K) == 1 ? 0 : 1;
    }

    @Override // androidx.appcompat.view.menu.i
    public void setCallback(i.a aVar) {
        this.T = aVar;
    }

    @Override // k.f
    public void show() {
        if (isShowing()) {
            return;
        }
        for (e eVar : this.D) {
            u(eVar);
        }
        this.D.clear();
        View view = this.K;
        this.L = view;
        if (view != null) {
            boolean z10 = this.U == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.U = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.F);
            }
            this.L.addOnAttachStateChangeListener(this.G);
        }
    }

    public final int t(int i10) {
        List<d> list = this.E;
        ListView a10 = list.get(list.size() - 1).a();
        int[] iArr = new int[2];
        a10.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.L.getWindowVisibleDisplayFrame(rect);
        return this.M == 1 ? (iArr[0] + a10.getWidth()) + i10 > rect.right ? 0 : 1 : iArr[0] - i10 < 0 ? 1 : 0;
    }

    public final void u(e eVar) {
        d dVar;
        View view;
        int i10;
        int i11;
        int i12;
        LayoutInflater from = LayoutInflater.from(this.f14194x);
        androidx.appcompat.view.menu.d dVar2 = new androidx.appcompat.view.menu.d(eVar, from, this.B, X);
        if (!isShowing() && this.R) {
            dVar2.d(true);
        } else if (isShowing()) {
            dVar2.d(k.d.m(eVar));
        }
        int d10 = k.d.d(dVar2, null, this.f14194x, this.f14195y);
        MenuPopupWindow o10 = o();
        o10.setAdapter(dVar2);
        o10.setContentWidth(d10);
        o10.setDropDownGravity(this.J);
        if (this.E.size() > 0) {
            List<d> list = this.E;
            dVar = list.get(list.size() - 1);
            view = r(dVar, eVar);
        } else {
            dVar = null;
            view = null;
        }
        if (view != null) {
            o10.setTouchModal(false);
            o10.setEnterTransition(null);
            int t10 = t(d10);
            boolean z10 = t10 == 1;
            this.M = t10;
            if (Build.VERSION.SDK_INT >= 26) {
                o10.setAnchorView(view);
                i11 = 0;
                i10 = 0;
            } else {
                int[] iArr = new int[2];
                this.K.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.J & 7) == 5) {
                    iArr[0] = iArr[0] + this.K.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i10 = iArr2[0] - iArr[0];
                i11 = iArr2[1] - iArr[1];
            }
            if ((this.J & 5) == 5) {
                if (!z10) {
                    d10 = view.getWidth();
                    i12 = i10 - d10;
                }
                i12 = i10 + d10;
            } else {
                if (z10) {
                    d10 = view.getWidth();
                    i12 = i10 + d10;
                }
                i12 = i10 - d10;
            }
            o10.setHorizontalOffset(i12);
            o10.setOverlapAnchor(true);
            o10.setVerticalOffset(i11);
        } else {
            if (this.N) {
                o10.setHorizontalOffset(this.P);
            }
            if (this.O) {
                o10.setVerticalOffset(this.Q);
            }
            o10.setEpicenterBounds(c());
        }
        this.E.add(new d(o10, eVar, this.M));
        o10.show();
        ListView listView = o10.getListView();
        listView.setOnKeyListener(this);
        if (dVar == null && this.S && eVar.x() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(d.g.f28753n, (ViewGroup) listView, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(eVar.x());
            listView.addHeaderView(frameLayout, null, false);
            o10.show();
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public void updateMenuView(boolean z10) {
        for (d dVar : this.E) {
            k.d.n(dVar.a().getAdapter()).notifyDataSetChanged();
        }
    }
}
