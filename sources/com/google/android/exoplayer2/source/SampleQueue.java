package com.google.android.exoplayer2.source;

import android.os.Looper;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

/* loaded from: classes3.dex */
public class SampleQueue implements TrackOutput {
    public static final int SAMPLE_CAPACITY_INCREMENT = 1000;
    private static final String TAG = "SampleQueue";
    private int absoluteFirstIndex;
    private DrmSession currentDrmSession;
    private Format downstreamFormat;
    private final DrmSessionEventListener.EventDispatcher drmEventDispatcher;
    private final DrmSessionManager drmSessionManager;
    private boolean isLastSampleQueued;
    private int length;
    private boolean loggedUnexpectedNonSyncSample;
    private boolean pendingSplice;
    private final Looper playbackLooper;
    private int readPosition;
    private int relativeFirstIndex;
    private final SampleDataQueue sampleDataQueue;
    private long sampleOffsetUs;
    private Format unadjustedUpstreamFormat;
    private boolean upstreamAllSamplesAreSyncSamples;
    private Format upstreamCommittedFormat;
    private Format upstreamFormat;
    private boolean upstreamFormatAdjustmentRequired;
    private UpstreamFormatChangedListener upstreamFormatChangeListener;
    private int upstreamSourceId;
    private final SampleExtrasHolder extrasHolder = new SampleExtrasHolder();
    private int capacity = 1000;
    private int[] sourceIds = new int[1000];
    private long[] offsets = new long[1000];
    private long[] timesUs = new long[1000];
    private int[] flags = new int[1000];
    private int[] sizes = new int[1000];
    private TrackOutput.CryptoData[] cryptoDatas = new TrackOutput.CryptoData[1000];
    private Format[] formats = new Format[1000];
    private long startTimeUs = Long.MIN_VALUE;
    private long largestDiscardedTimestampUs = Long.MIN_VALUE;
    private long largestQueuedTimestampUs = Long.MIN_VALUE;
    private boolean upstreamFormatRequired = true;
    private boolean upstreamKeyframeRequired = true;

    /* loaded from: classes3.dex */
    public static final class SampleExtrasHolder {
        public TrackOutput.CryptoData cryptoData;
        public long offset;
        public int size;
    }

    /* loaded from: classes3.dex */
    public interface UpstreamFormatChangedListener {
        void onUpstreamFormatChanged(Format format);
    }

    public SampleQueue(Allocator allocator, Looper looper, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        this.playbackLooper = looper;
        this.drmSessionManager = drmSessionManager;
        this.drmEventDispatcher = eventDispatcher;
        this.sampleDataQueue = new SampleDataQueue(allocator);
    }

    private synchronized boolean attemptSplice(long j10) {
        if (this.length == 0) {
            return j10 > this.largestDiscardedTimestampUs;
        } else if (getLargestReadTimestampUs() >= j10) {
            return false;
        } else {
            discardUpstreamSampleMetadata(this.absoluteFirstIndex + countUnreadSamplesBefore(j10));
            return true;
        }
    }

