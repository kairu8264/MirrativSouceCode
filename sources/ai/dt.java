package ai;

import java.util.Random;

/* loaded from: classes3.dex */
public final class dt {

    /* renamed from: f  reason: collision with root package name */
    public static final dt f3394f = new dt();

    /* renamed from: a  reason: collision with root package name */
    public final nj0 f3395a;

    /* renamed from: b  reason: collision with root package name */
    public final bt f3396b;

    /* renamed from: c  reason: collision with root package name */
    public final String f3397c;

    /* renamed from: d  reason: collision with root package name */
    public final zj0 f3398d;

    /* renamed from: e  reason: collision with root package name */
    public final Random f3399e;

    public dt() {
        nj0 nj0Var = new nj0();
        bt btVar = new bt(new zr(), new xr(), new ew(), new i20(), new fg0(), new nc0(), new j20());
        String f10 = nj0.f();
        zj0 zj0Var = new zj0(0, 213806000, true, false, false);
        Random random = new Random();
        this.f3395a = nj0Var;
        this.f3396b = btVar;
        this.f3397c = f10;
        this.f3398d = zj0Var;
        this.f3399e = random;
    }

    public static nj0 a() {
        return f3394f.f3395a;
    }

    public static bt b() {
        return f3394f.f3396b;
    }

    public static String c() {
        return f3394f.f3397c;
    }

    public static zj0 d() {
        return f3394f.f3398d;
    }

    public static Random e() {
        return f3394f.f3399e;
    }
}
