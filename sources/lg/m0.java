package lg;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import cg.i;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import gg.a;
import gg.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import mg.a;

/* loaded from: classes3.dex */
public class m0 implements lg.d, mg.a, lg.c {
    public static final zf.b B = zf.b.b("proto");
    public final eg.a<String> A;

    /* renamed from: w  reason: collision with root package name */
    public final t0 f40173w;

    /* renamed from: x  reason: collision with root package name */
    public final ng.a f40174x;

    /* renamed from: y  reason: collision with root package name */
    public final ng.a f40175y;

    /* renamed from: z  reason: collision with root package name */
    public final e f40176z;

    /* loaded from: classes3.dex */
    public interface b<T, U> {
        U apply(T t10);
    }

    /* loaded from: classes3.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final String f40177a;

        /* renamed from: b  reason: collision with root package name */
        public final String f40178b;

        public c(String str, String str2) {
            this.f40177a = str;
            this.f40178b = str2;
        }
    }

    /* loaded from: classes3.dex */
    public interface d<T> {
        T a();
    }

    public m0(ng.a aVar, ng.a aVar2, e eVar, t0 t0Var, eg.a<String> aVar3) {
        this.f40173w = t0Var;
        this.f40174x = aVar;
        this.f40175y = aVar2;
        this.f40176z = eVar;
        this.A = aVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object B1(List list, cg.o oVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j10 = cursor.getLong(0);
            boolean z10 = cursor.getInt(7) != 0;
            i.a k10 = cg.i.a().j(cursor.getString(1)).i(cursor.getLong(2)).k(cursor.getLong(3));
            if (z10) {
                k10.h(new cg.h(X1(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                k10.h(new cg.h(X1(cursor.getString(4)), V1(j10)));
            }
            if (!cursor.isNull(6)) {
                k10.g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(k.a(j10, oVar, k10.d()));
        }
        return null;
    }

    public static /* synthetic */ Object D1(Map map, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j10 = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j10));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j10), set);
            }
            set.add(new c(cursor.getString(1), cursor.getString(2)));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Long E1(cg.i iVar, cg.o oVar, SQLiteDatabase sQLiteDatabase) {
        if (D0()) {
            d(1L, c.b.CACHE_FULL, iVar.j());
            return -1L;
        }
        long k02 = k0(sQLiteDatabase, oVar);
        int e10 = this.f40176z.e();
        byte[] a10 = iVar.e().a();
        boolean z10 = a10.length <= e10;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(k02));
        contentValues.put("transport_name", iVar.j());
        contentValues.put("timestamp_ms", Long.valueOf(iVar.f()));
        contentValues.put("uptime_ms", Long.valueOf(iVar.k()));
        contentValues.put("payload_encoding", iVar.e().b().a());
        contentValues.put("code", iVar.d());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z10));
        contentValues.put("payload", z10 ? a10 : new byte[0]);
        long insert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z10) {
            int ceil = (int) Math.ceil(a10.length / e10);
            for (int i10 = 1; i10 <= ceil; i10++) {
                byte[] copyOfRange = Arrays.copyOfRange(a10, (i10 - 1) * e10, Math.min(i10 * e10, a10.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(insert));
                contentValues2.put("sequence_num", Integer.valueOf(i10));
                contentValues2.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry<String, String> entry : iVar.i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(insert));
            contentValues3.put("name", entry.getKey());
            contentValues3.put("value", entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(insert);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object F0(Cursor cursor) {
        while (cursor.moveToNext()) {
            int i10 = cursor.getInt(0);
            d(i10, c.b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    public static /* synthetic */ byte[] G1(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i10 += blob.length;
        }
        byte[] bArr = new byte[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            byte[] bArr2 = (byte[]) arrayList.get(i12);
            System.arraycopy(bArr2, 0, bArr, i11, bArr2.length);
            i11 += bArr2.length;
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object H1(Cursor cursor) {
        while (cursor.moveToNext()) {
            int i10 = cursor.getInt(0);
            d(i10, c.b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object I1(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        Z1(sQLiteDatabase.rawQuery(str2, null), new b() { // from class: lg.i0
            @Override // lg.m0.b
            public final Object apply(Object obj) {
                Object H1;
                H1 = m0.this.H1((Cursor) obj);
                return H1;
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    public static /* synthetic */ Boolean K1(Cursor cursor) {
        return Boolean.valueOf(cursor.getCount() > 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer L0(long j10, SQLiteDatabase sQLiteDatabase) {
        String[] strArr = {String.valueOf(j10)};
        Z1(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new b() { // from class: lg.h0
            @Override // lg.m0.b
            public final Object apply(Object obj) {
                Object F0;
                F0 = m0.this.F0((Cursor) obj);
                return F0;
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    public static /* synthetic */ Object L1(String str, c.b bVar, long j10, SQLiteDatabase sQLiteDatabase) {
        if (!((Boolean) Z1(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.getNumber())}), x.f40216a)).booleanValue()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(bVar.getNumber()));
            contentValues.put("events_dropped_count", Long.valueOf(j10));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        } else {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j10 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.getNumber())});
        }
        return null;
    }

    public static /* synthetic */ Object N0(Throwable th2) {
        throw new SynchronizationException("Timed out while trying to acquire the lock.", th2);
    }

    public static /* synthetic */ Object N1(long j10, cg.o oVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j10));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{oVar.b(), String.valueOf(og.a.a(oVar.d()))}) < 1) {
            contentValues.put("backend_name", oVar.b());
            contentValues.put("priority", Integer.valueOf(og.a.a(oVar.d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object Q1(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.f40174x.a()).execute();
        return null;
    }

    public static /* synthetic */ SQLiteDatabase T0(Throwable th2) {
        throw new SynchronizationException("Timed out while trying to open db.", th2);
    }

    public static byte[] T1(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    public static /* synthetic */ Long V0(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    public static /* synthetic */ gg.f W0(long j10, Cursor cursor) {
        cursor.moveToNext();
        return gg.f.c().c(cursor.getLong(0)).b(j10).a();
    }

    public static zf.b X1(String str) {
        if (str == null) {
            return B;
        }
        return zf.b.b(str);
    }

    public static /* synthetic */ gg.f Y0(final long j10, SQLiteDatabase sQLiteDatabase) {
        return (gg.f) Z1(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new b() { // from class: lg.l
            @Override // lg.m0.b
            public final Object apply(Object obj) {
                gg.f W0;
                W0 = m0.W0(j10, (Cursor) obj);
                return W0;
            }
        });
    }

    public static String Y1(Iterable<k> iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator<k> it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().c());
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    public static <T> T Z1(Cursor cursor, b<Cursor, T> bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static /* synthetic */ Long i1(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean j1(cg.o oVar, SQLiteDatabase sQLiteDatabase) {
        Long A0 = A0(sQLiteDatabase, oVar);
        if (A0 == null) {
            return Boolean.FALSE;
        }
        return (Boolean) Z1(p0().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{A0.toString()}), y.f40217a);
    }

    public static /* synthetic */ List k1(SQLiteDatabase sQLiteDatabase) {
        return (List) Z1(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), t.f40205a);
    }

    public static /* synthetic */ List m1(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(cg.o.a().b(cursor.getString(1)).d(og.a.b(cursor.getInt(2))).c(T1(cursor.getString(3))).a());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List o1(cg.o oVar, SQLiteDatabase sQLiteDatabase) {
        List<k> R1 = R1(sQLiteDatabase, oVar);
        return E0(R1, S1(sQLiteDatabase, R1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ gg.a u1(Map map, a.C0405a c0405a, Cursor cursor) {
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            c.b h02 = h0(cursor.getInt(1));
            long j10 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(gg.c.c().c(h02).b(j10).a());
        }
        U1(c0405a, map);
        c0405a.e(x0());
        c0405a.d(q0());
        c0405a.c(this.A.get());
        return c0405a.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ gg.a z1(String str, final Map map, final a.C0405a c0405a, SQLiteDatabase sQLiteDatabase) {
        return (gg.a) Z1(sQLiteDatabase.rawQuery(str, new String[0]), new b() { // from class: lg.r
            @Override // lg.m0.b
            public final Object apply(Object obj) {
                gg.a u12;
                u12 = m0.this.u1(map, c0405a, (Cursor) obj);
                return u12;
            }
        });
    }

    public final Long A0(SQLiteDatabase sQLiteDatabase, cg.o oVar) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(oVar.b(), String.valueOf(og.a.a(oVar.d()))));
        if (oVar.c() != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(oVar.c(), 0));
        } else {
            sb2.append(" and extras is null");
        }
        return (Long) Z1(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), v.f40214a);
    }

    public <T> T B0(b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase p02 = p0();
        p02.beginTransaction();
        try {
            T apply = bVar.apply(p02);
            p02.setTransactionSuccessful();
            return apply;
        } finally {
            p02.endTransaction();
        }
    }

    public final boolean D0() {
        return r0() * w0() >= this.f40176z.f();
    }

    public final List<k> E0(List<k> list, Map<Long, Set<c>> map) {
        ListIterator<k> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            k next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.c()))) {
                i.a l10 = next.b().l();
                for (c cVar : map.get(Long.valueOf(next.c()))) {
                    l10.c(cVar.f40177a, cVar.f40178b);
                }
                listIterator.set(k.a(next.c(), next.d(), l10.d()));
            }
        }
        return list;
    }

    @Override // lg.d
    public k F1(final cg.o oVar, final cg.i iVar) {
        hg.a.b("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", oVar.d(), iVar.j(), oVar.b());
        long longValue = ((Long) B0(new b() { // from class: lg.l0
            @Override // lg.m0.b
            public final Object apply(Object obj) {
                Long E1;
                E1 = m0.this.E1(iVar, oVar, (SQLiteDatabase) obj);
                return E1;
            }
        })).longValue();
        if (longValue < 1) {
            return null;
        }
        return k.a(longValue, oVar, iVar);
    }

    @Override // lg.d
    public void G0(Iterable<k> iterable) {
        if (iterable.iterator().hasNext()) {
            final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + Y1(iterable);
            B0(new b() { // from class: lg.o
                @Override // lg.m0.b
                public final Object apply(Object obj) {
                    Object I1;
                    I1 = m0.this.I1(str, r3, (SQLiteDatabase) obj);
                    return I1;
                }
            });
        }
    }

    @Override // lg.d
    public Iterable<cg.o> M() {
        return (Iterable) B0(z.f40218a);
    }

    @Override // lg.d
    public long Q(cg.o oVar) {
        return ((Long) Z1(p0().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{oVar.b(), String.valueOf(og.a.a(oVar.d()))}), u.f40210a)).longValue();
    }

    public final List<k> R1(SQLiteDatabase sQLiteDatabase, final cg.o oVar) {
        final ArrayList arrayList = new ArrayList();
        Long A0 = A0(sQLiteDatabase, oVar);
        if (A0 == null) {
            return arrayList;
        }
        Z1(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{A0.toString()}, null, null, null, String.valueOf(this.f40176z.d())), new b() { // from class: lg.q
            @Override // lg.m0.b
            public final Object apply(Object obj) {
                Object B1;
                B1 = m0.this.B1(arrayList, oVar, (Cursor) obj);
                return B1;
            }
        });
        return arrayList;
    }

    public final Map<Long, Set<c>> S1(SQLiteDatabase sQLiteDatabase, List<k> list) {
        final HashMap hashMap = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < list.size(); i10++) {
            sb2.append(list.get(i10).c());
            if (i10 < list.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        Z1(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), null, null, null, null), new b() { // from class: lg.g0
            @Override // lg.m0.b
            public final Object apply(Object obj) {
                Object D1;
                D1 = m0.D1(hashMap, (Cursor) obj);
                return D1;
            }
        });
        return hashMap;
    }

    public final void U1(a.C0405a c0405a, Map<String, List<gg.c>> map) {
        for (Map.Entry<String, List<gg.c>> entry : map.entrySet()) {
            c0405a.a(gg.d.c().c(entry.getKey()).b(entry.getValue()).a());
        }
    }

    public final byte[] V1(long j10) {
        return (byte[]) Z1(p0().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j10)}, null, null, "sequence_num"), s.f40203a);
    }

    public final <T> T W1(d<T> dVar, b<Throwable, T> bVar) {
        long a10 = this.f40175y.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e10) {
                if (this.f40175y.a() >= this.f40176z.b() + a10) {
                    return bVar.apply(e10);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // lg.c
    public void a() {
        B0(new b() { // from class: lg.j0
            @Override // lg.m0.b
            public final Object apply(Object obj) {
                Object Q1;
                Q1 = m0.this.Q1((SQLiteDatabase) obj);
                return Q1;
            }
        });
    }

    @Override // lg.c
    public gg.a c() {
        final a.C0405a e10 = gg.a.e();
        final HashMap hashMap = new HashMap();
        return (gg.a) B0(new b() { // from class: lg.p
            @Override // lg.m0.b
            public final Object apply(Object obj) {
                gg.a z12;
                z12 = m0.this.z1(r2, hashMap, e10, (SQLiteDatabase) obj);
                return z12;
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f40173w.close();
    }

    @Override // lg.c
    public void d(final long j10, final c.b bVar, final String str) {
        B0(new b() { // from class: lg.f0
            @Override // lg.m0.b
            public final Object apply(Object obj) {
                Object L1;
                L1 = m0.L1(str, bVar, j10, (SQLiteDatabase) obj);
                return L1;
            }
        });
    }

    @Override // mg.a
    public <T> T e(a.InterfaceC0605a<T> interfaceC0605a) {
        SQLiteDatabase p02 = p0();
        i0(p02);
        try {
            T d10 = interfaceC0605a.d();
            p02.setTransactionSuccessful();
            return d10;
        } finally {
            p02.endTransaction();
        }
    }

    @Override // lg.d
    public void e1(final cg.o oVar, final long j10) {
        B0(new b() { // from class: lg.e0
            @Override // lg.m0.b
            public final Object apply(Object obj) {
                Object N1;
                N1 = m0.N1(j10, oVar, (SQLiteDatabase) obj);
                return N1;
            }
        });
    }

    public final c.b h0(int i10) {
        c.b bVar = c.b.REASON_UNKNOWN;
        if (i10 == bVar.getNumber()) {
            return bVar;
        }
        c.b bVar2 = c.b.MESSAGE_TOO_OLD;
        if (i10 == bVar2.getNumber()) {
            return bVar2;
        }
        c.b bVar3 = c.b.CACHE_FULL;
        if (i10 == bVar3.getNumber()) {
            return bVar3;
        }
        c.b bVar4 = c.b.PAYLOAD_TOO_BIG;
        if (i10 == bVar4.getNumber()) {
            return bVar4;
        }
        c.b bVar5 = c.b.MAX_RETRIES_REACHED;
        if (i10 == bVar5.getNumber()) {
            return bVar5;
        }
        c.b bVar6 = c.b.INVALID_PAYLOD;
        if (i10 == bVar6.getNumber()) {
            return bVar6;
        }
        c.b bVar7 = c.b.SERVER_ERROR;
        if (i10 == bVar7.getNumber()) {
            return bVar7;
        }
        hg.a.a("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i10));
        return bVar;
    }

    public final void i0(final SQLiteDatabase sQLiteDatabase) {
        W1(new d() { // from class: lg.c0
            @Override // lg.m0.d
            public final Object a() {
                Object beginTransaction;
                beginTransaction = sQLiteDatabase.beginTransaction();
                return beginTransaction;
            }
        }, b0.f40148a);
    }

    public final long k0(SQLiteDatabase sQLiteDatabase, cg.o oVar) {
        Long A0 = A0(sQLiteDatabase, oVar);
        if (A0 != null) {
            return A0.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", oVar.b());
        contentValues.put("priority", Integer.valueOf(og.a.a(oVar.d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (oVar.c() != null) {
            contentValues.put("extras", Base64.encodeToString(oVar.c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    public long l0() {
        return r0() * w0();
    }

    public SQLiteDatabase p0() {
        final t0 t0Var = this.f40173w;
        Objects.requireNonNull(t0Var);
        return (SQLiteDatabase) W1(new d() { // from class: lg.d0
            @Override // lg.m0.d
            public final Object a() {
                return t0.this.getWritableDatabase();
            }
        }, a0.f40144a);
    }

    public final gg.b q0() {
        return gg.b.b().b(gg.e.c().b(l0()).c(e.f40151a.f()).a()).a();
    }

    public final long r0() {
        return p0().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    @Override // lg.d
    public int t() {
        final long a10 = this.f40174x.a() - this.f40176z.c();
        return ((Integer) B0(new b() { // from class: lg.k0
            @Override // lg.m0.b
            public final Object apply(Object obj) {
                Integer L0;
                L0 = m0.this.L0(a10, (SQLiteDatabase) obj);
                return L0;
            }
        })).intValue();
    }

    @Override // lg.d
    public Iterable<k> v1(final cg.o oVar) {
        return (Iterable) B0(new b() { // from class: lg.m
            @Override // lg.m0.b
            public final Object apply(Object obj) {
                List o12;
                o12 = m0.this.o1(oVar, (SQLiteDatabase) obj);
                return o12;
            }
        });
    }

    @Override // lg.d
    public void w(Iterable<k> iterable) {
        if (iterable.iterator().hasNext()) {
            p0().compileStatement("DELETE FROM events WHERE _id in " + Y1(iterable)).execute();
        }
    }

    public final long w0() {
        return p0().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    @Override // lg.d
    public boolean x(final cg.o oVar) {
        return ((Boolean) B0(new b() { // from class: lg.n
            @Override // lg.m0.b
            public final Object apply(Object obj) {
                Boolean j12;
                j12 = m0.this.j1(oVar, (SQLiteDatabase) obj);
                return j12;
            }
        })).booleanValue();
    }

    public final gg.f x0() {
        final long a10 = this.f40174x.a();
        return (gg.f) B0(new b() { // from class: lg.w
            @Override // lg.m0.b
            public final Object apply(Object obj) {
                gg.f Y0;
                Y0 = m0.Y0(a10, (SQLiteDatabase) obj);
                return Y0;
            }
        });
    }
}