    private synchronized void commitSample(long j10, int i10, long j11, int i11, TrackOutput.CryptoData cryptoData) {
        int i12 = this.length;
        if (i12 > 0) {
            int relativeIndex = getRelativeIndex(i12 - 1);
            Assertions.checkArgument(this.offsets[relativeIndex] + ((long) this.sizes[relativeIndex]) <= j11);
        }
        this.isLastSampleQueued = (536870912 & i10) != 0;
        this.largestQueuedTimestampUs = Math.max(this.largestQueuedTimestampUs, j10);
        int relativeIndex2 = getRelativeIndex(this.length);
        this.timesUs[relativeIndex2] = j10;
        long[] jArr = this.offsets;
        jArr[relativeIndex2] = j11;
        this.sizes[relativeIndex2] = i11;
        this.flags[relativeIndex2] = i10;
        this.cryptoDatas[relativeIndex2] = cryptoData;
        Format[] formatArr = this.formats;
        Format format = this.upstreamFormat;
        formatArr[relativeIndex2] = format;
        this.sourceIds[relativeIndex2] = this.upstreamSourceId;
        this.upstreamCommittedFormat = format;
        int i13 = this.length + 1;
        this.length = i13;
        int i14 = this.capacity;
        if (i13 == i14) {
            int i15 = i14 + 1000;
            int[] iArr = new int[i15];
            long[] jArr2 = new long[i15];
            long[] jArr3 = new long[i15];
            int[] iArr2 = new int[i15];
            int[] iArr3 = new int[i15];
            TrackOutput.CryptoData[] cryptoDataArr = new TrackOutput.CryptoData[i15];
            Format[] formatArr2 = new Format[i15];
            int i16 = this.relativeFirstIndex;
            int i17 = i14 - i16;
            System.arraycopy(jArr, i16, jArr2, 0, i17);
            System.arraycopy(this.timesUs, this.relativeFirstIndex, jArr3, 0, i17);
            System.arraycopy(this.flags, this.relativeFirstIndex, iArr2, 0, i17);
            System.arraycopy(this.sizes, this.relativeFirstIndex, iArr3, 0, i17);
            System.arraycopy(this.cryptoDatas, this.relativeFirstIndex, cryptoDataArr, 0, i17);
            System.arraycopy(this.formats, this.relativeFirstIndex, formatArr2, 0, i17);
            System.arraycopy(this.sourceIds, this.relativeFirstIndex, iArr, 0, i17);
            int i18 = this.relativeFirstIndex;
            System.arraycopy(this.offsets, 0, jArr2, i17, i18);
            System.arraycopy(this.timesUs, 0, jArr3, i17, i18);
            System.arraycopy(this.flags, 0, iArr2, i17, i18);
            System.arraycopy(this.sizes, 0, iArr3, i17, i18);
            System.arraycopy(this.cryptoDatas, 0, cryptoDataArr, i17, i18);
            System.arraycopy(this.formats, 0, formatArr2, i17, i18);
            System.arraycopy(this.sourceIds, 0, iArr, i17, i18);
            this.offsets = jArr2;
            this.timesUs = jArr3;
            this.flags = iArr2;
            this.sizes = iArr3;
            this.cryptoDatas = cryptoDataArr;
            this.formats = formatArr2;
            this.sourceIds = iArr;
            this.relativeFirstIndex = 0;
            this.capacity = i15;
        }
    }

    private int countUnreadSamplesBefore(long j10) {
        int i10 = this.length;
        int relativeIndex = getRelativeIndex(i10 - 1);
        while (i10 > this.readPosition && this.timesUs[relativeIndex] >= j10) {
            i10--;
            relativeIndex--;
            if (relativeIndex == -1) {
                relativeIndex = this.capacity - 1;
            }
        }
        return i10;
    }

    public static SampleQueue createWithDrm(Allocator allocator, Looper looper, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        return new SampleQueue(allocator, (Looper) Assertions.checkNotNull(looper), (DrmSessionManager) Assertions.checkNotNull(drmSessionManager), (DrmSessionEventListener.EventDispatcher) Assertions.checkNotNull(eventDispatcher));
    }

    public static SampleQueue createWithoutDrm(Allocator allocator) {
        return new SampleQueue(allocator, null, null, null);
    }

    private synchronized long discardSampleMetadataTo(long j10, boolean z10, boolean z11) {
        int i10;
        int i11 = this.length;
        if (i11 != 0) {
            long[] jArr = this.timesUs;
            int i12 = this.relativeFirstIndex;
            if (j10 >= jArr[i12]) {
                if (z11 && (i10 = this.readPosition) != i11) {
                    i11 = i10 + 1;
                }
                int findSampleBefore = findSampleBefore(i12, i11, j10, z10);
                if (findSampleBefore == -1) {
                    return -1L;
                }
                return discardSamples(findSampleBefore);
            }
        }
        return -1L;
    }

    private synchronized long discardSampleMetadataToEnd() {
        int i10 = this.length;
        if (i10 == 0) {
            return -1L;
        }
        return discardSamples(i10);
    }

    private long discardSamples(int i10) {
        int i11;
        this.largestDiscardedTimestampUs = Math.max(this.largestDiscardedTimestampUs, getLargestTimestamp(i10));
        int i12 = this.length - i10;
        this.length = i12;
        this.absoluteFirstIndex += i10;
        int i13 = this.relativeFirstIndex + i10;
        this.relativeFirstIndex = i13;
        int i14 = this.capacity;
        if (i13 >= i14) {
            this.relativeFirstIndex = i13 - i14;
        }
        int i15 = this.readPosition - i10;
        this.readPosition = i15;
        if (i15 < 0) {
            this.readPosition = 0;
        }
        if (i12 == 0) {
            int i16 = this.relativeFirstIndex;
            if (i16 != 0) {
                i14 = i16;
            }
            return this.offsets[i14 - 1] + this.sizes[i11];
        }
        return this.offsets[this.relativeFirstIndex];
    }

