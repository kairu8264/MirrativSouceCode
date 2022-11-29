package org.webrtc;

import java.util.Map;

/* loaded from: classes4.dex */
public class RTCStatsReport {
    private final Map<String, RTCStats> stats;
    private final long timestampUs;

    public RTCStatsReport(long j10, Map<String, RTCStats> map) {
        this.timestampUs = j10;
        this.stats = map;
    }

    @CalledByNative
    private static RTCStatsReport create(long j10, Map map) {
        return new RTCStatsReport(j10, map);
    }

    public Map<String, RTCStats> getStatsMap() {
        return this.stats;
    }

    public double getTimestampUs() {
        return this.timestampUs;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{ timestampUs: ");
        sb2.append(this.timestampUs);
        sb2.append(", stats: [\n");
        boolean z10 = true;
        for (RTCStats rTCStats : this.stats.values()) {
            if (!z10) {
                sb2.append(",\n");
            }
            sb2.append(rTCStats);
            z10 = false;
        }
        sb2.append(" ] }");
        return sb2.toString();
    }
}
