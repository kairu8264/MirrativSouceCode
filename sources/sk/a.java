package sk;

import android.os.Bundle;
import hi.x2;
import java.util.List;
import java.util.Map;
import pi.j7;

/* loaded from: classes.dex */
public final class a implements j7 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x2 f52729a;

    public a(x2 x2Var) {
        this.f52729a = x2Var;
    }

    @Override // pi.j7
    public final void a(String str, String str2, Bundle bundle) {
        this.f52729a.K(str, str2, bundle);
    }

    @Override // pi.j7
    public final void b(String str) {
        this.f52729a.G(str);
    }

    @Override // pi.j7
    public final void c(String str) {
        this.f52729a.I(str);
    }

    @Override // pi.j7
    public final List<Bundle> d(String str, String str2) {
        return this.f52729a.B(str, str2);
    }

    @Override // pi.j7
    public final String e() {
        return this.f52729a.x();
    }

    @Override // pi.j7
    public final Map<String, Object> f(String str, String str2, boolean z10) {
        return this.f52729a.C(str, str2, z10);
    }

    @Override // pi.j7
    public final String g() {
        return this.f52729a.z();
    }

    @Override // pi.j7
    public final String h() {
        return this.f52729a.y();
    }

    @Override // pi.j7
    public final String i() {
        return this.f52729a.A();
    }

    @Override // pi.j7
    public final void j(Bundle bundle) {
        this.f52729a.c(bundle);
    }

    @Override // pi.j7
    public final void k(String str, String str2, Bundle bundle) {
        this.f52729a.H(str, str2, bundle);
    }

    @Override // pi.j7
    public final int v(String str) {
        return this.f52729a.o(str);
    }

    @Override // pi.j7
    public final long zzb() {
        return this.f52729a.p();
    }
}
