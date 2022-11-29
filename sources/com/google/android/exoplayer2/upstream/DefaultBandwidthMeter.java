package com.google.android.exoplayer2.upstream;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.upstream.DefaultBandwidthMeter;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.SlidingPercentile;
import com.google.android.exoplayer2.util.Util;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import lk.r;
import lk.s;
import lk.t;

/* loaded from: classes3.dex */
public final class DefaultBandwidthMeter implements BandwidthMeter, TransferListener {
    private static final int BYTES_TRANSFERRED_FOR_ESTIMATE = 524288;
    private static final int COUNTRY_GROUP_INDEX_2G = 1;
    private static final int COUNTRY_GROUP_INDEX_3G = 2;
    private static final int COUNTRY_GROUP_INDEX_4G = 3;
    private static final int COUNTRY_GROUP_INDEX_5G_NSA = 4;
    private static final int COUNTRY_GROUP_INDEX_WIFI = 0;
    public static final long DEFAULT_INITIAL_BITRATE_ESTIMATE = 1000000;
    public static final int DEFAULT_SLIDING_WINDOW_MAX_WEIGHT = 2000;
    private static final int ELAPSED_MILLIS_FOR_ESTIMATE = 2000;
    private static DefaultBandwidthMeter singletonInstance;
    private long bitrateEstimate;
    private final Clock clock;
    private final Context context;
    private final BandwidthMeter.EventListener.EventDispatcher eventDispatcher;
    private final t<Integer, Long> initialBitrateEstimates;
    private long lastReportedBitrateEstimate;
    private int networkType;
    private int networkTypeOverride;
    private boolean networkTypeOverrideSet;
    private long sampleBytesTransferred;
    private long sampleStartTimeMs;
    private final SlidingPercentile slidingPercentile;
    private int streamCount;
    private long totalBytesTransferred;
    private long totalElapsedTimeMs;
    public static final s<String, Integer> DEFAULT_INITIAL_BITRATE_COUNTRY_GROUPS = createInitialBitrateCountryGroupAssignment();
    public static final r<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_WIFI = r.H(6100000L, 3800000L, 2100000L, 1300000L, 590000L);
    public static final r<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_2G = r.H(218000L, 159000L, 145000L, 130000L, 112000L);
    public static final r<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_3G = r.H(2200000L, 1300000L, 930000L, 730000L, 530000L);
    public static final r<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_4G = r.H(4800000L, 2700000L, 1800000L, 1200000L, 630000L);
    public static final r<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_NSA = r.H(12000000L, 8800000L, 5900000L, 3500000L, 1800000L);

    /* loaded from: classes3.dex */
    public static class ConnectivityActionReceiver extends BroadcastReceiver {
        private static ConnectivityActionReceiver staticInstance;
        private final Handler mainHandler = new Handler(Looper.getMainLooper());
        private final ArrayList<WeakReference<DefaultBandwidthMeter>> bandwidthMeters = new ArrayList<>();

        private ConnectivityActionReceiver() {
        }

        public static synchronized ConnectivityActionReceiver getInstance(Context context) {
            ConnectivityActionReceiver connectivityActionReceiver;
            synchronized (ConnectivityActionReceiver.class) {
                if (staticInstance == null) {
                    staticInstance = new ConnectivityActionReceiver();
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                    context.registerReceiver(staticInstance, intentFilter);
                }
                connectivityActionReceiver = staticInstance;
            }
            return connectivityActionReceiver;
        }

