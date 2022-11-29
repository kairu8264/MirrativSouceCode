package r6;

import java.text.DecimalFormat;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p6.c1;
import p6.k;
import p6.z;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    public b f49792a;

    /* renamed from: b  reason: collision with root package name */
    public ScheduledFuture f49793b;

    /* renamed from: c  reason: collision with root package name */
    public String f49794c;

    /* renamed from: d  reason: collision with root package name */
    public Runnable f49795d;

    /* renamed from: e  reason: collision with root package name */
    public long f49796e;

    /* renamed from: f  reason: collision with root package name */
    public long f49797f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f49798g = true;

    /* renamed from: h  reason: collision with root package name */
    public z f49799h = k.h();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            i.this.f49799h.g("%s fired", i.this.f49794c);
            i.this.f49795d.run();
        }
    }

    public i(Runnable runnable, long j10, long j11, String str) {
        this.f49792a = new e(str, true);
        this.f49794c = str;
        this.f49795d = runnable;
        this.f49796e = j10;
        this.f49797f = j11;
        DecimalFormat decimalFormat = c1.f45890a;
        String format = decimalFormat.format(j11 / 1000.0d);
        this.f49799h.g("%s configured to fire after %s seconds of starting and cycles every %s seconds", str, decimalFormat.format(j10 / 1000.0d), format);
    }

    public void d() {
        if (!this.f49798g) {
            this.f49799h.g("%s is already started", this.f49794c);
            return;
        }
        this.f49799h.g("%s starting", this.f49794c);
        this.f49793b = this.f49792a.a(new a(), this.f49796e, this.f49797f);
        this.f49798g = false;
    }

    public void e() {
        if (this.f49798g) {
            this.f49799h.g("%s is already suspended", this.f49794c);
            return;
        }
        this.f49796e = this.f49793b.getDelay(TimeUnit.MILLISECONDS);
        this.f49793b.cancel(false);
        this.f49799h.g("%s suspended with %s seconds left", this.f49794c, c1.f45890a.format(this.f49796e / 1000.0d));
        this.f49798g = true;
    }
}
