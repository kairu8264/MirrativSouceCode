package e;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.VectorEnabledTintResources;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import b3.q;
import j.b;
import y4.c;

/* loaded from: classes.dex */
public class b extends androidx.fragment.app.h implements c, q.a {
    public d M;
    public Resources N;

    /* loaded from: classes.dex */
    public class a implements c.InterfaceC1040c {
        public a() {
        }

        @Override // y4.c.InterfaceC1040c
        public Bundle a() {
            Bundle bundle = new Bundle();
            b.this.l3().s(bundle);
            return bundle;
        }
    }

    /* renamed from: e.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0294b implements b.b {
        public C0294b() {
        }

        @Override // b.b
        public void a(Context context) {
            d l32 = b.this.l3();
            l32.l();
            l32.o(b.this.a0().b("androidx:appcompat"));
        }
    }

    public b() {
        n3();
    }

    private void Q2() {
        w0.b(getWindow().getDecorView(), this);
        x0.b(getWindow().getDecorView(), this);
        y4.f.b(getWindow().getDecorView(), this);
    }

    @Override // e.c
    public void H1(j.b bVar) {
    }

    @Override // b3.q.a
    public Intent T() {
        return b3.h.a(this);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        Q2();
        l3().b(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(l3().d(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        e.a m32 = m3();
        if (getWindow().hasFeature(0)) {
            if (m32 == null || !m32.a()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // b3.f, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        e.a m32 = m3();
        if (keyCode == 82 && m32 != null && m32.j(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i10) {
        return (T) l3().g(i10);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return l3().j();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.N == null && VectorEnabledTintResources.shouldBeUsed()) {
            this.N = new VectorEnabledTintResources(this, super.getResources());
        }
        Resources resources = this.N;
        return resources == null ? super.getResources() : resources;
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        l3().m();
    }

    @Override // androidx.fragment.app.h
    public void k3() {
        l3().m();
    }

    public d l3() {
        if (this.M == null) {
            this.M = d.e(this, this);
        }
        return this.M;
    }

    public e.a m3() {
        return l3().k();
    }

    @Override // e.c
    public void n2(j.b bVar) {
    }

    public final void n3() {
        a0().g("androidx:appcompat", new a());
        O2(new C0294b());
    }

    public void o3(q qVar) {
        qVar.g(this);
    }

    @Override // androidx.fragment.app.h, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.N != null) {
            this.N.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        l3().n(configuration);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        r3();
    }

    @Override // androidx.fragment.app.h, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        l3().p();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (t3(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // androidx.fragment.app.h, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        e.a m32 = m3();
        if (menuItem.getItemId() != 16908332 || m32 == null || (m32.d() & 4) == 0) {
            return false;
        }
        return s3();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i10, Menu menu) {
        return super.onMenuOpened(i10, menu);
    }

    @Override // androidx.fragment.app.h, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        l3().q(bundle);
    }

    @Override // androidx.fragment.app.h, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        l3().r();
    }

    @Override // androidx.fragment.app.h, android.app.Activity
    public void onStart() {
        super.onStart();
        l3().t();
    }

    @Override // androidx.fragment.app.h, android.app.Activity
    public void onStop() {
        super.onStop();
        l3().u();
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i10) {
        super.onTitleChanged(charSequence, i10);
        l3().D(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        e.a m32 = m3();
        if (getWindow().hasFeature(0)) {
            if (m32 == null || !m32.k()) {
                super.openOptionsMenu();
            }
        }
    }

    public void p3(int i10) {
    }

    public void q3(q qVar) {
    }

    @Deprecated
    public void r3() {
    }

    public boolean s3() {
        Intent T = T();
        if (T != null) {
            if (w3(T)) {
                q k10 = q.k(this);
                o3(k10);
                q3(k10);
                k10.l();
                try {
                    b3.a.o(this);
                    return true;
                } catch (IllegalStateException unused) {
                    finish();
                    return true;
                }
            }
            v3(T);
            return true;
        }
        return false;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i10) {
        Q2();
        l3().y(i10);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        super.setTheme(i10);
        l3().C(i10);
    }

    public final boolean t3(KeyEvent keyEvent) {
        Window window;
        return (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true;
    }

    public void u3(Toolbar toolbar) {
        l3().B(toolbar);
    }

    public void v3(Intent intent) {
        b3.h.e(this, intent);
    }

    @Override // e.c
    public j.b w2(b.a aVar) {
        return null;
    }

    public boolean w3(Intent intent) {
        return b3.h.f(this, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        Q2();
        l3().z(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        Q2();
        l3().A(view, layoutParams);
    }
}
