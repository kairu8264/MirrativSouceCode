package com.google.android.exoplayer2.upstream.cache;

import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.TreeSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class CachedContent {
    private static final String TAG = "CachedContent";
    private final TreeSet<SimpleCacheSpan> cachedSpans;

    /* renamed from: id  reason: collision with root package name */
    public final int f27044id;
    public final String key;
    private final ArrayList<Range> lockedRanges;
    private DefaultContentMetadata metadata;

    /* loaded from: classes3.dex */
    public static final class Range {
        public final long length;
        public final long position;

        public Range(long j10, long j11) {
            this.position = j10;
            this.length = j11;
        }

        public boolean contains(long j10, long j11) {
            long j12 = this.length;
            if (j12 == -1) {
                return j10 >= this.position;
            } else if (j11 == -1) {
                return false;
            } else {
                long j13 = this.position;
                return j13 <= j10 && j10 + j11 <= j13 + j12;
            }
        }

        public boolean intersects(long j10, long j11) {
            long j12 = this.position;
            if (j12 > j10) {
                return j11 == -1 || j10 + j11 > j12;
            }
            long j13 = this.length;
            return j13 == -1 || j12 + j13 > j10;
        }
    }

    public CachedContent(int i10, String str) {
        this(i10, str, DefaultContentMetadata.EMPTY);
    }

    public void addSpan(SimpleCacheSpan simpleCacheSpan) {
        this.cachedSpans.add(simpleCacheSpan);
    }

    public boolean applyMetadataMutations(ContentMetadataMutations contentMetadataMutations) {
        DefaultContentMetadata defaultContentMetadata = this.metadata;
        DefaultContentMetadata copyWithMutationsApplied = defaultContentMetadata.copyWithMutationsApplied(contentMetadataMutations);
        this.metadata = copyWithMutationsApplied;
        return !copyWithMutationsApplied.equals(defaultContentMetadata);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CachedContent.class != obj.getClass()) {
            return false;
        }
        CachedContent cachedContent = (CachedContent) obj;
        return this.f27044id == cachedContent.f27044id && this.key.equals(cachedContent.key) && this.cachedSpans.equals(cachedContent.cachedSpans) && this.metadata.equals(cachedContent.metadata);
    }

    public long getCachedBytesLength(long j10, long j11) {
        Assertions.checkArgument(j10 >= 0);
        Assertions.checkArgument(j11 >= 0);
        SimpleCacheSpan span = getSpan(j10, j11);
        if (span.isHoleSpan()) {
            return -Math.min(span.isOpenEnded() ? Long.MAX_VALUE : span.length, j11);
        }
        long j12 = j10 + j11;
        long j13 = j12 >= 0 ? j12 : Long.MAX_VALUE;
        long j14 = span.position + span.length;
        if (j14 < j13) {
            for (SimpleCacheSpan simpleCacheSpan : this.cachedSpans.tailSet(span, false)) {
                long j15 = simpleCacheSpan.position;
                if (j15 > j14) {
                    break;
                }
                j14 = Math.max(j14, j15 + simpleCacheSpan.length);
                if (j14 >= j13) {
                    break;
                }
            }
        }
        return Math.min(j14 - j10, j11);
    }

    public DefaultContentMetadata getMetadata() {
        return this.metadata;
    }

    public SimpleCacheSpan getSpan(long j10, long j11) {
        SimpleCacheSpan createLookup = SimpleCacheSpan.createLookup(this.key, j10);
        SimpleCacheSpan floor = this.cachedSpans.floor(createLookup);
        if (floor == null || floor.position + floor.length <= j10) {
            SimpleCacheSpan ceiling = this.cachedSpans.ceiling(createLookup);
            if (ceiling != null) {
                long j12 = ceiling.position - j10;
                j11 = j11 == -1 ? j12 : Math.min(j12, j11);
            }
            return SimpleCacheSpan.createHole(this.key, j10, j11);
        }
        return floor;
    }

    public TreeSet<SimpleCacheSpan> getSpans() {
        return this.cachedSpans;
    }

    public int hashCode() {
        return (((this.f27044id * 31) + this.key.hashCode()) * 31) + this.metadata.hashCode();
    }

    public boolean isEmpty() {
        return this.cachedSpans.isEmpty();
    }

    public boolean isFullyLocked(long j10, long j11) {
        for (int i10 = 0; i10 < this.lockedRanges.size(); i10++) {
            if (this.lockedRanges.get(i10).contains(j10, j11)) {
                return true;
            }
        }
        return false;
    }

    public boolean isFullyUnlocked() {
        return this.lockedRanges.isEmpty();
    }

    public boolean lockRange(long j10, long j11) {
        for (int i10 = 0; i10 < this.lockedRanges.size(); i10++) {
            if (this.lockedRanges.get(i10).intersects(j10, j11)) {
                return false;
            }
        }
        this.lockedRanges.add(new Range(j10, j11));
        return true;
    }

    public boolean removeSpan(CacheSpan cacheSpan) {
        if (this.cachedSpans.remove(cacheSpan)) {
            File file = cacheSpan.file;
            if (file != null) {
                file.delete();
                return true;
            }
            return true;
        }
        return false;
    }

    public SimpleCacheSpan setLastTouchTimestamp(SimpleCacheSpan simpleCacheSpan, long j10, boolean z10) {
        Assertions.checkState(this.cachedSpans.remove(simpleCacheSpan));
        File file = (File) Assertions.checkNotNull(simpleCacheSpan.file);
        if (z10) {
            File cacheFile = SimpleCacheSpan.getCacheFile((File) Assertions.checkNotNull(file.getParentFile()), this.f27044id, simpleCacheSpan.position, j10);
            if (file.renameTo(cacheFile)) {
                file = cacheFile;
            } else {
                Log.w(TAG, "Failed to rename " + file + " to " + cacheFile);
            }
        }
        SimpleCacheSpan copyWithFileAndLastTouchTimestamp = simpleCacheSpan.copyWithFileAndLastTouchTimestamp(file, j10);
        this.cachedSpans.add(copyWithFileAndLastTouchTimestamp);
        return copyWithFileAndLastTouchTimestamp;
    }

    public void unlockRange(long j10) {
        for (int i10 = 0; i10 < this.lockedRanges.size(); i10++) {
            if (this.lockedRanges.get(i10).position == j10) {
                this.lockedRanges.remove(i10);
                return;
            }
        }
        throw new IllegalStateException();
    }

    public CachedContent(int i10, String str, DefaultContentMetadata defaultContentMetadata) {
        this.f27044id = i10;
        this.key = str;
        this.metadata = defaultContentMetadata;
        this.cachedSpans = new TreeSet<>();
        this.lockedRanges = new ArrayList<>();
    }
}
