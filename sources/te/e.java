package te;

import jo.h;
import so.n;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: b  reason: collision with root package name */
    public static final a f53611b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f53612c = 8;

    /* renamed from: a  reason: collision with root package name */
    public String f53613a;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    public e(String str) {
        this.f53613a = str;
    }

    public final String a() {
        return this.f53613a;
    }

    public final synchronized boolean b() {
        return n.q(this.f53613a, "failed", true);
    }

    public final synchronized boolean c() {
        return n.q(this.f53613a, "live_end", true);
    }

    public final synchronized boolean d() {
        return n.q(this.f53613a, "loaded", true);
    }

    public final synchronized boolean e() {
        return n.q(this.f53613a, "loading", true);
    }

    public final synchronized boolean f() {
        return n.q(this.f53613a, "stopped", true);
    }

    public final synchronized void g(String str) {
        this.f53613a = str;
    }
}
