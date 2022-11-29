package com.google.android.exoplayer2.trackselection;

import android.util.Pair;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.RendererConfiguration;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

/* loaded from: classes3.dex */
public abstract class MappingTrackSelector extends TrackSelector {
    private MappedTrackInfo currentMappedTrackInfo;

    private static int findRenderer(RendererCapabilities[] rendererCapabilitiesArr, TrackGroup trackGroup, int[] iArr, boolean z10) throws ExoPlaybackException {
        int length = rendererCapabilitiesArr.length;
        boolean z11 = true;
        int i10 = 0;
        for (int i11 = 0; i11 < rendererCapabilitiesArr.length; i11++) {
            RendererCapabilities rendererCapabilities = rendererCapabilitiesArr[i11];
            int i12 = 0;
            for (int i13 = 0; i13 < trackGroup.length; i13++) {
                i12 = Math.max(i12, RendererCapabilities.getFormatSupport(rendererCapabilities.supportsFormat(trackGroup.getFormat(i13))));
            }
            boolean z12 = iArr[i11] == 0;
            if (i12 > i10 || (i12 == i10 && z10 && !z11 && z12)) {
                length = i11;
                z11 = z12;
                i10 = i12;
            }
        }
        return length;
    }

    private static int[] getFormatSupport(RendererCapabilities rendererCapabilities, TrackGroup trackGroup) throws ExoPlaybackException {
        int[] iArr = new int[trackGroup.length];
        for (int i10 = 0; i10 < trackGroup.length; i10++) {
            iArr[i10] = rendererCapabilities.supportsFormat(trackGroup.getFormat(i10));
        }
        return iArr;
    }