        private void removeClearedReferences() {
            for (int size = this.bandwidthMeters.size() - 1; size >= 0; size--) {
                if (this.bandwidthMeters.get(size).get() == null) {
                    this.bandwidthMeters.remove(size);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: updateBandwidthMeter */
        public void lambda$register$0(DefaultBandwidthMeter defaultBandwidthMeter) {
            defaultBandwidthMeter.onConnectivityAction();
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            removeClearedReferences();
            for (int i10 = 0; i10 < this.bandwidthMeters.size(); i10++) {
                DefaultBandwidthMeter defaultBandwidthMeter = this.bandwidthMeters.get(i10).get();
                if (defaultBandwidthMeter != null) {
                    lambda$register$0(defaultBandwidthMeter);
                }
            }
        }

        public synchronized void register(final DefaultBandwidthMeter defaultBandwidthMeter) {
            removeClearedReferences();
            this.bandwidthMeters.add(new WeakReference<>(defaultBandwidthMeter));
            this.mainHandler.post(new Runnable() { // from class: com.google.android.exoplayer2.upstream.b
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultBandwidthMeter.ConnectivityActionReceiver.this.lambda$register$0(defaultBandwidthMeter);
                }
            });
        }
    }

    private static s<String, Integer> createInitialBitrateCountryGroupAssignment() {
        s.a s10 = s.s();
        s10.g("AD", 1, 2, 0, 0, 2);
        s10.g("AE", 1, 4, 4, 4, 1);
        s10.g("AF", 4, 4, 3, 4, 2);
        s10.g("AG", 2, 2, 1, 1, 2);
        s10.g("AI", 1, 2, 2, 2, 2);
        s10.g("AL", 1, 1, 0, 1, 2);
        s10.g("AM", 2, 2, 1, 2, 2);
        s10.g("AO", 3, 4, 4, 2, 2);
        s10.g("AR", 2, 4, 2, 2, 2);
        s10.g("AS", 2, 2, 4, 3, 2);
        s10.g("AT", 0, 3, 0, 0, 2);
        s10.g("AU", 0, 2, 0, 1, 1);
        s10.g("AW", 1, 2, 0, 4, 2);
        s10.g("AX", 0, 2, 2, 2, 2);
        s10.g("AZ", 3, 3, 3, 4, 2);
        s10.g("BA", 1, 1, 0, 1, 2);
        s10.g("BB", 0, 2, 0, 0, 2);
        s10.g("BD", 2, 0, 3, 3, 2);
        s10.g("BE", 0, 1, 2, 3, 2);
        s10.g("BF", 4, 4, 4, 2, 2);
        s10.g("BG", 0, 1, 0, 0, 2);
        s10.g("BH", 1, 0, 2, 4, 2);
        s10.g("BI", 4, 4, 4, 4, 2);
        s10.g("BJ", 4, 4, 3, 4, 2);
        s10.g("BL", 1, 2, 2, 2, 2);
        s10.g("BM", 1, 2, 0, 0, 2);
        s10.g("BN", 4, 0, 1, 1, 2);
        s10.g("BO", 2, 3, 3, 2, 2);
        s10.g("BQ", 1, 2, 1, 2, 2);
        s10.g("BR", 2, 4, 2, 1, 2);
        s10.g("BS", 3, 2, 2, 3, 2);
        s10.g("BT", 3, 0, 3, 2, 2);
        s10.g("BW", 3, 4, 2, 2, 2);
        s10.g("BY", 1, 0, 2, 1, 2);
        s10.g("BZ", 2, 2, 2, 1, 2);
        s10.g("CA", 0, 3, 1, 2, 3);
        s10.g("CD", 4, 3, 2, 2, 2);
        s10.g("CF", 4, 2, 2, 2, 2);
        s10.g("CG", 3, 4, 1, 1, 2);
        s10.g("CH", 0, 1, 0, 0, 0);
        s10.g("CI", 3, 3, 3, 3, 2);
        s10.g("CK", 3, 2, 1, 0, 2);
        s10.g("CL", 1, 1, 2, 3, 2);
        s10.g("CM", 3, 4, 3, 2, 2);
        s10.g("CN", 2, 2, 2, 1, 3);
        s10.g("CO", 2, 4, 3, 2, 2);
        s10.g("CR", 2, 3, 4, 4, 2);
        s10.g("CU", 4, 4, 2, 1, 2);
        s10.g("CV", 2, 3, 3, 3, 2);
        s10.g("CW", 1, 2, 0, 0, 2);
        s10.g("CY", 1, 2, 0, 0, 2);
        s10.g("CZ", 0, 1, 0, 0, 2);
        s10.g("DE", 0, 1, 1, 2, 0);
        s10.g("DJ", 4, 1, 4, 4, 2);
        s10.g("DK", 0, 0, 1, 0, 2);
        s10.g("DM", 1, 2, 2, 2, 2);
        s10.g("DO", 3, 4, 4, 4, 2);
        s10.g("DZ", 3, 2, 4, 4, 2);
        s10.g("EC", 2, 4, 3, 2, 2);
        s10.g("EE", 0, 0, 0, 0, 2);
        s10.g("EG", 3, 4, 2, 1, 2);
        s10.g("EH", 2, 2, 2, 2, 2);
        s10.g("ER", 4, 2, 2, 2, 2);
        s10.g("ES", 0, 1, 2, 1, 2);
        s10.g("ET", 4, 4, 4, 1, 2);
        s10.g("FI", 0, 0, 1, 0, 0);
        s10.g("FJ", 3, 0, 3, 3, 2);
        s10.g("FK", 2, 2, 2, 2, 2);
        s10.g("FM", 4, 2, 4, 3, 2);
        s10.g("FO", 0, 2, 0, 0, 2);
        s10.g("FR", 1, 0, 2, 1, 2);
        s10.g("GA", 3, 3, 1, 0, 2);
        s10.g("GB", 0, 0, 1, 2, 2);
        s10.g("GD", 1, 2, 2, 2, 2);
        s10.g("GE", 1, 0, 1, 3, 2);
        s10.g("GF", 2, 2, 2, 4, 2);
        s10.g("GG", 0, 2, 0, 0, 2);
        s10.g("GH", 3, 2, 3, 2, 2);
        s10.g("GI", 0, 2, 0, 0, 2);
        s10.g("GL", 1, 2, 2, 1, 2);
        s10.g("GM", 4, 3, 2, 4, 2);
        s10.g("GN", 4, 3, 4, 2, 2);
        s10.g("GP", 2, 2, 3, 4, 2);
        s10.g("GQ", 4, 2, 3, 4, 2);
        s10.g("GR", 1, 1, 0, 1, 2);
        s10.g("GT", 3, 2, 3, 2, 2);
        s10.g("GU", 1, 2, 4, 4, 2);
        s10.g("GW", 3, 4, 4, 3, 2);
        s10.g("GY", 3, 3, 1, 0, 2);
        s10.g("HK", 0, 2, 3, 4, 2);
        s10.g("HN", 3, 0, 3, 3, 2);
        s10.g("HR", 1, 1, 0, 1, 2);
        s10.g("HT", 4, 3, 4, 4, 2);
        s10.g("HU", 0, 1, 0, 0, 2);
        s10.g("ID", 3, 2, 2, 3, 2);
        s10.g("IE", 0, 0, 1, 1, 2);
        s10.g("IL", 1, 0, 2, 3, 2);
        s10.g("IM", 0, 2, 0, 1, 2);
        s10.g("IN", 2, 1, 3, 3, 2);
        s10.g("IO", 4, 2, 2, 4, 2);
        s10.g("IQ", 3, 2, 4, 3, 2);
        s10.g("IR", 4, 2, 3, 4, 2);
        s10.g("IS", 0, 2, 0, 0, 2);
        s10.g("IT", 0, 0, 1, 1, 2);
        s10.g("JE", 2, 2, 0, 2, 2);
        s10.g("JM", 3, 3, 4, 4, 2);
        s10.g("JO", 1, 2, 1, 1, 2);
        s10.g("JP", 0, 2, 0, 1, 3);
        s10.g("KE", 3, 4, 2, 2, 2);
        s10.g("KG", 1, 0, 2, 2, 2);
        s10.g("KH", 2, 0, 4, 3, 2);
        s10.g("KI", 4, 2, 3, 1, 2);
        s10.g("KM", 4, 2, 2, 3, 2);
        s10.g("KN", 1, 2, 2, 2, 2);
        s10.g("KP", 4, 2, 2, 2, 2);
        s10.g("KR", 0, 2, 1, 1, 1);
        s10.g("KW", 2, 3, 1, 1, 1);
        s10.g("KY", 1, 2, 0, 0, 2);
        s10.g("KZ", 1, 2, 2, 3, 2);
        s10.g("LA", 2, 2, 1, 1, 2);
        s10.g("LB", 3, 2, 0, 0, 2);
        s10.g("LC", 1, 1, 0, 0, 2);
        s10.g("LI", 0, 2, 2, 2, 2);
        s10.g("LK", 2, 0, 2, 3, 2);
        s10.g("LR", 3, 4, 3, 2, 2);
        s10.g("LS", 3, 3, 2, 3, 2);
        s10.g("LT", 0, 0, 0, 0, 2);
        s10.g("LU", 0, 0, 0, 0, 2);
        s10.g("LV", 0, 0, 0, 0, 2);
        s10.g("LY", 4, 2, 4, 3, 2);
        s10.g("MA", 2, 1, 2, 1, 2);
        s10.g("MC", 0, 2, 2, 2, 2);
        s10.g("MD", 1, 2, 0, 0, 2);
        s10.g("ME", 1, 2, 1, 2, 2);
        s10.g("MF", 1, 2, 1, 0, 2);
        s10.g("MG", 3, 4, 3, 3, 2);
        s10.g("MH", 4, 2, 2, 4, 2);
        s10.g("MK", 1, 0, 0, 0, 2);
        s10.g("ML", 4, 4, 1, 1, 2);
        s10.g("MM", 2, 3, 2, 2, 2);
        s10.g("MN", 2, 4, 1, 1, 2);
        s10.g("MO", 0, 2, 4, 4, 2);
        s10.g("MP", 0, 2, 2, 2, 2);
        s10.g("MQ", 2, 2, 2, 3, 2);
        s10.g("MR", 3, 0, 4, 2, 2);
        s10.g("MS", 1, 2, 2, 2, 2);
        s10.g("MT", 0, 2, 0, 1, 2);
        s10.g("MU", 3, 1, 2, 3, 2);
        s10.g("MV", 4, 3, 1, 4, 2);
        s10.g("MW", 4, 1, 1, 0, 2);
        s10.g("MX", 2, 4, 3, 3, 2);
        s10.g("MY", 2, 0, 3, 3, 2);
        s10.g("MZ", 3, 3, 2, 3, 2);
        s10.g("NA", 4, 3, 2, 2, 2);
        s10.g("NC", 2, 0, 4, 4, 2);
        s10.g("NE", 4, 4, 4, 4, 2);
        s10.g("NF", 2, 2, 2, 2, 2);
        s10.g("NG", 3, 3, 2, 2, 2);
        s10.g("NI", 3, 1, 4, 4, 2);
        s10.g("NL", 0, 2, 4, 2, 0);
        s10.g("NO", 0, 1, 1, 0, 2);
        s10.g("NP", 2, 0, 4, 3, 2);
        s10.g("NR", 4, 2, 3, 1, 2);
        s10.g("NU", 4, 2, 2, 2, 2);
        s10.g("NZ", 0, 2, 1, 2, 4);
        s10.g("OM", 2, 2, 0, 2, 2);
        s10.g("PA", 1, 3, 3, 4, 2);
        s10.g("PE", 2, 4, 4, 4, 2);
        s10.g("PF", 2, 2, 1, 1, 2);
        s10.g("PG", 4, 3, 3, 2, 2);
        s10.g("PH", 3, 0, 3, 4, 4);
        s10.g("PK", 3, 2, 3, 3, 2);
        s10.g("PL", 1, 0, 2, 2, 2);
        s10.g("PM", 0, 2, 2, 2, 2);
        s10.g("PR", 1, 2, 2, 3, 4);
        s10.g("PS", 3, 3, 2, 2, 2);
        s10.g("PT", 1, 1, 0, 0, 2);
        s10.g("PW", 1, 2, 3, 0, 2);
        s10.g("PY", 2, 0, 3, 3, 2);
        s10.g("QA", 2, 3, 1, 2, 2);
        s10.g("RE", 1, 0, 2, 1, 2);
        s10.g("RO", 1, 1, 1, 2, 2);
        s10.g("RS", 1, 2, 0, 0, 2);
        s10.g("RU", 0, 1, 0, 1, 2);
        s10.g("RW", 4, 3, 3, 4, 2);
        s10.g("SA", 2, 2, 2, 1, 2);
        s10.g("SB", 4, 2, 4, 2, 2);
        s10.g("SC", 4, 2, 0, 1, 2);
        s10.g("SD", 4, 4, 4, 3, 2);
        s10.g("SE", 0, 0, 0, 0, 2);
        s10.g("SG", 0, 0, 3, 3, 4);
        s10.g("SH", 4, 2, 2, 2, 2);
        s10.g("SI", 0, 1, 0, 0, 2);
        s10.g("SJ", 2, 2, 2, 2, 2);
        s10.g("SK", 0, 1, 0, 0, 2);
        s10.g("SL", 4, 3, 3, 1, 2);
        s10.g("SM", 0, 2, 2, 2, 2);
        s10.g("SN", 4, 4, 4, 3, 2);
        s10.g("SO", 3, 4, 4, 4, 2);
        s10.g("SR", 3, 2, 3, 1, 2);
        s10.g("SS", 4, 1, 4, 2, 2);
        s10.g("ST", 2, 2, 1, 2, 2);
        s10.g("SV", 2, 1, 4, 4, 2);
        s10.g("SX", 2, 2, 1, 0, 2);
        s10.g("SY", 4, 3, 2, 2, 2);
        s10.g("SZ", 3, 4, 3, 4, 2);
        s10.g("TC", 1, 2, 1, 0, 2);
        s10.g("TD", 4, 4, 4, 4, 2);
        s10.g("TG", 3, 2, 1, 0, 2);
        s10.g("TH", 1, 3, 4, 3, 0);
        s10.g("TJ", 4, 4, 4, 4, 2);
        s10.g("TL", 4, 1, 4, 4, 2);
        s10.g("TM", 4, 2, 1, 2, 2);
        s10.g("TN", 2, 1, 1, 1, 2);
        s10.g("TO", 3, 3, 4, 2, 2);
        s10.g("TR", 1, 2, 1, 1, 2);
        s10.g("TT", 1, 3, 1, 3, 2);
        s10.g("TV", 3, 2, 2, 4, 2);
        s10.g("TW", 0, 0, 0, 0, 1);
        s10.g("TZ", 3, 3, 3, 2, 2);
        s10.g("UA", 0, 3, 0, 0, 2);
        s10.g("UG", 3, 2, 2, 3, 2);
        s10.g("US", 0, 1, 3, 3, 3);
        s10.g("UY", 2, 1, 1, 1, 2);
        s10.g("UZ", 2, 0, 3, 2, 2);
        s10.g("VC", 2, 2, 2, 2, 2);
        s10.g("VE", 4, 4, 4, 4, 2);
        s10.g("VG", 2, 2, 1, 2, 2);
        s10.g("VI", 1, 2, 2, 4, 2);
        s10.g("VN", 0, 1, 4, 4, 2);
        s10.g("VU", 4, 1, 3, 1, 2);
        s10.g("WS", 3, 1, 4, 2, 2);
        s10.g("XK", 1, 1, 1, 0, 2);
        s10.g("YE", 4, 4, 4, 4, 2);
        s10.g("YT", 3, 2, 1, 3, 2);
        s10.g("ZA", 2, 3, 2, 2, 2);
        s10.g("ZM", 3, 2, 2, 3, 2);
        s10.g("ZW", 3, 3, 3, 3, 2);
        return s10.e();
    }

    private long getInitialBitrateEstimateForNetworkType(int i10) {
        Long l10 = this.initialBitrateEstimates.get(Integer.valueOf(i10));
        if (l10 == null) {
            l10 = this.initialBitrateEstimates.get(0);
        }
        if (l10 == null) {
            l10 = 1000000L;
        }
        return l10.longValue();
    }

    public static synchronized DefaultBandwidthMeter getSingletonInstance(Context context) {
        DefaultBandwidthMeter defaultBandwidthMeter;
        synchronized (DefaultBandwidthMeter.class) {
            if (singletonInstance == null) {
                singletonInstance = new Builder(context).build();
            }
            defaultBandwidthMeter = singletonInstance;
        }
        return defaultBandwidthMeter;
    }

    private static boolean isTransferAtFullNetworkSpeed(DataSpec dataSpec, boolean z10) {
        return z10 && !dataSpec.isFlagSet(8);
    }

    private void maybeNotifyBandwidthSample(int i10, long j10, long j11) {
        if (i10 == 0 && j10 == 0 && j11 == this.lastReportedBitrateEstimate) {
            return;
        }
        this.lastReportedBitrateEstimate = j11;
        this.eventDispatcher.bandwidthSample(i10, j10, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void onConnectivityAction() {
        int networkType;
        if (this.networkTypeOverrideSet) {
            networkType = this.networkTypeOverride;
        } else {
            Context context = this.context;
            networkType = context == null ? 0 : Util.getNetworkType(context);
        }
        if (this.networkType == networkType) {
            return;
        }
        this.networkType = networkType;
        if (networkType != 1 && networkType != 0 && networkType != 8) {
            this.bitrateEstimate = getInitialBitrateEstimateForNetworkType(networkType);
            long elapsedRealtime = this.clock.elapsedRealtime();
            maybeNotifyBandwidthSample(this.streamCount > 0 ? (int) (elapsedRealtime - this.sampleStartTimeMs) : 0, this.sampleBytesTransferred, this.bitrateEstimate);
            this.sampleStartTimeMs = elapsedRealtime;
            this.sampleBytesTransferred = 0L;
            this.totalBytesTransferred = 0L;
            this.totalElapsedTimeMs = 0L;
            this.slidingPercentile.reset();
        }
    }

    @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
    public void addEventListener(Handler handler, BandwidthMeter.EventListener eventListener) {
        Assertions.checkNotNull(handler);
        Assertions.checkNotNull(eventListener);
        this.eventDispatcher.addListener(handler, eventListener);
    }

    @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
    public synchronized long getBitrateEstimate() {
        return this.bitrateEstimate;
    }

    @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
    public TransferListener getTransferListener() {
        return this;
    }

    @Override // com.google.android.exoplayer2.upstream.TransferListener
    public synchronized void onBytesTransferred(DataSource dataSource, DataSpec dataSpec, boolean z10, int i10) {
        if (isTransferAtFullNetworkSpeed(dataSpec, z10)) {
            this.sampleBytesTransferred += i10;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.TransferListener
    public synchronized void onTransferEnd(DataSource dataSource, DataSpec dataSpec, boolean z10) {
        if (isTransferAtFullNetworkSpeed(dataSpec, z10)) {
            Assertions.checkState(this.streamCount > 0);
            long elapsedRealtime = this.clock.elapsedRealtime();
            int i10 = (int) (elapsedRealtime - this.sampleStartTimeMs);
            this.totalElapsedTimeMs += i10;
            long j10 = this.totalBytesTransferred;
            long j11 = this.sampleBytesTransferred;
            this.totalBytesTransferred = j10 + j11;
            if (i10 > 0) {
                this.slidingPercentile.addSample((int) Math.sqrt(j11), (((float) j11) * 8000.0f) / i10);
                if (this.totalElapsedTimeMs >= SimpleExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS || this.totalBytesTransferred >= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
                    this.bitrateEstimate = this.slidingPercentile.getPercentile(0.5f);
                }
                maybeNotifyBandwidthSample(i10, this.sampleBytesTransferred, this.bitrateEstimate);
                this.sampleStartTimeMs = elapsedRealtime;
                this.sampleBytesTransferred = 0L;
            }
            this.streamCount--;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.TransferListener
    public void onTransferInitializing(DataSource dataSource, DataSpec dataSpec, boolean z10) {
    }

    @Override // com.google.android.exoplayer2.upstream.TransferListener
    public synchronized void onTransferStart(DataSource dataSource, DataSpec dataSpec, boolean z10) {
        if (isTransferAtFullNetworkSpeed(dataSpec, z10)) {
            if (this.streamCount == 0) {
                this.sampleStartTimeMs = this.clock.elapsedRealtime();
            }
            this.streamCount++;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
    public void removeEventListener(BandwidthMeter.EventListener eventListener) {
        this.eventDispatcher.removeListener(eventListener);
    }

    public synchronized void setNetworkTypeOverride(int i10) {
        this.networkTypeOverride = i10;
        this.networkTypeOverrideSet = true;
        onConnectivityAction();
    }

    /* loaded from: classes3.dex */
    public static final class Builder {
        private Clock clock;
        private final Context context;
        private Map<Integer, Long> initialBitrateEstimates;
        private boolean resetOnNetworkTypeChange;
        private int slidingWindowMaxWeight;

        public Builder(Context context) {
            this.context = context == null ? null : context.getApplicationContext();
            this.initialBitrateEstimates = getInitialBitrateEstimatesForCountry(Util.getCountryCode(context));
            this.slidingWindowMaxWeight = 2000;
            this.clock = Clock.DEFAULT;
            this.resetOnNetworkTypeChange = true;
        }

        private static r<Integer> getCountryGroupIndices(String str) {
            r<Integer> rVar = DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_COUNTRY_GROUPS.get(str);
            return rVar.isEmpty() ? r.H(2, 2, 2, 2, 2) : rVar;
        }

        private static Map<Integer, Long> getInitialBitrateEstimatesForCountry(String str) {
            r<Integer> countryGroupIndices = getCountryGroupIndices(str);
            HashMap hashMap = new HashMap(6);
            hashMap.put(0, 1000000L);
            r<Long> rVar = DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_WIFI;
            hashMap.put(2, rVar.get(countryGroupIndices.get(0).intValue()));
            hashMap.put(3, DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_2G.get(countryGroupIndices.get(1).intValue()));
            hashMap.put(4, DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_3G.get(countryGroupIndices.get(2).intValue()));
            hashMap.put(5, DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_4G.get(countryGroupIndices.get(3).intValue()));
            hashMap.put(9, DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_NSA.get(countryGroupIndices.get(4).intValue()));
            hashMap.put(7, rVar.get(countryGroupIndices.get(0).intValue()));
            return hashMap;
        }

        public DefaultBandwidthMeter build() {
            return new DefaultBandwidthMeter(this.context, this.initialBitrateEstimates, this.slidingWindowMaxWeight, this.clock, this.resetOnNetworkTypeChange);
        }

        public Builder setClock(Clock clock) {
            this.clock = clock;
            return this;
        }

        public Builder setInitialBitrateEstimate(long j10) {
            for (Integer num : this.initialBitrateEstimates.keySet()) {
                setInitialBitrateEstimate(num.intValue(), j10);
            }
            return this;
        }

        public Builder setResetOnNetworkTypeChange(boolean z10) {
            this.resetOnNetworkTypeChange = z10;
            return this;
        }

        public Builder setSlidingWindowMaxWeight(int i10) {
            this.slidingWindowMaxWeight = i10;
            return this;
        }

        public Builder setInitialBitrateEstimate(int i10, long j10) {
            this.initialBitrateEstimates.put(Integer.valueOf(i10), Long.valueOf(j10));
            return this;
        }

        public Builder setInitialBitrateEstimate(String str) {
            this.initialBitrateEstimates = getInitialBitrateEstimatesForCountry(Util.toUpperInvariant(str));
            return this;
        }
    }

    @Deprecated
    public DefaultBandwidthMeter() {
        this(null, t.o(), 2000, Clock.DEFAULT, false);
    }

    private DefaultBandwidthMeter(Context context, Map<Integer, Long> map, int i10, Clock clock, boolean z10) {
        this.context = context == null ? null : context.getApplicationContext();
        this.initialBitrateEstimates = t.f(map);
        this.eventDispatcher = new BandwidthMeter.EventListener.EventDispatcher();
        this.slidingPercentile = new SlidingPercentile(i10);
        this.clock = clock;
        int networkType = context == null ? 0 : Util.getNetworkType(context);
        this.networkType = networkType;
        this.bitrateEstimate = getInitialBitrateEstimateForNetworkType(networkType);
        if (context == null || !z10) {
            return;
        }
        ConnectivityActionReceiver.getInstance(context).register(this);
    }
}
