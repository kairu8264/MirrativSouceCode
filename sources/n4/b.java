package n4;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.lifecycle.e0;
import androidx.lifecycle.f0;
import androidx.lifecycle.q0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u;
import androidx.lifecycle.u0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import n4.a;
import o4.b;
import s.h;

/* loaded from: classes.dex */
public class b extends n4.a {

    /* renamed from: c  reason: collision with root package name */
    public static boolean f41566c = false;

    /* renamed from: a  reason: collision with root package name */
    public final u f41567a;

    /* renamed from: b  reason: collision with root package name */
    public final c f41568b;

    /* loaded from: classes.dex */
    public static class a<D> extends e0<D> implements b.InterfaceC0654b<D> {

        /* renamed from: l  reason: collision with root package name */
        public final int f41569l;

        /* renamed from: m  reason: collision with root package name */
        public final Bundle f41570m;

        /* renamed from: n  reason: collision with root package name */
        public final o4.b<D> f41571n;

        /* renamed from: o  reason: collision with root package name */
        public u f41572o;

        /* renamed from: p  reason: collision with root package name */
        public C0615b<D> f41573p;

        /* renamed from: q  reason: collision with root package name */
        public o4.b<D> f41574q;

        public a(int i10, Bundle bundle, o4.b<D> bVar, o4.b<D> bVar2) {
            this.f41569l = i10;
            this.f41570m = bundle;
            this.f41571n = bVar;
            this.f41574q = bVar2;
            bVar.r(i10, this);
        }

