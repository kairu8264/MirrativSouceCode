package com.dena.mirrorman.database;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import v4.q;
import v4.q0;
import v4.s0;
import x4.c;
import x4.g;
import z4.g;
import z4.h;
import zd.b;
import zd.e;
import zd.f;

/* loaded from: classes2.dex */
public final class MirrorDatabase_Impl extends MirrorDatabase {

    /* renamed from: p  reason: collision with root package name */
    public volatile b f25634p;

    /* renamed from: q  reason: collision with root package name */
    public volatile e f25635q;

    /* loaded from: classes2.dex */
    public class a extends s0.a {
        public a(int i10) {
            super(i10);
        }

        @Override // v4.s0.a
        public void a(g gVar) {
            gVar.B("CREATE TABLE IF NOT EXISTS `LiveInfoHistory` (`title` TEXT, `closedLive` INTEGER, `appId` TEXT, `id` INTEGER PRIMARY KEY AUTOINCREMENT, `tags` TEXT, `contentHash` INTEGER, `stickerEnabled` INTEGER, `shareAll` INTEGER, `shareUserIDs` TEXT)");
            gVar.B("CREATE TABLE IF NOT EXISTS `AnnouncementUrlHistory` (`url` TEXT, `id` INTEGER PRIMARY KEY AUTOINCREMENT)");
            gVar.B("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            gVar.B("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'aea333bd645fe24da7538e75f4416ebf')");
        }

        @Override // v4.s0.a
        public void b(g gVar) {
            gVar.B("DROP TABLE IF EXISTS `LiveInfoHistory`");
            gVar.B("DROP TABLE IF EXISTS `AnnouncementUrlHistory`");
            if (MirrorDatabase_Impl.this.f56677h != null) {
                int size = MirrorDatabase_Impl.this.f56677h.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((q0.b) MirrorDatabase_Impl.this.f56677h.get(i10)).b(gVar);
                }
            }
        }

        @Override // v4.s0.a
        public void c(g gVar) {
            if (MirrorDatabase_Impl.this.f56677h != null) {
                int size = MirrorDatabase_Impl.this.f56677h.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((q0.b) MirrorDatabase_Impl.this.f56677h.get(i10)).a(gVar);
                }
            }
        }

        @Override // v4.s0.a
        public void d(g gVar) {
            MirrorDatabase_Impl.this.f56670a = gVar;
            MirrorDatabase_Impl.this.t(gVar);
            if (MirrorDatabase_Impl.this.f56677h != null) {
                int size = MirrorDatabase_Impl.this.f56677h.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((q0.b) MirrorDatabase_Impl.this.f56677h.get(i10)).c(gVar);
                }
            }
        }

        @Override // v4.s0.a
        public void e(g gVar) {
        }

        @Override // v4.s0.a
        public void f(g gVar) {
            c.a(gVar);
        }

        @Override // v4.s0.a
        public s0.b g(g gVar) {
            HashMap hashMap = new HashMap(9);
            hashMap.put("title", new g.a("title", "TEXT", false, 0, null, 1));
            hashMap.put("closedLive", new g.a("closedLive", "INTEGER", false, 0, null, 1));
            hashMap.put("appId", new g.a("appId", "TEXT", false, 0, null, 1));
            hashMap.put(TtmlNode.ATTR_ID, new g.a(TtmlNode.ATTR_ID, "INTEGER", false, 1, null, 1));
            hashMap.put("tags", new g.a("tags", "TEXT", false, 0, null, 1));
            hashMap.put("contentHash", new g.a("contentHash", "INTEGER", false, 0, null, 1));
            hashMap.put("stickerEnabled", new g.a("stickerEnabled", "INTEGER", false, 0, null, 1));
            hashMap.put("shareAll", new g.a("shareAll", "INTEGER", false, 0, null, 1));
            hashMap.put("shareUserIDs", new g.a("shareUserIDs", "TEXT", false, 0, null, 1));
            x4.g gVar2 = new x4.g("LiveInfoHistory", hashMap, new HashSet(0), new HashSet(0));
            x4.g a10 = x4.g.a(gVar, "LiveInfoHistory");
            if (!gVar2.equals(a10)) {
                return new s0.b(false, "LiveInfoHistory(com.dena.mirrorman.database.LiveSettingHistory).\n Expected:\n" + gVar2 + "\n Found:\n" + a10);
            }
            HashMap hashMap2 = new HashMap(2);
            hashMap2.put("url", new g.a("url", "TEXT", false, 0, null, 1));
            hashMap2.put(TtmlNode.ATTR_ID, new g.a(TtmlNode.ATTR_ID, "INTEGER", false, 1, null, 1));
            x4.g gVar3 = new x4.g("AnnouncementUrlHistory", hashMap2, new HashSet(0), new HashSet(0));
            x4.g a11 = x4.g.a(gVar, "AnnouncementUrlHistory");
            if (!gVar3.equals(a11)) {
                return new s0.b(false, "AnnouncementUrlHistory(com.dena.mirrorman.database.AnnouncementUrlHistory).\n Expected:\n" + gVar3 + "\n Found:\n" + a11);
            }
            return new s0.b(true, null);
        }
    }

    @Override // com.dena.mirrorman.database.MirrorDatabase
    public b C() {
        b bVar;
        if (this.f25634p != null) {
            return this.f25634p;
        }
        synchronized (this) {
            if (this.f25634p == null) {
                this.f25634p = new zd.c(this);
            }
            bVar = this.f25634p;
        }
        return bVar;
    }

    @Override // com.dena.mirrorman.database.MirrorDatabase
    public e D() {
        e eVar;
        if (this.f25635q != null) {
            return this.f25635q;
        }
        synchronized (this) {
            if (this.f25635q == null) {
                this.f25635q = new f(this);
            }
            eVar = this.f25635q;
        }
        return eVar;
    }

    @Override // v4.q0
    public androidx.room.c g() {
        return new androidx.room.c(this, new HashMap(0), new HashMap(0), "LiveInfoHistory", "AnnouncementUrlHistory");
    }

    @Override // v4.q0
    public h h(q qVar) {
        return qVar.f56650a.a(h.b.a(qVar.f56651b).c(qVar.f56652c).b(new s0(qVar, new a(14), "aea333bd645fe24da7538e75f4416ebf", "e586e6a2d3da46773f364a9dc1ab0b37")).a());
    }

    @Override // v4.q0
    public List<w4.b> j(Map<Class<? extends w4.a>, w4.a> map) {
        return Arrays.asList(new w4.b[0]);
    }

    @Override // v4.q0
    public Set<Class<? extends w4.a>> n() {
        return new HashSet();
    }

    @Override // v4.q0
    public Map<Class<?>, List<Class<?>>> o() {
        HashMap hashMap = new HashMap();
        hashMap.put(b.class, zd.c.d());
        hashMap.put(e.class, f.b());
        return hashMap;
    }
}
