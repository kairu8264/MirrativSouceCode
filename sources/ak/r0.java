package ak;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public final class r0 extends dk.z {

    /* renamed from: w  reason: collision with root package name */
    public final File f13611w;

    /* renamed from: x  reason: collision with root package name */
    public final File f13612x;

    /* renamed from: y  reason: collision with root package name */
    public final NavigableMap<Long, File> f13613y = new TreeMap();

    public r0(File file, File file2) throws IOException {
        this.f13611w = file;
        this.f13612x = file2;
        List<File> a10 = w3.a(file, file2);
        if (!a10.isEmpty()) {
            long j10 = 0;
            for (File file3 : a10) {
                this.f13613y.put(Long.valueOf(j10), file3);
                j10 += file3.length();
            }
            return;
        }
        throw new p1(String.format("Virtualized slice archive empty for %s, %s", file, file2));
    }

    @Override // dk.z
    public final long a() {
        Map.Entry<Long, File> lastEntry = this.f13613y.lastEntry();
        return lastEntry.getKey().longValue() + lastEntry.getValue().length();
    }

    @Override // dk.z
    public final InputStream c(long j10, long j11) throws IOException {
        if (j10 >= 0 && j11 >= 0) {
            long j12 = j10 + j11;
            if (j12 <= a()) {
                Long floorKey = this.f13613y.floorKey(Long.valueOf(j10));
                Long floorKey2 = this.f13613y.floorKey(Long.valueOf(j12));
                if (floorKey.equals(floorKey2)) {
                    return new q0(e(j10, floorKey), j11);
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(e(j10, floorKey));
                Collection<File> values = this.f13613y.subMap(floorKey, false, floorKey2, false).values();
                if (!values.isEmpty()) {
                    arrayList.add(new x2(Collections.enumeration(values)));
                }
                arrayList.add(new q0(new FileInputStream((File) this.f13613y.get(floorKey2)), j11 - (floorKey2.longValue() - j10)));
                return new SequenceInputStream(Collections.enumeration(arrayList));
            }
            throw new p1(String.format("Trying to access archive out of bounds. Archive ends at: %s. Tried accessing: %s", Long.valueOf(a()), Long.valueOf(j12)));
        }
        throw new p1(String.format("Invalid input parameters %s, %s", Long.valueOf(j10), Long.valueOf(j11)));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public final InputStream e(long j10, Long l10) throws IOException {
        FileInputStream fileInputStream = new FileInputStream((File) this.f13613y.get(l10));
        if (fileInputStream.skip(j10 - l10.longValue()) == j10 - l10.longValue()) {
            return fileInputStream;
        }
        throw new p1(String.format("Virtualized slice archive corrupt, could not skip in file with key %s", l10));
    }
}
