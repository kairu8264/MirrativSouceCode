package v4;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.database.SQLException;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import v4.l;

/* loaded from: classes.dex */
public final class l implements z4.h, r {

    /* renamed from: w  reason: collision with root package name */
    public final z4.h f56628w;

    /* renamed from: x  reason: collision with root package name */
    public final a f56629x;

    /* renamed from: y  reason: collision with root package name */
    public final v4.a f56630y;

    /* loaded from: classes.dex */
    public static final class a implements z4.g {

        /* renamed from: w  reason: collision with root package name */
        public final v4.a f56631w;

        public a(v4.a aVar) {
            this.f56631w = aVar;
        }

        public static /* synthetic */ Integer C(String str, int i10, ContentValues contentValues, String str2, Object[] objArr, z4.g gVar) {
            return Integer.valueOf(gVar.h1(str, i10, contentValues, str2, objArr));
        }

        public static /* synthetic */ Integer n(String str, String str2, Object[] objArr, z4.g gVar) {
            return Integer.valueOf(gVar.r(str, str2, objArr));
        }

        public static /* synthetic */ Long q(String str, int i10, ContentValues contentValues, z4.g gVar) {
            return Long.valueOf(gVar.r1(str, i10, contentValues));
        }

        public static /* synthetic */ Boolean v(z4.g gVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                return Boolean.valueOf(gVar.J1());
            }
            return Boolean.FALSE;
        }

        public static /* synthetic */ Object z(z4.g gVar) {
            return null;
        }

        @Override // z4.g
        public void B(final String str) throws SQLException {
            this.f56631w.c(new n.a() { // from class: v4.b
                @Override // n.a
                public final Object apply(Object obj) {
                    Object B;
                    B = ((z4.g) obj).B(str);
                    return B;
                }
            });
        }

        @Override // z4.g
        public boolean C1() {
            if (this.f56631w.d() == null) {
                return false;
            }
            return ((Boolean) this.f56631w.c(k.f56626a)).booleanValue();
        }

        public void E() {
            this.f56631w.c(h.f56616a);
        }

        @Override // z4.g
        public boolean J1() {
            return ((Boolean) this.f56631w.c(g.f56612a)).booleanValue();
        }

        @Override // z4.g
        public Cursor Q0(String str, Object[] objArr) {
            try {
                return new c(this.f56631w.e().Q0(str, objArr), this.f56631w);
            } catch (Throwable th2) {
                this.f56631w.b();
                throw th2;
            }
        }

        @Override // z4.g
        public void T() {
            z4.g d10 = this.f56631w.d();
            if (d10 != null) {
                d10.T();
                return;
            }
            throw new IllegalStateException("setTransactionSuccessful called but delegateDb is null");
        }

        @Override // z4.g
        public void V(final String str, final Object[] objArr) throws SQLException {
            this.f56631w.c(new n.a() { // from class: v4.f
                @Override // n.a
                public final Object apply(Object obj) {
                    Object V;
                    V = ((z4.g) obj).V(str, objArr);
                    return V;
                }
            });
        }

        @Override // z4.g
        public void W() {
            try {
                this.f56631w.e().W();
            } catch (Throwable th2) {
                this.f56631w.b();
                throw th2;
            }
        }

        @Override // z4.g
        public z4.k X0(String str) {
            return new b(str, this.f56631w);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f56631w.a();
        }

        @Override // z4.g
        public void e0() {
            if (this.f56631w.d() != null) {
                try {
                    this.f56631w.d().e0();
                    return;
                } finally {
                    this.f56631w.b();
                }
            }
            throw new IllegalStateException("End transaction called but delegateDb is null");
        }

        @Override // z4.g
        public String getPath() {
            return (String) this.f56631w.c(j.f56624a);
        }

