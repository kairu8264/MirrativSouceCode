package e;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.widget.DecorToolbar;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ToolbarWidgetWrapper;
import e.a;
import e.e;
import java.util.ArrayList;
import o3.c0;

/* loaded from: classes.dex */
public class k extends e.a {

    /* renamed from: a  reason: collision with root package name */
    public final DecorToolbar f29962a;

    /* renamed from: b  reason: collision with root package name */
    public final Window.Callback f29963b;

    /* renamed from: c  reason: collision with root package name */
    public final e.h f29964c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f29965d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f29966e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f29967f;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList<a.b> f29968g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    public final Runnable f29969h = new a();

    /* renamed from: i  reason: collision with root package name */
    public final Toolbar.OnMenuItemClickListener f29970i;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            k.this.x();
        }
    }

    /* loaded from: classes.dex */
    public class b implements Toolbar.OnMenuItemClickListener {
        public b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return k.this.f29963b.onMenuItemSelected(0, menuItem);
        }
    }

    /* loaded from: classes.dex */
    public final class c implements i.a {

        /* renamed from: w  reason: collision with root package name */
        public boolean f29973w;

        public c() {
        }

        @Override // androidx.appcompat.view.menu.i.a
        public void onCloseMenu(androidx.appcompat.view.menu.e eVar, boolean z10) {
            if (this.f29973w) {
                return;
            }
            this.f29973w = true;
            k.this.f29962a.dismissPopupMenus();
            k.this.f29963b.onPanelClosed(108, eVar);
            this.f29973w = false;
        }

        @Override // androidx.appcompat.view.menu.i.a
        public boolean onOpenSubMenu(androidx.appcompat.view.menu.e eVar) {
            k.this.f29963b.onMenuOpened(108, eVar);
            return true;
        }
    }

    /* loaded from: classes.dex */
    public final class d implements e.a {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean onMenuItemSelected(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void onMenuModeChange(androidx.appcompat.view.menu.e eVar) {
            if (k.this.f29962a.isOverflowMenuShowing()) {
                k.this.f29963b.onPanelClosed(108, eVar);
            } else if (k.this.f29963b.onPreparePanel(0, null, eVar)) {
                k.this.f29963b.onMenuOpened(108, eVar);
            }
        }
    }

    /* loaded from: classes.dex */
    public class e implements e.h {
        public e() {
        }

        @Override // e.e.h
        public boolean a(int i10) {
            if (i10 == 0) {
                k kVar = k.this;
                if (kVar.f29965d) {
                    return false;
                }
                kVar.f29962a.setMenuPrepared();
                k.this.f29965d = true;
                return false;
            }
            return false;
        }

        @Override // e.e.h
        public View onCreatePanelView(int i10) {
            if (i10 == 0) {
                return new View(k.this.f29962a.getContext());
            }
            return null;
        }
    }

    public k(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        b bVar = new b();
        this.f29970i = bVar;
        n3.h.g(toolbar);
        ToolbarWidgetWrapper toolbarWidgetWrapper = new ToolbarWidgetWrapper(toolbar, false);
        this.f29962a = toolbarWidgetWrapper;
        this.f29963b = (Window.Callback) n3.h.g(callback);
        toolbarWidgetWrapper.setWindowCallback(callback);
        toolbar.setOnMenuItemClickListener(bVar);
        toolbarWidgetWrapper.setWindowTitle(charSequence);
        this.f29964c = new e();
    }

    @Override // e.a
    public boolean a() {
        return this.f29962a.hideOverflowMenu();
    }

    @Override // e.a
    public boolean b() {
        if (this.f29962a.hasExpandedActionView()) {
            this.f29962a.collapseActionView();
            return true;
        }
        return false;
    }

    @Override // e.a
    public void c(boolean z10) {
        if (z10 == this.f29967f) {
            return;
        }
        this.f29967f = z10;
        int size = this.f29968g.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f29968g.get(i10).a(z10);
        }
    }

    @Override // e.a
    public int d() {
        return this.f29962a.getDisplayOptions();
    }

    @Override // e.a
    public Context e() {
        return this.f29962a.getContext();
    }

    @Override // e.a
    public boolean f() {
        this.f29962a.getViewGroup().removeCallbacks(this.f29969h);
        c0.j0(this.f29962a.getViewGroup(), this.f29969h);
        return true;
    }

    @Override // e.a
    public void g(Configuration configuration) {
        super.g(configuration);
    }

    @Override // e.a
    public void h() {
        this.f29962a.getViewGroup().removeCallbacks(this.f29969h);
    }

    @Override // e.a
    public boolean i(int i10, KeyEvent keyEvent) {
        Menu w10 = w();
        if (w10 != null) {
            w10.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            return w10.performShortcut(i10, keyEvent, 0);
        }
        return false;
    }

    @Override // e.a
    public boolean j(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            k();
        }
        return true;
    }

    @Override // e.a
    public boolean k() {
        return this.f29962a.showOverflowMenu();
    }

    @Override // e.a
    public void l(Drawable drawable) {
        this.f29962a.setBackgroundDrawable(drawable);
    }

    @Override // e.a
    public void m(boolean z10) {
    }

    @Override // e.a
    public void n(boolean z10) {
        y(z10 ? 4 : 0, 4);
    }

    @Override // e.a
    public void o(boolean z10) {
        y(z10 ? 2 : 0, 2);
    }

    @Override // e.a
    public void p(boolean z10) {
        y(z10 ? 8 : 0, 8);
    }

    @Override // e.a
    public void q(int i10) {
        this.f29962a.setNavigationIcon(i10);
    }

    @Override // e.a
    public void r(Drawable drawable) {
        this.f29962a.setLogo(drawable);
    }

    @Override // e.a
    public void s(boolean z10) {
    }

    @Override // e.a
    public void t(CharSequence charSequence) {
        this.f29962a.setTitle(charSequence);
    }

    @Override // e.a
    public void u(CharSequence charSequence) {
        this.f29962a.setWindowTitle(charSequence);
    }

    public final Menu w() {
        if (!this.f29966e) {
            this.f29962a.setMenuCallbacks(new c(), new d());
            this.f29966e = true;
        }
        return this.f29962a.getMenu();
    }

    public void x() {
        Menu w10 = w();
        androidx.appcompat.view.menu.e eVar = w10 instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) w10 : null;
        if (eVar != null) {
            eVar.d0();
        }
        try {
            w10.clear();
            if (!this.f29963b.onCreatePanelMenu(0, w10) || !this.f29963b.onPreparePanel(0, null, w10)) {
                w10.clear();
            }
        } finally {
            if (eVar != null) {
                eVar.c0();
            }
        }
    }

    public void y(int i10, int i11) {
        this.f29962a.setDisplayOptions((i10 & i11) | ((~i11) & this.f29962a.getDisplayOptions()));
    }
}
