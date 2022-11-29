package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.DefaultExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.Id3Decoder;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.source.hls.HlsChunkSource;
import com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.google.android.exoplayer2.util.UriUtil;
import com.google.android.exoplayer2.util.Util;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import lk.r;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class HlsMediaChunk extends MediaChunk {
    public static final String PRIV_TIMESTAMP_FRAME_OWNER = "com.apple.streaming.transportStreamTimestamp";
    private static final AtomicInteger uidSource = new AtomicInteger();
    public final int discontinuitySequenceNumber;
    private final DrmInitData drmInitData;
    private HlsMediaChunkExtractor extractor;
    private final HlsExtractorFactory extractorFactory;
    private boolean extractorInvalidated;
    private final boolean hasGapTag;
    private final Id3Decoder id3Decoder;
    private boolean initDataLoadRequired;
    private final DataSource initDataSource;
    private final DataSpec initDataSpec;
    private final boolean initSegmentEncrypted;
    private final boolean isMasterTimestampSource;
    private boolean isPublished;
    private volatile boolean loadCanceled;
    private boolean loadCompleted;
    private final boolean mediaSegmentEncrypted;
    private final List<Format> muxedCaptionFormats;
    private int nextLoadPosition;
    private HlsSampleStreamWrapper output;
    public final int partIndex;
    public final Uri playlistUrl;
    private final HlsMediaChunkExtractor previousExtractor;
    private r<Integer> sampleQueueFirstSampleIndices;
    private final ParsableByteArray scratchId3Data;
    public final boolean shouldSpliceIn;
    private final TimestampAdjuster timestampAdjuster;
    public final int uid;

    private HlsMediaChunk(HlsExtractorFactory hlsExtractorFactory, DataSource dataSource, DataSpec dataSpec, Format format, boolean z10, DataSource dataSource2, DataSpec dataSpec2, boolean z11, Uri uri, List<Format> list, int i10, Object obj, long j10, long j11, long j12, int i11, boolean z12, int i12, boolean z13, boolean z14, TimestampAdjuster timestampAdjuster, DrmInitData drmInitData, HlsMediaChunkExtractor hlsMediaChunkExtractor, Id3Decoder id3Decoder, ParsableByteArray parsableByteArray, boolean z15) {
        super(dataSource, dataSpec, format, i10, obj, j10, j11, j12);
        this.mediaSegmentEncrypted = z10;
        this.partIndex = i11;
        this.isPublished = z12;
        this.discontinuitySequenceNumber = i12;
        this.initDataSpec = dataSpec2;
        this.initDataSource = dataSource2;
        this.initDataLoadRequired = dataSpec2 != null;
        this.initSegmentEncrypted = z11;
        this.playlistUrl = uri;
        this.isMasterTimestampSource = z14;
        this.timestampAdjuster = timestampAdjuster;
        this.hasGapTag = z13;
        this.extractorFactory = hlsExtractorFactory;
        this.muxedCaptionFormats = list;
        this.drmInitData = drmInitData;
        this.previousExtractor = hlsMediaChunkExtractor;
        this.id3Decoder = id3Decoder;
        this.scratchId3Data = parsableByteArray;
        this.shouldSpliceIn = z15;
        this.sampleQueueFirstSampleIndices = r.A();
        this.uid = uidSource.getAndIncrement();
    }

    private static DataSource buildDataSource(DataSource dataSource, byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            Assertions.checkNotNull(bArr2);
            return new Aes128DataSource(dataSource, bArr, bArr2);
        }
        return dataSource;
    }

    public static HlsMediaChunk createInstance(HlsExtractorFactory hlsExtractorFactory, DataSource dataSource, Format format, long j10, HlsMediaPlaylist hlsMediaPlaylist, HlsChunkSource.SegmentBaseHolder segmentBaseHolder, Uri uri, List<Format> list, int i10, Object obj, boolean z10, TimestampAdjusterProvider timestampAdjusterProvider, HlsMediaChunk hlsMediaChunk, byte[] bArr, byte[] bArr2) {
        boolean z11;
        DataSource dataSource2;
        DataSpec dataSpec;
        boolean z12;
        int i11;
        Id3Decoder id3Decoder;
        ParsableByteArray parsableByteArray;
        HlsMediaChunkExtractor hlsMediaChunkExtractor;
        boolean z13;
        HlsMediaChunkExtractor hlsMediaChunkExtractor2;
        HlsMediaPlaylist.SegmentBase segmentBase = segmentBaseHolder.segmentBase;
        DataSpec build = new DataSpec.Builder().setUri(UriUtil.resolveToUri(hlsMediaPlaylist.baseUri, segmentBase.url)).setPosition(segmentBase.byteRangeOffset).setLength(segmentBase.byteRangeLength).setFlags(segmentBaseHolder.isPreload ? 8 : 0).build();
        boolean z14 = bArr != null;
        DataSource buildDataSource = buildDataSource(dataSource, bArr, z14 ? getEncryptionIvArray((String) Assertions.checkNotNull(segmentBase.encryptionIV)) : null);
        HlsMediaPlaylist.Segment segment = segmentBase.initializationSegment;
        if (segment != null) {
            boolean z15 = bArr2 != null;
            byte[] encryptionIvArray = z15 ? getEncryptionIvArray((String) Assertions.checkNotNull(segment.encryptionIV)) : null;
            z11 = z14;
            dataSpec = new DataSpec(UriUtil.resolveToUri(hlsMediaPlaylist.baseUri, segment.url), segment.byteRangeOffset, segment.byteRangeLength);
            dataSource2 = buildDataSource(dataSource, bArr2, encryptionIvArray);
            z12 = z15;
        } else {
            z11 = z14;
            dataSource2 = null;
            dataSpec = null;
            z12 = false;
        }
        long j11 = j10 + segmentBase.relativeStartTimeUs;
        long j12 = j11 + segmentBase.durationUs;
        int i12 = hlsMediaPlaylist.discontinuitySequence + segmentBase.relativeDiscontinuitySequence;
        if (hlsMediaChunk != null) {
            boolean z16 = uri.equals(hlsMediaChunk.playlistUrl) && hlsMediaChunk.loadCompleted;
            Id3Decoder id3Decoder2 = hlsMediaChunk.id3Decoder;
            ParsableByteArray parsableByteArray2 = hlsMediaChunk.scratchId3Data;
            boolean z17 = !(z16 || (isIndependent(segmentBaseHolder, hlsMediaPlaylist) && j11 >= hlsMediaChunk.endTimeUs));
            if (!z16 || hlsMediaChunk.extractorInvalidated) {
                i11 = i12;
            } else {
                i11 = i12;
                if (hlsMediaChunk.discontinuitySequenceNumber == i11) {
                    hlsMediaChunkExtractor2 = hlsMediaChunk.extractor;
                    z13 = z17;
                    hlsMediaChunkExtractor = hlsMediaChunkExtractor2;
                    id3Decoder = id3Decoder2;
                    parsableByteArray = parsableByteArray2;
                }
            }
            hlsMediaChunkExtractor2 = null;
            z13 = z17;
            hlsMediaChunkExtractor = hlsMediaChunkExtractor2;
            id3Decoder = id3Decoder2;
            parsableByteArray = parsableByteArray2;
        } else {
            i11 = i12;
            id3Decoder = new Id3Decoder();
            parsableByteArray = new ParsableByteArray(10);
            hlsMediaChunkExtractor = null;
            z13 = false;
        }
        return new HlsMediaChunk(hlsExtractorFactory, buildDataSource, build, format, z11, dataSource2, dataSpec, z12, uri, list, i10, obj, j11, j12, segmentBaseHolder.mediaSequence, segmentBaseHolder.partIndex, !segmentBaseHolder.isPreload, i11, segmentBase.hasGapTag, z10, timestampAdjusterProvider.getAdjuster(i11), segmentBase.drmInitData, hlsMediaChunkExtractor, id3Decoder, parsableByteArray, z13);
    }

    @RequiresNonNull({"output"})
    private void feedDataToExtractor(DataSource dataSource, DataSpec dataSpec, boolean z10) throws IOException {
        DataSpec subrange;
        long position;
        long j10;
        if (z10) {
            r0 = this.nextLoadPosition != 0;
            subrange = dataSpec;
        } else {
            subrange = dataSpec.subrange(this.nextLoadPosition);
        }
        try {
            DefaultExtractorInput prepareExtraction = prepareExtraction(dataSource, subrange);
            if (r0) {
                prepareExtraction.skipFully(this.nextLoadPosition);
            }
            do {
                try {
                    if (this.loadCanceled) {
                        break;
                    }
                } catch (EOFException e10) {
                    if ((this.trackFormat.roleFlags & 16384) != 0) {
                        this.extractor.onTruncatedSegmentParsed();
                        position = prepareExtraction.getPosition();
                        j10 = dataSpec.position;
                    } else {
                        throw e10;
                    }
                }
            } while (this.extractor.read(prepareExtraction));
            position = prepareExtraction.getPosition();
            j10 = dataSpec.position;
            this.nextLoadPosition = (int) (position - j10);
        } finally {
            Util.closeQuietly(dataSource);
        }
    }

    private static byte[] getEncryptionIvArray(String str) {
        if (Util.toLowerInvariant(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    private static boolean isIndependent(HlsChunkSource.SegmentBaseHolder segmentBaseHolder, HlsMediaPlaylist hlsMediaPlaylist) {
        HlsMediaPlaylist.SegmentBase segmentBase = segmentBaseHolder.segmentBase;
        if (segmentBase instanceof HlsMediaPlaylist.Part) {
            return ((HlsMediaPlaylist.Part) segmentBase).isIndependent || (segmentBaseHolder.partIndex == 0 && hlsMediaPlaylist.hasIndependentSegments);
        }
        return hlsMediaPlaylist.hasIndependentSegments;
    }

    @RequiresNonNull({"output"})
    private void loadMedia() throws IOException {
        try {
            this.timestampAdjuster.sharedInitializeOrWait(this.isMasterTimestampSource, this.startTimeUs);
            feedDataToExtractor(this.dataSource, this.dataSpec, this.mediaSegmentEncrypted);
        } catch (InterruptedException unused) {
            throw new InterruptedIOException();
        }
    }

    @RequiresNonNull({"output"})
    private void maybeLoadInitData() throws IOException {
        if (this.initDataLoadRequired) {
            Assertions.checkNotNull(this.initDataSource);
            Assertions.checkNotNull(this.initDataSpec);
            feedDataToExtractor(this.initDataSource, this.initDataSpec, this.initSegmentEncrypted);
            this.nextLoadPosition = 0;
            this.initDataLoadRequired = false;
        }
    }

    private long peekId3PrivTimestamp(ExtractorInput extractorInput) throws IOException {
        extractorInput.resetPeekPosition();
        try {
            this.scratchId3Data.reset(10);
            extractorInput.peekFully(this.scratchId3Data.getData(), 0, 10);
        } catch (EOFException unused) {
        }
        if (this.scratchId3Data.readUnsignedInt24() != 4801587) {
            return C.TIME_UNSET;
        }
        this.scratchId3Data.skipBytes(3);
        int readSynchSafeInt = this.scratchId3Data.readSynchSafeInt();
        int i10 = readSynchSafeInt + 10;
        if (i10 > this.scratchId3Data.capacity()) {
            byte[] data = this.scratchId3Data.getData();
            this.scratchId3Data.reset(i10);
            System.arraycopy(data, 0, this.scratchId3Data.getData(), 0, 10);
        }
        extractorInput.peekFully(this.scratchId3Data.getData(), 10, readSynchSafeInt);
        Metadata decode = this.id3Decoder.decode(this.scratchId3Data.getData(), readSynchSafeInt);
        if (decode == null) {
            return C.TIME_UNSET;
        }
        int length = decode.length();
        for (int i11 = 0; i11 < length; i11++) {
            Metadata.Entry entry = decode.get(i11);
            if (entry instanceof PrivFrame) {
                PrivFrame privFrame = (PrivFrame) entry;
                if (PRIV_TIMESTAMP_FRAME_OWNER.equals(privFrame.owner)) {
                    System.arraycopy(privFrame.privateData, 0, this.scratchId3Data.getData(), 0, 8);
                    this.scratchId3Data.setPosition(0);
                    this.scratchId3Data.setLimit(8);
                    return this.scratchId3Data.readLong() & 8589934591L;
                }
            }
        }
        return C.TIME_UNSET;
    }

    @EnsuresNonNull({"extractor"})
    @RequiresNonNull({"output"})
    private DefaultExtractorInput prepareExtraction(DataSource dataSource, DataSpec dataSpec) throws IOException {
        HlsMediaChunkExtractor createExtractor;
        long j10;
        DefaultExtractorInput defaultExtractorInput = new DefaultExtractorInput(dataSource, dataSpec.position, dataSource.open(dataSpec));
        if (this.extractor == null) {
            long peekId3PrivTimestamp = peekId3PrivTimestamp(defaultExtractorInput);
            defaultExtractorInput.resetPeekPosition();
            HlsMediaChunkExtractor hlsMediaChunkExtractor = this.previousExtractor;
            if (hlsMediaChunkExtractor != null) {
                createExtractor = hlsMediaChunkExtractor.recreate();
            } else {
                createExtractor = this.extractorFactory.createExtractor(dataSpec.uri, this.trackFormat, this.muxedCaptionFormats, this.timestampAdjuster, dataSource.getResponseHeaders(), defaultExtractorInput);
            }
            this.extractor = createExtractor;
            if (createExtractor.isPackedAudioExtractor()) {
                HlsSampleStreamWrapper hlsSampleStreamWrapper = this.output;
                if (peekId3PrivTimestamp != C.TIME_UNSET) {
                    j10 = this.timestampAdjuster.adjustTsTimestamp(peekId3PrivTimestamp);
                } else {
                    j10 = this.startTimeUs;
                }
                hlsSampleStreamWrapper.setSampleOffsetUs(j10);
            } else {
                this.output.setSampleOffsetUs(0L);
            }
            this.output.onNewExtractor();
            this.extractor.init(this.output);
        }
        this.output.setDrmInitData(this.drmInitData);
        return defaultExtractorInput;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
    public void cancelLoad() {
        this.loadCanceled = true;
    }

    public int getFirstSampleIndex(int i10) {
        Assertions.checkState(!this.shouldSpliceIn);
        if (i10 >= this.sampleQueueFirstSampleIndices.size()) {
            return 0;
        }
        return this.sampleQueueFirstSampleIndices.get(i10).intValue();
    }

    public void init(HlsSampleStreamWrapper hlsSampleStreamWrapper, r<Integer> rVar) {
        this.output = hlsSampleStreamWrapper;
        this.sampleQueueFirstSampleIndices = rVar;
    }

    public void invalidateExtractor() {
        this.extractorInvalidated = true;
    }

    @Override // com.google.android.exoplayer2.source.chunk.MediaChunk
    public boolean isLoadCompleted() {
        return this.loadCompleted;
    }

    public boolean isPublished() {
        return this.isPublished;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
    public void load() throws IOException {
        HlsMediaChunkExtractor hlsMediaChunkExtractor;
        Assertions.checkNotNull(this.output);
        if (this.extractor == null && (hlsMediaChunkExtractor = this.previousExtractor) != null && hlsMediaChunkExtractor.isReusable()) {
            this.extractor = this.previousExtractor;
            this.initDataLoadRequired = false;
        }
        maybeLoadInitData();
        if (this.loadCanceled) {
            return;
        }
        if (!this.hasGapTag) {
            loadMedia();
        }
        this.loadCompleted = !this.loadCanceled;
    }

    public void publish() {
        this.isPublished = true;
    }
}