    private long discardUpstreamSampleMetadata(int i10) {
        int relativeIndex;
        int writeIndex = getWriteIndex() - i10;
        boolean z10 = false;
        Assertions.checkArgument(writeIndex >= 0 && writeIndex <= this.length - this.readPosition);
        int i11 = this.length - writeIndex;
        this.length = i11;
        this.largestQueuedTimestampUs = Math.max(this.largestDiscardedTimestampUs, getLargestTimestamp(i11));
        if (writeIndex == 0 && this.isLastSampleQueued) {
            z10 = true;
        }
        this.isLastSampleQueued = z10;
        int i12 = this.length;
        if (i12 != 0) {
            return this.offsets[getRelativeIndex(i12 - 1)] + this.sizes[relativeIndex];
        }
        return 0L;
    }

    private int findSampleBefore(int i10, int i11, long j10, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            long[] jArr = this.timesUs;
            if (jArr[i10] > j10) {
                return i12;
            }
            if (!z10 || (this.flags[i10] & 1) != 0) {
                if (jArr[i10] == j10) {
                    return i13;
                }
                i12 = i13;
            }
            i10++;
            if (i10 == this.capacity) {
                i10 = 0;
            }
        }
        return i12;
    }

    private long getLargestTimestamp(int i10) {
        long j10 = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int relativeIndex = getRelativeIndex(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = Math.max(j10, this.timesUs[relativeIndex]);
            if ((this.flags[relativeIndex] & 1) != 0) {
                break;
            }
            relativeIndex--;
            if (relativeIndex == -1) {
                relativeIndex = this.capacity - 1;
            }
        }
        return j10;
    }

    private int getRelativeIndex(int i10) {
        int i11 = this.relativeFirstIndex + i10;
        int i12 = this.capacity;
        return i11 < i12 ? i11 : i11 - i12;
    }

    private boolean hasNextSample() {
        return this.readPosition != this.length;
    }

    private boolean mayReadSample(int i10) {
        DrmSession drmSession = this.currentDrmSession;
        return drmSession == null || drmSession.getState() == 4 || ((this.flags[i10] & 1073741824) == 0 && this.currentDrmSession.playClearSamplesWithoutKeys());
    }

    private void onFormatResult(Format format, FormatHolder formatHolder) {
        Format format2 = this.downstreamFormat;
        boolean z10 = format2 == null;
        DrmInitData drmInitData = z10 ? null : format2.drmInitData;
        this.downstreamFormat = format;
        DrmInitData drmInitData2 = format.drmInitData;
        DrmSessionManager drmSessionManager = this.drmSessionManager;
        formatHolder.format = drmSessionManager != null ? format.copyWithExoMediaCryptoType(drmSessionManager.getExoMediaCryptoType(format)) : format;
        formatHolder.drmSession = this.currentDrmSession;
        if (this.drmSessionManager == null) {
            return;
        }
        if (z10 || !Util.areEqual(drmInitData, drmInitData2)) {
            DrmSession drmSession = this.currentDrmSession;
            DrmSession acquireSession = this.drmSessionManager.acquireSession((Looper) Assertions.checkNotNull(this.playbackLooper), this.drmEventDispatcher, format);
            this.currentDrmSession = acquireSession;
            formatHolder.drmSession = acquireSession;
            if (drmSession != null) {
                drmSession.release(this.drmEventDispatcher);
            }
        }
    }

    private synchronized int peekSampleMetadata(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, boolean z10, boolean z11, SampleExtrasHolder sampleExtrasHolder) {
        decoderInputBuffer.waitingForKeys = false;
        if (!hasNextSample()) {
            if (!z11 && !this.isLastSampleQueued) {
                Format format = this.upstreamFormat;
                if (format == null || (!z10 && format == this.downstreamFormat)) {
                    return -3;
                }
                onFormatResult((Format) Assertions.checkNotNull(format), formatHolder);
                return -5;
            }
            decoderInputBuffer.setFlags(4);
            return -4;
        }
        int relativeIndex = getRelativeIndex(this.readPosition);
        if (!z10 && this.formats[relativeIndex] == this.downstreamFormat) {
            if (!mayReadSample(relativeIndex)) {
                decoderInputBuffer.waitingForKeys = true;
                return -3;
            }
            decoderInputBuffer.setFlags(this.flags[relativeIndex]);
            long j10 = this.timesUs[relativeIndex];
            decoderInputBuffer.timeUs = j10;
            if (j10 < this.startTimeUs) {
                decoderInputBuffer.addFlag(Integer.MIN_VALUE);
            }
            sampleExtrasHolder.size = this.sizes[relativeIndex];
            sampleExtrasHolder.offset = this.offsets[relativeIndex];
            sampleExtrasHolder.cryptoData = this.cryptoDatas[relativeIndex];
            return -4;
        }
        onFormatResult(this.formats[relativeIndex], formatHolder);
        return -5;
    }

    private void releaseDrmSessionReferences() {
        DrmSession drmSession = this.currentDrmSession;
        if (drmSession != null) {
            drmSession.release(this.drmEventDispatcher);
            this.currentDrmSession = null;
            this.downstreamFormat = null;
        }
    }

    private synchronized void rewind() {
        this.readPosition = 0;
        this.sampleDataQueue.rewind();
    }

    private synchronized boolean setUpstreamFormat(Format format) {
        this.upstreamFormatRequired = false;
        if (Util.areEqual(format, this.upstreamFormat)) {
            return false;
        }
        if (Util.areEqual(format, this.upstreamCommittedFormat)) {
            this.upstreamFormat = this.upstreamCommittedFormat;
        } else {
            this.upstreamFormat = format;
        }
        Format format2 = this.upstreamFormat;
        this.upstreamAllSamplesAreSyncSamples = MimeTypes.allSamplesAreSyncSamples(format2.sampleMimeType, format2.codecs);
        this.loggedUnexpectedNonSyncSample = false;
        return true;
    }

    public synchronized long discardSampleMetadataToRead() {
        int i10 = this.readPosition;
        if (i10 == 0) {
            return -1L;
        }
        return discardSamples(i10);
    }

    public final void discardTo(long j10, boolean z10, boolean z11) {
        this.sampleDataQueue.discardDownstreamTo(discardSampleMetadataTo(j10, z10, z11));
    }

    public final void discardToEnd() {
        this.sampleDataQueue.discardDownstreamTo(discardSampleMetadataToEnd());
    }

    public final void discardToRead() {
        this.sampleDataQueue.discardDownstreamTo(discardSampleMetadataToRead());
    }

    public final void discardUpstreamFrom(long j10) {
        if (this.length == 0) {
            return;
        }
        Assertions.checkArgument(j10 > getLargestReadTimestampUs());
        discardUpstreamSamples(this.absoluteFirstIndex + countUnreadSamplesBefore(j10));
    }

    public final void discardUpstreamSamples(int i10) {
        this.sampleDataQueue.discardUpstreamSampleBytes(discardUpstreamSampleMetadata(i10));
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public final void format(Format format) {
        Format adjustedUpstreamFormat = getAdjustedUpstreamFormat(format);
        this.upstreamFormatAdjustmentRequired = false;
        this.unadjustedUpstreamFormat = format;
        boolean upstreamFormat = setUpstreamFormat(adjustedUpstreamFormat);
        UpstreamFormatChangedListener upstreamFormatChangedListener = this.upstreamFormatChangeListener;
        if (upstreamFormatChangedListener == null || !upstreamFormat) {
            return;
        }
        upstreamFormatChangedListener.onUpstreamFormatChanged(adjustedUpstreamFormat);
    }

    public Format getAdjustedUpstreamFormat(Format format) {
        return (this.sampleOffsetUs == 0 || format.subsampleOffsetUs == Long.MAX_VALUE) ? format : format.buildUpon().setSubsampleOffsetUs(format.subsampleOffsetUs + this.sampleOffsetUs).build();
    }

    public final int getFirstIndex() {
        return this.absoluteFirstIndex;
    }

    public final synchronized long getFirstTimestampUs() {
        return this.length == 0 ? Long.MIN_VALUE : this.timesUs[this.relativeFirstIndex];
    }

    public final synchronized long getLargestQueuedTimestampUs() {
        return this.largestQueuedTimestampUs;
    }

    public final synchronized long getLargestReadTimestampUs() {
        return Math.max(this.largestDiscardedTimestampUs, getLargestTimestamp(this.readPosition));
    }

    public final int getReadIndex() {
        return this.absoluteFirstIndex + this.readPosition;
    }

    public final synchronized int getSkipCount(long j10, boolean z10) {
        int relativeIndex = getRelativeIndex(this.readPosition);
        if (hasNextSample() && j10 >= this.timesUs[relativeIndex]) {
            if (j10 > this.largestQueuedTimestampUs && z10) {
                return this.length - this.readPosition;
            }
            int findSampleBefore = findSampleBefore(relativeIndex, this.length - this.readPosition, j10, true);
            if (findSampleBefore == -1) {
                return 0;
            }
            return findSampleBefore;
        }
        return 0;
    }

    public final synchronized Format getUpstreamFormat() {
        return this.upstreamFormatRequired ? null : this.upstreamFormat;
    }

    public final int getWriteIndex() {
        return this.absoluteFirstIndex + this.length;
    }

    public final void invalidateUpstreamFormatAdjustment() {
        this.upstreamFormatAdjustmentRequired = true;
    }

    public final synchronized boolean isLastSampleQueued() {
        return this.isLastSampleQueued;
    }

    public synchronized boolean isReady(boolean z10) {
        Format format;
        boolean z11 = true;
        if (!hasNextSample()) {
            if (!z10 && !this.isLastSampleQueued && ((format = this.upstreamFormat) == null || format == this.downstreamFormat)) {
                z11 = false;
            }
            return z11;
        }
        int relativeIndex = getRelativeIndex(this.readPosition);
        if (this.formats[relativeIndex] != this.downstreamFormat) {
            return true;
        }
        return mayReadSample(relativeIndex);
    }

    public void maybeThrowError() throws IOException {
        DrmSession drmSession = this.currentDrmSession;
        if (drmSession != null && drmSession.getState() == 1) {
            throw ((DrmSession.DrmSessionException) Assertions.checkNotNull(this.currentDrmSession.getError()));
        }
    }

    public final int peek(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, boolean z10, boolean z11) {
        int peekSampleMetadata = peekSampleMetadata(formatHolder, decoderInputBuffer, z10, z11, this.extrasHolder);
        if (peekSampleMetadata == -4 && !decoderInputBuffer.isEndOfStream() && !decoderInputBuffer.isFlagsOnly()) {
            this.sampleDataQueue.peekToBuffer(decoderInputBuffer, this.extrasHolder);
        }
        return peekSampleMetadata;
    }

    public final synchronized int peekSourceId() {
        return hasNextSample() ? this.sourceIds[getRelativeIndex(this.readPosition)] : this.upstreamSourceId;
    }

    public void preRelease() {
        discardToEnd();
        releaseDrmSessionReferences();
    }

    public int read(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, boolean z10, boolean z11) {
        int peekSampleMetadata = peekSampleMetadata(formatHolder, decoderInputBuffer, z10, z11, this.extrasHolder);
        if (peekSampleMetadata == -4 && !decoderInputBuffer.isEndOfStream() && !decoderInputBuffer.isFlagsOnly()) {
            this.sampleDataQueue.readToBuffer(decoderInputBuffer, this.extrasHolder);
            this.readPosition++;
        }
        return peekSampleMetadata;
    }

    public void release() {
        reset(true);
        releaseDrmSessionReferences();
    }

    public final void reset() {
        reset(false);
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public final int sampleData(DataReader dataReader, int i10, boolean z10, int i11) throws IOException {
        return this.sampleDataQueue.sampleData(dataReader, i10, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void sampleMetadata(long r12, int r14, int r15, int r16, com.google.android.exoplayer2.extractor.TrackOutput.CryptoData r17) {
        /*
            r11 = this;
            r8 = r11
            boolean r0 = r8.upstreamFormatAdjustmentRequired
            if (r0 == 0) goto L10
            com.google.android.exoplayer2.Format r0 = r8.unadjustedUpstreamFormat
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r0)
            com.google.android.exoplayer2.Format r0 = (com.google.android.exoplayer2.Format) r0
            r11.format(r0)
        L10:
            r0 = r14 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L18
            r3 = r2
            goto L19
        L18:
            r3 = r1
        L19:
            boolean r4 = r8.upstreamKeyframeRequired
            if (r4 == 0) goto L22
            if (r3 != 0) goto L20
            return
        L20:
            r8.upstreamKeyframeRequired = r1
        L22:
            long r4 = r8.sampleOffsetUs
            long r4 = r4 + r12
            boolean r6 = r8.upstreamAllSamplesAreSyncSamples
            if (r6 == 0) goto L54
            long r6 = r8.startTimeUs
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 >= 0) goto L30
            return
        L30:
            if (r0 != 0) goto L54
            boolean r0 = r8.loggedUnexpectedNonSyncSample
            if (r0 != 0) goto L50
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "Overriding unexpected non-sync sample for format: "
            r0.append(r6)
            com.google.android.exoplayer2.Format r6 = r8.upstreamFormat
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r6 = "SampleQueue"
            android.util.Log.w(r6, r0)
            r8.loggedUnexpectedNonSyncSample = r2
        L50:
            r0 = r14 | 1
            r6 = r0
            goto L55
        L54:
            r6 = r14
        L55:
            boolean r0 = r8.pendingSplice
            if (r0 == 0) goto L66
            if (r3 == 0) goto L65
            boolean r0 = r11.attemptSplice(r4)
            if (r0 != 0) goto L62
            goto L65
        L62:
            r8.pendingSplice = r1
            goto L66
        L65:
            return
        L66:
            com.google.android.exoplayer2.source.SampleDataQueue r0 = r8.sampleDataQueue
            long r0 = r0.getTotalBytesWritten()
            r7 = r15
            long r2 = (long) r7
            long r0 = r0 - r2
            r2 = r16
            long r2 = (long) r2
            long r9 = r0 - r2
            r0 = r11
            r1 = r4
            r3 = r6
            r4 = r9
            r6 = r15
            r7 = r17
            r0.commitSample(r1, r3, r4, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.SampleQueue.sampleMetadata(long, int, int, int, com.google.android.exoplayer2.extractor.TrackOutput$CryptoData):void");
    }

    public final synchronized boolean seekTo(int i10) {
        rewind();
        int i11 = this.absoluteFirstIndex;
        if (i10 >= i11 && i10 <= this.length + i11) {
            this.startTimeUs = Long.MIN_VALUE;
            this.readPosition = i10 - i11;
            return true;
        }
        return false;
    }

    public final void setSampleOffsetUs(long j10) {
        if (this.sampleOffsetUs != j10) {
            this.sampleOffsetUs = j10;
            invalidateUpstreamFormatAdjustment();
        }
    }

    public final void setStartTimeUs(long j10) {
        this.startTimeUs = j10;
    }

    public final void setUpstreamFormatChangeListener(UpstreamFormatChangedListener upstreamFormatChangedListener) {
        this.upstreamFormatChangeListener = upstreamFormatChangedListener;
    }

    public final synchronized void skip(int i10) {
        boolean z10;
        if (i10 >= 0) {
            try {
                if (this.readPosition + i10 <= this.length) {
                    z10 = true;
                    Assertions.checkArgument(z10);
                    this.readPosition += i10;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        z10 = false;
        Assertions.checkArgument(z10);
        this.readPosition += i10;
    }

    public final void sourceId(int i10) {
        this.upstreamSourceId = i10;
    }

    public final void splice() {
        this.pendingSplice = true;
    }

    public void reset(boolean z10) {
        this.sampleDataQueue.reset();
        this.length = 0;
        this.absoluteFirstIndex = 0;
        this.relativeFirstIndex = 0;
        this.readPosition = 0;
        this.upstreamKeyframeRequired = true;
        this.startTimeUs = Long.MIN_VALUE;
        this.largestDiscardedTimestampUs = Long.MIN_VALUE;
        this.largestQueuedTimestampUs = Long.MIN_VALUE;
        this.isLastSampleQueued = false;
        this.upstreamCommittedFormat = null;
        if (z10) {
            this.unadjustedUpstreamFormat = null;
            this.upstreamFormat = null;
            this.upstreamFormatRequired = true;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public final void sampleData(ParsableByteArray parsableByteArray, int i10, int i11) {
        this.sampleDataQueue.sampleData(parsableByteArray, i10);
    }

    public final synchronized boolean seekTo(long j10, boolean z10) {
        rewind();
        int relativeIndex = getRelativeIndex(this.readPosition);
        if (hasNextSample() && j10 >= this.timesUs[relativeIndex] && (j10 <= this.largestQueuedTimestampUs || z10)) {
            int findSampleBefore = findSampleBefore(relativeIndex, this.length - this.readPosition, j10, true);
            if (findSampleBefore == -1) {
                return false;
            }
            this.startTimeUs = j10;
            this.readPosition += findSampleBefore;
            return true;
        }
        return false;
    }
}
