package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.offline.StreamKey;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import lk.r;
import lk.t;
import lk.w;

/* loaded from: classes3.dex */
public final class HlsMediaPlaylist extends HlsPlaylist {
    public static final int PLAYLIST_TYPE_EVENT = 2;
    public static final int PLAYLIST_TYPE_UNKNOWN = 0;
    public static final int PLAYLIST_TYPE_VOD = 1;
    public final int discontinuitySequence;
    public final long durationUs;
    public final boolean hasDiscontinuitySequence;
    public final boolean hasEndTag;
    public final boolean hasProgramDateTime;
    public final long mediaSequence;
    public final long partTargetDurationUs;
    public final int playlistType;
    public final DrmInitData protectionSchemes;
    public final Map<Uri, RenditionReport> renditionReports;
    public final List<Segment> segments;
    public final ServerControl serverControl;
    public final long startOffsetUs;
    public final long startTimeUs;
    public final long targetDurationUs;
    public final List<Part> trailingParts;
    public final int version;

    /* loaded from: classes3.dex */
    public static final class Part extends SegmentBase {
        public final boolean isIndependent;
        public final boolean isPreload;

        public Part(String str, Segment segment, long j10, int i10, long j11, DrmInitData drmInitData, String str2, String str3, long j12, long j13, boolean z10, boolean z11, boolean z12) {
            super(str, segment, j10, i10, j11, drmInitData, str2, str3, j12, j13, z10);
            this.isIndependent = z11;
            this.isPreload = z12;
        }

