package com.google.android.exoplayer2.source.ads;

import android.net.Uri;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class AdPlaybackState {
    public static final int AD_STATE_AVAILABLE = 1;
    public static final int AD_STATE_ERROR = 4;
    public static final int AD_STATE_PLAYED = 3;
    public static final int AD_STATE_SKIPPED = 2;
    public static final int AD_STATE_UNAVAILABLE = 0;
    public static final AdPlaybackState NONE = new AdPlaybackState(null, new long[0], null, 0, C.TIME_UNSET);
    public final int adGroupCount;
    public final long[] adGroupTimesUs;
    public final AdGroup[] adGroups;
    public final long adResumePositionUs;
    public final Object adsId;
    public final long contentDurationUs;

    /* loaded from: classes3.dex */
    public static final class AdGroup {
        public final int count;
        public final long[] durationsUs;
        public final int[] states;
        public final Uri[] uris;

        public AdGroup() {
            this(-1, new int[0], new Uri[0], new long[0]);
        }

        private static long[] copyDurationsUsWithSpaceForAdCount(long[] jArr, int i10) {
            int length = jArr.length;
            int max = Math.max(i10, length);
            long[] copyOf = Arrays.copyOf(jArr, max);
            Arrays.fill(copyOf, length, max, (long) C.TIME_UNSET);
            return copyOf;
        }

        private static int[] copyStatesWithSpaceForAdCount(int[] iArr, int i10) {
            int length = iArr.length;
            int max = Math.max(i10, length);
            int[] copyOf = Arrays.copyOf(iArr, max);
            Arrays.fill(copyOf, length, max, 0);
            return copyOf;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || AdGroup.class != obj.getClass()) {
                return false;
            }
            AdGroup adGroup = (AdGroup) obj;
            return this.count == adGroup.count && Arrays.equals(this.uris, adGroup.uris) && Arrays.equals(this.states, adGroup.states) && Arrays.equals(this.durationsUs, adGroup.durationsUs);
        }

        public int getFirstAdIndexToPlay() {
            return getNextAdIndexToPlay(-1);
        }

        public int getNextAdIndexToPlay(int i10) {
            int i11 = i10 + 1;
            while (true) {
                int[] iArr = this.states;
                if (i11 >= iArr.length || iArr[i11] == 0 || iArr[i11] == 1) {
                    break;
                }
                i11++;
            }
            return i11;
        }

        public boolean hasUnplayedAds() {
            return this.count == -1 || getFirstAdIndexToPlay() < this.count;
        }

        public int hashCode() {
            return (((((this.count * 31) + Arrays.hashCode(this.uris)) * 31) + Arrays.hashCode(this.states)) * 31) + Arrays.hashCode(this.durationsUs);
        }

        public AdGroup withAdCount(int i10) {
            return new AdGroup(i10, copyStatesWithSpaceForAdCount(this.states, i10), (Uri[]) Arrays.copyOf(this.uris, i10), copyDurationsUsWithSpaceForAdCount(this.durationsUs, i10));
        }

        public AdGroup withAdDurationsUs(long[] jArr) {
            int length = jArr.length;
            Uri[] uriArr = this.uris;
            if (length < uriArr.length) {
                jArr = copyDurationsUsWithSpaceForAdCount(jArr, uriArr.length);
            } else if (this.count != -1 && jArr.length > uriArr.length) {
                jArr = Arrays.copyOf(jArr, uriArr.length);
            }
            return new AdGroup(this.count, this.states, this.uris, jArr);
        }

        public AdGroup withAdState(int i10, int i11) {
            int i12 = this.count;
            boolean z10 = false;
            Assertions.checkArgument(i12 == -1 || i11 < i12);
            int[] copyStatesWithSpaceForAdCount = copyStatesWithSpaceForAdCount(this.states, i11 + 1);
            if (copyStatesWithSpaceForAdCount[i11] == 0 || copyStatesWithSpaceForAdCount[i11] == 1 || copyStatesWithSpaceForAdCount[i11] == i10) {
                z10 = true;
            }
            Assertions.checkArgument(z10);
            long[] jArr = this.durationsUs;
            if (jArr.length != copyStatesWithSpaceForAdCount.length) {
                jArr = copyDurationsUsWithSpaceForAdCount(jArr, copyStatesWithSpaceForAdCount.length);
            }
            Uri[] uriArr = this.uris;
            if (uriArr.length != copyStatesWithSpaceForAdCount.length) {
                uriArr = (Uri[]) Arrays.copyOf(uriArr, copyStatesWithSpaceForAdCount.length);
            }
            copyStatesWithSpaceForAdCount[i11] = i10;
            return new AdGroup(this.count, copyStatesWithSpaceForAdCount, uriArr, jArr);
        }

        public AdGroup withAdUri(Uri uri, int i10) {
            int[] copyStatesWithSpaceForAdCount = copyStatesWithSpaceForAdCount(this.states, i10 + 1);
            long[] jArr = this.durationsUs;
            if (jArr.length != copyStatesWithSpaceForAdCount.length) {
                jArr = copyDurationsUsWithSpaceForAdCount(jArr, copyStatesWithSpaceForAdCount.length);
            }
            Uri[] uriArr = (Uri[]) Arrays.copyOf(this.uris, copyStatesWithSpaceForAdCount.length);
            uriArr[i10] = uri;
            copyStatesWithSpaceForAdCount[i10] = 1;
            return new AdGroup(this.count, copyStatesWithSpaceForAdCount, uriArr, jArr);
        }

        public AdGroup withAllAdsSkipped() {
            if (this.count == -1) {
                return new AdGroup(0, new int[0], new Uri[0], new long[0]);
            }
            int[] iArr = this.states;
            int length = iArr.length;
            int[] copyOf = Arrays.copyOf(iArr, length);
            for (int i10 = 0; i10 < length; i10++) {
                if (copyOf[i10] == 1 || copyOf[i10] == 0) {
                    copyOf[i10] = 2;
                }
            }
            return new AdGroup(length, copyOf, this.uris, this.durationsUs);
        }

        private AdGroup(int i10, int[] iArr, Uri[] uriArr, long[] jArr) {
            Assertions.checkArgument(iArr.length == uriArr.length);
            this.count = i10;
            this.states = iArr;
            this.uris = uriArr;
            this.durationsUs = jArr;
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface AdState {
    }

    public AdPlaybackState(Object obj, long... jArr) {
        this(obj, jArr, null, 0L, C.TIME_UNSET);
    }

    private boolean isPositionBeforeAdGroup(long j10, long j11, int i10) {
        if (j10 == Long.MIN_VALUE) {
            return false;
        }
        long j12 = this.adGroupTimesUs[i10];
        return j12 == Long.MIN_VALUE ? j11 == C.TIME_UNSET || j10 < j11 : j10 < j12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AdPlaybackState.class != obj.getClass()) {
            return false;
        }
        AdPlaybackState adPlaybackState = (AdPlaybackState) obj;
        return Util.areEqual(this.adsId, adPlaybackState.adsId) && this.adGroupCount == adPlaybackState.adGroupCount && this.adResumePositionUs == adPlaybackState.adResumePositionUs && this.contentDurationUs == adPlaybackState.contentDurationUs && Arrays.equals(this.adGroupTimesUs, adPlaybackState.adGroupTimesUs) && Arrays.equals(this.adGroups, adPlaybackState.adGroups);
    }

    public int getAdGroupIndexAfterPositionUs(long j10, long j11) {
        if (j10 != Long.MIN_VALUE) {
            if (j11 == C.TIME_UNSET || j10 < j11) {
                int i10 = 0;
                while (true) {
                    long[] jArr = this.adGroupTimesUs;
                    if (i10 >= jArr.length || jArr[i10] == Long.MIN_VALUE || (j10 < jArr[i10] && this.adGroups[i10].hasUnplayedAds())) {
                        break;
                    }
                    i10++;
                }
                if (i10 < this.adGroupTimesUs.length) {
                    return i10;
                }
                return -1;
            }
            return -1;
        }
        return -1;
    }

    public int getAdGroupIndexForPositionUs(long j10, long j11) {
        int length = this.adGroupTimesUs.length - 1;
        while (length >= 0 && isPositionBeforeAdGroup(j10, j11, length)) {
            length--;
        }
        if (length < 0 || !this.adGroups[length].hasUnplayedAds()) {
            return -1;
        }
        return length;
    }

    public int hashCode() {
        int i10 = this.adGroupCount * 31;
        Object obj = this.adsId;
        return ((((((((i10 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.adResumePositionUs)) * 31) + ((int) this.contentDurationUs)) * 31) + Arrays.hashCode(this.adGroupTimesUs)) * 31) + Arrays.hashCode(this.adGroups);
    }

    public boolean isAdInErrorState(int i10, int i11) {
        AdGroup adGroup;
        int i12;
        AdGroup[] adGroupArr = this.adGroups;
        return i10 < adGroupArr.length && (i12 = (adGroup = adGroupArr[i10]).count) != -1 && i11 < i12 && adGroup.states[i11] == 4;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("AdPlaybackState(adsId=");
        sb2.append(this.adsId);
        sb2.append(", adResumePositionUs=");
        sb2.append(this.adResumePositionUs);
        sb2.append(", adGroups=[");
        for (int i10 = 0; i10 < this.adGroups.length; i10++) {
            sb2.append("adGroup(timeUs=");
            sb2.append(this.adGroupTimesUs[i10]);
            sb2.append(", ads=[");
            for (int i11 = 0; i11 < this.adGroups[i10].states.length; i11++) {
                sb2.append("ad(state=");
                int i12 = this.adGroups[i10].states[i11];
                if (i12 == 0) {
                    sb2.append('_');
                } else if (i12 == 1) {
                    sb2.append('R');
                } else if (i12 == 2) {
                    sb2.append('S');
                } else if (i12 == 3) {
                    sb2.append('P');
                } else if (i12 != 4) {
                    sb2.append('?');
                } else {
                    sb2.append('!');
                }
                sb2.append(", durationUs=");
                sb2.append(this.adGroups[i10].durationsUs[i11]);
                sb2.append(')');
                if (i11 < this.adGroups[i10].states.length - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("])");
            if (i10 < this.adGroups.length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("])");
        return sb2.toString();
    }

    public AdPlaybackState withAdCount(int i10, int i11) {
        Assertions.checkArgument(i11 > 0);
        AdGroup[] adGroupArr = this.adGroups;
        if (adGroupArr[i10].count == i11) {
            return this;
        }
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i10] = this.adGroups[i10].withAdCount(i11);
        return new AdPlaybackState(this.adsId, this.adGroupTimesUs, adGroupArr2, this.adResumePositionUs, this.contentDurationUs);
    }

    public AdPlaybackState withAdDurationsUs(long[][] jArr) {
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        for (int i10 = 0; i10 < this.adGroupCount; i10++) {
            adGroupArr2[i10] = adGroupArr2[i10].withAdDurationsUs(jArr[i10]);
        }
        return new AdPlaybackState(this.adsId, this.adGroupTimesUs, adGroupArr2, this.adResumePositionUs, this.contentDurationUs);
    }

    public AdPlaybackState withAdLoadError(int i10, int i11) {
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i10] = adGroupArr2[i10].withAdState(4, i11);
        return new AdPlaybackState(this.adsId, this.adGroupTimesUs, adGroupArr2, this.adResumePositionUs, this.contentDurationUs);
    }

    public AdPlaybackState withAdResumePositionUs(long j10) {
        return this.adResumePositionUs == j10 ? this : new AdPlaybackState(this.adsId, this.adGroupTimesUs, this.adGroups, j10, this.contentDurationUs);
    }

    public AdPlaybackState withAdUri(int i10, int i11, Uri uri) {
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i10] = adGroupArr2[i10].withAdUri(uri, i11);
        return new AdPlaybackState(this.adsId, this.adGroupTimesUs, adGroupArr2, this.adResumePositionUs, this.contentDurationUs);
    }

    public AdPlaybackState withContentDurationUs(long j10) {
        return this.contentDurationUs == j10 ? this : new AdPlaybackState(this.adsId, this.adGroupTimesUs, this.adGroups, this.adResumePositionUs, j10);
    }

    public AdPlaybackState withPlayedAd(int i10, int i11) {
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i10] = adGroupArr2[i10].withAdState(3, i11);
        return new AdPlaybackState(this.adsId, this.adGroupTimesUs, adGroupArr2, this.adResumePositionUs, this.contentDurationUs);
    }

    public AdPlaybackState withSkippedAd(int i10, int i11) {
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i10] = adGroupArr2[i10].withAdState(2, i11);
        return new AdPlaybackState(this.adsId, this.adGroupTimesUs, adGroupArr2, this.adResumePositionUs, this.contentDurationUs);
    }

    public AdPlaybackState withSkippedAdGroup(int i10) {
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i10] = adGroupArr2[i10].withAllAdsSkipped();
        return new AdPlaybackState(this.adsId, this.adGroupTimesUs, adGroupArr2, this.adResumePositionUs, this.contentDurationUs);
    }

    private AdPlaybackState(Object obj, long[] jArr, AdGroup[] adGroupArr, long j10, long j11) {
        this.adsId = obj;
        this.adGroupTimesUs = jArr;
        this.adResumePositionUs = j10;
        this.contentDurationUs = j11;
        int length = jArr.length;
        this.adGroupCount = length;
        if (adGroupArr == null) {
            adGroupArr = new AdGroup[length];
            for (int i10 = 0; i10 < this.adGroupCount; i10++) {
                adGroupArr[i10] = new AdGroup();
            }
        }
        this.adGroups = adGroupArr;
    }
}
