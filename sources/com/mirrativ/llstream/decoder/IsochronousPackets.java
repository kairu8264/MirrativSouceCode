package com.mirrativ.llstream.decoder;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import jo.h;
import jo.p;
import ro.g;
import xn.a0;
import xn.s;

/* loaded from: classes4.dex */
public final class IsochronousPackets implements Queue<TimeSeriesPacket> {
    private final ConcurrentLinkedQueue<IndexedTimestamp> indexedTimestamps;
    private final int maxLinearRegressionPoints;
    private final ConcurrentLinkedQueue<TimeSeriesPacket> queue;
    private final int thresholdOfOutlierForlinearRegressionNs;
    private long timestampIndex;

    /* loaded from: classes4.dex */
    public static final class IndexedTimestamp {
        private long index;
        private final long timestamp;

        public IndexedTimestamp(long j10, long j11) {
            this.index = j10;
            this.timestamp = j11;
        }

        public static /* synthetic */ IndexedTimestamp copy$default(IndexedTimestamp indexedTimestamp, long j10, long j11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = indexedTimestamp.index;
            }
            if ((i10 & 2) != 0) {
                j11 = indexedTimestamp.timestamp;
            }
            return indexedTimestamp.copy(j10, j11);
        }

        public final long component1() {
            return this.index;
        }

        public final long component2() {
            return this.timestamp;
        }

        public final IndexedTimestamp copy(long j10, long j11) {
            return new IndexedTimestamp(j10, j11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof IndexedTimestamp) {
                IndexedTimestamp indexedTimestamp = (IndexedTimestamp) obj;
                return this.index == indexedTimestamp.index && this.timestamp == indexedTimestamp.timestamp;
            }
            return false;
        }

        public final long getIndex() {
            return this.index;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            return Long.hashCode(this.timestamp) + (Long.hashCode(this.index) * 31);
        }

        public final void setIndex(long j10) {
            this.index = j10;
        }

