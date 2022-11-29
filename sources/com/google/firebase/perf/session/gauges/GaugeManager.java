package com.google.firebase.perf.session.gauges;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import qm.c;
import qm.f;
import qm.g;
import qm.h;
import qm.i;
import qm.l;
import rm.k;
import tm.d;
import tm.g;
import vk.t;

@Keep
/* loaded from: classes4.dex */
public class GaugeManager {
    private static final long APPROX_NUMBER_OF_DATA_POINTS_PER_GAUGE_METRIC = 20;
    private static final long INVALID_GAUGE_COLLECTION_FREQUENCY = -1;
    private static final long TIME_TO_WAIT_BEFORE_FLUSHING_GAUGES_QUEUE_MS = 20;
    private d applicationProcessState;
    private final im.a configResolver;
    private final t<c> cpuGaugeCollector;
    private ScheduledFuture gaugeManagerDataCollectionJob;
    private final t<ScheduledExecutorService> gaugeManagerExecutor;
    private i gaugeMetadataManager;
    private final t<l> memoryGaugeCollector;
    private String sessionId;
    private final k transportManager;
    private static final lm.a logger = lm.a.e();
    private static final GaugeManager instance = new GaugeManager();

    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f28019a;

        static {
            int[] iArr = new int[d.values().length];
            f28019a = iArr;
            try {
                iArr[d.BACKGROUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28019a[d.FOREGROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private GaugeManager() {
        this(new t(f.f49591a), k.k(), im.a.f(), null, new t(h.f49593a), new t(g.f49592a));
    }

    private long getCpuGaugeCollectionFrequencyMs(d dVar) {
        long w10;
        int i10 = a.f28019a[dVar.ordinal()];
        if (i10 != 1) {
            w10 = i10 != 2 ? -1L : this.configResolver.x();
        } else {
            w10 = this.configResolver.w();
        }
        if (c.f(w10)) {
            return -1L;
        }
        return w10;
    }

    private tm.f getGaugeMetadata() {
        return tm.f.W().J(this.gaugeMetadataManager.e()).G(this.gaugeMetadataManager.b()).H(this.gaugeMetadataManager.c()).I(this.gaugeMetadataManager.d()).a();
    }

    public static synchronized GaugeManager getInstance() {
        GaugeManager gaugeManager;
        synchronized (GaugeManager.class) {
            gaugeManager = instance;
        }
        return gaugeManager;
    }

    private long getMemoryGaugeCollectionFrequencyMs(d dVar) {
        long z10;
        int i10 = a.f28019a[dVar.ordinal()];
        if (i10 != 1) {
            z10 = i10 != 2 ? -1L : this.configResolver.A();
        } else {
            z10 = this.configResolver.z();
        }
        if (l.e(z10)) {
            return -1L;
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ c lambda$new$1() {
        return new c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ l lambda$new$2() {
        return new l();
    }

    private boolean startCollectingCpuMetrics(long j10, sm.h hVar) {
        if (j10 == -1) {
            logger.a("Invalid Cpu Metrics collection frequency. Did not collect Cpu Metrics.");
            return false;
        }
        this.cpuGaugeCollector.get().k(j10, hVar);
        return true;
    }

    private boolean startCollectingMemoryMetrics(long j10, sm.h hVar) {
        if (j10 == -1) {
            logger.a("Invalid Memory Metrics collection frequency. Did not collect Memory Metrics.");
            return false;
        }
        this.memoryGaugeCollector.get().j(j10, hVar);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: syncFlush */
    public void lambda$stopCollectingGauges$4(String str, d dVar) {
        g.b e02 = tm.g.e0();
        while (!this.cpuGaugeCollector.get().f49579a.isEmpty()) {
            e02.H(this.cpuGaugeCollector.get().f49579a.poll());
        }
        while (!this.memoryGaugeCollector.get().f49606b.isEmpty()) {
            e02.G(this.memoryGaugeCollector.get().f49606b.poll());
        }
        e02.J(str);
        this.transportManager.A(e02.a(), dVar);
    }

    public void collectGaugeMetricOnce(sm.h hVar) {
        collectGaugeMetricOnce(this.cpuGaugeCollector.get(), this.memoryGaugeCollector.get(), hVar);
    }

    public void initializeGaugeMetadataManager(Context context) {
        this.gaugeMetadataManager = new i(context);
    }

    public boolean logGaugeMetadata(String str, d dVar) {
        if (this.gaugeMetadataManager != null) {
            this.transportManager.A(tm.g.e0().J(str).I(getGaugeMetadata()).a(), dVar);
            return true;
        }
        return false;
    }

    public void startCollectingGauges(pm.a aVar, final d dVar) {
        if (this.sessionId != null) {
            stopCollectingGauges();
        }
        long startCollectingGauges = startCollectingGauges(dVar, aVar.d());
        if (startCollectingGauges == -1) {
            logger.j("Invalid gauge collection frequency. Unable to start collecting Gauges.");
            return;
        }
        final String h10 = aVar.h();
        this.sessionId = h10;
        this.applicationProcessState = dVar;
        try {
            long j10 = startCollectingGauges * 20;
            this.gaugeManagerDataCollectionJob = this.gaugeManagerExecutor.get().scheduleAtFixedRate(new Runnable() { // from class: qm.d
                @Override // java.lang.Runnable
                public final void run() {
                    GaugeManager.this.lambda$startCollectingGauges$3(h10, dVar);
                }
            }, j10, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            lm.a aVar2 = logger;
            aVar2.j("Unable to start collecting Gauges: " + e10.getMessage());
        }
    }

    public void stopCollectingGauges() {
        final String str = this.sessionId;
        if (str == null) {
            return;
        }
        final d dVar = this.applicationProcessState;
        this.cpuGaugeCollector.get().l();
        this.memoryGaugeCollector.get().k();
        ScheduledFuture scheduledFuture = this.gaugeManagerDataCollectionJob;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.gaugeManagerExecutor.get().schedule(new Runnable() { // from class: qm.e
            @Override // java.lang.Runnable
            public final void run() {
                GaugeManager.this.lambda$stopCollectingGauges$4(str, dVar);
            }
        }, 20L, TimeUnit.MILLISECONDS);
        this.sessionId = null;
        this.applicationProcessState = d.APPLICATION_PROCESS_STATE_UNKNOWN;
    }

    private static void collectGaugeMetricOnce(c cVar, l lVar, sm.h hVar) {
        cVar.c(hVar);
        lVar.c(hVar);
    }

    public GaugeManager(t<ScheduledExecutorService> tVar, k kVar, im.a aVar, i iVar, t<c> tVar2, t<l> tVar3) {
        this.gaugeManagerDataCollectionJob = null;
        this.sessionId = null;
        this.applicationProcessState = d.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.gaugeManagerExecutor = tVar;
        this.transportManager = kVar;
        this.configResolver = aVar;
        this.gaugeMetadataManager = iVar;
        this.cpuGaugeCollector = tVar2;
        this.memoryGaugeCollector = tVar3;
    }

    private long startCollectingGauges(d dVar, sm.h hVar) {
        long cpuGaugeCollectionFrequencyMs = getCpuGaugeCollectionFrequencyMs(dVar);
        if (!startCollectingCpuMetrics(cpuGaugeCollectionFrequencyMs, hVar)) {
            cpuGaugeCollectionFrequencyMs = -1;
        }
        long memoryGaugeCollectionFrequencyMs = getMemoryGaugeCollectionFrequencyMs(dVar);
        return startCollectingMemoryMetrics(memoryGaugeCollectionFrequencyMs, hVar) ? cpuGaugeCollectionFrequencyMs == -1 ? memoryGaugeCollectionFrequencyMs : Math.min(cpuGaugeCollectionFrequencyMs, memoryGaugeCollectionFrequencyMs) : cpuGaugeCollectionFrequencyMs;
    }
}
