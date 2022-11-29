package ai;

import android.os.RemoteException;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationServerParameters;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import wf.e;

/* loaded from: classes3.dex */
public final class ga0<NETWORK_EXTRAS extends wf.e, SERVER_PARAMETERS extends MediationServerParameters> implements wf.c, wf.d {

    /* renamed from: a  reason: collision with root package name */
    public final f90 f4370a;

    public ga0(f90 f90Var) {
        this.f4370a = f90Var;
    }

    @Override // wf.c
    public final void a(MediationBannerAdapter<?, ?> mediationBannerAdapter, vf.a aVar) {
        uj0.a("Adapter called onFailedToReceiveAd with error. ".concat(String.valueOf(aVar)));
        dt.a();
        if (!nj0.n()) {
            uj0.i("#008 Must be called on the main UI thread.", null);
            nj0.f7362b.post(new ea0(this, aVar));
            return;
        }
        try {
            this.f4370a.Y(ha0.a(aVar));
        } catch (RemoteException e10) {
            uj0.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // wf.d
    public final void b(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter, vf.a aVar) {
        String valueOf = String.valueOf(aVar);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 47);
        sb2.append("Adapter called onFailedToReceiveAd with error ");
        sb2.append(valueOf);
        sb2.append(TopicConstant.SEPARATOR);
        uj0.a(sb2.toString());
        dt.a();
        if (!nj0.n()) {
            uj0.i("#008 Must be called on the main UI thread.", null);
            nj0.f7362b.post(new fa0(this, aVar));
            return;
        }
        try {
            this.f4370a.Y(ha0.a(aVar));
        } catch (RemoteException e10) {
            uj0.i("#007 Could not call remote method.", e10);
        }
    }
}
