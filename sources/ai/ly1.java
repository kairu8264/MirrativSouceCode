package ai;

import android.app.AlertDialog;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes3.dex */
public final class ly1 extends TimerTask {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ AlertDialog f6725w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Timer f6726x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ xg.n f6727y;

    public ly1(AlertDialog alertDialog, Timer timer, xg.n nVar) {
        this.f6725w = alertDialog;
        this.f6726x = timer;
        this.f6727y = nVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.f6725w.dismiss();
        this.f6726x.cancel();
        xg.n nVar = this.f6727y;
        if (nVar != null) {
            nVar.zzb();
        }
    }
}
