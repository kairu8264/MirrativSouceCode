package ai;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class px1 {

    /* renamed from: h  reason: collision with root package name */
    public static final SparseArray<eq> f8720h;

    /* renamed from: a  reason: collision with root package name */
    public final Context f8721a;

    /* renamed from: b  reason: collision with root package name */
    public final a41 f8722b;

    /* renamed from: c  reason: collision with root package name */
    public final TelephonyManager f8723c;

    /* renamed from: d  reason: collision with root package name */
    public final hx1 f8724d;

    /* renamed from: e  reason: collision with root package name */
    public final dx1 f8725e;

    /* renamed from: f  reason: collision with root package name */
    public final yg.r1 f8726f;

    /* renamed from: g  reason: collision with root package name */
    public int f8727g;

    static {
        SparseArray<eq> sparseArray = new SparseArray<>();
        f8720h = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), eq.CONNECTED);
        int ordinal = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        eq eqVar = eq.CONNECTING;
        sparseArray.put(ordinal, eqVar);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), eqVar);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), eqVar);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), eq.DISCONNECTING);
        int ordinal2 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        eq eqVar2 = eq.DISCONNECTED;
        sparseArray.put(ordinal2, eqVar2);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), eqVar2);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), eqVar2);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), eqVar2);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), eqVar2);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), eq.SUSPENDED);
        if (Build.VERSION.SDK_INT >= 17) {
            sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), eqVar);
        }
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), eqVar);
    }

    public px1(Context context, a41 a41Var, hx1 hx1Var, dx1 dx1Var, yg.r1 r1Var) {
        this.f8721a = context;
        this.f8722b = a41Var;
        this.f8724d = hx1Var;
        this.f8725e = dx1Var;
        this.f8723c = (TelephonyManager) context.getSystemService("phone");
        this.f8726f = r1Var;
    }

    public static /* synthetic */ vp c(px1 px1Var, Bundle bundle) {
        np D = vp.D();
        int i10 = bundle.getInt("cnt", -2);
        int i11 = bundle.getInt("gnt", 0);
        int i12 = 2;
        if (i10 == -1) {
            px1Var.f8727g = 2;
        } else {
            px1Var.f8727g = 1;
            if (i10 == 0) {
                D.r(2);
            } else if (i10 != 1) {
                D.r(1);
            } else {
                D.r(3);
            }
            switch (i11) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    i12 = 3;
                    break;
                case 13:
                    i12 = 5;
                    break;
                default:
                    i12 = 1;
                    break;
            }
            D.s(i12);
        }
        return D.n();
    }

    public static /* synthetic */ byte[] e(px1 px1Var, boolean z10, ArrayList arrayList, vp vpVar, eq eqVar) {
        zp M = aq.M();
        M.u(arrayList);
        M.A(g(wg.t.f().f(px1Var.f8721a.getContentResolver()) != 0));
        M.B(wg.t.f().p(px1Var.f8721a, px1Var.f8723c));
        M.s(px1Var.f8724d.d());
        M.t(px1Var.f8724d.h());
        M.w(px1Var.f8724d.b());
        M.x(eqVar);
        M.v(vpVar);
        M.C(px1Var.f8727g);
        M.y(g(z10));
        M.r(wg.t.k().currentTimeMillis());
        M.z(g(wg.t.f().e(px1Var.f8721a.getContentResolver()) != 0));
        return M.n().L();
    }

    public static final int g(boolean z10) {
        return z10 ? 2 : 1;
    }

    public final void f(boolean z10) {
        j43.p(this.f8722b.a(), new ox1(this, z10), hk0.f4883f);
    }
}
