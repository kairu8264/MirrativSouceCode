package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.chunk.BaseMediaChunkIterator;
import com.google.android.exoplayer2.source.chunk.Chunk;
import com.google.android.exoplayer2.source.chunk.DataChunk;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.source.chunk.MediaChunkIterator;
import com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.trackselection.BaseTrackSelection;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.UriUtil;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import lk.r;
import lk.w;

/* loaded from: classes3.dex */
class HlsChunkSource {
    public static final int CHUNK_PUBLICATION_STATE_PRELOAD = 0;
    public static final int CHUNK_PUBLICATION_STATE_PUBLISHED = 1;
    public static final int CHUNK_PUBLICATION_STATE_REMOVED = 2;
    private static final int KEY_CACHE_SIZE = 4;
    private final DataSource encryptionDataSource;
    private Uri expectedPlaylistUrl;
    private final HlsExtractorFactory extractorFactory;
    private IOException fatalError;
    private boolean independentSegments;
    private boolean isTimestampMaster;
    private final DataSource mediaDataSource;
    private final List<Format> muxedCaptionFormats;
    private final Format[] playlistFormats;
    private final HlsPlaylistTracker playlistTracker;
    private final Uri[] playlistUrls;
    private boolean seenExpectedPlaylistError;
    private final TimestampAdjusterProvider timestampAdjusterProvider;
    private final TrackGroup trackGroup;
    private ExoTrackSelection trackSelection;
    private final FullSegmentEncryptionKeyCache keyCache = new FullSegmentEncryptionKeyCache(4);
    private byte[] scratchSpace = Util.EMPTY_BYTE_ARRAY;
    private long liveEdgeInPeriodTimeUs = C.TIME_UNSET;

    /* loaded from: classes3.dex */
    public static final class EncryptionKeyChunk extends DataChunk {
        private byte[] result;

        public EncryptionKeyChunk(DataSource dataSource, DataSpec dataSpec, Format format, int i10, Object obj, byte[] bArr) {
            super(dataSource, dataSpec, 3, format, i10, obj, bArr);
        }

        @Override // com.google.android.exoplayer2.source.chunk.DataChunk
        public void consume(byte[] bArr, int i10) {
            this.result = Arrays.copyOf(bArr, i10);
        }

        public byte[] getResult() {
            return this.result;
        }
    }

    /* loaded from: classes3.dex */
    public static final class HlsChunkHolder {
        public Chunk chunk;
        public boolean endOfStream;
        public Uri playlistUrl;

        public HlsChunkHolder() {
            clear();
        }

        public void clear() {
            this.chunk = null;
            this.endOfStream = false;
            this.playlistUrl = null;
        }
    }

    /* loaded from: classes3.dex */
    public static final class HlsMediaPlaylistSegmentIterator extends BaseMediaChunkIterator {
        private final String playlistBaseUri;
        private final List<HlsMediaPlaylist.SegmentBase> segmentBases;
        private final long startOfPlaylistInPeriodUs;

        public HlsMediaPlaylistSegmentIterator(String str, long j10, List<HlsMediaPlaylist.SegmentBase> list) {
            super(0L, list.size() - 1);
            this.playlistBaseUri = str;
            this.startOfPlaylistInPeriodUs = j10;
            this.segmentBases = list;
        }

        @Override // com.google.android.exoplayer2.source.chunk.MediaChunkIterator
        public long getChunkEndTimeUs() {
            checkInBounds();
            HlsMediaPlaylist.SegmentBase segmentBase = this.segmentBases.get((int) getCurrentIndex());
            return this.startOfPlaylistInPeriodUs + segmentBase.relativeStartTimeUs + segmentBase.durationUs;
        }

        @Override // com.google.android.exoplayer2.source.chunk.MediaChunkIterator
        public long getChunkStartTimeUs() {
            checkInBounds();
            return this.startOfPlaylistInPeriodUs + this.segmentBases.get((int) getCurrentIndex()).relativeStartTimeUs;
        }

        @Override // com.google.android.exoplayer2.source.chunk.MediaChunkIterator
        public DataSpec getDataSpec() {
            checkInBounds();
            HlsMediaPlaylist.SegmentBase segmentBase = this.segmentBases.get((int) getCurrentIndex());
            return new DataSpec(UriUtil.resolveToUri(this.playlistBaseUri, segmentBase.url), segmentBase.byteRangeOffset, segmentBase.byteRangeLength);
        }
    }

