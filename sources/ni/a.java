package ni;

import android.os.Bundle;
import java.util.List;
import java.util.Map;
import pi.b5;
import pi.i7;
import rh.p;

/* loaded from: classes3.dex */
public final class a extends d {

    /* renamed from: a  reason: collision with root package name */
    public final b5 f43578a;

    /* renamed from: b  reason: collision with root package name */
    public final i7 f43579b;

    public a(b5 b5Var) {
        super(null);
        p.i(b5Var);
        this.f43578a = b5Var;
        this.f43579b = b5Var.I();
    }

    @Override // pi.j7
    public final void a(String str, String str2, Bundle bundle) {
        this.f43579b.p(str, str2, bundle);
    }

    @Override // pi.j7
    public final void b(String str) {
        this.f43578a.x().j(str, this.f43578a.c().elapsedRealtime());
    }

    @Override // pi.j7
    public final void c(String str) {
        this.f43578a.x().k(str, this.f43578a.c().elapsedRealtime());
    }

    @Override // pi.j7
    public final List<Bundle> d(String str, String str2) {
        return this.f43579b.b0(str, str2);
    }

    @Override // pi.j7
    public final String e() {
        return this.f43579b.X();
    }

    @Override // pi.j7
    public final Map<String, Object> f(String str, String str2, boolean z10) {
        return this.f43579b.c0(str, str2, z10);
    }

    @Override // pi.j7
    public final String g() {
        return this.f43579b.Z();
    }

    @Override // pi.j7
    public final String h() {
        return this.f43579b.Y();
    }

    @Override // pi.j7
    public final String i() {
        return this.f43579b.X();
    }

    @Override // pi.j7
    public final void j(Bundle bundle) {
        this.f43579b.C(bundle);
    }

    @Override // pi.j7
    public final void k(String str, String str2, Bundle bundle) {
        this.f43578a.I().h0(str, str2, bundle);
    }

    @Override // pi.j7
    public final int v(String str) {
        this.f43579b.S(str);
        return 25;
    }

    @Override // pi.j7
    public final long zzb() {
        return this.f43578a.N().r0();
    }
}
