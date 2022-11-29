package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.lifecycle.o;
import androidx.lifecycle.u0;
import androidx.lifecycle.v0;
import b3.a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import y4.c;

/* loaded from: classes.dex */
public class h extends ComponentActivity implements a.c, a.e {
    public boolean J;
    public boolean K;
    public final k H = k.b(new a());
    public final androidx.lifecycle.w I = new androidx.lifecycle.w(this);
    public boolean L = true;

    /* loaded from: classes.dex */
    public class a extends m<h> implements v0, androidx.activity.f, androidx.activity.result.d, y4.e, t {
        public a() {
            super(h.this);
        }

        @Override // androidx.activity.result.d
        public ActivityResultRegistry O() {
            return h.this.O();
        }

        @Override // androidx.lifecycle.v0
        public u0 U() {
            return h.this.U();
        }

        @Override // androidx.fragment.app.t
        public void a(FragmentManager fragmentManager, Fragment fragment) {
            h.this.h3(fragment);
        }

        @Override // y4.e
        public y4.c a0() {
            return h.this.a0();
        }

        @Override // androidx.fragment.app.m, androidx.fragment.app.j
        public View c(int i10) {
            return h.this.findViewById(i10);
        }

        @Override // androidx.activity.f
        public OnBackPressedDispatcher c1() {
            return h.this.c1();
        }

        @Override // androidx.fragment.app.m, androidx.fragment.app.j
        public boolean d() {
            Window window = h.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.lifecycle.u
        public androidx.lifecycle.o g() {
            return h.this.I;
        }

        @Override // androidx.fragment.app.m
        public LayoutInflater j() {
            return h.this.getLayoutInflater().cloneInContext(h.this);
        }

        @Override // androidx.fragment.app.m
        public boolean l(String str) {
            return b3.a.s(h.this, str);
        }

        @Override // androidx.fragment.app.m
        public void n() {
            h.this.k3();
        }

        @Override // androidx.fragment.app.m
        /* renamed from: o */
        public h i() {
            return h.this;
        }
    }

    public h() {
        c3();
    }

    private void c3() {
        a0().g("android:support:lifecycle", new c.InterfaceC1040c() { // from class: androidx.fragment.app.g
            @Override // y4.c.InterfaceC1040c
            public final Bundle a() {
                Bundle d32;
                d32 = h.this.d3();
                return d32;
            }
        });
        O2(new b.b() { // from class: androidx.fragment.app.f
            @Override // b.b
            public final void a(Context context) {
                h.this.e3(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle d3() {
        f3();
        this.I.h(o.b.ON_STOP);
        return new Bundle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e3(Context context) {
        this.H.a(null);
    }

    public static boolean g3(FragmentManager fragmentManager, o.c cVar) {
        boolean z10 = false;
        for (Fragment fragment : fragmentManager.p0()) {
            if (fragment != null) {
                if (fragment.B0() != null) {
                    z10 |= g3(fragment.p0(), cVar);
                }
                d0 d0Var = fragment.f15141p0;
                if (d0Var != null && d0Var.g().b().a(o.c.STARTED)) {
                    fragment.f15141p0.f(cVar);
                    z10 = true;
                }
                if (fragment.f15140o0.b().a(o.c.STARTED)) {
                    fragment.f15140o0.o(cVar);
                    z10 = true;
                }
            }
        }
        return z10;
    }

    public final View Z2(View view, String str, Context context, AttributeSet attributeSet) {
        return this.H.v(view, str, context, attributeSet);
    }

    @Override // b3.a.e
    @Deprecated
    public final void a1(int i10) {
    }

    public FragmentManager a3() {
        return this.H.t();
    }

    @Deprecated
    public n4.a b3() {
        return n4.a.c(this);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.J);
        printWriter.print(" mResumed=");
        printWriter.print(this.K);
        printWriter.print(" mStopped=");
        printWriter.print(this.L);
        if (getApplication() != null) {
            n4.a.c(this).b(str2, fileDescriptor, printWriter, strArr);
        }
        this.H.t().T(str, fileDescriptor, printWriter, strArr);
    }

    public void f3() {
        do {
        } while (g3(a3(), o.c.CREATED));
    }

    @Deprecated
    public void h3(Fragment fragment) {
    }

    @Deprecated
    public boolean i3(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    public void j3() {
        this.I.h(o.b.ON_RESUME);
        this.H.p();
    }

    @Deprecated
    public void k3() {
        invalidateOptionsMenu();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        this.H.u();
        super.onActivityResult(i10, i11, intent);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.H.u();
        super.onConfigurationChanged(configuration);
        this.H.d(configuration);
    }

    @Override // androidx.activity.ComponentActivity, b3.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.I.h(o.b.ON_CREATE);
        this.H.f();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i10, Menu menu) {
        if (i10 == 0) {
            return super.onCreatePanelMenu(i10, menu) | this.H.g(menu, getMenuInflater());
        }
        return super.onCreatePanelMenu(i10, menu);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View Z2 = Z2(view, str, context, attributeSet);
        return Z2 == null ? super.onCreateView(view, str, context, attributeSet) : Z2;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.H.h();
        this.I.h(o.b.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.H.i();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 != 0) {
            if (i10 != 6) {
                return false;
            }
            return this.H.e(menuItem);
        }
        return this.H.k(menuItem);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z10) {
        this.H.j(z10);
    }

    @Override // android.app.Activity
    public void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        this.H.u();
        super.onNewIntent(intent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        if (i10 == 0) {
            this.H.l(menu);
        }
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.K = false;
        this.H.m();
        this.I.h(o.b.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z10) {
        this.H.n(z10);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        j3();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i10, View view, Menu menu) {
        if (i10 == 0) {
            return i3(view, menu) | this.H.o(menu);
        }
        return super.onPreparePanel(i10, view, menu);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.H.u();
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.H.u();
        super.onResume();
        this.K = true;
        this.H.s();
    }

    @Override // android.app.Activity
    public void onStart() {
        this.H.u();
        super.onStart();
        this.L = false;
        if (!this.J) {
            this.J = true;
            this.H.c();
        }
        this.H.s();
        this.I.h(o.b.ON_START);
        this.H.q();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.H.u();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.L = true;
        f3();
        this.H.r();
        this.I.h(o.b.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View Z2 = Z2(null, str, context, attributeSet);
        return Z2 == null ? super.onCreateView(str, context, attributeSet) : Z2;
    }
}