    /* loaded from: classes3.dex */
    public static final class InitializationTrackSelection extends BaseTrackSelection {
        private int selectedIndex;

        public InitializationTrackSelection(TrackGroup trackGroup, int[] iArr) {
            super(trackGroup, iArr);
            this.selectedIndex = indexOf(trackGroup.getFormat(iArr[0]));
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public int getSelectedIndex() {
            return this.selectedIndex;
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public Object getSelectionData() {
            return null;
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public int getSelectionReason() {
            return 0;
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public void updateSelectedTrack(long j10, long j11, long j12, List<? extends MediaChunk> list, MediaChunkIterator[] mediaChunkIteratorArr) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (isBlacklisted(this.selectedIndex, elapsedRealtime)) {
                for (int i10 = this.length - 1; i10 >= 0; i10--) {
                    if (!isBlacklisted(i10, elapsedRealtime)) {
                        this.selectedIndex = i10;
                        return;
                    }
                }
                throw new IllegalStateException();
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class SegmentBaseHolder {
        public final boolean isPreload;
        public final long mediaSequence;
        public final int partIndex;
        public final HlsMediaPlaylist.SegmentBase segmentBase;

        public SegmentBaseHolder(HlsMediaPlaylist.SegmentBase segmentBase, long j10, int i10) {
            this.segmentBase = segmentBase;
            this.mediaSequence = j10;
            this.partIndex = i10;
            this.isPreload = (segmentBase instanceof HlsMediaPlaylist.Part) && ((HlsMediaPlaylist.Part) segmentBase).isPreload;
        }
    }

    public HlsChunkSource(HlsExtractorFactory hlsExtractorFactory, HlsPlaylistTracker hlsPlaylistTracker, Uri[] uriArr, Format[] formatArr, HlsDataSourceFactory hlsDataSourceFactory, TransferListener transferListener, TimestampAdjusterProvider timestampAdjusterProvider, List<Format> list) {
        this.extractorFactory = hlsExtractorFactory;
        this.playlistTracker = hlsPlaylistTracker;
        this.playlistUrls = uriArr;
        this.playlistFormats = formatArr;
        this.timestampAdjusterProvider = timestampAdjusterProvider;
        this.muxedCaptionFormats = list;
        DataSource createDataSource = hlsDataSourceFactory.createDataSource(1);
        this.mediaDataSource = createDataSource;
        if (transferListener != null) {
            createDataSource.addTransferListener(transferListener);
        }
        this.encryptionDataSource = hlsDataSourceFactory.createDataSource(3);
        this.trackGroup = new TrackGroup(formatArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < uriArr.length; i10++) {
            if ((formatArr[i10].roleFlags & 16384) == 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        this.trackSelection = new InitializationTrackSelection(this.trackGroup, mk.c.j(arrayList));
    }

    private static Uri getFullEncryptionKeyUri(HlsMediaPlaylist hlsMediaPlaylist, HlsMediaPlaylist.SegmentBase segmentBase) {
        String str;
        if (segmentBase == null || (str = segmentBase.fullSegmentEncryptionKeyUri) == null) {
            return null;
        }
        return UriUtil.resolveToUri(hlsMediaPlaylist.baseUri, str);
    }

    private Pair<Long, Integer> getNextMediaSequenceAndPartIndex(HlsMediaChunk hlsMediaChunk, boolean z10, HlsMediaPlaylist hlsMediaPlaylist, long j10, long j11) {
        List<HlsMediaPlaylist.Part> list;
        long j12;
        if (hlsMediaChunk != null && !z10) {
            if (hlsMediaChunk.isLoadCompleted()) {
                if (hlsMediaChunk.partIndex == -1) {
                    j12 = hlsMediaChunk.getNextChunkIndex();
                } else {
                    j12 = hlsMediaChunk.chunkIndex;
                }
                Long valueOf = Long.valueOf(j12);
                int i10 = hlsMediaChunk.partIndex;
                return new Pair<>(valueOf, Integer.valueOf(i10 != -1 ? i10 + 1 : -1));
            }
            return new Pair<>(Long.valueOf(hlsMediaChunk.chunkIndex), Integer.valueOf(hlsMediaChunk.partIndex));
        }
        long j13 = hlsMediaPlaylist.durationUs + j10;
        if (hlsMediaChunk != null && !this.independentSegments) {
            j11 = hlsMediaChunk.startTimeUs;
        }
        if (!hlsMediaPlaylist.hasEndTag && j11 >= j13) {
            return new Pair<>(Long.valueOf(hlsMediaPlaylist.mediaSequence + hlsMediaPlaylist.segments.size()), -1);
        }
        long j14 = j11 - j10;
        int i11 = 0;
        int binarySearchFloor = Util.binarySearchFloor((List<? extends Comparable<? super Long>>) hlsMediaPlaylist.segments, Long.valueOf(j14), true, !this.playlistTracker.isLive() || hlsMediaChunk == null);
        long j15 = binarySearchFloor + hlsMediaPlaylist.mediaSequence;
        if (binarySearchFloor >= 0) {
            HlsMediaPlaylist.Segment segment = hlsMediaPlaylist.segments.get(binarySearchFloor);
            if (j14 < segment.relativeStartTimeUs + segment.durationUs) {
                list = segment.parts;
            } else {
                list = hlsMediaPlaylist.trailingParts;
            }
            while (true) {
                if (i11 >= list.size()) {
                    break;
                }
                HlsMediaPlaylist.Part part = list.get(i11);
                if (j14 >= part.relativeStartTimeUs + part.durationUs) {
                    i11++;
                } else if (part.isIndependent) {
                    j15 += list == hlsMediaPlaylist.trailingParts ? 1L : 0L;
                    r1 = i11;
                }
            }
        }
        return new Pair<>(Long.valueOf(j15), Integer.valueOf(r1));
    }

    private static SegmentBaseHolder getNextSegmentHolder(HlsMediaPlaylist hlsMediaPlaylist, long j10, int i10) {
        int i11 = (int) (j10 - hlsMediaPlaylist.mediaSequence);
        if (i11 == hlsMediaPlaylist.segments.size()) {
            if (i10 == -1) {
                i10 = 0;
            }
            if (i10 < hlsMediaPlaylist.trailingParts.size()) {
                return new SegmentBaseHolder(hlsMediaPlaylist.trailingParts.get(i10), j10, i10);
            }
            return null;
        }
        HlsMediaPlaylist.Segment segment = hlsMediaPlaylist.segments.get(i11);
        if (i10 == -1) {
            return new SegmentBaseHolder(segment, j10, -1);
        }
        if (i10 < segment.parts.size()) {
            return new SegmentBaseHolder(segment.parts.get(i10), j10, i10);
        }
        int i12 = i11 + 1;
        if (i12 < hlsMediaPlaylist.segments.size()) {
            return new SegmentBaseHolder(hlsMediaPlaylist.segments.get(i12), j10 + 1, -1);
        }
        if (hlsMediaPlaylist.trailingParts.isEmpty()) {
            return null;
        }
        return new SegmentBaseHolder(hlsMediaPlaylist.trailingParts.get(0), j10 + 1, 0);
    }

    public static List<HlsMediaPlaylist.SegmentBase> getSegmentBaseList(HlsMediaPlaylist hlsMediaPlaylist, long j10, int i10) {
        int i11 = (int) (j10 - hlsMediaPlaylist.mediaSequence);
        if (i11 >= 0 && hlsMediaPlaylist.segments.size() >= i11) {
            ArrayList arrayList = new ArrayList();
            if (i11 < hlsMediaPlaylist.segments.size()) {
                if (i10 != -1) {
                    HlsMediaPlaylist.Segment segment = hlsMediaPlaylist.segments.get(i11);
                    if (i10 == 0) {
                        arrayList.add(segment);
                    } else if (i10 < segment.parts.size()) {
                        List<HlsMediaPlaylist.Part> list = segment.parts;
                        arrayList.addAll(list.subList(i10, list.size()));
                    }
                    i11++;
                }
                List<HlsMediaPlaylist.Segment> list2 = hlsMediaPlaylist.segments;
                arrayList.addAll(list2.subList(i11, list2.size()));
                i10 = 0;
            }
            if (hlsMediaPlaylist.partTargetDurationUs != C.TIME_UNSET) {
                int i12 = i10 != -1 ? i10 : 0;
                if (i12 < hlsMediaPlaylist.trailingParts.size()) {
                    List<HlsMediaPlaylist.Part> list3 = hlsMediaPlaylist.trailingParts;
                    arrayList.addAll(list3.subList(i12, list3.size()));
                }
            }
            return Collections.unmodifiableList(arrayList);
        }
        return r.A();
    }

    private Chunk maybeCreateEncryptionChunkFor(Uri uri, int i10) {
        if (uri == null) {
            return null;
        }
        byte[] remove = this.keyCache.remove(uri);
        if (remove != null) {
            this.keyCache.put(uri, remove);
            return null;
        }
        return new EncryptionKeyChunk(this.encryptionDataSource, new DataSpec.Builder().setUri(uri).setFlags(1).build(), this.playlistFormats[i10], this.trackSelection.getSelectionReason(), this.trackSelection.getSelectionData(), this.scratchSpace);
    }

    private long resolveTimeToLiveEdgeUs(long j10) {
        long j11 = this.liveEdgeInPeriodTimeUs;
        return (j11 > C.TIME_UNSET ? 1 : (j11 == C.TIME_UNSET ? 0 : -1)) != 0 ? j11 - j10 : C.TIME_UNSET;
    }

    private void updateLiveEdgeTimeUs(HlsMediaPlaylist hlsMediaPlaylist) {
        this.liveEdgeInPeriodTimeUs = hlsMediaPlaylist.hasEndTag ? C.TIME_UNSET : hlsMediaPlaylist.getEndTimeUs() - this.playlistTracker.getInitialStartTimeUs();
    }

    public MediaChunkIterator[] createMediaChunkIterators(HlsMediaChunk hlsMediaChunk, long j10) {
        int i10;
        int indexOf = hlsMediaChunk == null ? -1 : this.trackGroup.indexOf(hlsMediaChunk.trackFormat);
        int length = this.trackSelection.length();
        MediaChunkIterator[] mediaChunkIteratorArr = new MediaChunkIterator[length];
        boolean z10 = false;
        int i11 = 0;
        while (i11 < length) {
            int indexInTrackGroup = this.trackSelection.getIndexInTrackGroup(i11);
            Uri uri = this.playlistUrls[indexInTrackGroup];
            if (!this.playlistTracker.isSnapshotValid(uri)) {
                mediaChunkIteratorArr[i11] = MediaChunkIterator.EMPTY;
                i10 = i11;
            } else {
                HlsMediaPlaylist playlistSnapshot = this.playlistTracker.getPlaylistSnapshot(uri, z10);
                Assertions.checkNotNull(playlistSnapshot);
                long initialStartTimeUs = playlistSnapshot.startTimeUs - this.playlistTracker.getInitialStartTimeUs();
                i10 = i11;
                Pair<Long, Integer> nextMediaSequenceAndPartIndex = getNextMediaSequenceAndPartIndex(hlsMediaChunk, indexInTrackGroup != indexOf ? true : z10, playlistSnapshot, initialStartTimeUs, j10);
                mediaChunkIteratorArr[i10] = new HlsMediaPlaylistSegmentIterator(playlistSnapshot.baseUri, initialStartTimeUs, getSegmentBaseList(playlistSnapshot, ((Long) nextMediaSequenceAndPartIndex.first).longValue(), ((Integer) nextMediaSequenceAndPartIndex.second).intValue()));
            }
            i11 = i10 + 1;
            z10 = false;
        }
        return mediaChunkIteratorArr;
    }

    public int getChunkPublicationState(HlsMediaChunk hlsMediaChunk) {
        List<HlsMediaPlaylist.Part> list;
        if (hlsMediaChunk.partIndex == -1) {
            return 1;
        }
        HlsMediaPlaylist hlsMediaPlaylist = (HlsMediaPlaylist) Assertions.checkNotNull(this.playlistTracker.getPlaylistSnapshot(this.playlistUrls[this.trackGroup.indexOf(hlsMediaChunk.trackFormat)], false));
        int i10 = (int) (hlsMediaChunk.chunkIndex - hlsMediaPlaylist.mediaSequence);
        if (i10 < 0) {
            return 1;
        }
        if (i10 < hlsMediaPlaylist.segments.size()) {
            list = hlsMediaPlaylist.segments.get(i10).parts;
        } else {
            list = hlsMediaPlaylist.trailingParts;
        }
        if (hlsMediaChunk.partIndex >= list.size()) {
            return 2;
        }
        HlsMediaPlaylist.Part part = list.get(hlsMediaChunk.partIndex);
        if (part.isPreload) {
            return 0;
        }
        return Util.areEqual(Uri.parse(UriUtil.resolve(hlsMediaPlaylist.baseUri, part.url)), hlsMediaChunk.dataSpec.uri) ? 1 : 2;
    }

    public void getNextChunk(long j10, long j11, List<HlsMediaChunk> list, boolean z10, HlsChunkHolder hlsChunkHolder) {
        long j12;
        Uri uri;
        HlsMediaChunk hlsMediaChunk = list.isEmpty() ? null : (HlsMediaChunk) w.c(list);
        int indexOf = hlsMediaChunk == null ? -1 : this.trackGroup.indexOf(hlsMediaChunk.trackFormat);
        long j13 = j11 - j10;
        long resolveTimeToLiveEdgeUs = resolveTimeToLiveEdgeUs(j10);
        if (hlsMediaChunk != null && !this.independentSegments) {
            long durationUs = hlsMediaChunk.getDurationUs();
            j13 = Math.max(0L, j13 - durationUs);
            if (resolveTimeToLiveEdgeUs != C.TIME_UNSET) {
                resolveTimeToLiveEdgeUs = Math.max(0L, resolveTimeToLiveEdgeUs - durationUs);
            }
        }
        this.trackSelection.updateSelectedTrack(j10, j13, resolveTimeToLiveEdgeUs, list, createMediaChunkIterators(hlsMediaChunk, j11));
        int selectedIndexInTrackGroup = this.trackSelection.getSelectedIndexInTrackGroup();
        boolean z11 = indexOf != selectedIndexInTrackGroup;
        Uri uri2 = this.playlistUrls[selectedIndexInTrackGroup];
        if (!this.playlistTracker.isSnapshotValid(uri2)) {
            hlsChunkHolder.playlistUrl = uri2;
            this.seenExpectedPlaylistError &= uri2.equals(this.expectedPlaylistUrl);
            this.expectedPlaylistUrl = uri2;
            return;
        }
        HlsMediaPlaylist playlistSnapshot = this.playlistTracker.getPlaylistSnapshot(uri2, true);
        Assertions.checkNotNull(playlistSnapshot);
        this.independentSegments = playlistSnapshot.hasIndependentSegments;
        updateLiveEdgeTimeUs(playlistSnapshot);
        long initialStartTimeUs = playlistSnapshot.startTimeUs - this.playlistTracker.getInitialStartTimeUs();
        Pair<Long, Integer> nextMediaSequenceAndPartIndex = getNextMediaSequenceAndPartIndex(hlsMediaChunk, z11, playlistSnapshot, initialStartTimeUs, j11);
        long longValue = ((Long) nextMediaSequenceAndPartIndex.first).longValue();
        int intValue = ((Integer) nextMediaSequenceAndPartIndex.second).intValue();
        if (longValue >= playlistSnapshot.mediaSequence || hlsMediaChunk == null || !z11) {
            j12 = initialStartTimeUs;
            uri = uri2;
            indexOf = selectedIndexInTrackGroup;
        } else {
            Uri uri3 = this.playlistUrls[indexOf];
            HlsMediaPlaylist playlistSnapshot2 = this.playlistTracker.getPlaylistSnapshot(uri3, true);
            Assertions.checkNotNull(playlistSnapshot2);
            j12 = playlistSnapshot2.startTimeUs - this.playlistTracker.getInitialStartTimeUs();
            Pair<Long, Integer> nextMediaSequenceAndPartIndex2 = getNextMediaSequenceAndPartIndex(hlsMediaChunk, false, playlistSnapshot2, j12, j11);
            longValue = ((Long) nextMediaSequenceAndPartIndex2.first).longValue();
            intValue = ((Integer) nextMediaSequenceAndPartIndex2.second).intValue();
            uri = uri3;
            playlistSnapshot = playlistSnapshot2;
        }
        if (longValue < playlistSnapshot.mediaSequence) {
            this.fatalError = new BehindLiveWindowException();
            return;
        }
        SegmentBaseHolder nextSegmentHolder = getNextSegmentHolder(playlistSnapshot, longValue, intValue);
        if (nextSegmentHolder == null) {
            if (!playlistSnapshot.hasEndTag) {
                hlsChunkHolder.playlistUrl = uri;
                this.seenExpectedPlaylistError &= uri.equals(this.expectedPlaylistUrl);
                this.expectedPlaylistUrl = uri;
                return;
            } else if (!z10 && !playlistSnapshot.segments.isEmpty()) {
                nextSegmentHolder = new SegmentBaseHolder((HlsMediaPlaylist.SegmentBase) w.c(playlistSnapshot.segments), (playlistSnapshot.mediaSequence + playlistSnapshot.segments.size()) - 1, -1);
            } else {
                hlsChunkHolder.endOfStream = true;
                return;
            }
        }
        this.seenExpectedPlaylistError = false;
        this.expectedPlaylistUrl = null;
        Uri fullEncryptionKeyUri = getFullEncryptionKeyUri(playlistSnapshot, nextSegmentHolder.segmentBase.initializationSegment);
        Chunk maybeCreateEncryptionChunkFor = maybeCreateEncryptionChunkFor(fullEncryptionKeyUri, indexOf);
        hlsChunkHolder.chunk = maybeCreateEncryptionChunkFor;
        if (maybeCreateEncryptionChunkFor != null) {
            return;
        }
        Uri fullEncryptionKeyUri2 = getFullEncryptionKeyUri(playlistSnapshot, nextSegmentHolder.segmentBase);
        Chunk maybeCreateEncryptionChunkFor2 = maybeCreateEncryptionChunkFor(fullEncryptionKeyUri2, indexOf);
        hlsChunkHolder.chunk = maybeCreateEncryptionChunkFor2;
        if (maybeCreateEncryptionChunkFor2 != null) {
            return;
        }
        hlsChunkHolder.chunk = HlsMediaChunk.createInstance(this.extractorFactory, this.mediaDataSource, this.playlistFormats[indexOf], j12, playlistSnapshot, nextSegmentHolder, uri, this.muxedCaptionFormats, this.trackSelection.getSelectionReason(), this.trackSelection.getSelectionData(), this.isTimestampMaster, this.timestampAdjusterProvider, hlsMediaChunk, this.keyCache.get(fullEncryptionKeyUri2), this.keyCache.get(fullEncryptionKeyUri));
    }

    public int getPreferredQueueSize(long j10, List<? extends MediaChunk> list) {
        if (this.fatalError == null && this.trackSelection.length() >= 2) {
            return this.trackSelection.evaluateQueueSize(j10, list);
        }
        return list.size();
    }

    public TrackGroup getTrackGroup() {
        return this.trackGroup;
    }

    public ExoTrackSelection getTrackSelection() {
        return this.trackSelection;
    }

    public boolean maybeExcludeTrack(Chunk chunk, long j10) {
        ExoTrackSelection exoTrackSelection = this.trackSelection;
        return exoTrackSelection.blacklist(exoTrackSelection.indexOf(this.trackGroup.indexOf(chunk.trackFormat)), j10);
    }

    public void maybeThrowError() throws IOException {
        IOException iOException = this.fatalError;
        if (iOException == null) {
            Uri uri = this.expectedPlaylistUrl;
            if (uri == null || !this.seenExpectedPlaylistError) {
                return;
            }
            this.playlistTracker.maybeThrowPlaylistRefreshError(uri);
            return;
        }
        throw iOException;
    }

    public void onChunkLoadCompleted(Chunk chunk) {
        if (chunk instanceof EncryptionKeyChunk) {
            EncryptionKeyChunk encryptionKeyChunk = (EncryptionKeyChunk) chunk;
            this.scratchSpace = encryptionKeyChunk.getDataHolder();
            this.keyCache.put(encryptionKeyChunk.dataSpec.uri, (byte[]) Assertions.checkNotNull(encryptionKeyChunk.getResult()));
        }
    }

    public boolean onPlaylistError(Uri uri, long j10) {
        int indexOf;
        int i10 = 0;
        while (true) {
            Uri[] uriArr = this.playlistUrls;
            if (i10 >= uriArr.length) {
                i10 = -1;
                break;
            } else if (uriArr[i10].equals(uri)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1 || (indexOf = this.trackSelection.indexOf(i10)) == -1) {
            return true;
        }
        this.seenExpectedPlaylistError = uri.equals(this.expectedPlaylistUrl) | this.seenExpectedPlaylistError;
        return j10 == C.TIME_UNSET || this.trackSelection.blacklist(indexOf, j10);
    }

    public void reset() {
        this.fatalError = null;
    }

    public void setIsTimestampMaster(boolean z10) {
        this.isTimestampMaster = z10;
    }

    public void setTrackSelection(ExoTrackSelection exoTrackSelection) {
        this.trackSelection = exoTrackSelection;
    }

    public boolean shouldCancelLoad(long j10, Chunk chunk, List<? extends MediaChunk> list) {
        if (this.fatalError != null) {
            return false;
        }
        return this.trackSelection.shouldCancelChunkLoad(j10, chunk, list);
    }
}
