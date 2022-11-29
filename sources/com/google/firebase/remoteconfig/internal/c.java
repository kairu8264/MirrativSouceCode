package com.google.firebase.remoteconfig.internal;

import android.content.SharedPreferences;
import java.util.Date;
import vm.f;
import vm.g;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: d  reason: collision with root package name */
    public static final Date f28055d = new Date(-1);

    /* renamed from: e  reason: collision with root package name */
    public static final Date f28056e = new Date(-1);

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f28057a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f28058b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final Object f28059c = new Object();

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f28060a;

        /* renamed from: b  reason: collision with root package name */
        public Date f28061b;

        public a(int i10, Date date) {
            this.f28060a = i10;
            this.f28061b = date;
        }

        public Date a() {
            return this.f28061b;
        }

        public int b() {
            return this.f28060a;
        }
    }

    public c(SharedPreferences sharedPreferences) {
        this.f28057a = sharedPreferences;
    }

    public a a() {
        a aVar;
        synchronized (this.f28059c) {
            aVar = new a(this.f28057a.getInt("num_failed_fetches", 0), new Date(this.f28057a.getLong("backoff_end_time_in_millis", -1L)));
        }
        return aVar;
    }

    public long b() {
        return this.f28057a.getLong("fetch_timeout_in_seconds", 60L);
    }

    public f c() {
        d a10;
        synchronized (this.f28058b) {
            long j10 = this.f28057a.getLong("last_fetch_time_in_millis", -1L);
            int i10 = this.f28057a.getInt("last_fetch_status", 0);
            a10 = d.b().c(i10).d(j10).b(new g.b().d(this.f28057a.getLong("fetch_timeout_in_seconds", 60L)).e(this.f28057a.getLong("minimum_fetch_interval_in_seconds", b.f28040j)).c()).a();
        }
        return a10;
    }

    public String d() {
        return this.f28057a.getString("last_fetch_etag", null);
    }

    public Date e() {
        return new Date(this.f28057a.getLong("last_fetch_time_in_millis", -1L));
    }

    public long f() {
        return this.f28057a.getLong("minimum_fetch_interval_in_seconds", b.f28040j);
    }

    public void g() {
        h(0, f28056e);
    }

    public void h(int i10, Date date) {
        synchronized (this.f28059c) {
            this.f28057a.edit().putInt("num_failed_fetches", i10).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public void i(String str) {
        synchronized (this.f28058b) {
            this.f28057a.edit().putString("last_fetch_etag", str).apply();
        }
    }

    public void j() {
        synchronized (this.f28058b) {
            this.f28057a.edit().putInt("last_fetch_status", 1).apply();
        }
    }

    public void k(Date date) {
        synchronized (this.f28058b) {
            this.f28057a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
        }
    }

    public void l() {
        synchronized (this.f28058b) {
            this.f28057a.edit().putInt("last_fetch_status", 2).apply();
        }
    }
}
