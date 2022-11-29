package androidx.databinding;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.b;
import androidx.databinding.h;
import androidx.databinding.i;
import androidx.databinding.j;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import androidx.lifecycle.o;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public abstract class ViewDataBinding extends androidx.databinding.a {
    public static final View.OnAttachStateChangeListener A;

    /* renamed from: r  reason: collision with root package name */
    public static int f14983r = 0;

    /* renamed from: s  reason: collision with root package name */
    public static final int f14984s = 8;

    /* renamed from: t  reason: collision with root package name */
    public static final boolean f14985t;

    /* renamed from: u  reason: collision with root package name */
    public static final androidx.databinding.c f14986u;

    /* renamed from: v  reason: collision with root package name */
    public static final androidx.databinding.c f14987v;

    /* renamed from: w  reason: collision with root package name */
    public static final androidx.databinding.c f14988w;

    /* renamed from: x  reason: collision with root package name */
    public static final androidx.databinding.c f14989x;

    /* renamed from: y  reason: collision with root package name */
    public static final b.a<androidx.databinding.l, ViewDataBinding, Void> f14990y;

    /* renamed from: z  reason: collision with root package name */
    public static final ReferenceQueue<ViewDataBinding> f14991z;

    /* renamed from: b  reason: collision with root package name */
    public final Runnable f14992b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f14993c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f14994d;

    /* renamed from: e  reason: collision with root package name */
    public n[] f14995e;

    /* renamed from: f  reason: collision with root package name */
    public final View f14996f;

    /* renamed from: g  reason: collision with root package name */
    public androidx.databinding.b<androidx.databinding.l, ViewDataBinding, Void> f14997g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f14998h;

    /* renamed from: i  reason: collision with root package name */
    public Choreographer f14999i;

    /* renamed from: j  reason: collision with root package name */
    public final Choreographer.FrameCallback f15000j;

    /* renamed from: k  reason: collision with root package name */
    public Handler f15001k;

    /* renamed from: l  reason: collision with root package name */
    public final androidx.databinding.e f15002l;

    /* renamed from: m  reason: collision with root package name */
    public ViewDataBinding f15003m;

    /* renamed from: n  reason: collision with root package name */
    public u f15004n;

    /* renamed from: o  reason: collision with root package name */
    public OnStartListener f15005o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f15006p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f15007q;

    /* loaded from: classes.dex */
    public static class OnStartListener implements t {

        /* renamed from: w  reason: collision with root package name */
        public final WeakReference<ViewDataBinding> f15008w;

        public /* synthetic */ OnStartListener(ViewDataBinding viewDataBinding, a aVar) {
            this(viewDataBinding);
        }

        @g0(o.b.ON_START)
        public void onStart() {
            ViewDataBinding viewDataBinding = this.f15008w.get();
            if (viewDataBinding != null) {
                viewDataBinding.o();
            }
        }

        public OnStartListener(ViewDataBinding viewDataBinding) {
            this.f15008w = new WeakReference<>(viewDataBinding);
        }
    }

    /* loaded from: classes.dex */
    public class a implements androidx.databinding.c {
        @Override // androidx.databinding.c
        public n a(ViewDataBinding viewDataBinding, int i10, ReferenceQueue<ViewDataBinding> referenceQueue) {
            return new m(viewDataBinding, i10, referenceQueue).f();
        }
    }

    /* loaded from: classes.dex */
    public class b implements androidx.databinding.c {
        @Override // androidx.databinding.c
        public n a(ViewDataBinding viewDataBinding, int i10, ReferenceQueue<ViewDataBinding> referenceQueue) {
            return new k(viewDataBinding, i10, referenceQueue).e();
        }
    }

    /* loaded from: classes.dex */
    public class c implements androidx.databinding.c {
        @Override // androidx.databinding.c
        public n a(ViewDataBinding viewDataBinding, int i10, ReferenceQueue<ViewDataBinding> referenceQueue) {
            return new l(viewDataBinding, i10, referenceQueue).e();
        }
    }

    /* loaded from: classes.dex */
    public class d implements androidx.databinding.c {
        @Override // androidx.databinding.c
        public n a(ViewDataBinding viewDataBinding, int i10, ReferenceQueue<ViewDataBinding> referenceQueue) {
            return new j(viewDataBinding, i10, referenceQueue).g();
        }
    }

    /* loaded from: classes.dex */
    public class e extends b.a<androidx.databinding.l, ViewDataBinding, Void> {
        @Override // androidx.databinding.b.a
        /* renamed from: b */
        public void a(androidx.databinding.l lVar, ViewDataBinding viewDataBinding, int i10, Void r42) {
            if (i10 == 1) {
                if (lVar.c(viewDataBinding)) {
                    return;
                }
                viewDataBinding.f14994d = true;
            } else if (i10 == 2) {
                lVar.b(viewDataBinding);
            } else if (i10 != 3) {
            } else {
                lVar.a(viewDataBinding);
            }
        }
    }

    /* loaded from: classes.dex */
    public class f implements View.OnAttachStateChangeListener {
        @Override // android.view.View.OnAttachStateChangeListener
        @TargetApi(19)
        public void onViewAttachedToWindow(View view) {
            ViewDataBinding.r(view).f14992b.run();
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* loaded from: classes.dex */
    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                ViewDataBinding.this.f14993c = false;
            }
            ViewDataBinding.F();
            if (Build.VERSION.SDK_INT >= 19 && !ViewDataBinding.this.f14996f.isAttachedToWindow()) {
                ViewDataBinding.this.f14996f.removeOnAttachStateChangeListener(ViewDataBinding.A);
                ViewDataBinding.this.f14996f.addOnAttachStateChangeListener(ViewDataBinding.A);
                return;
            }
            ViewDataBinding.this.o();
        }
    }

    /* loaded from: classes.dex */
    public class h implements Choreographer.FrameCallback {
        public h() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            ViewDataBinding.this.f14992b.run();
        }
    }

    /* loaded from: classes.dex */
    public static class i {

        /* renamed from: a  reason: collision with root package name */
        public final String[][] f15011a;

        /* renamed from: b  reason: collision with root package name */
        public final int[][] f15012b;

        /* renamed from: c  reason: collision with root package name */
        public final int[][] f15013c;

        public i(int i10) {
            this.f15011a = new String[i10];
            this.f15012b = new int[i10];
            this.f15013c = new int[i10];
        }

        public void a(int i10, String[] strArr, int[] iArr, int[] iArr2) {
            this.f15011a[i10] = strArr;
            this.f15012b[i10] = iArr;
            this.f15013c[i10] = iArr2;
        }
    }

    /* loaded from: classes.dex */
    public static class j implements f0, androidx.databinding.k<LiveData<?>> {

        /* renamed from: a  reason: collision with root package name */
        public final n<LiveData<?>> f15014a;

        /* renamed from: b  reason: collision with root package name */
        public WeakReference<u> f15015b = null;

        public j(ViewDataBinding viewDataBinding, int i10, ReferenceQueue<ViewDataBinding> referenceQueue) {
            this.f15014a = new n<>(viewDataBinding, i10, this, referenceQueue);
        }

        @Override // androidx.databinding.k
        public void a(u uVar) {
            u f10 = f();
            LiveData<?> b10 = this.f15014a.b();
            if (b10 != null) {
                if (f10 != null) {
                    b10.n(this);
                }
                if (uVar != null) {
                    b10.i(uVar, this);
                }
            }
            if (uVar != null) {
                this.f15015b = new WeakReference<>(uVar);
            }
        }

        @Override // androidx.lifecycle.f0
        public void d(Object obj) {
            ViewDataBinding a10 = this.f15014a.a();
            if (a10 != null) {
                n<LiveData<?>> nVar = this.f15014a;
                a10.v(nVar.f15030b, nVar.b(), 0);
            }
        }

        @Override // androidx.databinding.k
        /* renamed from: e */
        public void c(LiveData<?> liveData) {
            u f10 = f();
            if (f10 != null) {
                liveData.i(f10, this);
            }
        }

        public final u f() {
            WeakReference<u> weakReference = this.f15015b;
            if (weakReference == null) {
                return null;
            }
            return weakReference.get();
        }

        public n<LiveData<?>> g() {
            return this.f15014a;
        }

        @Override // androidx.databinding.k
        /* renamed from: h */
        public void b(LiveData<?> liveData) {
            liveData.n(this);
        }
    }

    /* loaded from: classes.dex */
    public static class k extends i.a implements androidx.databinding.k<androidx.databinding.i> {

        /* renamed from: a  reason: collision with root package name */
        public final n<androidx.databinding.i> f15016a;

        public k(ViewDataBinding viewDataBinding, int i10, ReferenceQueue<ViewDataBinding> referenceQueue) {
            this.f15016a = new n<>(viewDataBinding, i10, this, referenceQueue);
        }

        @Override // androidx.databinding.k
        public void a(u uVar) {
        }

        @Override // androidx.databinding.k
        /* renamed from: d */
        public void c(androidx.databinding.i iVar) {
            iVar.B1(this);
        }

        public n<androidx.databinding.i> e() {
            return this.f15016a;
        }

        @Override // androidx.databinding.k
        /* renamed from: f */
        public void b(androidx.databinding.i iVar) {
            iVar.z(this);
        }
    }

    /* loaded from: classes.dex */
    public static class l extends j.a implements androidx.databinding.k<androidx.databinding.j> {

        /* renamed from: a  reason: collision with root package name */
        public final n<androidx.databinding.j> f15017a;

        public l(ViewDataBinding viewDataBinding, int i10, ReferenceQueue<ViewDataBinding> referenceQueue) {
            this.f15017a = new n<>(viewDataBinding, i10, this, referenceQueue);
        }

        @Override // androidx.databinding.k
        public void a(u uVar) {
        }

        @Override // androidx.databinding.k
        /* renamed from: d */
        public void c(androidx.databinding.j jVar) {
            jVar.b(this);
        }

        public n<androidx.databinding.j> e() {
            return this.f15017a;
        }

        @Override // androidx.databinding.k
        /* renamed from: f */
        public void b(androidx.databinding.j jVar) {
            jVar.c(this);
        }
    }

    /* loaded from: classes.dex */
    public static class m extends h.a implements androidx.databinding.k<androidx.databinding.h> {

        /* renamed from: a  reason: collision with root package name */
        public final n<androidx.databinding.h> f15018a;

        public m(ViewDataBinding viewDataBinding, int i10, ReferenceQueue<ViewDataBinding> referenceQueue) {
            this.f15018a = new n<>(viewDataBinding, i10, this, referenceQueue);
        }

        @Override // androidx.databinding.k
        public void a(u uVar) {
        }

        @Override // androidx.databinding.h.a
        public void d(androidx.databinding.h hVar, int i10) {
            ViewDataBinding a10 = this.f15018a.a();
            if (a10 != null && this.f15018a.b() == hVar) {
                a10.v(this.f15018a.f15030b, hVar, i10);
            }
        }

        @Override // androidx.databinding.k
        /* renamed from: e */
        public void c(androidx.databinding.h hVar) {
            hVar.a(this);
        }

        public n<androidx.databinding.h> f() {
            return this.f15018a;
        }

        @Override // androidx.databinding.k
        /* renamed from: g */
        public void b(androidx.databinding.h hVar) {
            hVar.b(this);
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        f14983r = i10;
        f14985t = i10 >= 16;
        f14986u = new a();
        f14987v = new b();
        f14988w = new c();
        f14989x = new d();
        f14990y = new e();
        f14991z = new ReferenceQueue<>();
        if (i10 < 19) {
            A = null;
        } else {
            A = new f();
        }
    }

    public ViewDataBinding(androidx.databinding.e eVar, View view, int i10) {
        this.f14992b = new g();
        this.f14993c = false;
        this.f14994d = false;
        this.f15002l = eVar;
        this.f14995e = new n[i10];
        this.f14996f = view;
        if (Looper.myLooper() != null) {
            if (f14985t) {
                this.f14999i = Choreographer.getInstance();
                this.f15000j = new h();
                return;
            }
            this.f15000j = null;
            this.f15001k = new Handler(Looper.myLooper());
            return;
        }
        throw new IllegalStateException("DataBinding must be created in view's UI Thread");
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A(androidx.databinding.e r17, android.view.View r18, java.lang.Object[] r19, androidx.databinding.ViewDataBinding.i r20, android.util.SparseIntArray r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.databinding.ViewDataBinding.A(androidx.databinding.e, android.view.View, java.lang.Object[], androidx.databinding.ViewDataBinding$i, android.util.SparseIntArray, boolean):void");
    }

    public static Object[] B(androidx.databinding.e eVar, View view, int i10, i iVar, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i10];
        A(eVar, view, objArr, iVar, sparseIntArray, true);
        return objArr;
    }

    public static Object[] C(androidx.databinding.e eVar, View[] viewArr, int i10, i iVar, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i10];
        for (View view : viewArr) {
            A(eVar, view, objArr, iVar, sparseIntArray, true);
        }
        return objArr;
    }

    public static int E(String str, int i10) {
        int length = str.length();
        int i11 = 0;
        while (i10 < length) {
            i11 = (i11 * 10) + (str.charAt(i10) - '0');
            i10++;
        }
        return i11;
    }

    public static void F() {
        while (true) {
            Reference<? extends ViewDataBinding> poll = f14991z.poll();
            if (poll == null) {
                return;
            }
            if (poll instanceof n) {
                ((n) poll).e();
            }
        }
    }

    public static float I(Float f10) {
        if (f10 == null) {
            return 0.0f;
        }
        return f10.floatValue();
    }

    public static int J(Integer num) {
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static boolean K(Boolean bool) {
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static ViewDataBinding j(Object obj, View view, int i10) {
        return androidx.databinding.f.a(k(obj), view, i10);
    }

    public static androidx.databinding.e k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof androidx.databinding.e) {
            return (androidx.databinding.e) obj;
        }
        throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
    }

    public static void n(ViewDataBinding viewDataBinding) {
        viewDataBinding.m();
    }

    public static int p(String str, int i10, i iVar, int i11) {
        CharSequence subSequence = str.subSequence(str.indexOf(47) + 1, str.length() - 2);
        String[] strArr = iVar.f15011a[i11];
        int length = strArr.length;
        while (i10 < length) {
            if (TextUtils.equals(subSequence, strArr[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static int q(ViewGroup viewGroup, int i10) {
        String str = (String) viewGroup.getChildAt(i10).getTag();
        String substring = str.substring(0, str.length() - 1);
        int length = substring.length();
        int childCount = viewGroup.getChildCount();
        for (int i11 = i10 + 1; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            String str2 = childAt.getTag() instanceof String ? (String) childAt.getTag() : null;
            if (str2 != null && str2.startsWith(substring)) {
                if (str2.length() == str.length() && str2.charAt(str2.length() - 1) == '0') {
                    return i10;
                }
                if (z(str2, length)) {
                    i10 = i11;
                }
            }
        }
        return i10;
    }

    public static ViewDataBinding r(View view) {
        if (view != null) {
            return (ViewDataBinding) view.getTag(y3.a.f61228a);
        }
        return null;
    }

    public static int s() {
        return f14983r;
    }

    public static int t(View view, int i10) {
        if (Build.VERSION.SDK_INT >= 23) {
            return view.getContext().getColor(i10);
        }
        return view.getResources().getColor(i10);
    }

    public static <T extends ViewDataBinding> T x(LayoutInflater layoutInflater, int i10, ViewGroup viewGroup, boolean z10, Object obj) {
        return (T) androidx.databinding.f.f(layoutInflater, i10, viewGroup, z10, k(obj));
    }

    public static boolean z(String str, int i10) {
        int length = str.length();
        if (length == i10) {
            return false;
        }
        while (i10 < length) {
            if (!Character.isDigit(str.charAt(i10))) {
                return false;
            }
            i10++;
        }
        return true;
    }

    public abstract boolean D(int i10, Object obj, int i11);

    public void G(int i10, Object obj, androidx.databinding.c cVar) {
        if (obj == null) {
            return;
        }
        n nVar = this.f14995e[i10];
        if (nVar == null) {
            nVar = cVar.a(this, i10, f14991z);
            this.f14995e[i10] = nVar;
            u uVar = this.f15004n;
            if (uVar != null) {
                nVar.c(uVar);
            }
        }
        nVar.d(obj);
    }

    public void H() {
        ViewDataBinding viewDataBinding = this.f15003m;
        if (viewDataBinding != null) {
            viewDataBinding.H();
            return;
        }
        u uVar = this.f15004n;
        if (uVar == null || uVar.g().b().a(o.c.STARTED)) {
            synchronized (this) {
                if (this.f14993c) {
                    return;
                }
                this.f14993c = true;
                if (f14985t) {
                    this.f14999i.postFrameCallback(this.f15000j);
                } else {
                    this.f15001k.post(this.f14992b);
                }
            }
        }
    }

    public void L(ViewDataBinding viewDataBinding) {
        if (viewDataBinding != null) {
            viewDataBinding.f15003m = this;
        }
    }

    public void M(u uVar) {
        n[] nVarArr;
        if (uVar instanceof Fragment) {
            Log.w("DataBinding", "Setting the fragment as the LifecycleOwner might cause memory leaks because views lives shorter than the Fragment. Consider using Fragment's view lifecycle");
        }
        u uVar2 = this.f15004n;
        if (uVar2 == uVar) {
            return;
        }
        if (uVar2 != null) {
            uVar2.g().c(this.f15005o);
        }
        this.f15004n = uVar;
        if (uVar != null) {
            if (this.f15005o == null) {
                this.f15005o = new OnStartListener(this, null);
            }
            uVar.g().a(this.f15005o);
        }
        for (n nVar : this.f14995e) {
            if (nVar != null) {
                nVar.c(uVar);
            }
        }
    }

    public void N(View view) {
        view.setTag(y3.a.f61228a, this);
    }

    public void O(View[] viewArr) {
        for (View view : viewArr) {
            view.setTag(y3.a.f61228a, this);
        }
    }

    public boolean P(int i10) {
        n nVar = this.f14995e[i10];
        if (nVar != null) {
            return nVar.e();
        }
        return false;
    }

    public boolean Q(int i10, LiveData<?> liveData) {
        this.f15006p = true;
        try {
            return S(i10, liveData, f14989x);
        } finally {
            this.f15006p = false;
        }
    }

    public boolean R(int i10, androidx.databinding.h hVar) {
        return S(i10, hVar, f14986u);
    }

    public boolean S(int i10, Object obj, androidx.databinding.c cVar) {
        if (obj == null) {
            return P(i10);
        }
        n nVar = this.f14995e[i10];
        if (nVar == null) {
            G(i10, obj, cVar);
            return true;
        } else if (nVar.b() == obj) {
            return false;
        } else {
            P(i10);
            G(i10, obj, cVar);
            return true;
        }
    }

    public abstract void l();

    public final void m() {
        if (this.f14998h) {
            H();
        } else if (w()) {
            this.f14998h = true;
            this.f14994d = false;
            androidx.databinding.b<androidx.databinding.l, ViewDataBinding, Void> bVar = this.f14997g;
            if (bVar != null) {
                bVar.f(this, 1, null);
                if (this.f14994d) {
                    this.f14997g.f(this, 2, null);
                }
            }
            if (!this.f14994d) {
                l();
                androidx.databinding.b<androidx.databinding.l, ViewDataBinding, Void> bVar2 = this.f14997g;
                if (bVar2 != null) {
                    bVar2.f(this, 3, null);
                }
            }
            this.f14998h = false;
        }
    }

    public void o() {
        ViewDataBinding viewDataBinding = this.f15003m;
        if (viewDataBinding == null) {
            m();
        } else {
            viewDataBinding.o();
        }
    }

    public View u() {
        return this.f14996f;
    }

    public void v(int i10, Object obj, int i11) {
        if (this.f15006p || this.f15007q || !D(i10, obj, i11)) {
            return;
        }
        H();
    }

    public abstract boolean w();

    public abstract void y();

    public ViewDataBinding(Object obj, View view, int i10) {
        this(k(obj), view, i10);
    }
}
