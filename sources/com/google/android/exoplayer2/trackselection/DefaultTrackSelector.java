package com.google.android.exoplayer2.trackselection;

import android.content.Context;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.RendererConfiguration;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.trackselection.MappingTrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectionParameters;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import lk.k0;
import lk.m;
import lk.r;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* loaded from: classes3.dex */
public class DefaultTrackSelector extends MappingTrackSelector {
    private static final float FRACTION_TO_CONSIDER_FULLSCREEN = 0.98f;
    private final AtomicReference<Parameters> parametersReference;
    private final ExoTrackSelection.Factory trackSelectionFactory;
    private static final int[] NO_TRACKS = new int[0];
    private static final k0<Integer> FORMAT_VALUE_ORDERING = k0.a(c.f26993w);
    private static final k0<Integer> NO_ORDER = k0.a(b.f26992w);

    /* loaded from: classes3.dex */
    public static final class AudioTrackScore implements Comparable<AudioTrackScore> {
        private final int bitrate;
        private final int channelCount;
        private final boolean isDefaultSelectionFlag;
        public final boolean isWithinConstraints;
        private final boolean isWithinRendererCapabilities;
        private final String language;
        private final int localeLanguageMatchIndex;
        private final int localeLanguageScore;
        private final Parameters parameters;
        private final int preferredLanguageIndex;
        private final int preferredLanguageScore;
        private final int preferredMimeTypeMatchIndex;
        private final int preferredRoleFlagsScore;
        private final int sampleRate;

        public AudioTrackScore(Format format, Parameters parameters, int i10) {
            int i11;
            int i12;
            int i13;
            this.parameters = parameters;
            this.language = DefaultTrackSelector.normalizeUndeterminedLanguageToNull(format.language);
            int i14 = 0;
            this.isWithinRendererCapabilities = DefaultTrackSelector.isSupported(i10, false);
            int i15 = 0;
            while (true) {
                i11 = Integer.MAX_VALUE;
                if (i15 >= parameters.preferredAudioLanguages.size()) {
                    i12 = 0;
                    i15 = Integer.MAX_VALUE;
                    break;
                }
                i12 = DefaultTrackSelector.getFormatLanguageScore(format, parameters.preferredAudioLanguages.get(i15), false);
                if (i12 > 0) {
                    break;
                }
                i15++;
            }
            this.preferredLanguageIndex = i15;
            this.preferredLanguageScore = i12;
            this.preferredRoleFlagsScore = Integer.bitCount(format.roleFlags & parameters.preferredAudioRoleFlags);
            boolean z10 = true;
            this.isDefaultSelectionFlag = (format.selectionFlags & 1) != 0;
            int i16 = format.channelCount;
            this.channelCount = i16;
            this.sampleRate = format.sampleRate;
            int i17 = format.bitrate;
            this.bitrate = i17;
            if ((i17 != -1 && i17 > parameters.maxAudioBitrate) || (i16 != -1 && i16 > parameters.maxAudioChannelCount)) {
                z10 = false;
            }
            this.isWithinConstraints = z10;
            String[] systemLanguageCodes = Util.getSystemLanguageCodes();
            int i18 = 0;
            while (true) {
                if (i18 >= systemLanguageCodes.length) {
                    i13 = 0;
                    i18 = Integer.MAX_VALUE;
                    break;
                }
                i13 = DefaultTrackSelector.getFormatLanguageScore(format, systemLanguageCodes[i18], false);
                if (i13 > 0) {
                    break;
                }
                i18++;
            }
            this.localeLanguageMatchIndex = i18;
            this.localeLanguageScore = i13;
            while (true) {
                if (i14 < parameters.preferredAudioMimeTypes.size()) {
                    String str = format.sampleMimeType;
                    if (str != null && str.equals(parameters.preferredAudioMimeTypes.get(i14))) {
                        i11 = i14;
                        break;
                    }
                    i14++;
                } else {
                    break;
                }
            }
            this.preferredMimeTypeMatchIndex = i11;
        }

        @Override // java.lang.Comparable
        public int compareTo(AudioTrackScore audioTrackScore) {
            k0 f10 = (this.isWithinConstraints && this.isWithinRendererCapabilities) ? DefaultTrackSelector.FORMAT_VALUE_ORDERING : DefaultTrackSelector.FORMAT_VALUE_ORDERING.f();
            m f11 = m.j().g(this.isWithinRendererCapabilities, audioTrackScore.isWithinRendererCapabilities).f(Integer.valueOf(this.preferredLanguageIndex), Integer.valueOf(audioTrackScore.preferredLanguageIndex), k0.c().f()).d(this.preferredLanguageScore, audioTrackScore.preferredLanguageScore).d(this.preferredRoleFlagsScore, audioTrackScore.preferredRoleFlagsScore).g(this.isWithinConstraints, audioTrackScore.isWithinConstraints).f(Integer.valueOf(this.preferredMimeTypeMatchIndex), Integer.valueOf(audioTrackScore.preferredMimeTypeMatchIndex), k0.c().f()).f(Integer.valueOf(this.bitrate), Integer.valueOf(audioTrackScore.bitrate), this.parameters.forceLowestBitrate ? DefaultTrackSelector.FORMAT_VALUE_ORDERING.f() : DefaultTrackSelector.NO_ORDER).g(this.isDefaultSelectionFlag, audioTrackScore.isDefaultSelectionFlag).f(Integer.valueOf(this.localeLanguageMatchIndex), Integer.valueOf(audioTrackScore.localeLanguageMatchIndex), k0.c().f()).d(this.localeLanguageScore, audioTrackScore.localeLanguageScore).f(Integer.valueOf(this.channelCount), Integer.valueOf(audioTrackScore.channelCount), f10).f(Integer.valueOf(this.sampleRate), Integer.valueOf(audioTrackScore.sampleRate), f10);
            Integer valueOf = Integer.valueOf(this.bitrate);
            Integer valueOf2 = Integer.valueOf(audioTrackScore.bitrate);
            if (!Util.areEqual(this.language, audioTrackScore.language)) {
                f10 = DefaultTrackSelector.NO_ORDER;
            }
            return f11.f(valueOf, valueOf2, f10).i();
        }
    }

    /* loaded from: classes3.dex */
    public static final class OtherTrackScore implements Comparable<OtherTrackScore> {
        private final boolean isDefault;
        private final boolean isWithinRendererCapabilities;

        public OtherTrackScore(Format format, int i10) {
            this.isDefault = (format.selectionFlags & 1) != 0;
            this.isWithinRendererCapabilities = DefaultTrackSelector.isSupported(i10, false);
        }

        @Override // java.lang.Comparable
        public int compareTo(OtherTrackScore otherTrackScore) {
            return m.j().g(this.isWithinRendererCapabilities, otherTrackScore.isWithinRendererCapabilities).g(this.isDefault, otherTrackScore.isDefault).i();
        }
    }

