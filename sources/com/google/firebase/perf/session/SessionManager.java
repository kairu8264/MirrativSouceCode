package com.google.firebase.perf.session;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import hm.a;
import hm.b;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import tm.d;

@Keep
/* loaded from: classes4.dex */
public class SessionManager extends b {
    @SuppressLint({"StaticFieldLeak"})
    private static final SessionManager instance = new SessionManager();
    private final a appStateMonitor;
    private final Set<WeakReference<pm.b>> clients;
    private final GaugeManager gaugeManager;
    private pm.a perfSession;
    private Future syncInitFuture;

    private SessionManager() {
        this(GaugeManager.getInstance(), pm.a.c(), a.b());
    }

    public static SessionManager getInstance() {
        return instance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setApplicationContext$0(Context context, pm.a aVar) {
        this.gaugeManager.initializeGaugeMetadataManager(context);
        if (aVar.f()) {
            this.gaugeManager.logGaugeMetadata(aVar.h(), d.FOREGROUND);
        }
    }

    private void logGaugeMetadataIfCollectionEnabled(d dVar) {
        if (this.perfSession.f()) {
            this.gaugeManager.logGaugeMetadata(this.perfSession.h(), dVar);
        }
    }

    private void startOrStopCollectingGauges(d dVar) {
        if (this.perfSession.f()) {
            this.gaugeManager.startCollectingGauges(this.perfSession, dVar);
        } else {
            this.gaugeManager.stopCollectingGauges();
        }
    }

    public Future getSyncInitFuture() {
        return this.syncInitFuture;
    }

    public void initializeGaugeCollection() {
        d dVar = d.FOREGROUND;
        logGaugeMetadataIfCollectionEnabled(dVar);
        startOrStopCollectingGauges(dVar);
    }

    @Override // hm.b, hm.a.b
    public void onUpdateAppState(d dVar) {
        super.onUpdateAppState(dVar);
        if (this.appStateMonitor.g()) {
            return;
        }
        if (dVar == d.FOREGROUND) {
            updatePerfSession(dVar);
        } else if (updatePerfSessionIfExpired()) {
        } else {
            startOrStopCollectingGauges(dVar);
        }
    }

    public final pm.a perfSession() {
        return this.perfSession;
    }

    public void registerForSessionUpdates(WeakReference<pm.b> weakReference) {
        synchronized (this.clients) {
            this.clients.add(weakReference);
        }
    }

    public void setApplicationContext(final Context context) {
        final pm.a aVar = this.perfSession;
        this.syncInitFuture = Executors.newSingleThreadExecutor().submit(new Runnable() { // from class: pm.c
            @Override // java.lang.Runnable
            public final void run() {
                SessionManager.this.lambda$setApplicationContext$0(context, aVar);
            }
        });
    }

    public void setPerfSession(pm.a aVar) {
        this.perfSession = aVar;
    }

    public void unregisterForSessionUpdates(WeakReference<pm.b> weakReference) {
        synchronized (this.clients) {
            this.clients.remove(weakReference);
        }
    }

    public void updatePerfSession(d dVar) {
        synchronized (this.clients) {
            this.perfSession = pm.a.c();
            Iterator<WeakReference<pm.b>> it = this.clients.iterator();
            while (it.hasNext()) {
                pm.b bVar = it.next().get();
                if (bVar != null) {
                    bVar.a(this.perfSession);
                } else {
                    it.remove();
                }
            }
        }
        logGaugeMetadataIfCollectionEnabled(dVar);
        startOrStopCollectingGauges(dVar);
    }

    public boolean updatePerfSessionIfExpired() {
        if (this.perfSession.e()) {
            updatePerfSession(this.appStateMonitor.a());
            return true;
        }
        return false;
    }

    public SessionManager(GaugeManager gaugeManager, pm.a aVar, a aVar2) {
        this.clients = new HashSet();
        this.gaugeManager = gaugeManager;
        this.perfSession = aVar;
        this.appStateMonitor = aVar2;
        registerForAppState();
    }
}