    private static int[] getMixedMimeTypeAdaptationSupports(RendererCapabilities[] rendererCapabilitiesArr) throws ExoPlaybackException {
        int length = rendererCapabilitiesArr.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = rendererCapabilitiesArr[i10].supportsMixedMimeTypeAdaptation();
        }
        return iArr;
    }

    public final MappedTrackInfo getCurrentMappedTrackInfo() {
        return this.currentMappedTrackInfo;
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelector
    public final void onSelectionActivated(Object obj) {
        this.currentMappedTrackInfo = (MappedTrackInfo) obj;
    }

    public abstract Pair<RendererConfiguration[], ExoTrackSelection[]> selectTracks(MappedTrackInfo mappedTrackInfo, int[][][] iArr, int[] iArr2, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline) throws ExoPlaybackException;

    @Override // com.google.android.exoplayer2.trackselection.TrackSelector
    public final TrackSelectorResult selectTracks(RendererCapabilities[] rendererCapabilitiesArr, TrackGroupArray trackGroupArray, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline) throws ExoPlaybackException {
        int[] formatSupport;
        int[] iArr = new int[rendererCapabilitiesArr.length + 1];
        int length = rendererCapabilitiesArr.length + 1;
        TrackGroup[][] trackGroupArr = new TrackGroup[length];
        int[][][] iArr2 = new int[rendererCapabilitiesArr.length + 1][];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = trackGroupArray.length;
            trackGroupArr[i10] = new TrackGroup[i11];
            iArr2[i10] = new int[i11];
        }
        int[] mixedMimeTypeAdaptationSupports = getMixedMimeTypeAdaptationSupports(rendererCapabilitiesArr);
        for (int i12 = 0; i12 < trackGroupArray.length; i12++) {
            TrackGroup trackGroup = trackGroupArray.get(i12);
            int findRenderer = findRenderer(rendererCapabilitiesArr, trackGroup, iArr, MimeTypes.getTrackType(trackGroup.getFormat(0).sampleMimeType) == 5);
            if (findRenderer == rendererCapabilitiesArr.length) {
                formatSupport = new int[trackGroup.length];
            } else {
                formatSupport = getFormatSupport(rendererCapabilitiesArr[findRenderer], trackGroup);
            }
            int i13 = iArr[findRenderer];
            trackGroupArr[findRenderer][i13] = trackGroup;
            iArr2[findRenderer][i13] = formatSupport;
            iArr[findRenderer] = iArr[findRenderer] + 1;
        }
        TrackGroupArray[] trackGroupArrayArr = new TrackGroupArray[rendererCapabilitiesArr.length];
        String[] strArr = new String[rendererCapabilitiesArr.length];
        int[] iArr3 = new int[rendererCapabilitiesArr.length];
        for (int i14 = 0; i14 < rendererCapabilitiesArr.length; i14++) {
            int i15 = iArr[i14];
            trackGroupArrayArr[i14] = new TrackGroupArray((TrackGroup[]) Util.nullSafeArrayCopy(trackGroupArr[i14], i15));
            iArr2[i14] = (int[][]) Util.nullSafeArrayCopy(iArr2[i14], i15);
            strArr[i14] = rendererCapabilitiesArr[i14].getName();
            iArr3[i14] = rendererCapabilitiesArr[i14].getTrackType();
        }
        MappedTrackInfo mappedTrackInfo = new MappedTrackInfo(strArr, iArr3, trackGroupArrayArr, mixedMimeTypeAdaptationSupports, iArr2, new TrackGroupArray((TrackGroup[]) Util.nullSafeArrayCopy(trackGroupArr[rendererCapabilitiesArr.length], iArr[rendererCapabilitiesArr.length])));
        Pair<RendererConfiguration[], ExoTrackSelection[]> selectTracks = selectTracks(mappedTrackInfo, iArr2, mixedMimeTypeAdaptationSupports, mediaPeriodId, timeline);
        return new TrackSelectorResult((RendererConfiguration[]) selectTracks.first, (ExoTrackSelection[]) selectTracks.second, mappedTrackInfo);
    }

    /* loaded from: classes3.dex */
    public static final class MappedTrackInfo {
        public static final int RENDERER_SUPPORT_EXCEEDS_CAPABILITIES_TRACKS = 2;
        public static final int RENDERER_SUPPORT_NO_TRACKS = 0;
        public static final int RENDERER_SUPPORT_PLAYABLE_TRACKS = 3;
        public static final int RENDERER_SUPPORT_UNSUPPORTED_TRACKS = 1;
        private final int rendererCount;
        private final int[][][] rendererFormatSupports;
        private final int[] rendererMixedMimeTypeAdaptiveSupports;
        private final String[] rendererNames;
        private final TrackGroupArray[] rendererTrackGroups;
        private final int[] rendererTrackTypes;
        private final TrackGroupArray unmappedTrackGroups;

        public MappedTrackInfo(String[] strArr, int[] iArr, TrackGroupArray[] trackGroupArrayArr, int[] iArr2, int[][][] iArr3, TrackGroupArray trackGroupArray) {
            this.rendererNames = strArr;
            this.rendererTrackTypes = iArr;
            this.rendererTrackGroups = trackGroupArrayArr;
            this.rendererFormatSupports = iArr3;
            this.rendererMixedMimeTypeAdaptiveSupports = iArr2;
            this.unmappedTrackGroups = trackGroupArray;
            this.rendererCount = iArr.length;
        }

        public int getAdaptiveSupport(int i10, int i11, boolean z10) {
            int i12 = this.rendererTrackGroups[i10].get(i11).length;
            int[] iArr = new int[i12];
            int i13 = 0;
            for (int i14 = 0; i14 < i12; i14++) {
                int trackSupport = getTrackSupport(i10, i11, i14);
                if (trackSupport == 4 || (z10 && trackSupport == 3)) {
                    iArr[i13] = i14;
                    i13++;
                }
            }
            return getAdaptiveSupport(i10, i11, Arrays.copyOf(iArr, i13));
        }

        public int getRendererCount() {
            return this.rendererCount;
        }

        public String getRendererName(int i10) {
            return this.rendererNames[i10];
        }

        public int getRendererSupport(int i10) {
            int[][] iArr;
            int i11 = 0;
            for (int[] iArr2 : this.rendererFormatSupports[i10]) {
                for (int i12 : iArr2) {
                    int formatSupport = RendererCapabilities.getFormatSupport(i12);
                    int i13 = 2;
                    if (formatSupport == 0 || formatSupport == 1 || formatSupport == 2) {
                        i13 = 1;
                    } else if (formatSupport != 3) {
                        if (formatSupport == 4) {
                            return 3;
                        }
                        throw new IllegalStateException();
                    }
                    i11 = Math.max(i11, i13);
                }
            }
            return i11;
        }

        public int getRendererType(int i10) {
            return this.rendererTrackTypes[i10];
        }

        public TrackGroupArray getTrackGroups(int i10) {
            return this.rendererTrackGroups[i10];
        }

        public int getTrackSupport(int i10, int i11, int i12) {
            return RendererCapabilities.getFormatSupport(this.rendererFormatSupports[i10][i11][i12]);
        }

        public int getTypeSupport(int i10) {
            int i11 = 0;
            for (int i12 = 0; i12 < this.rendererCount; i12++) {
                if (this.rendererTrackTypes[i12] == i10) {
                    i11 = Math.max(i11, getRendererSupport(i12));
                }
            }
            return i11;
        }

        public TrackGroupArray getUnmappedTrackGroups() {
            return this.unmappedTrackGroups;
        }

        public int getAdaptiveSupport(int i10, int i11, int[] iArr) {
            int i12 = 0;
            int i13 = 16;
            String str = null;
            boolean z10 = false;
            int i14 = 0;
            while (i12 < iArr.length) {
                String str2 = this.rendererTrackGroups[i10].get(i11).getFormat(iArr[i12]).sampleMimeType;
                int i15 = i14 + 1;
                if (i14 == 0) {
                    str = str2;
                } else {
                    z10 |= !Util.areEqual(str, str2);
                }
                i13 = Math.min(i13, RendererCapabilities.getAdaptiveSupport(this.rendererFormatSupports[i10][i11][i12]));
                i12++;
                i14 = i15;
            }
            return z10 ? Math.min(i13, this.rendererMixedMimeTypeAdaptiveSupports[i10]) : i13;
        }
    }
}
