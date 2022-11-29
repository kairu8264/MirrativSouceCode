package hm;

import hm.a;
import java.lang.ref.WeakReference;
import tm.d;

/* loaded from: classes4.dex */
public abstract class b implements a.b {
    private final WeakReference<a.b> appStateCallback;
    private final a appStateMonitor;
    private d currentAppState;
    private boolean isRegisteredForAppState;

    public b() {
        this(a.b());
    }

    public d getAppState() {
        return this.currentAppState;
    }

    public void incrementTsnsCount(int i10) {
        this.appStateMonitor.f(i10);
    }

    @Override // hm.a.b
    public void onUpdateAppState(d dVar) {
        d dVar2 = this.currentAppState;
        d dVar3 = d.APPLICATION_PROCESS_STATE_UNKNOWN;
        if (dVar2 == dVar3) {
            this.currentAppState = dVar;
        } else if (dVar2 == dVar || dVar == dVar3) {
        } else {
            this.currentAppState = d.FOREGROUND_BACKGROUND;
        }
    }

    public void registerForAppState() {
        if (this.isRegisteredForAppState) {
            return;
        }
        this.currentAppState = this.appStateMonitor.a();
        this.appStateMonitor.k(this.appStateCallback);
        this.isRegisteredForAppState = true;
    }

    public void unregisterForAppState() {
        if (this.isRegisteredForAppState) {
            this.appStateMonitor.o(this.appStateCallback);
            this.isRegisteredForAppState = false;
        }
    }

    public b(a aVar) {
        this.isRegisteredForAppState = false;
        this.currentAppState = d.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.appStateMonitor = aVar;
        this.appStateCallback = new WeakReference<>(this);
    }
}
