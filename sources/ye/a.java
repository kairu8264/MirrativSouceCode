package ye;

import androidx.lifecycle.e0;
import com.dena.mirrorman.unity.UnityReceiverKt;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final C1059a f61810b = new C1059a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f61811c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final e0<String> f61812a;

    /* renamed from: ye.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C1059a {
        public C1059a() {
        }

        public /* synthetic */ C1059a(jo.h hVar) {
            this();
        }
    }

    public a(String str) {
        e0<String> e0Var = new e0<>("stopped");
        this.f61812a = e0Var;
        e0Var.p(str);
    }

    public final synchronized e0<String> a() {
        return this.f61812a;
    }

    public final synchronized String b() {
        return this.f61812a.f();
    }

    public final synchronized boolean c() {
        return !so.n.q(this.f61812a.f(), "stopped", true);
    }

    public final synchronized boolean d() {
        boolean z10;
        z10 = true;
        if (!so.n.q(this.f61812a.f(), "braodcasting", true)) {
            if (!so.n.q(this.f61812a.f(), UnityReceiverKt.EMOMO, true)) {
                z10 = false;
            }
        }
        return z10;
    }

    public final synchronized boolean e() {
        return so.n.q(this.f61812a.f(), UnityReceiverKt.EMOMO, true);
    }

    public final synchronized boolean f() {
        return so.n.q(this.f61812a.f(), "preparing", true);
    }

    public final synchronized boolean g() {
        return so.n.q(this.f61812a.f(), "requesting_livestart", true);
    }

    public final synchronized boolean h() {
        return so.n.q(this.f61812a.f(), "stopped", true);
    }

    public final synchronized void i(String str) {
        this.f61812a.p(str);
    }
}
