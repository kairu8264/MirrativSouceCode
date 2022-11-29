package org.webrtc;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class Metrics {
    private static final String TAG = "Metrics";
    public final Map<String, HistogramInfo> map = new HashMap();

    /* loaded from: classes4.dex */
    public static class HistogramInfo {
        public final int bucketCount;
        public final int max;
        public final int min;
        public final Map<Integer, Integer> samples = new HashMap();

        @CalledByNative("HistogramInfo")
        public HistogramInfo(int i10, int i11, int i12) {
            this.min = i10;
            this.max = i11;
            this.bucketCount = i12;
        }

        @CalledByNative("HistogramInfo")
        public void addSample(int i10, int i11) {
            this.samples.put(Integer.valueOf(i10), Integer.valueOf(i11));
        }
    }

    @CalledByNative
    private void add(String str, HistogramInfo histogramInfo) {
        this.map.put(str, histogramInfo);
    }

    public static void enable() {
        nativeEnable();
    }

    public static Metrics getAndReset() {
        return nativeGetAndReset();
    }

    private static native void nativeEnable();

    private static native Metrics nativeGetAndReset();
}
