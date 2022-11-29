package j;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContextView;
import j.b;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class e extends b implements e.a {
    public b.a A;
    public WeakReference<View> B;
    public boolean C;
    public boolean D;
    public androidx.appcompat.view.menu.e E;

    /* renamed from: y  reason: collision with root package name */
    public Context f36995y;

    /* renamed from: z  reason: collision with root package name */
    public ActionBarContextView f36996z;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z10) {
        this.f36995y = context;
        this.f36996z = actionBarContextView;
        this.A = aVar;
        androidx.appcompat.view.menu.e S = new androidx.appcompat.view.menu.e(actionBarContextView.getContext()).S(1);
        this.E = S;
        S.R(this);
        this.D = z10;
    }

    @Override // j.b
    public void a() {
        if (this.C) {
            return;
        }
        this.C = true;
        this.A.b(this);
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
        return this.E;
    }

    @Override // j.b
    public MenuInflater d() {
        return new g(this.f36996z.getContext());
    }

    @Override // j.b
    public CharSequence e() {
        return this.f36996z.getSubtitle();
    }

    @Override // j.b
    public CharSequence g() {
        return this.f36996z.getTitle();
    }

    @Override // j.b
    public void i() {
        this.A.d(this, this.E);
    }

    @Override // j.b
    public boolean j() {
        return this.f36996z.isTitleOptional();
    }

    @Override // j.b
    public void k(View view) {
        this.f36996z.setCustomView(view);
        this.B = view != null ? new WeakReference<>(view) : null;
    }

    @Override // j.b
    public void l(int i10) {
        m(this.f36995y.getString(i10));
    }

    @Override // j.b
    public void m(CharSequence charSequence) {
        this.f36996z.setSubtitle(charSequence);
    }

    @Override // j.b
    public void o(int i10) {
        p(this.f36995y.getString(i10));
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean onMenuItemSelected(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        return this.A.c(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void onMenuModeChange(androidx.appcompat.view.menu.e eVar) {
        i();
        this.f36996z.showOverflowMenu();
    }

    @Override // j.b
    public void p(CharSequence charSequence) {
        this.f36996z.setTitle(charSequence);
    }

    @Override // j.b
    public void q(boolean z10) {
        super.q(z10);
        this.f36996z.setTitleOptional(z10);
    }
}