        @Override // z4.g
        public int h1(final String str, final int i10, final ContentValues contentValues, final String str2, final Object[] objArr) {
            return ((Integer) this.f56631w.c(new n.a() { // from class: v4.d
                @Override // n.a
                public final Object apply(Object obj) {
                    Integer C;
                    C = l.a.C(str, i10, contentValues, str2, objArr, (z4.g) obj);
                    return C;
                }
            })).intValue();
        }

        @Override // z4.g
        public boolean isOpen() {
            z4.g d10 = this.f56631w.d();
            if (d10 == null) {
                return false;
            }
            return d10.isOpen();
        }

        @Override // z4.g
        public Cursor j0(z4.j jVar) {
            try {
                return new c(this.f56631w.e().j0(jVar), this.f56631w);
            } catch (Throwable th2) {
                this.f56631w.b();
                throw th2;
            }
        }

        @Override // z4.g
        public Cursor m0(z4.j jVar, CancellationSignal cancellationSignal) {
            try {
                return new c(this.f56631w.e().m0(jVar, cancellationSignal), this.f56631w);
            } catch (Throwable th2) {
                this.f56631w.b();
                throw th2;
            }
        }

        @Override // z4.g
        public Cursor p1(String str) {
            try {
                return new c(this.f56631w.e().p1(str), this.f56631w);
            } catch (Throwable th2) {
                this.f56631w.b();
                throw th2;
            }
        }

        @Override // z4.g
        public int r(final String str, final String str2, final Object[] objArr) {
            return ((Integer) this.f56631w.c(new n.a() { // from class: v4.e
                @Override // n.a
                public final Object apply(Object obj) {
                    Integer n10;
                    n10 = l.a.n(str, str2, objArr, (z4.g) obj);
                    return n10;
                }
            })).intValue();
        }

        @Override // z4.g
        public long r1(final String str, final int i10, final ContentValues contentValues) throws SQLException {
            return ((Long) this.f56631w.c(new n.a() { // from class: v4.c
                @Override // n.a
                public final Object apply(Object obj) {
                    Long q10;
                    q10 = l.a.q(str, i10, contentValues, (z4.g) obj);
                    return q10;
                }
            })).longValue();
        }

        @Override // z4.g
        public void s() {
            try {
                this.f56631w.e().s();
            } catch (Throwable th2) {
                this.f56631w.b();
                throw th2;
            }
        }

