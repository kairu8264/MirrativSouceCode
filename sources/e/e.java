package e;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.DecorContentParent;
import androidx.appcompat.widget.FitWindowsViewGroup;
import androidx.appcompat.widget.TintTypedArray;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewUtils;
import androidx.lifecycle.o;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import e3.h;
import j.b;
import j.f;
import java.lang.Thread;
import java.util.List;
import o3.c0;
import o3.g;
import o3.j0;
import o3.l0;
import o3.p0;

/* loaded from: classes.dex */
public class e extends e.d implements e.a, LayoutInflater.Factory2 {
    public static final boolean A0;
    public static final boolean B0;
    public static boolean C0;

    /* renamed from: x0  reason: collision with root package name */
    public static final s.g<String, Integer> f29869x0 = new s.g<>();

    /* renamed from: y0  reason: collision with root package name */
    public static final boolean f29870y0;

    /* renamed from: z0  reason: collision with root package name */
    public static final int[] f29871z0;
    public final Context A;
    public Window B;
    public o C;
    public final e.c D;
    public e.a E;
    public MenuInflater F;
    public CharSequence G;
    public DecorContentParent H;
    public i I;
    public v J;
    public j.b K;
    public ActionBarContextView L;
    public PopupWindow M;
    public Runnable N;
    public j0 O;
    public boolean P;
    public boolean Q;
    public ViewGroup R;
    public TextView S;
    public View T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f29872a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f29873b0;

    /* renamed from: c0  reason: collision with root package name */
    public u[] f29874c0;

    /* renamed from: d0  reason: collision with root package name */
    public u f29875d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f29876e0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f29877f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f29878g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f29879h0;

    /* renamed from: i0  reason: collision with root package name */
    public Configuration f29880i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f29881j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f29882k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f29883l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f29884m0;

    /* renamed from: n0  reason: collision with root package name */
    public q f29885n0;

    /* renamed from: o0  reason: collision with root package name */
    public q f29886o0;

    /* renamed from: p0  reason: collision with root package name */
    public boolean f29887p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f29888q0;

    /* renamed from: r0  reason: collision with root package name */
    public final Runnable f29889r0;

    /* renamed from: s0  reason: collision with root package name */
    public boolean f29890s0;

    /* renamed from: t0  reason: collision with root package name */
    public Rect f29891t0;

    /* renamed from: u0  reason: collision with root package name */
    public Rect f29892u0;

    /* renamed from: v0  reason: collision with root package name */
    public e.h f29893v0;

    /* renamed from: w0  reason: collision with root package name */
    public e.i f29894w0;

    /* renamed from: z  reason: collision with root package name */
    public final Object f29895z;

    /* loaded from: classes.dex */
    public class a implements Thread.UncaughtExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Thread.UncaughtExceptionHandler f29896a;

