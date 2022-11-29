package ai;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;

/* loaded from: classes3.dex */
public final class aa0 implements ah.i, ah.n, ah.p {

    /* renamed from: a  reason: collision with root package name */
    public final f90 f1798a;

    /* renamed from: b  reason: collision with root package name */
    public ah.v f1799b;

    /* renamed from: c  reason: collision with root package name */
    public tg.f f1800c;

    public aa0(f90 f90Var) {
        this.f1798a = f90Var;
    }

    @Override // ah.p
    public final void a(MediationNativeAdapter mediationNativeAdapter) {
        rh.p.d("#008 Must be called on the main UI thread.");
        uj0.a("Adapter called onAdOpened.");
        try {
            this.f1798a.h();
        } catch (RemoteException e10) {
            uj0.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // ah.n
    public final void b(MediationInterstitialAdapter mediationInterstitialAdapter, int i10) {
        rh.p.d("#008 Must be called on the main UI thread.");
        StringBuilder sb2 = new StringBuilder(55);
        sb2.append("Adapter called onAdFailedToLoad with error ");
        sb2.append(i10);
        sb2.append(TopicConstant.SEPARATOR);
        uj0.a(sb2.toString());
        try {
            this.f1798a.Y(i10);
        } catch (RemoteException e10) {
            uj0.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // ah.i
    public final void c(MediationBannerAdapter mediationBannerAdapter) {
        rh.p.d("#008 Must be called on the main UI thread.");
        uj0.a("Adapter called onAdClicked.");
        try {
            this.f1798a.c();
        } catch (RemoteException e10) {
            uj0.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // ah.i
    public final void d(MediationBannerAdapter mediationBannerAdapter, rg.a aVar) {
        rh.p.d("#008 Must be called on the main UI thread.");
        int a10 = aVar.a();
        String c10 = aVar.c();
        String b10 = aVar.b();
        StringBuilder sb2 = new StringBuilder(String.valueOf(c10).length() + 97 + String.valueOf(b10).length());
        sb2.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb2.append(a10);
        sb2.append(". ErrorMessage: ");
        sb2.append(c10);
        sb2.append(". ErrorDomain: ");
        sb2.append(b10);
        uj0.a(sb2.toString());
        try {
            this.f1798a.c4(aVar.d());
        } catch (RemoteException e10) {
            uj0.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // ah.p
    public final void e(MediationNativeAdapter mediationNativeAdapter, tg.f fVar, String str) {
        if (fVar instanceof e10) {
            try {
                this.f1798a.K4(((e10) fVar).b(), str);
                return;
            } catch (RemoteException e10) {
                uj0.i("#007 Could not call remote method.", e10);
                return;
            }
        }
        uj0.f("Unexpected native custom template ad type.");
    }

    @Override // ah.p
    public final void f(MediationNativeAdapter mediationNativeAdapter) {
        rh.p.d("#008 Must be called on the main UI thread.");
        uj0.a("Adapter called onAdClosed.");
        try {
            this.f1798a.a();
        } catch (RemoteException e10) {
            uj0.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // ah.p
    public final void g(MediationNativeAdapter mediationNativeAdapter, rg.a aVar) {
        rh.p.d("#008 Must be called on the main UI thread.");
        int a10 = aVar.a();
        String c10 = aVar.c();
        String b10 = aVar.b();
        StringBuilder sb2 = new StringBuilder(String.valueOf(c10).length() + 97 + String.valueOf(b10).length());
        sb2.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb2.append(a10);
        sb2.append(". ErrorMessage: ");
        sb2.append(c10);
        sb2.append(". ErrorDomain: ");
        sb2.append(b10);
        uj0.a(sb2.toString());
        try {
            this.f1798a.c4(aVar.d());
        } catch (RemoteException e10) {
            uj0.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // ah.i
    public final void h(MediationBannerAdapter mediationBannerAdapter) {
        rh.p.d("#008 Must be called on the main UI thread.");
        uj0.a("Adapter called onAdLoaded.");
        try {
            this.f1798a.g();
        } catch (RemoteException e10) {
            uj0.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // ah.p
    public final void i(MediationNativeAdapter mediationNativeAdapter, tg.f fVar) {
        rh.p.d("#008 Must be called on the main UI thread.");
        String valueOf = String.valueOf(fVar.a());
        uj0.a(valueOf.length() != 0 ? "Adapter called onAdLoaded with template id ".concat(valueOf) : new String("Adapter called onAdLoaded with template id "));
        this.f1800c = fVar;
        try {
            this.f1798a.g();
        } catch (RemoteException e10) {
            uj0.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // ah.i
    public final void j(MediationBannerAdapter mediationBannerAdapter) {
        rh.p.d("#008 Must be called on the main UI thread.");
        uj0.a("Adapter called onAdOpened.");
        try {
            this.f1798a.h();
        } catch (RemoteException e10) {
            uj0.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // ah.p
    public final void k(MediationNativeAdapter mediationNativeAdapter) {
        rh.p.d("#008 Must be called on the main UI thread.");
        ah.v vVar = this.f1799b;
        if (this.f1800c == null) {
            if (vVar == null) {
                uj0.i("#007 Could not call remote method.", null);
                return;
            } else if (!vVar.m()) {
                uj0.a("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
        }
        uj0.a("Adapter called onAdImpression.");
        try {
            this.f1798a.i();
        } catch (RemoteException e10) {
            uj0.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // ah.n
    public final void l(MediationInterstitialAdapter mediationInterstitialAdapter, rg.a aVar) {
        rh.p.d("#008 Must be called on the main UI thread.");
        int a10 = aVar.a();
        String c10 = aVar.c();
        String b10 = aVar.b();
        StringBuilder sb2 = new StringBuilder(String.valueOf(c10).length() + 97 + String.valueOf(b10).length());
        sb2.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb2.append(a10);
        sb2.append(". ErrorMessage: ");
        sb2.append(c10);
        sb2.append(". ErrorDomain: ");
        sb2.append(b10);
        uj0.a(sb2.toString());
        try {
            this.f1798a.c4(aVar.d());
        } catch (RemoteException e10) {
            uj0.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // ah.i
    public final void m(MediationBannerAdapter mediationBannerAdapter) {
        rh.p.d("#008 Must be called on the main UI thread.");
        uj0.a("Adapter called onAdClosed.");
        try {
            this.f1798a.a();
        } catch (RemoteException e10) {
            uj0.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // ah.p
    public final void n(MediationNativeAdapter mediationNativeAdapter, ah.v vVar) {
        rh.p.d("#008 Must be called on the main UI thread.");
        uj0.a("Adapter called onAdLoaded.");
        this.f1799b = vVar;
        if (!(mediationNativeAdapter instanceof AdMobAdapter)) {
            rg.u uVar = new rg.u();
            uVar.b(new p90());
            if (vVar != null && vVar.r()) {
                vVar.G(uVar);
            }
        }
        try {
            this.f1798a.g();
        } catch (RemoteException e10) {
            uj0.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // ah.p
    public final void o(MediationNativeAdapter mediationNativeAdapter) {
        rh.p.d("#008 Must be called on the main UI thread.");
        ah.v vVar = this.f1799b;
        if (this.f1800c == null) {
            if (vVar == null) {
                uj0.i("#007 Could not call remote method.", null);
                return;
            } else if (!vVar.l()) {
                uj0.a("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
        }
        uj0.a("Adapter called onAdClicked.");
        try {
            this.f1798a.c();
        } catch (RemoteException e10) {
            uj0.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // ah.i
    public final void p(MediationBannerAdapter mediationBannerAdapter, String str, String str2) {
        rh.p.d("#008 Must be called on the main UI thread.");
        uj0.a("Adapter called onAppEvent.");
        try {
            this.f1798a.O2(str, str2);
        } catch (RemoteException e10) {
            uj0.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // ah.n
    public final void q(MediationInterstitialAdapter mediationInterstitialAdapter) {
        rh.p.d("#008 Must be called on the main UI thread.");
        uj0.a("Adapter called onAdLoaded.");
        try {
            this.f1798a.g();
        } catch (RemoteException e10) {
            uj0.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // ah.n
    public final void r(MediationInterstitialAdapter mediationInterstitialAdapter) {
        rh.p.d("#008 Must be called on the main UI thread.");
        uj0.a("Adapter called onAdClosed.");
        try {
            this.f1798a.a();
        } catch (RemoteException e10) {
            uj0.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // ah.n
    public final void s(MediationInterstitialAdapter mediationInterstitialAdapter) {
        rh.p.d("#008 Must be called on the main UI thread.");
        uj0.a("Adapter called onAdOpened.");
        try {
            this.f1798a.h();
        } catch (RemoteException e10) {
            uj0.i("#007 Could not call remote method.", e10);
        }
    }

    public final ah.v t() {
        return this.f1799b;
    }

    public final tg.f u() {
        return this.f1800c;
    }
}