        @Override // z4.g
        public List<Pair<String, String>> y() {
            return (List) this.f56631w.c(i.f56620a);
        }
    }

    /* loaded from: classes.dex */
    public static class b implements z4.k {

        /* renamed from: w  reason: collision with root package name */
        public final String f56632w;

        /* renamed from: x  reason: collision with root package name */
        public final ArrayList<Object> f56633x = new ArrayList<>();

        /* renamed from: y  reason: collision with root package name */
        public final v4.a f56634y;

        public b(String str, v4.a aVar) {
            this.f56632w = str;
            this.f56634y = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object e(n.a aVar, z4.g gVar) {
            z4.k X0 = gVar.X0(this.f56632w);
            c(X0);
            return aVar.apply(X0);
        }

        @Override // z4.k
        public int D() {
            return ((Integer) d(n.f56644a)).intValue();
        }

        @Override // z4.i
        public void J(int i10, double d10) {
            h(i10, Double.valueOf(d10));
        }

        @Override // z4.k
        public long K0() {
            return ((Long) d(o.f56645a)).longValue();
        }

        @Override // z4.i
        public void S0(int i10, String str) {
            h(i10, str);
        }

        public final void c(z4.k kVar) {
            int i10 = 0;
            while (i10 < this.f56633x.size()) {
                int i11 = i10 + 1;
                Object obj = this.f56633x.get(i10);
                if (obj == null) {
                    kVar.y1(i11);
                } else if (obj instanceof Long) {
                    kVar.g1(i11, ((Long) obj).longValue());
                } else if (obj instanceof Double) {
                    kVar.J(i11, ((Double) obj).doubleValue());
                } else if (obj instanceof String) {
                    kVar.S0(i11, (String) obj);
                } else if (obj instanceof byte[]) {
                    kVar.l1(i11, (byte[]) obj);
                }
                i10 = i11;
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        public final <T> T d(final n.a<z4.k, T> aVar) {
            return (T) this.f56634y.c(new n.a() { // from class: v4.m
                @Override // n.a
                public final Object apply(Object obj) {
                    Object e10;
                    e10 = l.b.this.e(aVar, (z4.g) obj);
                    return e10;
                }
            });
        }

        @Override // z4.i
        public void g1(int i10, long j10) {
            h(i10, Long.valueOf(j10));
        }

        public final void h(int i10, Object obj) {
            int i11 = i10 - 1;
            if (i11 >= this.f56633x.size()) {
                for (int size = this.f56633x.size(); size <= i11; size++) {
                    this.f56633x.add(null);
                }
            }
            this.f56633x.set(i11, obj);
        }

        @Override // z4.i
        public void l1(int i10, byte[] bArr) {
            h(i10, bArr);
        }

        @Override // z4.i
        public void y1(int i10) {
            h(i10, null);
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements Cursor {

        /* renamed from: w  reason: collision with root package name */
        public final Cursor f56635w;

        /* renamed from: x  reason: collision with root package name */
        public final v4.a f56636x;

        public c(Cursor cursor, v4.a aVar) {
            this.f56635w = cursor;
            this.f56636x = aVar;
        }

        @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f56635w.close();
            this.f56636x.b();
        }

        @Override // android.database.Cursor
        public void copyStringToBuffer(int i10, CharArrayBuffer charArrayBuffer) {
            this.f56635w.copyStringToBuffer(i10, charArrayBuffer);
        }

        @Override // android.database.Cursor
        @Deprecated
        public void deactivate() {
            this.f56635w.deactivate();
        }

        @Override // android.database.Cursor
        public byte[] getBlob(int i10) {
            return this.f56635w.getBlob(i10);
        }

        @Override // android.database.Cursor
        public int getColumnCount() {
            return this.f56635w.getColumnCount();
        }

        @Override // android.database.Cursor
        public int getColumnIndex(String str) {
            return this.f56635w.getColumnIndex(str);
        }

        @Override // android.database.Cursor
        public int getColumnIndexOrThrow(String str) throws IllegalArgumentException {
            return this.f56635w.getColumnIndexOrThrow(str);
        }

        @Override // android.database.Cursor
        public String getColumnName(int i10) {
            return this.f56635w.getColumnName(i10);
        }

        @Override // android.database.Cursor
        public String[] getColumnNames() {
            return this.f56635w.getColumnNames();
        }

        @Override // android.database.Cursor
        public int getCount() {
            return this.f56635w.getCount();
        }

        @Override // android.database.Cursor
        public double getDouble(int i10) {
            return this.f56635w.getDouble(i10);
        }

        @Override // android.database.Cursor
        public Bundle getExtras() {
            return this.f56635w.getExtras();
        }

        @Override // android.database.Cursor
        public float getFloat(int i10) {
            return this.f56635w.getFloat(i10);
        }

        @Override // android.database.Cursor
        public int getInt(int i10) {
            return this.f56635w.getInt(i10);
        }

        @Override // android.database.Cursor
        public long getLong(int i10) {
            return this.f56635w.getLong(i10);
        }

        @Override // android.database.Cursor
        public Uri getNotificationUri() {
            return z4.c.a(this.f56635w);
        }

        @Override // android.database.Cursor
        public List<Uri> getNotificationUris() {
            return z4.f.a(this.f56635w);
        }

        @Override // android.database.Cursor
        public int getPosition() {
            return this.f56635w.getPosition();
        }

        @Override // android.database.Cursor
        public short getShort(int i10) {
            return this.f56635w.getShort(i10);
        }

        @Override // android.database.Cursor
        public String getString(int i10) {
            return this.f56635w.getString(i10);
        }

        @Override // android.database.Cursor
        public int getType(int i10) {
            return this.f56635w.getType(i10);
        }

        @Override // android.database.Cursor
        public boolean getWantsAllOnMoveCalls() {
            return this.f56635w.getWantsAllOnMoveCalls();
        }

        @Override // android.database.Cursor
        public boolean isAfterLast() {
            return this.f56635w.isAfterLast();
        }

        @Override // android.database.Cursor
        public boolean isBeforeFirst() {
            return this.f56635w.isBeforeFirst();
        }

        @Override // android.database.Cursor
        public boolean isClosed() {
            return this.f56635w.isClosed();
        }

        @Override // android.database.Cursor
        public boolean isFirst() {
            return this.f56635w.isFirst();
        }

        @Override // android.database.Cursor
        public boolean isLast() {
            return this.f56635w.isLast();
        }

        @Override // android.database.Cursor
        public boolean isNull(int i10) {
            return this.f56635w.isNull(i10);
        }

        @Override // android.database.Cursor
        public boolean move(int i10) {
            return this.f56635w.move(i10);
        }

        @Override // android.database.Cursor
        public boolean moveToFirst() {
            return this.f56635w.moveToFirst();
        }

        @Override // android.database.Cursor
        public boolean moveToLast() {
            return this.f56635w.moveToLast();
        }

        @Override // android.database.Cursor
        public boolean moveToNext() {
            return this.f56635w.moveToNext();
        }

        @Override // android.database.Cursor
        public boolean moveToPosition(int i10) {
            return this.f56635w.moveToPosition(i10);
        }

        @Override // android.database.Cursor
        public boolean moveToPrevious() {
            return this.f56635w.moveToPrevious();
        }

        @Override // android.database.Cursor
        public void registerContentObserver(ContentObserver contentObserver) {
            this.f56635w.registerContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            this.f56635w.registerDataSetObserver(dataSetObserver);
        }

        @Override // android.database.Cursor
        @Deprecated
        public boolean requery() {
            return this.f56635w.requery();
        }

        @Override // android.database.Cursor
        public Bundle respond(Bundle bundle) {
            return this.f56635w.respond(bundle);
        }

        @Override // android.database.Cursor
        public void setExtras(Bundle bundle) {
            z4.e.a(this.f56635w, bundle);
        }

        @Override // android.database.Cursor
        public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
            this.f56635w.setNotificationUri(contentResolver, uri);
        }

        @Override // android.database.Cursor
        public void setNotificationUris(ContentResolver contentResolver, List<Uri> list) {
            z4.f.b(this.f56635w, contentResolver, list);
        }

        @Override // android.database.Cursor
        public void unregisterContentObserver(ContentObserver contentObserver) {
            this.f56635w.unregisterContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            this.f56635w.unregisterDataSetObserver(dataSetObserver);
        }
    }

    public l(z4.h hVar, v4.a aVar) {
        this.f56628w = hVar;
        this.f56630y = aVar;
        aVar.f(hVar);
        this.f56629x = new a(aVar);
    }

    @Override // v4.r
    public z4.h a() {
        return this.f56628w;
    }

    public v4.a c() {
        return this.f56630y;
    }

    @Override // z4.h, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.f56629x.close();
        } catch (IOException e10) {
            x4.e.a(e10);
        }
    }

    @Override // z4.h
    public String getDatabaseName() {
        return this.f56628w.getDatabaseName();
    }

    @Override // z4.h
    public z4.g getReadableDatabase() {
        this.f56629x.E();
        return this.f56629x;
    }

    @Override // z4.h
    public z4.g getWritableDatabase() {
        this.f56629x.E();
        return this.f56629x;
    }

    @Override // z4.h
    public void setWriteAheadLoggingEnabled(boolean z10) {
        this.f56628w.setWriteAheadLoggingEnabled(z10);
    }
}