        public a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f29896a = uncaughtExceptionHandler;
        }

        public final boolean a(Throwable th2) {
            String message;
            if (!(th2 instanceof Resources.NotFoundException) || (message = th2.getMessage()) == null) {
                return false;
            }
            return message.contains("drawable") || message.contains("Drawable");
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th2) {
            if (a(th2)) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException(th2.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                notFoundException.initCause(th2.getCause());
                notFoundException.setStackTrace(th2.getStackTrace());
                this.f29896a.uncaughtException(thread, notFoundException);
                return;
            }
            this.f29896a.uncaughtException(thread, th2);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e eVar = e.this;
            if ((eVar.f29888q0 & 1) != 0) {
                eVar.T(0);
            }
            e eVar2 = e.this;
            if ((eVar2.f29888q0 & 4096) != 0) {
                eVar2.T(108);
            }
            e eVar3 = e.this;
            eVar3.f29887p0 = false;
            eVar3.f29888q0 = 0;
        }
    }

    /* loaded from: classes.dex */
    public class c implements o3.v {
        public c() {
        }

        @Override // o3.v
        public p0 a(View view, p0 p0Var) {
            int m10 = p0Var.m();
            int K0 = e.this.K0(p0Var, null);
            if (m10 != K0) {
                p0Var = p0Var.r(p0Var.k(), K0, p0Var.l(), p0Var.j());
            }
            return c0.d0(view, p0Var);
        }
    }

    /* loaded from: classes.dex */
    public class d implements FitWindowsViewGroup.OnFitSystemWindowsListener {
        public d() {
        }

        @Override // androidx.appcompat.widget.FitWindowsViewGroup.OnFitSystemWindowsListener
        public void onFitSystemWindows(Rect rect) {
            rect.top = e.this.K0(null, rect);
        }
    }

    /* renamed from: e.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0295e implements ContentFrameLayout.OnAttachListener {
        public C0295e() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.OnAttachListener
        public void onAttachedFromWindow() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.OnAttachListener
        public void onDetachedFromWindow() {
            e.this.R();
        }
    }

    /* loaded from: classes.dex */
    public class f implements Runnable {

        /* loaded from: classes.dex */
        public class a extends l0 {
            public a() {
            }

            @Override // o3.l0, o3.k0
            public void onAnimationEnd(View view) {
                e.this.L.setAlpha(1.0f);
                e.this.O.f(null);
                e.this.O = null;
            }

            @Override // o3.l0, o3.k0
            public void onAnimationStart(View view) {
                e.this.L.setVisibility(0);
            }
        }

        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e eVar = e.this;
            eVar.M.showAtLocation(eVar.L, 55, 0, 0);
            e.this.U();
            if (e.this.C0()) {
                e.this.L.setAlpha(0.0f);
                e eVar2 = e.this;
                eVar2.O = c0.e(eVar2.L).a(1.0f);
                e.this.O.f(new a());
                return;
            }
            e.this.L.setAlpha(1.0f);
            e.this.L.setVisibility(0);
        }
    }

    /* loaded from: classes.dex */
    public class g extends l0 {
        public g() {
        }

        @Override // o3.l0, o3.k0
        public void onAnimationEnd(View view) {
            e.this.L.setAlpha(1.0f);
            e.this.O.f(null);
            e.this.O = null;
        }

        @Override // o3.l0, o3.k0
        public void onAnimationStart(View view) {
            e.this.L.setVisibility(0);
            if (e.this.L.getParent() instanceof View) {
                c0.o0((View) e.this.L.getParent());
            }
        }
    }

    /* loaded from: classes.dex */
    public interface h {
        boolean a(int i10);

        View onCreatePanelView(int i10);
    }

    /* loaded from: classes.dex */
    public final class i implements i.a {
        public i() {
        }

        @Override // androidx.appcompat.view.menu.i.a
        public void onCloseMenu(androidx.appcompat.view.menu.e eVar, boolean z10) {
            e.this.K(eVar);
        }

        @Override // androidx.appcompat.view.menu.i.a
        public boolean onOpenSubMenu(androidx.appcompat.view.menu.e eVar) {
            Window.Callback e02 = e.this.e0();
            if (e02 != null) {
                e02.onMenuOpened(108, eVar);
                return true;
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class j implements b.a {

        /* renamed from: a  reason: collision with root package name */
        public b.a f29905a;

        /* loaded from: classes.dex */
        public class a extends l0 {
            public a() {
            }

            @Override // o3.l0, o3.k0
            public void onAnimationEnd(View view) {
                e.this.L.setVisibility(8);
                e eVar = e.this;
                PopupWindow popupWindow = eVar.M;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (eVar.L.getParent() instanceof View) {
                    c0.o0((View) e.this.L.getParent());
                }
                e.this.L.killMode();
                e.this.O.f(null);
                e eVar2 = e.this;
                eVar2.O = null;
                c0.o0(eVar2.R);
            }
        }

        public j(b.a aVar) {
            this.f29905a = aVar;
        }

        @Override // j.b.a
        public boolean a(j.b bVar, Menu menu) {
            return this.f29905a.a(bVar, menu);
        }

        @Override // j.b.a
        public void b(j.b bVar) {
            this.f29905a.b(bVar);
            e eVar = e.this;
            if (eVar.M != null) {
                eVar.B.getDecorView().removeCallbacks(e.this.N);
            }
            e eVar2 = e.this;
            if (eVar2.L != null) {
                eVar2.U();
                e eVar3 = e.this;
                eVar3.O = c0.e(eVar3.L).a(0.0f);
                e.this.O.f(new a());
            }
            e eVar4 = e.this;
            e.c cVar = eVar4.D;
            if (cVar != null) {
                cVar.n2(eVar4.K);
            }
            e eVar5 = e.this;
            eVar5.K = null;
            c0.o0(eVar5.R);
        }

        @Override // j.b.a
        public boolean c(j.b bVar, MenuItem menuItem) {
            return this.f29905a.c(bVar, menuItem);
        }

        @Override // j.b.a
        public boolean d(j.b bVar, Menu menu) {
            c0.o0(e.this.R);
            return this.f29905a.d(bVar, menu);
        }
    }

    /* loaded from: classes.dex */
    public static class k {
        public static Context a(Context context, Configuration configuration) {
            return context.createConfigurationContext(configuration);
        }

        public static void b(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i10 = configuration.densityDpi;
            int i11 = configuration2.densityDpi;
            if (i10 != i11) {
                configuration3.densityDpi = i11;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class l {
        public static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }
    }

    /* loaded from: classes.dex */
    public static class m {
        public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }
    }

    /* loaded from: classes.dex */
    public static class n {
        public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i10 = configuration.colorMode & 3;
            int i11 = configuration2.colorMode;
            if (i10 != (i11 & 3)) {
                configuration3.colorMode |= i11 & 3;
            }
            int i12 = configuration.colorMode & 12;
            int i13 = configuration2.colorMode;
            if (i12 != (i13 & 12)) {
                configuration3.colorMode |= i13 & 12;
            }
        }
    }

    /* loaded from: classes.dex */
    public class p extends q {

        /* renamed from: c  reason: collision with root package name */
        public final PowerManager f29910c;

        public p(Context context) {
            super();
            this.f29910c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // e.e.q
        public IntentFilter b() {
            if (Build.VERSION.SDK_INT >= 21) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            }
            return null;
        }

        @Override // e.e.q
        public int c() {
            return (Build.VERSION.SDK_INT < 21 || !l.a(this.f29910c)) ? 1 : 2;
        }

        @Override // e.e.q
        public void d() {
            e.this.E();
        }
    }

    /* loaded from: classes.dex */
    public abstract class q {

        /* renamed from: a  reason: collision with root package name */
        public BroadcastReceiver f29912a;

        /* loaded from: classes.dex */
        public class a extends BroadcastReceiver {
            public a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                q.this.d();
            }
        }

        public q() {
        }

        public void a() {
            BroadcastReceiver broadcastReceiver = this.f29912a;
            if (broadcastReceiver != null) {
                try {
                    e.this.A.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f29912a = null;
            }
        }

        public abstract IntentFilter b();

        public abstract int c();

        public abstract void d();

        public void e() {
            a();
            IntentFilter b10 = b();
            if (b10 == null || b10.countActions() == 0) {
                return;
            }
            if (this.f29912a == null) {
                this.f29912a = new a();
            }
            e.this.A.registerReceiver(this.f29912a, b10);
        }
    }

    /* loaded from: classes.dex */
    public class r extends q {

        /* renamed from: c  reason: collision with root package name */
        public final e.m f29915c;

        public r(e.m mVar) {
            super();
            this.f29915c = mVar;
        }

        @Override // e.e.q
        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // e.e.q
        public int c() {
            return this.f29915c.d() ? 2 : 1;
        }

        @Override // e.e.q
        public void d() {
            e.this.E();
        }
    }

    /* loaded from: classes.dex */
    public static class s {
        public static void a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    /* loaded from: classes.dex */
    public class t extends ContentFrameLayout {
        public t(Context context) {
            super(context);
        }

        public final boolean a(int i10, int i11) {
            return i10 < -5 || i11 < -5 || i10 > getWidth() + 5 || i11 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return e.this.S(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0 && a((int) motionEvent.getX(), (int) motionEvent.getY())) {
                e.this.M(0);
                return true;
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public void setBackgroundResource(int i10) {
            setBackgroundDrawable(f.a.b(getContext(), i10));
        }
    }

    /* loaded from: classes.dex */
    public static final class u {

        /* renamed from: a  reason: collision with root package name */
        public int f29918a;

        /* renamed from: b  reason: collision with root package name */
        public int f29919b;

        /* renamed from: c  reason: collision with root package name */
        public int f29920c;

        /* renamed from: d  reason: collision with root package name */
        public int f29921d;

        /* renamed from: e  reason: collision with root package name */
        public int f29922e;

        /* renamed from: f  reason: collision with root package name */
        public int f29923f;

        /* renamed from: g  reason: collision with root package name */
        public ViewGroup f29924g;

        /* renamed from: h  reason: collision with root package name */
        public View f29925h;

        /* renamed from: i  reason: collision with root package name */
        public View f29926i;

        /* renamed from: j  reason: collision with root package name */
        public androidx.appcompat.view.menu.e f29927j;

        /* renamed from: k  reason: collision with root package name */
        public androidx.appcompat.view.menu.c f29928k;

        /* renamed from: l  reason: collision with root package name */
        public Context f29929l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f29930m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f29931n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f29932o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f29933p;

        /* renamed from: q  reason: collision with root package name */
        public boolean f29934q = false;

        /* renamed from: r  reason: collision with root package name */
        public boolean f29935r;

        /* renamed from: s  reason: collision with root package name */
        public Bundle f29936s;

        public u(int i10) {
            this.f29918a = i10;
        }

        public androidx.appcompat.view.menu.j a(i.a aVar) {
            if (this.f29927j == null) {
                return null;
            }
            if (this.f29928k == null) {
                androidx.appcompat.view.menu.c cVar = new androidx.appcompat.view.menu.c(this.f29929l, d.g.f28751l);
                this.f29928k = cVar;
                cVar.setCallback(aVar);
                this.f29927j.b(this.f29928k);
            }
            return this.f29928k.b(this.f29924g);
        }

        public boolean b() {
            if (this.f29925h == null) {
                return false;
            }
            return this.f29926i != null || this.f29928k.a().getCount() > 0;
        }

        public void c(androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.c cVar;
            androidx.appcompat.view.menu.e eVar2 = this.f29927j;
            if (eVar == eVar2) {
                return;
            }
            if (eVar2 != null) {
                eVar2.O(this.f29928k);
            }
            this.f29927j = eVar;
            if (eVar == null || (cVar = this.f29928k) == null) {
                return;
            }
            eVar.b(cVar);
        }

        public void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(d.a.f28612a, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                newTheme.applyStyle(i10, true);
            }
            newTheme.resolveAttribute(d.a.f28633k0, typedValue, true);
            int i11 = typedValue.resourceId;
            if (i11 != 0) {
                newTheme.applyStyle(i11, true);
            } else {
                newTheme.applyStyle(d.i.f28782c, true);
            }
            j.d dVar = new j.d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.f29929l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(d.j.A0);
            this.f29919b = obtainStyledAttributes.getResourceId(d.j.D0, 0);
            this.f29923f = obtainStyledAttributes.getResourceId(d.j.C0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes.dex */
    public final class v implements i.a {
        public v() {
        }

        @Override // androidx.appcompat.view.menu.i.a
        public void onCloseMenu(androidx.appcompat.view.menu.e eVar, boolean z10) {
            androidx.appcompat.view.menu.e D = eVar.D();
            boolean z11 = D != eVar;
            e eVar2 = e.this;
            if (z11) {
                eVar = D;
            }
            u X = eVar2.X(eVar);
            if (X != null) {
                if (z11) {
                    e.this.J(X.f29918a, X, D);
                    e.this.N(X, true);
                    return;
                }
                e.this.N(X, z10);
            }
        }

        @Override // androidx.appcompat.view.menu.i.a
        public boolean onOpenSubMenu(androidx.appcompat.view.menu.e eVar) {
            Window.Callback e02;
            if (eVar == eVar.D()) {
                e eVar2 = e.this;
                if (!eVar2.W || (e02 = eVar2.e0()) == null || e.this.f29879h0) {
                    return true;
                }
                e02.onMenuOpened(108, eVar);
                return true;
            }
            return true;
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = i10 < 21;
        f29870y0 = z10;
        f29871z0 = new int[]{16842836};
        A0 = !"robolectric".equals(Build.FINGERPRINT);
        B0 = i10 >= 17;
        if (!z10 || C0) {
            return;
        }
        Thread.setDefaultUncaughtExceptionHandler(new a(Thread.getDefaultUncaughtExceptionHandler()));
        C0 = true;
    }

    public e(Activity activity, e.c cVar) {
        this(activity, null, cVar, activity);
    }

    public static Configuration Y(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f10 = configuration.fontScale;
            float f11 = configuration2.fontScale;
            if (f10 != f11) {
                configuration3.fontScale = f11;
            }
            int i10 = configuration.mcc;
            int i11 = configuration2.mcc;
            if (i10 != i11) {
                configuration3.mcc = i11;
            }
            int i12 = configuration.mnc;
            int i13 = configuration2.mnc;
            if (i12 != i13) {
                configuration3.mnc = i13;
            }
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 24) {
                m.a(configuration, configuration2, configuration3);
            } else if (!n3.c.a(configuration.locale, configuration2.locale)) {
                configuration3.locale = configuration2.locale;
            }
            int i15 = configuration.touchscreen;
            int i16 = configuration2.touchscreen;
            if (i15 != i16) {
                configuration3.touchscreen = i16;
            }
            int i17 = configuration.keyboard;
            int i18 = configuration2.keyboard;
            if (i17 != i18) {
                configuration3.keyboard = i18;
            }
            int i19 = configuration.keyboardHidden;
            int i20 = configuration2.keyboardHidden;
            if (i19 != i20) {
                configuration3.keyboardHidden = i20;
            }
            int i21 = configuration.navigation;
            int i22 = configuration2.navigation;
            if (i21 != i22) {
                configuration3.navigation = i22;
            }
            int i23 = configuration.navigationHidden;
            int i24 = configuration2.navigationHidden;
            if (i23 != i24) {
                configuration3.navigationHidden = i24;
            }
            int i25 = configuration.orientation;
            int i26 = configuration2.orientation;
            if (i25 != i26) {
                configuration3.orientation = i26;
            }
            int i27 = configuration.screenLayout & 15;
            int i28 = configuration2.screenLayout;
            if (i27 != (i28 & 15)) {
                configuration3.screenLayout |= i28 & 15;
            }
            int i29 = configuration.screenLayout & PsExtractor.AUDIO_STREAM;
            int i30 = configuration2.screenLayout;
            if (i29 != (i30 & PsExtractor.AUDIO_STREAM)) {
                configuration3.screenLayout |= i30 & PsExtractor.AUDIO_STREAM;
            }
            int i31 = configuration.screenLayout & 48;
            int i32 = configuration2.screenLayout;
            if (i31 != (i32 & 48)) {
                configuration3.screenLayout |= i32 & 48;
            }
            int i33 = configuration.screenLayout & 768;
            int i34 = configuration2.screenLayout;
            if (i33 != (i34 & 768)) {
                configuration3.screenLayout |= i34 & 768;
            }
            if (i14 >= 26) {
                n.a(configuration, configuration2, configuration3);
            }
            int i35 = configuration.uiMode & 15;
            int i36 = configuration2.uiMode;
            if (i35 != (i36 & 15)) {
                configuration3.uiMode |= i36 & 15;
            }
            int i37 = configuration.uiMode & 48;
            int i38 = configuration2.uiMode;
            if (i37 != (i38 & 48)) {
                configuration3.uiMode |= i38 & 48;
            }
            int i39 = configuration.screenWidthDp;
            int i40 = configuration2.screenWidthDp;
            if (i39 != i40) {
                configuration3.screenWidthDp = i40;
            }
            int i41 = configuration.screenHeightDp;
            int i42 = configuration2.screenHeightDp;
            if (i41 != i42) {
                configuration3.screenHeightDp = i42;
            }
            int i43 = configuration.smallestScreenWidthDp;
            int i44 = configuration2.smallestScreenWidthDp;
            if (i43 != i44) {
                configuration3.smallestScreenWidthDp = i44;
            }
            if (i14 >= 17) {
                k.b(configuration, configuration2, configuration3);
            }
        }
        return configuration3;
    }

    @Override // e.d
    public void A(View view, ViewGroup.LayoutParams layoutParams) {
        V();
        ViewGroup viewGroup = (ViewGroup) this.R.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.C.a().onContentChanged();
    }

    public final void A0(boolean z10) {
        DecorContentParent decorContentParent = this.H;
        if (decorContentParent != null && decorContentParent.canShowOverflowMenu() && (!ViewConfiguration.get(this.A).hasPermanentMenuKey() || this.H.isOverflowMenuShowPending())) {
            Window.Callback e02 = e0();
            if (this.H.isOverflowMenuShowing() && z10) {
                this.H.hideOverflowMenu();
                if (this.f29879h0) {
                    return;
                }
                e02.onPanelClosed(108, c0(0, true).f29927j);
                return;
            } else if (e02 == null || this.f29879h0) {
                return;
            } else {
                if (this.f29887p0 && (this.f29888q0 & 1) != 0) {
                    this.B.getDecorView().removeCallbacks(this.f29889r0);
                    this.f29889r0.run();
                }
                u c02 = c0(0, true);
                androidx.appcompat.view.menu.e eVar = c02.f29927j;
                if (eVar == null || c02.f29935r || !e02.onPreparePanel(0, c02.f29926i, eVar)) {
                    return;
                }
                e02.onMenuOpened(108, c02.f29927j);
                this.H.showOverflowMenu();
                return;
            }
        }
        u c03 = c0(0, true);
        c03.f29934q = true;
        N(c03, false);
        w0(c03, null);
    }

    @Override // e.d
    public void B(Toolbar toolbar) {
        if (this.f29895z instanceof Activity) {
            e.a k10 = k();
            if (!(k10 instanceof e.n)) {
                this.F = null;
                if (k10 != null) {
                    k10.h();
                }
                this.E = null;
                if (toolbar != null) {
                    e.k kVar = new e.k(toolbar, d0(), this.C);
                    this.E = kVar;
                    this.C.b(kVar.f29964c);
                } else {
                    this.C.b(null);
                }
                m();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    public final int B0(int i10) {
        if (i10 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        } else if (i10 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return 109;
        } else {
            return i10;
        }
    }

    @Override // e.d
    public void C(int i10) {
        this.f29882k0 = i10;
    }

    public final boolean C0() {
        ViewGroup viewGroup;
        return this.Q && (viewGroup = this.R) != null && c0.V(viewGroup);
    }

    @Override // e.d
    public final void D(CharSequence charSequence) {
        this.G = charSequence;
        DecorContentParent decorContentParent = this.H;
        if (decorContentParent != null) {
            decorContentParent.setWindowTitle(charSequence);
        } else if (x0() != null) {
            x0().u(charSequence);
        } else {
            TextView textView = this.S;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    public final boolean D0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.B.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || c0.U((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    public boolean E() {
        return F(true);
    }

    public j.b E0(b.a aVar) {
        e.c cVar;
        if (aVar != null) {
            j.b bVar = this.K;
            if (bVar != null) {
                bVar.a();
            }
            j jVar = new j(aVar);
            e.a k10 = k();
            if (k10 != null) {
                j.b v10 = k10.v(jVar);
                this.K = v10;
                if (v10 != null && (cVar = this.D) != null) {
                    cVar.H1(v10);
                }
            }
            if (this.K == null) {
                this.K = F0(jVar);
            }
            return this.K;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    public final boolean F(boolean z10) {
        if (this.f29879h0) {
            return false;
        }
        int I = I();
        boolean I0 = I0(m0(this.A, I), z10);
        if (I == 0) {
            b0(this.A).e();
        } else {
            q qVar = this.f29885n0;
            if (qVar != null) {
                qVar.a();
            }
        }
        if (I == 3) {
            a0(this.A).e();
        } else {
            q qVar2 = this.f29886o0;
            if (qVar2 != null) {
                qVar2.a();
            }
        }
        return I0;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public j.b F0(j.b.a r8) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.e.F0(j.b$a):j.b");
    }

    public final void G() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.R.findViewById(16908290);
        View decorView = this.B.getDecorView();
        contentFrameLayout.setDecorPadding(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.A.obtainStyledAttributes(d.j.A0);
        obtainStyledAttributes.getValue(d.j.M0, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(d.j.N0, contentFrameLayout.getMinWidthMinor());
        int i10 = d.j.K0;
        if (obtainStyledAttributes.hasValue(i10)) {
            obtainStyledAttributes.getValue(i10, contentFrameLayout.getFixedWidthMajor());
        }
        int i11 = d.j.L0;
        if (obtainStyledAttributes.hasValue(i11)) {
            obtainStyledAttributes.getValue(i11, contentFrameLayout.getFixedWidthMinor());
        }
        int i12 = d.j.I0;
        if (obtainStyledAttributes.hasValue(i12)) {
            obtainStyledAttributes.getValue(i12, contentFrameLayout.getFixedHeightMajor());
        }
        int i13 = d.j.J0;
        if (obtainStyledAttributes.hasValue(i13)) {
            obtainStyledAttributes.getValue(i13, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    public final void G0() {
        if (this.Q) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void H(Window window) {
        if (this.B == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof o)) {
                o oVar = new o(callback);
                this.C = oVar;
                window.setCallback(oVar);
                TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(this.A, (AttributeSet) null, f29871z0);
                Drawable drawableIfKnown = obtainStyledAttributes.getDrawableIfKnown(0);
                if (drawableIfKnown != null) {
                    window.setBackgroundDrawable(drawableIfKnown);
                }
                obtainStyledAttributes.recycle();
                this.B = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    public final e.b H0() {
        for (Context context = this.A; context != null; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof e.b) {
                return (e.b) context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    public final int I() {
        int i10 = this.f29881j0;
        return i10 != -100 ? i10 : e.d.h();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean I0(int r7, boolean r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.A
            r1 = 0
            android.content.res.Configuration r0 = r6.O(r0, r7, r1)
            boolean r2 = r6.k0()
            android.content.res.Configuration r3 = r6.f29880i0
            if (r3 != 0) goto L19
            android.content.Context r3 = r6.A
            android.content.res.Resources r3 = r3.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
        L19:
            int r3 = r3.uiMode
            r3 = r3 & 48
            int r0 = r0.uiMode
            r0 = r0 & 48
            r4 = 1
            if (r3 == r0) goto L4b
            if (r8 == 0) goto L4b
            if (r2 != 0) goto L4b
            boolean r8 = r6.f29877f0
            if (r8 == 0) goto L4b
            boolean r8 = e.e.A0
            if (r8 != 0) goto L34
            boolean r8 = r6.f29878g0
            if (r8 == 0) goto L4b
        L34:
            java.lang.Object r8 = r6.f29895z
            boolean r5 = r8 instanceof android.app.Activity
            if (r5 == 0) goto L4b
            android.app.Activity r8 = (android.app.Activity) r8
            boolean r8 = r8.isChild()
            if (r8 != 0) goto L4b
            java.lang.Object r8 = r6.f29895z
            android.app.Activity r8 = (android.app.Activity) r8
            b3.a.p(r8)
            r8 = r4
            goto L4c
        L4b:
            r8 = 0
        L4c:
            if (r8 != 0) goto L54
            if (r3 == r0) goto L54
            r6.J0(r0, r2, r1)
            goto L55
        L54:
            r4 = r8
        L55:
            if (r4 == 0) goto L62
            java.lang.Object r8 = r6.f29895z
            boolean r0 = r8 instanceof e.b
            if (r0 == 0) goto L62
            e.b r8 = (e.b) r8
            r8.p3(r7)
        L62:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: e.e.I0(int, boolean):boolean");
    }

    public void J(int i10, u uVar, Menu menu) {
        if (menu == null) {
            if (uVar == null && i10 >= 0) {
                u[] uVarArr = this.f29874c0;
                if (i10 < uVarArr.length) {
                    uVar = uVarArr[i10];
                }
            }
            if (uVar != null) {
                menu = uVar.f29927j;
            }
        }
        if ((uVar == null || uVar.f29932o) && !this.f29879h0) {
            this.C.a().onPanelClosed(i10, menu);
        }
    }

    public final void J0(int i10, boolean z10, Configuration configuration) {
        Resources resources = this.A.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i10 | (resources.getConfiguration().uiMode & (-49));
        resources.updateConfiguration(configuration2, null);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 26) {
            e.j.a(resources);
        }
        int i12 = this.f29882k0;
        if (i12 != 0) {
            this.A.setTheme(i12);
            if (i11 >= 23) {
                this.A.getTheme().applyStyle(this.f29882k0, true);
            }
        }
        if (z10) {
            Object obj = this.f29895z;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof androidx.lifecycle.u) {
                    if (((androidx.lifecycle.u) activity).g().b().a(o.c.CREATED)) {
                        activity.onConfigurationChanged(configuration2);
                    }
                } else if (!this.f29878g0 || this.f29879h0) {
                } else {
                    activity.onConfigurationChanged(configuration2);
                }
            }
        }
    }

    public void K(androidx.appcompat.view.menu.e eVar) {
        if (this.f29873b0) {
            return;
        }
        this.f29873b0 = true;
        this.H.dismissPopups();
        Window.Callback e02 = e0();
        if (e02 != null && !this.f29879h0) {
            e02.onPanelClosed(108, eVar);
        }
        this.f29873b0 = false;
    }

    public final int K0(p0 p0Var, Rect rect) {
        int i10;
        boolean z10;
        boolean z11;
        if (p0Var != null) {
            i10 = p0Var.m();
        } else {
            i10 = rect != null ? rect.top : 0;
        }
        ActionBarContextView actionBarContextView = this.L;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z10 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.L.getLayoutParams();
            if (this.L.isShown()) {
                if (this.f29891t0 == null) {
                    this.f29891t0 = new Rect();
                    this.f29892u0 = new Rect();
                }
                Rect rect2 = this.f29891t0;
                Rect rect3 = this.f29892u0;
                if (p0Var == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(p0Var.k(), p0Var.m(), p0Var.l(), p0Var.j());
                }
                ViewUtils.computeFitSystemWindows(this.R, rect2, rect3);
                int i11 = rect2.top;
                int i12 = rect2.left;
                int i13 = rect2.right;
                p0 L = c0.L(this.R);
                int k10 = L == null ? 0 : L.k();
                int l10 = L == null ? 0 : L.l();
                if (marginLayoutParams.topMargin == i11 && marginLayoutParams.leftMargin == i12 && marginLayoutParams.rightMargin == i13) {
                    z11 = false;
                } else {
                    marginLayoutParams.topMargin = i11;
                    marginLayoutParams.leftMargin = i12;
                    marginLayoutParams.rightMargin = i13;
                    z11 = true;
                }
                if (i11 > 0 && this.T == null) {
                    View view = new View(this.A);
                    this.T = view;
                    view.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = k10;
                    layoutParams.rightMargin = l10;
                    this.R.addView(this.T, -1, layoutParams);
                } else {
                    View view2 = this.T;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i14 = marginLayoutParams2.height;
                        int i15 = marginLayoutParams.topMargin;
                        if (i14 != i15 || marginLayoutParams2.leftMargin != k10 || marginLayoutParams2.rightMargin != l10) {
                            marginLayoutParams2.height = i15;
                            marginLayoutParams2.leftMargin = k10;
                            marginLayoutParams2.rightMargin = l10;
                            this.T.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view3 = this.T;
                r5 = view3 != null;
                if (r5 && view3.getVisibility() != 0) {
                    L0(this.T);
                }
                if (!this.Y && r5) {
                    i10 = 0;
                }
                z10 = r5;
                r5 = z11;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z10 = false;
            } else {
                z10 = false;
                r5 = false;
            }
            if (r5) {
                this.L.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.T;
        if (view4 != null) {
            view4.setVisibility(z10 ? 0 : 8);
        }
        return i10;
    }

    public final void L() {
        q qVar = this.f29885n0;
        if (qVar != null) {
            qVar.a();
        }
        q qVar2 = this.f29886o0;
        if (qVar2 != null) {
            qVar2.a();
        }
    }

    public final void L0(View view) {
        int d10;
        if ((c0.O(view) & 8192) != 0) {
            d10 = c3.a.d(this.A, d.c.f28666b);
        } else {
            d10 = c3.a.d(this.A, d.c.f28665a);
        }
        view.setBackgroundColor(d10);
    }

    public void M(int i10) {
        N(c0(i10, true), true);
    }

    public void N(u uVar, boolean z10) {
        ViewGroup viewGroup;
        DecorContentParent decorContentParent;
        if (z10 && uVar.f29918a == 0 && (decorContentParent = this.H) != null && decorContentParent.isOverflowMenuShowing()) {
            K(uVar.f29927j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.A.getSystemService("window");
        if (windowManager != null && uVar.f29932o && (viewGroup = uVar.f29924g) != null) {
            windowManager.removeView(viewGroup);
            if (z10) {
                J(uVar.f29918a, uVar, null);
            }
        }
        uVar.f29930m = false;
        uVar.f29931n = false;
        uVar.f29932o = false;
        uVar.f29925h = null;
        uVar.f29934q = true;
        if (this.f29875d0 == uVar) {
            this.f29875d0 = null;
        }
    }

    public final Configuration O(Context context, int i10, Configuration configuration) {
        int i11;
        if (i10 != 1) {
            i11 = i10 != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32;
        } else {
            i11 = 16;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i11 | (configuration2.uiMode & (-49));
        return configuration2;
    }

    public final ViewGroup P() {
        ViewGroup viewGroup;
        Context context;
        TypedArray obtainStyledAttributes = this.A.obtainStyledAttributes(d.j.A0);
        int i10 = d.j.F0;
        if (obtainStyledAttributes.hasValue(i10)) {
            if (obtainStyledAttributes.getBoolean(d.j.O0, false)) {
                x(1);
            } else if (obtainStyledAttributes.getBoolean(i10, false)) {
                x(108);
            }
            if (obtainStyledAttributes.getBoolean(d.j.G0, false)) {
                x(109);
            }
            if (obtainStyledAttributes.getBoolean(d.j.H0, false)) {
                x(10);
            }
            this.Z = obtainStyledAttributes.getBoolean(d.j.B0, false);
            obtainStyledAttributes.recycle();
            W();
            this.B.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.A);
            if (!this.f29872a0) {
                if (this.Z) {
                    viewGroup = (ViewGroup) from.inflate(d.g.f28747h, (ViewGroup) null);
                    this.X = false;
                    this.W = false;
                } else if (this.W) {
                    TypedValue typedValue = new TypedValue();
                    this.A.getTheme().resolveAttribute(d.a.f28624g, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        context = new j.d(this.A, typedValue.resourceId);
                    } else {
                        context = this.A;
                    }
                    viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(d.g.f28757r, (ViewGroup) null);
                    DecorContentParent decorContentParent = (DecorContentParent) viewGroup.findViewById(d.f.f28730q);
                    this.H = decorContentParent;
                    decorContentParent.setWindowCallback(e0());
                    if (this.X) {
                        this.H.initFeature(109);
                    }
                    if (this.U) {
                        this.H.initFeature(2);
                    }
                    if (this.V) {
                        this.H.initFeature(5);
                    }
                } else {
                    viewGroup = null;
                }
            } else {
                viewGroup = this.Y ? (ViewGroup) from.inflate(d.g.f28756q, (ViewGroup) null) : (ViewGroup) from.inflate(d.g.f28755p, (ViewGroup) null);
            }
            if (viewGroup != null) {
                if (Build.VERSION.SDK_INT >= 21) {
                    c0.F0(viewGroup, new c());
                } else if (viewGroup instanceof FitWindowsViewGroup) {
                    ((FitWindowsViewGroup) viewGroup).setOnFitSystemWindowsListener(new d());
                }
                if (this.H == null) {
                    this.S = (TextView) viewGroup.findViewById(d.f.S);
                }
                ViewUtils.makeOptionalFitsSystemWindows(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(d.f.f28715b);
                ViewGroup viewGroup2 = (ViewGroup) this.B.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground(null);
                    }
                }
                this.B.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new C0295e());
                return viewGroup;
            }
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.W + ", windowActionBarOverlay: " + this.X + ", android:windowIsFloating: " + this.Z + ", windowActionModeOverlay: " + this.Y + ", windowNoTitle: " + this.f29872a0 + " }");
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0080, code lost:
        if (((org.xmlpull.v1.XmlPullParser) r15).getDepth() > 1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View Q(android.view.View r12, java.lang.String r13, android.content.Context r14, android.util.AttributeSet r15) {
        /*
            r11 = this;
            e.h r0 = r11.f29893v0
            r1 = 0
            if (r0 != 0) goto L5b
            android.content.Context r0 = r11.A
            int[] r2 = d.j.A0
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r2)
            int r2 = d.j.E0
            java.lang.String r0 = r0.getString(r2)
            if (r0 != 0) goto L1d
            e.h r0 = new e.h
            r0.<init>()
            r11.f29893v0 = r0
            goto L5b
        L1d:
            android.content.Context r2 = r11.A     // Catch: java.lang.Throwable -> L38
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.Throwable -> L38
            java.lang.Class r2 = r2.loadClass(r0)     // Catch: java.lang.Throwable -> L38
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L38
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r3)     // Catch: java.lang.Throwable -> L38
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L38
            java.lang.Object r2 = r2.newInstance(r3)     // Catch: java.lang.Throwable -> L38
            e.h r2 = (e.h) r2     // Catch: java.lang.Throwable -> L38
            r11.f29893v0 = r2     // Catch: java.lang.Throwable -> L38
            goto L5b
        L38:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Failed to instantiate custom view inflater "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = ". Falling back to default."
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r3 = "AppCompatDelegate"
            android.util.Log.i(r3, r0, r2)
            e.h r0 = new e.h
            r0.<init>()
            r11.f29893v0 = r0
        L5b:
            boolean r8 = e.e.f29870y0
            r0 = 1
            if (r8 == 0) goto L8b
            e.i r2 = r11.f29894w0
            if (r2 != 0) goto L6b
            e.i r2 = new e.i
            r2.<init>()
            r11.f29894w0 = r2
        L6b:
            e.i r2 = r11.f29894w0
            boolean r2 = r2.a(r15)
            if (r2 == 0) goto L75
            r7 = r0
            goto L8c
        L75:
            boolean r2 = r15 instanceof org.xmlpull.v1.XmlPullParser
            if (r2 == 0) goto L83
            r2 = r15
            org.xmlpull.v1.XmlPullParser r2 = (org.xmlpull.v1.XmlPullParser) r2
            int r2 = r2.getDepth()
            if (r2 <= r0) goto L8b
            goto L8a
        L83:
            r0 = r12
            android.view.ViewParent r0 = (android.view.ViewParent) r0
            boolean r0 = r11.D0(r0)
        L8a:
            r1 = r0
        L8b:
            r7 = r1
        L8c:
            e.h r2 = r11.f29893v0
            r9 = 1
            boolean r10 = androidx.appcompat.widget.VectorEnabledTintResources.shouldBeUsed()
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            android.view.View r12 = r2.r(r3, r4, r5, r6, r7, r8, r9, r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: e.e.Q(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public void R() {
        androidx.appcompat.view.menu.e eVar;
        DecorContentParent decorContentParent = this.H;
        if (decorContentParent != null) {
            decorContentParent.dismissPopups();
        }
        if (this.M != null) {
            this.B.getDecorView().removeCallbacks(this.N);
            if (this.M.isShowing()) {
                try {
                    this.M.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.M = null;
        }
        U();
        u c02 = c0(0, false);
        if (c02 == null || (eVar = c02.f29927j) == null) {
            return;
        }
        eVar.close();
    }

    public boolean S(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f29895z;
        if (((obj instanceof g.a) || (obj instanceof e.f)) && (decorView = this.B.getDecorView()) != null && o3.g.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.C.a().dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? o0(keyCode, keyEvent) : r0(keyCode, keyEvent);
    }

    public void T(int i10) {
        u c02;
        u c03 = c0(i10, true);
        if (c03.f29927j != null) {
            Bundle bundle = new Bundle();
            c03.f29927j.Q(bundle);
            if (bundle.size() > 0) {
                c03.f29936s = bundle;
            }
            c03.f29927j.d0();
            c03.f29927j.clear();
        }
        c03.f29935r = true;
        c03.f29934q = true;
        if ((i10 != 108 && i10 != 0) || this.H == null || (c02 = c0(0, false)) == null) {
            return;
        }
        c02.f29930m = false;
        z0(c02, null);
    }

    public void U() {
        j0 j0Var = this.O;
        if (j0Var != null) {
            j0Var.b();
        }
    }

    public final void V() {
        if (this.Q) {
            return;
        }
        this.R = P();
        CharSequence d02 = d0();
        if (!TextUtils.isEmpty(d02)) {
            DecorContentParent decorContentParent = this.H;
            if (decorContentParent != null) {
                decorContentParent.setWindowTitle(d02);
            } else if (x0() != null) {
                x0().u(d02);
            } else {
                TextView textView = this.S;
                if (textView != null) {
                    textView.setText(d02);
                }
            }
        }
        G();
        v0(this.R);
        this.Q = true;
        u c02 = c0(0, false);
        if (this.f29879h0) {
            return;
        }
        if (c02 == null || c02.f29927j == null) {
            j0(108);
        }
    }

    public final void W() {
        if (this.B == null) {
            Object obj = this.f29895z;
            if (obj instanceof Activity) {
                H(((Activity) obj).getWindow());
            }
        }
        if (this.B == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public u X(Menu menu) {
        u[] uVarArr = this.f29874c0;
        int length = uVarArr != null ? uVarArr.length : 0;
        for (int i10 = 0; i10 < length; i10++) {
            u uVar = uVarArr[i10];
            if (uVar != null && uVar.f29927j == menu) {
                return uVar;
            }
        }
        return null;
    }

    public final Context Z() {
        e.a k10 = k();
        Context e10 = k10 != null ? k10.e() : null;
        return e10 == null ? this.A : e10;
    }

    public final q a0(Context context) {
        if (this.f29886o0 == null) {
            this.f29886o0 = new p(context);
        }
        return this.f29886o0;
    }

    @Override // e.d
    public void b(View view, ViewGroup.LayoutParams layoutParams) {
        V();
        ((ViewGroup) this.R.findViewById(16908290)).addView(view, layoutParams);
        this.C.a().onContentChanged();
    }

    public final q b0(Context context) {
        if (this.f29885n0 == null) {
            this.f29885n0 = new r(e.m.a(context));
        }
        return this.f29885n0;
    }

    public u c0(int i10, boolean z10) {
        u[] uVarArr = this.f29874c0;
        if (uVarArr == null || uVarArr.length <= i10) {
            u[] uVarArr2 = new u[i10 + 1];
            if (uVarArr != null) {
                System.arraycopy(uVarArr, 0, uVarArr2, 0, uVarArr.length);
            }
            this.f29874c0 = uVarArr2;
            uVarArr = uVarArr2;
        }
        u uVar = uVarArr[i10];
        if (uVar == null) {
            u uVar2 = new u(i10);
            uVarArr[i10] = uVar2;
            return uVar2;
        }
        return uVar;
    }

    @Override // e.d
    public Context d(Context context) {
        this.f29877f0 = true;
        int m02 = m0(context, I());
        Configuration configuration = null;
        if (B0 && (context instanceof ContextThemeWrapper)) {
            try {
                s.a((ContextThemeWrapper) context, O(context, m02, null));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof j.d) {
            try {
                ((j.d) context).a(O(context, m02, null));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!A0) {
            return super.d(context);
        }
        if (Build.VERSION.SDK_INT >= 17) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = k.a(context, configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (!configuration3.equals(configuration4)) {
                configuration = Y(configuration3, configuration4);
            }
        }
        Configuration O = O(context, m02, configuration);
        j.d dVar = new j.d(context, d.i.f28783d);
        dVar.a(O);
        boolean z10 = false;
        try {
            z10 = context.getTheme() != null;
        } catch (NullPointerException unused3) {
        }
        if (z10) {
            h.e.a(dVar.getTheme());
        }
        return super.d(dVar);
    }

    public final CharSequence d0() {
        Object obj = this.f29895z;
        if (obj instanceof Activity) {
            return ((Activity) obj).getTitle();
        }
        return this.G;
    }

    public final Window.Callback e0() {
        return this.B.getCallback();
    }

    public final void f0() {
        V();
        if (this.W && this.E == null) {
            Object obj = this.f29895z;
            if (obj instanceof Activity) {
                this.E = new e.n((Activity) this.f29895z, this.X);
            } else if (obj instanceof Dialog) {
                this.E = new e.n((Dialog) this.f29895z);
            }
            e.a aVar = this.E;
            if (aVar != null) {
                aVar.m(this.f29890s0);
            }
        }
    }

    @Override // e.d
    public <T extends View> T g(int i10) {
        V();
        return (T) this.B.findViewById(i10);
    }

    public final boolean g0(u uVar) {
        View view = uVar.f29926i;
        if (view != null) {
            uVar.f29925h = view;
            return true;
        } else if (uVar.f29927j == null) {
            return false;
        } else {
            if (this.J == null) {
                this.J = new v();
            }
            View view2 = (View) uVar.a(this.J);
            uVar.f29925h = view2;
            return view2 != null;
        }
    }

    public final boolean h0(u uVar) {
        uVar.d(Z());
        uVar.f29924g = new t(uVar.f29929l);
        uVar.f29920c = 81;
        return true;
    }

    @Override // e.d
    public int i() {
        return this.f29881j0;
    }

    public final boolean i0(u uVar) {
        Context context = this.A;
        int i10 = uVar.f29918a;
        if ((i10 == 0 || i10 == 108) && this.H != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(d.a.f28624g, typedValue, true);
            Resources.Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(d.a.f28626h, typedValue, true);
            } else {
                theme.resolveAttribute(d.a.f28626h, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                j.d dVar = new j.d(context, 0);
                dVar.getTheme().setTo(theme2);
                context = dVar;
            }
        }
        androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
        eVar.R(this);
        uVar.c(eVar);
        return true;
    }

    @Override // e.d
    public MenuInflater j() {
        if (this.F == null) {
            f0();
            e.a aVar = this.E;
            this.F = new j.g(aVar != null ? aVar.e() : this.A);
        }
        return this.F;
    }

    public final void j0(int i10) {
        this.f29888q0 = (1 << i10) | this.f29888q0;
        if (this.f29887p0) {
            return;
        }
        c0.j0(this.B.getDecorView(), this.f29889r0);
        this.f29887p0 = true;
    }

    @Override // e.d
    public e.a k() {
        f0();
        return this.E;
    }

    public final boolean k0() {
        if (!this.f29884m0 && (this.f29895z instanceof Activity)) {
            PackageManager packageManager = this.A.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                int i10 = Build.VERSION.SDK_INT;
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.A, this.f29895z.getClass()), i10 >= 29 ? 269221888 : i10 >= 24 ? 786432 : 0);
                this.f29883l0 = (activityInfo == null || (activityInfo.configChanges & 512) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException e10) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e10);
                this.f29883l0 = false;
            }
        }
        this.f29884m0 = true;
        return this.f29883l0;
    }

    @Override // e.d
    public void l() {
        LayoutInflater from = LayoutInflater.from(this.A);
        if (from.getFactory() == null) {
            o3.h.b(from, this);
        } else if (from.getFactory2() instanceof e) {
        } else {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    public boolean l0() {
        return this.P;
    }

    @Override // e.d
    public void m() {
        e.a k10 = k();
        if (k10 == null || !k10.f()) {
            j0(0);
        }
    }

    public int m0(Context context, int i10) {
        if (i10 != -100) {
            if (i10 != -1) {
                if (i10 == 0) {
                    if (Build.VERSION.SDK_INT < 23 || ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                        return b0(context).c();
                    }
                    return -1;
                } else if (i10 != 1 && i10 != 2) {
                    if (i10 == 3) {
                        return a0(context).c();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            }
            return i10;
        }
        return -1;
    }

    @Override // e.d
    public void n(Configuration configuration) {
        e.a k10;
        if (this.W && this.Q && (k10 = k()) != null) {
            k10.g(configuration);
        }
        AppCompatDrawableManager.get().onConfigurationChanged(this.A);
        this.f29880i0 = new Configuration(this.A.getResources().getConfiguration());
        F(false);
    }

    public boolean n0() {
        j.b bVar = this.K;
        if (bVar != null) {
            bVar.a();
            return true;
        }
        e.a k10 = k();
        return k10 != null && k10.b();
    }

    @Override // e.d
    public void o(Bundle bundle) {
        this.f29877f0 = true;
        F(false);
        W();
        Object obj = this.f29895z;
        if (obj instanceof Activity) {
            String str = null;
            try {
                str = b3.h.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                e.a x02 = x0();
                if (x02 == null) {
                    this.f29890s0 = true;
                } else {
                    x02.m(true);
                }
            }
            e.d.a(this);
        }
        this.f29880i0 = new Configuration(this.A.getResources().getConfiguration());
        this.f29878g0 = true;
    }

    public boolean o0(int i10, KeyEvent keyEvent) {
        if (i10 == 4) {
            this.f29876e0 = (keyEvent.getFlags() & 128) != 0;
        } else if (i10 == 82) {
            p0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return Q(view, str, context, attributeSet);
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean onMenuItemSelected(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        u X;
        Window.Callback e02 = e0();
        if (e02 == null || this.f29879h0 || (X = X(eVar.D())) == null) {
            return false;
        }
        return e02.onMenuItemSelected(X.f29918a, menuItem);
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void onMenuModeChange(androidx.appcompat.view.menu.e eVar) {
        A0(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    @Override // e.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void p() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f29895z
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L9
            e.d.v(r3)
        L9:
            boolean r0 = r3.f29887p0
            if (r0 == 0) goto L18
            android.view.Window r0 = r3.B
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.f29889r0
            r0.removeCallbacks(r1)
        L18:
            r0 = 1
            r3.f29879h0 = r0
            int r0 = r3.f29881j0
            r1 = -100
            if (r0 == r1) goto L45
            java.lang.Object r0 = r3.f29895z
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L45
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L45
            s.g<java.lang.String, java.lang.Integer> r0 = e.e.f29869x0
            java.lang.Object r1 = r3.f29895z
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f29881j0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L54
        L45:
            s.g<java.lang.String, java.lang.Integer> r0 = e.e.f29869x0
            java.lang.Object r1 = r3.f29895z
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L54:
            e.a r0 = r3.E
            if (r0 == 0) goto L5b
            r0.h()
        L5b:
            r3.L()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.e.p():void");
    }

    public final boolean p0(int i10, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() == 0) {
            u c02 = c0(i10, true);
            if (c02.f29932o) {
                return false;
            }
            return z0(c02, keyEvent);
        }
        return false;
    }

    @Override // e.d
    public void q(Bundle bundle) {
        V();
    }

    public boolean q0(int i10, KeyEvent keyEvent) {
        e.a k10 = k();
        if (k10 == null || !k10.i(i10, keyEvent)) {
            u uVar = this.f29875d0;
            if (uVar != null && y0(uVar, keyEvent.getKeyCode(), keyEvent, 1)) {
                u uVar2 = this.f29875d0;
                if (uVar2 != null) {
                    uVar2.f29931n = true;
                }
                return true;
            }
            if (this.f29875d0 == null) {
                u c02 = c0(0, true);
                z0(c02, keyEvent);
                boolean y02 = y0(c02, keyEvent.getKeyCode(), keyEvent, 1);
                c02.f29930m = false;
                if (y02) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @Override // e.d
    public void r() {
        e.a k10 = k();
        if (k10 != null) {
            k10.s(true);
        }
    }

    public boolean r0(int i10, KeyEvent keyEvent) {
        if (i10 == 4) {
            boolean z10 = this.f29876e0;
            this.f29876e0 = false;
            u c02 = c0(0, false);
            if (c02 != null && c02.f29932o) {
                if (!z10) {
                    N(c02, true);
                }
                return true;
            } else if (n0()) {
                return true;
            }
        } else if (i10 == 82) {
            s0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // e.d
    public void s(Bundle bundle) {
    }

    public final boolean s0(int i10, KeyEvent keyEvent) {
        boolean z10;
        DecorContentParent decorContentParent;
        if (this.K != null) {
            return false;
        }
        boolean z11 = true;
        u c02 = c0(i10, true);
        if (i10 == 0 && (decorContentParent = this.H) != null && decorContentParent.canShowOverflowMenu() && !ViewConfiguration.get(this.A).hasPermanentMenuKey()) {
            if (!this.H.isOverflowMenuShowing()) {
                if (!this.f29879h0 && z0(c02, keyEvent)) {
                    z11 = this.H.showOverflowMenu();
                }
                z11 = false;
            } else {
                z11 = this.H.hideOverflowMenu();
            }
        } else {
            boolean z12 = c02.f29932o;
            if (!z12 && !c02.f29931n) {
                if (c02.f29930m) {
                    if (c02.f29935r) {
                        c02.f29930m = false;
                        z10 = z0(c02, keyEvent);
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        w0(c02, keyEvent);
                    }
                }
                z11 = false;
            } else {
                N(c02, true);
                z11 = z12;
            }
        }
        if (z11) {
            AudioManager audioManager = (AudioManager) this.A.getApplicationContext().getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
            } else {
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
            }
        }
        return z11;
    }

    @Override // e.d
    public void t() {
        E();
    }

    public void t0(int i10) {
        e.a k10;
        if (i10 != 108 || (k10 = k()) == null) {
            return;
        }
        k10.c(true);
    }

    @Override // e.d
    public void u() {
        e.a k10 = k();
        if (k10 != null) {
            k10.s(false);
        }
    }

    public void u0(int i10) {
        if (i10 == 108) {
            e.a k10 = k();
            if (k10 != null) {
                k10.c(false);
            }
        } else if (i10 == 0) {
            u c02 = c0(i10, true);
            if (c02.f29932o) {
                N(c02, false);
            }
        }
    }

    public void v0(ViewGroup viewGroup) {
    }

    public final void w0(u uVar, KeyEvent keyEvent) {
        int i10;
        ViewGroup.LayoutParams layoutParams;
        if (uVar.f29932o || this.f29879h0) {
            return;
        }
        if (uVar.f29918a == 0) {
            if ((this.A.getResources().getConfiguration().screenLayout & 15) == 4) {
                return;
            }
        }
        Window.Callback e02 = e0();
        if (e02 != null && !e02.onMenuOpened(uVar.f29918a, uVar.f29927j)) {
            N(uVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.A.getSystemService("window");
        if (windowManager != null && z0(uVar, keyEvent)) {
            ViewGroup viewGroup = uVar.f29924g;
            if (viewGroup != null && !uVar.f29934q) {
                View view = uVar.f29926i;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i10 = -1;
                    uVar.f29931n = false;
                    WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i10, -2, uVar.f29921d, uVar.f29922e, AnalyticsListener.EVENT_LOAD_CANCELED, 8519680, -3);
                    layoutParams2.gravity = uVar.f29920c;
                    layoutParams2.windowAnimations = uVar.f29923f;
                    windowManager.addView(uVar.f29924g, layoutParams2);
                    uVar.f29932o = true;
                }
            } else {
                if (viewGroup == null) {
                    if (!h0(uVar) || uVar.f29924g == null) {
                        return;
                    }
                } else if (uVar.f29934q && viewGroup.getChildCount() > 0) {
                    uVar.f29924g.removeAllViews();
                }
                if (g0(uVar) && uVar.b()) {
                    ViewGroup.LayoutParams layoutParams3 = uVar.f29925h.getLayoutParams();
                    if (layoutParams3 == null) {
                        layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
                    }
                    uVar.f29924g.setBackgroundResource(uVar.f29919b);
                    ViewParent parent = uVar.f29925h.getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(uVar.f29925h);
                    }
                    uVar.f29924g.addView(uVar.f29925h, layoutParams3);
                    if (!uVar.f29925h.hasFocus()) {
                        uVar.f29925h.requestFocus();
                    }
                } else {
                    uVar.f29934q = true;
                    return;
                }
            }
            i10 = -2;
            uVar.f29931n = false;
            WindowManager.LayoutParams layoutParams22 = new WindowManager.LayoutParams(i10, -2, uVar.f29921d, uVar.f29922e, AnalyticsListener.EVENT_LOAD_CANCELED, 8519680, -3);
            layoutParams22.gravity = uVar.f29920c;
            layoutParams22.windowAnimations = uVar.f29923f;
            windowManager.addView(uVar.f29924g, layoutParams22);
            uVar.f29932o = true;
        }
    }

    @Override // e.d
    public boolean x(int i10) {
        int B02 = B0(i10);
        if (this.f29872a0 && B02 == 108) {
            return false;
        }
        if (this.W && B02 == 1) {
            this.W = false;
        }
        if (B02 == 1) {
            G0();
            this.f29872a0 = true;
            return true;
        } else if (B02 == 2) {
            G0();
            this.U = true;
            return true;
        } else if (B02 == 5) {
            G0();
            this.V = true;
            return true;
        } else if (B02 == 10) {
            G0();
            this.Y = true;
            return true;
        } else if (B02 == 108) {
            G0();
            this.W = true;
            return true;
        } else if (B02 != 109) {
            return this.B.requestFeature(B02);
        } else {
            G0();
            this.X = true;
            return true;
        }
    }

    public final e.a x0() {
        return this.E;
    }

    @Override // e.d
    public void y(int i10) {
        V();
        ViewGroup viewGroup = (ViewGroup) this.R.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.A).inflate(i10, viewGroup);
        this.C.a().onContentChanged();
    }

    public final boolean y0(u uVar, int i10, KeyEvent keyEvent, int i11) {
        androidx.appcompat.view.menu.e eVar;
        boolean z10 = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((uVar.f29930m || z0(uVar, keyEvent)) && (eVar = uVar.f29927j) != null) {
            z10 = eVar.performShortcut(i10, keyEvent, i11);
        }
        if (z10 && (i11 & 1) == 0 && this.H == null) {
            N(uVar, true);
        }
        return z10;
    }

    @Override // e.d
    public void z(View view) {
        V();
        ViewGroup viewGroup = (ViewGroup) this.R.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.C.a().onContentChanged();
    }

    public final boolean z0(u uVar, KeyEvent keyEvent) {
        DecorContentParent decorContentParent;
        DecorContentParent decorContentParent2;
        DecorContentParent decorContentParent3;
        if (this.f29879h0) {
            return false;
        }
        if (uVar.f29930m) {
            return true;
        }
        u uVar2 = this.f29875d0;
        if (uVar2 != null && uVar2 != uVar) {
            N(uVar2, false);
        }
        Window.Callback e02 = e0();
        if (e02 != null) {
            uVar.f29926i = e02.onCreatePanelView(uVar.f29918a);
        }
        int i10 = uVar.f29918a;
        boolean z10 = i10 == 0 || i10 == 108;
        if (z10 && (decorContentParent3 = this.H) != null) {
            decorContentParent3.setMenuPrepared();
        }
        if (uVar.f29926i == null && (!z10 || !(x0() instanceof e.k))) {
            androidx.appcompat.view.menu.e eVar = uVar.f29927j;
            if (eVar == null || uVar.f29935r) {
                if (eVar == null && (!i0(uVar) || uVar.f29927j == null)) {
                    return false;
                }
                if (z10 && this.H != null) {
                    if (this.I == null) {
                        this.I = new i();
                    }
                    this.H.setMenu(uVar.f29927j, this.I);
                }
                uVar.f29927j.d0();
                if (!e02.onCreatePanelMenu(uVar.f29918a, uVar.f29927j)) {
                    uVar.c(null);
                    if (z10 && (decorContentParent = this.H) != null) {
                        decorContentParent.setMenu(null, this.I);
                    }
                    return false;
                }
                uVar.f29935r = false;
            }
            uVar.f29927j.d0();
            Bundle bundle = uVar.f29936s;
            if (bundle != null) {
                uVar.f29927j.P(bundle);
                uVar.f29936s = null;
            }
            if (!e02.onPreparePanel(0, uVar.f29926i, uVar.f29927j)) {
                if (z10 && (decorContentParent2 = this.H) != null) {
                    decorContentParent2.setMenu(null, this.I);
                }
                uVar.f29927j.c0();
                return false;
            }
            boolean z11 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            uVar.f29933p = z11;
            uVar.f29927j.setQwertyMode(z11);
            uVar.f29927j.c0();
        }
        uVar.f29930m = true;
        uVar.f29931n = false;
        this.f29875d0 = uVar;
        return true;
    }

    public e(Dialog dialog, e.c cVar) {
        this(dialog.getContext(), dialog.getWindow(), cVar, dialog);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    public e(Context context, Window window, e.c cVar, Object obj) {
        s.g<String, Integer> gVar;
        Integer num;
        e.b H0;
        this.O = null;
        this.P = true;
        this.f29881j0 = -100;
        this.f29889r0 = new b();
        this.A = context;
        this.D = cVar;
        this.f29895z = obj;
        if (this.f29881j0 == -100 && (obj instanceof Dialog) && (H0 = H0()) != null) {
            this.f29881j0 = H0.l3().i();
        }
        if (this.f29881j0 == -100 && (num = (gVar = f29869x0).get(obj.getClass().getName())) != null) {
            this.f29881j0 = num.intValue();
            gVar.remove(obj.getClass().getName());
        }
        if (window != null) {
            H(window);
        }
        AppCompatDrawableManager.preload();
    }

    /* loaded from: classes.dex */
    public class o extends j.i {

        /* renamed from: x  reason: collision with root package name */
        public h f29908x;

        public o(Window.Callback callback) {
            super(callback);
        }

        public void b(h hVar) {
            this.f29908x = hVar;
        }

        public final ActionMode c(ActionMode.Callback callback) {
            f.a aVar = new f.a(e.this.A, callback);
            j.b E0 = e.this.E0(aVar);
            if (E0 != null) {
                return aVar.e(E0);
            }
            return null;
        }

        @Override // j.i, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return e.this.S(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // j.i, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || e.this.q0(keyEvent.getKeyCode(), keyEvent);
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
        }

        @Override // j.i, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i10, Menu menu) {
            if (i10 != 0 || (menu instanceof androidx.appcompat.view.menu.e)) {
                return super.onCreatePanelMenu(i10, menu);
            }
            return false;
        }

        @Override // j.i, android.view.Window.Callback
        public View onCreatePanelView(int i10) {
            View onCreatePanelView;
            h hVar = this.f29908x;
            return (hVar == null || (onCreatePanelView = hVar.onCreatePanelView(i10)) == null) ? super.onCreatePanelView(i10) : onCreatePanelView;
        }

        @Override // j.i, android.view.Window.Callback
        public boolean onMenuOpened(int i10, Menu menu) {
            super.onMenuOpened(i10, menu);
            e.this.t0(i10);
            return true;
        }

        @Override // j.i, android.view.Window.Callback
        public void onPanelClosed(int i10, Menu menu) {
            super.onPanelClosed(i10, menu);
            e.this.u0(i10);
        }

        @Override // j.i, android.view.Window.Callback
        public boolean onPreparePanel(int i10, View view, Menu menu) {
            androidx.appcompat.view.menu.e eVar = menu instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) menu : null;
            if (i10 == 0 && eVar == null) {
                return false;
            }
            boolean z10 = true;
            if (eVar != null) {
                eVar.a0(true);
            }
            h hVar = this.f29908x;
            if (hVar == null || !hVar.a(i10)) {
                z10 = false;
            }
            if (!z10) {
                z10 = super.onPreparePanel(i10, view, menu);
            }
            if (eVar != null) {
                eVar.a0(false);
            }
            return z10;
        }

        @Override // j.i, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i10) {
            androidx.appcompat.view.menu.e eVar;
            u c02 = e.this.c0(0, true);
            if (c02 != null && (eVar = c02.f29927j) != null) {
                super.onProvideKeyboardShortcuts(list, eVar, i10);
            } else {
                super.onProvideKeyboardShortcuts(list, menu, i10);
            }
        }

        @Override // j.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            if (e.this.l0()) {
                return c(callback);
            }
            return super.onWindowStartingActionMode(callback);
        }

        @Override // j.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
            if (e.this.l0() && i10 == 0) {
                return c(callback);
            }
            return super.onWindowStartingActionMode(callback, i10);
        }
    }
}