        public Part copyWith(long j10, int i10) {
            return new Part(this.url, this.initializationSegment, this.durationUs, i10, j10, this.drmInitData, this.fullSegmentEncryptionKeyUri, this.encryptionIV, this.byteRangeOffset, this.byteRangeLength, this.hasGapTag, this.isIndependent, this.isPreload);
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface PlaylistType {
    }

    /* loaded from: classes3.dex */
    public static final class RenditionReport {
        public final long lastMediaSequence;
        public final int lastPartIndex;
        public final Uri playlistUri;

        public RenditionReport(Uri uri, long j10, int i10) {
            this.playlistUri = uri;
            this.lastMediaSequence = j10;
            this.lastPartIndex = i10;
        }
    }

    /* loaded from: classes3.dex */
    public static class SegmentBase implements Comparable<Long> {
        public final long byteRangeLength;
        public final long byteRangeOffset;
        public final DrmInitData drmInitData;
        public final long durationUs;
        public final String encryptionIV;
        public final String fullSegmentEncryptionKeyUri;
        public final boolean hasGapTag;
        public final Segment initializationSegment;
        public final int relativeDiscontinuitySequence;
        public final long relativeStartTimeUs;
        public final String url;

        private SegmentBase(String str, Segment segment, long j10, int i10, long j11, DrmInitData drmInitData, String str2, String str3, long j12, long j13, boolean z10) {
            this.url = str;
            this.initializationSegment = segment;
            this.durationUs = j10;
            this.relativeDiscontinuitySequence = i10;
            this.relativeStartTimeUs = j11;
            this.drmInitData = drmInitData;
            this.fullSegmentEncryptionKeyUri = str2;
            this.encryptionIV = str3;
            this.byteRangeOffset = j12;
            this.byteRangeLength = j13;
            this.hasGapTag = z10;
        }

        @Override // java.lang.Comparable
        public int compareTo(Long l10) {
            if (this.relativeStartTimeUs > l10.longValue()) {
                return 1;
            }
            return this.relativeStartTimeUs < l10.longValue() ? -1 : 0;
        }
    }

    /* loaded from: classes3.dex */
    public static final class ServerControl {
        public final boolean canBlockReload;
        public final boolean canSkipDateRanges;
        public final long holdBackUs;
        public final long partHoldBackUs;
        public final long skipUntilUs;

        public ServerControl(long j10, boolean z10, long j11, long j12, boolean z11) {
            this.skipUntilUs = j10;
            this.canSkipDateRanges = z10;
            this.holdBackUs = j11;
            this.partHoldBackUs = j12;
            this.canBlockReload = z11;
        }
    }

    public HlsMediaPlaylist(int i10, String str, List<String> list, long j10, long j11, boolean z10, int i11, long j12, int i12, long j13, long j14, boolean z11, boolean z12, boolean z13, DrmInitData drmInitData, List<Segment> list2, List<Part> list3, ServerControl serverControl, Map<Uri, RenditionReport> map) {
        super(str, list, z11);
        long j15;
        this.playlistType = i10;
        this.startTimeUs = j11;
        this.hasDiscontinuitySequence = z10;
        this.discontinuitySequence = i11;
        this.mediaSequence = j12;
        this.version = i12;
        this.targetDurationUs = j13;
        this.partTargetDurationUs = j14;
        this.hasEndTag = z12;
        this.hasProgramDateTime = z13;
        this.protectionSchemes = drmInitData;
        this.segments = r.u(list2);
        this.trailingParts = r.u(list3);
        this.renditionReports = t.f(map);
        if (!list3.isEmpty()) {
            Part part = (Part) w.c(list3);
            this.durationUs = part.relativeStartTimeUs + part.durationUs;
        } else if (!list2.isEmpty()) {
            Segment segment = (Segment) w.c(list2);
            this.durationUs = segment.relativeStartTimeUs + segment.durationUs;
        } else {
            this.durationUs = 0L;
        }
        if (j10 == C.TIME_UNSET) {
            j15 = -9223372036854775807L;
        } else {
            j15 = j10 >= 0 ? j10 : this.durationUs + j10;
        }
        this.startOffsetUs = j15;
        this.serverControl = serverControl;
    }

    @Override // com.google.android.exoplayer2.offline.FilterableManifest
    public HlsPlaylist copy(List<StreamKey> list) {
        return this;
    }

    @Override // com.google.android.exoplayer2.offline.FilterableManifest
    /* renamed from: copy  reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ HlsPlaylist copy2(List list) {
        return copy((List<StreamKey>) list);
    }

    public HlsMediaPlaylist copyWith(long j10, int i10) {
        return new HlsMediaPlaylist(this.playlistType, this.baseUri, this.tags, this.startOffsetUs, j10, true, i10, this.mediaSequence, this.version, this.targetDurationUs, this.partTargetDurationUs, this.hasIndependentSegments, this.hasEndTag, this.hasProgramDateTime, this.protectionSchemes, this.segments, this.trailingParts, this.serverControl, this.renditionReports);
    }

    public HlsMediaPlaylist copyWithEndTag() {
        return this.hasEndTag ? this : new HlsMediaPlaylist(this.playlistType, this.baseUri, this.tags, this.startOffsetUs, this.startTimeUs, this.hasDiscontinuitySequence, this.discontinuitySequence, this.mediaSequence, this.version, this.targetDurationUs, this.partTargetDurationUs, this.hasIndependentSegments, true, this.hasProgramDateTime, this.protectionSchemes, this.segments, this.trailingParts, this.serverControl, this.renditionReports);
    }

    public long getEndTimeUs() {
        return this.startTimeUs + this.durationUs;
    }

    public boolean isNewerThan(HlsMediaPlaylist hlsMediaPlaylist) {
        if (hlsMediaPlaylist != null) {
            long j10 = this.mediaSequence;
            long j11 = hlsMediaPlaylist.mediaSequence;
            if (j10 > j11) {
                return true;
            }
            if (j10 < j11) {
                return false;
            }
            int size = this.segments.size() - hlsMediaPlaylist.segments.size();
            if (size != 0) {
                return size > 0;
            }
            int size2 = this.trailingParts.size();
            int size3 = hlsMediaPlaylist.trailingParts.size();
            if (size2 <= size3) {
                return size2 == size3 && this.hasEndTag && !hlsMediaPlaylist.hasEndTag;
            }
            return true;
        }
        return true;
    }

    /* loaded from: classes3.dex */
    public static final class Segment extends SegmentBase {
        public final List<Part> parts;
        public final String title;

        public Segment(String str, long j10, long j11, String str2, String str3) {
            this(str, null, "", 0L, -1, C.TIME_UNSET, null, str2, str3, j10, j11, false, r.A());
        }

        public Segment copyWith(long j10, int i10) {
            ArrayList arrayList = new ArrayList();
            long j11 = j10;
            for (int i11 = 0; i11 < this.parts.size(); i11++) {
                Part part = this.parts.get(i11);
                arrayList.add(part.copyWith(j11, i10));
                j11 += part.durationUs;
            }
            return new Segment(this.url, this.initializationSegment, this.title, this.durationUs, i10, j10, this.drmInitData, this.fullSegmentEncryptionKeyUri, this.encryptionIV, this.byteRangeOffset, this.byteRangeLength, this.hasGapTag, arrayList);
        }

        public Segment(String str, Segment segment, String str2, long j10, int i10, long j11, DrmInitData drmInitData, String str3, String str4, long j12, long j13, boolean z10, List<Part> list) {
            super(str, segment, j10, i10, j11, drmInitData, str3, str4, j12, j13, z10);
            this.title = str2;
            this.parts = r.u(list);
        }
    }
}
