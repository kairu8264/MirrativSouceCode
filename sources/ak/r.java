package ak;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.assetpacks.AssetPackException;
import java.util.List;

/* loaded from: classes3.dex */
public class r<T> extends dk.m0 {

    /* renamed from: w  reason: collision with root package name */
    public final jk.o<T> f13609w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ c0 f13610x;

    public r(c0 c0Var, jk.o<T> oVar) {
        this.f13610x = c0Var;
        this.f13609w = oVar;
    }

    @Override // dk.n0
    public final void A0(int i10, Bundle bundle) {
        dk.r rVar;
        dk.f fVar;
        rVar = this.f13610x.f13323d;
        rVar.s(this.f13609w);
        fVar = c0.f13318g;
        fVar.d("onCancelDownload(%d)", Integer.valueOf(i10));
    }

    @Override // dk.n0
    public final void A1(Bundle bundle, Bundle bundle2) {
        dk.r rVar;
        dk.f fVar;
        rVar = this.f13610x.f13323d;
        rVar.s(this.f13609w);
        fVar = c0.f13318g;
        fVar.d("onRemoveModule()", new Object[0]);
    }

    @Override // dk.n0
    public final void E0(Bundle bundle) {
        dk.r rVar;
        dk.f fVar;
        rVar = this.f13610x.f13323d;
        rVar.s(this.f13609w);
        fVar = c0.f13318g;
        fVar.d("onCancelDownloads()", new Object[0]);
    }

    public void O1(Bundle bundle, Bundle bundle2) {
        dk.r rVar;
        dk.f fVar;
        rVar = this.f13610x.f13323d;
        rVar.s(this.f13609w);
        fVar = c0.f13318g;
        fVar.d("onRequestDownloadInfo()", new Object[0]);
    }

    @Override // dk.n0
    public void P0(List<Bundle> list) {
        dk.r rVar;
        dk.f fVar;
        rVar = this.f13610x.f13323d;
        rVar.s(this.f13609w);
        fVar = c0.f13318g;
        fVar.d("onGetSessionStates", new Object[0]);
    }

    @Override // dk.n0
    public void S2(Bundle bundle, Bundle bundle2) {
        dk.r rVar;
        dk.f fVar;
        rVar = this.f13610x.f13323d;
        rVar.s(this.f13609w);
        fVar = c0.f13318g;
        fVar.d("onKeepAlive(%b)", Boolean.valueOf(bundle.getBoolean("keep_alive")));
    }

    @Override // dk.n0
    public void g0(Bundle bundle) {
        dk.r rVar;
        dk.f fVar;
        rVar = this.f13610x.f13323d;
        rVar.s(this.f13609w);
        int i10 = bundle.getInt("error_code");
        fVar = c0.f13318g;
        fVar.b("onError(%d)", Integer.valueOf(i10));
        this.f13609w.d(new AssetPackException(i10));
    }

    @Override // dk.n0
    public final void h2(Bundle bundle, Bundle bundle2) {
        dk.r rVar;
        dk.f fVar;
        rVar = this.f13610x.f13323d;
        rVar.s(this.f13609w);
        fVar = c0.f13318g;
        fVar.d("onNotifyModuleCompleted(%s, sessionId=%d)", bundle.getString("module_name"), Integer.valueOf(bundle.getInt("session_id")));
    }

    @Override // dk.n0
    public final void j3(int i10, Bundle bundle) {
        dk.r rVar;
        dk.f fVar;
        rVar = this.f13610x.f13323d;
        rVar.s(this.f13609w);
        fVar = c0.f13318g;
        fVar.d("onGetSession(%d)", Integer.valueOf(i10));
    }

    @Override // dk.n0
    public final void r3(Bundle bundle, Bundle bundle2) {
        dk.r rVar;
        dk.f fVar;
        rVar = this.f13610x.f13323d;
        rVar.s(this.f13609w);
        fVar = c0.f13318g;
        fVar.d("onNotifyChunkTransferred(%s, %s, %d, session=%d)", bundle.getString("module_name"), bundle.getString("slice_id"), Integer.valueOf(bundle.getInt("chunk_number")), Integer.valueOf(bundle.getInt("session_id")));
    }

    @Override // dk.n0
    public void w3(Bundle bundle, Bundle bundle2) throws RemoteException {
        dk.r rVar;
        dk.f fVar;
        rVar = this.f13610x.f13323d;
        rVar.s(this.f13609w);
        fVar = c0.f13318g;
        fVar.d("onGetChunkFileDescriptor", new Object[0]);
    }

    @Override // dk.n0
    public final void x2(Bundle bundle, Bundle bundle2) {
        dk.r rVar;
        dk.f fVar;
        rVar = this.f13610x.f13323d;
        rVar.s(this.f13609w);
        fVar = c0.f13318g;
        fVar.d("onNotifySessionFailed(%d)", Integer.valueOf(bundle.getInt("session_id")));
    }

    public void y5(int i10, Bundle bundle) {
        dk.r rVar;
        dk.f fVar;
        rVar = this.f13610x.f13323d;
        rVar.s(this.f13609w);
        fVar = c0.f13318g;
        fVar.d("onStartDownload(%d)", Integer.valueOf(i10));
    }
}
