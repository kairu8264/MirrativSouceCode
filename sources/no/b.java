package no;

import java.util.Random;
import jo.p;

/* loaded from: classes4.dex */
public final class b extends no.a {

    /* renamed from: y  reason: collision with root package name */
    public final a f43726y = new a();

    /* loaded from: classes4.dex */
    public static final class a extends ThreadLocal<Random> {
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // no.a
    public Random d() {
        Random random = this.f43726y.get();
        p.g(random, "implStorage.get()");
        return random;
    }
}
