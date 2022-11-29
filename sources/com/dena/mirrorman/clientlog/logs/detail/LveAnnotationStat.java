package com.dena.mirrorman.clientlog.logs.detail;

import android.app.usage.UsageStats;
import android.os.Build;
import jo.h;
import jo.p;

/* loaded from: classes2.dex */
public final class LveAnnotationStat {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String appIdentifier;
    private final Long lastTimeForegroundServiceUsed;
    private final long lastTimeStamp;
    private final long lastTimeUsed;
    private final Long lastTimeVisible;
    private final Long totalTimeForegroundServiceUsed;
    private final long totalTimeInForeground;
    private final Long totalTimeVisible;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final LveAnnotationStat convert(UsageStats usageStats) {
            p.h(usageStats, "usageStats");
            String packageName = usageStats.getPackageName();
            p.g(packageName, "usageStats.packageName");
            long lastTimeUsed = usageStats.getLastTimeUsed();
            long lastTimeStamp = usageStats.getLastTimeStamp();
            long totalTimeInForeground = usageStats.getTotalTimeInForeground();
            int i10 = Build.VERSION.SDK_INT;
            return new LveAnnotationStat(packageName, lastTimeUsed, lastTimeStamp, totalTimeInForeground, i10 >= 29 ? Long.valueOf(usageStats.getLastTimeVisible()) : null, i10 >= 29 ? Long.valueOf(usageStats.getTotalTimeVisible()) : null, i10 >= 29 ? Long.valueOf(usageStats.getLastTimeForegroundServiceUsed()) : null, i10 >= 29 ? Long.valueOf(usageStats.getTotalTimeForegroundServiceUsed()) : null);
        }
    }

    public LveAnnotationStat(String str, long j10, long j11, long j12, Long l10, Long l11, Long l12, Long l13) {
        p.h(str, "appIdentifier");
        this.appIdentifier = str;
        this.lastTimeUsed = j10;
        this.lastTimeStamp = j11;
        this.totalTimeInForeground = j12;
        this.lastTimeVisible = l10;
        this.totalTimeVisible = l11;
        this.lastTimeForegroundServiceUsed = l12;
        this.totalTimeForegroundServiceUsed = l13;
    }

    public final String component1() {
        return this.appIdentifier;
    }

    public final long component2() {
        return this.lastTimeUsed;
    }

    public final long component3() {
        return this.lastTimeStamp;
    }

    public final long component4() {
        return this.totalTimeInForeground;
    }

    public final Long component5() {
        return this.lastTimeVisible;
    }

    public final Long component6() {
        return this.totalTimeVisible;
    }

    public final Long component7() {
        return this.lastTimeForegroundServiceUsed;
    }

    public final Long component8() {
        return this.totalTimeForegroundServiceUsed;
    }

    public final LveAnnotationStat copy(String str, long j10, long j11, long j12, Long l10, Long l11, Long l12, Long l13) {
        p.h(str, "appIdentifier");
        return new LveAnnotationStat(str, j10, j11, j12, l10, l11, l12, l13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LveAnnotationStat) {
            LveAnnotationStat lveAnnotationStat = (LveAnnotationStat) obj;
            return p.c(this.appIdentifier, lveAnnotationStat.appIdentifier) && this.lastTimeUsed == lveAnnotationStat.lastTimeUsed && this.lastTimeStamp == lveAnnotationStat.lastTimeStamp && this.totalTimeInForeground == lveAnnotationStat.totalTimeInForeground && p.c(this.lastTimeVisible, lveAnnotationStat.lastTimeVisible) && p.c(this.totalTimeVisible, lveAnnotationStat.totalTimeVisible) && p.c(this.lastTimeForegroundServiceUsed, lveAnnotationStat.lastTimeForegroundServiceUsed) && p.c(this.totalTimeForegroundServiceUsed, lveAnnotationStat.totalTimeForegroundServiceUsed);
        }
        return false;
    }

    public final String getAppIdentifier() {
        return this.appIdentifier;
    }

    public final Long getLastTimeForegroundServiceUsed() {
        return this.lastTimeForegroundServiceUsed;
    }

    public final long getLastTimeStamp() {
        return this.lastTimeStamp;
    }

    public final long getLastTimeUsed() {
        return this.lastTimeUsed;
    }

    public final Long getLastTimeVisible() {
        return this.lastTimeVisible;
    }

    public final Long getTotalTimeForegroundServiceUsed() {
        return this.totalTimeForegroundServiceUsed;
    }

    public final long getTotalTimeInForeground() {
        return this.totalTimeInForeground;
    }

    public final Long getTotalTimeVisible() {
        return this.totalTimeVisible;
    }

    public int hashCode() {
        int hashCode = ((((((this.appIdentifier.hashCode() * 31) + Long.hashCode(this.lastTimeUsed)) * 31) + Long.hashCode(this.lastTimeStamp)) * 31) + Long.hashCode(this.totalTimeInForeground)) * 31;
        Long l10 = this.lastTimeVisible;
        int hashCode2 = (hashCode + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.totalTimeVisible;
        int hashCode3 = (hashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.lastTimeForegroundServiceUsed;
        int hashCode4 = (hashCode3 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.totalTimeForegroundServiceUsed;
        return hashCode4 + (l13 != null ? l13.hashCode() : 0);
    }

    public String toString() {
        return "LveAnnotationStat(appIdentifier=" + this.appIdentifier + ", lastTimeUsed=" + this.lastTimeUsed + ", lastTimeStamp=" + this.lastTimeStamp + ", totalTimeInForeground=" + this.totalTimeInForeground + ", lastTimeVisible=" + this.lastTimeVisible + ", totalTimeVisible=" + this.totalTimeVisible + ", lastTimeForegroundServiceUsed=" + this.lastTimeForegroundServiceUsed + ", totalTimeForegroundServiceUsed=" + this.totalTimeForegroundServiceUsed + ')';
    }
}