        @Override // o4.b.InterfaceC0654b
        public void a(o4.b<D> bVar, D d10) {
            if (b.f41566c) {
                Log.v("LoaderManager", "onLoadComplete: " + this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                p(d10);
                return;
            }
            if (b.f41566c) {
                Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            m(d10);
        }

        @Override // androidx.lifecycle.LiveData
        public void k() {
            if (b.f41566c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.f41571n.u();
        }

        @Override // androidx.lifecycle.LiveData
        public void l() {
            if (b.f41566c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.f41571n.v();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public void n(f0<? super D> f0Var) {
            super.n(f0Var);
            this.f41572o = null;
            this.f41573p = null;
        }

        @Override // androidx.lifecycle.e0, androidx.lifecycle.LiveData
        public void p(D d10) {
            super.p(d10);
            o4.b<D> bVar = this.f41574q;
            if (bVar != null) {
                bVar.s();
                this.f41574q = null;
            }
        }

        public o4.b<D> q(boolean z10) {
            if (b.f41566c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.f41571n.b();
            this.f41571n.a();
            C0615b<D> c0615b = this.f41573p;
            if (c0615b != null) {
                n(c0615b);
                if (z10) {
                    c0615b.c();
                }
            }
            this.f41571n.w(this);
            if ((c0615b != null && !c0615b.b()) || z10) {
                this.f41571n.s();
                return this.f41574q;
            }
            return this.f41571n;
        }

        public void r(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f41569l);
            printWriter.print(" mArgs=");
            printWriter.println(this.f41570m);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f41571n);
            o4.b<D> bVar = this.f41571n;
            bVar.g(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.f41573p != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f41573p);
                C0615b<D> c0615b = this.f41573p;
                c0615b.a(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(s().d(f()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(h());
        }

        public o4.b<D> s() {
            return this.f41571n;
        }

        public void t() {
            u uVar = this.f41572o;
            C0615b<D> c0615b = this.f41573p;
            if (uVar == null || c0615b == null) {
                return;
            }
            super.n(c0615b);
            i(uVar, c0615b);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append("LoaderInfo{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" #");
            sb2.append(this.f41569l);
            sb2.append(" : ");
            n3.b.a(this.f41571n, sb2);
            sb2.append("}}");
            return sb2.toString();
        }

        public o4.b<D> u(u uVar, a.InterfaceC0614a<D> interfaceC0614a) {
            C0615b<D> c0615b = new C0615b<>(this.f41571n, interfaceC0614a);
            i(uVar, c0615b);
            C0615b<D> c0615b2 = this.f41573p;
            if (c0615b2 != null) {
                n(c0615b2);
            }
            this.f41572o = uVar;
            this.f41573p = c0615b;
            return this.f41571n;
        }
    }

    /* renamed from: n4.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0615b<D> implements f0<D> {

        /* renamed from: a  reason: collision with root package name */
        public final o4.b<D> f41575a;

        /* renamed from: b  reason: collision with root package name */
        public final a.InterfaceC0614a<D> f41576b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f41577c = false;

        public C0615b(o4.b<D> bVar, a.InterfaceC0614a<D> interfaceC0614a) {
            this.f41575a = bVar;
            this.f41576b = interfaceC0614a;
        }

        public void a(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f41577c);
        }

        public boolean b() {
            return this.f41577c;
        }

        public void c() {
            if (this.f41577c) {
                if (b.f41566c) {
                    Log.v("LoaderManager", "  Resetting: " + this.f41575a);
                }
                this.f41576b.t2(this.f41575a);
            }
        }

        @Override // androidx.lifecycle.f0
        public void d(D d10) {
            if (b.f41566c) {
                Log.v("LoaderManager", "  onLoadFinished in " + this.f41575a + ": " + this.f41575a.d(d10));
            }
            this.f41576b.i0(this.f41575a, d10);
            this.f41577c = true;
        }

        public String toString() {
            return this.f41576b.toString();
        }
    }

    /* loaded from: classes.dex */
    public static class c extends q0 {
        public static final t0.b A = new a();

        /* renamed from: y  reason: collision with root package name */
        public h<a> f41578y = new h<>();

        /* renamed from: z  reason: collision with root package name */
        public boolean f41579z = false;

        /* loaded from: classes.dex */
        public static class a implements t0.b {
            @Override // androidx.lifecycle.t0.b
            public <T extends q0> T a(Class<T> cls) {
                return new c();
            }
        }

        public static c h(u0 u0Var) {
            return (c) new t0(u0Var, A).a(c.class);
        }

        @Override // androidx.lifecycle.q0
        public void d() {
            super.d();
            int r10 = this.f41578y.r();
            for (int i10 = 0; i10 < r10; i10++) {
                this.f41578y.s(i10).q(true);
            }
            this.f41578y.c();
        }

        public void f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f41578y.r() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i10 = 0; i10 < this.f41578y.r(); i10++) {
                    a s10 = this.f41578y.s(i10);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f41578y.m(i10));
                    printWriter.print(": ");
                    printWriter.println(s10.toString());
                    s10.r(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        public void g() {
            this.f41579z = false;
        }

        public <D> a<D> i(int i10) {
            return this.f41578y.h(i10);
        }

        public boolean j() {
            return this.f41579z;
        }

        public void k() {
            int r10 = this.f41578y.r();
            for (int i10 = 0; i10 < r10; i10++) {
                this.f41578y.s(i10).t();
            }
        }

        public void l(int i10, a aVar) {
            this.f41578y.n(i10, aVar);
        }

        public void m(int i10) {
            this.f41578y.o(i10);
        }

        public void n() {
            this.f41579z = true;
        }
    }

    public b(u uVar, u0 u0Var) {
        this.f41567a = uVar;
        this.f41568b = c.h(u0Var);
    }

    @Override // n4.a
    public void a(int i10) {
        if (!this.f41568b.j()) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                if (f41566c) {
                    Log.v("LoaderManager", "destroyLoader in " + this + " of " + i10);
                }
                a i11 = this.f41568b.i(i10);
                if (i11 != null) {
                    i11.q(true);
                    this.f41568b.m(i10);
                    return;
                }
                return;
            }
            throw new IllegalStateException("destroyLoader must be called on the main thread");
        }
        throw new IllegalStateException("Called while creating a loader");
    }

    @Override // n4.a
    @Deprecated
    public void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f41568b.f(str, fileDescriptor, printWriter, strArr);
    }

    @Override // n4.a
    public <D> o4.b<D> d(int i10, Bundle bundle, a.InterfaceC0614a<D> interfaceC0614a) {
        if (!this.f41568b.j()) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                a<D> i11 = this.f41568b.i(i10);
                if (f41566c) {
                    Log.v("LoaderManager", "initLoader in " + this + ": args=" + bundle);
                }
                if (i11 == null) {
                    return f(i10, bundle, interfaceC0614a, null);
                }
                if (f41566c) {
                    Log.v("LoaderManager", "  Re-using existing loader " + i11);
                }
                return i11.u(this.f41567a, interfaceC0614a);
            }
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        throw new IllegalStateException("Called while creating a loader");
    }

    @Override // n4.a
    public void e() {
        this.f41568b.k();
    }

    public final <D> o4.b<D> f(int i10, Bundle bundle, a.InterfaceC0614a<D> interfaceC0614a, o4.b<D> bVar) {
        try {
            this.f41568b.n();
            o4.b<D> G1 = interfaceC0614a.G1(i10, bundle);
            if (G1 != null) {
                if (G1.getClass().isMemberClass() && !Modifier.isStatic(G1.getClass().getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + G1);
                }
                a aVar = new a(i10, bundle, G1, bVar);
                if (f41566c) {
                    Log.v("LoaderManager", "  Created new loader " + aVar);
                }
                this.f41568b.l(i10, aVar);
                this.f41568b.g();
                return aVar.u(this.f41567a, interfaceC0614a);
            }
            throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
        } catch (Throwable th2) {
            this.f41568b.g();
            throw th2;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        n3.b.a(this.f41567a, sb2);
        sb2.append("}}");
        return sb2.toString();
    }
}
