package ai;

import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class uq1 {

    /* renamed from: a  reason: collision with root package name */
    public final l40 f10794a;

    public uq1(l40 l40Var) {
        this.f10794a = l40Var;
    }

    public final void a() throws RemoteException {
        s(new sq1("initialize", null));
    }

    public final void b(long j10) throws RemoteException {
        sq1 sq1Var = new sq1("creation", null);
        sq1Var.f9907a = Long.valueOf(j10);
        sq1Var.f9909c = "nativeObjectCreated";
        s(sq1Var);
    }

    public final void c(long j10) throws RemoteException {
        sq1 sq1Var = new sq1("creation", null);
        sq1Var.f9907a = Long.valueOf(j10);
        sq1Var.f9909c = "nativeObjectNotCreated";
        s(sq1Var);
    }

    public final void d(long j10) throws RemoteException {
        sq1 sq1Var = new sq1("interstitial", null);
        sq1Var.f9907a = Long.valueOf(j10);
        sq1Var.f9909c = "onNativeAdObjectNotAvailable";
        s(sq1Var);
    }

    public final void e(long j10) throws RemoteException {
        sq1 sq1Var = new sq1("interstitial", null);
        sq1Var.f9907a = Long.valueOf(j10);
        sq1Var.f9909c = "onAdLoaded";
        s(sq1Var);
    }

    public final void f(long j10, int i10) throws RemoteException {
        sq1 sq1Var = new sq1("interstitial", null);
        sq1Var.f9907a = Long.valueOf(j10);
        sq1Var.f9909c = "onAdFailedToLoad";
        sq1Var.f9910d = Integer.valueOf(i10);
        s(sq1Var);
    }

    public final void g(long j10) throws RemoteException {
        sq1 sq1Var = new sq1("interstitial", null);
        sq1Var.f9907a = Long.valueOf(j10);
        sq1Var.f9909c = "onAdOpened";
        s(sq1Var);
    }

    public final void h(long j10) throws RemoteException {
        sq1 sq1Var = new sq1("interstitial", null);
        sq1Var.f9907a = Long.valueOf(j10);
        sq1Var.f9909c = "onAdClicked";
        this.f10794a.t(sq1.f(sq1Var));
    }

    public final void i(long j10) throws RemoteException {
        sq1 sq1Var = new sq1("interstitial", null);
        sq1Var.f9907a = Long.valueOf(j10);
        sq1Var.f9909c = "onAdClosed";
        s(sq1Var);
    }

    public final void j(long j10) throws RemoteException {
        sq1 sq1Var = new sq1("rewarded", null);
        sq1Var.f9907a = Long.valueOf(j10);
        sq1Var.f9909c = "onNativeAdObjectNotAvailable";
        s(sq1Var);
    }

    public final void k(long j10) throws RemoteException {
        sq1 sq1Var = new sq1("rewarded", null);
        sq1Var.f9907a = Long.valueOf(j10);
        sq1Var.f9909c = "onRewardedAdLoaded";
        s(sq1Var);
    }

    public final void l(long j10, int i10) throws RemoteException {
        sq1 sq1Var = new sq1("rewarded", null);
        sq1Var.f9907a = Long.valueOf(j10);
        sq1Var.f9909c = "onRewardedAdFailedToLoad";
        sq1Var.f9910d = Integer.valueOf(i10);
        s(sq1Var);
    }

    public final void m(long j10) throws RemoteException {
        sq1 sq1Var = new sq1("rewarded", null);
        sq1Var.f9907a = Long.valueOf(j10);
        sq1Var.f9909c = "onRewardedAdOpened";
        s(sq1Var);
    }

    public final void n(long j10, int i10) throws RemoteException {
        sq1 sq1Var = new sq1("rewarded", null);
        sq1Var.f9907a = Long.valueOf(j10);
        sq1Var.f9909c = "onRewardedAdFailedToShow";
        sq1Var.f9910d = Integer.valueOf(i10);
        s(sq1Var);
    }

    public final void o(long j10) throws RemoteException {
        sq1 sq1Var = new sq1("rewarded", null);
        sq1Var.f9907a = Long.valueOf(j10);
        sq1Var.f9909c = "onRewardedAdClosed";
        s(sq1Var);
    }

    public final void p(long j10, pf0 pf0Var) throws RemoteException {
        sq1 sq1Var = new sq1("rewarded", null);
        sq1Var.f9907a = Long.valueOf(j10);
        sq1Var.f9909c = "onUserEarnedReward";
        sq1Var.f9911e = pf0Var.c();
        sq1Var.f9912f = Integer.valueOf(pf0Var.a());
        s(sq1Var);
    }

    public final void q(long j10) throws RemoteException {
        sq1 sq1Var = new sq1("rewarded", null);
        sq1Var.f9907a = Long.valueOf(j10);
        sq1Var.f9909c = "onAdImpression";
        s(sq1Var);
    }

    public final void r(long j10) throws RemoteException {
        sq1 sq1Var = new sq1("rewarded", null);
        sq1Var.f9907a = Long.valueOf(j10);
        sq1Var.f9909c = "onAdClicked";
        s(sq1Var);
    }

    public final void s(sq1 sq1Var) throws RemoteException {
        String str;
        String f10 = sq1.f(sq1Var);
        if (f10.length() != 0) {
            str = "Dispatching AFMA event on publisher webview: ".concat(f10);
        } else {
            str = new String("Dispatching AFMA event on publisher webview: ");
        }
        uj0.e(str);
        this.f10794a.t(f10);
    }
}
