package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.e;
import androidx.fragment.app.z;
import androidx.lifecycle.o;
import androidx.lifecycle.u0;
import androidx.lifecycle.v0;
import h4.c;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import y4.c;

/* loaded from: classes.dex */
public abstract class FragmentManager {
    public static boolean N = false;
    public androidx.activity.result.c<String[]> A;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public ArrayList<androidx.fragment.app.a> H;
    public ArrayList<Boolean> I;
    public ArrayList<Fragment> J;
    public s K;
    public c.C0433c L;

    /* renamed from: b  reason: collision with root package name */
    public boolean f15195b;

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<androidx.fragment.app.a> f15197d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<Fragment> f15198e;

    /* renamed from: g  reason: collision with root package name */
    public OnBackPressedDispatcher f15200g;

    /* renamed from: m  reason: collision with root package name */
    public ArrayList<m> f15206m;

    /* renamed from: q  reason: collision with root package name */
    public androidx.fragment.app.m<?> f15210q;

    /* renamed from: r  reason: collision with root package name */
    public androidx.fragment.app.j f15211r;

    /* renamed from: s  reason: collision with root package name */
    public Fragment f15212s;

    /* renamed from: t  reason: collision with root package name */
    public Fragment f15213t;

    /* renamed from: y  reason: collision with root package name */
    public androidx.activity.result.c<Intent> f15218y;

    /* renamed from: z  reason: collision with root package name */
    public androidx.activity.result.c<androidx.activity.result.e> f15219z;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<n> f15194a = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public final y f15196c = new y();

    /* renamed from: f  reason: collision with root package name */
    public final androidx.fragment.app.n f15199f = new androidx.fragment.app.n(this);

    /* renamed from: h  reason: collision with root package name */
    public final androidx.activity.e f15201h = new a(false);

    /* renamed from: i  reason: collision with root package name */
    public final AtomicInteger f15202i = new AtomicInteger();

    /* renamed from: j  reason: collision with root package name */
    public final Map<String, androidx.fragment.app.c> f15203j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k  reason: collision with root package name */
    public final Map<String, Bundle> f15204k = Collections.synchronizedMap(new HashMap());

    /* renamed from: l  reason: collision with root package name */
    public final Map<String, l> f15205l = Collections.synchronizedMap(new HashMap());

    /* renamed from: n  reason: collision with root package name */
    public final androidx.fragment.app.o f15207n = new androidx.fragment.app.o(this);

    /* renamed from: o  reason: collision with root package name */
    public final CopyOnWriteArrayList<t> f15208o = new CopyOnWriteArrayList<>();

    /* renamed from: p  reason: collision with root package name */
    public int f15209p = -1;

    /* renamed from: u  reason: collision with root package name */
    public androidx.fragment.app.l f15214u = null;

    /* renamed from: v  reason: collision with root package name */
    public androidx.fragment.app.l f15215v = new b();

    /* renamed from: w  reason: collision with root package name */
    public h0 f15216w = null;

    /* renamed from: x  reason: collision with root package name */
    public h0 f15217x = new c();
    public ArrayDeque<k> B = new ArrayDeque<>();
    public Runnable M = new d();

    /* loaded from: classes.dex */
    public class a extends androidx.activity.e {
        public a(boolean z10) {
            super(z10);
        }

        @Override // androidx.activity.e
        public void b() {
            FragmentManager.this.z0();
        }
    }

    /* loaded from: classes.dex */
    public class b extends androidx.fragment.app.l {
        public b() {
        }

        @Override // androidx.fragment.app.l
        public Fragment a(ClassLoader classLoader, String str) {
            return FragmentManager.this.q0().b(FragmentManager.this.q0().f(), str, null);
        }
    }

    /* loaded from: classes.dex */
    public class c implements h0 {
        public c() {
        }

        @Override // androidx.fragment.app.h0
        public g0 a(ViewGroup viewGroup) {
            return new androidx.fragment.app.d(viewGroup);
        }
    }

