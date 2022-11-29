package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.result.ActivityResultRegistry;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.m0;
import androidx.lifecycle.o;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import androidx.lifecycle.v0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.u, v0, y4.e {

    /* renamed from: w0  reason: collision with root package name */
    public static final Object f15125w0 = new Object();
    public Boolean A;
    public String B;
    public Bundle C;
    public Fragment D;
    public String E;
    public int F;
    public Boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public int O;
    public FragmentManager P;
    public m<?> Q;
    public FragmentManager R;
    public Fragment S;
    public int T;
    public int U;
    public String V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f15126a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f15127b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f15128c0;

    /* renamed from: d0  reason: collision with root package name */
    public ViewGroup f15129d0;

    /* renamed from: e0  reason: collision with root package name */
    public View f15130e0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f15131f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f15132g0;

    /* renamed from: h0  reason: collision with root package name */
    public h f15133h0;

    /* renamed from: i0  reason: collision with root package name */
    public Runnable f15134i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f15135j0;

    /* renamed from: k0  reason: collision with root package name */
    public LayoutInflater f15136k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f15137l0;

    /* renamed from: m0  reason: collision with root package name */
    public String f15138m0;

    /* renamed from: n0  reason: collision with root package name */
    public o.c f15139n0;

    /* renamed from: o0  reason: collision with root package name */
    public androidx.lifecycle.w f15140o0;

    /* renamed from: p0  reason: collision with root package name */
    public d0 f15141p0;

    /* renamed from: q0  reason: collision with root package name */
    public androidx.lifecycle.e0<androidx.lifecycle.u> f15142q0;

    /* renamed from: r0  reason: collision with root package name */
    public t0.b f15143r0;

    /* renamed from: s0  reason: collision with root package name */
    public y4.d f15144s0;

    /* renamed from: t0  reason: collision with root package name */
    public int f15145t0;

    /* renamed from: u0  reason: collision with root package name */
    public final AtomicInteger f15146u0;

    /* renamed from: v0  reason: collision with root package name */
    public final ArrayList<j> f15147v0;

    /* renamed from: w  reason: collision with root package name */
    public int f15148w;

    /* renamed from: x  reason: collision with root package name */
    public Bundle f15149x;

    /* renamed from: y  reason: collision with root package name */
    public SparseArray<Parcelable> f15150y;

    /* renamed from: z  reason: collision with root package name */
    public Bundle f15151z;

    /* loaded from: classes.dex */
    public static class InstantiationException extends RuntimeException {
        public InstantiationException(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.i3();
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.d0(false);
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ g0 f15155w;

        public c(g0 g0Var) {
            this.f15155w = g0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f15155w.g();
        }
    }

    /* loaded from: classes.dex */
    public class d extends androidx.fragment.app.j {
        public d() {
        }

        @Override // androidx.fragment.app.j
        public View c(int i10) {
            View view = Fragment.this.f15130e0;
            if (view != null) {
                return view.findViewById(i10);
            }
            throw new IllegalStateException("Fragment " + Fragment.this + " does not have a view");
        }

        @Override // androidx.fragment.app.j
        public boolean d() {
            return Fragment.this.f15130e0 != null;
        }
    }

    /* loaded from: classes.dex */
    public class e implements n.a<Void, ActivityResultRegistry> {
        public e() {
        }

        @Override // n.a
        /* renamed from: a */
        public ActivityResultRegistry apply(Void r32) {
            Fragment fragment = Fragment.this;
            m<?> mVar = fragment.Q;
            if (mVar instanceof androidx.activity.result.d) {
                return ((androidx.activity.result.d) mVar).O();
            }
            return fragment.L2().O();
        }
    }

    /* loaded from: classes.dex */
    public class f extends j {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ n.a f15159a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ AtomicReference f15160b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ c.a f15161c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ androidx.activity.result.b f15162d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(n.a aVar, AtomicReference atomicReference, c.a aVar2, androidx.activity.result.b bVar) {
            super(null);
            this.f15159a = aVar;
            this.f15160b = atomicReference;
            this.f15161c = aVar2;
            this.f15162d = bVar;
        }

        @Override // androidx.fragment.app.Fragment.j
        public void a() {
            this.f15160b.set(((ActivityResultRegistry) this.f15159a.apply(null)).i(Fragment.this.i0(), Fragment.this, this.f15161c, this.f15162d));
        }
    }

    /* loaded from: classes.dex */
    public class g extends androidx.activity.result.c<I> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AtomicReference f15164a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ c.a f15165b;

        public g(AtomicReference atomicReference, c.a aVar) {
            this.f15164a = atomicReference;
            this.f15165b = aVar;
        }

        @Override // androidx.activity.result.c
        public void b(I i10, b3.b bVar) {
            androidx.activity.result.c cVar = (androidx.activity.result.c) this.f15164a.get();
            if (cVar != null) {
                cVar.b(i10, bVar);
                return;
            }
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }

        @Override // androidx.activity.result.c
        public void c() {
            androidx.activity.result.c cVar = (androidx.activity.result.c) this.f15164a.getAndSet(null);
            if (cVar != null) {
                cVar.c();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class h {

        /* renamed from: a  reason: collision with root package name */
        public View f15167a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f15168b;

        /* renamed from: c  reason: collision with root package name */
        public int f15169c;

        /* renamed from: d  reason: collision with root package name */
        public int f15170d;

        /* renamed from: e  reason: collision with root package name */
        public int f15171e;

        /* renamed from: f  reason: collision with root package name */
        public int f15172f;

        /* renamed from: g  reason: collision with root package name */
        public int f15173g;

        /* renamed from: h  reason: collision with root package name */
        public ArrayList<String> f15174h;

        /* renamed from: i  reason: collision with root package name */
        public ArrayList<String> f15175i;

        /* renamed from: j  reason: collision with root package name */
        public Object f15176j = null;

        /* renamed from: k  reason: collision with root package name */
        public Object f15177k;

        /* renamed from: l  reason: collision with root package name */
        public Object f15178l;

        /* renamed from: m  reason: collision with root package name */
        public Object f15179m;

        /* renamed from: n  reason: collision with root package name */
        public Object f15180n;

        /* renamed from: o  reason: collision with root package name */
        public Object f15181o;

        /* renamed from: p  reason: collision with root package name */
        public Boolean f15182p;

        /* renamed from: q  reason: collision with root package name */
        public Boolean f15183q;

        /* renamed from: r  reason: collision with root package name */
        public b3.p f15184r;

        /* renamed from: s  reason: collision with root package name */
        public b3.p f15185s;

        /* renamed from: t  reason: collision with root package name */
        public float f15186t;

        /* renamed from: u  reason: collision with root package name */
        public View f15187u;

        /* renamed from: v  reason: collision with root package name */
        public boolean f15188v;

        public h() {
            Object obj = Fragment.f15125w0;
            this.f15177k = obj;
            this.f15178l = null;
            this.f15179m = obj;
            this.f15180n = null;
            this.f15181o = obj;
            this.f15186t = 1.0f;
            this.f15187u = null;
        }
    }

    /* loaded from: classes.dex */
    public static class i {
        public static void a(View view) {
            view.cancelPendingInputEvents();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class j {
        public j() {
        }

        public abstract void a();

        public /* synthetic */ j(a aVar) {
            this();
        }
    }

    public Fragment() {
        this.f15148w = -1;
        this.B = UUID.randomUUID().toString();
        this.E = null;
        this.G = null;
        this.R = new q();
        this.f15127b0 = true;
        this.f15132g0 = true;
        this.f15134i0 = new a();
        this.f15139n0 = o.c.RESUMED;
        this.f15142q0 = new androidx.lifecycle.e0<>();
        this.f15146u0 = new AtomicInteger();
        this.f15147v0 = new ArrayList<>();
        d1();
    }

    @Deprecated
    public static Fragment f1(Context context, String str, Bundle bundle) {
        try {
            Fragment newInstance = l.d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(newInstance.getClass().getClassLoader());
                newInstance.V2(bundle);
            }
            return newInstance;
        } catch (IllegalAccessException e10) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e10);
        } catch (java.lang.InstantiationException e11) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e11);
        } catch (NoSuchMethodException e12) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e12);
        } catch (InvocationTargetException e13) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e13);
        }
    }

    @Deprecated
    public final FragmentManager A0() {
        return this.P;
    }

    public void A1(Bundle bundle) {
        this.f15128c0 = true;
        R2(bundle);
        if (this.R.I0(1)) {
            return;
        }
        this.R.y();
    }

    public final Object B0() {
        m<?> mVar = this.Q;
        if (mVar == null) {
            return null;
        }
        return mVar.i();
    }

    public Animation B1(int i10, boolean z10, int i11) {
        return null;
    }

    public void B2() {
        this.R.O0();
        this.R.X(true);
        this.f15148w = 7;
        this.f15128c0 = false;
        Z1();
        if (this.f15128c0) {
            androidx.lifecycle.w wVar = this.f15140o0;
            o.b bVar = o.b.ON_RESUME;
            wVar.h(bVar);
            if (this.f15130e0 != null) {
                this.f15141p0.a(bVar);
            }
            this.R.N();
            return;
        }
        throw new i0("Fragment " + this + " did not call through to super.onResume()");
    }

    public final int C0() {
        return this.T;
    }

    public Animator C1(int i10, boolean z10, int i11) {
        return null;
    }

    public void C2(Bundle bundle) {
        b2(bundle);
        this.f15144s0.e(bundle);
        Parcelable d12 = this.R.d1();
        if (d12 != null) {
            bundle.putParcelable("android:support:fragments", d12);
        }
    }

    public final LayoutInflater D0() {
        LayoutInflater layoutInflater = this.f15136k0;
        return layoutInflater == null ? r2(null) : layoutInflater;
    }

    public void D1(Menu menu, MenuInflater menuInflater) {
    }

    @Deprecated
    public LayoutInflater E0(Bundle bundle) {
        m<?> mVar = this.Q;
        if (mVar != null) {
            LayoutInflater j10 = mVar.j();
            o3.h.b(j10, this.R.r0());
            return j10;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public View E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10 = this.f15145t0;
        if (i10 != 0) {
            return layoutInflater.inflate(i10, viewGroup, false);
        }
        return null;
    }

    public void E2() {
        this.R.O0();
        this.R.X(true);
        this.f15148w = 5;
        this.f15128c0 = false;
        c2();
        if (this.f15128c0) {
            androidx.lifecycle.w wVar = this.f15140o0;
            o.b bVar = o.b.ON_START;
            wVar.h(bVar);
            if (this.f15130e0 != null) {
                this.f15141p0.a(bVar);
            }
            this.R.O();
            return;
        }
        throw new i0("Fragment " + this + " did not call through to super.onStart()");
    }

    public final int F0() {
        o.c cVar = this.f15139n0;
        if (cVar != o.c.INITIALIZED && this.S != null) {
            return Math.min(cVar.ordinal(), this.S.F0());
        }
        return cVar.ordinal();
    }

    public void F1() {
        this.f15128c0 = true;
    }

    public void F2() {
        this.R.Q();
        if (this.f15130e0 != null) {
            this.f15141p0.a(o.b.ON_STOP);
        }
        this.f15140o0.h(o.b.ON_STOP);
        this.f15148w = 4;
        this.f15128c0 = false;
        d2();
        if (this.f15128c0) {
            return;
        }
        throw new i0("Fragment " + this + " did not call through to super.onStop()");
    }

    public int G0() {
        h hVar = this.f15133h0;
        if (hVar == null) {
            return 0;
        }
        return hVar.f15173g;
    }

    public void G1() {
    }

    public void G2() {
        e2(this.f15130e0, this.f15149x);
        this.R.R();
    }

    public final Fragment H0() {
        return this.S;
    }

    public void H1() {
        this.f15128c0 = true;
    }

    public final <I, O> androidx.activity.result.c<I> H2(c.a<I, O> aVar, n.a<Void, ActivityResultRegistry> aVar2, androidx.activity.result.b<O> bVar) {
        if (this.f15148w <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            J2(new f(aVar2, atomicReference, aVar, bVar));
            return new g(atomicReference, aVar);
        }
        throw new IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
    }

    public final FragmentManager I0() {
        FragmentManager fragmentManager = this.P;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public void I1() {
        this.f15128c0 = true;
    }

    public final <I, O> androidx.activity.result.c<I> I2(c.a<I, O> aVar, androidx.activity.result.b<O> bVar) {
        return H2(aVar, new e(), bVar);
    }

    public boolean J0() {
        h hVar = this.f15133h0;
        if (hVar == null) {
            return false;
        }
        return hVar.f15168b;
    }

    public final void J2(j jVar) {
        if (this.f15148w >= 0) {
            jVar.a();
        } else {
            this.f15147v0.add(jVar);
        }
    }

    public int K0() {
        h hVar = this.f15133h0;
        if (hVar == null) {
            return 0;
        }
        return hVar.f15171e;
    }

    public LayoutInflater K1(Bundle bundle) {
        return E0(bundle);
    }

    @Deprecated
    public final void K2(String[] strArr, int i10) {
        if (this.Q != null) {
            I0().L0(this, strArr, i10);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public int L0() {
        h hVar = this.f15133h0;
        if (hVar == null) {
            return 0;
        }
        return hVar.f15172f;
    }

    public void L1(boolean z10) {
    }

    public final androidx.fragment.app.h L2() {
        androidx.fragment.app.h j02 = j0();
        if (j02 != null) {
            return j02;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public float M0() {
        h hVar = this.f15133h0;
        if (hVar == null) {
            return 1.0f;
        }
        return hVar.f15186t;
    }

    @Deprecated
    public void M1(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.f15128c0 = true;
    }

    public final Bundle M2() {
        Bundle n02 = n0();
        if (n02 != null) {
            return n02;
        }
        throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
    }

    public Object N0() {
        h hVar = this.f15133h0;
        if (hVar == null) {
            return null;
        }
        Object obj = hVar.f15179m;
        return obj == f15125w0 ? x0() : obj;
    }

    public void N1(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.f15128c0 = true;
        m<?> mVar = this.Q;
        Activity e10 = mVar == null ? null : mVar.e();
        if (e10 != null) {
            this.f15128c0 = false;
            M1(e10, attributeSet, bundle);
        }
    }

    public final Context N2() {
        Context q02 = q0();
        if (q02 != null) {
            return q02;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final Resources O0() {
        return N2().getResources();
    }

    public void O1(boolean z10) {
    }

    @Deprecated
    public final FragmentManager O2() {
        return I0();
    }

    public Object P0() {
        h hVar = this.f15133h0;
        if (hVar == null) {
            return null;
        }
        Object obj = hVar.f15177k;
        return obj == f15125w0 ? u0() : obj;
    }

    public boolean P1(MenuItem menuItem) {
        return false;
    }

    public final Fragment P2() {
        Fragment H0 = H0();
        if (H0 == null) {
            if (q0() == null) {
                throw new IllegalStateException("Fragment " + this + " is not attached to any Fragment or host");
            }
            throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + q0());
        }
        return H0;
    }

    public Object Q0() {
        h hVar = this.f15133h0;
        if (hVar == null) {
            return null;
        }
        return hVar.f15180n;
    }

    public void Q1(Menu menu) {
    }

    public final View Q2() {
        View Z0 = Z0();
        if (Z0 != null) {
            return Z0;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public Object R0() {
        h hVar = this.f15133h0;
        if (hVar == null) {
            return null;
        }
        Object obj = hVar.f15181o;
        return obj == f15125w0 ? Q0() : obj;
    }

    public void R2(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.R.b1(parcelable);
        this.R.y();
    }

    public ArrayList<String> S0() {
        ArrayList<String> arrayList;
        h hVar = this.f15133h0;
        return (hVar == null || (arrayList = hVar.f15174h) == null) ? new ArrayList<>() : arrayList;
    }

    public void S1() {
        this.f15128c0 = true;
    }

    public final void S2() {
        if (FragmentManager.D0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.f15130e0 != null) {
            T2(this.f15149x);
        }
        this.f15149x = null;
    }

    public ArrayList<String> T0() {
        ArrayList<String> arrayList;
        h hVar = this.f15133h0;
        return (hVar == null || (arrayList = hVar.f15175i) == null) ? new ArrayList<>() : arrayList;
    }

    public final void T2(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f15150y;
        if (sparseArray != null) {
            this.f15130e0.restoreHierarchyState(sparseArray);
            this.f15150y = null;
        }
        if (this.f15130e0 != null) {
            this.f15141p0.d(this.f15151z);
            this.f15151z = null;
        }
        this.f15128c0 = false;
        g2(bundle);
        if (this.f15128c0) {
            if (this.f15130e0 != null) {
                this.f15141p0.a(o.b.ON_CREATE);
                return;
            }
            return;
        }
        throw new i0("Fragment " + this + " did not call through to super.onViewStateRestored()");
    }

    @Override // androidx.lifecycle.v0
    public u0 U() {
        if (this.P != null) {
            if (F0() != o.c.INITIALIZED.ordinal()) {
                return this.P.y0(this);
            }
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public final String U0(int i10) {
        return O0().getString(i10);
    }

    public void U2(int i10, int i11, int i12, int i13) {
        if (this.f15133h0 == null && i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return;
        }
        g0().f15169c = i10;
        g0().f15170d = i11;
        g0().f15171e = i12;
        g0().f15172f = i13;
    }

    public final String V0(int i10, Object... objArr) {
        return O0().getString(i10, objArr);
    }

    public void V1(boolean z10) {
    }

    public void V2(Bundle bundle) {
        if (this.P != null && q1()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.C = bundle;
    }

    public final String W0() {
        return this.V;
    }

    public void W1(Menu menu) {
    }

    public void W2(View view) {
        g0().f15187u = view;
    }

    public final Fragment X0(boolean z10) {
        String str;
        if (z10) {
            h4.c.j(this);
        }
        Fragment fragment = this.D;
        if (fragment != null) {
            return fragment;
        }
        FragmentManager fragmentManager = this.P;
        if (fragmentManager == null || (str = this.E) == null) {
            return null;
        }
        return fragmentManager.b0(str);
    }

    public void X1(boolean z10) {
    }

    public void X2(boolean z10) {
        if (this.f15126a0 != z10) {
            this.f15126a0 = z10;
            if (!g1() || i1()) {
                return;
            }
            this.Q.n();
        }
    }

    public final CharSequence Y0(int i10) {
        return O0().getText(i10);
    }

    @Deprecated
    public void Y1(int i10, String[] strArr, int[] iArr) {
    }

    public void Y2(boolean z10) {
        if (this.f15127b0 != z10) {
            this.f15127b0 = z10;
            if (this.f15126a0 && g1() && !i1()) {
                this.Q.n();
            }
        }
    }

    public View Z0() {
        return this.f15130e0;
    }

    public void Z1() {
        this.f15128c0 = true;
    }

    public void Z2(int i10) {
        if (this.f15133h0 == null && i10 == 0) {
            return;
        }
        g0();
        this.f15133h0.f15173g = i10;
    }

    @Override // y4.e
    public final y4.c a0() {
        return this.f15144s0.b();
    }

    public androidx.lifecycle.u a1() {
        d0 d0Var = this.f15141p0;
        if (d0Var != null) {
            return d0Var;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public void a3(boolean z10) {
        if (this.f15133h0 == null) {
            return;
        }
        g0().f15168b = z10;
    }

    public LiveData<androidx.lifecycle.u> b1() {
        return this.f15142q0;
    }

    public void b2(Bundle bundle) {
    }

    public void b3(float f10) {
        g0().f15186t = f10;
    }

    public void c2() {
        this.f15128c0 = true;
    }

    public void c3(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        g0();
        h hVar = this.f15133h0;
        hVar.f15174h = arrayList;
        hVar.f15175i = arrayList2;
    }

    public void d0(boolean z10) {
        ViewGroup viewGroup;
        FragmentManager fragmentManager;
        h hVar = this.f15133h0;
        if (hVar != null) {
            hVar.f15188v = false;
        }
        if (this.f15130e0 == null || (viewGroup = this.f15129d0) == null || (fragmentManager = this.P) == null) {
            return;
        }
        g0 n10 = g0.n(viewGroup, fragmentManager);
        n10.p();
        if (z10) {
            this.Q.h().post(new c(n10));
        } else {
            n10.g();
        }
    }

    public final void d1() {
        this.f15140o0 = new androidx.lifecycle.w(this);
        this.f15144s0 = y4.d.a(this);
        this.f15143r0 = null;
    }

    public void d2() {
        this.f15128c0 = true;
    }

    @Deprecated
    public void d3(boolean z10) {
        h4.c.k(this, z10);
        if (!this.f15132g0 && z10 && this.f15148w < 5 && this.P != null && g1() && this.f15137l0) {
            FragmentManager fragmentManager = this.P;
            fragmentManager.Q0(fragmentManager.s(this));
        }
        this.f15132g0 = z10;
        this.f15131f0 = this.f15148w < 5 && !z10;
        if (this.f15149x != null) {
            this.A = Boolean.valueOf(z10);
        }
    }

    public androidx.fragment.app.j e0() {
        return new d();
    }

    public void e1() {
        d1();
        this.f15138m0 = this.B;
        this.B = UUID.randomUUID().toString();
        this.H = false;
        this.I = false;
        this.K = false;
        this.L = false;
        this.M = false;
        this.O = 0;
        this.P = null;
        this.R = new q();
        this.Q = null;
        this.T = 0;
        this.U = 0;
        this.V = null;
        this.W = false;
        this.X = false;
    }

    public void e2(View view, Bundle bundle) {
    }

    public boolean e3(String str) {
        m<?> mVar = this.Q;
        if (mVar != null) {
            return mVar.l(str);
        }
        return false;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public void f0(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.T));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.U));
        printWriter.print(" mTag=");
        printWriter.println(this.V);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f15148w);
        printWriter.print(" mWho=");
        printWriter.print(this.B);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.O);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.H);
        printWriter.print(" mRemoving=");
        printWriter.print(this.I);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.K);
        printWriter.print(" mInLayout=");
        printWriter.println(this.L);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.W);
        printWriter.print(" mDetached=");
        printWriter.print(this.X);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f15127b0);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.f15126a0);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.Y);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f15132g0);
        if (this.P != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.P);
        }
        if (this.Q != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.Q);
        }
        if (this.S != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.S);
        }
        if (this.C != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.C);
        }
        if (this.f15149x != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f15149x);
        }
        if (this.f15150y != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f15150y);
        }
        if (this.f15151z != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f15151z);
        }
        Fragment X0 = X0(false);
        if (X0 != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(X0);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.F);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(J0());
        if (s0() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(s0());
        }
        if (w0() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(w0());
        }
        if (K0() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(K0());
        }
        if (L0() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(L0());
        }
        if (this.f15129d0 != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f15129d0);
        }
        if (this.f15130e0 != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f15130e0);
        }
        if (m0() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(m0());
        }
        if (q0() != null) {
            n4.a.c(this).b(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.R + ":");
        FragmentManager fragmentManager = this.R;
        fragmentManager.T(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public void f3(@SuppressLint({"UnknownNullness"}) Intent intent) {
        g3(intent, null);
    }

    @Override // androidx.lifecycle.u
    public androidx.lifecycle.o g() {
        return this.f15140o0;
    }

    public final h g0() {
        if (this.f15133h0 == null) {
            this.f15133h0 = new h();
        }
        return this.f15133h0;
    }

    public final boolean g1() {
        return this.Q != null && this.H;
    }

    public void g2(Bundle bundle) {
        this.f15128c0 = true;
    }

    public void g3(@SuppressLint({"UnknownNullness"}) Intent intent, Bundle bundle) {
        m<?> mVar = this.Q;
        if (mVar != null) {
            mVar.m(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public Fragment h0(String str) {
        return str.equals(this.B) ? this : this.R.f0(str);
    }

    public final boolean h1() {
        return this.X;
    }

    public void h2(Bundle bundle) {
        this.R.O0();
        this.f15148w = 3;
        this.f15128c0 = false;
        t1(bundle);
        if (this.f15128c0) {
            S2();
            this.R.u();
            return;
        }
        throw new i0("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    @Deprecated
    public void h3(@SuppressLint({"UnknownNullness"}) Intent intent, int i10, Bundle bundle) {
        if (this.Q != null) {
            I0().M0(this, intent, i10, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public String i0() {
        return "fragment_" + this.B + "_rq#" + this.f15146u0.getAndIncrement();
    }

    public final boolean i1() {
        FragmentManager fragmentManager;
        return this.W || ((fragmentManager = this.P) != null && fragmentManager.F0(this.S));
    }

    public void i2() {
        Iterator<j> it = this.f15147v0.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.f15147v0.clear();
        this.R.i(this.Q, e0(), this);
        this.f15148w = 0;
        this.f15128c0 = false;
        x1(this.Q.f());
        if (this.f15128c0) {
            this.P.E(this);
            this.R.v();
            return;
        }
        throw new i0("Fragment " + this + " did not call through to super.onAttach()");
    }

    public void i3() {
        if (this.f15133h0 == null || !g0().f15188v) {
            return;
        }
        if (this.Q == null) {
            g0().f15188v = false;
        } else if (Looper.myLooper() != this.Q.h().getLooper()) {
            this.Q.h().postAtFrontOfQueue(new b());
        } else {
            d0(true);
        }
    }

    public final androidx.fragment.app.h j0() {
        m<?> mVar = this.Q;
        if (mVar == null) {
            return null;
        }
        return (androidx.fragment.app.h) mVar.e();
    }

    public final boolean j1() {
        return this.O > 0;
    }

    public void j2(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.R.w(configuration);
    }

    public boolean k0() {
        Boolean bool;
        h hVar = this.f15133h0;
        if (hVar == null || (bool = hVar.f15183q) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public final boolean k1() {
        FragmentManager fragmentManager;
        return this.f15127b0 && ((fragmentManager = this.P) == null || fragmentManager.G0(this.S));
    }

    public boolean k2(MenuItem menuItem) {
        if (this.W) {
            return false;
        }
        if (z1(menuItem)) {
            return true;
        }
        return this.R.x(menuItem);
    }

    public boolean l0() {
        Boolean bool;
        h hVar = this.f15133h0;
        if (hVar == null || (bool = hVar.f15182p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean l1() {
        h hVar = this.f15133h0;
        if (hVar == null) {
            return false;
        }
        return hVar.f15188v;
    }

    public void l2(Bundle bundle) {
        this.R.O0();
        this.f15148w = 1;
        this.f15128c0 = false;
        if (Build.VERSION.SDK_INT >= 19) {
            this.f15140o0.a(new androidx.lifecycle.r() { // from class: androidx.fragment.app.Fragment.5
                @Override // androidx.lifecycle.r
                public void i(androidx.lifecycle.u uVar, o.b bVar) {
                    View view;
                    if (bVar != o.b.ON_STOP || (view = Fragment.this.f15130e0) == null) {
                        return;
                    }
                    i.a(view);
                }
            });
        }
        this.f15144s0.d(bundle);
        A1(bundle);
        this.f15137l0 = true;
        if (this.f15128c0) {
            this.f15140o0.h(o.b.ON_CREATE);
            return;
        }
        throw new i0("Fragment " + this + " did not call through to super.onCreate()");
    }

    public View m0() {
        h hVar = this.f15133h0;
        if (hVar == null) {
            return null;
        }
        return hVar.f15167a;
    }

    public final boolean m1() {
        return this.I;
    }

    public boolean m2(Menu menu, MenuInflater menuInflater) {
        boolean z10 = false;
        if (this.W) {
            return false;
        }
        if (this.f15126a0 && this.f15127b0) {
            z10 = true;
            D1(menu, menuInflater);
        }
        return z10 | this.R.z(menu, menuInflater);
    }

    public final Bundle n0() {
        return this.C;
    }

    public void n2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.R.O0();
        this.N = true;
        this.f15141p0 = new d0(this, U());
        View E1 = E1(layoutInflater, viewGroup, bundle);
        this.f15130e0 = E1;
        if (E1 != null) {
            this.f15141p0.b();
            w0.b(this.f15130e0, this.f15141p0);
            x0.b(this.f15130e0, this.f15141p0);
            y4.f.b(this.f15130e0, this.f15141p0);
            this.f15142q0.p(this.f15141p0);
        } else if (!this.f15141p0.c()) {
            this.f15141p0 = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    public final boolean o1() {
        return this.f15148w >= 7;
    }

    public void o2() {
        this.R.A();
        this.f15140o0.h(o.b.ON_DESTROY);
        this.f15148w = 0;
        this.f15128c0 = false;
        this.f15137l0 = false;
        F1();
        if (this.f15128c0) {
            return;
        }
        throw new i0("Fragment " + this + " did not call through to super.onDestroy()");
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.f15128c0 = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        L2().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.f15128c0 = true;
    }

    public final FragmentManager p0() {
        if (this.Q != null) {
            return this.R;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public void p2() {
        this.R.B();
        if (this.f15130e0 != null && this.f15141p0.g().b().a(o.c.CREATED)) {
            this.f15141p0.a(o.b.ON_DESTROY);
        }
        this.f15148w = 1;
        this.f15128c0 = false;
        H1();
        if (this.f15128c0) {
            n4.a.c(this).e();
            this.N = false;
            return;
        }
        throw new i0("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    public Context q0() {
        m<?> mVar = this.Q;
        if (mVar == null) {
            return null;
        }
        return mVar.f();
    }

    public final boolean q1() {
        FragmentManager fragmentManager = this.P;
        if (fragmentManager == null) {
            return false;
        }
        return fragmentManager.J0();
    }

    public void q2() {
        this.f15148w = -1;
        this.f15128c0 = false;
        I1();
        this.f15136k0 = null;
        if (this.f15128c0) {
            if (this.R.C0()) {
                return;
            }
            this.R.A();
            this.R = new q();
            return;
        }
        throw new i0("Fragment " + this + " did not call through to super.onDetach()");
    }

    public t0.b r0() {
        if (this.P != null) {
            if (this.f15143r0 == null) {
                Application application = null;
                Context applicationContext = N2().getApplicationContext();
                while (true) {
                    if (!(applicationContext instanceof ContextWrapper)) {
                        break;
                    } else if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                        break;
                    } else {
                        applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                    }
                }
                if (application == null && FragmentManager.D0(3)) {
                    Log.d("FragmentManager", "Could not find Application instance from Context " + N2().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
                }
                this.f15143r0 = new m0(application, this, n0());
            }
            return this.f15143r0;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public final boolean r1() {
        View view;
        return (!g1() || i1() || (view = this.f15130e0) == null || view.getWindowToken() == null || this.f15130e0.getVisibility() != 0) ? false : true;
    }

    public LayoutInflater r2(Bundle bundle) {
        LayoutInflater K1 = K1(bundle);
        this.f15136k0 = K1;
        return K1;
    }

    public int s0() {
        h hVar = this.f15133h0;
        if (hVar == null) {
            return 0;
        }
        return hVar.f15169c;
    }

    public void s1() {
        this.R.O0();
    }

    public void s2() {
        onLowMemory();
        this.R.C();
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i10) {
        h3(intent, i10, null);
    }

    @Deprecated
    public void t1(Bundle bundle) {
        this.f15128c0 = true;
    }

    public void t2(boolean z10) {
        O1(z10);
        this.R.D(z10);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("}");
        sb2.append(" (");
        sb2.append(this.B);
        if (this.T != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.T));
        }
        if (this.V != null) {
            sb2.append(" tag=");
            sb2.append(this.V);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public Object u0() {
        h hVar = this.f15133h0;
        if (hVar == null) {
            return null;
        }
        return hVar.f15176j;
    }

    @Deprecated
    public void u1(int i10, int i11, Intent intent) {
        if (FragmentManager.D0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i10 + " resultCode: " + i11 + " data: " + intent);
        }
    }

    public boolean u2(MenuItem menuItem) {
        if (this.W) {
            return false;
        }
        if (this.f15126a0 && this.f15127b0 && P1(menuItem)) {
            return true;
        }
        return this.R.G(menuItem);
    }

    public b3.p v0() {
        h hVar = this.f15133h0;
        if (hVar == null) {
            return null;
        }
        return hVar.f15184r;
    }

    @Deprecated
    public void v1(Activity activity) {
        this.f15128c0 = true;
    }

    public void v2(Menu menu) {
        if (this.W) {
            return;
        }
        if (this.f15126a0 && this.f15127b0) {
            Q1(menu);
        }
        this.R.H(menu);
    }

    public int w0() {
        h hVar = this.f15133h0;
        if (hVar == null) {
            return 0;
        }
        return hVar.f15170d;
    }

    public void w2() {
        this.R.J();
        if (this.f15130e0 != null) {
            this.f15141p0.a(o.b.ON_PAUSE);
        }
        this.f15140o0.h(o.b.ON_PAUSE);
        this.f15148w = 6;
        this.f15128c0 = false;
        S1();
        if (this.f15128c0) {
            return;
        }
        throw new i0("Fragment " + this + " did not call through to super.onPause()");
    }

    public Object x0() {
        h hVar = this.f15133h0;
        if (hVar == null) {
            return null;
        }
        return hVar.f15178l;
    }

    public void x1(Context context) {
        this.f15128c0 = true;
        m<?> mVar = this.Q;
        Activity e10 = mVar == null ? null : mVar.e();
        if (e10 != null) {
            this.f15128c0 = false;
            v1(e10);
        }
    }

    public void x2(boolean z10) {
        V1(z10);
        this.R.K(z10);
    }

    public b3.p y0() {
        h hVar = this.f15133h0;
        if (hVar == null) {
            return null;
        }
        return hVar.f15185s;
    }

    @Deprecated
    public void y1(Fragment fragment) {
    }

    public boolean y2(Menu menu) {
        boolean z10 = false;
        if (this.W) {
            return false;
        }
        if (this.f15126a0 && this.f15127b0) {
            z10 = true;
            W1(menu);
        }
        return z10 | this.R.L(menu);
    }

    public View z0() {
        h hVar = this.f15133h0;
        if (hVar == null) {
            return null;
        }
        return hVar.f15187u;
    }

    public boolean z1(MenuItem menuItem) {
        return false;
    }

    public void z2() {
        boolean H0 = this.P.H0(this);
        Boolean bool = this.G;
        if (bool == null || bool.booleanValue() != H0) {
            this.G = Boolean.valueOf(H0);
            X1(H0);
            this.R.M();
        }
    }

    public Fragment(int i10) {
        this();
        this.f15145t0 = i10;
    }
}