        public String toString() {
            StringBuilder a10 = a.a("IndexedTimestamp(index=");
            a10.append(this.index);
            a10.append(", timestamp=");
            a10.append(this.timestamp);
            a10.append(')');
            return a10.toString();
        }
    }

    public IsochronousPackets() {
        this(0, 0, 3, null);
    }

    public IsochronousPackets(int i10, int i11) {
        this.maxLinearRegressionPoints = i10;
        this.thresholdOfOutlierForlinearRegressionNs = i11;
        this.indexedTimestamps = new ConcurrentLinkedQueue<>();
        this.queue = new ConcurrentLinkedQueue<>();
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends TimeSeriesPacket> collection) {
        p.h(collection, "elements");
        return this.queue.addAll(collection);
    }

    public final void adjustTimestamps() {
        int i10;
        long j10 = -1;
        for (TimeSeriesPacket timeSeriesPacket : this.queue) {
            if (this.indexedTimestamps.isEmpty()) {
                this.indexedTimestamps.add(new IndexedTimestamp(this.timestampIndex, timeSeriesPacket.getOriginalTimestamp()));
                this.timestampIndex++;
            } else {
                IndexedTimestamp indexedTimestamp = new IndexedTimestamp(this.timestampIndex, timeSeriesPacket.getOriginalTimestamp());
                this.timestampIndex++;
                if (timeSeriesPacket.getTimestamp() >= ((IndexedTimestamp) a0.h0(this.indexedTimestamps)).getTimestamp()) {
                    long originalTimestamp = timeSeriesPacket.getOriginalTimestamp() - j10;
                    if (0 >= j10 || originalTimestamp <= this.thresholdOfOutlierForlinearRegressionNs) {
                        this.indexedTimestamps.add(indexedTimestamp);
                        j10 = timeSeriesPacket.getOriginalTimestamp();
                    }
                }
            }
        }
        int size = this.indexedTimestamps.size() - this.maxLinearRegressionPoints;
        int i11 = 0;
        if (size > 0 && size - 1 >= 0) {
            int i12 = 0;
            while (true) {
                this.indexedTimestamps.poll();
                if (i12 == i10) {
                    break;
                }
                i12++;
            }
        }
        g<IndexedTimestamp> M = a0.M(this.indexedTimestamps);
        bq.a aVar = new bq.a();
        for (IndexedTimestamp indexedTimestamp2 : M) {
            aVar.a(indexedTimestamp2.getIndex(), indexedTimestamp2.getTimestamp());
        }
        dr.a aVar2 = new dr.a(aVar);
        int size2 = this.queue.size();
        for (Object obj : this.queue) {
            int i13 = i11 + 1;
            if (i11 < 0) {
                s.t();
            }
            ((TimeSeriesPacket) obj).setTimestamp((long) (aVar2.a() + (aVar2.b() * ((this.timestampIndex - size2) + i11))));
            i11 = i13;
        }
        if (this.timestampIndex >= 2147483647L) {
            this.indexedTimestamps.clear();
            this.timestampIndex = 0L;
        }
    }

    @Override // java.util.Collection
    public void clear() {
        this.timestampIndex = 0L;
        this.indexedTimestamps.clear();
        this.queue.clear();
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof TimeSeriesPacket) {
            return contains((TimeSeriesPacket) obj);
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        p.h(collection, "elements");
        return this.queue.containsAll(collection);
    }

    public final int getMaxLinearRegressionPoints() {
        return this.maxLinearRegressionPoints;
    }

    public int getSize() {
        return this.queue.size();
    }

    public final int getThresholdOfOutlierForlinearRegressionNs() {
        return this.thresholdOfOutlierForlinearRegressionNs;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.queue.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<TimeSeriesPacket> iterator() {
        Iterator<TimeSeriesPacket> it = this.queue.iterator();
        p.g(it, "queue.iterator()");
        return it;
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        p.h(collection, "elements");
        return this.queue.removeAll(a0.F0(collection));
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        p.h(collection, "elements");
        return this.queue.retainAll(a0.F0(collection));
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return jo.g.a(this);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        p.h(tArr, "array");
        return (T[]) jo.g.b(this, tArr);
    }

    @Override // java.util.Queue, java.util.Collection
    public boolean add(TimeSeriesPacket timeSeriesPacket) {
        p.h(timeSeriesPacket, "element");
        return this.queue.add(timeSeriesPacket);
    }

    public boolean contains(TimeSeriesPacket timeSeriesPacket) {
        p.h(timeSeriesPacket, "element");
        return this.queue.contains(timeSeriesPacket);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Queue
    public TimeSeriesPacket element() {
        TimeSeriesPacket element = this.queue.element();
        p.g(element, "queue.element()");
        return element;
    }

    @Override // java.util.Queue
    public boolean offer(TimeSeriesPacket timeSeriesPacket) {
        p.h(timeSeriesPacket, i7.e.f36387u);
        return this.queue.offer(timeSeriesPacket);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Queue
    public TimeSeriesPacket peek() {
        return this.queue.peek();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Queue
    public TimeSeriesPacket poll() {
        return this.queue.poll();
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof TimeSeriesPacket) {
            return remove((TimeSeriesPacket) obj);
        }
        return false;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Queue
    public TimeSeriesPacket remove() {
        TimeSeriesPacket remove = this.queue.remove();
        p.g(remove, "queue.remove()");
        return remove;
    }

    public boolean remove(TimeSeriesPacket timeSeriesPacket) {
        p.h(timeSeriesPacket, "element");
        return this.queue.remove(timeSeriesPacket);
    }

    public /* synthetic */ IsochronousPackets(int i10, int i11, int i12, h hVar) {
        this((i12 & 1) != 0 ? 300 : i10, (i12 & 2) != 0 ? 250000000 : i11);
    }
}