    /* loaded from: classes3.dex */
    public static final class Parameters extends TrackSelectionParameters {
        public final boolean allowAudioMixedChannelCountAdaptiveness;
        public final boolean allowAudioMixedMimeTypeAdaptiveness;
        public final boolean allowAudioMixedSampleRateAdaptiveness;
        public final boolean allowMultipleAdaptiveSelections;
        public final boolean allowVideoMixedMimeTypeAdaptiveness;
        public final boolean allowVideoNonSeamlessAdaptiveness;
        public final boolean exceedAudioConstraintsIfNecessary;
        public final boolean exceedRendererCapabilitiesIfNecessary;
        public final boolean exceedVideoConstraintsIfNecessary;
        public final boolean forceHighestSupportedBitrate;
        public final boolean forceLowestBitrate;
        public final int maxAudioBitrate;
        public final int maxAudioChannelCount;
        public final int maxVideoBitrate;
        public final int maxVideoFrameRate;
        public final int maxVideoHeight;
        public final int maxVideoWidth;
        public final int minVideoBitrate;
        public final int minVideoFrameRate;
        public final int minVideoHeight;
        public final int minVideoWidth;
        public final r<String> preferredAudioMimeTypes;
        public final r<String> preferredVideoMimeTypes;
        private final SparseBooleanArray rendererDisabledFlags;
        private final SparseArray<Map<TrackGroupArray, SelectionOverride>> selectionOverrides;
        public final boolean tunnelingEnabled;
        public final int viewportHeight;
        public final boolean viewportOrientationMayChange;
        public final int viewportWidth;
        public static final Parameters DEFAULT_WITHOUT_CONTEXT = new ParametersBuilder().build();
        public static final Parcelable.Creator<Parameters> CREATOR = new Parcelable.Creator<Parameters>() { // from class: com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Parameters createFromParcel(Parcel parcel) {
                return new Parameters(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Parameters[] newArray(int i10) {
                return new Parameters[i10];
            }
        };

        public Parameters(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10, boolean z11, boolean z12, int i18, int i19, boolean z13, r<String> rVar, r<String> rVar2, int i20, int i21, int i22, boolean z14, boolean z15, boolean z16, boolean z17, r<String> rVar3, r<String> rVar4, int i23, boolean z18, int i24, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray, SparseBooleanArray sparseBooleanArray) {
            super(rVar2, i20, rVar4, i23, z18, i24);
            this.maxVideoWidth = i10;
            this.maxVideoHeight = i11;
            this.maxVideoFrameRate = i12;
            this.maxVideoBitrate = i13;
            this.minVideoWidth = i14;
            this.minVideoHeight = i15;
            this.minVideoFrameRate = i16;
            this.minVideoBitrate = i17;
            this.exceedVideoConstraintsIfNecessary = z10;
            this.allowVideoMixedMimeTypeAdaptiveness = z11;
            this.allowVideoNonSeamlessAdaptiveness = z12;
            this.viewportWidth = i18;
            this.viewportHeight = i19;
            this.viewportOrientationMayChange = z13;
            this.preferredVideoMimeTypes = rVar;
            this.maxAudioChannelCount = i21;
            this.maxAudioBitrate = i22;
            this.exceedAudioConstraintsIfNecessary = z14;
            this.allowAudioMixedMimeTypeAdaptiveness = z15;
            this.allowAudioMixedSampleRateAdaptiveness = z16;
            this.allowAudioMixedChannelCountAdaptiveness = z17;
            this.preferredAudioMimeTypes = rVar3;
            this.forceLowestBitrate = z19;
            this.forceHighestSupportedBitrate = z20;
            this.exceedRendererCapabilitiesIfNecessary = z21;
            this.tunnelingEnabled = z22;
            this.allowMultipleAdaptiveSelections = z23;
            this.selectionOverrides = sparseArray;
            this.rendererDisabledFlags = sparseBooleanArray;
        }

        private static boolean areRendererDisabledFlagsEqual(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i10)) < 0) {
                    return false;
                }
            }
            return true;
        }

        private static boolean areSelectionOverridesEqual(SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray, SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i10));
                if (indexOfKey < 0 || !areSelectionOverridesEqual(sparseArray.valueAt(i10), sparseArray2.valueAt(indexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        public static Parameters getDefaults(Context context) {
            return new ParametersBuilder(context).build();
        }

        private static SparseArray<Map<TrackGroupArray, SelectionOverride>> readSelectionOverrides(Parcel parcel) {
            int readInt = parcel.readInt();
            SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray = new SparseArray<>(readInt);
            for (int i10 = 0; i10 < readInt; i10++) {
                int readInt2 = parcel.readInt();
                int readInt3 = parcel.readInt();
                HashMap hashMap = new HashMap(readInt3);
                for (int i11 = 0; i11 < readInt3; i11++) {
                    hashMap.put((TrackGroupArray) Assertions.checkNotNull((TrackGroupArray) parcel.readParcelable(TrackGroupArray.class.getClassLoader())), (SelectionOverride) parcel.readParcelable(SelectionOverride.class.getClassLoader()));
                }
                sparseArray.put(readInt2, hashMap);
            }
            return sparseArray;
        }

        private static void writeSelectionOverridesToParcel(Parcel parcel, SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray) {
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i10 = 0; i10 < size; i10++) {
                int keyAt = sparseArray.keyAt(i10);
                Map<TrackGroupArray, SelectionOverride> valueAt = sparseArray.valueAt(i10);
                int size2 = valueAt.size();
                parcel.writeInt(keyAt);
                parcel.writeInt(size2);
                for (Map.Entry<TrackGroupArray, SelectionOverride> entry : valueAt.entrySet()) {
                    parcel.writeParcelable(entry.getKey(), 0);
                    parcel.writeParcelable(entry.getValue(), 0);
                }
            }
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Parameters.class != obj.getClass()) {
                return false;
            }
            Parameters parameters = (Parameters) obj;
            return super.equals(obj) && this.maxVideoWidth == parameters.maxVideoWidth && this.maxVideoHeight == parameters.maxVideoHeight && this.maxVideoFrameRate == parameters.maxVideoFrameRate && this.maxVideoBitrate == parameters.maxVideoBitrate && this.minVideoWidth == parameters.minVideoWidth && this.minVideoHeight == parameters.minVideoHeight && this.minVideoFrameRate == parameters.minVideoFrameRate && this.minVideoBitrate == parameters.minVideoBitrate && this.exceedVideoConstraintsIfNecessary == parameters.exceedVideoConstraintsIfNecessary && this.allowVideoMixedMimeTypeAdaptiveness == parameters.allowVideoMixedMimeTypeAdaptiveness && this.allowVideoNonSeamlessAdaptiveness == parameters.allowVideoNonSeamlessAdaptiveness && this.viewportOrientationMayChange == parameters.viewportOrientationMayChange && this.viewportWidth == parameters.viewportWidth && this.viewportHeight == parameters.viewportHeight && this.preferredVideoMimeTypes.equals(parameters.preferredVideoMimeTypes) && this.maxAudioChannelCount == parameters.maxAudioChannelCount && this.maxAudioBitrate == parameters.maxAudioBitrate && this.exceedAudioConstraintsIfNecessary == parameters.exceedAudioConstraintsIfNecessary && this.allowAudioMixedMimeTypeAdaptiveness == parameters.allowAudioMixedMimeTypeAdaptiveness && this.allowAudioMixedSampleRateAdaptiveness == parameters.allowAudioMixedSampleRateAdaptiveness && this.allowAudioMixedChannelCountAdaptiveness == parameters.allowAudioMixedChannelCountAdaptiveness && this.preferredAudioMimeTypes.equals(parameters.preferredAudioMimeTypes) && this.forceLowestBitrate == parameters.forceLowestBitrate && this.forceHighestSupportedBitrate == parameters.forceHighestSupportedBitrate && this.exceedRendererCapabilitiesIfNecessary == parameters.exceedRendererCapabilitiesIfNecessary && this.tunnelingEnabled == parameters.tunnelingEnabled && this.allowMultipleAdaptiveSelections == parameters.allowMultipleAdaptiveSelections && areRendererDisabledFlagsEqual(this.rendererDisabledFlags, parameters.rendererDisabledFlags) && areSelectionOverridesEqual(this.selectionOverrides, parameters.selectionOverrides);
        }

        public final boolean getRendererDisabled(int i10) {
            return this.rendererDisabledFlags.get(i10);
        }

        public final SelectionOverride getSelectionOverride(int i10, TrackGroupArray trackGroupArray) {
            Map<TrackGroupArray, SelectionOverride> map = this.selectionOverrides.get(i10);
            if (map != null) {
                return map.get(trackGroupArray);
            }
            return null;
        }

        public final boolean hasSelectionOverride(int i10, TrackGroupArray trackGroupArray) {
            Map<TrackGroupArray, SelectionOverride> map = this.selectionOverrides.get(i10);
            return map != null && map.containsKey(trackGroupArray);
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters
        public int hashCode() {
            return (((((((((((((((((((((((((((((((((((((((((((((((((((((super.hashCode() * 31) + this.maxVideoWidth) * 31) + this.maxVideoHeight) * 31) + this.maxVideoFrameRate) * 31) + this.maxVideoBitrate) * 31) + this.minVideoWidth) * 31) + this.minVideoHeight) * 31) + this.minVideoFrameRate) * 31) + this.minVideoBitrate) * 31) + (this.exceedVideoConstraintsIfNecessary ? 1 : 0)) * 31) + (this.allowVideoMixedMimeTypeAdaptiveness ? 1 : 0)) * 31) + (this.allowVideoNonSeamlessAdaptiveness ? 1 : 0)) * 31) + (this.viewportOrientationMayChange ? 1 : 0)) * 31) + this.viewportWidth) * 31) + this.viewportHeight) * 31) + this.preferredVideoMimeTypes.hashCode()) * 31) + this.maxAudioChannelCount) * 31) + this.maxAudioBitrate) * 31) + (this.exceedAudioConstraintsIfNecessary ? 1 : 0)) * 31) + (this.allowAudioMixedMimeTypeAdaptiveness ? 1 : 0)) * 31) + (this.allowAudioMixedSampleRateAdaptiveness ? 1 : 0)) * 31) + (this.allowAudioMixedChannelCountAdaptiveness ? 1 : 0)) * 31) + this.preferredAudioMimeTypes.hashCode()) * 31) + (this.forceLowestBitrate ? 1 : 0)) * 31) + (this.forceHighestSupportedBitrate ? 1 : 0)) * 31) + (this.exceedRendererCapabilitiesIfNecessary ? 1 : 0)) * 31) + (this.tunnelingEnabled ? 1 : 0)) * 31) + (this.allowMultipleAdaptiveSelections ? 1 : 0);
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.maxVideoWidth);
            parcel.writeInt(this.maxVideoHeight);
            parcel.writeInt(this.maxVideoFrameRate);
            parcel.writeInt(this.maxVideoBitrate);
            parcel.writeInt(this.minVideoWidth);
            parcel.writeInt(this.minVideoHeight);
            parcel.writeInt(this.minVideoFrameRate);
            parcel.writeInt(this.minVideoBitrate);
            Util.writeBoolean(parcel, this.exceedVideoConstraintsIfNecessary);
            Util.writeBoolean(parcel, this.allowVideoMixedMimeTypeAdaptiveness);
            Util.writeBoolean(parcel, this.allowVideoNonSeamlessAdaptiveness);
            parcel.writeInt(this.viewportWidth);
            parcel.writeInt(this.viewportHeight);
            Util.writeBoolean(parcel, this.viewportOrientationMayChange);
            parcel.writeList(this.preferredVideoMimeTypes);
            parcel.writeInt(this.maxAudioChannelCount);
            parcel.writeInt(this.maxAudioBitrate);
            Util.writeBoolean(parcel, this.exceedAudioConstraintsIfNecessary);
            Util.writeBoolean(parcel, this.allowAudioMixedMimeTypeAdaptiveness);
            Util.writeBoolean(parcel, this.allowAudioMixedSampleRateAdaptiveness);
            Util.writeBoolean(parcel, this.allowAudioMixedChannelCountAdaptiveness);
            parcel.writeList(this.preferredAudioMimeTypes);
            Util.writeBoolean(parcel, this.forceLowestBitrate);
            Util.writeBoolean(parcel, this.forceHighestSupportedBitrate);
            Util.writeBoolean(parcel, this.exceedRendererCapabilitiesIfNecessary);
            Util.writeBoolean(parcel, this.tunnelingEnabled);
            Util.writeBoolean(parcel, this.allowMultipleAdaptiveSelections);
            writeSelectionOverridesToParcel(parcel, this.selectionOverrides);
            parcel.writeSparseBooleanArray(this.rendererDisabledFlags);
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters
        public ParametersBuilder buildUpon() {
            return new ParametersBuilder(this);
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static boolean areSelectionOverridesEqual(java.util.Map<com.google.android.exoplayer2.source.TrackGroupArray, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride> r4, java.util.Map<com.google.android.exoplayer2.source.TrackGroupArray, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride> r5) {
            /*
                int r0 = r4.size()
                int r1 = r5.size()
                r2 = 0
                if (r1 == r0) goto Lc
                return r2
            Lc:
                java.util.Set r4 = r4.entrySet()
                java.util.Iterator r4 = r4.iterator()
            L14:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L3b
                java.lang.Object r0 = r4.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r1 = r0.getKey()
                com.google.android.exoplayer2.source.TrackGroupArray r1 = (com.google.android.exoplayer2.source.TrackGroupArray) r1
                boolean r3 = r5.containsKey(r1)
                if (r3 == 0) goto L3a
                java.lang.Object r0 = r0.getValue()
                java.lang.Object r1 = r5.get(r1)
                boolean r0 = com.google.android.exoplayer2.util.Util.areEqual(r0, r1)
                if (r0 != 0) goto L14
            L3a:
                return r2
            L3b:
                r4 = 1
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.areSelectionOverridesEqual(java.util.Map, java.util.Map):boolean");
        }

        public Parameters(Parcel parcel) {
            super(parcel);
            this.maxVideoWidth = parcel.readInt();
            this.maxVideoHeight = parcel.readInt();
            this.maxVideoFrameRate = parcel.readInt();
            this.maxVideoBitrate = parcel.readInt();
            this.minVideoWidth = parcel.readInt();
            this.minVideoHeight = parcel.readInt();
            this.minVideoFrameRate = parcel.readInt();
            this.minVideoBitrate = parcel.readInt();
            this.exceedVideoConstraintsIfNecessary = Util.readBoolean(parcel);
            this.allowVideoMixedMimeTypeAdaptiveness = Util.readBoolean(parcel);
            this.allowVideoNonSeamlessAdaptiveness = Util.readBoolean(parcel);
            this.viewportWidth = parcel.readInt();
            this.viewportHeight = parcel.readInt();
            this.viewportOrientationMayChange = Util.readBoolean(parcel);
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, null);
            this.preferredVideoMimeTypes = r.u(arrayList);
            this.maxAudioChannelCount = parcel.readInt();
            this.maxAudioBitrate = parcel.readInt();
            this.exceedAudioConstraintsIfNecessary = Util.readBoolean(parcel);
            this.allowAudioMixedMimeTypeAdaptiveness = Util.readBoolean(parcel);
            this.allowAudioMixedSampleRateAdaptiveness = Util.readBoolean(parcel);
            this.allowAudioMixedChannelCountAdaptiveness = Util.readBoolean(parcel);
            ArrayList arrayList2 = new ArrayList();
            parcel.readList(arrayList2, null);
            this.preferredAudioMimeTypes = r.u(arrayList2);
            this.forceLowestBitrate = Util.readBoolean(parcel);
            this.forceHighestSupportedBitrate = Util.readBoolean(parcel);
            this.exceedRendererCapabilitiesIfNecessary = Util.readBoolean(parcel);
            this.tunnelingEnabled = Util.readBoolean(parcel);
            this.allowMultipleAdaptiveSelections = Util.readBoolean(parcel);
            this.selectionOverrides = readSelectionOverrides(parcel);
            this.rendererDisabledFlags = (SparseBooleanArray) Util.castNonNull(parcel.readSparseBooleanArray());
        }
    }

    /* loaded from: classes3.dex */
    public static final class ParametersBuilder extends TrackSelectionParameters.Builder {
        private boolean allowAudioMixedChannelCountAdaptiveness;
        private boolean allowAudioMixedMimeTypeAdaptiveness;
        private boolean allowAudioMixedSampleRateAdaptiveness;
        private boolean allowMultipleAdaptiveSelections;
        private boolean allowVideoMixedMimeTypeAdaptiveness;
        private boolean allowVideoNonSeamlessAdaptiveness;
        private boolean exceedAudioConstraintsIfNecessary;
        private boolean exceedRendererCapabilitiesIfNecessary;
        private boolean exceedVideoConstraintsIfNecessary;
        private boolean forceHighestSupportedBitrate;
        private boolean forceLowestBitrate;
        private int maxAudioBitrate;
        private int maxAudioChannelCount;
        private int maxVideoBitrate;
        private int maxVideoFrameRate;
        private int maxVideoHeight;
        private int maxVideoWidth;
        private int minVideoBitrate;
        private int minVideoFrameRate;
        private int minVideoHeight;
        private int minVideoWidth;
        private r<String> preferredAudioMimeTypes;
        private r<String> preferredVideoMimeTypes;
        private final SparseBooleanArray rendererDisabledFlags;
        private final SparseArray<Map<TrackGroupArray, SelectionOverride>> selectionOverrides;
        private boolean tunnelingEnabled;
        private int viewportHeight;
        private boolean viewportOrientationMayChange;
        private int viewportWidth;

        private static SparseArray<Map<TrackGroupArray, SelectionOverride>> cloneSelectionOverrides(SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray) {
            SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray2 = new SparseArray<>();
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                sparseArray2.put(sparseArray.keyAt(i10), new HashMap(sparseArray.valueAt(i10)));
            }
            return sparseArray2;
        }

        @EnsuresNonNull({"preferredVideoMimeTypes", "preferredAudioMimeTypes"})
        private void setInitialValuesWithoutContext() {
            this.maxVideoWidth = Integer.MAX_VALUE;
            this.maxVideoHeight = Integer.MAX_VALUE;
            this.maxVideoFrameRate = Integer.MAX_VALUE;
            this.maxVideoBitrate = Integer.MAX_VALUE;
            this.exceedVideoConstraintsIfNecessary = true;
            this.allowVideoMixedMimeTypeAdaptiveness = false;
            this.allowVideoNonSeamlessAdaptiveness = true;
            this.viewportWidth = Integer.MAX_VALUE;
            this.viewportHeight = Integer.MAX_VALUE;
            this.viewportOrientationMayChange = true;
            this.preferredVideoMimeTypes = r.A();
            this.maxAudioChannelCount = Integer.MAX_VALUE;
            this.maxAudioBitrate = Integer.MAX_VALUE;
            this.exceedAudioConstraintsIfNecessary = true;
            this.allowAudioMixedMimeTypeAdaptiveness = false;
            this.allowAudioMixedSampleRateAdaptiveness = false;
            this.allowAudioMixedChannelCountAdaptiveness = false;
            this.preferredAudioMimeTypes = r.A();
            this.forceLowestBitrate = false;
            this.forceHighestSupportedBitrate = false;
            this.exceedRendererCapabilitiesIfNecessary = true;
            this.tunnelingEnabled = false;
            this.allowMultipleAdaptiveSelections = true;
        }

        public final ParametersBuilder clearSelectionOverride(int i10, TrackGroupArray trackGroupArray) {
            Map<TrackGroupArray, SelectionOverride> map = this.selectionOverrides.get(i10);
            if (map != null && map.containsKey(trackGroupArray)) {
                map.remove(trackGroupArray);
                if (map.isEmpty()) {
                    this.selectionOverrides.remove(i10);
                }
            }
            return this;
        }

        public final ParametersBuilder clearSelectionOverrides(int i10) {
            Map<TrackGroupArray, SelectionOverride> map = this.selectionOverrides.get(i10);
            if (map != null && !map.isEmpty()) {
                this.selectionOverrides.remove(i10);
            }
            return this;
        }

        public ParametersBuilder clearVideoSizeConstraints() {
            return setMaxVideoSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }

        public ParametersBuilder clearViewportSizeConstraints() {
            return setViewportSize(Integer.MAX_VALUE, Integer.MAX_VALUE, true);
        }

        public ParametersBuilder setAllowAudioMixedChannelCountAdaptiveness(boolean z10) {
            this.allowAudioMixedChannelCountAdaptiveness = z10;
            return this;
        }

        public ParametersBuilder setAllowAudioMixedMimeTypeAdaptiveness(boolean z10) {
            this.allowAudioMixedMimeTypeAdaptiveness = z10;
            return this;
        }

        public ParametersBuilder setAllowAudioMixedSampleRateAdaptiveness(boolean z10) {
            this.allowAudioMixedSampleRateAdaptiveness = z10;
            return this;
        }

        public ParametersBuilder setAllowMultipleAdaptiveSelections(boolean z10) {
            this.allowMultipleAdaptiveSelections = z10;
            return this;
        }

        public ParametersBuilder setAllowVideoMixedMimeTypeAdaptiveness(boolean z10) {
            this.allowVideoMixedMimeTypeAdaptiveness = z10;
            return this;
        }

        public ParametersBuilder setAllowVideoNonSeamlessAdaptiveness(boolean z10) {
            this.allowVideoNonSeamlessAdaptiveness = z10;
            return this;
        }

        public ParametersBuilder setExceedAudioConstraintsIfNecessary(boolean z10) {
            this.exceedAudioConstraintsIfNecessary = z10;
            return this;
        }

        public ParametersBuilder setExceedRendererCapabilitiesIfNecessary(boolean z10) {
            this.exceedRendererCapabilitiesIfNecessary = z10;
            return this;
        }

        public ParametersBuilder setExceedVideoConstraintsIfNecessary(boolean z10) {
            this.exceedVideoConstraintsIfNecessary = z10;
            return this;
        }

        public ParametersBuilder setForceHighestSupportedBitrate(boolean z10) {
            this.forceHighestSupportedBitrate = z10;
            return this;
        }

        public ParametersBuilder setForceLowestBitrate(boolean z10) {
            this.forceLowestBitrate = z10;
            return this;
        }

        public ParametersBuilder setMaxAudioBitrate(int i10) {
            this.maxAudioBitrate = i10;
            return this;
        }

        public ParametersBuilder setMaxAudioChannelCount(int i10) {
            this.maxAudioChannelCount = i10;
            return this;
        }

        public ParametersBuilder setMaxVideoBitrate(int i10) {
            this.maxVideoBitrate = i10;
            return this;
        }

        public ParametersBuilder setMaxVideoFrameRate(int i10) {
            this.maxVideoFrameRate = i10;
            return this;
        }

        public ParametersBuilder setMaxVideoSize(int i10, int i11) {
            this.maxVideoWidth = i10;
            this.maxVideoHeight = i11;
            return this;
        }

        public ParametersBuilder setMaxVideoSizeSd() {
            return setMaxVideoSize(1279, 719);
        }

        public ParametersBuilder setMinVideoBitrate(int i10) {
            this.minVideoBitrate = i10;
            return this;
        }

        public ParametersBuilder setMinVideoFrameRate(int i10) {
            this.minVideoFrameRate = i10;
            return this;
        }

        public ParametersBuilder setMinVideoSize(int i10, int i11) {
            this.minVideoWidth = i10;
            this.minVideoHeight = i11;
            return this;
        }

        public ParametersBuilder setPreferredAudioMimeType(String str) {
            return str == null ? setPreferredAudioMimeTypes(new String[0]) : setPreferredAudioMimeTypes(str);
        }

        public ParametersBuilder setPreferredAudioMimeTypes(String... strArr) {
            this.preferredAudioMimeTypes = r.w(strArr);
            return this;
        }

        public ParametersBuilder setPreferredVideoMimeType(String str) {
            return str == null ? setPreferredVideoMimeTypes(new String[0]) : setPreferredVideoMimeTypes(str);
        }

        public ParametersBuilder setPreferredVideoMimeTypes(String... strArr) {
            this.preferredVideoMimeTypes = r.w(strArr);
            return this;
        }

        public final ParametersBuilder setRendererDisabled(int i10, boolean z10) {
            if (this.rendererDisabledFlags.get(i10) == z10) {
                return this;
            }
            if (z10) {
                this.rendererDisabledFlags.put(i10, true);
            } else {
                this.rendererDisabledFlags.delete(i10);
            }
            return this;
        }

        public final ParametersBuilder setSelectionOverride(int i10, TrackGroupArray trackGroupArray, SelectionOverride selectionOverride) {
            Map<TrackGroupArray, SelectionOverride> map = this.selectionOverrides.get(i10);
            if (map == null) {
                map = new HashMap<>();
                this.selectionOverrides.put(i10, map);
            }
            if (map.containsKey(trackGroupArray) && Util.areEqual(map.get(trackGroupArray), selectionOverride)) {
                return this;
            }
            map.put(trackGroupArray, selectionOverride);
            return this;
        }

        public ParametersBuilder setTunnelingEnabled(boolean z10) {
            this.tunnelingEnabled = z10;
            return this;
        }

        public ParametersBuilder setViewportSize(int i10, int i11, boolean z10) {
            this.viewportWidth = i10;
            this.viewportHeight = i11;
            this.viewportOrientationMayChange = z10;
            return this;
        }

        public ParametersBuilder setViewportSizeToPhysicalDisplaySize(Context context, boolean z10) {
            Point currentDisplayModeSize = Util.getCurrentDisplayModeSize(context);
            return setViewportSize(currentDisplayModeSize.x, currentDisplayModeSize.y, z10);
        }

        @Deprecated
        public ParametersBuilder() {
            setInitialValuesWithoutContext();
            this.selectionOverrides = new SparseArray<>();
            this.rendererDisabledFlags = new SparseBooleanArray();
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public Parameters build() {
            return new Parameters(this.maxVideoWidth, this.maxVideoHeight, this.maxVideoFrameRate, this.maxVideoBitrate, this.minVideoWidth, this.minVideoHeight, this.minVideoFrameRate, this.minVideoBitrate, this.exceedVideoConstraintsIfNecessary, this.allowVideoMixedMimeTypeAdaptiveness, this.allowVideoNonSeamlessAdaptiveness, this.viewportWidth, this.viewportHeight, this.viewportOrientationMayChange, this.preferredVideoMimeTypes, this.preferredAudioLanguages, this.preferredAudioRoleFlags, this.maxAudioChannelCount, this.maxAudioBitrate, this.exceedAudioConstraintsIfNecessary, this.allowAudioMixedMimeTypeAdaptiveness, this.allowAudioMixedSampleRateAdaptiveness, this.allowAudioMixedChannelCountAdaptiveness, this.preferredAudioMimeTypes, this.preferredTextLanguages, this.preferredTextRoleFlags, this.selectUndeterminedTextLanguage, this.disabledTextTrackSelectionFlags, this.forceLowestBitrate, this.forceHighestSupportedBitrate, this.exceedRendererCapabilitiesIfNecessary, this.tunnelingEnabled, this.allowMultipleAdaptiveSelections, this.selectionOverrides, this.rendererDisabledFlags);
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setDisabledTextTrackSelectionFlags(int i10) {
            super.setDisabledTextTrackSelectionFlags(i10);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredAudioLanguage(String str) {
            super.setPreferredAudioLanguage(str);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredAudioLanguages(String... strArr) {
            super.setPreferredAudioLanguages(strArr);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredAudioRoleFlags(int i10) {
            super.setPreferredAudioRoleFlags(i10);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredTextLanguage(String str) {
            super.setPreferredTextLanguage(str);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(Context context) {
            super.setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(context);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredTextLanguages(String... strArr) {
            super.setPreferredTextLanguages(strArr);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredTextRoleFlags(int i10) {
            super.setPreferredTextRoleFlags(i10);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setSelectUndeterminedTextLanguage(boolean z10) {
            super.setSelectUndeterminedTextLanguage(z10);
            return this;
        }

        public final ParametersBuilder clearSelectionOverrides() {
            if (this.selectionOverrides.size() == 0) {
                return this;
            }
            this.selectionOverrides.clear();
            return this;
        }

        public ParametersBuilder(Context context) {
            super(context);
            setInitialValuesWithoutContext();
            this.selectionOverrides = new SparseArray<>();
            this.rendererDisabledFlags = new SparseBooleanArray();
            setViewportSizeToPhysicalDisplaySize(context, true);
        }

        private ParametersBuilder(Parameters parameters) {
            super(parameters);
            this.maxVideoWidth = parameters.maxVideoWidth;
            this.maxVideoHeight = parameters.maxVideoHeight;
            this.maxVideoFrameRate = parameters.maxVideoFrameRate;
            this.maxVideoBitrate = parameters.maxVideoBitrate;
            this.minVideoWidth = parameters.minVideoWidth;
            this.minVideoHeight = parameters.minVideoHeight;
            this.minVideoFrameRate = parameters.minVideoFrameRate;
            this.minVideoBitrate = parameters.minVideoBitrate;
            this.exceedVideoConstraintsIfNecessary = parameters.exceedVideoConstraintsIfNecessary;
            this.allowVideoMixedMimeTypeAdaptiveness = parameters.allowVideoMixedMimeTypeAdaptiveness;
            this.allowVideoNonSeamlessAdaptiveness = parameters.allowVideoNonSeamlessAdaptiveness;
            this.viewportWidth = parameters.viewportWidth;
            this.viewportHeight = parameters.viewportHeight;
            this.viewportOrientationMayChange = parameters.viewportOrientationMayChange;
            this.preferredVideoMimeTypes = parameters.preferredVideoMimeTypes;
            this.maxAudioChannelCount = parameters.maxAudioChannelCount;
            this.maxAudioBitrate = parameters.maxAudioBitrate;
            this.exceedAudioConstraintsIfNecessary = parameters.exceedAudioConstraintsIfNecessary;
            this.allowAudioMixedMimeTypeAdaptiveness = parameters.allowAudioMixedMimeTypeAdaptiveness;
            this.allowAudioMixedSampleRateAdaptiveness = parameters.allowAudioMixedSampleRateAdaptiveness;
            this.allowAudioMixedChannelCountAdaptiveness = parameters.allowAudioMixedChannelCountAdaptiveness;
            this.preferredAudioMimeTypes = parameters.preferredAudioMimeTypes;
            this.forceLowestBitrate = parameters.forceLowestBitrate;
            this.forceHighestSupportedBitrate = parameters.forceHighestSupportedBitrate;
            this.exceedRendererCapabilitiesIfNecessary = parameters.exceedRendererCapabilitiesIfNecessary;
            this.tunnelingEnabled = parameters.tunnelingEnabled;
            this.allowMultipleAdaptiveSelections = parameters.allowMultipleAdaptiveSelections;
            this.selectionOverrides = cloneSelectionOverrides(parameters.selectionOverrides);
            this.rendererDisabledFlags = parameters.rendererDisabledFlags.clone();
        }
    }

    /* loaded from: classes3.dex */
    public static final class SelectionOverride implements Parcelable {
        public static final Parcelable.Creator<SelectionOverride> CREATOR = new Parcelable.Creator<SelectionOverride>() { // from class: com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SelectionOverride createFromParcel(Parcel parcel) {
                return new SelectionOverride(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SelectionOverride[] newArray(int i10) {
                return new SelectionOverride[i10];
            }
        };
        public final int data;
        public final int groupIndex;
        public final int length;
        public final int reason;
        public final int[] tracks;

        public SelectionOverride(int i10, int... iArr) {
            this(i10, iArr, 2, 0);
        }

        public boolean containsTrack(int i10) {
            for (int i11 : this.tracks) {
                if (i11 == i10) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || SelectionOverride.class != obj.getClass()) {
                return false;
            }
            SelectionOverride selectionOverride = (SelectionOverride) obj;
            return this.groupIndex == selectionOverride.groupIndex && Arrays.equals(this.tracks, selectionOverride.tracks) && this.reason == selectionOverride.reason && this.data == selectionOverride.data;
        }

        public int hashCode() {
            return (((((this.groupIndex * 31) + Arrays.hashCode(this.tracks)) * 31) + this.reason) * 31) + this.data;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.groupIndex);
            parcel.writeInt(this.tracks.length);
            parcel.writeIntArray(this.tracks);
            parcel.writeInt(this.reason);
            parcel.writeInt(this.data);
        }

        public SelectionOverride(int i10, int[] iArr, int i11, int i12) {
            this.groupIndex = i10;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.tracks = copyOf;
            this.length = iArr.length;
            this.reason = i11;
            this.data = i12;
            Arrays.sort(copyOf);
        }

        public SelectionOverride(Parcel parcel) {
            this.groupIndex = parcel.readInt();
            int readByte = parcel.readByte();
            this.length = readByte;
            int[] iArr = new int[readByte];
            this.tracks = iArr;
            parcel.readIntArray(iArr);
            this.reason = parcel.readInt();
            this.data = parcel.readInt();
        }
    }

    /* loaded from: classes3.dex */
    public static final class TextTrackScore implements Comparable<TextTrackScore> {
        private final boolean hasCaptionRoleFlags;
        private final boolean isDefault;
        private final boolean isForced;
        public final boolean isWithinConstraints;
        private final boolean isWithinRendererCapabilities;
        private final int preferredLanguageIndex;
        private final int preferredLanguageScore;
        private final int preferredRoleFlagsScore;
        private final int selectedAudioLanguageScore;

        public TextTrackScore(Format format, Parameters parameters, int i10, String str) {
            r<String> rVar;
            int i11;
            boolean z10 = false;
            this.isWithinRendererCapabilities = DefaultTrackSelector.isSupported(i10, false);
            int i12 = format.selectionFlags & (~parameters.disabledTextTrackSelectionFlags);
            this.isDefault = (i12 & 1) != 0;
            this.isForced = (i12 & 2) != 0;
            int i13 = Integer.MAX_VALUE;
            if (parameters.preferredTextLanguages.isEmpty()) {
                rVar = r.B("");
            } else {
                rVar = parameters.preferredTextLanguages;
            }
            int i14 = 0;
            while (true) {
                if (i14 >= rVar.size()) {
                    i11 = 0;
                    break;
                }
                i11 = DefaultTrackSelector.getFormatLanguageScore(format, rVar.get(i14), parameters.selectUndeterminedTextLanguage);
                if (i11 > 0) {
                    i13 = i14;
                    break;
                }
                i14++;
            }
            this.preferredLanguageIndex = i13;
            this.preferredLanguageScore = i11;
            int bitCount = Integer.bitCount(format.roleFlags & parameters.preferredTextRoleFlags);
            this.preferredRoleFlagsScore = bitCount;
            this.hasCaptionRoleFlags = (format.roleFlags & 1088) != 0;
            int formatLanguageScore = DefaultTrackSelector.getFormatLanguageScore(format, str, DefaultTrackSelector.normalizeUndeterminedLanguageToNull(str) == null);
            this.selectedAudioLanguageScore = formatLanguageScore;
            if (i11 > 0 || ((parameters.preferredTextLanguages.isEmpty() && bitCount > 0) || this.isDefault || (this.isForced && formatLanguageScore > 0))) {
                z10 = true;
            }
            this.isWithinConstraints = z10;
        }

        @Override // java.lang.Comparable
        public int compareTo(TextTrackScore textTrackScore) {
            m d10 = m.j().g(this.isWithinRendererCapabilities, textTrackScore.isWithinRendererCapabilities).f(Integer.valueOf(this.preferredLanguageIndex), Integer.valueOf(textTrackScore.preferredLanguageIndex), k0.c().f()).d(this.preferredLanguageScore, textTrackScore.preferredLanguageScore).d(this.preferredRoleFlagsScore, textTrackScore.preferredRoleFlagsScore).g(this.isDefault, textTrackScore.isDefault).f(Boolean.valueOf(this.isForced), Boolean.valueOf(textTrackScore.isForced), this.preferredLanguageScore == 0 ? k0.c() : k0.c().f()).d(this.selectedAudioLanguageScore, textTrackScore.selectedAudioLanguageScore);
            if (this.preferredRoleFlagsScore == 0) {
                d10 = d10.h(this.hasCaptionRoleFlags, textTrackScore.hasCaptionRoleFlags);
            }
            return d10.i();
        }
    }

    /* loaded from: classes3.dex */
    public static final class VideoTrackScore implements Comparable<VideoTrackScore> {
        private final int bitrate;
        public final boolean isWithinMaxConstraints;
        private final boolean isWithinMinConstraints;
        private final boolean isWithinRendererCapabilities;
        private final Parameters parameters;
        private final int pixelCount;
        private final int preferredMimeTypeMatchIndex;

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0053, code lost:
            if (r10 < r8.minVideoFrameRate) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x005b, code lost:
            if (r10 < r8.minVideoBitrate) goto L54;
         */
        /* JADX WARN: Removed duplicated region for block: B:34:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0091 A[EDGE_INSN: B:53:0x0091->B:51:0x0091 ?: BREAK  , SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public VideoTrackScore(com.google.android.exoplayer2.Format r7, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters r8, int r9, boolean r10) {
            /*
                r6 = this;
                r6.<init>()
                r6.parameters = r8
                r0 = -1082130432(0xffffffffbf800000, float:-1.0)
                r1 = 1
                r2 = 0
                r3 = -1
                if (r10 == 0) goto L33
                int r4 = r7.width
                if (r4 == r3) goto L14
                int r5 = r8.maxVideoWidth
                if (r4 > r5) goto L33
            L14:
                int r4 = r7.height
                if (r4 == r3) goto L1c
                int r5 = r8.maxVideoHeight
                if (r4 > r5) goto L33
            L1c:
                float r4 = r7.frameRate
                int r5 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r5 == 0) goto L29
                int r5 = r8.maxVideoFrameRate
                float r5 = (float) r5
                int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                if (r4 > 0) goto L33
            L29:
                int r4 = r7.bitrate
                if (r4 == r3) goto L31
                int r5 = r8.maxVideoBitrate
                if (r4 > r5) goto L33
            L31:
                r4 = r1
                goto L34
            L33:
                r4 = r2
            L34:
                r6.isWithinMaxConstraints = r4
                if (r10 == 0) goto L5e
                int r10 = r7.width
                if (r10 == r3) goto L40
                int r4 = r8.minVideoWidth
                if (r10 < r4) goto L5e
            L40:
                int r10 = r7.height
                if (r10 == r3) goto L48
                int r4 = r8.minVideoHeight
                if (r10 < r4) goto L5e
            L48:
                float r10 = r7.frameRate
                int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r0 == 0) goto L55
                int r0 = r8.minVideoFrameRate
                float r0 = (float) r0
                int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r10 < 0) goto L5e
            L55:
                int r10 = r7.bitrate
                if (r10 == r3) goto L5f
                int r0 = r8.minVideoBitrate
                if (r10 < r0) goto L5e
                goto L5f
            L5e:
                r1 = r2
            L5f:
                r6.isWithinMinConstraints = r1
                boolean r9 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.isSupported(r9, r2)
                r6.isWithinRendererCapabilities = r9
                int r9 = r7.bitrate
                r6.bitrate = r9
                int r9 = r7.getPixelCount()
                r6.pixelCount = r9
                r9 = 2147483647(0x7fffffff, float:NaN)
            L74:
                lk.r<java.lang.String> r10 = r8.preferredVideoMimeTypes
                int r10 = r10.size()
                if (r2 >= r10) goto L91
                java.lang.String r10 = r7.sampleMimeType
                if (r10 == 0) goto L8e
                lk.r<java.lang.String> r0 = r8.preferredVideoMimeTypes
                java.lang.Object r0 = r0.get(r2)
                boolean r10 = r10.equals(r0)
                if (r10 == 0) goto L8e
                r9 = r2
                goto L91
            L8e:
                int r2 = r2 + 1
                goto L74
            L91:
                r6.preferredMimeTypeMatchIndex = r9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.trackselection.DefaultTrackSelector.VideoTrackScore.<init>(com.google.android.exoplayer2.Format, com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters, int, boolean):void");
        }

        @Override // java.lang.Comparable
        public int compareTo(VideoTrackScore videoTrackScore) {
            k0 f10 = (this.isWithinMaxConstraints && this.isWithinRendererCapabilities) ? DefaultTrackSelector.FORMAT_VALUE_ORDERING : DefaultTrackSelector.FORMAT_VALUE_ORDERING.f();
            return m.j().g(this.isWithinRendererCapabilities, videoTrackScore.isWithinRendererCapabilities).g(this.isWithinMaxConstraints, videoTrackScore.isWithinMaxConstraints).g(this.isWithinMinConstraints, videoTrackScore.isWithinMinConstraints).f(Integer.valueOf(this.preferredMimeTypeMatchIndex), Integer.valueOf(videoTrackScore.preferredMimeTypeMatchIndex), k0.c().f()).f(Integer.valueOf(this.bitrate), Integer.valueOf(videoTrackScore.bitrate), this.parameters.forceLowestBitrate ? DefaultTrackSelector.FORMAT_VALUE_ORDERING.f() : DefaultTrackSelector.NO_ORDER).f(Integer.valueOf(this.pixelCount), Integer.valueOf(videoTrackScore.pixelCount), f10).f(Integer.valueOf(this.bitrate), Integer.valueOf(videoTrackScore.bitrate), f10).i();
        }
    }

    @Deprecated
    public DefaultTrackSelector() {
        this(Parameters.DEFAULT_WITHOUT_CONTEXT, new AdaptiveTrackSelection.Factory());
    }

    private static void filterAdaptiveVideoTrackCountForMimeType(TrackGroup trackGroup, int[] iArr, int i10, String str, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, List<Integer> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            int intValue = list.get(size).intValue();
            if (!isSupportedAdaptiveVideoTrack(trackGroup.getFormat(intValue), str, iArr[intValue], i10, i11, i12, i13, i14, i15, i16, i17, i18)) {
                list.remove(size);
            }
        }
    }

    private static int[] getAdaptiveAudioTracks(TrackGroup trackGroup, int[] iArr, int i10, int i11, boolean z10, boolean z11, boolean z12) {
        Format format = trackGroup.getFormat(i10);
        int[] iArr2 = new int[trackGroup.length];
        int i12 = 0;
        for (int i13 = 0; i13 < trackGroup.length; i13++) {
            if (i13 == i10 || isSupportedAdaptiveAudioTrack(trackGroup.getFormat(i13), iArr[i13], format, i11, z10, z11, z12)) {
                iArr2[i12] = i13;
                i12++;
            }
        }
        return Arrays.copyOf(iArr2, i12);
    }

    private static int getAdaptiveVideoTrackCountForMimeType(TrackGroup trackGroup, int[] iArr, int i10, String str, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, List<Integer> list) {
        int i19 = 0;
        for (int i20 = 0; i20 < list.size(); i20++) {
            int intValue = list.get(i20).intValue();
            if (isSupportedAdaptiveVideoTrack(trackGroup.getFormat(intValue), str, iArr[intValue], i10, i11, i12, i13, i14, i15, i16, i17, i18)) {
                i19++;
            }
        }
        return i19;
    }

    private static int[] getAdaptiveVideoTracksForGroup(TrackGroup trackGroup, int[] iArr, boolean z10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, boolean z11) {
        String str;
        int i21;
        int i22;
        HashSet hashSet;
        if (trackGroup.length < 2) {
            return NO_TRACKS;
        }
        List<Integer> viewportFilteredTrackIndices = getViewportFilteredTrackIndices(trackGroup, i19, i20, z11);
        if (viewportFilteredTrackIndices.size() < 2) {
            return NO_TRACKS;
        }
        if (z10) {
            str = null;
        } else {
            HashSet hashSet2 = new HashSet();
            String str2 = null;
            int i23 = 0;
            int i24 = 0;
            while (i24 < viewportFilteredTrackIndices.size()) {
                String str3 = trackGroup.getFormat(viewportFilteredTrackIndices.get(i24).intValue()).sampleMimeType;
                if (hashSet2.add(str3)) {
                    i21 = i23;
                    i22 = i24;
                    hashSet = hashSet2;
                    int adaptiveVideoTrackCountForMimeType = getAdaptiveVideoTrackCountForMimeType(trackGroup, iArr, i10, str3, i11, i12, i13, i14, i15, i16, i17, i18, viewportFilteredTrackIndices);
                    if (adaptiveVideoTrackCountForMimeType > i21) {
                        i23 = adaptiveVideoTrackCountForMimeType;
                        str2 = str3;
                        i24 = i22 + 1;
                        hashSet2 = hashSet;
                    }
                } else {
                    i21 = i23;
                    i22 = i24;
                    hashSet = hashSet2;
                }
                i23 = i21;
                i24 = i22 + 1;
                hashSet2 = hashSet;
            }
            str = str2;
        }
        filterAdaptiveVideoTrackCountForMimeType(trackGroup, iArr, i10, str, i11, i12, i13, i14, i15, i16, i17, i18, viewportFilteredTrackIndices);
        return viewportFilteredTrackIndices.size() < 2 ? NO_TRACKS : mk.c.j(viewportFilteredTrackIndices);
    }

    public static int getFormatLanguageScore(Format format, String str, boolean z10) {
        if (TextUtils.isEmpty(str) || !str.equals(format.language)) {
            String normalizeUndeterminedLanguageToNull = normalizeUndeterminedLanguageToNull(str);
            String normalizeUndeterminedLanguageToNull2 = normalizeUndeterminedLanguageToNull(format.language);
            if (normalizeUndeterminedLanguageToNull2 == null || normalizeUndeterminedLanguageToNull == null) {
                return (z10 && normalizeUndeterminedLanguageToNull2 == null) ? 1 : 0;
            } else if (normalizeUndeterminedLanguageToNull2.startsWith(normalizeUndeterminedLanguageToNull) || normalizeUndeterminedLanguageToNull.startsWith(normalizeUndeterminedLanguageToNull2)) {
                return 3;
            } else {
                return Util.splitAtFirst(normalizeUndeterminedLanguageToNull2, "-")[0].equals(Util.splitAtFirst(normalizeUndeterminedLanguageToNull, "-")[0]) ? 2 : 0;
            }
        }
        return 4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x000d, code lost:
        if ((r6 > r7) != (r4 > r5)) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Point getMaxVideoSizeInViewport(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            if (r3 == 0) goto L10
            r3 = 1
            r0 = 0
            if (r6 <= r7) goto L8
            r1 = r3
            goto L9
        L8:
            r1 = r0
        L9:
            if (r4 <= r5) goto Lc
            goto Ld
        Lc:
            r3 = r0
        Ld:
            if (r1 == r3) goto L10
            goto L13
        L10:
            r2 = r5
            r5 = r4
            r4 = r2
        L13:
            int r3 = r6 * r4
            int r0 = r7 * r5
            if (r3 < r0) goto L23
            android.graphics.Point r3 = new android.graphics.Point
            int r4 = com.google.android.exoplayer2.util.Util.ceilDivide(r0, r6)
            r3.<init>(r5, r4)
            return r3
        L23:
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = com.google.android.exoplayer2.util.Util.ceilDivide(r3, r7)
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.trackselection.DefaultTrackSelector.getMaxVideoSizeInViewport(boolean, int, int, int, int):android.graphics.Point");
    }

    private static List<Integer> getViewportFilteredTrackIndices(TrackGroup trackGroup, int i10, int i11, boolean z10) {
        int i12;
        ArrayList arrayList = new ArrayList(trackGroup.length);
        for (int i13 = 0; i13 < trackGroup.length; i13++) {
            arrayList.add(Integer.valueOf(i13));
        }
        if (i10 != Integer.MAX_VALUE && i11 != Integer.MAX_VALUE) {
            int i14 = Integer.MAX_VALUE;
            for (int i15 = 0; i15 < trackGroup.length; i15++) {
                Format format = trackGroup.getFormat(i15);
                int i16 = format.width;
                if (i16 > 0 && (i12 = format.height) > 0) {
                    Point maxVideoSizeInViewport = getMaxVideoSizeInViewport(z10, i10, i11, i16, i12);
                    int i17 = format.width;
                    int i18 = format.height;
                    int i19 = i17 * i18;
                    if (i17 >= ((int) (maxVideoSizeInViewport.x * FRACTION_TO_CONSIDER_FULLSCREEN)) && i18 >= ((int) (maxVideoSizeInViewport.y * FRACTION_TO_CONSIDER_FULLSCREEN)) && i19 < i14) {
                        i14 = i19;
                    }
                }
            }
            if (i14 != Integer.MAX_VALUE) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    int pixelCount = trackGroup.getFormat(((Integer) arrayList.get(size)).intValue()).getPixelCount();
                    if (pixelCount == -1 || pixelCount > i14) {
                        arrayList.remove(size);
                    }
                }
            }
        }
        return arrayList;
    }

    public static boolean isSupported(int i10, boolean z10) {
        int formatSupport = RendererCapabilities.getFormatSupport(i10);
        return formatSupport == 4 || (z10 && formatSupport == 3);
    }

    private static boolean isSupportedAdaptiveAudioTrack(Format format, int i10, Format format2, int i11, boolean z10, boolean z11, boolean z12) {
        int i12;
        int i13;
        String str;
        int i14;
        if (!isSupported(i10, false) || (i12 = format.bitrate) == -1 || i12 > i11) {
            return false;
        }
        if (z12 || ((i14 = format.channelCount) != -1 && i14 == format2.channelCount)) {
            if (z10 || ((str = format.sampleMimeType) != null && TextUtils.equals(str, format2.sampleMimeType))) {
                return z11 || ((i13 = format.sampleRate) != -1 && i13 == format2.sampleRate);
            }
            return false;
        }
        return false;
    }

    private static boolean isSupportedAdaptiveVideoTrack(Format format, String str, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        if ((format.roleFlags & 16384) == 0 && isSupported(i10, false) && (i10 & i11) != 0) {
            if (str == null || Util.areEqual(format.sampleMimeType, str)) {
                int i20 = format.width;
                if (i20 == -1 || (i16 <= i20 && i20 <= i12)) {
                    int i21 = format.height;
                    if (i21 == -1 || (i17 <= i21 && i21 <= i13)) {
                        float f10 = format.frameRate;
                        if (f10 == -1.0f || (i18 <= f10 && f10 <= i14)) {
                            int i22 = format.bitrate;
                            return i22 == -1 || (i19 <= i22 && i22 <= i15);
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$static$0(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        } else if (num2.intValue() == -1) {
            return 1;
        } else {
            return num.intValue() - num2.intValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$static$1(Integer num, Integer num2) {
        return 0;
    }

    private static void maybeConfigureRenderersForTunneling(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, RendererConfiguration[] rendererConfigurationArr, ExoTrackSelection[] exoTrackSelectionArr) {
        boolean z10;
        boolean z11 = false;
        int i10 = -1;
        int i11 = -1;
        for (int i12 = 0; i12 < mappedTrackInfo.getRendererCount(); i12++) {
            int rendererType = mappedTrackInfo.getRendererType(i12);
            ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i12];
            if ((rendererType == 1 || rendererType == 2) && exoTrackSelection != null && rendererSupportsTunneling(iArr[i12], mappedTrackInfo.getTrackGroups(i12), exoTrackSelection)) {
                if (rendererType == 1) {
                    if (i11 != -1) {
                        z10 = false;
                        break;
                    }
                    i11 = i12;
                } else if (i10 != -1) {
                    z10 = false;
                    break;
                } else {
                    i10 = i12;
                }
            }
        }
        z10 = true;
        if (i11 != -1 && i10 != -1) {
            z11 = true;
        }
        if (z10 && z11) {
            RendererConfiguration rendererConfiguration = new RendererConfiguration(true);
            rendererConfigurationArr[i11] = rendererConfiguration;
            rendererConfigurationArr[i10] = rendererConfiguration;
        }
    }

    public static String normalizeUndeterminedLanguageToNull(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, C.LANGUAGE_UNDETERMINED)) {
            return null;
        }
        return str;
    }

    private static boolean rendererSupportsTunneling(int[][] iArr, TrackGroupArray trackGroupArray, ExoTrackSelection exoTrackSelection) {
        if (exoTrackSelection == null) {
            return false;
        }
        int indexOf = trackGroupArray.indexOf(exoTrackSelection.getTrackGroup());
        for (int i10 = 0; i10 < exoTrackSelection.length(); i10++) {
            if (RendererCapabilities.getTunnelingSupport(iArr[indexOf][exoTrackSelection.getIndexInTrackGroup(i10)]) != 32) {
                return false;
            }
        }
        return true;
    }

    private static ExoTrackSelection.Definition selectAdaptiveVideoTrack(TrackGroupArray trackGroupArray, int[][] iArr, int i10, Parameters parameters) {
        TrackGroupArray trackGroupArray2 = trackGroupArray;
        Parameters parameters2 = parameters;
        int i11 = parameters2.allowVideoNonSeamlessAdaptiveness ? 24 : 16;
        boolean z10 = parameters2.allowVideoMixedMimeTypeAdaptiveness && (i10 & i11) != 0;
        int i12 = 0;
        while (i12 < trackGroupArray2.length) {
            TrackGroup trackGroup = trackGroupArray2.get(i12);
            int i13 = i12;
            int[] adaptiveVideoTracksForGroup = getAdaptiveVideoTracksForGroup(trackGroup, iArr[i12], z10, i11, parameters2.maxVideoWidth, parameters2.maxVideoHeight, parameters2.maxVideoFrameRate, parameters2.maxVideoBitrate, parameters2.minVideoWidth, parameters2.minVideoHeight, parameters2.minVideoFrameRate, parameters2.minVideoBitrate, parameters2.viewportWidth, parameters2.viewportHeight, parameters2.viewportOrientationMayChange);
            if (adaptiveVideoTracksForGroup.length > 0) {
                return new ExoTrackSelection.Definition(trackGroup, adaptiveVideoTracksForGroup);
            }
            i12 = i13 + 1;
            trackGroupArray2 = trackGroupArray;
            parameters2 = parameters;
        }
        return null;
    }

    private static ExoTrackSelection.Definition selectFixedVideoTrack(TrackGroupArray trackGroupArray, int[][] iArr, Parameters parameters) {
        int i10 = -1;
        TrackGroup trackGroup = null;
        VideoTrackScore videoTrackScore = null;
        for (int i11 = 0; i11 < trackGroupArray.length; i11++) {
            TrackGroup trackGroup2 = trackGroupArray.get(i11);
            List<Integer> viewportFilteredTrackIndices = getViewportFilteredTrackIndices(trackGroup2, parameters.viewportWidth, parameters.viewportHeight, parameters.viewportOrientationMayChange);
            int[] iArr2 = iArr[i11];
            for (int i12 = 0; i12 < trackGroup2.length; i12++) {
                Format format = trackGroup2.getFormat(i12);
                if ((format.roleFlags & 16384) == 0 && isSupported(iArr2[i12], parameters.exceedRendererCapabilitiesIfNecessary)) {
                    VideoTrackScore videoTrackScore2 = new VideoTrackScore(format, parameters, iArr2[i12], viewportFilteredTrackIndices.contains(Integer.valueOf(i12)));
                    if ((videoTrackScore2.isWithinMaxConstraints || parameters.exceedVideoConstraintsIfNecessary) && (videoTrackScore == null || videoTrackScore2.compareTo(videoTrackScore) > 0)) {
                        trackGroup = trackGroup2;
                        i10 = i12;
                        videoTrackScore = videoTrackScore2;
                    }
                }
            }
        }
        if (trackGroup == null) {
            return null;
        }
        return new ExoTrackSelection.Definition(trackGroup, i10);
    }

    public ParametersBuilder buildUponParameters() {
        return getParameters().buildUpon();
    }

    public Parameters getParameters() {
        return this.parametersReference.get();
    }

    public ExoTrackSelection.Definition[] selectAllTracks(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, int[] iArr2, Parameters parameters) throws ExoPlaybackException {
        int i10;
        String str;
        int i11;
        AudioTrackScore audioTrackScore;
        String str2;
        int i12;
        int rendererCount = mappedTrackInfo.getRendererCount();
        ExoTrackSelection.Definition[] definitionArr = new ExoTrackSelection.Definition[rendererCount];
        int i13 = 0;
        boolean z10 = false;
        int i14 = 0;
        boolean z11 = false;
        while (true) {
            if (i14 >= rendererCount) {
                break;
            }
            if (2 == mappedTrackInfo.getRendererType(i14)) {
                if (!z10) {
                    definitionArr[i14] = selectVideoTrack(mappedTrackInfo.getTrackGroups(i14), iArr[i14], iArr2[i14], parameters, true);
                    z10 = definitionArr[i14] != null;
                }
                z11 |= mappedTrackInfo.getTrackGroups(i14).length > 0;
            }
            i14++;
        }
        int i15 = 0;
        int i16 = -1;
        AudioTrackScore audioTrackScore2 = null;
        String str3 = null;
        while (i15 < rendererCount) {
            if (i10 == mappedTrackInfo.getRendererType(i15)) {
                int i17 = (parameters.allowMultipleAdaptiveSelections || !z11) ? i10 : false;
                i11 = i16;
                audioTrackScore = audioTrackScore2;
                str2 = str3;
                i12 = i15;
                Pair<ExoTrackSelection.Definition, AudioTrackScore> selectAudioTrack = selectAudioTrack(mappedTrackInfo.getTrackGroups(i15), iArr[i15], iArr2[i15], parameters, i17);
                if (selectAudioTrack != null && (audioTrackScore == null || ((AudioTrackScore) selectAudioTrack.second).compareTo(audioTrackScore) > 0)) {
                    if (i11 != -1) {
                        definitionArr[i11] = null;
                    }
                    ExoTrackSelection.Definition definition = (ExoTrackSelection.Definition) selectAudioTrack.first;
                    definitionArr[i12] = definition;
                    str3 = definition.group.getFormat(definition.tracks[0]).language;
                    audioTrackScore2 = (AudioTrackScore) selectAudioTrack.second;
                    i16 = i12;
                    i15 = i12 + 1;
                    i10 = true;
                }
            } else {
                i11 = i16;
                audioTrackScore = audioTrackScore2;
                str2 = str3;
                i12 = i15;
            }
            i16 = i11;
            audioTrackScore2 = audioTrackScore;
            str3 = str2;
            i15 = i12 + 1;
            i10 = true;
        }
        String str4 = str3;
        int i18 = -1;
        TextTrackScore textTrackScore = null;
        while (i13 < rendererCount) {
            int rendererType = mappedTrackInfo.getRendererType(i13);
            if (rendererType != 1) {
                if (rendererType != 2) {
                    if (rendererType != 3) {
                        definitionArr[i13] = selectOtherTrack(rendererType, mappedTrackInfo.getTrackGroups(i13), iArr[i13], parameters);
                    } else {
                        str = str4;
                        Pair<ExoTrackSelection.Definition, TextTrackScore> selectTextTrack = selectTextTrack(mappedTrackInfo.getTrackGroups(i13), iArr[i13], parameters, str);
                        if (selectTextTrack != null && (textTrackScore == null || ((TextTrackScore) selectTextTrack.second).compareTo(textTrackScore) > 0)) {
                            if (i18 != -1) {
                                definitionArr[i18] = null;
                            }
                            definitionArr[i13] = (ExoTrackSelection.Definition) selectTextTrack.first;
                            textTrackScore = (TextTrackScore) selectTextTrack.second;
                            i18 = i13;
                        }
                    }
                }
                str = str4;
            } else {
                str = str4;
            }
            i13++;
            str4 = str;
        }
        return definitionArr;
    }

    public Pair<ExoTrackSelection.Definition, AudioTrackScore> selectAudioTrack(TrackGroupArray trackGroupArray, int[][] iArr, int i10, Parameters parameters, boolean z10) throws ExoPlaybackException {
        ExoTrackSelection.Definition definition = null;
        AudioTrackScore audioTrackScore = null;
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < trackGroupArray.length; i13++) {
            TrackGroup trackGroup = trackGroupArray.get(i13);
            int[] iArr2 = iArr[i13];
            for (int i14 = 0; i14 < trackGroup.length; i14++) {
                if (isSupported(iArr2[i14], parameters.exceedRendererCapabilitiesIfNecessary)) {
                    AudioTrackScore audioTrackScore2 = new AudioTrackScore(trackGroup.getFormat(i14), parameters, iArr2[i14]);
                    if ((audioTrackScore2.isWithinConstraints || parameters.exceedAudioConstraintsIfNecessary) && (audioTrackScore == null || audioTrackScore2.compareTo(audioTrackScore) > 0)) {
                        i11 = i13;
                        i12 = i14;
                        audioTrackScore = audioTrackScore2;
                    }
                }
            }
        }
        if (i11 == -1) {
            return null;
        }
        TrackGroup trackGroup2 = trackGroupArray.get(i11);
        if (!parameters.forceHighestSupportedBitrate && !parameters.forceLowestBitrate && z10) {
            int[] adaptiveAudioTracks = getAdaptiveAudioTracks(trackGroup2, iArr[i11], i12, parameters.maxAudioBitrate, parameters.allowAudioMixedMimeTypeAdaptiveness, parameters.allowAudioMixedSampleRateAdaptiveness, parameters.allowAudioMixedChannelCountAdaptiveness);
            if (adaptiveAudioTracks.length > 1) {
                definition = new ExoTrackSelection.Definition(trackGroup2, adaptiveAudioTracks);
            }
        }
        if (definition == null) {
            definition = new ExoTrackSelection.Definition(trackGroup2, i12);
        }
        return Pair.create(definition, (AudioTrackScore) Assertions.checkNotNull(audioTrackScore));
    }

    public ExoTrackSelection.Definition selectOtherTrack(int i10, TrackGroupArray trackGroupArray, int[][] iArr, Parameters parameters) throws ExoPlaybackException {
        TrackGroup trackGroup = null;
        OtherTrackScore otherTrackScore = null;
        int i11 = 0;
        for (int i12 = 0; i12 < trackGroupArray.length; i12++) {
            TrackGroup trackGroup2 = trackGroupArray.get(i12);
            int[] iArr2 = iArr[i12];
            for (int i13 = 0; i13 < trackGroup2.length; i13++) {
                if (isSupported(iArr2[i13], parameters.exceedRendererCapabilitiesIfNecessary)) {
                    OtherTrackScore otherTrackScore2 = new OtherTrackScore(trackGroup2.getFormat(i13), iArr2[i13]);
                    if (otherTrackScore == null || otherTrackScore2.compareTo(otherTrackScore) > 0) {
                        trackGroup = trackGroup2;
                        i11 = i13;
                        otherTrackScore = otherTrackScore2;
                    }
                }
            }
        }
        if (trackGroup == null) {
            return null;
        }
        return new ExoTrackSelection.Definition(trackGroup, i11);
    }

    public Pair<ExoTrackSelection.Definition, TextTrackScore> selectTextTrack(TrackGroupArray trackGroupArray, int[][] iArr, Parameters parameters, String str) throws ExoPlaybackException {
        int i10 = -1;
        TrackGroup trackGroup = null;
        TextTrackScore textTrackScore = null;
        for (int i11 = 0; i11 < trackGroupArray.length; i11++) {
            TrackGroup trackGroup2 = trackGroupArray.get(i11);
            int[] iArr2 = iArr[i11];
            for (int i12 = 0; i12 < trackGroup2.length; i12++) {
                if (isSupported(iArr2[i12], parameters.exceedRendererCapabilitiesIfNecessary)) {
                    TextTrackScore textTrackScore2 = new TextTrackScore(trackGroup2.getFormat(i12), parameters, iArr2[i12], str);
                    if (textTrackScore2.isWithinConstraints && (textTrackScore == null || textTrackScore2.compareTo(textTrackScore) > 0)) {
                        trackGroup = trackGroup2;
                        i10 = i12;
                        textTrackScore = textTrackScore2;
                    }
                }
            }
        }
        if (trackGroup == null) {
            return null;
        }
        return Pair.create(new ExoTrackSelection.Definition(trackGroup, i10), (TextTrackScore) Assertions.checkNotNull(textTrackScore));
    }

    @Override // com.google.android.exoplayer2.trackselection.MappingTrackSelector
    public final Pair<RendererConfiguration[], ExoTrackSelection[]> selectTracks(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, int[] iArr2, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline) throws ExoPlaybackException {
        Parameters parameters = this.parametersReference.get();
        int rendererCount = mappedTrackInfo.getRendererCount();
        ExoTrackSelection.Definition[] selectAllTracks = selectAllTracks(mappedTrackInfo, iArr, iArr2, parameters);
        int i10 = 0;
        while (true) {
            if (i10 >= rendererCount) {
                break;
            }
            if (parameters.getRendererDisabled(i10)) {
                selectAllTracks[i10] = null;
            } else {
                TrackGroupArray trackGroups = mappedTrackInfo.getTrackGroups(i10);
                if (parameters.hasSelectionOverride(i10, trackGroups)) {
                    SelectionOverride selectionOverride = parameters.getSelectionOverride(i10, trackGroups);
                    selectAllTracks[i10] = selectionOverride != null ? new ExoTrackSelection.Definition(trackGroups.get(selectionOverride.groupIndex), selectionOverride.tracks, selectionOverride.reason, Integer.valueOf(selectionOverride.data)) : null;
                }
            }
            i10++;
        }
        ExoTrackSelection[] createTrackSelections = this.trackSelectionFactory.createTrackSelections(selectAllTracks, getBandwidthMeter(), mediaPeriodId, timeline);
        RendererConfiguration[] rendererConfigurationArr = new RendererConfiguration[rendererCount];
        for (int i11 = 0; i11 < rendererCount; i11++) {
            rendererConfigurationArr[i11] = !parameters.getRendererDisabled(i11) && (mappedTrackInfo.getRendererType(i11) == 7 || createTrackSelections[i11] != null) ? RendererConfiguration.DEFAULT : null;
        }
        if (parameters.tunnelingEnabled) {
            maybeConfigureRenderersForTunneling(mappedTrackInfo, iArr, rendererConfigurationArr, createTrackSelections);
        }
        return Pair.create(rendererConfigurationArr, createTrackSelections);
    }

    public ExoTrackSelection.Definition selectVideoTrack(TrackGroupArray trackGroupArray, int[][] iArr, int i10, Parameters parameters, boolean z10) throws ExoPlaybackException {
        ExoTrackSelection.Definition selectAdaptiveVideoTrack = (parameters.forceHighestSupportedBitrate || parameters.forceLowestBitrate || !z10) ? null : selectAdaptiveVideoTrack(trackGroupArray, iArr, i10, parameters);
        return selectAdaptiveVideoTrack == null ? selectFixedVideoTrack(trackGroupArray, iArr, parameters) : selectAdaptiveVideoTrack;
    }

    public void setParameters(Parameters parameters) {
        Assertions.checkNotNull(parameters);
        if (this.parametersReference.getAndSet(parameters).equals(parameters)) {
            return;
        }
        invalidate();
    }

    @Deprecated
    public DefaultTrackSelector(ExoTrackSelection.Factory factory) {
        this(Parameters.DEFAULT_WITHOUT_CONTEXT, factory);
    }

    public DefaultTrackSelector(Context context) {
        this(context, new AdaptiveTrackSelection.Factory());
    }

    public DefaultTrackSelector(Context context, ExoTrackSelection.Factory factory) {
        this(Parameters.getDefaults(context), factory);
    }

    public void setParameters(ParametersBuilder parametersBuilder) {
        setParameters(parametersBuilder.build());
    }

    public DefaultTrackSelector(Parameters parameters, ExoTrackSelection.Factory factory) {
        this.trackSelectionFactory = factory;
        this.parametersReference = new AtomicReference<>(parameters);
    }
}