    /* loaded from: classes.dex */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentManager.this.X(true);
        }
    }

    /* loaded from: classes.dex */
    public class e implements t {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f15228w;

        public e(Fragment fragment) {
            this.f15228w = fragment;
        }

        @Override // androidx.fragment.app.t
        public void a(FragmentManager fragmentManager, Fragment fragment) {
            this.f15228w.y1(fragment);
        }
    }

    /* loaded from: classes.dex */
    public class f implements androidx.activity.result.b<androidx.activity.result.a> {
        public f() {
        }

        @Override // androidx.activity.result.b
        /* renamed from: b */
        public void a(androidx.activity.result.a aVar) {
            k pollFirst = FragmentManager.this.B.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = pollFirst.f15233w;
            int i10 = pollFirst.f15234x;
            Fragment i11 = FragmentManager.this.f15196c.i(str);
            if (i11 == null) {
                Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
                return;
            }
            i11.u1(i10, aVar.b(), aVar.a());
        }
    }

    /* loaded from: classes.dex */
    public class g implements androidx.activity.result.b<androidx.activity.result.a> {
        public g() {
        }

        @Override // androidx.activity.result.b
        /* renamed from: b */
        public void a(androidx.activity.result.a aVar) {
            k pollFirst = FragmentManager.this.B.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = pollFirst.f15233w;
            int i10 = pollFirst.f15234x;
            Fragment i11 = FragmentManager.this.f15196c.i(str);
            if (i11 == null) {
                Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                return;
            }
            i11.u1(i10, aVar.b(), aVar.a());
        }
    }

    /* loaded from: classes.dex */
    public class h implements androidx.activity.result.b<Map<String, Boolean>> {
        public h() {
        }

        @Override // androidx.activity.result.b
        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: b */
        public void a(Map<String, Boolean> map) {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                iArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue() ? 0 : -1;
            }
            k pollFirst = FragmentManager.this.B.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            String str = pollFirst.f15233w;
            int i11 = pollFirst.f15234x;
            Fragment i12 = FragmentManager.this.f15196c.i(str);
            if (i12 == null) {
                Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                return;
            }
            i12.Y1(i11, strArr, iArr);
        }
    }

    /* loaded from: classes.dex */
    public static class i extends c.a<androidx.activity.result.e, androidx.activity.result.a> {
        @Override // c.a
        /* renamed from: d */
        public Intent a(Context context, androidx.activity.result.e eVar) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent a10 = eVar.a();
            if (a10 != null && (bundleExtra = a10.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                a10.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (a10.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    eVar = new e.b(eVar.d()).b(null).c(eVar.c(), eVar.b()).a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", eVar);
            if (FragmentManager.D0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // c.a
        /* renamed from: e */
        public androidx.activity.result.a c(int i10, Intent intent) {
            return new androidx.activity.result.a(i10, intent);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class j {
        @Deprecated
        public void a(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void b(FragmentManager fragmentManager, Fragment fragment, Context context) {
        }

        public void c(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void d(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void e(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void f(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void g(FragmentManager fragmentManager, Fragment fragment, Context context) {
        }

        public void h(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void i(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void j(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void k(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void l(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void m(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
        }

        public void n(FragmentManager fragmentManager, Fragment fragment) {
        }
    }

    /* loaded from: classes.dex */
    public static class l implements v {

        /* renamed from: a  reason: collision with root package name */
        public final androidx.lifecycle.o f15235a;

        /* renamed from: b  reason: collision with root package name */
        public final v f15236b;

        /* renamed from: c  reason: collision with root package name */
        public final androidx.lifecycle.r f15237c;

        public l(androidx.lifecycle.o oVar, v vVar, androidx.lifecycle.r rVar) {
            this.f15235a = oVar;
            this.f15236b = vVar;
            this.f15237c = rVar;
        }

        @Override // androidx.fragment.app.v
        public void a(String str, Bundle bundle) {
            this.f15236b.a(str, bundle);
        }

        public boolean b(o.c cVar) {
            return this.f15235a.b().a(cVar);
        }

        public void c() {
            this.f15235a.c(this.f15237c);
        }
    }

    /* loaded from: classes.dex */
    public interface m {
        void a();
    }

    /* loaded from: classes.dex */
    public interface n {
        boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* loaded from: classes.dex */
    public class o implements n {

        /* renamed from: a  reason: collision with root package name */
        public final String f15238a;

        /* renamed from: b  reason: collision with root package name */
        public final int f15239b;

        /* renamed from: c  reason: collision with root package name */
        public final int f15240c;

        public o(String str, int i10, int i11) {
            this.f15238a = str;
            this.f15239b = i10;
            this.f15240c = i11;
        }

        @Override // androidx.fragment.app.FragmentManager.n
        public boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = FragmentManager.this.f15213t;
            if (fragment == null || this.f15239b >= 0 || this.f15238a != null || !fragment.p0().U0()) {
                return FragmentManager.this.W0(arrayList, arrayList2, this.f15238a, this.f15239b, this.f15240c);
            }
            return false;
        }
    }

    public static boolean D0(int i10) {
        return N || Log.isLoggable("FragmentManager", i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle K0() {
        Bundle bundle = new Bundle();
        Parcelable d12 = d1();
        if (d12 != null) {
            bundle.putParcelable("android:support:fragments", d12);
        }
        return bundle;
    }

    public static void Z(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i10, int i11) {
        while (i10 < i11) {
            androidx.fragment.app.a aVar = arrayList.get(i10);
            if (arrayList2.get(i10).booleanValue()) {
                aVar.x(-1);
                aVar.C();
            } else {
                aVar.x(1);
                aVar.B();
            }
            i10++;
        }
    }

    public static int c1(int i10) {
        if (i10 != 4097) {
            if (i10 != 8194) {
                if (i10 != 8197) {
                    if (i10 != 4099) {
                        return i10 != 4100 ? 0 : 8197;
                    }
                    return 4099;
                }
                return 4100;
            }
            return 4097;
        }
        return 8194;
    }

    public static FragmentManager g0(View view) {
        Fragment h02 = h0(view);
        if (h02 != null) {
            if (h02.g1()) {
                return h02.p0();
            }
            throw new IllegalStateException("The Fragment " + h02 + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        Context context = view.getContext();
        androidx.fragment.app.h hVar = null;
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                break;
            } else if (context instanceof androidx.fragment.app.h) {
                hVar = (androidx.fragment.app.h) context;
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (hVar != null) {
            return hVar.a3();
        }
        throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
    }

    public static Fragment h0(View view) {
        while (view != null) {
            Fragment x02 = x0(view);
            if (x02 != null) {
                return x02;
            }
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    public static Fragment x0(View view) {
        Object tag = view.getTag(g4.b.f32626a);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    public void A() {
        this.F = true;
        X(true);
        U();
        o();
        P(-1);
        this.f15210q = null;
        this.f15211r = null;
        this.f15212s = null;
        if (this.f15200g != null) {
            this.f15201h.d();
            this.f15200g = null;
        }
        androidx.activity.result.c<Intent> cVar = this.f15218y;
        if (cVar != null) {
            cVar.c();
            this.f15219z.c();
            this.A.c();
        }
    }

    public void A0(Fragment fragment) {
        if (D0(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.W) {
            return;
        }
        fragment.W = true;
        fragment.f15135j0 = true ^ fragment.f15135j0;
        k1(fragment);
    }

    public void B() {
        P(1);
    }

    public void B0(Fragment fragment) {
        if (fragment.H && E0(fragment)) {
            this.C = true;
        }
    }

    public void C() {
        for (Fragment fragment : this.f15196c.o()) {
            if (fragment != null) {
                fragment.s2();
            }
        }
    }

    public boolean C0() {
        return this.F;
    }

    public void D(boolean z10) {
        for (Fragment fragment : this.f15196c.o()) {
            if (fragment != null) {
                fragment.t2(z10);
            }
        }
    }

    public void E(Fragment fragment) {
        Iterator<t> it = this.f15208o.iterator();
        while (it.hasNext()) {
            it.next().a(this, fragment);
        }
    }

    public final boolean E0(Fragment fragment) {
        return (fragment.f15126a0 && fragment.f15127b0) || fragment.R.l();
    }

    public void F() {
        for (Fragment fragment : this.f15196c.l()) {
            if (fragment != null) {
                fragment.L1(fragment.i1());
                fragment.R.F();
            }
        }
    }

    public boolean F0(Fragment fragment) {
        if (fragment == null) {
            return false;
        }
        return fragment.i1();
    }

    public boolean G(MenuItem menuItem) {
        if (this.f15209p < 1) {
            return false;
        }
        for (Fragment fragment : this.f15196c.o()) {
            if (fragment != null && fragment.u2(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public boolean G0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.k1();
    }

    public void H(Menu menu) {
        if (this.f15209p < 1) {
            return;
        }
        for (Fragment fragment : this.f15196c.o()) {
            if (fragment != null) {
                fragment.v2(menu);
            }
        }
    }

    public boolean H0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.P;
        return fragment.equals(fragmentManager.u0()) && H0(fragmentManager.f15212s);
    }

    public final void I(Fragment fragment) {
        if (fragment == null || !fragment.equals(b0(fragment.B))) {
            return;
        }
        fragment.z2();
    }

    public boolean I0(int i10) {
        return this.f15209p >= i10;
    }

    public void J() {
        P(5);
    }

    public boolean J0() {
        return this.D || this.E;
    }

    public void K(boolean z10) {
        for (Fragment fragment : this.f15196c.o()) {
            if (fragment != null) {
                fragment.x2(z10);
            }
        }
    }

    public boolean L(Menu menu) {
        boolean z10 = false;
        if (this.f15209p < 1) {
            return false;
        }
        for (Fragment fragment : this.f15196c.o()) {
            if (fragment != null && G0(fragment) && fragment.y2(menu)) {
                z10 = true;
            }
        }
        return z10;
    }

    public void L0(Fragment fragment, String[] strArr, int i10) {
        if (this.A != null) {
            this.B.addLast(new k(fragment.B, i10));
            this.A.a(strArr);
            return;
        }
        this.f15210q.k(fragment, strArr, i10);
    }

    public void M() {
        o1();
        I(this.f15213t);
    }

    public void M0(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i10, Bundle bundle) {
        if (this.f15218y != null) {
            this.B.addLast(new k(fragment.B, i10));
            if (intent != null && bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            this.f15218y.a(intent);
            return;
        }
        this.f15210q.m(fragment, intent, i10, bundle);
    }

    public void N() {
        this.D = false;
        this.E = false;
        this.K.q(false);
        P(7);
    }

    public void N0(int i10, boolean z10) {
        androidx.fragment.app.m<?> mVar;
        if (this.f15210q == null && i10 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z10 || i10 != this.f15209p) {
            this.f15209p = i10;
            this.f15196c.t();
            m1();
            if (this.C && (mVar = this.f15210q) != null && this.f15209p == 7) {
                mVar.n();
                this.C = false;
            }
        }
    }

    public void O() {
        this.D = false;
        this.E = false;
        this.K.q(false);
        P(5);
    }

    public void O0() {
        if (this.f15210q == null) {
            return;
        }
        this.D = false;
        this.E = false;
        this.K.q(false);
        for (Fragment fragment : this.f15196c.o()) {
            if (fragment != null) {
                fragment.s1();
            }
        }
    }

    public final void P(int i10) {
        try {
            this.f15195b = true;
            this.f15196c.d(i10);
            N0(i10, false);
            for (g0 g0Var : q()) {
                g0Var.j();
            }
            this.f15195b = false;
            X(true);
        } catch (Throwable th2) {
            this.f15195b = false;
            throw th2;
        }
    }

    public void P0(FragmentContainerView fragmentContainerView) {
        View view;
        for (x xVar : this.f15196c.k()) {
            Fragment k10 = xVar.k();
            if (k10.U == fragmentContainerView.getId() && (view = k10.f15130e0) != null && view.getParent() == null) {
                k10.f15129d0 = fragmentContainerView;
                xVar.b();
            }
        }
    }

    public void Q() {
        this.E = true;
        this.K.q(true);
        P(4);
    }

    public void Q0(x xVar) {
        Fragment k10 = xVar.k();
        if (k10.f15131f0) {
            if (this.f15195b) {
                this.G = true;
                return;
            }
            k10.f15131f0 = false;
            xVar.m();
        }
    }

    public void R() {
        P(2);
    }

    public void R0() {
        V(new o(null, -1, 0), false);
    }

    public final void S() {
        if (this.G) {
            this.G = false;
            m1();
        }
    }

    public void S0(int i10, int i11, boolean z10) {
        if (i10 >= 0) {
            V(new o(null, i10, i11), z10);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i10);
    }

    public void T(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f15196c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.f15198e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i10 = 0; i10 < size2; i10++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(this.f15198e.get(i10).toString());
            }
        }
        ArrayList<androidx.fragment.app.a> arrayList2 = this.f15197d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i11 = 0; i11 < size; i11++) {
                androidx.fragment.app.a aVar = this.f15197d.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.z(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f15202i.get());
        synchronized (this.f15194a) {
            int size3 = this.f15194a.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i12 = 0; i12 < size3; i12++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i12);
                    printWriter.print(": ");
                    printWriter.println(this.f15194a.get(i12));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f15210q);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f15211r);
        if (this.f15212s != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f15212s);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f15209p);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.D);
        printWriter.print(" mStopped=");
        printWriter.print(this.E);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.F);
        if (this.C) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.C);
        }
    }

    public void T0(String str, int i10) {
        V(new o(str, -1, i10), false);
    }

    public final void U() {
        for (g0 g0Var : q()) {
            g0Var.j();
        }
    }

    public boolean U0() {
        return V0(null, -1, 0);
    }

    public void V(n nVar, boolean z10) {
        if (!z10) {
            if (this.f15210q == null) {
                if (this.F) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            m();
        }
        synchronized (this.f15194a) {
            if (this.f15210q == null) {
                if (!z10) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
                return;
            }
            this.f15194a.add(nVar);
            e1();
        }
    }

    public final boolean V0(String str, int i10, int i11) {
        X(false);
        W(true);
        Fragment fragment = this.f15213t;
        if (fragment == null || i10 >= 0 || str != null || !fragment.p0().U0()) {
            boolean W0 = W0(this.H, this.I, str, i10, i11);
            if (W0) {
                this.f15195b = true;
                try {
                    Z0(this.H, this.I);
                } finally {
                    n();
                }
            }
            o1();
            S();
            this.f15196c.b();
            return W0;
        }
        return true;
    }

    public final void W(boolean z10) {
        if (!this.f15195b) {
            if (this.f15210q == null) {
                if (this.F) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            } else if (Looper.myLooper() == this.f15210q.h().getLooper()) {
                if (!z10) {
                    m();
                }
                if (this.H == null) {
                    this.H = new ArrayList<>();
                    this.I = new ArrayList<>();
                    return;
                }
                return;
            } else {
                throw new IllegalStateException("Must be called from main thread of fragment host");
            }
        }
        throw new IllegalStateException("FragmentManager is already executing transactions");
    }

    public boolean W0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, String str, int i10, int i11) {
        int c02 = c0(str, i10, (i11 & 1) != 0);
        if (c02 < 0) {
            return false;
        }
        for (int size = this.f15197d.size() - 1; size >= c02; size--) {
            arrayList.add(this.f15197d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public boolean X(boolean z10) {
        W(z10);
        boolean z11 = false;
        while (j0(this.H, this.I)) {
            this.f15195b = true;
            try {
                Z0(this.H, this.I);
                n();
                z11 = true;
            } catch (Throwable th2) {
                n();
                throw th2;
            }
        }
        o1();
        S();
        this.f15196c.b();
        return z11;
    }

    public void X0(j jVar, boolean z10) {
        this.f15207n.o(jVar, z10);
    }

    public void Y(n nVar, boolean z10) {
        if (z10 && (this.f15210q == null || this.F)) {
            return;
        }
        W(z10);
        if (nVar.a(this.H, this.I)) {
            this.f15195b = true;
            try {
                Z0(this.H, this.I);
            } finally {
                n();
            }
        }
        o1();
        S();
        this.f15196c.b();
    }

    public void Y0(Fragment fragment) {
        if (D0(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.O);
        }
        boolean z10 = !fragment.j1();
        if (!fragment.X || z10) {
            this.f15196c.u(fragment);
            if (E0(fragment)) {
                this.C = true;
            }
            fragment.I = true;
            k1(fragment);
        }
    }

    public final void Z0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() == arrayList2.size()) {
            int size = arrayList.size();
            int i10 = 0;
            int i11 = 0;
            while (i10 < size) {
                if (!arrayList.get(i10).f15426r) {
                    if (i11 != i10) {
                        a0(arrayList, arrayList2, i11, i10);
                    }
                    i11 = i10 + 1;
                    if (arrayList2.get(i10).booleanValue()) {
                        while (i11 < size && arrayList2.get(i11).booleanValue() && !arrayList.get(i11).f15426r) {
                            i11++;
                        }
                    }
                    a0(arrayList, arrayList2, i10, i11);
                    i10 = i11 - 1;
                }
                i10++;
            }
            if (i11 != size) {
                a0(arrayList, arrayList2, i11, size);
                return;
            }
            return;
        }
        throw new IllegalStateException("Internal error with the back stack records");
    }

    public final void a0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i10, int i11) {
        boolean z10 = arrayList.get(i10).f15426r;
        ArrayList<Fragment> arrayList3 = this.J;
        if (arrayList3 == null) {
            this.J = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.J.addAll(this.f15196c.o());
        Fragment u02 = u0();
        boolean z11 = false;
        for (int i12 = i10; i12 < i11; i12++) {
            androidx.fragment.app.a aVar = arrayList.get(i12);
            if (!arrayList2.get(i12).booleanValue()) {
                u02 = aVar.D(this.J, u02);
            } else {
                u02 = aVar.G(this.J, u02);
            }
            z11 = z11 || aVar.f15417i;
        }
        this.J.clear();
        if (!z10 && this.f15209p >= 1) {
            for (int i13 = i10; i13 < i11; i13++) {
                Iterator<z.a> it = arrayList.get(i13).f15411c.iterator();
                while (it.hasNext()) {
                    Fragment fragment = it.next().f15429b;
                    if (fragment != null && fragment.P != null) {
                        this.f15196c.r(s(fragment));
                    }
                }
            }
        }
        Z(arrayList, arrayList2, i10, i11);
        boolean booleanValue = arrayList2.get(i11 - 1).booleanValue();
        for (int i14 = i10; i14 < i11; i14++) {
            androidx.fragment.app.a aVar2 = arrayList.get(i14);
            if (booleanValue) {
                for (int size = aVar2.f15411c.size() - 1; size >= 0; size--) {
                    Fragment fragment2 = aVar2.f15411c.get(size).f15429b;
                    if (fragment2 != null) {
                        s(fragment2).m();
                    }
                }
            } else {
                Iterator<z.a> it2 = aVar2.f15411c.iterator();
                while (it2.hasNext()) {
                    Fragment fragment3 = it2.next().f15429b;
                    if (fragment3 != null) {
                        s(fragment3).m();
                    }
                }
            }
        }
        N0(this.f15209p, true);
        for (g0 g0Var : r(arrayList, i10, i11)) {
            g0Var.r(booleanValue);
            g0Var.p();
            g0Var.g();
        }
        while (i10 < i11) {
            androidx.fragment.app.a aVar3 = arrayList.get(i10);
            if (arrayList2.get(i10).booleanValue() && aVar3.f15244v >= 0) {
                aVar3.f15244v = -1;
            }
            aVar3.F();
            i10++;
        }
        if (z11) {
            a1();
        }
    }

    public final void a1() {
        if (this.f15206m != null) {
            for (int i10 = 0; i10 < this.f15206m.size(); i10++) {
                this.f15206m.get(i10).a();
            }
        }
    }

    public Fragment b0(String str) {
        return this.f15196c.f(str);
    }

    public void b1(Parcelable parcelable) {
        r rVar;
        ArrayList<w> arrayList;
        x xVar;
        if (parcelable == null || (arrayList = (rVar = (r) parcelable).f15377w) == null) {
            return;
        }
        this.f15196c.x(arrayList);
        this.f15196c.v();
        Iterator<String> it = rVar.f15378x.iterator();
        while (it.hasNext()) {
            w B = this.f15196c.B(it.next(), null);
            if (B != null) {
                Fragment j10 = this.K.j(B.f15394x);
                if (j10 != null) {
                    if (D0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + j10);
                    }
                    xVar = new x(this.f15207n, this.f15196c, j10, B);
                } else {
                    xVar = new x(this.f15207n, this.f15196c, this.f15210q.f().getClassLoader(), o0(), B);
                }
                Fragment k10 = xVar.k();
                k10.P = this;
                if (D0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + k10.B + "): " + k10);
                }
                xVar.o(this.f15210q.f().getClassLoader());
                this.f15196c.r(xVar);
                xVar.t(this.f15209p);
            }
        }
        for (Fragment fragment : this.K.m()) {
            if (!this.f15196c.c(fragment.B)) {
                if (D0(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + rVar.f15378x);
                }
                this.K.p(fragment);
                fragment.P = this;
                x xVar2 = new x(this.f15207n, this.f15196c, fragment);
                xVar2.t(1);
                xVar2.m();
                fragment.I = true;
                xVar2.m();
            }
        }
        this.f15196c.w(rVar.f15379y);
        if (rVar.f15380z != null) {
            this.f15197d = new ArrayList<>(rVar.f15380z.length);
            int i10 = 0;
            while (true) {
                androidx.fragment.app.b[] bVarArr = rVar.f15380z;
                if (i10 >= bVarArr.length) {
                    break;
                }
                androidx.fragment.app.a b10 = bVarArr[i10].b(this);
                if (D0(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i10 + " (index " + b10.f15244v + "): " + b10);
                    PrintWriter printWriter = new PrintWriter(new f0("FragmentManager"));
                    b10.A("  ", printWriter, false);
                    printWriter.close();
                }
                this.f15197d.add(b10);
                i10++;
            }
        } else {
            this.f15197d = null;
        }
        this.f15202i.set(rVar.A);
        String str = rVar.B;
        if (str != null) {
            Fragment b02 = b0(str);
            this.f15213t = b02;
            I(b02);
        }
        ArrayList<String> arrayList2 = rVar.C;
        if (arrayList2 != null) {
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                this.f15203j.put(arrayList2.get(i11), rVar.D.get(i11));
            }
        }
        ArrayList<String> arrayList3 = rVar.E;
        if (arrayList3 != null) {
            for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                Bundle bundle = rVar.F.get(i12);
                bundle.setClassLoader(this.f15210q.f().getClassLoader());
                this.f15204k.put(arrayList3.get(i12), bundle);
            }
        }
        this.B = new ArrayDeque<>(rVar.G);
    }

    public final int c0(String str, int i10, boolean z10) {
        ArrayList<androidx.fragment.app.a> arrayList = this.f15197d;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        if (str == null && i10 < 0) {
            if (z10) {
                return 0;
            }
            return this.f15197d.size() - 1;
        }
        int size = this.f15197d.size() - 1;
        while (size >= 0) {
            androidx.fragment.app.a aVar = this.f15197d.get(size);
            if ((str != null && str.equals(aVar.E())) || (i10 >= 0 && i10 == aVar.f15244v)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z10) {
            if (size == this.f15197d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            androidx.fragment.app.a aVar2 = this.f15197d.get(size - 1);
            if ((str == null || !str.equals(aVar2.E())) && (i10 < 0 || i10 != aVar2.f15244v)) {
                return size;
            }
            size--;
        }
        return size;
    }

    public Fragment d0(int i10) {
        return this.f15196c.g(i10);
    }

    public Parcelable d1() {
        int size;
        i0();
        U();
        X(true);
        this.D = true;
        this.K.q(true);
        ArrayList<String> y10 = this.f15196c.y();
        ArrayList<w> m10 = this.f15196c.m();
        androidx.fragment.app.b[] bVarArr = null;
        if (m10.isEmpty()) {
            if (D0(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        ArrayList<String> z10 = this.f15196c.z();
        ArrayList<androidx.fragment.app.a> arrayList = this.f15197d;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            bVarArr = new androidx.fragment.app.b[size];
            for (int i10 = 0; i10 < size; i10++) {
                bVarArr[i10] = new androidx.fragment.app.b(this.f15197d.get(i10));
                if (D0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i10 + ": " + this.f15197d.get(i10));
                }
            }
        }
        r rVar = new r();
        rVar.f15377w = m10;
        rVar.f15378x = y10;
        rVar.f15379y = z10;
        rVar.f15380z = bVarArr;
        rVar.A = this.f15202i.get();
        Fragment fragment = this.f15213t;
        if (fragment != null) {
            rVar.B = fragment.B;
        }
        rVar.C.addAll(this.f15203j.keySet());
        rVar.D.addAll(this.f15203j.values());
        rVar.E.addAll(this.f15204k.keySet());
        rVar.F.addAll(this.f15204k.values());
        rVar.G = new ArrayList<>(this.B);
        return rVar;
    }

    public void e(androidx.fragment.app.a aVar) {
        if (this.f15197d == null) {
            this.f15197d = new ArrayList<>();
        }
        this.f15197d.add(aVar);
    }

    public Fragment e0(String str) {
        return this.f15196c.h(str);
    }

    public void e1() {
        synchronized (this.f15194a) {
            boolean z10 = true;
            if (this.f15194a.size() != 1) {
                z10 = false;
            }
            if (z10) {
                this.f15210q.h().removeCallbacks(this.M);
                this.f15210q.h().post(this.M);
                o1();
            }
        }
    }

    public x f(Fragment fragment) {
        String str = fragment.f15138m0;
        if (str != null) {
            h4.c.h(fragment, str);
        }
        if (D0(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        x s10 = s(fragment);
        fragment.P = this;
        this.f15196c.r(s10);
        if (!fragment.X) {
            this.f15196c.a(fragment);
            fragment.I = false;
            if (fragment.f15130e0 == null) {
                fragment.f15135j0 = false;
            }
            if (E0(fragment)) {
                this.C = true;
            }
        }
        return s10;
    }

    public Fragment f0(String str) {
        return this.f15196c.i(str);
    }

    public void f1(Fragment fragment, boolean z10) {
        ViewGroup n02 = n0(fragment);
        if (n02 == null || !(n02 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) n02).setDrawDisappearingViewsLast(!z10);
    }

    public void g(t tVar) {
        this.f15208o.add(tVar);
    }

    public final void g1(String str, Bundle bundle) {
        l lVar = this.f15205l.get(str);
        if (lVar != null && lVar.b(o.c.STARTED)) {
            lVar.a(str, bundle);
        } else {
            this.f15204k.put(str, bundle);
        }
        if (D0(2)) {
            Log.v("FragmentManager", "Setting fragment result with key " + str + " and result " + bundle);
        }
    }

    public int h() {
        return this.f15202i.getAndIncrement();
    }

    @SuppressLint({"SyntheticAccessor"})
    public final void h1(final String str, androidx.lifecycle.u uVar, final v vVar) {
        final androidx.lifecycle.o g10 = uVar.g();
        if (g10.b() == o.c.DESTROYED) {
            return;
        }
        androidx.lifecycle.r rVar = new androidx.lifecycle.r() { // from class: androidx.fragment.app.FragmentManager.5
            @Override // androidx.lifecycle.r
            public void i(androidx.lifecycle.u uVar2, o.b bVar) {
                Bundle bundle;
                if (bVar == o.b.ON_START && (bundle = (Bundle) FragmentManager.this.f15204k.get(str)) != null) {
                    vVar.a(str, bundle);
                    FragmentManager.this.p(str);
                }
                if (bVar == o.b.ON_DESTROY) {
                    g10.c(this);
                    FragmentManager.this.f15205l.remove(str);
                }
            }
        };
        g10.a(rVar);
        l put = this.f15205l.put(str, new l(g10, vVar, rVar));
        if (put != null) {
            put.c();
        }
        if (D0(2)) {
            Log.v("FragmentManager", "Setting FragmentResultListener with key " + str + " lifecycleOwner " + g10 + " and listener " + vVar);
        }
    }

    @SuppressLint({"SyntheticAccessor"})
    public void i(androidx.fragment.app.m<?> mVar, androidx.fragment.app.j jVar, Fragment fragment) {
        String str;
        if (this.f15210q == null) {
            this.f15210q = mVar;
            this.f15211r = jVar;
            this.f15212s = fragment;
            if (fragment != null) {
                g(new e(fragment));
            } else if (mVar instanceof t) {
                g((t) mVar);
            }
            if (this.f15212s != null) {
                o1();
            }
            if (mVar instanceof androidx.activity.f) {
                androidx.activity.f fVar = (androidx.activity.f) mVar;
                OnBackPressedDispatcher c12 = fVar.c1();
                this.f15200g = c12;
                androidx.lifecycle.u uVar = fVar;
                if (fragment != null) {
                    uVar = fragment;
                }
                c12.a(uVar, this.f15201h);
            }
            if (fragment != null) {
                this.K = fragment.P.l0(fragment);
            } else if (mVar instanceof v0) {
                this.K = s.l(((v0) mVar).U());
            } else {
                this.K = new s(false);
            }
            this.K.q(J0());
            this.f15196c.A(this.K);
            androidx.fragment.app.m<?> mVar2 = this.f15210q;
            if ((mVar2 instanceof y4.e) && fragment == null) {
                y4.c a02 = ((y4.e) mVar2).a0();
                a02.g("android:support:fragments", new c.InterfaceC1040c() { // from class: androidx.fragment.app.p
                    @Override // y4.c.InterfaceC1040c
                    public final Bundle a() {
                        Bundle K0;
                        K0 = FragmentManager.this.K0();
                        return K0;
                    }
                });
                Bundle b10 = a02.b("android:support:fragments");
                if (b10 != null) {
                    b1(b10.getParcelable("android:support:fragments"));
                }
            }
            androidx.fragment.app.m<?> mVar3 = this.f15210q;
            if (mVar3 instanceof androidx.activity.result.d) {
                ActivityResultRegistry O = ((androidx.activity.result.d) mVar3).O();
                if (fragment != null) {
                    str = fragment.B + ":";
                } else {
                    str = "";
                }
                String str2 = "FragmentManager:" + str;
                this.f15218y = O.j(str2 + "StartActivityForResult", new c.c(), new f());
                this.f15219z = O.j(str2 + "StartIntentSenderForResult", new i(), new g());
                this.A = O.j(str2 + "RequestPermissions", new c.b(), new h());
                return;
            }
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    public final void i0() {
        for (g0 g0Var : q()) {
            g0Var.k();
        }
    }

    public void i1(Fragment fragment, o.c cVar) {
        if (fragment.equals(b0(fragment.B)) && (fragment.Q == null || fragment.P == this)) {
            fragment.f15139n0 = cVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public void j(Fragment fragment) {
        if (D0(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.X) {
            fragment.X = false;
            if (fragment.H) {
                return;
            }
            this.f15196c.a(fragment);
            if (D0(2)) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            if (E0(fragment)) {
                this.C = true;
            }
        }
    }

    public final boolean j0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this.f15194a) {
            if (this.f15194a.isEmpty()) {
                return false;
            }
            int size = this.f15194a.size();
            boolean z10 = false;
            for (int i10 = 0; i10 < size; i10++) {
                z10 |= this.f15194a.get(i10).a(arrayList, arrayList2);
            }
            this.f15194a.clear();
            this.f15210q.h().removeCallbacks(this.M);
            return z10;
        }
    }

    public void j1(Fragment fragment) {
        if (fragment != null && (!fragment.equals(b0(fragment.B)) || (fragment.Q != null && fragment.P != this))) {
            throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        }
        Fragment fragment2 = this.f15213t;
        this.f15213t = fragment;
        I(fragment2);
        I(this.f15213t);
    }

    public z k() {
        return new androidx.fragment.app.a(this);
    }

    public int k0() {
        ArrayList<androidx.fragment.app.a> arrayList = this.f15197d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public final void k1(Fragment fragment) {
        ViewGroup n02 = n0(fragment);
        if (n02 == null || fragment.s0() + fragment.w0() + fragment.K0() + fragment.L0() <= 0) {
            return;
        }
        int i10 = g4.b.f32628c;
        if (n02.getTag(i10) == null) {
            n02.setTag(i10, fragment);
        }
        ((Fragment) n02.getTag(i10)).a3(fragment.J0());
    }

    public boolean l() {
        boolean z10 = false;
        for (Fragment fragment : this.f15196c.l()) {
            if (fragment != null) {
                z10 = E0(fragment);
                continue;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public final s l0(Fragment fragment) {
        return this.K.k(fragment);
    }

    public void l1(Fragment fragment) {
        if (D0(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.W) {
            fragment.W = false;
            fragment.f15135j0 = !fragment.f15135j0;
        }
    }

    public final void m() {
        if (J0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    public androidx.fragment.app.j m0() {
        return this.f15211r;
    }

    public final void m1() {
        for (x xVar : this.f15196c.k()) {
            Q0(xVar);
        }
    }

    public final void n() {
        this.f15195b = false;
        this.I.clear();
        this.H.clear();
    }

    public final ViewGroup n0(Fragment fragment) {
        ViewGroup viewGroup = fragment.f15129d0;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.U > 0 && this.f15211r.d()) {
            View c10 = this.f15211r.c(fragment.U);
            if (c10 instanceof ViewGroup) {
                return (ViewGroup) c10;
            }
        }
        return null;
    }

    public void n1(j jVar) {
        this.f15207n.p(jVar);
    }

    public final void o() {
        androidx.fragment.app.m<?> mVar = this.f15210q;
        boolean z10 = true;
        if (mVar instanceof v0) {
            z10 = this.f15196c.p().o();
        } else if (mVar.f() instanceof Activity) {
            z10 = true ^ ((Activity) this.f15210q.f()).isChangingConfigurations();
        }
        if (z10) {
            for (androidx.fragment.app.c cVar : this.f15203j.values()) {
                for (String str : cVar.f15268w) {
                    this.f15196c.p().h(str);
                }
            }
        }
    }

    public androidx.fragment.app.l o0() {
        androidx.fragment.app.l lVar = this.f15214u;
        if (lVar != null) {
            return lVar;
        }
        Fragment fragment = this.f15212s;
        if (fragment != null) {
            return fragment.P.o0();
        }
        return this.f15215v;
    }

    public final void o1() {
        synchronized (this.f15194a) {
            boolean z10 = true;
            if (!this.f15194a.isEmpty()) {
                this.f15201h.f(true);
            } else {
                this.f15201h.f((k0() <= 0 || !H0(this.f15212s)) ? false : false);
            }
        }
    }

    public final void p(String str) {
        this.f15204k.remove(str);
        if (D0(2)) {
            Log.v("FragmentManager", "Clearing fragment result with key " + str);
        }
    }

    public List<Fragment> p0() {
        return this.f15196c.o();
    }

    public final Set<g0> q() {
        HashSet hashSet = new HashSet();
        for (x xVar : this.f15196c.k()) {
            ViewGroup viewGroup = xVar.k().f15129d0;
            if (viewGroup != null) {
                hashSet.add(g0.o(viewGroup, v0()));
            }
        }
        return hashSet;
    }

    public androidx.fragment.app.m<?> q0() {
        return this.f15210q;
    }

    public final Set<g0> r(ArrayList<androidx.fragment.app.a> arrayList, int i10, int i11) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i10 < i11) {
            Iterator<z.a> it = arrayList.get(i10).f15411c.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().f15429b;
                if (fragment != null && (viewGroup = fragment.f15129d0) != null) {
                    hashSet.add(g0.n(viewGroup, this));
                }
            }
            i10++;
        }
        return hashSet;
    }

    public LayoutInflater.Factory2 r0() {
        return this.f15199f;
    }

    public x s(Fragment fragment) {
        x n10 = this.f15196c.n(fragment.B);
        if (n10 != null) {
            return n10;
        }
        x xVar = new x(this.f15207n, this.f15196c, fragment);
        xVar.o(this.f15210q.f().getClassLoader());
        xVar.t(this.f15209p);
        return xVar;
    }

    public androidx.fragment.app.o s0() {
        return this.f15207n;
    }

    public void t(Fragment fragment) {
        if (D0(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.X) {
            return;
        }
        fragment.X = true;
        if (fragment.H) {
            if (D0(2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            this.f15196c.u(fragment);
            if (E0(fragment)) {
                this.C = true;
            }
            k1(fragment);
        }
    }

    public Fragment t0() {
        return this.f15212s;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Fragment fragment = this.f15212s;
        if (fragment != null) {
            sb2.append(fragment.getClass().getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(this.f15212s)));
            sb2.append("}");
        } else {
            androidx.fragment.app.m<?> mVar = this.f15210q;
            if (mVar != null) {
                sb2.append(mVar.getClass().getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(this.f15210q)));
                sb2.append("}");
            } else {
                sb2.append("null");
            }
        }
        sb2.append("}}");
        return sb2.toString();
    }

    public void u() {
        this.D = false;
        this.E = false;
        this.K.q(false);
        P(4);
    }

    public Fragment u0() {
        return this.f15213t;
    }

    public void v() {
        this.D = false;
        this.E = false;
        this.K.q(false);
        P(0);
    }

    public h0 v0() {
        h0 h0Var = this.f15216w;
        if (h0Var != null) {
            return h0Var;
        }
        Fragment fragment = this.f15212s;
        if (fragment != null) {
            return fragment.P.v0();
        }
        return this.f15217x;
    }

    public void w(Configuration configuration) {
        for (Fragment fragment : this.f15196c.o()) {
            if (fragment != null) {
                fragment.j2(configuration);
            }
        }
    }

    public c.C0433c w0() {
        return this.L;
    }

    public boolean x(MenuItem menuItem) {
        if (this.f15209p < 1) {
            return false;
        }
        for (Fragment fragment : this.f15196c.o()) {
            if (fragment != null && fragment.k2(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void y() {
        this.D = false;
        this.E = false;
        this.K.q(false);
        P(1);
    }

    public u0 y0(Fragment fragment) {
        return this.K.n(fragment);
    }

    public boolean z(Menu menu, MenuInflater menuInflater) {
        if (this.f15209p < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z10 = false;
        for (Fragment fragment : this.f15196c.o()) {
            if (fragment != null && G0(fragment) && fragment.m2(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z10 = true;
            }
        }
        if (this.f15198e != null) {
            for (int i10 = 0; i10 < this.f15198e.size(); i10++) {
                Fragment fragment2 = this.f15198e.get(i10);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.G1();
                }
            }
        }
        this.f15198e = arrayList;
        return z10;
    }

    public void z0() {
        X(true);
        if (this.f15201h.c()) {
            U0();
        } else {
            this.f15200g.c();
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class k implements Parcelable {
        public static final Parcelable.Creator<k> CREATOR = new a();

        /* renamed from: w  reason: collision with root package name */
        public String f15233w;

        /* renamed from: x  reason: collision with root package name */
        public int f15234x;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<k> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public k createFromParcel(Parcel parcel) {
                return new k(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public k[] newArray(int i10) {
                return new k[i10];
            }
        }

        public k(String str, int i10) {
            this.f15233w = str;
            this.f15234x = i10;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f15233w);
            parcel.writeInt(this.f15234x);
        }

        public k(Parcel parcel) {
            this.f15233w = parcel.readString();
            this.f15234x = parcel.readInt();
        }
    }
}
