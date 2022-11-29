package androidx.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.result.ActivityResultRegistry;
import androidx.lifecycle.k0;
import androidx.lifecycle.o;
import androidx.lifecycle.r;
import androidx.lifecycle.u;
import androidx.lifecycle.u0;
import androidx.lifecycle.v0;
import androidx.lifecycle.w;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import c.a;
import java.util.concurrent.atomic.AtomicInteger;
import o3.l;
import y4.c;

/* loaded from: classes.dex */
public class ComponentActivity extends b3.f implements v0, y4.e, f, androidx.activity.result.d {
    public u0 C;
    public int E;

    /* renamed from: y  reason: collision with root package name */
    public final b.a f14036y = new b.a();

    /* renamed from: z  reason: collision with root package name */
    public final l f14037z = new l(new Runnable() { // from class: androidx.activity.c
        @Override // java.lang.Runnable
        public final void run() {
            ComponentActivity.this.R2();
        }
    });
    public final w A = new w(this);
    public final y4.d B = y4.d.a(this);
    public final OnBackPressedDispatcher D = new OnBackPressedDispatcher(new a());
    public final AtomicInteger F = new AtomicInteger();
    public final ActivityResultRegistry G = new b();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e10) {
                if (!TextUtils.equals(e10.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e10;
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends ActivityResultRegistry {

        /* loaded from: classes.dex */
        public class a implements Runnable {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ int f14043w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ a.C0134a f14044x;

            public a(int i10, a.C0134a c0134a) {
                this.f14043w = i10;
                this.f14044x = c0134a;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.c(this.f14043w, this.f14044x.a());
            }
        }

        /* renamed from: androidx.activity.ComponentActivity$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0043b implements Runnable {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ int f14046w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ IntentSender.SendIntentException f14047x;

            public RunnableC0043b(int i10, IntentSender.SendIntentException sendIntentException) {
                this.f14046w = i10;
                this.f14047x = sendIntentException;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.b(this.f14046w, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f14047x));
            }
        }

        public b() {
        }

        @Override // androidx.activity.result.ActivityResultRegistry
        public <I, O> void f(int i10, c.a<I, O> aVar, I i11, b3.b bVar) {
            ComponentActivity componentActivity = ComponentActivity.this;
            a.C0134a<O> b10 = aVar.b(componentActivity, i11);
            if (b10 != null) {
                new Handler(Looper.getMainLooper()).post(new a(i10, b10));
                return;
            }
            Intent a10 = aVar.a(componentActivity, i11);
            Bundle bundle = null;
            if (a10.getExtras() != null && a10.getExtras().getClassLoader() == null) {
                a10.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (a10.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundle = a10.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                a10.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            } else if (bVar != null) {
                bundle = bVar.b();
            }
            Bundle bundle2 = bundle;
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a10.getAction())) {
                String[] stringArrayExtra = a10.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                b3.a.q(componentActivity, stringArrayExtra, i10);
            } else if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a10.getAction())) {
                androidx.activity.result.e eVar = (androidx.activity.result.e) a10.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                try {
                    b3.a.u(componentActivity, eVar.d(), i10, eVar.a(), eVar.b(), eVar.c(), 0, bundle2);
                } catch (IntentSender.SendIntentException e10) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC0043b(i10, e10));
                }
            } else {
                b3.a.t(componentActivity, a10, i10, bundle2);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static void a(View view) {
            view.cancelPendingInputEvents();
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public Object f14049a;

        /* renamed from: b  reason: collision with root package name */
        public u0 f14050b;
    }

    public ComponentActivity() {
        if (g() != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 19) {
                g().a(new r() { // from class: androidx.activity.ComponentActivity.3
                    @Override // androidx.lifecycle.r
                    public void i(u uVar, o.b bVar) {
                        if (bVar == o.b.ON_STOP) {
                            Window window = ComponentActivity.this.getWindow();
                            View peekDecorView = window != null ? window.peekDecorView() : null;
                            if (peekDecorView != null) {
                                c.a(peekDecorView);
                            }
                        }
                    }
                });
            }
            g().a(new r() { // from class: androidx.activity.ComponentActivity.4
                @Override // androidx.lifecycle.r
                public void i(u uVar, o.b bVar) {
                    if (bVar == o.b.ON_DESTROY) {
                        ComponentActivity.this.f14036y.b();
                        if (ComponentActivity.this.isChangingConfigurations()) {
                            return;
                        }
                        ComponentActivity.this.U().a();
                    }
                }
            });
            g().a(new r() { // from class: androidx.activity.ComponentActivity.5
                @Override // androidx.lifecycle.r
                public void i(u uVar, o.b bVar) {
                    ComponentActivity.this.P2();
                    ComponentActivity.this.g().c(this);
                }
            });
            if (19 <= i10 && i10 <= 23) {
                g().a(new ImmLeaksCleaner(this));
            }
            a0().g("android:support:activity-result", new c.InterfaceC1040c() { // from class: androidx.activity.d
                @Override // y4.c.InterfaceC1040c
                public final Bundle a() {
                    Bundle S2;
                    S2 = ComponentActivity.this.S2();
                    return S2;
                }
            });
            O2(new b.b() { // from class: androidx.activity.b
                @Override // b.b
                public final void a(Context context) {
                    ComponentActivity.this.T2(context);
                }
            });
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle S2() {
        Bundle bundle = new Bundle();
        this.G.h(bundle);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T2(Context context) {
        Bundle b10 = a0().b("android:support:activity-result");
        if (b10 != null) {
            this.G.g(b10);
        }
    }

    @Override // androidx.activity.result.d
    public final ActivityResultRegistry O() {
        return this.G;
    }

    public final void O2(b.b bVar) {
        this.f14036y.a(bVar);
    }

    public void P2() {
        if (this.C == null) {
            d dVar = (d) getLastNonConfigurationInstance();
            if (dVar != null) {
                this.C = dVar.f14050b;
            }
            if (this.C == null) {
                this.C = new u0();
            }
        }
    }

    public final void Q2() {
        w0.b(getWindow().getDecorView(), this);
        x0.b(getWindow().getDecorView(), this);
        y4.f.b(getWindow().getDecorView(), this);
    }

    public void R2() {
        invalidateOptionsMenu();
    }

    @Override // androidx.lifecycle.v0
    public u0 U() {
        if (getApplication() != null) {
            P2();
            return this.C;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Deprecated
    public Object U2() {
        return null;
    }

    public final <I, O> androidx.activity.result.c<I> V2(c.a<I, O> aVar, androidx.activity.result.b<O> bVar) {
        return W2(aVar, this.G, bVar);
    }

    public final <I, O> androidx.activity.result.c<I> W2(c.a<I, O> aVar, ActivityResultRegistry activityResultRegistry, androidx.activity.result.b<O> bVar) {
        return activityResultRegistry.i("activity_rq#" + this.F.getAndIncrement(), this, aVar, bVar);
    }

    @Override // y4.e
    public final y4.c a0() {
        return this.B.b();
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        Q2();
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.activity.f
    public final OnBackPressedDispatcher c1() {
        return this.D;
    }

    @Override // b3.f, androidx.lifecycle.u
    public o g() {
        return this.A;
    }

    @Override // android.app.Activity
    @Deprecated
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (this.G.b(i10, i11, intent)) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.D.c();
    }

    @Override // b3.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.B.d(bundle);
        this.f14036y.c(this);
        super.onCreate(bundle);
        k0.g(this);
        int i10 = this.E;
        if (i10 != 0) {
            setContentView(i10);
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.f14037z.h(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (super.onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.f14037z.i(menuItem);
    }

    @Override // android.app.Activity
    @Deprecated
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (this.G.b(i10, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) || Build.VERSION.SDK_INT < 23) {
            return;
        }
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        d dVar;
        Object U2 = U2();
        u0 u0Var = this.C;
        if (u0Var == null && (dVar = (d) getLastNonConfigurationInstance()) != null) {
            u0Var = dVar.f14050b;
        }
        if (u0Var == null && U2 == null) {
            return null;
        }
        d dVar2 = new d();
        dVar2.f14049a = U2;
        dVar2.f14050b = u0Var;
        return dVar2;
    }

    @Override // b3.f, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        o g10 = g();
        if (g10 instanceof w) {
            ((w) g10).o(o.c.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.B.e(bundle);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (f5.a.d()) {
                f5.a.a("reportFullyDrawn() for ComponentActivity");
            }
            int i10 = Build.VERSION.SDK_INT;
            if (i10 > 19) {
                super.reportFullyDrawn();
            } else if (i10 == 19 && c3.a.a(this, "android.permission.UPDATE_DEVICE_STATS") == 0) {
                super.reportFullyDrawn();
            }
        } finally {
            f5.a.b();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i10) {
        Q2();
        super.setContentView(i10);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i10) {
        super.startActivityForResult(intent, i10);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i10, Bundle bundle) {
        super.startActivityForResult(intent, i10, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        Q2();
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        Q2();
        super.setContentView(view, layoutParams);
    }
}
