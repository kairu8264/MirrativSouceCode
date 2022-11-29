package oi;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import hi.x2;
import java.util.List;
import java.util.Map;
import pi.d6;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public final x2 f45431a;

    /* renamed from: oi.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0684a extends d6 {
    }

    public a(x2 x2Var) {
        this.f45431a = x2Var;
    }

    public static a k(Context context, String str, String str2, String str3, Bundle bundle) {
        return x2.u(context, str, str2, str3, bundle).r();
    }

    public void a(String str) {
        this.f45431a.G(str);
    }

    public void b(String str, String str2, Bundle bundle) {
        this.f45431a.H(str, str2, bundle);
    }

    public void c(String str) {
        this.f45431a.I(str);
    }

    public long d() {
        return this.f45431a.p();
    }

    public String e() {
        return this.f45431a.w();
    }

    public String f() {
        return this.f45431a.x();
    }

    public List<Bundle> g(String str, String str2) {
        return this.f45431a.B(str, str2);
    }

    public String h() {
        return this.f45431a.y();
    }

    public String i() {
        return this.f45431a.z();
    }

    public String j() {
        return this.f45431a.A();
    }

    public int l(String str) {
        return this.f45431a.o(str);
    }

    public Map<String, Object> m(String str, String str2, boolean z10) {
        return this.f45431a.C(str, str2, z10);
    }

    public void n(String str, String str2, Bundle bundle) {
        this.f45431a.K(str, str2, bundle);
    }

    public void o(Bundle bundle) {
        this.f45431a.q(bundle, false);
    }

    public Bundle p(Bundle bundle) {
        return this.f45431a.q(bundle, true);
    }

    public void q(InterfaceC0684a interfaceC0684a) {
        this.f45431a.b(interfaceC0684a);
    }

    public void r(Bundle bundle) {
        this.f45431a.c(bundle);
    }

    public void s(Bundle bundle) {
        this.f45431a.d(bundle);
    }

    public void t(Activity activity, String str, String str2) {
        this.f45431a.e(activity, str, str2);
    }

    public void u(String str, String str2, Object obj) {
        this.f45431a.g(str, str2, obj, true);
    }

    public final void v(boolean z10) {
        this.f45431a.f(z10);
    }
}
